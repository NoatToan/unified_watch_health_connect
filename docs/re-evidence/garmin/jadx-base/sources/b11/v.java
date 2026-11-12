package b11;

import android.os.Parcelable;
import g01.c0;
import java.util.List;
import java.util.UUID;
import lc.u0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public interface v extends Parcelable {
    static /* synthetic */ i01.f N3(v vVar, b63.v vVar2, Long l14, i01.e eVar, i01.i iVar, Long l15, int i14) {
        if ((i14 & 16) != 0) {
            l15 = null;
        }
        return vVar.d3(vVar2, l14, eVar, iVar, l15);
    }

    default g01.r A3() {
        Double dValueOf = Double.valueOf(getF14235b());
        d dVarX = getF14238e();
        dVarX.getClass();
        g01.o oVar = new g01.o(dVarX.f14253a, dVarX.f14254b, dVarX.f14255c, dVarX.f14256d, dVarX.f14257e.name(), dVarX.f14258f, dVarX.f14259g, (String) null, 128, (p005kotlin.jvm.internal.j) null);
        s sVarV = getF14239f();
        sVarV.getClass();
        String str = sVarV.f14372a;
        String str2 = sVarV.f14373b;
        Double dValueOf2 = Double.valueOf(sVarV.f14374c);
        f fVar = sVarV.f14375d;
        return new g01.r(dValueOf, oVar, new c0(str, str2, dValueOf2, fVar.f14266a, fVar.f14267b, fVar.f14268c, fVar.f14269d, fVar.f14270e, fVar.f14271f, fVar.f14272g, fVar.f14273h, fVar.f14274i, fVar.f14275j, fVar.f14276k, fVar.f14277l, fVar.f14278m, fVar.f14279n, fVar.f14280o, fVar.f14281p, fVar.f14282q, fVar.f14283r, fVar.f14284t), (List) null, getF14237d(), getF14236c(), false, (List) null, 200, (p005kotlin.jvm.internal.j) null);
    }

    default String D0(p3.m mVar) {
        mVar.C(-1553994064);
        x1 x1Var = p3.n.f135158a;
        String strB = getF14239f().b(getF14238e().f14257e, G0(), mVar, 0);
        mVar.f();
        return strB;
    }

    f E();

    double G0();

    default a H1() {
        if (this instanceof a.C0202a) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            return a.C0202a.d((a.C0202a) this, string, 0.0d, false, 126);
        }
        if (!(this instanceof a.c)) {
            u0.r();
            return null;
        }
        String string2 = UUID.randomUUID().toString();
        string2.getClass();
        return a.c.d((a.c) this, string2, 0.0d, false, 126);
    }

    /* JADX INFO: renamed from: T0 */
    Long getF14237d();

    Double b4();

    default i01.f d3(b63.v vVar, Long l14, i01.e eVar, i01.i iVar, Long l15) {
        vVar.getClass();
        eVar.getClass();
        iVar.getClass();
        return new i01.f((String) null, b63.a.C0229a.f16171a.a(), (String) null, iVar, vVar, eVar, l14, getF14238e().f14253a, getF14239f().f14372a, getF14238e().f14257e, getF14238e().f14258f, getF14238e().f14259g, Double.valueOf(getF14235b()), l15, 4, (p005kotlin.jvm.internal.j) null);
    }

    Double g4();

    /* JADX INFO: renamed from: getId */
    String getF14234a();

    default String getImageUrl() {
        String str = getF14240g().f14379b;
        if (str != null) {
            return str;
        }
        String str2 = getF14240g().f14380c;
        return str2 == null ? getF14240g().f14378a : str2;
    }

    /* JADX INFO: renamed from: getImages */
    t getF14240g();

    Integer getTotalCalories();

    default v i4(double d14) {
        if (this instanceof a.C0202a) {
            return a.C0202a.d((a.C0202a) this, null, d14, false, 125);
        }
        if (this instanceof a.c) {
            return a.c.d((a.c) this, null, d14, false, 125);
        }
        u0.r();
        return null;
    }

    /* JADX INFO: renamed from: l */
    double getF14235b();

    default j01.b m1(Boolean bool) {
        return new j01.b(getF14238e().f14257e, getF14238e().f14258f, getF14238e().f14259g, getF14238e().f14253a, getF14239f().f14372a, Double.valueOf(getF14235b()), bool);
    }

    /* JADX INFO: renamed from: q1 */
    boolean getF14236c();

    /* JADX INFO: renamed from: v */
    s getF14239f();

    /* JADX INFO: renamed from: x */
    d getF14238e();

    Double z3();
}
