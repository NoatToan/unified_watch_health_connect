package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class yug implements spf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static yug f40581a;

    public static synchronized yug a() {
        try {
            if (f40581a == null) {
                f40581a = new yug();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40581a;
    }

    @Override // defpackage.spf
    public void registerMemoryTrimmable(rpf rpfVar) {
    }
}
