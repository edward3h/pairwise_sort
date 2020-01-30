package org.ethelred.pairwise_sort;

import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * TODO
 *
 * @author eharman
 * @since 2020-01-29
 */
public class Item
{
    private final String value;
    private int upvotes = 0;
    private int downvotes = 0;

    public Item(String value)
    {
        this.value = value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Item item = (Item) o;
        return value.equals(item.value);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(value);
    }

    @Override
    public String toString()
    {
        return value;
    }

    public void up()
    {
        upvotes++;
    }

    public void down()
    {
        downvotes++;
    }

    public double avg()
    {
        if (upvotes == 0)
        {
            return 0;
        }

        return ((double) upvotes) / (upvotes + downvotes);
    }
}
