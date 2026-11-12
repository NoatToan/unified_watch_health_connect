package ho1;

import e23.p;
import fo1.o0;
import li0.d0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import yc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.follow.likes.FollowLikeListScreenKt$LikeListScreen$1$1", f = "FollowLikeListScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zc.d<d0> f84825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f84826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zc.d<d0> dVar, p1<Boolean> p1Var, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f84825a = dVar;
            this.f84826b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f84825a, this.f84826b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<Boolean> p1Var = this.f84826b;
            if (p1Var.getF182175a().booleanValue()) {
                zc.d<d0> dVar = this.f84825a;
                if (dVar.d().f196390f || dVar.d().f196391g) {
                    p1Var.setValue(Boolean.FALSE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(o0 o0Var, p3.m mVar, int i14) {
        o0Var.getClass();
        p3.o0 o0VarE = mVar.E(-1990865676);
        int i15 = (o0VarE.r(o0Var) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d(zc.g.a(o0Var.Z, o0VarE), o0Var, o0VarE, ((i15 << 3) & 112) | 8);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(o0Var, i14, i16);
        }
    }

    public static final void b(o0 o0Var, p3.m mVar, int i14) {
        o0Var.getClass();
        p3.o0 o0VarE = mVar.E(-671578798);
        int i15 = (o0VarE.r(o0Var) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d(zc.g.a(o0Var.f72665k0, o0VarE), o0Var, o0VarE, ((i15 << 3) & 112) | 8);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(o0Var, i14, i16);
        }
    }

    public static final void c(o0 o0Var, p3.m mVar, int i14) {
        o0Var.getClass();
        p3.o0 o0VarE = mVar.E(-1741202939);
        int i15 = 2;
        int i16 = (o0VarE.r(o0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d(zc.g.a(o0Var.Y, o0VarE), o0Var, o0VarE, ((i16 << 3) & 112) | 8);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(o0Var, i14, i15);
        }
    }

    public static final void d(zc.d<d0> dVar, o0 o0Var, p3.m mVar, int i14) {
        int i15;
        dVar.getClass();
        o0Var.getClass();
        p3.o0 o0VarE = mVar.E(702378947);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(o0Var) ? 32 : 16;
        }
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            s sVarD = dVar.d();
            if ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(dVar))) {
                z14 = true;
            }
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new a(dVar, p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, sVarD, o0VarE);
            z02.b.a(false, null, null, null, false, z3.f.c(2084324429, new gw1.c(p1Var, 7, dVar, o0Var), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(dVar, o0Var, i14, 19);
        }
    }
}
