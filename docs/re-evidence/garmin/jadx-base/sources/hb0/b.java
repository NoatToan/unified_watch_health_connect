package hb0;

import ad0.g;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import c2.j;
import cn1.t;
import com.garmin.android.apps.connectmobile.R;
import da0.z;
import e23.l;
import e23.p;
import e23.q;
import ew1.u1;
import gl1.y;
import i3.e9;
import i3.mc;
import i53.f;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.intro.ProfileIntroScreenKt$ProfileIntroScreen$1$1$1", f = "ProfileIntroScreen.kt", l = {65}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f82747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, d<? super a> dVar) {
            super(2, dVar);
            this.f82747b = mcVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f82747b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82746a;
            if (i14 == 0) {
                r.b(obj);
                this.f82746a = 1;
                if (this.f82747b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: hb0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.intro.ProfileIntroScreenKt$ProfileIntroScreen$2$1", f = "ProfileIntroScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1636b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f82748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f82749b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1636b(l<? super Boolean, Unit> lVar, boolean z14, d<? super C1636b> dVar) {
            super(2, dVar);
            this.f82748a = lVar;
            this.f82749b = z14;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C1636b(this.f82748a, this.f82749b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C1636b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f82748a.invoke(Boolean.valueOf(this.f82749b));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.intro.ProfileIntroScreenKt$ProfileIntroScreen$3$1$1$1$1$1", f = "ProfileIntroScreen.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f82751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, d<? super c> dVar) {
            super(2, dVar);
            this.f82751b = mcVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new c(this.f82751b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f82750a;
            if (i14 == 0) {
                r.b(obj);
                this.f82750a = 1;
                if (this.f82751b.g(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(final boolean z14, final boolean z15, final l<? super Boolean, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(2145263011);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final mc mcVarF = e9.f(false, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            final b0 b0Var = (b0) objQ;
            if (mcVarF.e()) {
                o0VarE.C(417448668);
                String string = context.getString(R.string.lbl_wheelchair_mode);
                string.getClass();
                pv.a.c cVar = new pv.a.c(string);
                String string2 = context.getString(R.string.startup_help_wheelchair_desc);
                string2.getClass();
                f fVarA = i53.a.a(cVar, new pv.a.b(string2));
                boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new t(b0Var, mcVarF, 13);
                    o0VarE.K(objQ2);
                }
                z.d(fVarA, mcVarF, (e23.a) objQ2, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(417943583);
                o0VarE.g0(false);
            }
            if (z14) {
                o0VarE.C(417981558);
                Unit unit = Unit.INSTANCE;
                boolean z16 = ((i15 & 896) == 256) | ((i15 & 112) == 32);
                Object objQ3 = o0VarE.q();
                if (z16 || objQ3 == c2565a) {
                    objQ3 = new C1636b(lVar, z15, null);
                    o0VarE.K(objQ3);
                }
                l0.e((p) objQ3, unit, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(418082463);
                o0VarE.g0(false);
            }
            String strQ = y.Q(o0VarE, R.string.lbl_profile_details);
            String strQ2 = y.Q(o0VarE, R.string.profile_details_questions_description);
            String strQ3 = y.Q(o0VarE, R.string.lbl_next);
            j.f22691a.getClass();
            o0Var = o0VarE;
            da0.p.b("user_profile_intro_screen", strQ, null, strQ2, null, strQ3, aVar, false, null, null, false, null, null, false, false, aVar2, null, null, null, j.f22695e, null, z3.f.c(922032291, new q() { // from class: hb0.a
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    m mVar2 = (m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = n.f135158a;
                        if (z14) {
                            mVar2.C(1948217534);
                            l72.l.f(z3.f.c(178324141, new g(b0Var, mcVarF, z15, lVar), mVar2), null, false, null, mVar2, 6, 30);
                            mVar2.f();
                        } else {
                            mVar2.C(1949940607);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, ((i15 << 9) & 3670016) | 6, (i15 << 3) & 458752, 390, 3112852);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u1(z14, z15, (l) lVar, (e23.a) aVar, (e23.a) aVar2, i14);
        }
    }
}
