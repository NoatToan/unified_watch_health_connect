package r12;

import e23.p;
import li0.d0;
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
import p3.p2;
import p3.x1;
import v13.i;
import yc.s;
import zc.g;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.mute.FollowMutedUsersScreenKt$FollowMutedUsersScreen$1$1", f = "FollowMutedUsersScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zc.d<d0> f149412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f149413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zc.d<d0> dVar, p1<Boolean> p1Var, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f149412a = dVar;
            this.f149413b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f149412a, this.f149413b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            p1<Boolean> p1Var = this.f149413b;
            if (p1Var.getF182175a().booleanValue()) {
                zc.d<d0> dVar = this.f149412a;
                if (dVar.d().f196390f || dVar.d().f196391g) {
                    p1Var.setValue(Boolean.FALSE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(f fVar, e23.a<Unit> aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1114421652);
        int i15 = 16;
        int i16 = (o0VarE.r(fVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            zc.d dVarA = g.a(fVar.f149418e, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            s sVarD = dVarA.d();
            boolean zR = o0VarE.r(dVarA);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(dVarA, p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, sVarD, o0VarE);
            z02.b.a(false, null, null, null, false, z3.f.c(2061211638, new qy0.d(p1Var, aVar, dVarA, fVar, 2), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q72.f(fVar, aVar, i14, i15);
        }
    }
}
