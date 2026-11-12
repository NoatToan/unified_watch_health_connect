package ds;

import am.x0;
import android.content.Context;
import androidx.lifecycle.v1;
import nr.w0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import r53.k2;
import r53.q2;
import r53.z1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qr.t f60931b;

    public /* synthetic */ f(qr.t tVar, int i14) {
        this.f60930a = i14;
        this.f60931b = tVar;
    }

    @Override // e23.a
    public final Object invoke() {
        nr.p value;
        to.o typeDTO;
        int i14 = this.f60930a;
        Integer numValueOf = null;
        qr.t tVar = this.f60931b;
        switch (i14) {
            case 0:
                tVar.H4();
                return Unit.INSTANCE;
            case 1:
                tVar.f146568w2.k(null, Boolean.FALSE);
                tVar.X1.b();
                return Unit.INSTANCE;
            case 2:
                am.d dVar = tVar.f146544o;
                long j8 = tVar.f146575z;
                sr.b bVar = tVar.f146541n;
                ps.r value2 = tVar.W4().getValue();
                if (value2 != null) {
                    x0 x0VarH = value2.h();
                    bVar.getClass();
                    Context context = bVar.f160540a;
                    x0VarH.getClass();
                    tVar.E4(new w0.r1(dVar.t(), ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).I(context, x0VarH, String.valueOf(j8)), ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).P(String.valueOf(j8)), ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).D(context)));
                } else {
                    tVar.E4(new w0.r1(dVar.t(), null, null, null, 14, null));
                }
                return Unit.INSTANCE;
            case 3:
                tVar.E4(new w0.e(tVar.f146544o.t()));
                return Unit.INSTANCE;
            case 4:
                tVar.E4(new w0.c(tVar.f146544o.t()));
                return Unit.INSTANCE;
            case 5:
                tVar.H4();
                tVar.f146565v2 = false;
                tVar.F5("ActivityShareCreateTemplate", null, false, false);
                ps.r value3 = tVar.W4().getValue();
                if (value3 != null) {
                    tVar.E4(new w0.y0(tVar.V4(value3)));
                }
                return Unit.INSTANCE;
            case 6:
                int i15 = qr.t.A2;
                return q2.a(tVar.T4(null, p13.j0.f134944a));
            case 7:
                int i16 = qr.t.A2;
                return new qr.t.g(tVar.h5());
            case 8:
                int i17 = qr.t.A2;
                qr.t.d dVar2 = new qr.t.d(tVar.W4(), tVar);
                w9.a aVarA = v1.a(tVar);
                k2.f150703a.getClass();
                return r53.s.K(dVar2, aVarA, k2.a.f150706c, null);
            case 9:
                return q2.a(Boolean.valueOf(tVar.X1.k()));
            case 10:
                int i18 = qr.t.A2;
                return new js.b(v1.a(tVar), new f(tVar, 11));
            case 11:
                or.b bVar2 = tVar.f146553r;
                bVar2.getClass();
                return r53.s.f(new or.a(bVar2, null));
            case 12:
                tVar.X1.o();
                tVar.F5("CIQPromoFromActivityDetailsDismissed", null, false, false);
                return Unit.INSTANCE;
            case 13:
                tVar.E4(new w0.a1(tVar.f146575z));
                return Unit.INSTANCE;
            case 14:
                int i19 = qr.t.A2;
                tVar.E4(new w0.j0(hb2.g.a.GARMIN_SHOTVIEW));
                return Unit.INSTANCE;
            case 15:
                int i24 = qr.t.A2;
                z1<nr.p> z1VarA5 = tVar.a5();
                do {
                    value = z1VarA5.getValue();
                } while (!z1VarA5.b(value, nr.p.a(value, null, false, false, 15)));
                return Unit.INSTANCE;
            case 16:
                int i25 = qr.t.A2;
                tVar.G4();
                return Unit.INSTANCE;
            case 17:
                int i26 = qr.t.A2;
                tVar.S5();
                return Unit.INSTANCE;
            case 18:
                tVar.E4(new w0.r(tVar.f146575z));
                return Unit.INSTANCE;
            case 19:
                int i27 = qr.t.A2;
                tVar.E4(new w0.j0(hb2.g.a.GARMIN_DIVE));
                return Unit.INSTANCE;
            case 20:
                int i28 = qr.t.A2;
                tVar.F5("CIQPromoFromActivityDetailsClicked", null, false, false);
                ps.r value4 = tVar.W4().getValue();
                if (value4 != null && (typeDTO = value4.getTypeDTO()) != null) {
                    numValueOf = Integer.valueOf(typeDTO.getTypeId());
                }
                tVar.E4(new nr.x0(numValueOf, tVar.f146541n.n(tVar.A.f4360c)));
                return Unit.INSTANCE;
            case 21:
                int i29 = qr.t.A2;
                tVar.S5();
                return Unit.INSTANCE;
            case 22:
                int i30 = qr.t.A2;
                tVar.S5();
                return Unit.INSTANCE;
            case 23:
                tVar.E4(new w0.x(tVar.f146575z));
                return Unit.INSTANCE;
            case 24:
                int i34 = qr.t.A2;
                tVar.E4(w0.u1.f127547a);
                tVar.X4(tVar.f146575z);
                tVar.C5();
                return Unit.INSTANCE;
            case 25:
                int i35 = qr.t.A2;
                tVar.W5();
                return Unit.INSTANCE;
            case 26:
                int i36 = qr.t.A2;
                tVar.G5(ro0.l.IRON_SETUP);
                return Unit.INSTANCE;
            case 27:
                int i37 = qr.t.A2;
                tVar.W5();
                return Unit.INSTANCE;
            case 28:
                int i38 = qr.t.A2;
                tVar.E4(w0.C2448w0.f127564a);
                return Unit.INSTANCE;
            default:
                int i39 = qr.t.A2;
                tVar.E4(new w0.c2(nr.a0.IN_PROGRESS));
                return Unit.INSTANCE;
        }
    }
}
