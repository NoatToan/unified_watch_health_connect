package cn.hutool.core.lang.mutable;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class MutableObj<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private T value;

    public MutableObj() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return this.value.equals(((MutableObj) obj).value);
        }
        return false;
    }

    public T get() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public void set(T t) {
        this.value = t;
    }

    public String toString() {
        T t = this.value;
        return t == null ? AbstractJsonLexerKt.NULL : t.toString();
    }

    public MutableObj(T t) {
        this.value = t;
    }
}
