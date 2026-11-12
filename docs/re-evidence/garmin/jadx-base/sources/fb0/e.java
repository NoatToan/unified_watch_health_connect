package fb0;

import a11.g0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import et1.a2;
import gg1.o0;
import h4.g;
import java.util.ArrayList;
import l72.c1;
import lc.u0;
import o13.h;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import r82.q;
import v13.i;
import v62.g9;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.height.HeightScreenKt$HeightRoute$1$1", f = "HeightScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Double, Unit> f70195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<gb0.a> f70196b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Double, Unit> lVar, x3<? extends gb0.a> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f70195a = lVar;
            this.f70196b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f70195a, this.f70196b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f70195a.invoke(new Double(this.f70196b.getF182175a().a()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(fb0.a aVar, l<? super Double, Unit> lVar, l<? super o0, Unit> lVar2, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        p1 p1Var;
        int i15;
        int i16;
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar2.getClass();
        aVar3.getClass();
        p3.o0 o0VarE = mVar.E(805821603);
        int i17 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            p1 p1VarC = s9.c.c(aVar.f70172c, o0VarE);
            p1 p1VarC2 = s9.c.c(aVar.f70174e, o0VarE);
            i53.f<f> fVar = (i53.f) s9.c.c(aVar.f70175f, o0VarE).getF182175a();
            ArrayList arrayList = new ArrayList(y.r(fVar, 10));
            for (f fVar2 : fVar) {
                int i18 = fVar2.f70197a;
                i53.c<Integer> cVar = fVar2.f70198b;
                Integer num = fVar2.f70199c;
                arrayList.add(new q(i18, cVar, num != null ? context.getString(num.intValue()) : null, fVar2.f70200d));
            }
            i53.f fVarJ = i53.a.j(arrayList);
            Double dValueOf = Double.valueOf(((gb0.a) p1VarC2.getF182175a()).a());
            boolean zB = ((i17 & 112) == 32) | o0VarE.B(p1VarC2);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == m.a.f135155b) {
                objQ2 = new a(lVar, p1VarC2, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, dValueOf, o0VarE);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(1660308382);
                c1 c1Var = c1.f110940a;
                gb0.a aVar4 = (gb0.a) p1VarC2.getF182175a();
                aVar4.getClass();
                if (aVar4 instanceof gb0.a.b) {
                    i16 = R.string.lbl_centimeters;
                } else {
                    if (!(aVar4 instanceof gb0.a.c)) {
                        u0.r();
                        return;
                    }
                    i16 = R.string.common_feet_string;
                }
                String strQ = gl1.y.Q(o0VarE, i16);
                String strQ2 = gl1.y.Q(o0VarE, R.string.common_button_ok);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
                z3.e eVarC = z3.f.c(1453640327, new c(fVarJ, 0), o0VarE);
                Object objQ3 = o0VarE.q();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = new a2(p1Var2, 10);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar5 = (e23.a) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new a2(p1Var2, 11);
                    o0VarE.K(objQ4);
                }
                p1Var = p1Var2;
                i15 = 0;
                c1Var.a(true, strQ, null, eVarC, null, strQ2, false, false, aVar5, strQ3, (e23.a) objQ4, o0VarE, 100666374, 6, 212);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                p1Var = p1Var2;
                i15 = 0;
                o0VarE.C(1661124767);
                o0VarE.g0(false);
            }
            gb0.a aVar6 = (gb0.a) p1VarC2.getF182175a();
            o0 o0Var = (o0) p1VarC.getF182175a();
            Object objQ5 = o0VarE.q();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ5 == c2565a2) {
                objQ5 = new a2(p1Var, 12);
                o0VarE.K(objQ5);
            }
            e23.a aVar7 = (e23.a) objQ5;
            int i19 = (i17 & 896) != 256 ? i15 : 1;
            Object objQ6 = o0VarE.q();
            if (i19 != 0 || objQ6 == c2565a2) {
                objQ6 = new d(lVar2, i15);
                o0VarE.K(objQ6);
            }
            int i24 = i17 << 3;
            b(aVar6, o0Var, aVar7, (l) objQ6, aVar2, aVar3, o0VarE, (57344 & i24) | 384 | (i24 & 458752));
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p((Object) aVar, (Object) lVar, (h) lVar2, (e23.a) aVar2, (e23.a) aVar3, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    public static final void b(gb0.a aVar, o0 o0Var, e23.a<Unit> aVar2, l<? super o0, Unit> lVar, e23.a<Unit> aVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        int i15;
        p3.o0 o0Var2;
        p3.o0 o0VarE = mVar.E(-841890649);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(o0Var.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.common_bic_height_title);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_profile_info_privacy);
            s62.a.f157643a.getClass();
            u4.d dVarA = g9.a(t62.b.f162798a);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_next);
            h4.d.f81522a.getClass();
            g.a aVar5 = h4.d.a.f81537o;
            boolean z14 = (57344 & i15) == 16384;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new eu.a(aVar3, 12);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new eu.a(aVar3, 12);
                    o0VarE.K(objQ);
                }
            }
            o0Var2 = o0VarE;
            da0.p.b("user_profile_height_screen", strQ, dVarA, strQ2, null, strQ3, (e23.a) objQ, false, null, null, false, null, null, false, false, aVar4, null, null, null, null, aVar5, z3.f.c(630374311, new b(aVar2, o0Var, lVar, aVar, 0), o0VarE), o0Var2, 6, i15 & 458752, 432, 2064272);
        } else {
            o0Var2 = o0VarE;
            o0Var2.e();
        }
        p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(aVar, o0Var, aVar2, lVar, aVar3, aVar4, i14);
        }
    }
}
