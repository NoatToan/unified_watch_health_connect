package o63;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f129843a;

    static {
        Object bVar;
        try {
            int i14 = o13.q.f128596b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            bVar = property != null ? d53.t.i(property) : null;
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Integer num = (Integer) (bVar instanceof o13.q.b ? null : bVar);
        f129843a = num != null ? num.intValue() : 2097152;
    }
}
