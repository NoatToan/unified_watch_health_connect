package cn.hutool.core.lang.mutable;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class MutableBool implements Comparable<MutableBool>, Serializable {
    private static final long serialVersionUID = 1;
    private boolean value;

    public MutableBool() {
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableBool) && this.value == ((MutableBool) obj).value;
    }

    public int hashCode() {
        return (this.value ? Boolean.TRUE : Boolean.FALSE).hashCode();
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public MutableBool(boolean z) {
        this.value = z;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableBool mutableBool) {
        return Boolean.compare(this.value, mutableBool.value);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public Boolean m67get() {
        return Boolean.valueOf(this.value);
    }

    public void set(boolean z) {
        this.value = z;
    }

    public void set(Boolean bool) {
        this.value = bool.booleanValue();
    }

    public MutableBool(String str) throws NumberFormatException {
        this.value = Boolean.parseBoolean(str);
    }
}
