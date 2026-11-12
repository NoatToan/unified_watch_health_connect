package ak;

/* JADX INFO: loaded from: classes7.dex */
public enum c {
    UNASSIGNED(0),
    ASSIGNED(1),
    SEARCHING(2),
    TRACKING(3),
    INVALID(65535);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c[] f3506g = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3508a;

    c(int i14) {
        this.f3508a = i14;
    }
}
