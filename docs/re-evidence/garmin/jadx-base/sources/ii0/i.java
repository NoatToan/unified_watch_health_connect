package ii0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.FollowRequestScreenKt$FollowRequestScreen$1$1", f = "FollowRequestScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zc.d<li0.d0> f93623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zc.d<li0.d0> dVar, p1<Boolean> p1Var, p1<Boolean> p1Var2, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f93623a = dVar;
            this.f93624b = p1Var;
            this.f93625c = p1Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f93623a, this.f93624b, this.f93625c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            zc.d<li0.d0> dVar = this.f93623a;
            z0 z0Var = dVar.d().f196385a;
            z0.b bVar = z0.b.f196664b;
            if (!p005kotlin.jvm.internal.s.g(z0Var, bVar)) {
                this.f93624b.setValue(Boolean.FALSE);
            }
            this.f93625c.setValue(Boolean.valueOf(p005kotlin.jvm.internal.s.g(dVar.d().f196385a, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar)));
            return Unit.INSTANCE;
        }
    }

    public static final void a(mi0.a aVar, String str, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        aVar.getClass();
        str.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-212377100);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var3 = (p1) objQ4;
            boolean zEquals = str.equals(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()));
            zc.d dVarA = zc.g.a(aVar.f118688g, o0VarE);
            z0 z0Var = dVarA.d().f196385a;
            boolean zR = o0VarE.r(dVarA);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new a(dVarA, p1Var2, p1Var, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, z0Var, o0VarE);
            z02.b.a(false, null, null, null, false, z3.f.c(-1327384406, new defpackage.d(p1Var3, aVar2, dVarA, aVar, zEquals, p1Var2, p1Var), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(aVar, str, aVar2, i14, 11);
        }
    }
}
