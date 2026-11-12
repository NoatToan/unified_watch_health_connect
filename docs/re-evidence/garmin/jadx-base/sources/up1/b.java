package up1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.u;
import dd1.c;
import e23.l;
import e23.p;
import n82.f;
import n82.j;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r53.c2;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: up1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.solarintensity.presentation.composables.screen.SolarIntensityScreenKt$SolarIntensityScreen$2$1$1$1$1$1", f = "SolarIntensityScreen.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class C3212b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f172147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f172148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f172149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<xp1.b, Unit> f172150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ xp1.b f172151e;

        /* JADX INFO: renamed from: up1.b$b$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.solarintensity.presentation.composables.screen.SolarIntensityScreenKt$SolarIntensityScreen$2$1$1$1$1$1$2", f = "SolarIntensityScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<o82.a, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f172152a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f172153b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l<xp1.b, Unit> f172154c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ xp1.b f172155d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(o82.a aVar, l<? super xp1.b, Unit> lVar, xp1.b bVar, d<? super a> dVar) {
                super(2, dVar);
                this.f172153b = aVar;
                this.f172154c = lVar;
                this.f172155d = bVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                a aVar = new a(this.f172153b, this.f172154c, this.f172155d, dVar);
                aVar.f172152a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                o82.a aVar = (o82.a) this.f172152a;
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                if (s.g(aVar, this.f172153b)) {
                    this.f172154c.invoke(this.f172155d);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3212b(f fVar, o82.a aVar, l<? super xp1.b, Unit> lVar, xp1.b bVar, d<? super C3212b> dVar) {
            super(2, dVar);
            this.f172148b = fVar;
            this.f172149c = aVar;
            this.f172150d = lVar;
            this.f172151e = bVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C3212b(this.f172148b, this.f172149c, this.f172150d, this.f172151e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C3212b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f172147a;
            if (i14 == 0) {
                r.b(obj);
                c2 c2VarS = p0.s(new d52.p(this.f172148b, 18));
                a aVar2 = new a(this.f172149c, this.f172150d, this.f172151e, null);
                this.f172147a = 1;
                if (r53.s.k(c2VarS, aVar2, this) == aVar) {
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

    public static final void a(u82.d<o82.a, xp1.b> dVar, boolean z14, l<? super Boolean, Unit> lVar, l<? super xp1.b, Unit> lVar2, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(556429137);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            u uVar = (u) o0VarE.A(g02.d.f74342a);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                f.a aVar2 = new f.a(null, null, null, 7, null);
                o0VarE.K(aVar2);
                objQ = aVar2;
            }
            f fVarA = j.a((f.a) objQ, null, o0VarE, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new yd1.a(context);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            z02.d.a(false, z3.f.c(-1893588586, new c(uVar, aVar, 1), o0VarE), null, null, null, z3.f.c(1813430426, new defpackage.d(fVarA, (yd1.a) objQ2, z14, dVar, lVar2, lVar, aVar), o0VarE), o0Var, 196656, 29);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug2.p(dVar, lVar, lVar2, aVar, z14, i14, 1);
        }
    }
}
