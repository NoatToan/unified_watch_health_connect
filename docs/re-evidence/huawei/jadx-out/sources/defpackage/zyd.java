package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zyd extends zya {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zxs<String> f54766c = new zxs<>("CONNECTION_ID", String.class, u);
    public static final zxs<Long> d = new zxs<>("CONNECTION_TIMESTAMP", Long.class, u);

    public String a() {
        return (String) get(f54766c);
    }

    @Override // defpackage.zya, defpackage.zxr
    public String toString() {
        return String.format("TCP(%s,ID:%s)", c(), zzp.d(a(), 10));
    }
}
