package i33;

import java.util.List;
import p43.n0;
import t23.d1;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f90813a = new a();

    public static class a implements o {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0 f90814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n0 f90815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<j1> f90816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<d1> f90817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f90818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f90819f;

        public b(n0 n0Var, n0 n0Var2, List<j1> list, List<d1> list2, List<String> list3, boolean z14) {
            if (n0Var == null) {
                a(0);
                throw null;
            }
            if (list == null) {
                a(1);
                throw null;
            }
            if (list2 == null) {
                a(2);
                throw null;
            }
            if (list3 == null) {
                a(3);
                throw null;
            }
            this.f90814a = n0Var;
            this.f90815b = n0Var2;
            this.f90816c = list;
            this.f90817d = list2;
            this.f90818e = list3;
            this.f90819f = z14;
        }

        public static /* synthetic */ void a(int i14) {
            String str = (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) ? 2 : 3];
            switch (i14) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i14 == 4) {
                objArr[1] = "getReturnType";
            } else if (i14 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i14 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i14 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i14 != 4 && i14 != 5 && i14 != 6 && i14 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i14 != 4 && i14 != 5 && i14 != 6 && i14 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }
    }
}
