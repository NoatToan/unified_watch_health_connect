package com.fasterxml.jackson.core.sym;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Name {
    public final int _hashCode;
    public final String _name;

    public Name(String str, int i) {
        this._name = str;
        this._hashCode = i;
    }

    public abstract boolean equals(int i);

    public abstract boolean equals(int i, int i2);

    public abstract boolean equals(int i, int i2, int i3);

    public boolean equals(Object obj) {
        return obj == this;
    }

    public abstract boolean equals(int[] iArr, int i);

    public String getName() {
        return this._name;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public String toString() {
        return this._name;
    }
}
