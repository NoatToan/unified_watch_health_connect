package com.garmin.android.library.mobileauth.ui;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.core.view.g1;
import androidx.core.view.o1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import java.security.cert.CertificateException;
import java.util.Set;
import java.util.WeakHashMap;
import o13.m;
import o13.p;
import o13.r;
import o13.t;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p13.u;
import re2.g0;
import vb.h;
import ve2.l;
import xa1.j;
import xe2.i0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/a;", "Li/c;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a extends i.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f50411l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f50413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f50414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f50415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AlertDialog f50416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f50417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f50418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50419h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f50412a = m.b(new j(19));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f50420i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set<Integer> f50421j = u.m0(new Integer[]{0, 0});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f50422k = m.b(new j(20));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mobileauth/ui/a$b", "Landroid/content/BroadcastReceiver;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            int i14 = a.f50411l;
            a aVar = a.this;
            aVar.Q9().post(new xe2.a(aVar, 0));
        }
    }

    static {
        new C1003a(null);
    }

    public final void O9(Throwable th3, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        a aVar3;
        Throwable cause = th3.getCause();
        if (cause == null || !(cause instanceof CertificateException)) {
            aVar3 = this;
        } else {
            String string = getString(R.string.mobile_auth_connection_error);
            string.getClass();
            String localizedMessage = ((CertificateException) cause).getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "SSL CertificateException";
            }
            String str = localizedMessage;
            se2.c.a(se2.b.CERT_EXCEPTION, t0.b(new p(se2.a.REASON, str)));
            aVar3 = this;
            Q9().post(new at0.c(aVar3, string, str, aVar, 23));
        }
        if (aVar3.f50416e == null) {
            aVar2.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P9(String str, v13.c cVar) {
        xe2.b bVar;
        if (cVar instanceof xe2.b) {
            bVar = (xe2.b) cVar;
            int i14 = bVar.f190449c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f190449c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new xe2.b(this, cVar);
            }
        } else {
            bVar = new xe2.b(this, cVar);
        }
        Object objE0 = bVar.f190447a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f190449c;
        try {
            if (i15 == 0) {
                r.b(objE0);
                x53.c cVar2 = s0.f129406a;
                x53.b bVar2 = x53.b.f189152a;
                xe2.c cVar3 = new xe2.c(this, str, null);
                bVar.f190449c = 1;
                objE0 = ge1.b.e0(bVar2, cVar3, bVar);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE0);
            }
            return (String) objE0;
        } catch (Throwable th3) {
            ((Logger) this.f50412a.getValue()).error("generatePortalTokenForLockToEmailAddress", th3);
            throw th3;
        }
    }

    public final Handler Q9() {
        Handler handler = this.f50413b;
        if (handler != null) {
            return handler;
        }
        s.m("mainThreadHandler");
        throw null;
    }

    public final l R9() {
        return (l) this.f50422k.getValue();
    }

    public final ve2.m S9() {
        return Build.VERSION.SDK_INT >= 33 ? (ve2.m) getIntent().getParcelableExtra("multi.user.mode", ve2.m.class) : (ve2.m) getIntent().getParcelableExtra("multi.user.mode");
    }

    public final void T9() {
        Q9().post(new xe2.a(this, 1));
    }

    public final void U9(Fragment fragment, String str, i0 i0Var) {
        str.getClass();
        i0Var.getClass();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.connect_sso_content_frame, fragment, str);
        aVar.s(true, true);
        this.f50417f = i0Var;
        com.airbnb.lottie.animation.keyframe.a.u("loaded fragment [", i0Var.name(), "]", (Logger) this.f50412a.getValue());
    }

    public final void V9() {
        Q9().post(new xe2.a(this, 2));
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        String callingPackage;
        super.onCreate(bundle);
        if (!s.g(getCallingPackage(), getPackageName()) && (callingPackage = getCallingPackage()) != null && callingPackage.length() != 0) {
            finish();
            return;
        }
        re2.b.f152215a.getClass();
        boolean z14 = re2.b.f152233s;
        t tVar = this.f50412a;
        if (!z14) {
            ((Logger) tVar.getValue()).error("onCreate: library not initialized, finishing activity");
            setResult(32026);
            finish();
            return;
        }
        this.f50415d = this instanceof com.garmin.android.library.mobileauth.ui.mfa.a;
        this.f50413b = new Handler(Looper.getMainLooper());
        if (g0.a(this)) {
            boolean z15 = R9().f177764e;
            Logger logger = (Logger) tVar.getValue();
            try {
                WebView.setWebContentsDebuggingEnabled(z15);
            } catch (Throwable th3) {
                if (logger != null) {
                    logger.warn("safeSetWebContentsDebuggingEnabled: preventing hard crash, 'WebView' may be updating on this device", th3);
                }
            }
        }
        getWindow().getDecorView().setImportantForAutofill(8);
        setContentView(R.layout.mobileauth_base_activity_layout);
        b.j.a(this);
        this.f50414c = (ProgressBar) findViewById(R.id.connect_sso_progress_spinner);
        this.f50418g = findViewById(R.id.connect_sso_no_internet_conn_banner);
        if (R9().G) {
            Window window = getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(a7.b.getColor(this, R.color.ssoStatusBarBackgroundColor));
            new o1(window, window.getDecorView()).b(R9().H);
            if (R9().I) {
                Window window2 = getWindow();
                new o1(window2, window2.getDecorView()).a(R9().J);
            }
        }
        View viewFindViewById = findViewById(android.R.id.content);
        vn2.t0 t0Var = new vn2.t0(this, 27);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById, t0Var);
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f50419h) {
            unregisterReceiver(this.f50420i);
            this.f50419h = false;
        }
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onResume() {
        super.onResume();
        Q9().post(new xe2.a(this, 0));
        if (this.f50419h) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f50420i, intentFilter);
        this.f50419h = true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        AlertDialog alertDialog = this.f50416e;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f50416e = null;
    }

    /* JADX INFO: renamed from: com.garmin.android.library.mobileauth.ui.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/a$a;", "", "<init>", "()V", "", "ARG_MULTI_USER_MODE", "Ljava/lang/String;", "WEB_VIEW_LOADING_URL", "", "RESULT_EXIT_APP", "I", "RESULT_LIBRARY_NOT_INITIALIZED", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1003a {
        public /* synthetic */ C1003a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1003a() {
        }
    }
}
