package defpackage;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tm9 {
    @Deprecated
    public abstract jh2 findFilter(Object obj);

    public odi findPropertyFilter(Object obj, Object obj2) {
        jh2 jh2VarFindFilter = findFilter(obj);
        if (jh2VarFindFilter == null) {
            return null;
        }
        return SimpleBeanPropertyFilter.from(jh2VarFindFilter);
    }
}
