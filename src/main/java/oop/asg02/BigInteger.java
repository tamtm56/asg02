package oop.asg02;

public class BigInteger
{
	private long value;
    public BigInteger(int init) 
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
		return new BigInteger(result); 
    }

    public BigInteger subtract(BigInteger other) 
	{
		long result;
		result = this.value - other.value;
		return new BigInteger(result); 
    }
}
