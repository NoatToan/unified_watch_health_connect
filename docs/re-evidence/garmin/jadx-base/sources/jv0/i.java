package jv0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import gl1.y;
import l72.c1;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.setup.screens.SharingOptionsSetupScreenKt$SharingOptionsSetupScreen$1$1", f = "SharingOptionsSetupScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f100991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f100992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<g3<Boolean>> f100993c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gv0.d dVar, e23.a<Unit> aVar, x3<g3<Boolean>> x3Var, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f100991a = dVar;
            this.f100992b = aVar;
            this.f100993c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f100991a, this.f100992b, this.f100993c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Boolean bool;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            x3<g3<Boolean>> x3Var = this.f100993c;
            if (x3Var.getF182175a().f35300a == fw.p.SUCCESS && s.g(x3Var.getF182175a().f35301b, Boolean.TRUE)) {
                p2 p2Var = this.f100991a.f79200q;
                do {
                    value = p2Var.getValue();
                    g3.a aVar2 = g3.f35298f;
                    bool = Boolean.FALSE;
                    aVar2.getClass();
                } while (!p2Var.b(value, g3.a.d(bool)));
                this.f100992b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(gv0.d dVar, yu0.f fVar, e23.a<Unit> aVar, l<? super e23.a<Unit>, Unit> lVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        o0 o0Var;
        dVar.getClass();
        fVar.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarP = fb1.c.p(aVar3, aVar4, mVar, 1706568120);
        int i15 = i14 | (o0VarP.r(dVar) ? 4 : 2) | (o0VarP.r(fVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128) | (o0VarP.r(lVar) ? 2048 : 1024) | (o0VarP.r(aVar2) ? 16384 : 8192) | (o0VarP.r(aVar3) ? 131072 : 65536) | (o0VarP.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarP.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarP.B(context);
            Object objQ = o0VarP.q();
            m.a aVar5 = m.f135153a;
            if (zB) {
                objQ = new yu0.d(context);
                o0VarP.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new yu0.d(context);
                    o0VarP.K(objQ);
                }
            }
            yu0.d dVar2 = (yu0.d) objQ;
            Object objQ2 = o0VarP.q();
            aVar5.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = Boolean.valueOf(s3.b());
                o0VarP.K(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            p1 p1VarB = s9.c.b(dVar.N0, az0.c.a.Available, o0VarP, 48);
            p1 p1VarC = s9.c.c(dVar.f79201r, o0VarP);
            Object objQ3 = o0VarP.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ3);
            }
            p1 p1Var = (p1) objQ3;
            Object objQ4 = o0VarP.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ4);
            }
            p1 p1Var2 = (p1) objQ4;
            g3 g3Var = (g3) p1VarC.getF182175a();
            boolean zB2 = o0VarP.B(p1VarC) | o0VarP.r(dVar) | ((i15 & 458752) == 131072);
            Object objQ5 = o0VarP.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new a(dVar, aVar3, p1VarC, null);
                o0VarP.K(objQ5);
            }
            g3.a aVar6 = g3.f35298f;
            l0.e((p) objQ5, g3Var, o0VarP);
            o0Var = o0VarP;
            gl1.d.b(y.Q(o0VarP, R.string.lbl_review_setup), aVar4, ((Boolean) p1Var2.getF182175a()).booleanValue() || ((g3) p1VarC.getF182175a()).f35300a == fw.p.LOADING, null, null, null, z3.f.c(1916910022, new av0.g(p1VarB, dVar, fVar, zBooleanValue, dVar2, aVar, lVar, aVar2, p1Var2, p1Var), o0VarP), o0Var, ((i15 >> 15) & 112) | 1572864, 56);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(845917761);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0Var, R.string.common_network_reachability_error);
                String strQ2 = y.Q(o0Var, R.string.common_internet_connection_required);
                String strQ3 = y.Q(o0Var, R.string.lbl_ok);
                Object objQ6 = o0Var.q();
                if (objQ6 == c2565a) {
                    objQ6 = new jt1.h(p1Var, 4);
                    o0Var.K(objQ6);
                }
                e23.a<Unit> aVar7 = (e23.a) objQ6;
                Object objQ7 = o0Var.q();
                if (objQ7 == c2565a) {
                    objQ7 = new jt1.h(p1Var, 5);
                    o0Var.K(objQ7);
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar7, null, (e23.a) objQ7, o0Var, 100663296, 6, 729);
                o0Var.g0(false);
            } else {
                o0Var.C(846295434);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.l0(i14, 14, dVar, fVar, aVar, lVar, aVar2, aVar3, aVar4);
        }
    }
}
