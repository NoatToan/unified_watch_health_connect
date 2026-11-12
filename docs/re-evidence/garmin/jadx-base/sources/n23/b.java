package n23;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f122395a = 0;

    static {
        Object bVar;
        try {
            int i14 = o13.q.f128596b;
            bVar = Class.forName("java.lang.ClassValue");
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (!(bVar instanceof o13.q.b)) {
            bVar = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (bVar instanceof o13.q.b) {
            bVar = obj;
        }
    }
}
