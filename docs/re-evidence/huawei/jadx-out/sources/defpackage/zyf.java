package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zyf extends zyd {
    public static final zxs<String> e = new zxs<>("TLS_SESSION_ID", String.class, u);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zxs<String> f54768a = new zxs<>("TLS_CIPHER", String.class, u);

    public String b() {
        return (String) get(e);
    }

    public String d() {
        return (String) get(f54768a);
    }

    @Override // defpackage.zyd, defpackage.zya, defpackage.zxr
    public String toString() {
        return String.format("TLS(%s,%s,%s,%s)", c(), zzp.d(a(), 10), zzp.d(b(), 10), d());
    }
}
