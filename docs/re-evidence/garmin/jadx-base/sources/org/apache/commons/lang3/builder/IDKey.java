package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes3.dex */
final class IDKey {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f133453id;
    private final Object value;

    public IDKey(Object obj) {
        this.f133453id = System.identityHashCode(obj);
        this.value = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IDKey)) {
            return false;
        }
        IDKey iDKey = (IDKey) obj;
        return this.f133453id == iDKey.f133453id && this.value == iDKey.value;
    }

    public int hashCode() {
        return this.f133453id;
    }
}
