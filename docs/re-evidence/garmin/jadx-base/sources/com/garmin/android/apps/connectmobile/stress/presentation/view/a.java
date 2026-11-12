package com.garmin.android.apps.connectmobile.stress.presentation.view;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import i3.a1;
import i3.mc;
import i3.pc;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p1.z;
import p13.x;
import p3.l0;
import p3.m;
import p3.o0;
import p3.p2;
import p3.x1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import w61.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/stress/presentation/view/a;", "Lh82/c;", "<init>", "()V", "a", "gcm-stress_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h82.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0859a f45025j = new C0859a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yb0.a f45026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45029i = -1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.stress.presentation.view.StressHelpScreen$SetupRelaxRemindersScreen$2$1$1$1$1", f = "StressHelpScreen.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f45031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a1 a1Var, d<? super b> dVar) {
            super(2, dVar);
            this.f45031b = a1Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new b(this.f45031b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f45030a;
            if (i14 == 0) {
                r.b(obj);
                mc mcVar = this.f45031b.f87409a;
                this.f45030a = 1;
                if (mcVar.b(this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45032a;

        public c(l lVar) {
            lVar.getClass();
            this.f45032a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f45032a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45032a.invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    @Override // h82.c
    public final void a(Bundle bundle, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1158242255);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bundle) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            n0 n0Var = (n0) o0VarE.A(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            this.f45027g = bundle.getString("EXTRAS_AVERAGE_STRESS_VALUE", null);
            int i16 = bundle.getInt("EXTRAS_AVERAGE_STRESS_LEVEL", -1);
            this.f45029i = i16;
            if (i16 != -1) {
                o0VarE.C(572576005);
                this.f45028h = hb.a.i(y.Q(o0VarE, this.f45029i));
                o0VarE.g0(false);
            } else {
                o0VarE.C(572679793);
                o0VarE.g0(false);
            }
            yb0.b bVar = new yb0.b(new lr1.a());
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yb0.a aVar = (yb0.a) v9.b.a(s0.f105811a.b(yb0.a.class), viewModelStoreOwnerA, null, bVar, viewModelStoreOwnerA instanceof androidx.lifecycle.y ? ((androidx.lifecycle.y) viewModelStoreOwnerA).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c, o0VarE);
            this.f45026f = aVar;
            y0<f<sd2.f>> y0Var = aVar.f195678a;
            if (y0Var == null) {
                o0VarE.C(572837272);
            } else {
                o0VarE.C(-674258039);
                boolean zR = o0VarE.r(this) | o0VarE.r(context);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new c(new ot.c(17, context, this));
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new c(new ot.c(17, context, this));
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
            p2VarI0.f135219d = new sg0.m(this, bundle, i14, 27);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        return x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(21177629, true, new vr1.c(this, 2)), 4, null), new h82.c.b("ABOUT_STRESS_LEVEL", context.getString(R.string.lbl_about_stress_levels), null, new z3.e(30948190, true, new vr1.c(this, 3)), 4, null), new h82.c.b("HOW_TO_USE_YOUR_READINGS", context.getString(R.string.lbl_how_to_use_reading), null, new z3.e(40718751, true, new vr1.c(this, 4)), 4, null), new h82.c.b("STRESS_DATA_ACCURACY", context.getString(R.string.lbl_stress_data_accuracy), null, new z3.e(50489312, true, new vr1.c(this, 5)), 4, null), new h82.c.b("RELAX_REMINDERS", context.getString(R.string.device_settings_relax_reminders), null, new z3.e(60259873, true, new vr1.c(this, 6)), 4, null));
    }

    public final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(1687996335);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(690241340, new vr1.c(this, 7), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vr1.b(this, i14, 4);
        }
    }

    public final void h(m mVar, int i14) {
        o0 o0VarE = mVar.E(384522172);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            vr1.a.f179483a.getClass();
            h82.e.a(vr1.a.f179484b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vr1.b(this, i14, 3);
        }
    }

    public final void i(m mVar, int i14) {
        o0 o0VarE = mVar.E(1592726936);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(977154860, new vr1.c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vr1.b(this, i14, 2);
        }
    }

    public final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(-582506239);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            a1 a1VarD = i3.z0.d(i3.z0.e(pc.Hidden, o0VarE, 390, 2), null, o0VarE, 0, 2);
            q80.b bVar = q80.b.f143300a;
            yb0.a aVar = this.f45026f;
            z<sd2.f> zVar = aVar != null ? aVar.f195679b : null;
            boolean zR = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new uo1.a(this, 25);
                o0VarE.K(objQ2);
            }
            bVar.b(b0Var, a1VarD, zVar, (l) objQ2, z3.f.c(-1734825406, new tb0.h(this, 26, b0Var, a1VarD), o0VarE), o0VarE, 24576);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vr1.b(this, i14, 0);
        }
    }

    public final void k(m mVar, int i14) {
        o0 o0VarE = mVar.E(-569449797);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-1634292984, new vr1.c(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vr1.b(this, i14, 1);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.stress.presentation.view.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/stress/presentation/view/a$a;", "", "<init>", "()V", "", "EXTRAS_AVERAGE_STRESS_VALUE", "Ljava/lang/String;", "EXTRAS_AVERAGE_STRESS_LEVEL", "ABOUT_STRESS_LEVEL", "HOW_TO_USE_YOUR_READING", "STRESS_DATA_ACCURACY", "RELAX_REMINDERS", "FIRSTBEAT_URL", "gcm-stress_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0859a {
        public /* synthetic */ C0859a(j jVar) {
            this();
        }

        private C0859a() {
        }
    }
}
