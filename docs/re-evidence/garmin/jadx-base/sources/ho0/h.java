package ho0;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f2.o;
import gl1.y;
import i3.a1;
import i3.mc;
import i3.pc;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p1.z;
import p13.x;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lho0/h;", "Lh82/c;", "<init>", "()V", "a", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends h82.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f84713l = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yb0.a f84714f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f84716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84717i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f84715g = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f84718j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f84719k = "";

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateHelpScreen$SetupAbnormalHRScreen$2$1$1$1$1", f = "HeartRateHelpScreen.kt", l = {173}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f84721b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a1 a1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f84721b = a1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f84721b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84720a;
            if (i14 == 0) {
                r.b(obj);
                mc mcVar = this.f84721b.f87409a;
                this.f84720a = 1;
                if (mcVar.b(this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f84722a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f84722a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f84722a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f84722a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(17485696);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        int i16 = 18;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            this.f84715g = bundle.getInt("ABOUT_YOUR_READING_INTRO_STRING_RES_ID", R.string.msg_your_average_heart_rate_for_day);
            this.f84716h = bundle.getInt("RESTING_HR", 0);
            this.f84717i = bundle.getInt("MAX_HEART_RATE", 0);
            String strQ = y.Q(o0VarE, R.string.no_value);
            int i17 = this.f84716h;
            this.f84718j = i17 > 0 ? String.valueOf(i17) : strQ;
            int i18 = this.f84717i;
            if (i18 > 0) {
                strQ = String.valueOf(i18);
            }
            this.f84719k = strQ;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            n0 n0Var = (n0) o0VarE.A(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            yb0.b bVar = new yb0.b(new do0.a());
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yb0.a aVar = (yb0.a) v9.b.a(s0.f105811a.b(yb0.a.class), viewModelStoreOwnerA, null, bVar, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            this.f84714f = aVar;
            y0<w61.f<sd2.f>> y0Var = aVar.f195678a;
            if (y0Var == null) {
                o0VarE.C(1226213228);
            } else {
                o0VarE.C(-376086731);
                boolean zR = o0VarE.r(this) | o0VarE.r(context);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new c(new a51.m(this, context));
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c(new a51.m(this, context));
                        o0VarE.K(objQ);
                    }
                }
                y0Var.f(n0Var, (z0) objQ);
            }
            o0VarE.g0(false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, bundle, i14, i16);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-1837957524, true, new d(this, 2)), 4, null), new h82.c.b("ABOUT_YOUR_READING_ACTION", context.getString(R.string.lbl_about_your_reading), null, new z3.e(2048986157, true, new d(this, 3)), 4, null), new h82.c.b("HOW_WE_MEASURE_HR_ACTION", context.getString(R.string.lbl_how_we_measure_heart_rate), null, new z3.e(1640962542, true, new d(this, 4)), 4, null), new h82.c.b("HOW_TO_USE_YOUR_READING_ACTION", context.getString(R.string.lbl_how_to_use_reading), null, new z3.e(1232938927, true, new d(this, 5)), 4, null), new h82.c.b("ABNORMAL_HR_ALERT_ACTION", context.getString(R.string.device_settings_abnormal_heart_rate), null, new z3.e(824915312, true, new d(this, 6)), 4, null));
    }

    public final void g(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-960452753);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            a1 a1VarD = i3.z0.d(i3.z0.e(pc.Hidden, o0VarE, 390, 2), null, o0VarE, 0, 2);
            q80.b bVar = q80.b.f143300a;
            yb0.a aVar = this.f84714f;
            z<sd2.f> zVar = aVar != null ? aVar.f195679b : null;
            boolean zR = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new g(this, i16);
                o0VarE.K(objQ2);
            }
            bVar.b(b0Var, a1VarD, zVar, (e23.l) objQ2, z3.f.c(-2112771920, new gw1.c(this, 6, b0Var, a1VarD), o0VarE), o0VarE, 24576);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ho0.c(this, i14, i16);
        }
    }

    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-682455371);
        int i15 = 2;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i17 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1794541630, new d(this, i17), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ho0.c(this, i14, i15);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1721660414);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            ho0.b.f84701a.getClass();
            h82.e.a(ho0.b.f84702b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ho0.c(this, i14, 3);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-754508297);
        int i15 = i14 & 1;
        int i16 = 0;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1819351484, new f((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b), i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ho0.c(this, i14, 4);
        }
    }

    public final void k(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1754267752);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(1138695676, new d(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ho0.c(this, i14, i17);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lho0/h$a;", "", "<init>", "()V", "", "URL_AMERICAN_HEART_ASSOCIATION", "Ljava/lang/String;", "ABOUT_YOUR_READING_ACTION", "HOW_WE_MEASURE_HR_ACTION", "HOW_TO_USE_YOUR_READING_ACTION", "ABNORMAL_HR_ALERT_ACTION", "ABOUT_YOUR_READING_INTRO_STRING_RES_ID", "RESTING_HEART_RATE", "MAX_HEART_RATE", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
