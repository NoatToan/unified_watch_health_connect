package p43;

import com.garmin.android.gncs.NotificationConstants;

/* JADX INFO: loaded from: classes3.dex */
public class v1 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f135928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f135929b;

    public v1(g2 g2Var, n0 n0Var) {
        if (g2Var == null) {
            d(0);
            throw null;
        }
        if (n0Var == null) {
            d(1);
            throw null;
        }
        this.f135928a = g2Var;
        this.f135929b = n0Var;
    }

    public static /* synthetic */ void d(int i14) {
        String str = (i14 == 4 || i14 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 4 || i14 == 5) ? 2 : 3];
        switch (i14) {
            case 1:
            case 2:
            case 3:
                objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i14 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i14 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i14 == 3) {
            objArr[2] = "replaceType";
        } else if (i14 != 4 && i14 != 5) {
            if (i14 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i14 != 4 && i14 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p43.t1
    public final g2 a() {
        g2 g2Var = this.f135928a;
        if (g2Var != null) {
            return g2Var;
        }
        d(4);
        throw null;
    }

    @Override // p43.t1
    public final boolean b() {
        return false;
    }

    @Override // p43.t1
    public final t1 c(q43.f fVar) {
        if (fVar != null) {
            return new v1(this.f135928a, fVar.f(this.f135929b));
        }
        d(6);
        throw null;
    }

    @Override // p43.t1
    public final n0 getType() {
        n0 n0Var = this.f135929b;
        if (n0Var != null) {
            return n0Var;
        }
        d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v1(n0 n0Var) {
        this(g2.INVARIANT, n0Var);
        if (n0Var != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
