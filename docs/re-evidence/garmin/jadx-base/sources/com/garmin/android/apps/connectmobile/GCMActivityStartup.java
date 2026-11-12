package com.garmin.android.apps.connectmobile;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.forceupdate.ForceUpdateActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivityLandscape;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class GCMActivityStartup extends i.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f28658d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.startup.k f28659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f28660b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f28661c = registerForActivityResult(new g.h(), new a61.i(this, 10));

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28663b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.startup.k.b.values().length];
            f28663b = iArr;
            try {
                iArr[com.garmin.android.apps.connectmobile.startup.k.b.START_COLLECTING_DOB_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28663b[com.garmin.android.apps.connectmobile.startup.k.b.START_LOCATION_CONSENT_CHECKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28663b[com.garmin.android.apps.connectmobile.startup.k.b.START_DELETE_DATA_CONSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28663b[com.garmin.android.apps.connectmobile.startup.k.b.LOCKED_IN_LIVE_ACTIVITY_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28663b[com.garmin.android.apps.connectmobile.startup.k.b.REDIRECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[re2.b.a.values().length];
            f28662a = iArr2;
            try {
                iArr2[re2.b.a.SIGNED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28662a[re2.b.a.NO_SYSTEM_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28662a[re2.b.a.SIGNED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28662a[re2.b.a.TRANSITIONING.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f28658d = gt2.b.f79005a.h("GCMActivityStartup");
    }

    public static Intent P9(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) GCMActivityStartup.class);
        if (intent != null && intent.getComponent() != null) {
            if (intent.getExtras() != null) {
                intent2.putExtras(intent.getExtras());
            }
            if (intent.getAction() != null) {
                intent2.setAction(intent.getAction());
            }
            intent2.putExtra("GCM_extra_redirection", intent.getComponent().getClassName());
        }
        return intent2;
    }

    public final void O9() {
        f12.b bVar = (f12.b) KoinJavaComponent.get(f12.b.class);
        if (bVar.getF68023e()) {
            String string = getString(R.string.startup_oauth_generic_error);
            com.airbnb.lottie.animation.keyframe.a.w("Forced sign out -> showing Toast: ", string, f28658d);
            Toast.makeText(this, string, 1).show();
            bVar.F();
        }
    }

    public final void Q9(Activity activity) {
        AuthenticationActivity.a aVar = AuthenticationActivity.f50343v;
        xe2.o oVar = new xe2.o(activity, null);
        aVar.getClass();
        re2.b.f152215a.getClass();
        Intent intent = new Intent(oVar.f190523a, (Class<?>) (re2.b.m().f177775p ? AuthenticationActivity.class : AuthenticationActivityLandscape.class));
        ve2.s sVar = oVar.f190524b;
        if (sVar != null) {
            intent.putExtra("skip.signin.config", sVar);
        }
        this.f28661c.a(intent, null);
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z14;
        super.onCreate(bundle);
        f28658d.debug("onCreate");
        this.f28659a = (com.garmin.android.apps.connectmobile.startup.k) new androidx.lifecycle.x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.startup.k.class));
        Object obj = this;
        while (true) {
            z14 = obj instanceof androidx.lifecycle.n0;
            if (z14) {
                break;
            }
            ContextWrapper contextWrapper = obj instanceof ContextWrapper ? (ContextWrapper) obj : null;
            Context baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            obj = p005kotlin.jvm.internal.s.g(baseContext, obj) ? null : baseContext;
        }
        androidx.lifecycle.n0 n0Var = z14 ? (androidx.lifecycle.n0) obj : null;
        androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.CREATED;
        this.f28659a.getClass();
        r53.b bVarF = r53.s.f(new aq1.k0(null));
        bd0.e eVar = new bd0.e(this, 13);
        bVar.getClass();
        if (n0Var != null) {
            ge1.b.T(o53.f0.w(n0Var), null, null, new g22.i(n0Var, bVar, bVarF, eVar, null), 3);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f28660b.shutdownNow();
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        Logger logger = f28658d;
        logger.debug("onResume");
        if (11657 < GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_min_supported_version), 0)) {
            logger.debug("onResume: calling ForceUpdateActivity");
            startActivity(new Intent(this, (Class<?>) ForceUpdateActivity.class));
            finish();
        }
    }
}
