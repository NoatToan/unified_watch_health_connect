package com.huawei.openalliance.ad.views;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.HiAdWidgets;
import com.huawei.openalliance.ad.cr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback;
import com.huawei.openalliance.ad.od;
import com.huawei.openalliance.ad.or;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dy;
import com.huawei.operation.utils.Constants;
import com.huawei.uikit.phone.hwprogressbar.widget.HwProgressBar;

/* JADX INFO: loaded from: classes12.dex */
public class PPSWebView extends RelativeLayout implements com.huawei.openalliance.ad.views.interfaces.w {
    private MaterialClickInfo.b A;
    private boolean B;
    private int C;
    private String D;
    private boolean E;
    private cr F;
    private boolean G;
    private boolean H;
    private int I;
    private View.OnKeyListener J;
    private View.OnTouchListener K;
    private View.OnTouchListener L;
    private an.a M;
    private RelativeLayout.LayoutParams N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f21053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f21054c;
    int d;
    private d.a e;
    private an f;
    private d g;
    private View h;
    private or i;
    private ActionBar j;
    private AdLandingPageData k;
    private y l;
    private View m;
    private ProgressBar n;
    private PPSAppDetailView o;
    private RelativeLayout.LayoutParams p;
    private TextView q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void c() {
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.l.a(webViewClient);
    }

