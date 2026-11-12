package h13;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements x03.e<Object> {
    INSTANCE;

    @Override // b83.c
    public final void b(long j8) {
        e.d(j8);
    }

    @Override // b83.c
    public final void cancel() {
    }

    @Override // x03.h
    public final void clear() {
    }

    @Override // x03.d
    public final int e() {
        return 2;
    }

    @Override // x03.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // x03.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // x03.h
    public final Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
