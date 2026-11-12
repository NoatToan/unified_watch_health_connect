package com.garmin.android.apps.connectmobile.dashboard.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.v;
import androidx.lifecycle.u;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.k2;
import com.garmin.android.apps.connectmobile.r0;
import e23.p;
import lc.q0;
import n70.c6;
import n70.e7;
import n70.y6;
import o13.m;
import o13.n;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import r1.q2;
import r53.j;
import r53.p2;
import r53.s;
import r70.l;
import r70.w;
import r70.z;
import t70.q;
import u53.o;
import z10.d1;
import z10.l0;
import z10.v2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "Lz10/v2$b;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/dashboard/presentation/c;", "dashboardScreenState", "", "bottomBarVisibilityState", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DashboardActivity extends r0 implements v2.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f33444q = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f33445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f33446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f33447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f33448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n70.g f33449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f33451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f33452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u53.d f33453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c2 f33454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c2 f33455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c2 f33456p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkInternetConnectivity$1", f = "DashboardActivity.kt", l = {216}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33457a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f33459a;

            public a(DashboardActivity dashboardActivity) {
                this.f33459a = dashboardActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                DashboardActivity dashboardActivity = this.f33459a;
                if (zBooleanValue) {
                    DashboardActivity.super.checkInternetConnectivity();
                } else {
                    dashboardActivity.hideStatusBanner();
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return DashboardActivity.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$b for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f33457a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                return r2
            L10:
                o13.r.b(r6)
                goto L31
            L14:
                o13.r.b(r6)
                int r6 = com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity.f33444q
                com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity r6 = com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity.this
                com.garmin.android.apps.connectmobile.dashboard.presentation.d r1 = r6.na()
                r53.b2 r1 = r1.D
                com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$b$a r4 = new com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$b$a
                r4.<init>(r6)
                r5.f33457a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L31
                return r0
            L31:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/dashboard/presentation/DashboardActivity$c", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends q0<DashboardRoute> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f33460s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n63.b bVar) {
            super(true);
            this.f33460s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute, java.lang.Object] */
        @Override // lc.q0
        public final DashboardRoute a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f33460s;
            bVar.getClass();
            return bVar.c(DashboardRoute.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final DashboardRoute h(String str) {
            str.getClass();
            n63.b bVar = this.f33460s;
            bVar.getClass();
            return bVar.c(DashboardRoute.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, DashboardRoute dashboardRoute) {
            str.getClass();
            n63.b bVar = this.f33460s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(DashboardRoute.INSTANCE.serializer()), dashboardRoute));
        }

        @Override // lc.q0
        public final String f(DashboardRoute dashboardRoute) {
            n63.b bVar = this.f33460s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(DashboardRoute.INSTANCE.serializer()), dashboardRoute);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$productImprovementGranted$1", f = "DashboardActivity.kt", l = {246}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33461a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s92.g f33463c;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "success", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$productImprovementGranted$1$1", f = "DashboardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ boolean f33464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f33465b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DashboardActivity dashboardActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f33465b = dashboardActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f33465b, dVar);
                aVar.f33464a = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                boolean z14 = this.f33464a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                DashboardActivity dashboardActivity = this.f33465b;
                dashboardActivity.hideProgressOverlay();
                if (!z14) {
                    int i14 = DashboardActivity.f33444q;
                    dashboardActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s92.g gVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f33463c = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return DashboardActivity.this.new d(this.f33463c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33461a;
            if (i14 == 0) {
                r.b(obj);
                DashboardActivity dashboardActivity = DashboardActivity.this;
                dashboardActivity.showProgressOverlay();
                int i15 = DashboardActivity.f33444q;
                dashboardActivity.na().f33546c.getClass();
                s92.g gVar = this.f33463c;
                gVar.getClass();
                r53.b bVarA = u.a(new r53.c2(new y6(gVar, null)), dashboardActivity.getF158016a(), androidx.lifecycle.b0.b.CREATED);
                a aVar2 = new a(dashboardActivity, null);
                this.f33461a = 1;
                if (s.k(bVarA, aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$productImprovementRejected$1", f = "DashboardActivity.kt", l = {261}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33466a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s92.g f33468c;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "success", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$productImprovementRejected$1$1", f = "DashboardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ boolean f33469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DashboardActivity f33470b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DashboardActivity dashboardActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f33470b = dashboardActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f33470b, dVar);
                aVar.f33469a = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                boolean z14 = this.f33469a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                DashboardActivity dashboardActivity = this.f33470b;
                dashboardActivity.hideProgressOverlay();
                if (!z14) {
                    int i14 = DashboardActivity.f33444q;
                    dashboardActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(s92.g gVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f33468c = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return DashboardActivity.this.new e(this.f33468c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33466a;
            if (i14 == 0) {
                r.b(obj);
                DashboardActivity dashboardActivity = DashboardActivity.this;
                dashboardActivity.showProgressOverlay();
                int i15 = DashboardActivity.f33444q;
                dashboardActivity.na().f33547d.getClass();
                s92.g gVar = this.f33468c;
                gVar.getClass();
                r53.b bVarA = u.a(new r53.c2(new e7(gVar, null)), dashboardActivity.getF158016a(), androidx.lifecycle.b0.b.CREATED);
                a aVar2 = new a(dashboardActivity, null);
                this.f33466a = 1;
                if (s.k(bVarA, aVar2, this) == aVar) {
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
    public static final class f implements e23.a<com.garmin.android.apps.connectmobile.dashboard.presentation.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33474d;

        public f(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33471a = gVar;
            this.f33472b = qualifier;
            this.f33473c = aVar;
            this.f33474d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.dashboard.presentation.d] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.dashboard.presentation.d invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33471a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f33473c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.dashboard.presentation.d.class), viewModelStore, null, defaultViewModelCreationExtras, this.f33472b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33474d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33478d;

        public g(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33475a = gVar;
            this.f33476b = qualifier;
            this.f33477c = aVar;
            this.f33478d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, r70.z] */
        @Override // e23.a
        public final z invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33475a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f33477c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(z.class), viewModelStore, null, defaultViewModelCreationExtras, this.f33476b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33478d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<u70.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33482d;

        public h(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33479a = gVar;
            this.f33480b = qualifier;
            this.f33481c = aVar;
            this.f33482d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, u70.i] */
        @Override // e23.a
        public final u70.i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33479a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f33481c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(u70.i.class), viewModelStore, null, defaultViewModelCreationExtras, this.f33480b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33482d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f33483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f33484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f33485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f33486d;

        public i(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f33483a = gVar;
            this.f33484b = qualifier;
            this.f33485c = aVar;
            this.f33486d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, t70.q] */
        @Override // e23.a
        public final q invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f33483a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f33485c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(q.class), viewModelStore, null, defaultViewModelCreationExtras, this.f33484b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f33486d, 4, null);
        }
    }

    static {
        new a(null);
    }

    public DashboardActivity() {
        n nVar = n.NONE;
        this.f33445e = m.a(nVar, new f(this, null, null, null));
        this.f33446f = m.a(nVar, new g(this, null, null, null));
        this.f33447g = m.a(nVar, new h(this, null, null, null));
        this.f33448h = m.a(nVar, new i(this, null, null, null));
        this.f33449i = (n70.g) KoinJavaComponent.get$default(n70.g.class, null, null, 6, null);
        this.f33450j = m.b(new qy0.a(29));
        this.f33451k = (w) AndroidKoinScopeExtKt.getKoinScope(this).get((k23.d<?>) s0.f105811a.b(w.class), (Qualifier) null, new r70.e(this, 6));
        this.f33452l = registerForActivityResult(new g.h(), new jp.a(this, 24));
        this.f33453m = c0.b();
    }

    @Override // z10.v2.b
    public final void U8(s92.g gVar) {
        gVar.getClass();
        v2.a aVar = v2.f201275c;
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        aVar.getClass();
        v2.a.a(supportFragmentManager);
        ge1.b.T(f0.w(this), null, null, new d(gVar, null), 3);
    }

    @Override // z10.v2.b
    public final void V5(s92.g gVar) {
        gVar.getClass();
        v2.a aVar = v2.f201275c;
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        aVar.getClass();
        v2.a.a(supportFragmentManager);
        ge1.b.T(f0.w(this), null, null, new e(gVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.c3
    public final void checkConsentBannerStatus(l0 l0Var, int i14) {
        l0Var.getClass();
        if (na().f33559p.f150540a.getValue() instanceof com.garmin.android.apps.connectmobile.dashboard.presentation.c.C0549c) {
            super.checkConsentBannerStatus(l0Var, i14);
        } else {
            hideConsentBanner();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final void checkInternetConnectivity() {
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return d1.r() ? "MY_DEVICE" : "HOME";
    }

    @Override // z10.v2.b
    public final void i7() {
        this.f33452l.a(new Intent(this, (Class<?>) ProductImprovementConsentActivity.class), null);
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1
    public final void modifyBottomInsets(k2 k2Var, ViewGroup viewGroup) {
        applyBottomInsets(k2Var, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final com.garmin.android.apps.connectmobile.dashboard.presentation.d na() {
        return (com.garmin.android.apps.connectmobile.dashboard.presentation.d) this.f33445e.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        x53.c cVar = o53.s0.f129406a;
        this.f33454n = ge1.b.T(this.f33453m, o.f168762a, null, new l(this, null), 2);
        c cVar2 = new c(n63.b.f123892d);
        Bundle extras = getIntent().getExtras();
        int i14 = 0;
        if (extras == null) {
            extras = new Bundle(0);
        }
        DashboardRoute dashboardRoute = (DashboardRoute) cVar2.a(extras, "StartDestination");
        if (dashboardRoute == null) {
            dashboardRoute = DashboardRoute.Dashboard.INSTANCE;
        }
        ca(d1.r() ? "MY_DEVICE" : "HOME");
        ge1.b.T(f0.w(this), null, null, new r70.i(this, null), 3);
        Intent intent = getIntent();
        if (intent != null ? intent.getBooleanExtra("extra_data_deletion_dialog", false) : false) {
            new androidx.appcompat.app.e.a(this).setCancelable(false).setTitle(R.string.consent_data_being_deleted).setMessage(getString(R.string.consent_data_permanently_delete_alert_message)).setPositiveButton(getString(R.string.lbl_ok), new xk1.v(14)).create().show();
        }
        getF158016a().a((o31.a) this.f33450j.getValue());
        ((ComposeView) findViewById(R.id.composable_container)).setContent(new z3.e(-1302250837, true, new r70.d(this, dashboardRoute, i14)));
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c2 c2Var = this.f33454n;
        if (c2Var != null) {
            c2Var.c(null);
        }
        c2 c2Var2 = this.f33455o;
        if (c2Var2 != null) {
            c2Var2.c(null);
        }
        c2 c2Var3 = this.f33456p;
        if (c2Var3 != null) {
            c2Var3.c(null);
        }
        getF158016a().d((o31.a) this.f33450j.getValue());
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        c6 c6Var = na().f33545b;
        p2 p2Var = c6Var.f124112a.f124473d;
        p2Var.k(null, Boolean.valueOf(!((Boolean) p2Var.getValue()).booleanValue()));
        p2 p2Var2 = c6Var.f124114c.f124752i;
        p2Var2.k(null, Boolean.valueOf(!((Boolean) p2Var2.getValue()).booleanValue()));
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        ja(fa());
        com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar = (com.garmin.android.apps.connectmobile.dashboard.presentation.c) na().f33559p.f150540a.getValue();
        if ((cVar instanceof com.garmin.android.apps.connectmobile.dashboard.presentation.c.b) && ((com.garmin.android.apps.connectmobile.dashboard.presentation.c.b) cVar).f33539b) {
            this.f33451k.b((o31.a) this.f33450j.getValue(), new r70.e(this, 5));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final boolean showGCMaintenanceBanner() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/presentation/DashboardActivity$a;", "", "<init>", "()V", "", "START_DESTINATION", "Ljava/lang/String;", "TAG", "CAMPAIGN_DIALOG_TAG", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
