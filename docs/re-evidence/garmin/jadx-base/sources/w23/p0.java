package w23;

import com.garmin.android.gncs.NotificationConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public class p0 extends m0 implements t23.t0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j1 f181696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t23.t0 f181697n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t23.r0 r0Var, u23.h hVar, t23.a0 a0Var, t23.r rVar, boolean z14, boolean z15, boolean z16, t23.b.a aVar, t23.t0 t0Var, t23.y0 y0Var) {
        super(a0Var, rVar, r0Var, hVar, x33.f.g("<set-" + r0Var.getName() + ">"), z14, z15, z16, aVar, y0Var);
        if (r0Var == null) {
            y(0);
            throw null;
        }
        if (hVar == null) {
            y(1);
            throw null;
        }
        if (a0Var == null) {
            y(2);
            throw null;
        }
        if (rVar == null) {
            y(3);
            throw null;
        }
        if (aVar == null) {
            y(4);
            throw null;
        }
        if (y0Var == null) {
            y(5);
            throw null;
        }
        this.f181697n = t0Var != null ? t0Var : this;
    }

    public static x0 F0(p0 p0Var, p43.n0 n0Var, u23.h hVar) {
        if (n0Var == null) {
            y(8);
            throw null;
        }
        if (hVar != null) {
            return new x0(p0Var, null, 0, hVar, x33.h.f188616h, n0Var, false, false, false, null, t23.y0.f162076a);
        }
        y(9);
        throw null;
    }

    public static /* synthetic */ void y(int i14) {
        String str;
        int i15;
        switch (i14) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i14) {
            case 10:
            case 11:
            case 12:
            case 13:
                i15 = 2;
                break;
            default:
                i15 = 3;
                break;
        }
        Object[] objArr = new Object[i15];
        switch (i14) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = NotificationConstants.KEY_DATA_MIME_TYPE;
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i14) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i14) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i14) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // w23.m0, w23.p, w23.o, t23.l
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final t23.t0 a() {
        t23.t0 t0Var = this.f181697n;
        if (t0Var != null) {
            return t0Var;
        }
        y(13);
        throw null;
    }

    @Override // t23.l
    public final <R, D> R K(t23.n<R, D> nVar, D d14) {
        return (R) nVar.b(this, d14);
    }

    @Override // t23.a
    public final List<j1> f() {
        j1 j1Var = this.f181696m;
        if (j1Var == null) {
            j20.x.h();
            return null;
        }
        List<j1> listSingletonList = Collections.singletonList(j1Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        y(11);
        throw null;
    }

    @Override // t23.a
    public final p43.n0 getReturnType() {
        p43.v0 v0VarX = f43.e.e(this).x();
        if (v0VarX != null) {
            return v0VarX;
        }
        y(12);
        throw null;
    }

    @Override // t23.b, t23.a
    public final Collection<? extends t23.t0> o() {
        return E0(false);
    }
}
