package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes23.dex */
final class a {
    private final Object a;
    private final int b;

    public a(Object obj) {
        this.b = System.identityHashCode(obj);
        this.a = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && this.a == aVar.a;
    }

    public int hashCode() {
        return this.b;
    }
}
