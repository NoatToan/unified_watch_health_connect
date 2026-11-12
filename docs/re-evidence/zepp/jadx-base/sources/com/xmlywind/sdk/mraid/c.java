package com.xmlywind.sdk.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.ximalaya.ting.android.opensdk.datatrasfer.DeviceInfoProviderDefault;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.p;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.CurrentAppOrientation;
import com.xmlywind.sdk.base.models.ExposureChange;
import com.xmlywind.sdk.base.models.ExtensionEvent;
import com.xmlywind.sdk.base.models.MraidEnv;
import com.xmlywind.sdk.base.models.PlacementType;
import com.xmlywind.sdk.base.models.VideoItem;
import com.xmlywind.sdk.base.models.ViewState;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.sdk.common.utils.m;
import com.xmlywind.sdk.common.utils.r;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class c {
    private final com.xmlywind.sdk.mraid.a.b A;
    private final Context a;
    private final PlacementType b;
    private final BaseAdUnit c;
    private final FrameLayout d;
    private final d e;
    private final h f;
    private final com.xmlywind.sdk.mraid.a g;
    private final com.xmlywind.sdk.mraid.a h;
    private final com.xmlywind.sdk.mraid.f i;
    private boolean j;
    private WeakReference<Activity> k;
    private Integer l;
    private ViewGroup m;
    private ViewState n;
    private a o;
    private e p;
    private k q;
    private f r;
    private MraidWebView s;
    private MraidWebView t;
    private C1075c u;
    private Integer v;
    private boolean w;
    private g x;
    private boolean y;
    private final com.xmlywind.sdk.mraid.a.b z;

    public interface a {
        void a();

        void a(float f);

        void a(int i, int i2, int i3, int i4, CloseableLayout.a aVar, boolean z);

        void a(View view);

        void a(SigmobError sigmobError);

        void a(String str);

        void a(URI uri, com.xmlywind.sdk.videoAd.f fVar, String str);

        void a(boolean z);

        void b();

        void b(float f);

        void c();

        void d();

        void e();

        void f();
    }

    public interface b {
        void a(MraidWebView mraidWebView, p pVar);
    }

    /* JADX INFO: renamed from: com.xmlywind.sdk.mraid.c$c, reason: collision with other inner class name */
    public class C1075c extends BroadcastReceiver {
        private Context b;
        private int c = -1;

        public C1075c() {
        }

        public void a() {
            Context context = this.b;
            if (context != null) {
                context.unregisterReceiver(this);
                this.b = null;
            }
        }

        public void a(Context context) {
            m.a(context);
            Context applicationContext = context.getApplicationContext();
            this.b = applicationContext;
            if (applicationContext != null) {
                applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iP;
            if (this.b == null || !"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (iP = c.this.p()) == this.c) {
                return;
            }
            this.c = iP;
            c.this.a(iP);
        }
    }

    public static class d {
        private final Handler a = new Handler();
        private a b;

        public static class a {
            private final Handler a;
            private Runnable b;
            private final Runnable c;

            public void a() {
                this.a.removeCallbacks(this.c);
                this.b = null;
            }
        }

        public void a() {
            a aVar = this.b;
            if (aVar != null) {
                aVar.a();
                this.b = null;
            }
        }
    }

    public interface e {
        void a(boolean z);
    }

    public interface f {
        void a();

        void a(Integer num);

        void a(Map<String, String> map);

        void b();

        void b(Map<String, String> map);

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();
    }

    public c(Context context, BaseAdUnit baseAdUnit, PlacementType placementType) {
        this(context, baseAdUnit, placementType, new com.xmlywind.sdk.mraid.a(baseAdUnit, placementType), new com.xmlywind.sdk.mraid.a(baseAdUnit, PlacementType.INTERSTITIAL), new d());
    }

    public c(Context context, BaseAdUnit baseAdUnit, PlacementType placementType, com.xmlywind.sdk.mraid.a aVar, com.xmlywind.sdk.mraid.a aVar2, d dVar) {
        this.j = false;
        ViewState viewState = ViewState.LOADING;
        this.n = viewState;
        this.u = new C1075c();
        this.w = true;
        this.x = g.NONE;
        this.y = true;
        com.xmlywind.sdk.mraid.a.b bVar = new com.xmlywind.sdk.mraid.a.b() { // from class: com.xmlywind.sdk.mraid.c.1
            @Override // com.xmlywind.sdk.mraid.a.b
            public void a() {
                c.this.i();
                if (c.this.o != null) {
                    c.this.o.a(c.this.d);
                }
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(int i, int i2, int i3, int i4, CloseableLayout.a aVar3, boolean z) {
                if (c.this.o != null) {
                    c.this.o.a(i, i2, i3, i4, aVar3, z);
                }
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(SigmobError sigmobError) {
                c.this.a(sigmobError);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(String str, Map<String, String> map) {
                c.this.b(str, map);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(URI uri) {
                c.this.a(uri.toString());
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(URI uri, com.xmlywind.sdk.videoAd.f fVar, String str) {
                c.this.a(uri, fVar, str);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(URI uri, boolean z) {
                c.this.a(uri, z);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(boolean z) {
                if (c.this.h.j()) {
                    return;
                }
                c.this.g.a(z);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(boolean z, g gVar) throws com.xmlywind.sdk.mraid.b {
                c.this.a(z, gVar);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public boolean a(ConsoleMessage consoleMessage) {
                return c.this.a(consoleMessage);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public boolean a(String str, JsResult jsResult) {
                return c.this.a(str, jsResult);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void b() {
                if (c.this.o != null) {
                    c.this.o.c();
                }
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void b(String str, Map<String, String> map) {
                c.this.a(str, map);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void b(boolean z) {
                c.this.e(z);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void c() {
                c.this.l();
                c.this.o.f();
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void d() {
                if (c.this.o != null) {
                    c.this.o.d();
                }
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void e() {
                if (c.this.o != null) {
                    c.this.o.e();
                }
            }
        };
        this.z = bVar;
        com.xmlywind.sdk.mraid.a.b bVar2 = new com.xmlywind.sdk.mraid.a.b() { // from class: com.xmlywind.sdk.mraid.c.2
            @Override // com.xmlywind.sdk.mraid.a.b
            public void a() {
                c.this.j();
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(int i, int i2, int i3, int i4, CloseableLayout.a aVar3, boolean z) {
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(SigmobError sigmobError) {
                c.this.a(sigmobError);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(String str, Map<String, String> map) {
                c.this.b(str, map);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(URI uri) {
                c.this.a(uri.toString());
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(URI uri, com.xmlywind.sdk.videoAd.f fVar, String str) {
                c.this.a(uri, fVar, str);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(URI uri, boolean z) {
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(boolean z) {
                c.this.g.a(z);
                c.this.h.a(z);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void a(boolean z, g gVar) throws com.xmlywind.sdk.mraid.b {
                c.this.a(z, gVar);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public boolean a(ConsoleMessage consoleMessage) {
                return c.this.a(consoleMessage);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public boolean a(String str, JsResult jsResult) {
                return c.this.a(str, jsResult);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void b() {
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void b(String str, Map<String, String> map) {
                c.this.a(str, map);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void b(boolean z) {
                c.this.e(z);
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void c() {
                c.this.l();
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void d() {
            }

            @Override // com.xmlywind.sdk.mraid.a.b
            public void e() {
            }
        };
        this.A = bVar2;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        m.a(applicationContext);
        this.c = baseAdUnit;
        if (context instanceof Activity) {
            this.k = new WeakReference<>((Activity) context);
        } else {
            this.k = new WeakReference<>(null);
        }
        this.b = placementType;
        this.g = aVar;
        this.h = aVar2;
        this.e = dVar;
        this.n = viewState;
        this.f = new h(applicationContext, applicationContext.getResources().getDisplayMetrics().density);
        FrameLayout frameLayout = new FrameLayout(applicationContext);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(0);
        new View(applicationContext).setOnTouchListener(new View.OnTouchListener() { // from class: com.xmlywind.sdk.mraid.c.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.u.a(applicationContext);
        aVar.a(bVar);
        aVar2.a(bVar2);
        this.i = new com.xmlywind.sdk.mraid.f();
    }

    private void a(ViewState viewState) {
        SigmobLog.d("MRAID state set to " + viewState);
        ViewState viewState2 = this.n;
        this.n = viewState;
        this.g.a(viewState);
        if (this.h.k()) {
            this.h.a(viewState);
        }
        a aVar = this.o;
        if (aVar != null) {
            a(aVar, viewState2, viewState);
        }
        SigmobLog.e("setViewState state set to " + viewState);
        a((Runnable) null);
    }

    public static void a(a aVar, ViewState viewState, ViewState viewState2) {
        m.a(aVar);
        m.a(viewState);
        m.a(viewState2);
    }

    private void a(Runnable runnable) {
        this.e.a();
        MraidWebView mraidWebViewF = f();
        if (mraidWebViewF == null) {
            return;
        }
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        this.f.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int[] iArr = new int[2];
        ViewGroup viewGroupS = s();
        viewGroupS.getLocationOnScreen(iArr);
        this.f.a(iArr[0], iArr[1], viewGroupS.getWidth(), viewGroupS.getHeight());
        this.f.c(iArr[0], iArr[1], viewGroupS.getWidth(), viewGroupS.getHeight());
        mraidWebViewF.getLocationOnScreen(iArr);
        this.f.b(iArr[0], iArr[1], mraidWebViewF.getWidth(), mraidWebViewF.getHeight());
        CurrentAppOrientation currentAppOrientation = new CurrentAppOrientation(com.xmlywind.sdk.common.a.n().Q().intValue() == 1 ? "portrait" : "landscape", true);
        this.g.a(currentAppOrientation);
        this.g.a(this.f);
        if (this.h.j()) {
            this.h.a(currentAppOrientation);
            this.h.a(this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, Map<String, String> map) {
        if (this.o == null) {
            return;
        }
        try {
            String strA = com.xmlywind.sdk.mraid.a.a(map.get(Constants.EXT));
            String strA2 = com.xmlywind.sdk.mraid.a.a(map.get("ctime"));
            String strA3 = com.xmlywind.sdk.mraid.a.a(map.get("state"));
            byte b2 = -1;
            switch (str.hashCode()) {
                case -1610203128:
                    if (str.equals(ExtensionEvent.AD_ENDCARD_SHOW)) {
                        b2 = 3;
                    }
                    break;
                case -1102513700:
                    if (str.equals(ExtensionEvent.AD_COMPANION_CLICK)) {
                        b2 = 4;
                    }
                    break;
                case -934326481:
                    if (str.equals("reward")) {
                        b2 = 1;
                    }
                    break;
                case -900560382:
                    if (str.equals(ExtensionEvent.AD_SKIP)) {
                        b2 = 0;
                    }
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        b2 = 2;
                    }
                    break;
                case 1293469449:
                    if (str.equals(ExtensionEvent.AD_SHOE_SKIP_TIME)) {
                        b2 = 5;
                    }
                    break;
            }
            if (b2 == 0) {
                Float fValueOf = Float.valueOf(0.0f);
                try {
                    fValueOf = Float.valueOf(strA2);
                } catch (Throwable unused) {
                }
                this.o.b(fValueOf.floatValue());
                return;
            }
            if (b2 == 1) {
                Float fValueOf2 = Float.valueOf(0.0f);
                try {
                    fValueOf2 = Float.valueOf(strA2);
                } catch (Throwable unused2) {
                }
                this.o.a(fValueOf2.floatValue());
            } else if (b2 != 2) {
                if (b2 == 3) {
                    this.o.a();
                    return;
                } else if (b2 == 4) {
                    this.o.a(strA);
                    return;
                } else {
                    if (b2 != 5) {
                        return;
                    }
                    this.o.b();
                    return;
                }
            }
            this.o.a(strA3.equalsIgnoreCase("true") || strA3.equalsIgnoreCase("1"));
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, Map<String, String> map) {
        if (this.r == null) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "AdPaused":
                this.r.b();
                break;
            case "AdImpression":
                this.r.a();
                break;
            case "AdVideoThirdQuartile":
                this.r.f();
                break;
            case "AdVideoMidpoint":
                this.r.g();
                break;
            case "AdVideoComplete":
                this.r.d();
                break;
            case "AdVideoFirstQuartile":
                this.r.e();
                break;
            case "AdError":
                this.r.b(map);
                break;
            case "AdVideoStart":
                this.r.h();
                break;
            case "AdClickThru":
                this.r.a(map);
                break;
            case "AdPlaying":
                this.r.c();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int p() {
        return com.xmlywind.sdk.common.a.n().a(this.a);
    }

    private void q() {
        this.g.b();
        this.s = null;
    }

    private void r() {
        this.h.b();
        this.t = null;
    }

    private ViewGroup s() {
        ViewGroup viewGroup = this.m;
        if (viewGroup != null) {
            return viewGroup;
        }
        View viewA = r.a(this.k.get(), this.d);
        return viewA instanceof ViewGroup ? (ViewGroup) viewA : this.d;
    }

    public String a() {
        return this.g.a();
    }

    public void a(int i) {
        SigmobLog.i("handleOrientationChange " + i);
        a((Runnable) null);
    }

    public void a(Activity activity) {
        this.k = new WeakReference<>(activity);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.xmlywind.sdk.mraid.c.4
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.p != null) {
                    c.this.p.a(c.this.j);
                }
            }
        }, ((this.c.getRvAdSetting() == null || this.c.getSkipSeconds() == -1) ? 5 : this.c.getSkipSeconds()) * 1000);
    }

    public void a(ValueCallback valueCallback) {
        this.g.a(valueCallback);
    }

    public void a(SigmobError sigmobError) {
        a aVar = this.o;
        if (aVar != null) {
            aVar.a(sigmobError);
        }
    }

    public void a(a aVar) {
        this.o = aVar;
    }

    public void a(e eVar) {
        this.p = eVar;
    }

    public void a(f fVar) {
        this.r = fVar;
    }

    public void a(String str) {
    }

    public void a(String str, b bVar) {
        MraidWebView mraidWebView = new MraidWebView(this.a);
        this.s = mraidWebView;
        mraidWebView.a(true);
        this.s.setBackgroundColor(0);
        if (bVar != null) {
            bVar.a(this.s, null);
        }
        this.g.a(this.s);
        this.d.addView(this.s, new FrameLayout.LayoutParams(-1, -1));
        this.g.a(this.a, str);
    }

    public void a(String str, String str2) {
        this.g.a(str, str2);
    }

    public void a(URI uri, com.xmlywind.sdk.videoAd.f fVar, String str) {
        a aVar = this.o;
        if (aVar != null) {
            aVar.a(uri, fVar, str);
        }
    }

    public void a(URI uri, boolean z) {
    }

    public void a(boolean z) {
        if (z) {
            this.g.d();
        } else {
            this.g.e();
        }
    }

    public void a(boolean z, g gVar) throws com.xmlywind.sdk.mraid.b {
        if (!a(gVar)) {
            throw new com.xmlywind.sdk.mraid.b("Unable to force orientation to " + gVar);
        }
        this.w = z;
        this.x = gVar;
        if (this.n == ViewState.EXPANDED || (this.b == PlacementType.INTERSTITIAL && !this.y)) {
            m();
        }
    }

    public boolean a(ConsoleMessage consoleMessage) {
        k kVar = this.q;
        if (kVar != null) {
            return kVar.a(consoleMessage);
        }
        return true;
    }

    public boolean a(g gVar) {
        if (gVar == g.NONE) {
            return true;
        }
        Activity activity = this.k.get();
        if (activity != null) {
            try {
                int i = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0).screenOrientation;
                if (i == -1 || i == gVar.a()) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public boolean a(String str, JsResult jsResult) {
        k kVar = this.q;
        if (kVar != null) {
            return kVar.a(str, jsResult);
        }
        jsResult.confirm();
        return true;
    }

    public void b() {
        this.g.a(false);
    }

    public void b(int i) throws com.xmlywind.sdk.mraid.b {
        Activity activity = this.k.get();
        if (activity == null || !a(this.x)) {
            throw new com.xmlywind.sdk.mraid.b("Attempted to lock orientation to unsupported value: " + this.x.name());
        }
        if (this.v == null) {
            this.v = Integer.valueOf(activity.getRequestedOrientation());
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e2) {
            SigmobLog.e("lockOrientation: " + e2.getMessage());
        }
    }

    public void b(String str, b bVar) {
        MraidWebView mraidWebView = new MraidWebView(this.a);
        this.s = mraidWebView;
        mraidWebView.a(true);
        this.s.setBackgroundColor(0);
        if (bVar != null) {
            bVar.a(this.s, null);
        }
        this.g.a(this.s);
        this.d.addView(this.s, new FrameLayout.LayoutParams(-1, -1));
        this.g.b(str);
    }

    public void b(boolean z) {
        if (z) {
            this.g.f();
        } else {
            this.g.e();
        }
    }

    public void c() {
        MraidWebView mraidWebView = this.s;
        if (mraidWebView != null) {
            mraidWebView.resumeTimers();
        }
        this.g.a(true);
    }

    public void c(boolean z) {
        if (z) {
            this.g.g();
        }
    }

    public void d() {
        this.g.a(new ExposureChange(100.0f, new Rect(0, 0, s().getWidth(), s().getHeight()), null));
    }

    public void d(boolean z) {
        this.y = true;
        MraidWebView mraidWebView = this.s;
        if (mraidWebView != null) {
            mraidWebView.b(z);
        }
        if (this.t != null) {
            this.s.b(z);
        }
    }

    public Integer e() {
        Integer num = this.l;
        if (num != null) {
            return num;
        }
        this.g.b(new ValueCallback<String>() { // from class: com.xmlywind.sdk.mraid.c.5
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                Float fValueOf;
                try {
                    if (str.equalsIgnoreCase("null") || str.equalsIgnoreCase(DeviceInfoProviderDefault.RESULT_UNDEFINED) || (fValueOf = Float.valueOf(str)) == null || fValueOf.floatValue() <= 1.0E-5d) {
                        return;
                    }
                    c.this.l = Integer.valueOf((int) (fValueOf.floatValue() * 1000.0f));
                    if (c.this.r != null) {
                        c.this.r.a(c.this.l);
                    }
                } catch (Throwable unused) {
                }
            }
        });
        return 0;
    }

    public void e(boolean z) {
        this.j = z;
        e eVar = this.p;
        if (eVar != null) {
            eVar.a(z);
        }
    }

    public MraidWebView f() {
        return this.h.j() ? this.t : this.s;
    }

    public boolean g() {
        Activity activity = this.k.get();
        if (activity == null || f() == null) {
            return false;
        }
        if (this.b != PlacementType.INLINE) {
            return true;
        }
        return this.i.a(activity, f());
    }

    public void h() {
        String str = com.xmlywind.sdk.common.a.n().Q().intValue() == 1 ? "portrait" : "landscape";
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        this.f.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        ViewGroup viewGroupS = s();
        this.f.a(0, 0, viewGroupS.getMeasuredWidth(), viewGroupS.getMeasuredHeight());
        this.f.c(0, 0, viewGroupS.getMeasuredWidth(), viewGroupS.getMeasuredHeight());
        this.f.b(0, 0, viewGroupS.getMeasuredWidth(), viewGroupS.getMeasuredHeight());
        this.g.a(new CurrentAppOrientation(str, true));
        this.g.a(this.f);
    }

    @SuppressLint({"JavascriptInterface"})
    public void i() {
        try {
            this.g.a(new MraidEnv());
            this.g.a(this.i.b(this.a), this.i.a(this.a), com.xmlywind.sdk.mraid.f.d(this.a), com.xmlywind.sdk.mraid.f.c(this.a), g(), true, true);
            this.g.a(this.b);
            this.g.a(this.c.getRvAdSetting());
            if (!TextUtils.isEmpty(this.c.getVideo_url())) {
                String video_url = this.c.getVideo_url();
                if (this.c.isVideoExist()) {
                    video_url = "file://" + this.c.getVideoPath();
                }
                this.g.a(this.c.getMaterial().video_size != null ? new VideoItem(video_url, this.c.getMaterial().video_size.width.intValue(), this.c.getMaterial().video_size.height.intValue()) : new VideoItem(video_url, 0, 0));
                e();
            }
            MaterialMeta.Builder builderNewBuilder = this.c.getMaterial().newBuilder();
            if (!this.c.getMaterial().has_companion_endcard.booleanValue()) {
                builderNewBuilder = builderNewBuilder.companion(null);
            }
            this.g.a(builderNewBuilder.html_snippet(null).html_url(null).deeplink_url(null).landing_page(null).web_event_handle(null).endcard_url(null).build());
            this.g.a(this.c.getAd().newBuilder().materials(new LinkedList()).ad_tracking(new LinkedList()).build());
            h();
            a(ViewState.DEFAULT);
            d();
            this.g.c();
            this.g.a(true);
            try {
                this.g.h();
                m();
                this.g.a(com.xmlywind.sdk.common.a.n().an());
            } catch (Throwable unused) {
                SigmobLog.e("Failed to apply orientation.");
            }
        } catch (Throwable th) {
            SigmobLog.e("handlePageLoad error", th);
        }
    }

    public void j() {
        a(new Runnable() { // from class: com.xmlywind.sdk.mraid.c.6
            @Override // java.lang.Runnable
            public void run() {
                com.xmlywind.sdk.mraid.a aVar = c.this.h;
                boolean zB = c.this.i.b(c.this.a);
                boolean zA = c.this.i.a(c.this.a);
                com.xmlywind.sdk.mraid.f unused = c.this.i;
                boolean zD = com.xmlywind.sdk.mraid.f.d(c.this.a);
                com.xmlywind.sdk.mraid.f unused2 = c.this.i;
                aVar.a(zB, zA, zD, com.xmlywind.sdk.mraid.f.c(c.this.a), c.this.g(), true, true);
                c.this.h.a(c.this.n);
                c.this.h.a(c.this.b);
                c.this.h.a(c.this.h.i());
                c.this.h.c();
            }
        });
    }

    public void k() {
        this.e.a();
        try {
            this.u.a();
        } catch (IllegalArgumentException e2) {
            if (!e2.getMessage().contains("Receiver not registered")) {
                throw e2;
            }
        }
        if (!this.y) {
            d(true);
        }
        q();
        r();
        n();
    }

    public void l() {
        ViewState viewState;
        ViewState viewState2;
        if (this.s == null || (viewState = this.n) == ViewState.LOADING || viewState == (viewState2 = ViewState.HIDDEN)) {
            return;
        }
        ViewState viewState3 = ViewState.EXPANDED;
        if (viewState == viewState3 || this.b == PlacementType.INTERSTITIAL) {
            n();
        }
        ViewState viewState4 = this.n;
        if (viewState4 != ViewState.RESIZED && viewState4 != viewState3) {
            if (viewState4 == ViewState.DEFAULT) {
                this.d.setVisibility(4);
                a(viewState2);
                return;
            }
            return;
        }
        if (!this.h.j() || this.t == null) {
            this.d.addView(this.s, new FrameLayout.LayoutParams(-1, -1));
            this.d.setVisibility(0);
        } else {
            r();
        }
        a(ViewState.DEFAULT);
    }

    public void m() throws com.xmlywind.sdk.mraid.b {
        int iA;
        g gVar = this.x;
        if (gVar != g.NONE) {
            iA = gVar.a();
        } else {
            if (this.w) {
                n();
                return;
            }
            Activity activity = this.k.get();
            if (activity == null) {
                throw new com.xmlywind.sdk.mraid.b("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            iA = com.xmlywind.sdk.common.a.n().a(activity);
        }
        b(iA);
    }

    public void n() {
        Integer num;
        try {
            Activity activity = this.k.get();
            if (activity != null && (num = this.v) != null) {
                activity.setRequestedOrientation(num.intValue());
            }
            this.v = null;
        } catch (Exception e2) {
            SigmobLog.e("unApplyOrientation: " + e2.getMessage());
        }
    }

    public FrameLayout o() {
        return this.d;
    }
}
