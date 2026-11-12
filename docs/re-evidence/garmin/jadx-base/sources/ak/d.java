package ak;

/* JADX INFO: loaded from: classes7.dex */
public enum d {
    BIDIRECTIONAL_SLAVE(0),
    /* JADX INFO: Fake field, exist only in values array */
    BIDIRECTIONAL_MASTER(16),
    /* JADX INFO: Fake field, exist only in values array */
    SHARED_BIDIRECTIONAL_SLAVE(32),
    /* JADX INFO: Fake field, exist only in values array */
    SHARED_BIDIRECTIONAL_MASTER(48),
    UNKNOWN(65535);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d[] f3511d = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3513a;

    d(int i14) {
        this.f3513a = i14;
    }
}
