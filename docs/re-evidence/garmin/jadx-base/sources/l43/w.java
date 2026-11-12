package l43;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f110117a = new a();

    public static class a implements w {
        public static /* synthetic */ void c(int i14) {
            Object[] objArr = new Object[3];
            if (i14 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i14 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l43.w
        public final void a(t23.e eVar, ArrayList arrayList) {
            if (eVar != null) {
                return;
            }
            c(0);
            throw null;
        }

        @Override // l43.w
        public final void b(t23.b bVar) {
            if (bVar != null) {
                return;
            }
            c(2);
            throw null;
        }
    }

    void a(t23.e eVar, ArrayList arrayList);

    void b(t23.b bVar);
}
