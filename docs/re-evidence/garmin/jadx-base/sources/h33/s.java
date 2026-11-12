package h33;

import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import t23.m1;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f81496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f81497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f81498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f81499d;

    public static class a extends t23.p {
        public a(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, t23.o oVar, t23.l lVar) {
            if (lVar != null) {
                return s.c(oVar, lVar);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
        }
    }

    public static class b extends t23.p {
        public b(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, t23.o oVar, t23.l lVar) {
            if (lVar != null) {
                return s.b(gVar, oVar, lVar);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
        }
    }

    public static class c extends t23.p {
        public c(m1 m1Var) {
            super(m1Var);
        }

        @Override // t23.r
        public final boolean c(j43.g gVar, t23.o oVar, t23.l lVar) {
            if (lVar != null) {
                return s.b(gVar, oVar, lVar);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", Constants.MessagePayloadKeys.FROM, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    static {
        a aVar = new a(x23.a.f188541c);
        f81496a = aVar;
        b bVar = new b(x23.c.f188543c);
        f81497b = bVar;
        c cVar = new c(x23.b.f188542c);
        f81498c = cVar;
        HashMap map = new HashMap();
        f81499d = map;
        map.put(aVar.f162042a, aVar);
        map.put(bVar.f162042a, bVar);
        map.put(cVar.f162042a, cVar);
    }

    public static /* synthetic */ void a(int i14) {
        String str = (i14 == 5 || i14 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 5 || i14 == 6) ? 2 : 3];
        switch (i14) {
            case 1:
                objArr[0] = Constants.MessagePayloadKeys.FROM;
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i14 == 5 || i14 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i14 == 2 || i14 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i14 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i14 != 5 && i14 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i14 != 5 && i14 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(j43.g gVar, t23.o oVar, t23.l lVar) {
        t23.o oVarR;
        if (lVar == null) {
            a(1);
            throw null;
        }
        if (oVar instanceof t23.b) {
            oVarR = b43.i.r((t23.b) oVar);
        } else {
            int i14 = b43.i.f15728a;
            oVarR = oVar;
        }
        if (c(oVarR, lVar)) {
            return true;
        }
        return t23.q.f162048c.c(gVar, oVar, lVar);
    }

    public static boolean c(t23.o oVar, t23.l lVar) {
        if (oVar == null) {
            a(2);
            throw null;
        }
        if (lVar == null) {
            a(3);
            throw null;
        }
        t23.h0 h0Var = (t23.h0) b43.i.h(oVar, t23.h0.class, false);
        t23.h0 h0Var2 = (t23.h0) b43.i.h(lVar, t23.h0.class, false);
        return (h0Var2 == null || h0Var == null || !h0Var.c().equals(h0Var2.c())) ? false : true;
    }
}
