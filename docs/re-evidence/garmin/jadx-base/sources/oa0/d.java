package oa0;

import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import j90.k;
import o13.r;
import o53.b0;
import o72.i3;
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
import v62.m2;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.displayprefernces.DeviceScreenOrientationScreenKt$DeviceScreenOrientationScreen$1$1", f = "DeviceScreenOrientationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<k, Unit> f131051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<k> f131052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super k, Unit> lVar, p1<k> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f131051a = lVar;
            this.f131052b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f131051a, this.f131052b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f131051a.invoke(this.f131052b.getF182175a());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h90.e eVar, k kVar, e23.a<Unit> aVar, l<? super k, Unit> lVar, l<? super Float, Unit> lVar2, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1985876438);
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.k(kVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(kVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new i3(p1Var, 3);
                o0VarE.K(objQ2);
            }
            l lVar3 = (l) objQ2;
            k kVar2 = (k) p1Var.getF182175a();
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new a(lVar, p1Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, kVar2, o0VarE);
            String strQ = y.Q(o0VarE, R.string.startup_customize_your_view);
            String strQ2 = y.Q(o0VarE, R.string.startup_customize_your_view_desc);
            s62.a.f157643a.getClass();
            o0Var = o0VarE;
            da0.p.b("device_customization_screen_orientation_screen", strQ, m2.a(t62.b.f162798a), strQ2, null, y.Q(o0VarE, R.string.lbl_next), aVar, false, null, null, false, null, null, false, false, aVar2, null, null, null, null, null, z3.f.c(-178653482, new mw0.h(lVar2, eVar, lVar3, p1Var, 4), o0VarE), o0Var, ((i15 << 12) & 3670016) | 6, i15 & 458752, 384, 4161424);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(eVar, kVar, aVar, lVar, lVar2, aVar2, i14, 1);
        }
    }

    public static final void b(h90.e eVar, k kVar, e23.a<Unit> aVar, l<? super k, Unit> lVar, l<? super Float, Unit> lVar2, e23.a<Unit> aVar2, m mVar, int i14) {
        eVar.getClass();
        kVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1162282521);
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.k(kVar.ordinal()) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            a(eVar, kVar, aVar, lVar, lVar2, aVar2, o0VarE, i15 & 524286);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(eVar, kVar, aVar, lVar, lVar2, aVar2, i14, 0);
        }
    }
}
