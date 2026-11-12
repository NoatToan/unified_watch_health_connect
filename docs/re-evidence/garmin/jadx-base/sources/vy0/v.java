package vy0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.u3;
import kotlin.t1;
import l72.i3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.a2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.w0;
import v62.o1;
import v62.o7;
import vd0.s0;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes9.dex */
public final class v {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreTitleBarKt$MoreTitleBar$2$1", f = "MoreTitleBar.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f180772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f180773b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180772a = z14;
            this.f180773b = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180772a, this.f180773b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f180772a) {
                m4.b0.a(this.f180773b);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    public static final void a(String str, boolean z14, boolean z15, ty0.b bVar, e23.l<? super Boolean, Unit> lVar, e23.l<? super String, Unit> lVar2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        str.getClass();
        bVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1750583205);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.k(bVar.ordinal()) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_search);
            s62.a.f157643a.getClass();
            t62.b bVar2 = t62.b.f162798a;
            i3 i3Var = new i3("MENU_SEARCH", strQ, false, o7.a(bVar2), gl1.y.Q(o0VarE, R.string.lbl_search), 4, (p005kotlin.jvm.internal.j) null);
            i3 i3Var2 = new i3("MENU_CANCEL_SEARCH", gl1.y.Q(o0VarE, R.string.lbl_cancel), false, o1.a(bVar2), gl1.y.Q(o0VarE, R.string.lbl_cancel), 4, (p005kotlin.jvm.internal.j) null);
            int i16 = i15 & 57344;
            boolean z16 = i16 == 16384;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z16) {
                objQ = new ub0.h(lVar, 12);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ub0.h(lVar, 12);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean zB = o0VarE.B(aVar3);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new ux1.g(aVar3, 25);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ux1.g(aVar3, 25);
                    o0VarE.K(objQ2);
                }
            }
            int i17 = i15 >> 6;
            c.w.a(i17 & 14, 0, (e23.a) objQ2, o0VarE, z15);
            Object objQ3 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ3;
            Boolean boolValueOf = Boolean.valueOf(z15);
            boolean z17 = (i15 & 896) == 256;
            Object objQ4 = o0VarE.q();
            boolean z18 = z17;
            u4.d dVarA = null;
            if (z18 || objQ4 == c2565a) {
                objQ4 = new a(z15, b0Var, null);
                o0VarE.K(objQ4);
            }
            l0.e((e23.p) objQ4, boolValueOf, o0VarE);
            if (z15) {
                o0VarE.C(-2130235656);
                int i18 = b3.a.f15501a;
                z02.f.f(c3.a.a(), aVar3, z3.f.c(-1145364750, new vx1.b(str, 2, i3Var2, lVar2), o0VarE), z3.f.c(-1034557733, new s0(b0Var, 4, str, lVar2), o0VarE), o0VarE, 27648, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2129018689);
                String strB = bVar.b(w2.a0.s(o0VarE));
                if (z14) {
                    int i19 = b3.a.f15501a;
                    dVarA = c3.a.a();
                }
                i53.f fVarA = i53.a.a(i3Var);
                boolean z19 = i16 == 16384;
                Object objQ5 = o0VarE.q();
                if (z19 || objQ5 == c2565a) {
                    objQ5 = new ta0.j(lVar, 23);
                    o0VarE.K(objQ5);
                }
                z02.f.b(dVarA, null, strB, null, aVar, fVarA, null, (e23.l) objQ5, o0VarE, (i17 & 57344) | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 74);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ki1.f(str, z14, z15, bVar, lVar, lVar2, aVar, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(h4.r rVar, String str, String str2, a2 a2Var, a2.j jVar, long j8, e23.p pVar, p3.m mVar, int i14) {
        a2 a2Var2;
        a2.j jVar2;
        a2 a2Var3;
        a2.j jVar3;
        p3.m.a.C2565a c2565a;
        o0 o0VarE = mVar.E(-1494636548);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | 27648 | (o0VarE.l(j8) ? 131072 : 65536) | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            int i16 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i16 == 0 || o0VarE.o0()) {
                x5.v.f188954b.getClass();
                int i17 = x5.v.f188955c;
                x5.p.f188918b.getClass();
                a2Var3 = new a2(0, (Boolean) null, i17, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                Object objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                jVar3 = (a2.j) objQ;
            } else {
                o0VarE.e();
                a2Var3 = a2Var;
                jVar3 = jVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            d92.b.f58623a.getClass();
            t2 t2Var = new t2(d92.b.a(o0VarE).k().a(), o4.d0.c(0.4f, d92.b.a(o0VarE).k().a(), 14), null);
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ2 == c2565a2) {
                int length = str.length();
                c2565a = c2565a2;
                objQ2 = p0.n(new x5.l0(str, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ2);
            } else {
                c2565a = c2565a2;
            }
            p1 p1Var = (p1) objQ2;
            String str3 = ((x5.l0) p1Var.getF182175a()).f188878a.f157138b;
            boolean z14 = (i15 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new w(str, p1Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, str3, o0VarE);
            a2 a2Var4 = a2Var3;
            a2.j jVar4 = jVar3;
            p3.v.a(u2.f201804a.c(t2Var), z3.f.c(-1145742148, new u3(rVar, qVar, pVar, str, a2Var4, jVar4, p1Var, j8, str2), o0VarE), o0VarE, 56);
            a2Var2 = a2Var4;
            jVar2 = jVar4;
        } else {
            o0VarE.e();
            a2Var2 = a2Var;
            jVar2 = jVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new es.a(rVar, str, str2, a2Var2, jVar2, j8, pVar, i14);
        }
    }
}
