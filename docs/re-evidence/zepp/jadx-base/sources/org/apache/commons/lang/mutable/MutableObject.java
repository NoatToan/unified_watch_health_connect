package org.apache.commons.lang.mutable;

import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class MutableObject implements Mutable, Serializable {
    private static final long serialVersionUID = 86241875189L;
    private Object a;

    public MutableObject() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutableObject)) {
            return false;
        }
        Object obj2 = ((MutableObject) obj).a;
        Object obj3 = this.a;
        return obj3 == obj2 || (obj3 != null && obj3.equals(obj2));
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return this.a;
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        this.a = obj;
    }

    public String toString() {
        Object obj = this.a;
        return obj == null ? "null" : obj.toString();
    }

    public MutableObject(Object obj) {
        this.a = obj;
    }
}
