package org.ethelred.pairwise_sort;

import java.util.List;
import java.util.Objects;

/**
 * TODO
 *
 * @author eharman
 * @since 2020-01-29
 */
public class ItemPair
{
    private boolean valid = false;

    public Item getFirst()
    {
        return first;
    }

    public Item getSecond()
    {
        return second;
    }

    private Item first;
    private Item second;

    public ItemPair(List<Item> items)
    {
        if (items.size() == 2)
        {
            first = items.get(0);
            second = items.get(1);
            if (!Objects.equals(first, second))
            {
                valid = true;
            }
        }
    }

    public boolean isValid()
    {
        return valid;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ItemPair itemPair = (ItemPair) o;
        return (first.equals(itemPair.first) &&
                second.equals(itemPair.second)) || (first.equals(itemPair.second) &&
                second.equals(itemPair.first));
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(first, second);
    }
}
