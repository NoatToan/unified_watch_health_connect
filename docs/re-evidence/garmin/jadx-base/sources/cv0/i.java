package cv0;

import a42.z;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import gl1.y;
import i3.fe;
import i3.mh;
import l72.d3;
import l72.r1;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.privacy.SavedSessionsPrivacyScreenKt$SavedSessionPrivacyScreen$2$2$1", f = "SavedSessionsPrivacyScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f55859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gv0.d f55860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f55861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fe f55862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f55863e;

        /* JADX INFO: renamed from: cv0.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.privacy.SavedSessionsPrivacyScreenKt$SavedSessionPrivacyScreen$2$2$1$1", f = "SavedSessionsPrivacyScreen.kt", l = {97}, m = "invokeSuspend", v = 2)
        public static final class C1210a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f55864a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ fe f55865b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f55866c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1210a(fe feVar, String str, t13.d<? super C1210a> dVar) {
                super(2, dVar);
                this.f55865b = feVar;
                this.f55866c = str;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1210a(this.f55865b, this.f55866c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1210a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f55864a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f55864a = 1;
                    if (d3.c(this.f55865b, this.f55866c, null, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, gv0.d dVar, x3<Boolean> x3Var, fe feVar, String str, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f55859a = b0Var;
            this.f55860b = dVar;
            this.f55861c = x3Var;
            this.f55862d = feVar;
            this.f55863e = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f55859a, this.f55860b, this.f55861c, this.f55862d, this.f55863e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f55861c.getF182175a().booleanValue()) {
                ge1.b.T(this.f55859a, null, null, new C1210a(this.f55862d, this.f55863e, null), 3);
                p2 p2Var = this.f55860b.F;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1427036469);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r1.b(y.Q(o0VarE, R.string.lbl_past_sessions), null, o0VarE, 0, 2);
            l72.p2.f111205a.g(y.Q(o0VarE, R.string.livetrack_update_past_sessions), null, null, null, null, false, false, aVar, o0VarE, (i15 << 24) & 234881024, 254);
            String strQ = y.Q(o0VarE, R.string.privacy_summary_update_past_activities);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            bVar.getClass();
            mh.c(strQ, l.z(aVar2, eVar.f97920e, f14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.p(aVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(yu0.f fVar, gv0.d dVar, e23.l<? super ge2.b, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        ge2.d dVar2;
        fVar.getClass();
        dVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1602102108);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(dVar.f79204w, o0VarE);
            p1 p1VarC2 = s9.c.c(dVar.I, o0VarE);
            p1 p1VarC3 = s9.c.c(fVar.f199712j, o0VarE);
            ge2.b.a aVar3 = ge2.b.f77011b;
            ou0.f fVar2 = (ou0.f) ((g3) p1VarC.getF182175a()).f35301b;
            i53.f fVarM = null;
            String str = (fVar2 == null || (dVar2 = fVar2.f133988f) == null) ? null : dVar2.f77020a;
            aVar3.getClass();
            ge2.b bVarA = ge2.b.a.a(str);
            if (bVarA == null) {
                bVarA = ge2.b.OnlyMe;
            }
            ev0.c cVar = (ev0.c) ((g3) p1VarC3.getF182175a()).f35301b;
            boolean zD = g22.n.d(cVar != null ? cVar.f66156e : null);
            boolean zK = o0VarE.k(bVarA.ordinal());
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zK) {
                objQ = p0.n(bVarA);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(bVarA);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            boolean zB = ((i15 & 57344) == 16384) | ((i15 & 896) == 256) | o0VarE.B(p1Var);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new cv0.a(lVar, aVar2, p1Var, 1);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new cv0.a(lVar, aVar2, p1Var, 1);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar5 = (e23.a) objQ2;
            Object objQ3 = o0VarE.q();
            aVar4.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = Boolean.valueOf(s3.b());
                o0VarE.K(objQ3);
            }
            boolean zBooleanValue = ((Boolean) objQ3).booleanValue();
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ4);
            }
            b0 b0Var = (b0) objQ4;
            String strQ = y.Q(o0VarE, R.string.lbl_saved_sessions);
            if (zBooleanValue) {
                z14 = false;
                o0VarE.C(1749015225);
            } else {
                o0VarE.C(-2021790921);
                fVarM = gl1.d.m(o0VarE);
                z14 = false;
            }
            o0VarE.g0(z14);
            boolean zR = o0VarE.r(dVar) | o0VarE.r(context);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new b(context, dVar, 1);
                o0VarE.K(objQ5);
            }
            o0Var = o0VarE;
            gl1.d.b(strQ, aVar5, false, null, fVarM, (e23.l) objQ5, z3.f.c(-443690958, new h(p1VarC2, b0Var, dVar, bVarA, zD, p1Var, aVar), o0VarE), o0Var, 1605632, 12);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z((Object) fVar, (Object) dVar, (e23.l) lVar, (e23.a) aVar, (e23.a) aVar2, i14, 18);
        }
    }
}
