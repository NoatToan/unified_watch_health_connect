package com.xiaomi.verificationsdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.account.passportsdk.account_sso.BuildConfig;
import com.xiaomi.account.passportsdk.account_sso.R;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.passport.uicontroller.SimpleFutureTask;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.verificationsdk.internal.EnvEncryptUtils;
import com.xiaomi.verificationsdk.internal.ErrorInfo;
import com.xiaomi.verificationsdk.internal.SensorHelper;
import com.xiaomi.verificationsdk.internal.VerifyError;
import com.xiaomi.verificationsdk.internal.VerifyResult;
import defpackage.jgl;
import defpackage.mb4;
import defpackage.oam;
import defpackage.sf4;
import defpackage.tjg;
import defpackage.yzo;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class VerificationManager {
    public static final ExecutorService F = Executors.newCachedThreadPool();
    public View A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SimpleFutureTask<mb4> f14305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorHelper f14306b;
    public VerifyResultCallback c;
    public View d;
    public WebView e;
    public LinearLayout f;
    public AlertDialog g;
    public Handler h;
    public String i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14307k;
    public boolean l;
    public boolean m;
    public String n;
    public String o;
    public String p;
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f14308r;
    public boolean s;
    public int v;
    public int w;
    public oam x;
    public WeakReference<Activity> y;
    public n t = new n.a().a();
    public n u = new n.a().a();
    public boolean z = true;
    public boolean B = false;
    public final AtomicBoolean C = new AtomicBoolean(false);
    public DialogInterface.OnKeyListener D = new a();
    public DialogInterface.OnDismissListener E = new d();

    public interface VerifyResultCallback {
        void onVerifyCancel();

        void onVerifyFail(VerifyError verifyError);

        void onVerifySucess(VerifyResult verifyResult);
    }

    public class a implements DialogInterface.OnKeyListener {

        /* JADX INFO: renamed from: com.xiaomi.verificationsdk.VerificationManager$a$a, reason: collision with other inner class name */
        public class RunnableC0854a implements Runnable {
            public RunnableC0854a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                VerificationManager.this.c.onVerifyCancel();
                VerificationManager.n0(VerificationManager.this.C);
            }
        }

        public a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            VerificationManager.this.j0();
            if (VerificationManager.this.c == null) {
                return true;
            }
            VerificationManager.this.h.post(new RunnableC0854a());
            return true;
        }
    }

    public class b extends SimpleFutureTask.Callback<mb4> {
        public b() {
        }

        @Override // com.xiaomi.passport.uicontroller.SimpleFutureTask.Callback
        public void call(SimpleFutureTask<mb4> simpleFutureTask) {
            try {
                mb4 mb4Var = simpleFutureTask.get();
                if (mb4Var != null) {
                    VerificationManager.this.w = mb4Var.a();
                    VerificationManager.this.v = mb4Var.b();
                    VerificationManager.this.x.d("lastDownloadTime", System.currentTimeMillis());
                    VerificationManager.this.x.c("frequency", VerificationManager.this.w);
                    VerificationManager.this.x.c("maxduration", VerificationManager.this.v);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e2) {
                e2.printStackTrace();
            }
        }
    }

    public class c implements Callable<mb4> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14312a;

        public c(String str) {
            this.f14312a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mb4 call() throws Exception {
            return com.xiaomi.verificationsdk.internal.a.a(this.f14312a);
        }
    }

    public class d implements DialogInterface.OnDismissListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                VerificationManager.this.c.onVerifyCancel();
                VerificationManager.n0(VerificationManager.this.C);
            }
        }

        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (!VerificationManager.this.z || VerificationManager.this.c == null) {
                return;
            }
            VerificationManager.this.h.post(new a());
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14316a;

        public class a extends WebChromeClient {
            public a() {
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                VerificationManager.this.m0(webView.getHitTestResult().getExtra());
                return false;
            }
        }

        public class b extends WebViewClient {

            public class a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ VerifyResult f14320a;

                public a(VerifyResult verifyResult) {
                    this.f14320a = verifyResult;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VerificationManager.this.c.onVerifySucess(this.f14320a);
                    VerificationManager.n0(VerificationManager.this.C);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.verificationsdk.VerificationManager$e$b$b, reason: collision with other inner class name */
            public class RunnableC0855b implements Runnable {
                public RunnableC0855b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    VerificationManager.this.c.onVerifyCancel();
                    VerificationManager.n0(VerificationManager.this.C);
                }
            }

            public class c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ VerifyError f14323a;

                public c(VerifyError verifyError) {
                    this.f14323a = verifyError;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VerificationManager.this.c.onVerifyFail(this.f14323a);
                    VerificationManager.n0(VerificationManager.this.C);
                }
            }

            public class d implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ VerifyResult f14325a;

                public d(VerifyResult verifyResult) {
                    this.f14325a = verifyResult;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VerificationManager.this.c.onVerifySucess(this.f14325a);
                    VerificationManager.n0(VerificationManager.this.C);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.verificationsdk.VerificationManager$e$b$e, reason: collision with other inner class name */
            public class RunnableC0856e implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ VerifyError f14327a;

                public RunnableC0856e(VerifyError verifyError) {
                    this.f14327a = verifyError;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VerificationManager.this.c.onVerifyFail(this.f14327a);
                    VerificationManager.n0(VerificationManager.this.C);
                }
            }

            public b() {
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                VerificationManager.this.f.setVisibility(8);
                if (VerificationManager.this.e.getVisibility() == 4) {
                    VerificationManager.this.e.setVisibility(0);
                }
                super.onPageFinished(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                VerificationManager.this.f.setVisibility(0);
                if (VerificationManager.this.e.getVisibility() == 0) {
                    VerificationManager.this.e.setVisibility(4);
                }
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Bundle bundleB;
                if (str.contains("/captcha/status") && (bundleB = tjg.b(str)) != null) {
                    int i = Integer.parseInt(bundleB.getString("code"));
                    String string = bundleB.getString("errorCode");
                    String string2 = bundleB.getString("errorStatus");
                    String string3 = bundleB.getString("flag");
                    AccountLogger.log("VerificationManager", "code=" + i + ";errorCode=" + string + ";errorStatus=" + string2);
                    if (i == 0) {
                        VerificationManager.this.d0();
                        VerificationManager.this.z = false;
                        VerificationManager.this.e0();
                        VerificationManager.this.i = "";
                        VerificationManager.this.j = false;
                        VerificationManager.this.h.post(new a(new VerifyResult.b().e(string3).d(jgl.b()).c()));
                        return true;
                    }
                    if (i == 1) {
                        VerificationManager.this.z = false;
                        VerificationManager.this.f14307k = true;
                        VerificationManager.this.e0();
                        VerificationManager.this.h.post(new RunnableC0855b());
                    } else if (i == 2) {
                        VerificationManager.this.z = false;
                        VerificationManager.this.e0();
                        VerificationManager.this.j = true;
                        VerificationManager.this.h.post(new c(VerificationManager.h0(ErrorInfo.ErrorCode.ERROR_EVENTID_EXPIRED.getCode(), "eventid expired")));
                    } else if (i == 3) {
                        VerificationManager.this.z = false;
                        VerificationManager.this.e0();
                        VerificationManager.this.i = "";
                        VerificationManager.this.j = false;
                        VerificationManager.this.h.post(new d(new VerifyResult.b().e(EnvEncryptUtils.g()).c()));
                    } else if (i == 95008 || i == 95009) {
                        VerificationManager.this.z = false;
                        VerificationManager.this.e0();
                        VerificationManager.this.j = false;
                        VerificationManager.this.h.post(new RunnableC0856e(VerificationManager.h0(ErrorInfo.ErrorCode.ERROR_VERIFY_SERVER.getCode(), "code=" + i + ";errorCode=" + string + ";errorStatus=" + string2)));
                    }
                }
                return false;
            }
        }

        public e(String str) {
            this.f14316a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activityF0 = VerificationManager.this.f0();
            if (activityF0 == null || VerificationManager.this.B) {
                return;
            }
            HashMap map = new HashMap();
            map.put("_modifyStyle", "true");
            String strY = VerificationManager.Y(this.f14316a, map);
            boolean z = activityF0.getResources().getConfiguration().orientation == 2;
            VerificationManager verificationManager = VerificationManager.this;
            n nVar = z ? verificationManager.t : verificationManager.u;
            if (VerificationManager.this.A == null) {
                VerificationManager.this.A = activityF0.getLayoutInflater().inflate(R.layout.passport_verification_dialog, (ViewGroup) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                VerificationManager.this.A.setLayoutParams(layoutParams);
            }
            if (VerificationManager.this.d == null) {
                VerificationManager verificationManager2 = VerificationManager.this;
                verificationManager2.d = verificationManager2.A.findViewById(R.id.view_custom);
            }
            VerificationManager.this.d.setVisibility(nVar.a() ? 0 : 8);
            if (VerificationManager.this.e == null) {
                VerificationManager verificationManager3 = VerificationManager.this;
                verificationManager3.e = (WebView) verificationManager3.A.findViewById(R.id.verify_webView);
            }
            if (VerificationManager.this.f == null) {
                VerificationManager verificationManager4 = VerificationManager.this;
                verificationManager4.f = (LinearLayout) verificationManager4.A.findViewById(R.id.verify_ProgressBar);
            }
            if (VerificationManager.this.g != null) {
                VerificationManager.this.g.dismiss();
                VerificationManager.this.g = null;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activityF0, android.R.style.Theme.Material.Light.Dialog.Alert);
            if ((2 & activityF0.getApplicationInfo().flags) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            WebSettings settings = VerificationManager.this.e.getSettings();
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setUserAgentString(VerificationManager.this.i0(activityF0));
            VerificationManager.this.e.setWebChromeClient(new a());
            VerificationManager.this.e.setWebViewClient(new b());
            ViewGroup viewGroup = (ViewGroup) VerificationManager.this.A.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            VerificationManager.this.g = builder.create();
            VerificationManager.this.g.setView(VerificationManager.this.A);
            VerificationManager.this.g.setOnKeyListener(VerificationManager.this.D);
            VerificationManager.this.g.setOnDismissListener(VerificationManager.this.E);
            VerificationManager.this.g.show();
            VerificationManager.this.e.setBackgroundColor(0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) VerificationManager.this.e.getLayoutParams();
            Rect rect = nVar.i;
            if (rect != null) {
                marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                marginLayoutParams.setMargins(0, 0, 0, 0);
            }
            if (nVar.b()) {
                marginLayoutParams.width = nVar.f;
                marginLayoutParams.height = nVar.g;
            }
            VerificationManager.this.e.setLayoutParams(marginLayoutParams);
            VerificationManager.this.e.loadUrl(strY);
            VerificationManager verificationManager5 = VerificationManager.this;
            verificationManager5.a0(activityF0, verificationManager5.A.findViewById(R.id.fl_content), VerificationManager.this.g.getWindow(), nVar, z);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f14329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f14330b;

        public f(int i, int i2) {
            this.f14329a = i;
            this.f14330b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activityF0 = VerificationManager.this.f0();
            if (activityF0 == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activityF0, android.R.style.Theme.Material.Light.Dialog.Alert);
            TextView textView = new TextView(activityF0);
            textView.setText(activityF0.getResources().getString(this.f14329a) + "(" + this.f14330b + ")");
            textView.setPadding(0, 40, 0, 0);
            textView.setGravity(17);
            builder.setView(textView);
            VerificationManager.this.g = builder.create();
            VerificationManager.this.g.show();
            VerificationManager verificationManager = VerificationManager.this;
            verificationManager.Z(verificationManager.g.getWindow(), activityF0.getWindowManager());
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerificationManager.this.z = false;
            VerificationManager.this.e0();
        }
    }

    public class h implements Runnable {

        public class a implements m {

            /* JADX INFO: renamed from: com.xiaomi.verificationsdk.VerificationManager$h$a$a, reason: collision with other inner class name */
            public class RunnableC0857a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ VerifyResult f14334a;

                public RunnableC0857a(VerifyResult verifyResult) {
                    this.f14334a = verifyResult;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VerificationManager.this.c.onVerifySucess(this.f14334a);
                    VerificationManager.n0(VerificationManager.this.C);
                }
            }

            public class b implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ VerifyError f14336a;

                public b(VerifyError verifyError) {
                    this.f14336a = verifyError;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VerificationManager.this.c.onVerifyFail(this.f14336a);
                }
            }

            public class c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f14338a;

                public c(String str) {
                    this.f14338a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VerificationManager.this.w0(this.f14338a);
                }
            }

            public a() {
            }

            @Override // com.xiaomi.verificationsdk.VerificationManager.m
            public void a(String str) {
                VerificationManager.K(VerificationManager.this);
                VerificationManager.this.i = str;
                VerificationManager.this.j = false;
                VerificationManager.this.h.post(new c(str));
            }

            @Override // com.xiaomi.verificationsdk.VerificationManager.m
            public void onVerifyFail(VerifyError verifyError) {
                VerificationManager.this.t0(verifyError.a(), verifyError.b());
                VerificationManager.this.h.post(new b(verifyError));
            }

            @Override // com.xiaomi.verificationsdk.VerificationManager.m
            public void onVerifySucess(VerifyResult verifyResult) {
                VerificationManager.this.d0();
                VerificationManager.this.h.post(new RunnableC0857a(verifyResult));
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ VerifyError f14340a;

            public b(VerifyError verifyError) {
                this.f14340a = verifyError;
            }

            @Override // java.lang.Runnable
            public void run() {
                VerificationManager.this.c.onVerifyFail(this.f14340a);
                VerificationManager.n0(VerificationManager.this.C);
            }
        }

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(VerificationManager.this.f14306b.p())) {
                VerificationManager.this.f14306b.g();
            }
            try {
                JSONObject jSONObject = new JSONObject(VerificationManager.this.f14306b.p());
                JSONObject jSONObject2 = jSONObject.getJSONObject("env");
                jSONObject2.put("voiceover", VerificationManager.this.l ? 1 : 0);
                jSONObject.put("env", jSONObject2);
                jSONObject.put("force", VerificationManager.this.m);
                Activity activity = (Activity) VerificationManager.this.y.get();
                if (activity != null) {
                    jSONObject.put("talkBack", yzo.a(activity));
                }
                jSONObject.put("uid", VerificationManager.this.p);
                jSONObject.put("version", "2.0");
                jSONObject.put("scene", VerificationManager.this.o);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("r", new SecureRandom().nextLong());
                jSONObject3.put(DeviceTagInterface.CUSTOM_TAG_TYPE, System.currentTimeMillis() / 1000);
                jSONObject.put("nonce", jSONObject3);
                VerificationManager.this.f14306b.G(jSONObject.toString());
                VerificationManager.this.f14306b.K(VerificationManager.this.f14306b.p(), VerificationManager.this.n, VerificationManager.this.o, Boolean.valueOf(VerificationManager.this.j), VerificationManager.this.f14308r, VerificationManager.this.q, Boolean.valueOf(VerificationManager.this.s), new a());
            } catch (JSONException e) {
                e.printStackTrace();
                VerificationManager verificationManager = VerificationManager.this;
                ErrorInfo.ErrorCode errorCode = ErrorInfo.ErrorCode.ERROR_JSON_EXCEPTION;
                verificationManager.t0(errorCode.getCode(), ErrorInfo.getMsgIdGivenErrorCode(errorCode));
                VerificationManager.this.h.post(new b(VerificationManager.h0(errorCode.getCode(), "registere:" + e.toString())));
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VerifyError f14342a;

        public i(VerifyError verifyError) {
            this.f14342a = verifyError;
        }

        @Override // java.lang.Runnable
        public void run() {
            VerificationManager.this.c.onVerifyFail(this.f14342a);
            VerificationManager.n0(VerificationManager.this.C);
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerificationManager.this.g.show();
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VerifyError f14345a;

        public k(VerifyError verifyError) {
            this.f14345a = verifyError;
        }

        @Override // java.lang.Runnable
        public void run() {
            VerificationManager.this.c.onVerifyFail(this.f14345a);
            VerificationManager.n0(VerificationManager.this.C);
        }
    }

    public interface l {
    }

    public interface m {
        void a(String str);

        void onVerifyFail(VerifyError verifyError);

        void onVerifySucess(VerifyResult verifyResult);
    }

    public static class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f14347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Drawable f14348b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final Rect h;
        public final Rect i;

        public static class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Drawable f14350b;
            public int d;
            public int e;
            public int f;
            public int g;
            public Rect h;
            public Rect i;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f14349a = R.drawable.passport_verification_def_dialog_bg;
            public int c = 81;

            public n a() {
                return new n(this.f14349a, this.f14350b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
            }
        }

        public /* synthetic */ n(int i, Drawable drawable, int i2, int i3, int i4, int i5, int i6, Rect rect, Rect rect2, a aVar) {
            this(i, drawable, i2, i3, i4, i5, i6, rect, rect2);
        }

        public boolean a() {
            return this.d > 0 || this.e > 0;
        }

        public boolean b() {
            return this.f > 0 || this.g > 0;
        }

        public n(int i, Drawable drawable, int i2, int i3, int i4, int i5, int i6, Rect rect, Rect rect2) {
            this.f14347a = i;
            this.f14348b = drawable;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = rect;
            this.i = rect2;
        }
    }

    public VerificationManager(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("activity  should not be null");
        }
        this.h = new Handler(Looper.getMainLooper());
        this.y = new WeakReference<>(activity);
        this.f14306b = new SensorHelper(activity.getApplicationContext());
        this.x = new oam(activity, "VerificationConfig");
    }

    public static /* synthetic */ l K(VerificationManager verificationManager) {
        verificationManager.getClass();
        return null;
    }

    public static String Y(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("origin is not allowed null");
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return builderBuildUpon.build().toString();
    }

    public static boolean c0(AtomicBoolean atomicBoolean) {
        return atomicBoolean.compareAndSet(false, true);
    }

    public static VerifyError h0(int i2, String str) {
        return new VerifyError.a().e(i2).g(str).d();
    }

    public static void n0(AtomicBoolean atomicBoolean) {
        atomicBoolean.getAndSet(false);
    }

    public final void Z(Window window, WindowManager windowManager) {
        window.clearFlags(131072);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = defaultDisplay.getWidth();
        attributes.gravity = 81;
        window.setAttributes(attributes);
    }

    public final void a0(Activity activity, View view, Window window, n nVar, boolean z) {
        window.clearFlags(131072);
        int i2 = nVar.f14347a;
        if (i2 > 0) {
            view.setBackgroundResource(i2);
        } else {
            Drawable drawable = nVar.f14348b;
            if (drawable != null) {
                view.setBackgroundDrawable(drawable);
            } else {
                view.setBackgroundColor(activity.getResources().getColor(R.color.passport_verification_dialog_def_bg_color));
            }
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        View decorView = window.getDecorView();
        int i3 = 0;
        decorView.setBackgroundColor(0);
        Rect rect = nVar.h;
        if (rect != null) {
            decorView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            int i4 = nVar.c;
            if ((i4 & 80) != 0) {
                i3 = nVar.h.bottom;
            } else if ((i4 & 48) != 0) {
                i3 = nVar.h.top;
            }
        } else if (nVar.a()) {
            decorView.setPadding(0, 0, 0, 0);
        }
        if (nVar.a()) {
            attributes.width = nVar.d;
            attributes.height = nVar.e + i3;
        } else {
            Point point = new Point();
            activity.getWindowManager().getDefaultDisplay().getSize(point);
            attributes.width = z ? point.y : point.x;
        }
        attributes.gravity = nVar.c;
        window.setAttributes(attributes);
    }

    public final void b0() {
        F.execute(new h());
    }

    public final void d0() {
        this.f14306b.h();
        x0();
    }

    public void e0() {
        AlertDialog alertDialog;
        if (f0() == null || (alertDialog = this.g) == null) {
            return;
        }
        alertDialog.dismiss();
        this.g = null;
    }

    public final Activity f0() {
        WeakReference<Activity> weakReference = this.y;
        if (weakReference == null) {
            return null;
        }
        Activity activity = weakReference.get();
        if (activity != null && !activity.isFinishing()) {
            return activity;
        }
        AccountLogger.log("VerificationManager", "Activity is destroy");
        return null;
    }

    public final SimpleFutureTask<mb4> g0(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("getConfig: url is null");
        }
        SimpleFutureTask<mb4> simpleFutureTask = new SimpleFutureTask<>(new c(str), new b());
        this.f14305a = simpleFutureTask;
        F.submit(simpleFutureTask);
        return this.f14305a;
    }

    public final String i0(Context context) {
        return "" + WebSettings.getDefaultUserAgent(context) + " androidVerifySDK/" + BuildConfig.VERSION_NAME + " androidVerifySDK/VersionCode/" + BuildConfig.VERSION_CODE + " AppPackageName/" + context.getPackageName();
    }

    public final void j0() {
        AlertDialog alertDialog = this.g;
        if (alertDialog != null) {
            alertDialog.hide();
        }
    }

    public void k0() {
        x0();
    }

    public final boolean l0() {
        return true;
    }

    public final void m0(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Activity activityF0 = f0();
        if (activityF0 != null) {
            activityF0.startActivity(intent);
        }
    }

    public VerificationManager o0(String str) {
        this.o = str;
        return this;
    }

    public VerificationManager p0(String str) {
        this.q = str;
        return this;
    }

    public VerificationManager q0(Boolean bool) {
        this.s = bool.booleanValue();
        return this;
    }

    public VerificationManager r0(String str) {
        this.n = str;
        return this;
    }

    public VerificationManager s0(VerifyResultCallback verifyResultCallback) {
        this.c = verifyResultCallback;
        return this;
    }

    public final void t0(int i2, int i3) {
        if (f0() == null) {
            return;
        }
        this.h.post(new f(i3, i2));
        this.h.postDelayed(new g(), VibrateModeProgressBar.sLongToLong);
    }

    public final void u0(String str) {
        if (f0() == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("showDialog:url should not be null");
        }
        this.h.post(new e(str));
    }

    public final void v0() {
        Activity activityF0 = f0();
        if (activityF0 == null) {
            return;
        }
        if (tjg.a(activityF0)) {
            if (this.g != null) {
                this.h.post(new j());
            }
        } else {
            ErrorInfo.ErrorCode errorCode = ErrorInfo.ErrorCode.ERROR_CONNECT_UNREACHABLE_EXCEPTION;
            t0(errorCode.getCode(), ErrorInfo.getMsgIdGivenErrorCode(errorCode));
            this.h.post(new k(h0(errorCode.getCode(), "network disconnected")));
        }
    }

    public final void w0(String str) {
        Activity activityF0 = f0();
        if (activityF0 == null) {
            return;
        }
        if (tjg.a(activityF0)) {
            u0(str);
            return;
        }
        ErrorInfo.ErrorCode errorCode = ErrorInfo.ErrorCode.ERROR_CONNECT_UNREACHABLE_EXCEPTION;
        t0(errorCode.getCode(), ErrorInfo.getMsgIdGivenErrorCode(errorCode));
        this.h.post(new i(h0(errorCode.getCode(), "network disconnected")));
    }

    public final void x0() {
        this.v = this.x.a("maxduration", 5000);
        int iA = this.x.a("frequency", 50);
        this.w = iA;
        this.f14306b.i(iA, this.v);
        if (Math.abs(System.currentTimeMillis() - this.x.b("lastDownloadTime", 0L)) > 86400000) {
            AccountLogger.log("VerificationManager", "get config from server");
            g0(sf4.a(this.q, "/captcha/v2/config"));
        }
    }

    public void y0() {
        if (c0(this.C)) {
            if (TextUtils.isEmpty(this.n)) {
                throw new IllegalArgumentException("key is null");
            }
            if (TextUtils.isEmpty(this.o)) {
                throw new IllegalArgumentException("action is null");
            }
            this.z = true;
            if (this.c == null) {
                throw new IllegalArgumentException("startVerify: mVerifyResultCallback should not be null");
            }
            if (!l0()) {
                v0();
            } else {
                this.f14307k = false;
                b0();
            }
        }
    }
}
