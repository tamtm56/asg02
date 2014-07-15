package oop.asg02;

public class BigInteger // Gioi han do dai cua kieu long
{
	private long value;
    public BigInteger(long init) 
	{
        value = init;
    }

    public BigInteger(String init) 
	{
        value = Long.decode(init);
    }

    public String toString() 
	{
        return Long.toString(value);
    }

    public boolean equals(Object other) 
	{
        return toString().equals(other.toString());
    }

    public long toLong() 
	{
        return value;  
    }

    public BigInteger add(BigInteger other) 
	{
		long result;
		result = this.value + other.value;
		BigInteger sum = new BigInteger(result);
		return sum;
    }

    public BigInteger subtract(BigInteger other) 
	{
		long result;
		result = this.value - other.value;
		return new BigInteger(result); 
    }
	
	public int compareTo(BigInteger other)
	{
		if (this.toLong() > other.toLong()) return 1;
		else
		{
			if (this.toLong() < other.toLong()) return -1;
			else return 0;
		}
	}
	
	public BigInteger clone()
	{
		return new BigInteger(this.toString());
	}
}
