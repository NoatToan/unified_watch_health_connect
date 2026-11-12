package z23;

/* JADX INFO: loaded from: classes3.dex */
public class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f202063a = new m();

    @Override // e23.l
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!x33.f.f(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return x33.f.e(simpleName);
        }
        return null;
    }
}
