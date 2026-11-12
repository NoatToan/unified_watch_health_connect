package nz2;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f128428a = a.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f128429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f128430c;

    public enum a {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        ZLIB,
        GZIP,
        ANY
    }

    static {
        a aVar = a.NONE;
        f128429b = a.GZIP;
        f128430c = a.ANY;
    }
}
