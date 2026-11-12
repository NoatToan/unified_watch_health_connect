package com.garmin.android.apps.connectmobile.dashboard.presentation;

import androidx.lifecycle.u1;
import androidx.lifecycle.v;
import androidx.lifecycle.v1;
import c22.i2;
import c80.d0;
import c80.q0;
import c80.s0;
import c80.w0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import n70.a3;
import n70.b6;
import n70.c6;
import n70.d7;
import n70.f1;
import n70.f7;
import n70.g1;
import n70.h1;
import n70.i1;
import n70.j1;
import n70.x5;
import n70.y5;
import n70.z2;
import n70.z6;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.m0;
import o70.s;
import o70.x;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import pc0.c0;
import r53.b2;
import r53.c2;
import r53.k2;
import r53.l2;
import r53.m1;
import r53.m2;
import r53.o2;
import r53.p2;
import r53.q2;
import zd0.g0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/d;", "Landroidx/lifecycle/u1;", "Ln70/i1;", "getDashboardScreenStateUseCase", "Ln70/c6;", "getToolbarDataUseCase", "Ln70/h1;", "getDashboardQuickActionsUseCase", "Ln70/x5;", "getSyncStateUseCase", "Ln70/h;", "dashboardRefreshNeededListenerUseCase", "Ln70/d;", "checkProductImprovementConsentUseCase", "Ln70/z6;", "grantProductImprovementConsentUseCase", "Ln70/f7;", "revokeProductImprovementConsentUseCase", "Ln70/b;", "checkPrivacyPolicyReconsentUseCase", "Lgf2/e;", "getActiveCampaignUseCase", "Ln70/d7;", "logAnalyticsUseCase", "Loo1/b;", "getCurrentUserProfileImageDataUseCase", "Lbu0/d;", "getLiveActivitySessionInfo", "Lze0/b;", "getFeedbackSnackbarMessageUseCase", "Lf12/l;", "gcmUserSettings", "Ly51/a;", "pendingActivityRepo", "<init>", "(Ln70/i1;Ln70/c6;Ln70/h1;Ln70/x5;Ln70/h;Ln70/d;Ln70/z6;Ln70/f7;Ln70/b;Lgf2/e;Ln70/d7;Loo1/b;Lbu0/d;Lze0/b;Lf12/l;Ly51/a;)V", JWKParameterNames.RSA_EXPONENT, "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {
    public static final /* synthetic */ int P = 0;
    public final b2 A;
    public boolean B;
    public final p2 C;
    public final b2 D;
    public final o2<no1.c> E;
    public final p2 F;
    public final b2 I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f33544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6 f33545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z6 f33546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f7 f33547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gf2.e f33548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d7 f33549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oo1.b f33550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ze0.b f33551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f12.l f33552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y51.a f33553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f33554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r53.i<Boolean> f33555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r53.i<Boolean> f33556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LocalDate f33557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f33558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f33559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2 f33560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b2 f33561r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f33562t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b2 f33563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b2 f33564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b2 f33565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b2 f33566y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b2 f33567z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo70/x;", "status", "", "<anonymous>", "(Lo70/x;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$1", f = "DashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<x, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f33568a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = d.this.new a(dVar);
            aVar.f33568a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(x xVar, t13.d<? super Unit> dVar) {
            return ((a) create(xVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            x xVar = (x) this.f33568a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z14 = xVar instanceof x.e;
            d dVar = d.this;
            if (z14) {
                x.e eVar = (x.e) xVar;
                if (eVar.f130114a) {
                    dVar.B = true;
                    d7 d7Var = dVar.f33549f;
                    if (!d7Var.f124155e) {
                        d7Var.f124155e = true;
                        i2 i2Var = d7Var.f124152b;
                        DateTime dateTimeNow = DateTime.now();
                        dateTimeNow.getClass();
                        i2Var.c(dateTimeNow);
                        a2 a2Var = a2.DASHBOARD;
                        String str = "startSync - " + DateTime.now();
                        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "LogAnalyticsUseCase", str);
                    }
                }
                if (dVar.B && !eVar.f130115b) {
                    dVar.B = false;
                    dVar.z4(s.SYNC_END, false);
                }
            } else if ((xVar instanceof x.a) && dVar.B) {
                dVar.B = false;
                dVar.z4(s.SYNC_END, false);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$2", f = "DashboardViewModel.kt", l = {269}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33570a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33570a;
            if (i14 == 0) {
                r.b(obj);
                e53.c.a aVar2 = e53.c.f63094b;
                long jF = e53.e.f(1000L, e53.f.MILLISECONDS);
                this.f33570a = 1;
                if (m0.c(jF, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            s sVar = s.EXTERNAL_EVENT;
            int i15 = d.P;
            d.this.z4(sVar, false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lno1/c;", "it", "", "<anonymous>", "(Lno1/c;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$3", f = "DashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<no1.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f33572a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = d.this.new c(dVar);
            cVar.f33572a = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(no1.c cVar, t13.d<? super Unit> dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            no1.c cVar = (no1.c) this.f33572a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (cVar != null) {
                d.this.f33550g.b();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.presentation.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$4", f = "DashboardViewModel.kt", l = {279}, m = "invokeSuspend", v = 2)
    public static final class C0550d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33574a;

        public C0550d(t13.d<? super C0550d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C0550d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0550d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33574a;
            d dVar = d.this;
            if (i14 == 0) {
                r.b(obj);
                y51.a aVar2 = dVar.f33553j;
                this.f33574a = 1;
                obj = aVar2.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                dVar.f33558o.setValue(((v2.b) v2Var).f47386a);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                dVar.f33558o.setValue(j0.f134944a);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33576a;

        static {
            int[] iArr = new int[androidx.lifecycle.b0.a.values().length];
            try {
                iArr[androidx.lifecycle.b0.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f33576a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Ln70/z2$b;", "devices", "", "isRecording", "Lo13/p;", "<anonymous>", "(Ljava/util/List;Z)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$dashboardQuickActions$1", f = "DashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements q<List<? extends z2.b>, Boolean, t13.d<? super o13.p<? extends List<? extends z2.b>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ List f33577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ boolean f33578b;

        public g(t13.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(List<? extends z2.b> list, Boolean bool, t13.d<? super o13.p<? extends List<? extends z2.b>, ? extends Boolean>> dVar) {
            boolean zBooleanValue = bool.booleanValue();
            g gVar = new g(dVar);
            gVar.f33577a = list;
            gVar.f33578b = zBooleanValue;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List list = this.f33577a;
            boolean z14 = this.f33578b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return new o13.p(list, Boolean.valueOf(z14));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$logUserActionAnalytics$1", f = "DashboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33580b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f33579a = str;
            this.f33580b = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f33579a, this.f33580b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ht.s sVar = ht.s.f85508a;
            ArrayList arrayListM = p13.x.m(new zk.e("Screen", "Home"), new zk.e("Action", this.f33579a));
            String str = this.f33580b;
            if (str != null) {
                arrayListM.add(new zk.e("Type", str));
            }
            Unit unit = Unit.INSTANCE;
            zk.a aVar2 = new zk.a("UserAction", arrayListM, false, 0L, 12, null);
            sVar.getClass();
            ht.s.b(aVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$special$$inlined$flatMapLatest$1", f = "DashboardViewModel.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements q<r53.j<? super List<? extends o70.e>>, o13.p<? extends List<? extends z2.b>, ? extends Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ r53.j f33582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f33583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h1 f33584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(t13.d dVar, h1 h1Var) {
            super(3, dVar);
            this.f33584d = h1Var;
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super List<? extends o70.e>> jVar, o13.p<? extends List<? extends z2.b>, ? extends Boolean> pVar, t13.d<? super Unit> dVar) {
            i iVar = new i(dVar, this.f33584d);
            iVar.f33582b = jVar;
            iVar.f33583c = pVar;
            return iVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33581a;
            if (i14 == 0) {
                r.b(obj);
                r53.j jVar = this.f33582b;
                o13.p pVar = (o13.p) this.f33583c;
                List list = (List) pVar.f128594a;
                boolean zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
                boolean z14 = !list.isEmpty();
                h1 h1Var = this.f33584d;
                h1Var.getClass();
                c2 c2Var = new c2(new g1(zBooleanValue, z14, h1Var, null));
                this.f33582b = null;
                this.f33583c = null;
                this.f33581a = 1;
                if (r53.s.v(jVar, c2Var, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements r53.i<List<? extends z2.b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f33585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f33586b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f33587a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f33588b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.presentation.d$j$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$special$$inlined$map$1$2", f = "DashboardViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0551a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f33589a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f33590b;

                public C0551a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f33589a = obj;
                    this.f33590b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, d dVar) {
                this.f33587a = jVar;
                this.f33588b = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0551a c0551a;
                if (dVar instanceof C0551a) {
                    c0551a = (C0551a) dVar;
                    int i14 = c0551a.f33590b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0551a.f33590b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0551a = new C0551a(dVar);
                    }
                } else {
                    c0551a = new C0551a(dVar);
                }
                Object obj2 = c0551a.f33589a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0551a.f33590b;
                if (i15 == 0) {
                    r.b(obj2);
                    int i16 = d.P;
                    this.f33588b.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (T t7 : (List) obj) {
                        if (((z2.b) t7).f124816f) {
                            arrayList.add(t7);
                        }
                    }
                    c0551a.f33590b = 1;
                    if (this.f33587a.emit(arrayList, c0551a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public j(r53.i iVar, d dVar) {
            this.f33585a = iVar;
            this.f33586b = dVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super List<? extends z2.b>> jVar, t13.d dVar) {
            Object objCollect = this.f33585a.collect(new a(jVar, this.f33586b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f33592a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f33593a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.presentation.d$k$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$special$$inlined$map$2$2", f = "DashboardViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0552a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f33594a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f33595b;

                public C0552a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f33594a = obj;
                    this.f33595b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f33593a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0552a c0552a;
                if (dVar instanceof C0552a) {
                    c0552a = (C0552a) dVar;
                    int i14 = c0552a.f33595b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0552a.f33595b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0552a = new C0552a(dVar);
                    }
                } else {
                    c0552a = new C0552a(dVar);
                }
                Object obj2 = c0552a.f33594a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0552a.f33595b;
                if (i15 == 0) {
                    r.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((bu0.k) obj) instanceof bu0.k.a);
                    c0552a.f33595b = 1;
                    if (this.f33593a.emit(boolValueOf, c0552a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public k(r53.i iVar) {
            this.f33592a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f33592a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f33597a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f33598a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.dashboard.presentation.d$l$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardViewModel$special$$inlined$map$3$2", f = "DashboardViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0553a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f33599a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f33600b;

                public C0553a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f33599a = obj;
                    this.f33600b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f33598a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x0058  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C0553a c0553a;
                boolean z14;
                if (dVar instanceof C0553a) {
                    c0553a = (C0553a) dVar;
                    int i14 = c0553a.f33600b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0553a.f33600b = i14 - Integer.MIN_VALUE;
                    } else {
                        c0553a = new C0553a(dVar);
                    }
                } else {
                    c0553a = new C0553a(dVar);
                }
                Object obj2 = c0553a.f33599a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c0553a.f33600b;
                if (i15 == 0) {
                    r.b(obj2);
                    q0 q0Var = (q0) obj;
                    if (q0Var instanceof q0.a) {
                        q0.a aVar2 = (q0.a) q0Var;
                        if (aVar2.f25550a == s0.HOME && aVar2.f25552c) {
                            w0 w0Var = aVar2.f25551b;
                            d0 d0Var = w0Var instanceof d0 ? (d0) w0Var : null;
                            if ((d0Var != null ? d0Var.f25324b : null) == d0.b.ANNUAL_REPORT) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    c0553a.f33600b = 1;
                    if (this.f33598a.emit(boolValueOf, c0553a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public l(r53.i iVar) {
            this.f33597a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f33597a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new e(null);
    }

    public d(i1 i1Var, c6 c6Var, h1 h1Var, x5 x5Var, n70.h hVar, n70.d dVar, z6 z6Var, f7 f7Var, n70.b bVar, gf2.e eVar, d7 d7Var, oo1.b bVar2, bu0.d dVar2, ze0.b bVar3, f12.l lVar, y51.a aVar) {
        i1Var.getClass();
        c6Var.getClass();
        h1Var.getClass();
        x5Var.getClass();
        hVar.getClass();
        dVar.getClass();
        z6Var.getClass();
        f7Var.getClass();
        bVar.getClass();
        eVar.getClass();
        d7Var.getClass();
        bVar2.getClass();
        dVar2.getClass();
        bVar3.getClass();
        lVar.getClass();
        aVar.getClass();
        this.f33544a = i1Var;
        this.f33545b = c6Var;
        this.f33546c = z6Var;
        this.f33547d = f7Var;
        this.f33548e = eVar;
        this.f33549f = d7Var;
        this.f33550g = bVar2;
        this.f33551h = bVar3;
        this.f33552i = lVar;
        this.f33553j = aVar;
        t tVarB = m.b(new r70.t(this, 1));
        this.f33554k = tVarB;
        l70.c cVar = i1Var.f124276c.f124063a;
        this.f33555l = cVar.T2();
        this.f33556m = cVar.M1();
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        this.f33557n = localDateNow;
        j0 j0Var = j0.f134944a;
        p2 p2VarA = q2.a(j0Var);
        this.f33558o = p2VarA;
        r53.s.d(p2VarA);
        r53.f fVarI = r53.s.i(new j1(i1Var, new r70.t(this, 2), null));
        x53.c cVar2 = o53.s0.f129406a;
        r53.i iVarA = r53.s.A(fVarI, cVar2);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        l2 l2Var = k2.a.f150705b;
        this.f33559p = r53.s.K(iVarA, aVarA, l2Var, com.garmin.android.apps.connectmobile.dashboard.presentation.c.e.f33543a);
        this.f33560q = r53.s.K(r53.s.A(r53.s.l(c6Var.f124112a.b(), v.a(c6Var.f124113b.f124054a.a()), new c2(new y5(c6Var.f124114c, null)), new b6(null)), cVar2), v1.a(this), l2Var, null);
        z2 z2Var = (z2) tVarB.getValue();
        z2Var.f124804c.getClass();
        c0 c0VarJ = pc0.j.j();
        p2 p2VarB = ((ic0.a) z2Var.f124810i.getValue()).b();
        zd0.i iVar = z2Var.f124807f;
        int i14 = zd0.i.f204028a;
        iVar.getClass();
        b2 b2VarK = r53.s.K(r53.s.A(r53.s.l(c0VarJ, p2VarB, r53.s.f(new zd0.j(null, null)), new a3(z2Var, null)), cVar2), v1.a(this), l2Var, j0Var);
        this.f33561r = b2VarK;
        b2 b2VarK2 = r53.s.K(new j(b2VarK, this), v1.a(this), l2Var, j0Var);
        this.f33562t = b2VarK2;
        k kVar = new k(r53.s.K(dVar2.a(), v1.a(this), l2Var, bu0.k.b.f21213a));
        w9.a aVarA2 = v1.a(this);
        Boolean bool = Boolean.FALSE;
        this.f33563v = r53.s.K(r53.s.A(r53.s.N(new r53.u1(b2VarK2, r53.s.K(kVar, aVarA2, l2Var, bool), new g(null)), new i(null, h1Var)), cVar2), v1.a(this), l2Var, j0Var);
        p2 p2VarA2 = bVar2.a(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL);
        x53.b bVar4 = x53.b.f189152a;
        this.f33564w = r53.s.K(r53.s.A(p2VarA2, bVar4), v1.a(this), l2Var, b12.b.f14386g);
        r53.i iVarA2 = r53.s.A(r53.s.A(new c2(new n70.c(bVar, null)), bVar4), cVar2);
        w9.a aVarA3 = v1.a(this);
        m2 m2Var = k2.a.f150706c;
        this.f33565x = r53.s.K(iVarA2, aVarA3, m2Var, null);
        this.f33566y = r53.s.K(r53.s.A(r53.s.A(new c2(new n70.f(dVar, null)), bVar4), cVar2), v1.a(this), m2Var, null);
        this.f33567z = r53.s.K(new l(r53.s.A(((g0) KoinJavaComponent.get$default(g0.class, null, null, 6, null)).getF203980a(), bVar4)), v1.a(this), m2Var, bool);
        this.A = r53.s.K(r53.s.A(r53.s.f(new ze0.c(bVar3, null)), cVar2), v1.a(this), m2Var, null);
        p2 p2VarA3 = q2.a(Boolean.TRUE);
        this.C = p2VarA3;
        this.D = r53.s.d(p2VarA3);
        p2 f126722a = ((no1.b) KoinJavaComponent.get$default(no1.b.class, null, null, 6, null)).getF126722a();
        this.E = f126722a;
        p2 p2VarA4 = q2.a(bool);
        this.F = p2VarA4;
        this.I = r53.s.d(p2VarA4);
        r53.s.C(new m1(r53.s.A(new c2(new y5(x5Var, null)), cVar2), new a(null)), v1.a(this));
        r53.s.C(new m1(r53.s.A(r53.s.f(new n70.i(hVar, null)), cVar2), new b(null)), v1.a(this));
        r53.s.C(new m1(f126722a, new c(null)), v1.a(this));
        ge1.b.T(v1.a(this), bVar4, null, new C0550d(null), 2);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        n70.c0 c0Var = this.f33544a.f124276c;
        c0Var.f124063a.cleanup();
        o53.c0.c(c0Var.f124074l, null);
        o53.c0.c(this.f33545b.f124113b.f124055b, null);
        x4();
    }

    public final void x4() {
        d7 d7Var = this.f33549f;
        if (d7Var.f124153c && !d7Var.f124154d) {
            d7Var.f124154d = true;
            d7Var.f124153c = false;
            i2 i2Var = d7Var.f124151a;
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            i2Var.b(dateTimeNow);
            a2 a2Var = a2.DASHBOARD;
            String str = "endLoading - " + DateTime.now();
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "LogAnalyticsUseCase", str);
        }
        if (d7Var.f124155e) {
            i2 i2Var2 = d7Var.f124152b;
            DateTime dateTimeNow2 = DateTime.now();
            dateTimeNow2.getClass();
            i2Var2.b(dateTimeNow2);
            a2 a2Var2 = a2.DASHBOARD;
            String str2 = "endSync - " + DateTime.now();
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "LogAnalyticsUseCase", str2);
            d7Var.f124155e = false;
        }
    }

    public final void y4(String str, String str2) {
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new h(str, str2, null), 2);
    }

    public final void z4(s sVar, boolean z14) {
        sVar.getClass();
        i1 i1Var = this.f33544a;
        i1Var.getClass();
        n70.c0 c0Var = i1Var.f124276c;
        ge1.b.T(c0Var.f124074l, null, null, new f1(c0Var, z14, sVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/d$e;", "", "<init>", "()V", "", "EXTERNAL_EVENT_REFRESH_DELAY_MS", "J", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private e() {
        }
    }
}
