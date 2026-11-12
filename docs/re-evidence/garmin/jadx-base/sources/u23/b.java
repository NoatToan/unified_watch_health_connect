package u23;

/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f168205a;

    public b(h hVar) {
        if (hVar != null) {
            this.f168205a = hVar;
        } else {
            y(0);
            throw null;
        }
    }

    public static /* synthetic */ void y(int i14) {
        String str = i14 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i14 != 1 ? 3 : 2];
        if (i14 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i14 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i14 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i14 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // u23.a
    public h getAnnotations() {
        h hVar = this.f168205a;
        if (hVar != null) {
            return hVar;
        }
        y(1);
        throw null;
    }
}