    public void setWebViewBackgroundColor(int i) {
        an anVar = this.f;
        if (anVar != null) {
            anVar.setBackgroundColor(i);
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        an anVar = this.f;
        if (anVar != null) {
            anVar.setWebChromeClient(webChromeClient);
        }
    }

    public void setScrollListener(View.OnScrollChangeListener onScrollChangeListener) {
        an anVar = this.f;
        if (anVar != null) {
            anVar.setOnScrollChangeListener(onScrollChangeListener);
        }
    }

    public void setRealOpenTime(long j) {
        this.i.d(j);
    }

    public void setPPSWebEventCallback(IPPSWebEventCallback iPPSWebEventCallback) {
        this.i.a(iPPSWebEventCallback);
    }

    public void setIsInLandingpage(boolean z) {
        this.B = z;
        f();
    }

    public void setExtraScrollY(int i) {
        this.I = i;
    }

    public void setErrorPageView(View view) {
        if (view == null) {
            return;
        }
        a(view);
    }

    public void setAdLandingPageData(AdLandingPageData adLandingPageData) {
        this.k = adLandingPageData;
        this.i.a(adLandingPageData);
    }

    public void onStop() {
        this.i.a(this.r);
    }

    public void onResume() {
        this.i.c(System.currentTimeMillis());
        if (this.t) {
            return;
        }
        this.t = true;
        this.i.a();
    }

    public void loadPage() {
        if (this.k != null) {
            this.i.a(this.f);
            this.i.a(this.k.getLandingUrl(), this.f);
            this.D = this.k.getLandingUrl();
        }
    }

    public an getWebView() {
        return this.f;
    }

    public long getWebHasShownTime() {
        return this.i.j();
    }

    public or getWebDetailPresenter() {
        return this.i;
    }

    public PPSAppDetailView getTopDetailView() {
        return this.o;
    }

    public WebSettings getSettings() {
        an anVar = this.f;
        if (anVar != null) {
            return anVar.getSettings();
        }
        return null;
    }

    public d getCustomEmuiActionBar() {
        return this.g;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public String getCurrentPageUrl() {
        return this.D;
    }

    public void destroy() {
        an anVar = this.f;
        if (anVar != null) {
            anVar.destroy();
        }
    }

    public void d() {
        Context context = getContext();
        TextView textView = new TextView(context);
        this.q = textView;
        textView.setId(R.id.trial_play_loading_text);
        this.q.setText(R.string.hiad_loading_tips);
        this.q.setTextSize(1, 14.0f);
        this.q.setTextColor(context.getResources().getColor(R.color.hiad_50_percent_white));
        this.n = new ProgressBar(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.q, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(as.a(context, 72.0f), as.a(context, 72.0f));
        layoutParams2.setMargins(0, 0, 0, as.a(context, 16.0f));
        layoutParams2.addRule(2, R.id.trial_play_loading_text);
        layoutParams2.addRule(13);
        addView(this.n, layoutParams2);
        an anVar = this.f;
        if (anVar != null) {
            anVar.setWebChromeClient(new b());
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void b(String str) {
        this.D = str;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void b() {
        an anVar = this.f;
        if (anVar != null) {
            anVar.loadUrl(Constants.ABOUT_BLANK);
        }
        View view = this.h;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        an anVar = this.f;
        if (anVar != null) {
            anVar.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void a(String str, String str2, String str3) {
        this.i.a(str, str2, str3);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.b("PPSWebView", "load page url is empty.");
        } else if (this.k != null) {
            this.i.a(this.f);
            this.i.a(str, this.f);
            this.D = str;
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.w
    public void a() {
        View view = this.m;
        if (view != null) {
            view.setVisibility(0);
        }
        an anVar = this.f;
        if (anVar != null) {
            anVar.setVisibility(4);
        }
        View view2 = this.h;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        View view = this.m;
        if (view != null) {
            view.setVisibility(8);
        }
        an anVar = this.f;
        if (anVar != null) {
            anVar.setVisibility(0);
        }
    }

    private void i() {
        View view = this.m;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    PPSWebView.this.j();
                    PPSWebView.this.loadPage();
                }
            });
        }
    }

    private void h() {
        ImageView imageView = (ImageView) findViewById(R.id.hiad_id_load_fail_img);
        if (imageView != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_ic_load_fail);
            if (dk.c()) {
                imageView.setImageBitmap(bd.b(drawable));
            }
        }
    }

    private void g() {
        RelativeLayout.LayoutParams layoutParams = this.p;
        if (layoutParams != null) {
            addView(this.o, layoutParams);
        }
        an anVar = this.f;
        if (anVar != null) {
            addView(anVar, this.N);
        }
    }

    private void f() {
        AdLandingPageData adLandingPageData;
        if (!this.B || this.f == null || (adLandingPageData = this.k) == null || !pa.J(adLandingPageData.f())) {
            return;
        }
        this.f.setOnTouchListener(this.L);
        this.f.setScrollChangedListener(this.M);
    }

    private boolean e() {
        int i = this.s + 1;
        this.s = i;
        if (i < 10) {
            return false;
        }
        this.s = 0;
        return true;
    }

    private void d(Context context) {
        PPSAppDetailView pPSAppDetailView = new PPSAppDetailView(context);
        this.o = pPSAppDetailView;
        pPSAppDetailView.setId(R.id.hiad_landing_top_app_detail);
        this.o.setVisibility(8);
        this.p = new RelativeLayout.LayoutParams(-1, -2);
    }

    private void c(Context context) {
        this.f = dy.a(context);
        this.N = new RelativeLayout.LayoutParams(-1, -1);
        an anVar = this.f;
        if (anVar != null) {
            anVar.setId(R.id.hiad_webview);
            this.f.requestFocus();
            this.f.setWebChromeClient(new a());
            an anVar2 = this.f;
            y yVar = new y(this);
            this.l = yVar;
            anVar2.setWebViewClient(yVar);
            this.f.setOnKeyListener(this.J);
            this.f.setOnTouchListener(this.K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        MaterialClickInfo.b bVar = this.A;
        if (bVar != null) {
            try {
                bVar.d(Integer.valueOf(((int) motionEvent.getX()) + this.y)).e(Integer.valueOf(((int) motionEvent.getY()) + this.z)).g(Integer.valueOf(this.z + this.I)).d(Float.valueOf(motionEvent.getSize())).b(Float.valueOf(motionEvent.getPressure())).a(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e) {
                hw.d("PPSWebView", "build landingClickInfo error: %s", e.getClass().getSimpleName());
            }
        }
        if (dk.a(this.w, this.x, rawX, rawY, this.C)) {
            if (this.A == null || this.i == null) {
                return;
            }
            hw.b("PPSWebView", "clickLandingpage swipe");
            this.A.c((Integer) 1);
            this.i.a(this.A.a(), e());
            return;
        }
        if (this.A != null && this.i != null) {
            hw.b("PPSWebView", "clickLandingpage click");
            this.A.c((Integer) 0);
            this.i.a(this.A.a(), e());
        }
        if (hw.a()) {
            hw.a("PPSWebView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
        }
        this.i.a(rawX, rawY);
    }

    private void b(Context context) {
        cr crVarA = cc.a(context);
        this.F = crVarA;
        boolean zG = crVarA.g();
        this.G = zG;
        boolean z = zG && this.F.a(HiAdWidgets.HW_PROGRESS_BAR);
        this.H = z;
        hw.b("PPSWebView", "isHmOS: %s, useHmProgressBar: %s", Boolean.valueOf(this.G), Boolean.valueOf(z));
    }

    static /* synthetic */ int b(PPSWebView pPSWebView) {
        int i = pPSWebView.r;
        pPSWebView.r = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, MotionEvent motionEvent) {
        this.r++;
        this.w = (int) motionEvent.getRawX();
        this.x = (int) motionEvent.getRawY();
        view.measure(0, 0);
        this.f21052a = view.getMeasuredWidth();
        this.f21053b = view.getMeasuredHeight();
        this.f21054c = view.getWidth();
        this.d = view.getHeight();
        MaterialClickInfo.b bVar = new MaterialClickInfo.b();
        this.A = bVar;
        try {
            bVar.a(Integer.valueOf(((int) motionEvent.getX()) + this.y)).b(Integer.valueOf(((int) motionEvent.getY()) + this.z)).f(Integer.valueOf(this.z + this.I)).c(Float.valueOf(motionEvent.getSize())).a(Float.valueOf(motionEvent.getPressure())).b(Long.valueOf(System.currentTimeMillis()));
            if (this.f21052a == 0 || this.f21053b == 0) {
                return;
            }
            this.A.a(this.f21052a + "*" + this.f21053b);
        } catch (Exception e) {
            hw.d("PPSWebView", "build landingClickInfo error: %s", e.getClass().getSimpleName());
        }
    }

    private void a(View view) {
        View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
        }
        this.m = view;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            d dVar = this.g;
            if (dVar != null) {
                layoutParams.addRule(3, dVar.getId());
            }
            addView(this.m, layoutParams);
            this.m.setVisibility(8);
        }
        i();
        h();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0111  */
    private void a(Context context, boolean z) {
        PPSAppDetailView pPSAppDetailView;
        try {
            CookieManager.getInstance().setAcceptCookie(true);
        } catch (Throwable th) {
            hw.c("PPSWebView", "fail to config cookie manager " + th.getClass().getSimpleName());
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, as.a(context, 2.0f));
        d(context);
        c(context);
        if (this.v || this.j != null) {
            this.p.addRule(10, -1);
            this.N.addRule(3, this.o.getId());
            g();
            if (!this.v) {
                if (this.H) {
                    HwProgressBar hwProgressBar = new HwProgressBar(context, null, R.style.Widget_Emui_HwProgressBar_Horizontal);
                    this.h = hwProgressBar;
                    hwProgressBar.setProgressDrawable(getResources().getDrawable(R.drawable.hwprogressbar_horizontal_emui));
                    ((HwProgressBar) this.h).setFlickerEnable(true);
                } else {
                    this.h = new e(context);
                }
            }
            a(LayoutInflater.from(context).inflate(R.layout.hiad_layout_page_load_fail, (ViewGroup) this, false));
            pPSAppDetailView = this.o;
            if (pPSAppDetailView != null) {
                pPSAppDetailView.bringToFront();
            }
            this.l.a(this.h, this.H);
            this.l.a(this.i);
            loadPage();
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10, -1);
        d dVar = new d(context, z);
        this.g = dVar;
        dVar.setId(1001);
        this.p.addRule(3, this.g.getId());
        this.N.addRule(3, this.o.getId());
        if (!this.E) {
            addView(this.g, layoutParams2);
        }
        this.g.setCallBack(this.e);
        g();
        if (this.H) {
            HwProgressBar hwProgressBar2 = new HwProgressBar(context, null, R.style.Widget_Emui_HwProgressBar_Horizontal);
            this.h = hwProgressBar2;
            hwProgressBar2.setProgressDrawable(getResources().getDrawable(R.drawable.hwprogressbar_horizontal_emui));
            ((HwProgressBar) this.h).setFlickerEnable(true);
        } else {
            this.h = new e(context);
        }
        layoutParams.addRule(3, this.g.getId());
        addView(this.h, layoutParams);
        a(LayoutInflater.from(context).inflate(R.layout.hiad_layout_page_load_fail, (ViewGroup) this, false));
        pPSAppDetailView = this.o;
        if (pPSAppDetailView != null) {
            pPSAppDetailView.bringToFront();
        }
        this.l.a(this.h, this.H);
        this.l.a(this.i);
        loadPage();
    }

    private void a(Context context) {
        this.v = true;
        this.i = new od(context, this);
        this.C = ViewConfiguration.get(context).getScaledTouchSlop();
        b(context);
        try {
            a(context, false);
        } catch (Throwable unused) {
            hw.c("PPSWebView", "init webview error");
        }
    }

    class a extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            String strD = PPSWebView.this.i.d(str);
            boolean zIsShowPageTitle = PPSWebView.this.k != null ? PPSWebView.this.k.isShowPageTitle() : false;
            if (PPSWebView.this.g == null) {
                if (PPSWebView.this.j != null) {
                    PPSWebView.this.j.setTitle(zIsShowPageTitle ? strD : " ");
                }
            } else {
                PPSWebView.this.g.a(zIsShowPageTitle);
                PPSWebView.this.g.setTitle(strD);
            }
            super.onReceivedTitle(webView, strD);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (PPSWebView.this.h != null) {
                if (i == 100) {
                    PPSWebView.this.h.setVisibility(8);
                } else {
                    if (PPSWebView.this.h.getVisibility() == 8) {
                        PPSWebView.this.h.setVisibility(0);
                    }
                    if (PPSWebView.this.H) {
                        ((HwProgressBar) PPSWebView.this.h).setProgress(i, true);
                    } else {
                        ((e) PPSWebView.this.h).setProgress(i);
                    }
                }
            }
            super.onProgressChanged(webView, i);
        }

        private a() {
        }
    }

    public PPSWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = new MaterialClickInfo.b();
        this.B = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = new View.OnKeyListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i3, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0 || i3 != 4 || PPSWebView.this.f == null || !PPSWebView.this.f.canGoBack() || !cb.e(PPSWebView.this.f.getContext())) {
                    return false;
                }
                PPSWebView.this.f.goBack();
                return true;
            }
        };
        this.K = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.b(PPSWebView.this);
                    PPSWebView.this.w = (int) motionEvent.getRawX();
                    PPSWebView.this.x = (int) motionEvent.getRawY();
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (dk.a(PPSWebView.this.w, PPSWebView.this.x, rawX, rawY, PPSWebView.this.C)) {
                    return false;
                }
                if (hw.a()) {
                    hw.a("PPSWebView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                }
                PPSWebView.this.i.a(rawX, rawY);
                return false;
            }
        };
        this.L = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.this.a(view, motionEvent);
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                PPSWebView.this.b(view, motionEvent);
                return false;
            }
        };
        this.M = new an.a() { // from class: com.huawei.openalliance.ad.views.PPSWebView.4
            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:20:0x0077  */
            @Override // com.huawei.openalliance.ad.views.an.a
            public void a(View view, int i3, int i4, int i5, int i6) {
                if (i4 > 0 && PPSWebView.this.d + i4 > PPSWebView.this.f21053b) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.d + i4 <= PPSWebView.this.f21053b) {
                        PPSWebView.this.z = i4;
                    } else {
                        PPSWebView pPSWebView = PPSWebView.this;
                        pPSWebView.z = (pPSWebView.f21053b - PPSWebView.this.d) - 1;
                    }
                } else if (i4 >= 0) {
                    PPSWebView.this.z = i4;
                } else {
                    PPSWebView.this.z = 0;
                }
                if (i3 > 0 && PPSWebView.this.f21054c + i3 > PPSWebView.this.f21052a) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.f21054c + i3 <= PPSWebView.this.f21052a) {
                        PPSWebView.this.y = i3;
                    }
                } else if (i3 >= 0) {
                    PPSWebView.this.y = i3;
                } else {
                    PPSWebView.this.y = 0;
                }
                hw.b("PPSWebView", "onScrollChange: viewSize:%s,%s, size:%s,%s, curScroll:%s,%s", Integer.valueOf(PPSWebView.this.f21054c), Integer.valueOf(PPSWebView.this.d), Integer.valueOf(PPSWebView.this.f21052a), Integer.valueOf(PPSWebView.this.f21053b), Integer.valueOf(PPSWebView.this.y), Integer.valueOf(PPSWebView.this.z));
            }
        };
        a(context);
    }

    class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (PPSWebView.this.n != null && PPSWebView.this.q != null) {
                if (i == 100) {
                    PPSWebView.this.n.setVisibility(8);
                    PPSWebView.this.q.setVisibility(8);
                } else {
                    if (PPSWebView.this.n.getVisibility() == 8) {
                        PPSWebView.this.n.setVisibility(0);
                    }
                    if (PPSWebView.this.q.getVisibility() == 8) {
                        PPSWebView.this.q.setVisibility(0);
                    }
                }
            }
            super.onProgressChanged(webView, i);
        }

        private b() {
        }
    }

    public PPSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = new MaterialClickInfo.b();
        this.B = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = new View.OnKeyListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i3, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0 || i3 != 4 || PPSWebView.this.f == null || !PPSWebView.this.f.canGoBack() || !cb.e(PPSWebView.this.f.getContext())) {
                    return false;
                }
                PPSWebView.this.f.goBack();
                return true;
            }
        };
        this.K = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.b(PPSWebView.this);
                    PPSWebView.this.w = (int) motionEvent.getRawX();
                    PPSWebView.this.x = (int) motionEvent.getRawY();
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (dk.a(PPSWebView.this.w, PPSWebView.this.x, rawX, rawY, PPSWebView.this.C)) {
                    return false;
                }
                if (hw.a()) {
                    hw.a("PPSWebView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                }
                PPSWebView.this.i.a(rawX, rawY);
                return false;
            }
        };
        this.L = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.this.a(view, motionEvent);
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                PPSWebView.this.b(view, motionEvent);
                return false;
            }
        };
        this.M = new an.a() { // from class: com.huawei.openalliance.ad.views.PPSWebView.4
            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:20:0x0077  */
            @Override // com.huawei.openalliance.ad.views.an.a
            public void a(View view, int i3, int i4, int i5, int i6) {
                if (i4 > 0 && PPSWebView.this.d + i4 > PPSWebView.this.f21053b) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.d + i4 <= PPSWebView.this.f21053b) {
                        PPSWebView.this.z = i4;
                    } else {
                        PPSWebView pPSWebView = PPSWebView.this;
                        pPSWebView.z = (pPSWebView.f21053b - PPSWebView.this.d) - 1;
                    }
                } else if (i4 >= 0) {
                    PPSWebView.this.z = i4;
                } else {
                    PPSWebView.this.z = 0;
                }
                if (i3 > 0 && PPSWebView.this.f21054c + i3 > PPSWebView.this.f21052a) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.f21054c + i3 <= PPSWebView.this.f21052a) {
                        PPSWebView.this.y = i3;
                    }
                } else if (i3 >= 0) {
                    PPSWebView.this.y = i3;
                } else {
                    PPSWebView.this.y = 0;
                }
                hw.b("PPSWebView", "onScrollChange: viewSize:%s,%s, size:%s,%s, curScroll:%s,%s", Integer.valueOf(PPSWebView.this.f21054c), Integer.valueOf(PPSWebView.this.d), Integer.valueOf(PPSWebView.this.f21052a), Integer.valueOf(PPSWebView.this.f21053b), Integer.valueOf(PPSWebView.this.y), Integer.valueOf(PPSWebView.this.z));
            }
        };
        a(context);
    }

    public PPSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = new MaterialClickInfo.b();
        this.B = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = new View.OnKeyListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i3, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0 || i3 != 4 || PPSWebView.this.f == null || !PPSWebView.this.f.canGoBack() || !cb.e(PPSWebView.this.f.getContext())) {
                    return false;
                }
                PPSWebView.this.f.goBack();
                return true;
            }
        };
        this.K = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.b(PPSWebView.this);
                    PPSWebView.this.w = (int) motionEvent.getRawX();
                    PPSWebView.this.x = (int) motionEvent.getRawY();
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (dk.a(PPSWebView.this.w, PPSWebView.this.x, rawX, rawY, PPSWebView.this.C)) {
                    return false;
                }
                if (hw.a()) {
                    hw.a("PPSWebView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                }
                PPSWebView.this.i.a(rawX, rawY);
                return false;
            }
        };
        this.L = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.this.a(view, motionEvent);
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                PPSWebView.this.b(view, motionEvent);
                return false;
            }
        };
        this.M = new an.a() { // from class: com.huawei.openalliance.ad.views.PPSWebView.4
            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:20:0x0077  */
            @Override // com.huawei.openalliance.ad.views.an.a
            public void a(View view, int i3, int i4, int i5, int i6) {
                if (i4 > 0 && PPSWebView.this.d + i4 > PPSWebView.this.f21053b) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.d + i4 <= PPSWebView.this.f21053b) {
                        PPSWebView.this.z = i4;
                    } else {
                        PPSWebView pPSWebView = PPSWebView.this;
                        pPSWebView.z = (pPSWebView.f21053b - PPSWebView.this.d) - 1;
                    }
                } else if (i4 >= 0) {
                    PPSWebView.this.z = i4;
                } else {
                    PPSWebView.this.z = 0;
                }
                if (i3 > 0 && PPSWebView.this.f21054c + i3 > PPSWebView.this.f21052a) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.f21054c + i3 <= PPSWebView.this.f21052a) {
                        PPSWebView.this.y = i3;
                    }
                } else if (i3 >= 0) {
                    PPSWebView.this.y = i3;
                } else {
                    PPSWebView.this.y = 0;
                }
                hw.b("PPSWebView", "onScrollChange: viewSize:%s,%s, size:%s,%s, curScroll:%s,%s", Integer.valueOf(PPSWebView.this.f21054c), Integer.valueOf(PPSWebView.this.d), Integer.valueOf(PPSWebView.this.f21052a), Integer.valueOf(PPSWebView.this.f21053b), Integer.valueOf(PPSWebView.this.y), Integer.valueOf(PPSWebView.this.z));
            }
        };
        a(context);
    }

    public PPSWebView(Context context, ActionBar actionBar, d.a aVar, com.huawei.openalliance.ad.inter.data.g gVar) {
        super(context);
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = new MaterialClickInfo.b();
        this.B = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = new View.OnKeyListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i3, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0 || i3 != 4 || PPSWebView.this.f == null || !PPSWebView.this.f.canGoBack() || !cb.e(PPSWebView.this.f.getContext())) {
                    return false;
                }
                PPSWebView.this.f.goBack();
                return true;
            }
        };
        this.K = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.b(PPSWebView.this);
                    PPSWebView.this.w = (int) motionEvent.getRawX();
                    PPSWebView.this.x = (int) motionEvent.getRawY();
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (dk.a(PPSWebView.this.w, PPSWebView.this.x, rawX, rawY, PPSWebView.this.C)) {
                    return false;
                }
                if (hw.a()) {
                    hw.a("PPSWebView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                }
                PPSWebView.this.i.a(rawX, rawY);
                return false;
            }
        };
        this.L = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.this.a(view, motionEvent);
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                PPSWebView.this.b(view, motionEvent);
                return false;
            }
        };
        this.M = new an.a() { // from class: com.huawei.openalliance.ad.views.PPSWebView.4
            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:20:0x0077  */
            @Override // com.huawei.openalliance.ad.views.an.a
            public void a(View view, int i3, int i4, int i5, int i6) {
                if (i4 > 0 && PPSWebView.this.d + i4 > PPSWebView.this.f21053b) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.d + i4 <= PPSWebView.this.f21053b) {
                        PPSWebView.this.z = i4;
                    } else {
                        PPSWebView pPSWebView = PPSWebView.this;
                        pPSWebView.z = (pPSWebView.f21053b - PPSWebView.this.d) - 1;
                    }
                } else if (i4 >= 0) {
                    PPSWebView.this.z = i4;
                } else {
                    PPSWebView.this.z = 0;
                }
                if (i3 > 0 && PPSWebView.this.f21054c + i3 > PPSWebView.this.f21052a) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.f21054c + i3 <= PPSWebView.this.f21052a) {
                        PPSWebView.this.y = i3;
                    }
                } else if (i3 >= 0) {
                    PPSWebView.this.y = i3;
                } else {
                    PPSWebView.this.y = 0;
                }
                hw.b("PPSWebView", "onScrollChange: viewSize:%s,%s, size:%s,%s, curScroll:%s,%s", Integer.valueOf(PPSWebView.this.f21054c), Integer.valueOf(PPSWebView.this.d), Integer.valueOf(PPSWebView.this.f21052a), Integer.valueOf(PPSWebView.this.f21053b), Integer.valueOf(PPSWebView.this.y), Integer.valueOf(PPSWebView.this.z));
            }
        };
        if (gVar == null) {
            a(context);
            return;
        }
        this.v = false;
        this.E = gVar.c();
        this.k = gVar.b();
        this.e = aVar;
        this.j = actionBar;
        b(context);
        this.i = new od(context, this.k, this);
        a(context, gVar.a());
    }

    public PPSWebView(Context context) {
        super(context);
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = new MaterialClickInfo.b();
        this.B = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = new View.OnKeyListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i3, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0 || i3 != 4 || PPSWebView.this.f == null || !PPSWebView.this.f.canGoBack() || !cb.e(PPSWebView.this.f.getContext())) {
                    return false;
                }
                PPSWebView.this.f.goBack();
                return true;
            }
        };
        this.K = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.b(PPSWebView.this);
                    PPSWebView.this.w = (int) motionEvent.getRawX();
                    PPSWebView.this.x = (int) motionEvent.getRawY();
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (dk.a(PPSWebView.this.w, PPSWebView.this.x, rawX, rawY, PPSWebView.this.C)) {
                    return false;
                }
                if (hw.a()) {
                    hw.a("PPSWebView", "touch up download area x=%d, y=%d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                }
                PPSWebView.this.i.a(rawX, rawY);
                return false;
            }
        };
        this.L = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSWebView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent != null && motionEvent.getAction() == 0) {
                    PPSWebView.this.a(view, motionEvent);
                }
                if (motionEvent == null || 1 != motionEvent.getAction()) {
                    return false;
                }
                PPSWebView.this.b(view, motionEvent);
                return false;
            }
        };
        this.M = new an.a() { // from class: com.huawei.openalliance.ad.views.PPSWebView.4
            /* JADX WARN: Code duplicated, block: B:11:0x003e  */
            /* JADX WARN: Code duplicated, block: B:20:0x0077  */
            @Override // com.huawei.openalliance.ad.views.an.a
            public void a(View view, int i3, int i4, int i5, int i6) {
                if (i4 > 0 && PPSWebView.this.d + i4 > PPSWebView.this.f21053b) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.d + i4 <= PPSWebView.this.f21053b) {
                        PPSWebView.this.z = i4;
                    } else {
                        PPSWebView pPSWebView = PPSWebView.this;
                        pPSWebView.z = (pPSWebView.f21053b - PPSWebView.this.d) - 1;
                    }
                } else if (i4 >= 0) {
                    PPSWebView.this.z = i4;
                } else {
                    PPSWebView.this.z = 0;
                }
                if (i3 > 0 && PPSWebView.this.f21054c + i3 > PPSWebView.this.f21052a) {
                    view.measure(0, 0);
                    PPSWebView.this.f21052a = view.getMeasuredWidth();
                    PPSWebView.this.f21053b = view.getMeasuredHeight();
                    if (PPSWebView.this.f21054c + i3 <= PPSWebView.this.f21052a) {
                        PPSWebView.this.y = i3;
                    }
                } else if (i3 >= 0) {
                    PPSWebView.this.y = i3;
                } else {
                    PPSWebView.this.y = 0;
                }
                hw.b("PPSWebView", "onScrollChange: viewSize:%s,%s, size:%s,%s, curScroll:%s,%s", Integer.valueOf(PPSWebView.this.f21054c), Integer.valueOf(PPSWebView.this.d), Integer.valueOf(PPSWebView.this.f21052a), Integer.valueOf(PPSWebView.this.f21053b), Integer.valueOf(PPSWebView.this.y), Integer.valueOf(PPSWebView.this.z));
            }
        };
        a(context);
    }
}
