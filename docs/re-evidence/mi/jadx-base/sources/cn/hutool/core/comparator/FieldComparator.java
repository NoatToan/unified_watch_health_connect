package cn.hutool.core.comparator;

import defpackage.bbk;
import defpackage.g4h;
import defpackage.i04;
import defpackage.t94;
import defpackage.tt3;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class FieldComparator<T> implements Comparator<T>, Serializable {
    private static final long serialVersionUID = 9157326766723846313L;
    private final Field field;

    public FieldComparator(Class<T> cls, String str) {
        Field fieldI = i04.i(cls, str);
        this.field = fieldI;
        if (fieldI == null) {
            throw new IllegalArgumentException(tt3.y("Field [{}] not found in Class [{}]", str, cls.getName()));
        }
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        try {
            return compare(t, t2, (Comparable) bbk.h(t, this.field), (Comparable) bbk.h(t2, this.field));
        } catch (Exception e) {
            throw new ComparatorException(e);
        }
    }

    private int compare(T t, T t2, Comparable comparable, Comparable comparable2) {
        int iC = g4h.c(comparable, comparable2);
        return iC == 0 ? t94.c(t, t2, true) : iC;
    }
}
