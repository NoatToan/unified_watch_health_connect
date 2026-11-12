package org.apache.commons.lang3.concurrent;

import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class ConstantInitializer<T> implements ConcurrentInitializer<T> {
    private static final String b = "ConstantInitializer@%d [ object = %s ]";
    private final T a;

    public ConstantInitializer(T t) {
        this.a = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConstantInitializer) {
            return Objects.equals(getObject(), ((ConstantInitializer) obj).getObject());
        }
        return false;
    }

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        return getObject();
    }

    public final T getObject() {
        return this.a;
    }

    public int hashCode() {
        if (getObject() != null) {
            return getObject().hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.format(b, Integer.valueOf(System.identityHashCode(this)), String.valueOf(getObject()));
    }
}
