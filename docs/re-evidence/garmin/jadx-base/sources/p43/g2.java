package p43;

/* JADX INFO: loaded from: classes3.dex */
public enum g2 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f135848b;

    g2(String str, boolean z14, boolean z15, int i14) {
        this.f135847a = str;
        this.f135848b = z15;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f135847a;
    }
}
