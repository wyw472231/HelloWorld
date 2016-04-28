package com.javapatterns.adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Enuterator implements Iterator
{
	Enumeration em;

    public Enuterator(Enumeration em)
    {
		this.em = em;
    }

    public boolean hasNext()
    {
		return em.hasMoreElements();
    }

    public Object next() throws NoSuchElementException
    {
        return em.nextElement();
    }
    public void remove()
    {
		throw new UnsupportedOperationException();
    }
}
