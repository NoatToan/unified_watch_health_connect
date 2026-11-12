package org.apache.commons.lang3.mutable;

import com.google.maps.android.BuildConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MutableObject<T> implements Mutable<T>, Serializable {
    private static final long serialVersionUID = 86241875189L;
    private T value;

    public MutableObject(T t7) {
        this.value = t7;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return this.value.equals(((MutableObject) obj).value);
        }
        return false;
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue */
    public T getValue2() {
        return this.value;
    }

    public int hashCode() {
        T t7 = this.value;
        if (t7 == null) {
            return 0;
        }
        return t7.hashCode();
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public void setValue(T t7) {
        this.value = t7;
    }

    public String toString() {
        T t7 = this.value;
        return t7 == null ? BuildConfig.TRAVIS : t7.toString();
    }

    public MutableObject() {
    }
}
