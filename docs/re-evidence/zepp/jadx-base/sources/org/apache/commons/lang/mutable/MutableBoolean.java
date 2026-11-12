package org.apache.commons.lang.mutable;

import java.io.Serializable;
import org.apache.commons.lang.BooleanUtils;

/* JADX INFO: loaded from: classes23.dex */
public class MutableBoolean implements Mutable, Serializable, Comparable {
    private static final long serialVersionUID = -4830728138360036487L;
    private boolean a;

    public MutableBoolean() {
    }

    public boolean booleanValue() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        boolean z = ((MutableBoolean) obj).a;
        boolean z2 = this.a;
        if (z2 == z) {
            return 0;
        }
        return z2 ? 1 : -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableBoolean) && this.a == ((MutableBoolean) obj).booleanValue();
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public Object getValue() {
        return BooleanUtils.toBooleanObject(this.a);
    }

    public int hashCode() {
        return (this.a ? Boolean.TRUE : Boolean.FALSE).hashCode();
    }

    public boolean isFalse() {
        return !this.a;
    }

    public boolean isTrue() {
        return this.a;
    }

    public void setValue(boolean z) {
        this.a = z;
    }

    public Boolean toBoolean() {
        return BooleanUtils.toBooleanObject(this.a);
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    public MutableBoolean(boolean z) {
        this.a = z;
    }

    @Override // org.apache.commons.lang.mutable.Mutable
    public void setValue(Object obj) {
        setValue(((Boolean) obj).booleanValue());
    }

    public MutableBoolean(Boolean bool) {
        this.a = bool.booleanValue();
    }
}
