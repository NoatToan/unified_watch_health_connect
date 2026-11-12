package w70;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.l;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.g3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import g02.s0;
import gl1.y;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import l72.c1;
import l72.f0;
import l72.i3;
import o13.r;
import o53.b0;
import o70.d0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import r53.e2;
import r53.o2;
import r53.s;
import r70.z;
import s5.x0;
import s70.r1;
import u1.a2;
import u1.w;
import ug2.k;
import v13.i;
import vb.h;
import w51.j;
import w51.n0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.settings.HomeSettingsScreenKt$BottomButton$2$1$1", f = "HomeSettingsScreen.kt", l = {430}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f183468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f183468b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f183468b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183467a;
            if (i14 == 0) {
                r.b(obj);
                this.f183467a = 1;
                if (this.f183468b.b(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.settings.HomeSettingsScreenKt$HomeSettings$1$1", f = "HomeSettingsScreen.kt", l = {156}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f183470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f183471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f183472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f183473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f183474f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfw/p;", "status", "", "<anonymous>", "(Lfw/p;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.settings.HomeSettingsScreenKt$HomeSettings$1$1$1", f = "HomeSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<fw.p, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f183475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f183476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f183477c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f183478d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f183479e;

            /* JADX INFO: renamed from: w70.e$b$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C3397a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f183480a;

                static {
                    int[] iArr = new int[fw.p.values().length];
                    try {
                        iArr[fw.p.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f183480a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e23.a<Unit> aVar, Context context, e23.a<Unit> aVar2, p1<Boolean> p1Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f183476b = aVar;
                this.f183477c = context;
                this.f183478d = aVar2;
                this.f183479e = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f183476b, this.f183477c, this.f183478d, this.f183479e, dVar);
                aVar.f183475a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(fw.p pVar, t13.d<? super Unit> dVar) {
                return ((a) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                fw.p pVar = (fw.p) this.f183475a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f183479e.setValue(Boolean.FALSE);
                if (C3397a.f183480a[pVar.ordinal()] == 1) {
                    this.f183476b.invoke();
                } else {
                    Toast.makeText(this.f183477c, R.string.txt_error_occurred, 0).show();
                    this.f183478d.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, e23.a<Unit> aVar, Context context, e23.a<Unit> aVar2, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f183470b = gVar;
            this.f183471c = aVar;
            this.f183472d = context;
            this.f183473e = aVar2;
            this.f183474f = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f183470b, this.f183471c, this.f183472d, this.f183473e, this.f183474f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183469a;
            if (i14 == 0) {
                r.b(obj);
                e2 e2Var = this.f183470b.f183495h;
                a aVar2 = new a(this.f183471c, this.f183472d, this.f183473e, this.f183474f, null);
                this.f183469a = 1;
                if (s.k(e2Var, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.settings.HomeSettingsScreenKt$HomeSettings$2$1", f = "HomeSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f183481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f183482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a<Unit> aVar, p1<Boolean> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f183481a = aVar;
            this.f183482b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f183481a, this.f183482b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f183482b.getF182175a().booleanValue()) {
                this.f183481a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.settings.HomeSettingsScreenKt$HomeSettings$3$1", f = "HomeSettingsScreen.kt", l = {175}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p1 f183483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f183484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n70.g f183485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f183486d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n70.g gVar, p1<Boolean> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f183485c = gVar;
            this.f183486d = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f183485c, this.f183486d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p1<Boolean> p1Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183484b;
            if (i14 == 0) {
                r.b(obj);
                p1<Boolean> p1Var2 = this.f183486d;
                this.f183483a = p1Var2;
                this.f183484b = 1;
                Object objD = this.f183485c.d(this);
                if (objD == aVar) {
                    return aVar;
                }
                p1Var = p1Var2;
                obj = objD;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p1Var = this.f183483a;
                r.b(obj);
            }
            Boolean bool = (Boolean) obj;
            bool.getClass();
            p1Var.setValue(bool);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x017a  */
    public static final void a(boolean z14, boolean z15, b0 b0Var, mc mcVar, g gVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        int i15;
        Object obj;
        o0 o0Var;
        boolean z16;
        o0 o0VarE = mVar.E(-447211632);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(b0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            obj = mcVar;
            i15 |= o0VarE.B(obj) ? 2048 : 1024;
        } else {
            obj = mcVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(gVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 1048576 : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            m.a aVar3 = m.f135153a;
            if (z14) {
                o0VarE.C(107117162);
                f0 f0Var = f0.f110999a;
                h4.r.a aVar4 = h4.r.S;
                h4.r rVarF = x2.f(aVar4, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarY = l.y(rVarF, eVar.f97920e);
                String strQ = y.Q(o0VarE, R.string.lbl_finish);
                boolean z17 = (i15 & 3670016) == 1048576;
                Object objQ = o0VarE.q();
                if (z17) {
                    objQ = new j(aVar2, 9);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new j(aVar2, 9);
                        o0VarE.K(objQ);
                    }
                }
                f0Var.d(0, 9, (e23.a) objQ, rVarY, strQ, o0VarE, null, false);
                o0Var = o0VarE;
                bVar.getClass();
                l.f(l.y(aVar4, eVar.f97920e), o0Var);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                if (z15) {
                    o0Var.C(107486589);
                    p1 p1VarB = s9.c.b(gVar.f183498k, Boolean.FALSE, o0Var, 48);
                    String strQ2 = y.Q(o0Var, R.string.lbl_reset_home);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, o0Var);
                    long jE = hb.a.e(o0Var);
                    h4.r.a aVar5 = h4.r.S;
                    boolean zB = ((i15 & 7168) == 2048) | o0Var.B(p1VarB) | ((i15 & 458752) == 131072) | o0Var.r(b0Var);
                    Object objQ2 = o0Var.q();
                    if (zB) {
                        z16 = false;
                        k kVar = new k(aVar, b0Var, p1VarB, obj, 11);
                        o0Var.K(kVar);
                        objQ2 = kVar;
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            z16 = false;
                            k kVar2 = new k(aVar, b0Var, p1VarB, obj, 11);
                            o0Var.K(kVar2);
                            objQ2 = kVar2;
                        } else {
                            z16 = false;
                        }
                    }
                    h4.r rVarF2 = x2.f(w.d(aVar5, false, null, null, (e23.a) objQ2, 15), 1.0f);
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarA = l.A(rVarF2, 0.0f, eVar2.f97920e, 1);
                    d6.h.f57752b.getClass();
                    mh.c(strQ2, rVarA, jE, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 130040);
                    o0Var = o0Var;
                    bVar2.getClass();
                    l.f(l.y(aVar5, eVar2.f97920e), o0Var);
                    o0Var.g0(z16);
                } else {
                    o0Var.C(108337074);
                    o0Var.g0(false);
                }
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.c(z14, z15, b0Var, mcVar, gVar, aVar, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    public static final void b(e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(990106711);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.lbl_one_section_required);
            String strQ2 = y.Q(o0VarE, R.string.msg_one_section_required);
            String strQ3 = y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new j(aVar, 10);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j(aVar, 10);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar3 = (e23.a) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new w11.b(29);
                o0VarE.K(objQ2);
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 6, 6, 728);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(aVar, i14, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final z zVar, final g gVar, final boolean z14, final List list, final List list2, final boolean z15, final boolean z16, final boolean z17, final e23.l lVar, final p pVar, final e23.a aVar, final e23.a aVar2, m mVar, final int i14) throws Throwable {
        boolean z18;
        Throwable th3;
        b0 b0Var;
        float f14;
        LinkedHashMap linkedHashMap;
        char c14;
        float f15;
        Boolean bool;
        int i15;
        char c15;
        boolean z19;
        o0 o0VarE = mVar.E(-448155888);
        int i16 = i14 | (o0VarE.r(zVar) ? 4 : 2) | (o0VarE.r(gVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.r(list2) ? 16384 : 8192) | (o0VarE.h(z15) ? 131072 : 65536) | (o0VarE.h(z16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.h(z17) ? 8388608 : 4194304) | (o0VarE.r(lVar) ? 67108864 : 33554432) | (o0VarE.r(pVar) ? 536870912 : 268435456);
        int i17 = (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            x1 x1Var = n.f135158a;
            boolean zA = j70.z.a(list);
            w13.c cVar = o70.f.f129975k0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : cVar) {
                if (((o70.f) obj).f129990b) {
                    arrayList.add(obj);
                }
            }
            int iA = t0.a(p13.y.r(arrayList, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
            for (Object obj2 : arrayList) {
                linkedHashMap2.put(obj2, Boolean.valueOf(list2 != null && list2.contains((o70.f) obj2)));
            }
            p1 p1VarC = s9.c.c(zVar.f151126j, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var2 = (b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            if (mcVarF.e()) {
                o0VarE.C(2042187348);
                b0Var = b0Var2;
                z18 = true;
                th3 = null;
                r1.b(b0Var, zVar, mcVarF, aVar, null, o0VarE, ((i16 << 3) & 112) | ((i17 << 9) & 7168));
                o0VarE.g0(false);
            } else {
                z18 = true;
                th3 = null;
                b0Var = b0Var2;
                o0VarE.C(2042400690);
                o0VarE.g0(false);
            }
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f16 = eVar.f97920e;
            float f17 = eVar.f97920e;
            float f18 = eVar.f97918c;
            h4.r rVarB = a2.b(l.C(rVarF, 0.0f, f16, 0.0f, 0.0f, 13), a2.a(o0VarE), z18);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            b0 b0Var3 = b0Var;
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, o0VarE, 48);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            bVar.getClass();
            h4.r rVarC2 = l.C(aVar3, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
            String strQ = y.Q(o0VarE, R.string.msg_home_settings_header_info);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            bVar.getClass();
            l.f(l.y(aVar3, f18), o0VarE);
            if (((Boolean) p1VarC.getF182175a()).booleanValue()) {
                o0VarE.C(664620605);
                String strQ2 = y.Q(o0VarE, R.string.lbl_essentials);
                o70.f fVar = o70.f.ESSENTIALS_STATS;
                boolean z24 = (i16 & 1879048192) == 536870912;
                Object objQ2 = o0VarE.q();
                if (z24 || objQ2 == c2565a) {
                    objQ2 = new uj1.y(pVar, 2);
                    o0VarE.K(objQ2);
                }
                p pVar2 = (p) objQ2;
                f14 = f18;
                linkedHashMap = linkedHashMap2;
                g(strQ2, fVar, linkedHashMap, pVar2, o0VarE, 48);
                if (p005kotlin.jvm.internal.s.g(linkedHashMap.get(fVar), Boolean.TRUE)) {
                    o0VarE.C(664971680);
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ3 = y.Q(o0VarE, R.string.lbl_edit_essentials);
                    boolean z25 = (i16 & 234881024) == 67108864;
                    Object objQ3 = o0VarE.q();
                    if (z25 || objQ3 == c2565a) {
                        objQ3 = new ub0.h(lVar, 13);
                        o0VarE.K(objQ3);
                    }
                    p2Var.g(strQ3, null, null, null, null, false, false, (e23.a) objQ3, o0VarE, 0, 254);
                    z19 = false;
                    f(y.Q(o0VarE, R.string.msg_home_settings_essentials_footer_info), o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    z19 = false;
                    o0VarE.C(665256136);
                    o0VarE.g0(false);
                }
                bVar.getClass();
                l.f(l.y(aVar3, f14), o0VarE);
                o0VarE.g0(z19);
            } else {
                f14 = f18;
                linkedHashMap = r16;
                o0VarE.C(665338472);
                o0VarE.g0(false);
            }
            String strQ4 = y.Q(o0VarE, R.string.lbl_in_focus);
            float f19 = f14;
            o70.f fVar2 = o70.f.KEY_STATS;
            int i18 = i16 & 1879048192;
            boolean z26 = i18 == 536870912;
            Object objQ4 = o0VarE.q();
            if (z26 || objQ4 == c2565a) {
                objQ4 = new uj1.y(pVar, 5);
                o0VarE.K(objQ4);
            }
            g(strQ4, fVar2, linkedHashMap, (p) objQ4, o0VarE, 48);
            Object obj3 = linkedHashMap.get(fVar2);
            Boolean bool2 = Boolean.TRUE;
            if (p005kotlin.jvm.internal.s.g(obj3, bool2)) {
                o0VarE.C(665677519);
                l72.p2 p2Var2 = l72.p2.f111205a;
                String strQ5 = y.Q(o0VarE, R.string.title_edit_in_focus);
                boolean z27 = (i16 & 234881024) == 67108864;
                Object objQ5 = o0VarE.q();
                if (z27 || objQ5 == c2565a) {
                    c14 = 14;
                    objQ5 = new ub0.h(lVar, 14);
                    o0VarE.K(objQ5);
                } else {
                    c14 = 14;
                }
                p2Var2.g(strQ5, null, null, null, null, false, false, (e23.a) objQ5, o0VarE, 0, 254);
                f(y.Q(o0VarE, R.string.msg_home_settings_in_focus_footer_info), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                c14 = 14;
                o0VarE.C(665947560);
                o0VarE.g0(false);
            }
            bVar.getClass();
            l.f(l.y(aVar3, f19), o0VarE);
            if (z15) {
                o0VarE.C(666067344);
                String strQ6 = y.Q(o0VarE, R.string.lbl_sleep_coach);
                o70.f fVar3 = o70.f.SLEEP_COACH;
                boolean z28 = i18 == 536870912;
                Object objQ6 = o0VarE.q();
                if (z28 || objQ6 == c2565a) {
                    objQ6 = new uj1.y(pVar, 6);
                    o0VarE.K(objQ6);
                }
                bool = bool2;
                f15 = f19;
                g(strQ6, fVar3, linkedHashMap, (p) objQ6, o0VarE, 48);
                f(y.Q(o0VarE, R.string.lbl_turn_on_receive_sleep_coach_guidance), o0VarE, 0);
                bVar.getClass();
                l.f(l.y(aVar3, f15), o0VarE);
                o0VarE.g0(false);
            } else {
                f15 = f19;
                bool = bool2;
                o0VarE.C(666520936);
                o0VarE.g0(false);
            }
            String strQ7 = y.Q(o0VarE, R.string.lbl_at_a_glance);
            o70.f fVar4 = o70.f.SECONDARY_STATS;
            boolean z29 = i18 == 536870912;
            Object objQ7 = o0VarE.q();
            if (z29 || objQ7 == c2565a) {
                objQ7 = new uj1.y(pVar, 7);
                o0VarE.K(objQ7);
            }
            g(strQ7, fVar4, linkedHashMap, (p) objQ7, o0VarE, 48);
            if (p005kotlin.jvm.internal.s.g(linkedHashMap.get(fVar4), bool)) {
                o0VarE.C(666875266);
                l72.p2 p2Var3 = l72.p2.f111205a;
                String strQ8 = y.Q(o0VarE, R.string.title_edit_at_a_glance);
                boolean z34 = (i16 & 234881024) == 67108864;
                Object objQ8 = o0VarE.q();
                if (z34 || objQ8 == c2565a) {
                    objQ8 = new ub0.h(lVar, 15);
                    o0VarE.K(objQ8);
                }
                p2Var3.g(strQ8, null, null, null, null, false, false, (e23.a) objQ8, o0VarE, 0, 254);
                f(y.Q(o0VarE, R.string.msg_home_settings_at_a_glance_footer_info), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(667157800);
                o0VarE.g0(false);
            }
            bVar.getClass();
            l.f(l.y(aVar3, f15), o0VarE);
            String strQ9 = y.Q(o0VarE, R.string.lbl_events);
            float f22 = f15;
            o70.f fVar5 = o70.f.EVENTS;
            boolean z35 = i18 == 536870912;
            Object objQ9 = o0VarE.q();
            if (z35 || objQ9 == c2565a) {
                objQ9 = new uj1.y(pVar, 8);
                o0VarE.K(objQ9);
            }
            g(strQ9, fVar5, linkedHashMap, (p) objQ9, o0VarE, 48);
            if (z16) {
                o0VarE.C(667530358);
                String strQ10 = y.Q(o0VarE, R.string.atp_lbl_plans_section_title);
                o70.f fVar6 = o70.f.TRAINING;
                boolean z36 = i18 == 536870912;
                Object objQ10 = o0VarE.q();
                if (z36 || objQ10 == c2565a) {
                    c15 = '\t';
                    objQ10 = new uj1.y(pVar, 9);
                    o0VarE.K(objQ10);
                } else {
                    c15 = '\t';
                }
                g(strQ10, fVar6, linkedHashMap, (p) objQ10, o0VarE, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(667824424);
                o0VarE.g0(false);
            }
            String strQ11 = y.Q(o0VarE, R.string.concept_challenges);
            o70.f fVar7 = o70.f.CHALLENGES;
            boolean z37 = i18 == 536870912;
            Object objQ11 = o0VarE.q();
            if (z37 || objQ11 == c2565a) {
                objQ11 = new uj1.y(pVar, 10);
                o0VarE.K(objQ11);
            }
            g(strQ11, fVar7, linkedHashMap, (p) objQ11, o0VarE, 48);
            bVar.getClass();
            l.f(l.y(aVar3, f22), o0VarE);
            String strQ12 = y.Q(o0VarE, R.string.social_elapsed_time_yesterday);
            o70.f fVar8 = o70.f.YESTERDAY;
            boolean z38 = i18 == 536870912;
            Object objQ12 = o0VarE.q();
            if (z38 || objQ12 == c2565a) {
                objQ12 = new uj1.y(pVar, 3);
                o0VarE.K(objQ12);
            }
            g(strQ12, fVar8, linkedHashMap, (p) objQ12, o0VarE, 48);
            String strQ13 = y.Q(o0VarE, R.string.lbl_last_7_days);
            o70.f fVar9 = o70.f.LAST_SEVEN_DAYS;
            boolean z39 = i18 == 536870912;
            Object objQ13 = o0VarE.q();
            if (z39 || objQ13 == c2565a) {
                objQ13 = new uj1.y(pVar, 4);
                o0VarE.K(objQ13);
            }
            g(strQ13, fVar9, linkedHashMap, (p) objQ13, o0VarE, 48);
            f(y.Q(o0VarE, R.string.msg_view_historic_reports_data), o0VarE, 0);
            bVar.getClass();
            l.f(x2.h(aVar3, r46), o0VarE);
            if (z17) {
                o0VarE.C(668914849);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                l72.p2 p2Var4 = l72.p2.f111205a;
                String strQ14 = y.Q(o0VarE, R.string.gc_plus_settings);
                boolean zR = o0VarE.r(gVar) | o0VarE.r(context);
                Object objQ14 = o0VarE.q();
                if (zR || objQ14 == c2565a) {
                    objQ14 = new vv0.n(16, gVar, context);
                    o0VarE.K(objQ14);
                }
                p2Var4.g(strQ14, null, null, null, null, false, false, (e23.a) objQ14, o0VarE, 0, 254);
                bVar.getClass();
                l.f(x2.h(aVar3, f17), o0VarE);
                i15 = 0;
                o0VarE.g0(false);
            } else {
                i15 = 0;
                o0VarE.C(669413608);
                o0VarE.g0(false);
            }
            boolean zR2 = o0VarE.r(gVar);
            Object objQ15 = o0VarE.q();
            if (zR2 || objQ15 == c2565a) {
                objQ15 = new w70.a(gVar, i15);
                o0VarE.K(objQ15);
            }
            a(z14, zA, b0Var3, mcVarF, gVar, aVar2, (e23.a) objQ15, o0VarE, ((i16 >> 6) & 14) | (57344 & (i16 << 9)) | ((i17 << 12) & 458752));
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(gVar, z14, list, list2, z15, z16, z17, lVar, pVar, aVar, aVar2, i14) { // from class: w70.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f183435b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f183436c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ List f183437d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f183438e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f183439f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f183440g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f183441h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ e23.l f183442i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ p f183443j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.a f183444k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ e23.a f183445l;

                @Override // e23.p
                public final Object invoke(Object obj4, Object obj5) throws Throwable {
                    ((Integer) obj5).getClass();
                    e.c(this.f183434a, this.f183435b, this.f183436c, this.f183437d, this.f183438e, this.f183439f, this.f183440g, this.f183441h, this.f183442i, this.f183443j, this.f183444k, this.f183445l, (m) obj4, p0.t(1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final n70.g gVar, final z zVar, final g gVar2, final boolean z14, final e23.l<? super DashboardRoute, Unit> lVar, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, m mVar, final int i14) {
        o0 o0Var;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        int i15;
        m.a.C2565a c2565a;
        e23.a<Unit> aVar4;
        p1 p1Var;
        boolean z15;
        o0 o0VarE = mVar.E(-1915240918);
        int i16 = i14 | (o0VarE.B(gVar) ? 4 : 2) | (o0VarE.r(zVar) ? 32 : 16) | (o0VarE.r(gVar2) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar3) ? 8388608 : 4194304);
        boolean z16 = true;
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            final p1 p1Var5 = (p1) objQ4;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int i17 = i16 & 3670016;
            boolean z17 = i17 == 1048576;
            Object objQ5 = o0VarE.q();
            if (z17 || objQ5 == c2565a2) {
                objQ5 = new w52.p1(aVar2, p1Var4, 2);
                o0VarE.K(objQ5);
            }
            final e23.a aVar5 = (e23.a) objQ5;
            Unit unit = Unit.INSTANCE;
            int i18 = i16 & 458752;
            boolean zR = (i17 == 1048576) | o0VarE.r(gVar2) | o0VarE.r(context) | (i18 == 131072);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == c2565a2) {
                i15 = i18;
                c2565a = c2565a2;
                b bVar = new b(gVar2, aVar2, context, aVar, p1Var2, null);
                aVar4 = aVar;
                p1Var = p1Var2;
                o0VarE.K(bVar);
                objQ6 = bVar;
            } else {
                c2565a = c2565a2;
                i15 = i18;
                aVar4 = aVar;
                p1Var = p1Var2;
            }
            l0.e((p) objQ6, r23, o0VarE);
            Boolean bool = (Boolean) p1Var3.getF182175a();
            bool.getClass();
            boolean z18 = i15 == 131072;
            Object objQ7 = o0VarE.q();
            if (z18 || objQ7 == c2565a) {
                objQ7 = new c(aVar4, p1Var3, null);
                o0VarE.K(objQ7);
            }
            l0.e((p) objQ7, bool, o0VarE);
            boolean z19 = (i16 & 14) == 4;
            Object objQ8 = o0VarE.q();
            if (z19 || objQ8 == c2565a) {
                objQ8 = new d(gVar, r20, null);
                o0VarE.K(objQ8);
            }
            l0.e((p) objQ8, unit, o0VarE);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR2 = o0VarE.r(gVar2);
            Object objQ9 = o0VarE.q();
            if (zR2 || objQ9 == c2565a) {
                k kVar = new k(gVar2, p1Var4, p1Var, p1Var3, 10);
                o0VarE.K(kVar);
                objQ9 = kVar;
            }
            c.w.a(0, 0, (e23.a) objQ9, o0VarE, zBooleanValue);
            az0.c.a aVar6 = (az0.c.a) s9.c.b(zVar.f151118b.a(), null, o0VarE, 48).getF182175a();
            if (aVar6 != null) {
                o0VarE.C(1700474566);
                if (aVar6 == az0.c.a.Available) {
                    final p1 p1VarB = s9.c.b((o2) zVar.f151134r.getValue(), g3.a.c(g3.f35298f), o0VarE, g3.f35299g << 3);
                    final p1 p1VarB2 = s9.c.b(gVar2.f183499l, null, o0VarE, 48);
                    r53.p2 p2Var = gVar2.f183493f;
                    Boolean bool2 = Boolean.FALSE;
                    final p1 p1VarB3 = s9.c.b(p2Var, bool2, o0VarE, 48);
                    p1 p1VarB4 = s9.c.b(gVar2.f183491d, bool2, o0VarE, 48);
                    if (((g3) p1VarB.getF182175a()).f35300a == fw.p.LOADING || ((Boolean) p1VarB4.getF182175a()).booleanValue()) {
                        z15 = false;
                    } else {
                        z16 = false;
                        z15 = false;
                    }
                    final boolean z24 = z16;
                    o0Var = o0VarE;
                    s0.a(null, z24, z3.f.c(999234647, new p() { // from class: w70.d
                        /* JADX WARN: Code duplicated, block: B:18:0x0075  */
                        /* JADX WARN: Code duplicated, block: B:25:0x00be  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) throws Throwable {
                            m mVar2 = (m) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                                x1 x1Var2 = n.f135158a;
                                if (z24) {
                                    mVar2.C(-217788245);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-218894356);
                                    d0 d0Var = (d0) ((g3) p1VarB.getF182175a()).f35301b;
                                    List<j70.y> list = d0Var != null ? d0Var.f129950b : null;
                                    n70.g gVar3 = gVar;
                                    boolean zE = gVar3.E();
                                    boolean zG = gVar3.g();
                                    boolean zBooleanValue2 = ((Boolean) p1Var5.getF182175a()).booleanValue();
                                    x3 x3Var = p1VarB2;
                                    List list2 = (List) x3Var.getF182175a();
                                    g gVar4 = gVar2;
                                    boolean zR3 = mVar2.r(gVar4) | mVar2.B(x3Var);
                                    Object objQ10 = mVar2.q();
                                    m.a aVar7 = m.f135153a;
                                    if (zR3) {
                                        objQ10 = new vq0.a(27, gVar4, x3Var);
                                        mVar2.K(objQ10);
                                    } else {
                                        aVar7.getClass();
                                        if (objQ10 == m.a.f135155b) {
                                            objQ10 = new vq0.a(27, gVar4, x3Var);
                                            mVar2.K(objQ10);
                                        }
                                    }
                                    e.c(zVar, gVar4, z14, list, list2, zE, zG, zBooleanValue2, lVar, (p) objQ10, aVar5, aVar3, mVar2, 0);
                                    if (((Boolean) p1VarB3.getF182175a()).booleanValue()) {
                                        mVar2.C(-217896311);
                                        boolean zR4 = mVar2.r(gVar4);
                                        Object objQ11 = mVar2.q();
                                        if (zR4) {
                                            objQ11 = new a(gVar4, 1);
                                            mVar2.K(objQ11);
                                        } else {
                                            aVar7.getClass();
                                            if (objQ11 == m.a.f135155b) {
                                                objQ11 = new a(gVar4, 1);
                                                mVar2.K(objQ11);
                                            }
                                        }
                                        e.b((e23.a) objQ11, mVar2, 0);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(-217802133);
                                        mVar2.f();
                                    }
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0Var, 384, 1);
                    o0Var.g0(z15);
                } else {
                    o0VarE.g0(false);
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i19 = 0;
                    pVar = new p(gVar, zVar, gVar2, z14, lVar, aVar, aVar2, aVar3, i14, i19) { // from class: w70.c

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f183446a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ n70.g f183447b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ z f183448c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ g f183449d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ boolean f183450e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ e23.l f183451f;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ e23.a f183452g;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ e23.a f183453h;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ e23.a f183454i;

                        {
                            this.f183446a = i19;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f183446a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iT = p0.t(1);
                                    e.d(this.f183447b, this.f183448c, this.f183449d, this.f183450e, this.f183451f, this.f183452g, this.f183453h, this.f183454i, (m) obj, iT);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iT2 = p0.t(1);
                                    e.d(this.f183447b, this.f183448c, this.f183449d, this.f183450e, this.f183451f, this.f183452g, this.f183453h, this.f183454i, (m) obj, iT2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                }
                p2VarI0.f135219d = pVar;
            }
            o0VarE.C(1700474565);
            o0VarE.g0(false);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i24 = 1;
            pVar = new p(gVar, zVar, gVar2, z14, lVar, aVar, aVar2, aVar3, i14, i24) { // from class: w70.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f183446a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n70.g f183447b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z f183448c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ g f183449d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f183450e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.l f183451f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f183452g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.a f183453h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ e23.a f183454i;

                {
                    this.f183446a = i24;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f183446a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            e.d(this.f183447b, this.f183448c, this.f183449d, this.f183450e, this.f183451f, this.f183452g, this.f183453h, this.f183454i, (m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            e.d(this.f183447b, this.f183448c, this.f183449d, this.f183450e, this.f183451f, this.f183452g, this.f183453h, this.f183454i, (m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0190  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(n70.g gVar, z zVar, g gVar2, boolean z14, e23.l lVar, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0Var;
        g gVar3;
        g gVar4;
        int i15;
        gVar.getClass();
        zVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(128131026);
        int i16 = i14 | (o0VarE.B(gVar) ? 4 : 2) | (o0VarE.r(zVar) ? 32 : 16) | 128 | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                gVar4 = (g) u1VarResolveViewModel;
                i15 = i16 & (-897);
            } else {
                o0VarE.e();
                i15 = i16 & (-897);
                gVar4 = gVar2;
            }
            int i17 = i15;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            boolean z15 = (i17 & 57344) == 16384;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z15) {
                objQ = new ub0.h(lVar, 16);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ub0.h(lVar, 16);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            d0 d0Var = (d0) ((g3) s9.c.b((o2) zVar.f151134r.getValue(), g3.a.c(g3.f35298f), o0VarE, g3.f35299g << 3).getF182175a()).f35301b;
            boolean zA = j70.z.a(d0Var != null ? d0Var.f129950b : null);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(zVar);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new f(zVar, null);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new f(zVar, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((p) objQ2, unit, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_home_settings);
            i3 i3Var = new i3("MenuHelp", y.Q(o0VarE, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null);
            boolean zH = o0VarE.h(zA) | ((i17 & 14) == 4) | o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zH) {
                objQ3 = new w52.a(context, zA, gVar);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new w52.a(context, zA, gVar);
                    o0VarE.K(objQ3);
                }
            }
            o0Var = o0VarE;
            og.a.k(strQ, i3Var, false, null, aVar, (e23.l) objQ3, z3.f.c(-1195706323, new g82.d(gVar, zVar, gVar4, z14, lVar, aVar, aVar2, aVar4), o0VarE), o0Var, ((i17 >> 3) & 57344) | 1573312, 8);
            gVar3 = gVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            gVar3 = gVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(gVar, zVar, gVar3, z14, lVar, aVar, aVar2, i14);
        }
    }

    public static final void f(String str, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-624960189);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = l.z(rVarF, f14, eVar.f97917b);
            d6.h.f57752b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, o0Var, i15 & 14, 0, 130044);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    public static final void g(String str, o70.f fVar, LinkedHashMap linkedHashMap, p pVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1091684884);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(linkedHashMap) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            boolean zG = p005kotlin.jvm.internal.s.g(linkedHashMap.get(fVar), Boolean.TRUE);
            l72.p2 p2Var = l72.p2.f111205a;
            z3.e eVarC = z3.f.c(-1842050839, new rw0.g(zG, 15), o0VarE);
            boolean zH = o0VarE.h(zG) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zH) {
                objQ = new c.e(pVar, zG, fVar, 14);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c.e(pVar, zG, fVar, 14);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(str, null, null, null, eVarC, false, false, (e23.a) objQ, o0VarE, (i15 & 14) | 24576, 238);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(str, fVar, linkedHashMap, pVar, i14, 3);
        }
    }
}
