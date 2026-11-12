package org.apache.commons.lang3.builder;

import i3.e5;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class DiffResult<T> implements Iterable<Diff<?>> {
    private static final String DIFFERS_STRING = "differs from";
    public static final String OBJECTS_SAME_STRING = "";
    private final List<Diff<?>> diffList;
    private final T lhs;
    private final T rhs;
    private final ToStringStyle style;

    public DiffResult(T t7, T t14, List<Diff<?>> list, ToStringStyle toStringStyle) {
        Validate.notNull(t7, "lhs", new Object[0]);
        Validate.notNull(t14, "rhs", new Object[0]);
        Validate.notNull(list, "diffList", new Object[0]);
        this.diffList = list;
        this.lhs = t7;
        this.rhs = t14;
        if (toStringStyle == null) {
            this.style = ToStringStyle.DEFAULT_STYLE;
        } else {
            this.style = toStringStyle;
        }
    }

    public List<Diff<?>> getDiffs() {
        return Collections.unmodifiableList(this.diffList);
    }

    public T getLeft() {
        return this.lhs;
    }

    public int getNumberOfDiffs() {
        return this.diffList.size();
    }

    public T getRight() {
        return this.rhs;
    }

    public ToStringStyle getToStringStyle() {
        return this.style;
    }

    @Override // java.lang.Iterable
    public Iterator<Diff<?>> iterator() {
        return this.diffList.iterator();
    }

    public String toString(ToStringStyle toStringStyle) {
        if (this.diffList.isEmpty()) {
            return "";
        }
        ToStringBuilder toStringBuilder = new ToStringBuilder(this.lhs, toStringStyle);
        ToStringBuilder toStringBuilder2 = new ToStringBuilder(this.rhs, toStringStyle);
        for (Diff<?> diff : this.diffList) {
            toStringBuilder.append(diff.getFieldName(), diff.getLeft());
            toStringBuilder2.append(diff.getFieldName(), diff.getRight());
        }
        return e5.g(toStringBuilder.build(), " differs from ", toStringBuilder2.build());
    }

    public String toString() {
        return toString(this.style);
    }
}
