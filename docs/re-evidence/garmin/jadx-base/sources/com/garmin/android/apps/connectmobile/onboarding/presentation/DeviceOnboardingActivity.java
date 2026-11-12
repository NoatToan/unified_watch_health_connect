package com.garmin.android.apps.connectmobile.onboarding.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.h0;
import p3.x3;
import r31.g;
import r31.j;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/presentation/DeviceOnboardingActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lr31/j;", "uiState", "", "showCompletionDialog", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceOnboardingActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39726b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39727a = m.a(n.NONE, new d(this, null, null, new r31.b(this, 0)));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity$onCreate$1$1$5$1", f = "DeviceOnboardingActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<j> f39728a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x3<j> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f39728a = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f39728a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = DeviceOnboardingActivity.f39726b;
            if (this.f39728a.getF182175a().f150031d.contains(k31.c.f102639w)) {
                ht.a aVar3 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "FinishSetup"), new o13.p("Type", "CWS"), new o13.p("FeatureType", "ACTIVATE_LTE_SERVICE"));
                aVar3.getClass();
                ht.a.a(bundleA, "PageView");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/onboarding/presentation/DeviceOnboardingActivity$c", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f39729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k0 f39730b;

        public c(n0 n0Var, k0 k0Var) {
            this.f39729a = n0Var;
            this.f39730b = k0Var;
        }

        @Override // p3.h0
        public final void dispose() {
            this.f39729a.getF158016a().d(this.f39730b);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39734d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f39731a = gVar;
            this.f39732b = qualifier;
            this.f39733c = aVar;
            this.f39734d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, r31.g] */
        @Override // e23.a
        public final g invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f39731a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f39733c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(g.class), viewModelStore, null, defaultViewModelCreationExtras, this.f39732b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f39734d, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.onboarding_device_setup_title);
        c.j.a(this, new z3.e(-236068429, true, new r31.c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/presentation/DeviceOnboardingActivity$a;", "", "<init>", "()V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8) {
            Intent intentD = sn.a.d(context, context, DeviceOnboardingActivity.class);
            intentD.putExtra("GCM_deviceUnitID", j8);
            return intentD;
        }

        private a() {
        }
    }
}
