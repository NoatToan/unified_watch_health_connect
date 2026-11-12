package c22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/s3;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3 f23252a = new s3();

    private s3() {
    }

    public static boolean a(String str) {
        str.getClass();
        f12.l.f68084a.getClass();
        return str.length() > 0 && f12.l.a.a().N().contains(str);
    }

    public static final boolean b() {
        f23252a.getClass();
        return a("ROLE_USER_MANAGED_ACCOUNTS_CHILD");
    }

    public static boolean c() {
        return a("ROLE_MBTESTER");
    }
}
