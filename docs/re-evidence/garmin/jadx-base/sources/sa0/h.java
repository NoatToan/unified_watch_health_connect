package sa0;

import androidx.lifecycle.v1;
import c2.v;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.ConnectionResult;
import gl1.y;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;
import s1.d0;
import s1.n0;
import s1.p0;
import s1.y0;
import v62.ia;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.SearchWiFiNetworksScreenKt$SearchWiFiNetworksScreenRoute$1$1", f = "SearchWiFiNetworksScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f158186a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f158186a = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f158186a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            n nVar = this.f158186a;
            nVar.getClass();
            w9.a aVarA = v1.a(nVar);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new p(nVar, null), 2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.SearchWiFiNetworksScreenKt$SearchWiFiNetworksScreenRoute$2$1", f = "SearchWiFiNetworksScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n.b f158187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f158188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f158189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.b bVar, e23.a<Unit> aVar, n nVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f158187a = bVar;
            this.f158188b = aVar;
            this.f158189c = nVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f158187a, this.f158188b, this.f158189c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f158187a.f158216c) {
                this.f158188b.invoke();
                this.f158189c.B4();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(2037986501);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.lbl_searching_wifi_network);
            s62.a.f157643a.getClass();
            u4.d dVarA = ia.a(t62.b.f162798a);
            c.f158169a.getClass();
            o0Var = o0VarE;
            da0.p.b("wifi_search_screen", strQ, dVarA, null, null, null, null, false, null, null, false, null, null, false, false, aVar, null, null, null, null, null, c.f158170b, o0Var, 6, (i15 << 15) & 458752, 384, 4161528);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    public static final void b(n.b bVar, n nVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1629852594);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.r(nVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(nVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new a(nVar, null);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(nVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, unit, o0VarE);
            Boolean boolValueOf = Boolean.valueOf(bVar.f158216c);
            boolean zR2 = o0VarE.r(bVar) | ((i15 & 896) == 256) | o0VarE.r(nVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new b(bVar, aVar, nVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b(bVar, aVar, nVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, boolValueOf, o0VarE);
            a(aVar2, o0VarE, (i15 >> 9) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d(bVar, nVar, aVar, aVar2, i14, 25);
        }
    }

    public static final void c(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(2108959467);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            n0.a aVarA = p0.a(p0.c("pulse", o0VarE, 0), 0.0f, 1.0f, s1.l.a(s1.l.d(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 0, d0.f155530a, 2), y0.Reverse, 4), "animating", o0VarE, 29112, 0);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r rVarG = c2.l.g(x2.f(h4.r.S, 1.0f), 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            v.a(c2.l.A(rVarG, 0.0f, j92.b.f97899b.f97920e, 1), gVar, false, z3.f.c(-1262596927, new d70.e(80, aVarA, 3), o0VarE), o0VarE, 3120, 4);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s70.v(i14, 8);
        }
    }
}
