package w23;

import com.garmin.android.gncs.NotificationConstants;
import java.util.ArrayList;
import java.util.List;
import p43.g2;
import t23.b1;

/* JADX INFO: loaded from: classes3.dex */
public class w0 extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e23.l<p43.n0, Void> f181720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f181721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f181722m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private w0(t23.l lVar, u23.h hVar, boolean z14, g2 g2Var, x33.f fVar, int i14, t23.y0 y0Var, e23.l<p43.n0, Void> lVar2, b1 b1Var, o43.n nVar) {
        super(nVar, lVar, hVar, fVar, g2Var, z14, i14, y0Var, b1Var);
        if (lVar == null) {
            y(19);
            throw null;
        }
        if (hVar == null) {
            y(20);
            throw null;
        }
        if (g2Var == null) {
            y(21);
            throw null;
        }
        if (fVar == null) {
            y(22);
            throw null;
        }
        if (y0Var == null) {
            y(23);
            throw null;
        }
        if (b1Var == null) {
            y(24);
            throw null;
        }
        if (nVar == null) {
            y(25);
            throw null;
        }
        this.f181721l = new ArrayList(1);
        this.f181722m = false;
        this.f181720k = lVar2;
    }

    public static w0 G0(t23.l lVar, u23.h hVar, boolean z14, g2 g2Var, x33.f fVar, int i14, t23.y0 y0Var, o43.n nVar) {
        if (lVar == null) {
            y(6);
            throw null;
        }
        if (hVar == null) {
            y(7);
            throw null;
        }
        if (g2Var == null) {
            y(8);
            throw null;
        }
        if (fVar == null) {
            y(9);
            throw null;
        }
        if (y0Var == null) {
            y(10);
            throw null;
        }
        if (nVar == null) {
            y(11);
            throw null;
        }
        b1.a aVar = b1.a.f161998a;
        if (aVar != null) {
            return new w0(lVar, hVar, z14, g2Var, fVar, i14, y0Var, null, aVar, nVar);
        }
        y(17);
        throw null;
    }

    public static w0 H0(b bVar, u23.h hVar, g2 g2Var, x33.f fVar, int i14, o43.n nVar) {
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (g2Var == null) {
            y(2);
            throw null;
        }
        if (nVar == null) {
            y(4);
            throw null;
        }
        w0 w0VarG0 = G0(bVar, hVar, false, g2Var, fVar, i14, t23.y0.f162076a, nVar);
        p43.v0 v0VarN = f43.e.e(bVar).n();
        if (w0VarG0.f181722m) {
            vb.h.z("Type parameter descriptor is already initialized: ".concat(w0VarG0.I0()));
            return null;
        }
        if (!o72.t.R(v0VarN)) {
            w0VarG0.f181721l.add(v0VarN);
        }
        if (w0VarG0.f181722m) {
            vb.h.z("Type parameter descriptor is already initialized: ".concat(w0VarG0.I0()));
            return null;
        }
        w0VarG0.f181722m = true;
        return w0VarG0;
    }

    public static /* synthetic */ void y(int i14) {
        String str = (i14 == 5 || i14 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 5 || i14 == 28) ? 2 : 3];
        switch (i14) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                break;
        }
        if (i14 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i14 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i14) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i14 != 5 && i14 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // w23.i
    public final void E0(p43.n0 n0Var) {
        if (n0Var == null) {
            y(27);
            throw null;
        }
        e23.l<p43.n0, Void> lVar = this.f181720k;
        if (lVar == null) {
            return;
        }
        lVar.invoke(n0Var);
    }

    @Override // w23.i
    public final List<p43.n0> F0() {
        if (!this.f181722m) {
            vb.h.z("Type parameter descriptor is not initialized: ".concat(I0()));
            return null;
        }
        ArrayList arrayList = this.f181721l;
        if (arrayList != null) {
            return arrayList;
        }
        y(28);
        throw null;
    }

    public final String I0() {
        return getName() + " declared in " + b43.i.f(d());
    }
}
