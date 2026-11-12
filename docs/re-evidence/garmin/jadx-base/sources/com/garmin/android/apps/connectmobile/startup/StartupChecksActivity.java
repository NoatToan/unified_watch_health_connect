package com.garmin.android.apps.connectmobile.startup;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import aq1.f0;
import aq1.g0;
import aq1.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import java.util.Arrays;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/StartupChecksActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/startup/a$b;", "Ldv/k;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StartupChecksActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.startup.a.b, dv.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44788d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44790b = o13.m.a(n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44791c = k1.f37122a.r();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44792a;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.HIDE_LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j0.CONSENT_CHECK_ENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j0.SHOW_GRADUATION_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j0.GRADUATION_CONSENTS_CONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f44792a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f44793a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f44793a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f44793a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44793a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44797d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f44794a = gVar;
            this.f44795b = qualifier;
            this.f44796c = aVar;
            this.f44797d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.startup.e] */
        @Override // e23.a
        public final e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f44794a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f44796c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(e.class), viewModelStore, null, defaultViewModelCreationExtras, this.f44795b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f44797d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.startup.a.b
    public final void X1(String str) {
        str.getClass();
        boolean zEquals = str.equals("ACTION_GET_LOCATION");
        ?? r14 = this.f44790b;
        if (zEquals) {
            e eVar = (e) r14.getValue();
            eVar.getClass();
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StartupChecksViewModel", "retryUserLocationFetch() -> fetchUserLocation()");
            ge1.b.T(v1.a(eVar), null, null, new g0(eVar, null), 3);
            return;
        }
        if (!str.equals("ACTION_GET_CONNECT_PRIVACY_CONSENT")) {
            ((e) r14.getValue()).K4(new String[0]);
            return;
        }
        e eVar2 = (e) r14.getValue();
        eVar2.getClass();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "StartupChecksViewModel", "retryConnectPrivacyConsentFetch() -> fetchConnectPrivacyConsent()");
        ge1.b.T(v1.a(eVar2), null, null, new f0(eVar2, null), 3);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.startup.d dVarA;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_content_frame);
        initActionBar("", 1);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f44789a = extras.getBoolean("hasRedirectIntent", false);
        }
        ((e) this.f44790b.getValue()).I4().f(this, new c(new a03.f(this, 18)));
        if (this.f44791c) {
            com.garmin.android.apps.connectmobile.startup.d.a aVar = com.garmin.android.apps.connectmobile.startup.d.f44815e;
            com.garmin.android.apps.connectmobile.startup.c.f44811b.getClass();
            String[] strArr = com.garmin.android.apps.connectmobile.startup.c.a.f44813b;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            aVar.getClass();
            dVarA = com.garmin.android.apps.connectmobile.startup.d.a.a(strArr2);
        } else {
            com.garmin.android.apps.connectmobile.startup.d.a aVar2 = com.garmin.android.apps.connectmobile.startup.d.f44815e;
            com.garmin.android.apps.connectmobile.startup.c.f44811b.getClass();
            String[] strArr3 = com.garmin.android.apps.connectmobile.startup.c.a.f44814c;
            String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
            aVar2.getClass();
            dVarA = com.garmin.android.apps.connectmobile.startup.d.a.a(strArr4);
        }
        if (getSupportFragmentManager().G("StartupChecksFragment") != null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "StartupChecksActivity", "Fragment with tag=[StartupChecksFragment] already showing -> don't pop it again");
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager);
        aVar4.l(R.id.content_frame, dVarA, "StartupChecksFragment");
        aVar4.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/StartupChecksActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "HAS_REDIRECT_INTENT", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a() {
            aq1.i iVar = (aq1.i) KoinJavaComponent.get$default(aq1.i.class, null, null, 6, null);
            return iVar.i() || iVar.b() || iVar.q() || iVar.o() || iVar.n(false);
        }

        public static void b(Activity activity, Intent intent) {
            activity.getClass();
            intent.getClass();
            Intent intent2 = new Intent(activity, (Class<?>) StartupChecksActivity.class);
            intent2.addFlags(268468224);
            intent2.putExtra("hasRedirectIntent", true);
            ComponentName component = intent.getComponent();
            if (component != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    intent2.putExtras(extras);
                }
                intent2.putExtra("GCM_extra_redirection", component.getClassName());
            }
            activity.startActivity(intent2);
        }

        public static void c(Context context) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) StartupChecksActivity.class);
            intent.addFlags(268468224);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
