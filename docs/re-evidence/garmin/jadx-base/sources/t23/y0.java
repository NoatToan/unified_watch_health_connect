package t23;

/* JADX INFO: loaded from: classes3.dex */
public interface y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f162076a = new a();

    public static class a implements y0 {
        @Override // t23.y0
        public final z0.a a() {
            z0.a aVar = z0.f162077a;
            if (aVar != null) {
                return aVar;
            }
            vb.h.z("@NotNull method kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1.getContainingFile must not return null");
            return null;
        }

        public final String toString() {
            return "NO_SOURCE";
        }
    }

    z0.a a();
}
