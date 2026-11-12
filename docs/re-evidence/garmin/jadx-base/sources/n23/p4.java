package n23;

/* JADX INFO: loaded from: classes3.dex */
public final class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f122570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f122571b;

    static {
        Object bVar;
        Object bVar2;
        try {
            int i14 = o13.q.f128596b;
            bVar = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (bVar instanceof o13.q.b) {
            bVar = null;
        }
        String str = (String) bVar;
        boolean z14 = false;
        f122570a = str != null && Boolean.parseBoolean(str);
        try {
            bVar2 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th4) {
            int i16 = o13.q.f128596b;
            bVar2 = new o13.q.b(th4);
        }
        String str2 = (String) (bVar2 instanceof o13.q.b ? null : bVar2);
        if (str2 != null && Boolean.parseBoolean(str2)) {
            z14 = true;
        }
        f122571b = z14;
    }
}
