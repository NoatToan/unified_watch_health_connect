package eb0;

import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
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
import t13.d;
import v13.e;
import v13.i;
import z3.f;
import z80.k;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.gender.GenderSelectionScreenKt$GenderSelectionScreen$1$1", f = "GenderSelectionScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f63657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<k> f63658b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, p1<k> p1Var, d<? super a> dVar) {
            super(2, dVar);
            this.f63657a = kVar;
            this.f63658b = p1Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f63657a, this.f63658b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f63658b.setValue(this.f63657a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(k kVar, l<? super k, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1909910466);
        int i15 = i14 | (o0VarE.k(kVar == null ? -1 : kVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(kVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean z14 = (i15 & 14) == 4;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new a(kVar, p1Var, null);
                o0VarE.K(objQ2);
            }
            l0.e((p) objQ2, kVar, o0VarE);
            String strQ = y.Q(o0VarE, R.string.common_bic_gender_title);
            String strQ2 = y.Q(o0VarE, R.string.msg_profile_info_privacy);
            s62.a.f157643a.getClass();
            u4.d dVarA = u62.a.a(t62.a.f162797a);
            String strQ3 = y.Q(o0VarE, R.string.lbl_next);
            boolean z15 = (((k) p1Var.getF182175a()) == null || ((k) p1Var.getF182175a()) == k.NOT_SPECIFIED) ? false : true;
            boolean z16 = ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objQ3 = o0VarE.q();
            if (z16 || objQ3 == c2565a) {
                objQ3 = new cv0.a(p1Var, lVar, aVar);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            da0.p.b("user_profile_gender_screen", strQ, dVarA, strQ2, null, strQ3, (e23.a) objQ3, z15, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, f.c(-613593282, new eb0.a(p1Var, 0), o0VarE), o0Var, 6, (i15 << 6) & 458752, 384, 4161296);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.i((Object) kVar, (l) lVar, (e23.a) aVar, (e23.a) aVar2, i14, 12);
        }
    }
}
