package ii0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.MySuggestedListKt$MySuggestedList$1$1", f = "MySuggestedList.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zc.d<li0.d0> f93566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f93567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93570f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zc.d<li0.d0> dVar, e2.i0 i0Var, p1<Boolean> p1Var, p1<Boolean> p1Var2, p1<Boolean> p1Var3, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f93566b = dVar;
            this.f93567c = i0Var;
            this.f93568d = p1Var;
            this.f93569e = p1Var2;
            this.f93570f = p1Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f93566b, this.f93567c, this.f93568d, this.f93569e, this.f93570f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0075  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93565a;
            p1<Boolean> p1Var = this.f93569e;
            zc.d<li0.d0> dVar = this.f93566b;
            if (i14 == 0) {
                o13.r.b(obj);
                if (!p005kotlin.jvm.internal.s.g(dVar.d().f196385a, z0.b.f196664b)) {
                    this.f93568d.setValue(Boolean.FALSE);
                    if (p1Var.getF182175a().booleanValue()) {
                        this.f93565a = 1;
                        e2.i0.a aVar2 = e2.i0.f62432x;
                        if (this.f93567c.l(0, 0, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                z0 z0Var = dVar.d().f196385a;
                z0.b bVar = z0.b.f196664b;
                this.f93570f.setValue(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(z0Var, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar)));
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p1Var.setValue(Boolean.FALSE);
            z0 z0Var2 = dVar.d().f196385a;
            z0.b bVar2 = z0.b.f196664b;
            this.f93570f.setValue(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(z0Var2, bVar2) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar2) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar2)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(zc.d<li0.d0> dVar, li0.f fVar, e2.i0 i0Var, p3.m mVar, int i14) {
        int i15;
        e2.i0 i0Var2;
        p3.o0 o0Var;
        p1 p1Var;
        Object aVar;
        fVar.getClass();
        i0Var.getClass();
        p3.o0 o0VarE = mVar.E(347832633);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i0Var2 = i0Var;
            i15 |= o0VarE.B(i0Var2) ? 256 : 128;
        } else {
            i0Var2 = i0Var;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) objQ3;
            z0 z0Var = dVar.d().f196385a;
            int i17 = i16 & 14;
            boolean z14 = (i17 == 4 || ((i16 & 8) != 0 && o0VarE.r(dVar))) | ((i16 & 896) == 256);
            Object objQ4 = o0VarE.q();
            if (z14 || objQ4 == c2565a) {
                p1Var = p1Var3;
                aVar = new a(dVar, i0Var2, p1Var, p1Var4, p1Var2, null);
                p1Var4 = p1Var4;
                p1Var2 = p1Var2;
                o0VarE.K(aVar);
            } else {
                p1Var = p1Var3;
                aVar = objQ4;
            }
            p3.l0.e((e23.p) aVar, z0Var, o0VarE);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean z15 = i17 == 4 || ((i16 & 8) != 0 && o0VarE.r(dVar));
            Object objQ5 = o0VarE.q();
            if (z15 || objQ5 == c2565a) {
                objQ5 = new b0(dVar, p1Var, p1Var4, 0);
                o0VarE.K(objQ5);
            }
            o0Var = o0VarE;
            m3.l.b(zBooleanValue, (e23.a) objQ5, null, null, null, null, z3.f.c(646982291, new fb0.b(dVar, i0Var, fVar, p1Var2, 13), o0VarE), o0Var, 1572864, 60);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(dVar, fVar, i0Var, i14, 13);
        }
    }
}
