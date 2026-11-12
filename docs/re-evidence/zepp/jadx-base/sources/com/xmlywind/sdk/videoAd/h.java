package com.xmlywind.sdk.videoAd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.timepicker.TimeModel;
import com.huami.applet.AppletConfig;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.i;
import com.xmlywind.sdk.base.common.j;
import com.xmlywind.sdk.base.common.l;
import com.xmlywind.sdk.base.common.p;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.base.models.SigMacroCommon;
import com.xmlywind.sdk.base.views.AdLogoView;
import com.xmlywind.sdk.base.views.AlertDialogWidget;
import com.xmlywind.sdk.base.views.CompanionAdsWidget;
import com.xmlywind.sdk.base.views.CreativeWebView;
import com.xmlywind.sdk.base.views.SkipButtonWidget;
import com.xmlywind.sdk.base.views.VideoButtonWidget;
import com.xmlywind.sdk.base.views.VideoProgressBarWidget;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.models.sigdsp.pb.ClickAreaSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.Color;
import com.xmlywind.sdk.common.models.sigdsp.pb.CompanionEndcard;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import com.xmlywind.sdk.common.utils.m;
import com.xmlywind.volley.toolbox.k;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes22.dex */
public class h extends b implements com.xmlywind.sdk.base.common.d.a, g.a {
    private static int h;
    private boolean A;
    private com.xmlywind.sdk.videoAd.a B;
    private int C;
    private BaseVideoView D;
    private BaseAdUnit E;
    private View F;
    private p G;
    private VideoProgressBarWidget H;
    private VideoButtonWidget I;
    private SkipButtonWidget J;
    private g K;
    private c L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private int Q;
    private boolean R;
    private RelativeLayout S;
    private boolean T;
    private VideoButtonWidget U;
    private boolean V;
    private boolean W;
    private k.c X;
    private CompanionAdsWidget Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private int ac;
    private com.xmlywind.sdk.base.views.g ad;
    private boolean ae;
    private com.xmlywind.sdk.base.views.e af;
    private boolean ag;
    public String g;
    private AdLogoView i;
    private ImageView j;
    private RelativeLayout k;
    private int l;
    private boolean m;
    private int n;
    private String o;
    private List<String> p;
    private List<String> q;
    private long r;
    private String s;
    private String t;
    private boolean u;
    private Handler v;
    private boolean w;
    private AlertDialogWidget x;
    private String y;
    private int z;

    public static class a {
        @JavascriptInterface
        public int getInteractionType() {
            return h.h;
        }

        @JavascriptInterface
        public String getSdkVersion() {
            return Constants.SDK_VERSION;
        }
    }

    public h(final Activity activity, BaseAdUnit baseAdUnit, Bundle bundle, Bundle bundle2, String str, com.xmlywind.sdk.base.common.h hVar) {
        super(activity, str, hVar);
        this.l = 0;
        this.m = false;
        this.n = 0;
        this.o = "undone";
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.s = "none";
        this.t = null;
        this.v = new Handler();
        this.w = true;
        this.E = null;
        this.M = 0;
        this.R = false;
        this.T = false;
        this.V = false;
        this.W = false;
        this.Z = false;
        this.ae = false;
        this.ag = false;
        this.t = bundle.getString("ad_scene");
        this.E = baseAdUnit;
        com.xmlywind.sdk.videoAd.a aVar = (com.xmlywind.sdk.videoAd.a) baseAdUnit.getAdConfig();
        this.B = aVar;
        aVar.a(k(), this.E, (com.xmlywind.sdk.base.views.e.b) null);
        this.y = this.E.getAdslot_id();
        h = this.E.getMaterial().interaction_type.intValue();
        int iIntValue = this.E.getAd().display_orientation.intValue();
        this.C = iIntValue != 1 ? iIntValue != 2 ? bundle.getInt(Constants.REQUESTED_ORIENTATION, 3) : 6 : 7;
        h().a(this.C);
        k().requestWindowFeature(1);
        k().getWindow().addFlags(1024);
        b(bundle);
        this.E.getMacroCommon().addMarcoKey(SigMacroCommon._PLAYLASTFRAME_, "1");
        this.w = this.E.getMaterial().creative_type.intValue() != j.CreativeTypeVideo_transparent_html.a();
        if (bundle2 != null) {
            this.N = bundle2.getInt("current_position", -1);
            this.O = bundle2.getBoolean("video_finished", false);
            this.R = bundle2.getBoolean("companionAd_visable", false);
        }
        if (this.B.a() == null) {
            throw new IllegalStateException("BaseVideoConfig does not have a video disk path");
        }
        int iB = com.xmlywind.sdk.base.b.b();
        if (iB != 0) {
            k().setTheme(iB);
        }
        j().setBackgroundColor(-16777216);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        this.k = relativeLayout;
        relativeLayout.setBackgroundColor(-16777216);
        this.D = a(activity, 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.k.addView(this.D, layoutParams);
        j().addView(this.k, new RelativeLayout.LayoutParams(-1, -1));
        if (this.m) {
            a(activity);
            x();
        }
        l();
        this.k.setClickable(true);
        this.k.setOnTouchListener(new View.OnTouchListener() { // from class: com.xmlywind.sdk.videoAd.h.1
            public MotionEvent a = null;

            /* JADX WARN: Code duplicated, block: B:50:0x01ee  */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z = false;
                if (h.this.E.getFullClickOnVideo()) {
                    ClickAreaSetting clickAreaSetting = h.this.E.getClickAreaSetting();
                    float fFloatValue = clickAreaSetting.left.floatValue();
                    float f = com.xmlywind.sdk.common.a.n().ai().widthPixels;
                    float fFloatValue2 = clickAreaSetting.right.floatValue();
                    float f2 = com.xmlywind.sdk.common.a.n().ai().widthPixels;
                    float fFloatValue3 = clickAreaSetting.top.floatValue();
                    float f3 = com.xmlywind.sdk.common.a.n().ai().heightPixels;
                    float fFloatValue4 = clickAreaSetting.bottom.floatValue();
                    float f4 = com.xmlywind.sdk.common.a.n().ai().heightPixels;
                    if (h.this.x == null || h.this.x.getVisibility() != 0) {
                        if (motionEvent.getAction() == 1) {
                            if (fFloatValue * f < motionEvent.getRawX() && motionEvent.getRawX() < (1.0f - fFloatValue2) * f2 && fFloatValue3 * f3 < motionEvent.getRawY() && motionEvent.getRawY() < (1.0f - fFloatValue4) * f4) {
                                SigMacroCommon macroCommon = h.this.E.getMacroCommon();
                                if (this.a == null) {
                                    this.a = motionEvent;
                                }
                                if (macroCommon instanceof SigMacroCommon) {
                                    macroCommon.addMarcoKey(SigMacroCommon._PROGRESS_, String.valueOf((h.this.r() * 100) / h.this.q()));
                                    macroCommon.addMarcoKey(SigMacroCommon._DOWNX_, String.valueOf((int) this.a.getRawX()));
                                    macroCommon.addMarcoKey(SigMacroCommon._DOWNY_, String.valueOf((int) this.a.getRawY()));
                                    macroCommon.addMarcoKey(SigMacroCommon._UPX_, String.valueOf((int) motionEvent.getRawX()));
                                    macroCommon.addMarcoKey(SigMacroCommon._UPY_, String.valueOf((int) motionEvent.getRawY()));
                                }
                                h.this.g = String.format("%d,%d,%d,%d", Integer.valueOf((int) this.a.getRawX()), Integer.valueOf((int) this.a.getRawY()), Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY()));
                                if (h.this.K == null) {
                                    h.this.s();
                                }
                                if (h.this.K != null) {
                                    h.this.K.b(activity, h.this.a().getLanding_page(), com.xmlywind.sdk.base.a.VIDEO_CLICK, h.this.a(), h.this.g);
                                }
                                z = true;
                            }
                            t.a(h.this.E, motionEvent, "useless_video_click", z);
                        } else if (motionEvent.getAction() == 0) {
                            this.a = MotionEvent.obtain(motionEvent);
                        }
                    }
                } else {
                    if (motionEvent.getAction() == 1) {
                        if (h.this.E.getMaterial().enable_collapse_tool_bar.booleanValue() && h.this.Y != null && h.this.Y.a()) {
                            if (h.this.Y.b()) {
                                h.this.Y.setVisibility(0);
                            } else {
                                h.this.Y.setVisibility(4);
                            }
                        }
                        t.a(h.this.E, motionEvent, "useless_video_click", false);
                    }
                    if (motionEvent.getAction() == 0) {
                        this.a = MotionEvent.obtain(motionEvent);
                    }
                }
                return true;
            }
        });
    }

    private void A() {
        try {
            if (this.O) {
                return;
            }
            H();
            this.D.pause();
            SigmobLog.i("videoView.pause()");
            this.N = r();
            m().a(com.xmlywind.sdk.base.common.a.AD_PAUSE, r());
            this.B.b(i(), this.N);
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float B() {
        return r() / q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        try {
            this.M = this.B.i(q());
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    private void D() {
        t.a(PointCategory.PLAY_LOADING, (String) null, this.E, new t.a() { // from class: com.xmlywind.sdk.videoAd.h.19
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    HashMap map = new HashMap();
                    h hVar = h.this;
                    map.put("duration_seq", hVar.a((List<String>) hVar.p));
                    h hVar2 = h.this;
                    map.put("video_time_seq", hVar2.a((List<String>) hVar2.q));
                    map.put("skip_state", h.this.s);
                    map.put("video_duration", String.format("%.2f", Float.valueOf(h.this.q() / 1000.0f)));
                    map.put("endcard_loading_state", h.this.o);
                    ((PointEntitySigmob) obj).setOptions(map);
                }
            }
        });
    }

    private void E() {
        int iK = this.B.k();
        int iQ = q() - 2;
        if (iK == 99999999) {
            iK = 0;
        } else if (iK == -99999999) {
            a(iQ);
            return;
        } else if (iK <= 0) {
            iK += iQ;
        }
        a(iK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        ImageView imageView;
        s();
        if (!this.w && (imageView = this.j) != null) {
            ViewParent parent = imageView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.j);
            }
            j().addView(this.j, 0);
        }
        com.xmlywind.sdk.base.common.d.f().b(this);
        VideoButtonWidget videoButtonWidget = this.I;
        if (videoButtonWidget == null) {
            e(i(), 0);
        } else {
            videoButtonWidget.setVisibility(0);
        }
        AdLogoView adLogoView = this.i;
        if (adLogoView != null) {
            adLogoView.setVisibility(8);
        }
        D();
        y();
        if (this.F == null) {
            SigmobLog.e("endcard can't show " + this.E.getEndCardIndexPath());
            HashMap map = new HashMap();
            map.put("error", "endcard can't show");
            a(IntentActions.ACTION_REWARDED_VIDEO_PLAYFAIL, map);
            this.f.a();
        }
        View view = this.F;
        if (view != null) {
            view.setVisibility(0);
            this.F.bringToFront();
        }
        RelativeLayout relativeLayout = this.k;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
            a(IntentActions.ACTION_REWARDED_VIDEO_CLOSE);
        }
        SkipButtonWidget skipButtonWidget = this.J;
        if (skipButtonWidget != null) {
            skipButtonWidget.setVisibility(8);
        }
        VideoButtonWidget videoButtonWidget2 = this.U;
        if (videoButtonWidget2 != null) {
            videoButtonWidget2.setVisibility(8);
        }
        if (this.Z) {
            this.H.setVisibility(8);
        }
        CompanionAdsWidget companionAdsWidget = this.Y;
        if (companionAdsWidget != null) {
            companionAdsWidget.setVisibility(8);
        }
        this.R = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        c cVar = this.L;
        if (cVar != null) {
            cVar.a(50L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        c cVar = this.L;
        if (cVar != null) {
            cVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xmlywind.sdk.videoAd.h.10
            @Override // java.lang.Runnable
            public void run() {
                h.this.a(IntentActions.ACTION_INTERSTITIAL_CLICK);
            }
        });
    }

    private View a(Context context, g gVar, int i) {
        m.a.a(context);
        if (gVar == null) {
            View view = new View(context);
            view.setVisibility(4);
            return view;
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setGravity(17);
        j().addView(relativeLayout, 0, new RelativeLayout.LayoutParams(-1, -1));
        CreativeWebView creativeWebViewA = a(context, gVar);
        creativeWebViewA.setVisibility(i);
        relativeLayout.addView(creativeWebViewA, new LinearLayout.LayoutParams(-1, -1));
        return creativeWebViewA;
    }

    private CreativeWebView a(final Context context, final g gVar) {
        m.a.a(context);
        m.a.a(gVar);
        m.a.a(gVar.a());
        final CreativeWebView creativeWebViewA = CreativeWebView.a(context, this.E.getAd_source_logo(), false, this.E.getInvisibleAdLabel());
        creativeWebViewA.addJavascriptInterface(new a(), "sigVersion");
        creativeWebViewA.setWebViewClickListener(new CreativeWebView.a() { // from class: com.xmlywind.sdk.videoAd.h.7
            @Override // com.xmlywind.sdk.base.views.CreativeWebView.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                String str;
                if (h.this.I.getVisibility() != 0 || h.this.T) {
                    SigmobLog.w("ignore invalid click");
                    return;
                }
                t.a(h.this.E, motionEvent2, PointCategory.ENDCARDCLICK, true);
                h hVar = h.this;
                Object[] objArr = new Object[4];
                if (motionEvent == null) {
                    objArr[0] = Integer.valueOf((int) motionEvent2.getRawX());
                    objArr[1] = Integer.valueOf((int) motionEvent2.getRawY());
                    objArr[2] = Integer.valueOf((int) motionEvent2.getRawX());
                    objArr[3] = Integer.valueOf((int) motionEvent2.getRawY());
                    str = String.format("%d,%d,%d,%d", objArr);
                } else {
                    objArr[0] = Integer.valueOf((int) motionEvent.getRawX());
                    objArr[1] = Integer.valueOf((int) motionEvent.getRawY());
                    objArr[2] = Integer.valueOf((int) motionEvent2.getRawX());
                    objArr[3] = Integer.valueOf((int) motionEvent2.getRawY());
                    str = String.format("%d,%d,%d,%d", objArr);
                }
                hVar.g = str;
                SigMacroCommon macroCommon = h.this.E.getMacroCommon();
                if (macroCommon instanceof SigMacroCommon) {
                    macroCommon.addMarcoKey(SigMacroCommon._DOWNX_, String.valueOf((int) motionEvent.getRawX()));
                    macroCommon.addMarcoKey(SigMacroCommon._DOWNY_, String.valueOf((int) motionEvent.getRawY()));
                    macroCommon.addMarcoKey(SigMacroCommon._UPX_, String.valueOf((int) motionEvent2.getRawX()));
                    macroCommon.addMarcoKey(SigMacroCommon._UPY_, String.valueOf((int) motionEvent2.getRawY()));
                }
                h.this.u = true;
                if (h.this.E.getMaterial().click_type.intValue() != i.FullScreen.a() || TextUtils.isEmpty(h.this.E.getMaterial().landing_page) || h.this.E.getMaterial().creative_type.intValue() == j.CreativeTypeVideo_EndCardURL.a()) {
                    h.this.aa = true;
                } else {
                    gVar.a(context, (String) null, com.xmlywind.sdk.base.a.ENDCARD, h.this.a(), h.this.g);
                }
            }
        });
        creativeWebViewA.setDownloadListener(new DownloadListener() { // from class: com.xmlywind.sdk.videoAd.h.8
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (h.this.u) {
                    gVar.c(h.this.E);
                    if (TextUtils.isEmpty(h.this.E.getMaterial().landing_page) || h.this.E.getMaterial().interaction_type.intValue() != 2) {
                        l.a(creativeWebViewA.getContext(), str, h.this.E);
                        BaseAdUnit baseAdUnit = h.this.E;
                        h hVar = h.this;
                        t.a(PointCategory.COMPANION, "click", baseAdUnit, "0", str, hVar.g, hVar.Q);
                        h.this.I();
                    } else {
                        gVar.a(context, (String) null, com.xmlywind.sdk.base.a.ENDCARD, h.this.a(), h.this.g);
                    }
                    SigmobLog.d("onDownloadStart() called with: url = [" + str + "], userAgent = [" + str2 + "], contentDisposition = [" + str3 + "], mimetype = [" + str4 + "], contentLength = [" + j + "]");
                }
            }
        });
        creativeWebViewA.setWebViewClient(new WebViewClient() { // from class: com.xmlywind.sdk.videoAd.h.9
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                SigmobLog.d("onPageFinished: ");
                h.this.o = "done";
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                SigmobLog.d("onPageStarted: ");
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                if (str2.startsWith("http://localhost")) {
                    return;
                }
                h.this.o = "error";
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (Build.VERSION.SDK_INT >= 21) {
                    String host = webResourceRequest.getUrl().getHost();
                    if (TextUtils.isEmpty(host) || !host.equals("localhost")) {
                        return;
                    }
                    h.this.o = "error";
                }
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0088 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:22:0x0090  */
            /* JADX WARN: Code duplicated, block: B:23:0x0092 A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:26:0x00a6 A[Catch: all -> 0x0216, TRY_ENTER, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:33:0x00bc A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:35:0x00d4 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:43:0x0129 A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:46:0x0137 A[Catch: all -> 0x0216, TRY_ENTER, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:65:0x01bf A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:67:0x01c9 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            /* JADX WARN: Code duplicated, block: B:73:0x01e5 A[Catch: all -> 0x0216, TryCatch #0 {all -> 0x0216, blocks: (B:3:0x0004, B:5:0x002a, B:7:0x0034, B:9:0x003c, B:12:0x0045, B:14:0x004d, B:15:0x0055, B:17:0x0067, B:19:0x006d, B:20:0x0088, B:23:0x0092, B:26:0x00a6, B:28:0x00ae, B:30:0x00b4, B:33:0x00bc, B:35:0x00d4, B:37:0x00e6, B:40:0x00ff, B:42:0x0117, B:43:0x0129, B:46:0x0137, B:48:0x0141, B:50:0x014b, B:52:0x0155, B:54:0x015f, B:56:0x0169, B:58:0x0175, B:60:0x0187, B:61:0x019b, B:63:0x01a7, B:64:0x01ac, B:65:0x01bf, B:67:0x01c9, B:69:0x01d3, B:71:0x01dd, B:73:0x01e5, B:74:0x0212), top: B:79:0x0004 }] */
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                try {
                    SigmobLog.d("load url " + str);
                    Context context2 = webView.getContext();
                    Uri uri = Uri.parse(str);
                    if ("sigmobAd".equalsIgnoreCase(uri.getScheme())) {
                        String host = uri.getHost();
                        if (TextUtils.isEmpty(host)) {
                            if (!h.this.T) {
                                if (h.this.E.getMaterial().disable_auto_deeplink.booleanValue() || h.this.u) {
                                    if (h.this.E.getMaterial().click_type.intValue() != i.Button.a() || TextUtils.isEmpty(h.this.E.getMaterial().landing_page) || h.this.E.getMaterial().creative_type.intValue() == j.CreativeTypeVideo_EndCardURL.a()) {
                                        if (h.this.I.getVisibility() == 0 || TextUtils.isEmpty(uri.getScheme()) || uri.getScheme().equals("http") || uri.getScheme().equals("https")) {
                                            if (!TextUtils.isEmpty(uri.getScheme()) && (uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
                                                if (h.this.aa) {
                                                    gVar.c(h.this.E);
                                                    BaseAdUnit baseAdUnit = h.this.E;
                                                    h hVar = h.this;
                                                    t.a(PointCategory.ENDCARD, "click", baseAdUnit, "0", str, hVar.g, hVar.q());
                                                    h.this.I();
                                                    h.this.aa = false;
                                                }
                                                webView.loadUrl(str);
                                            }
                                        } else if (!uri.getScheme().equalsIgnoreCase("sigmobAd") || TextUtils.isEmpty(uri.getHost()) || !uri.getHost().equalsIgnoreCase(WatchFaceApi.SORT_DOWNLOAD) || TextUtils.isEmpty(h.this.E.getMaterial().landing_page)) {
                                            if (TextUtils.isEmpty(gVar.b())) {
                                                gVar.a(str);
                                            }
                                            gVar.a(context2, (String) null, com.xmlywind.sdk.base.a.ENDCARD, h.this.a(), h.this.g);
                                        } else {
                                            gVar.a(context2, str, com.xmlywind.sdk.base.a.ENDCARD, h.this.a(), h.this.g);
                                        }
                                    } else if (h.this.E.getMaterial().click_type.intValue() == i.FullScreen.a()) {
                                        TextUtils.isEmpty(h.this.E.getMaterial().landing_page);
                                    }
                                } else if (!TextUtils.isEmpty(str) && str.startsWith("http")) {
                                    return false;
                                }
                            }
                        } else if ("track".equals(host) || AppMeasurementSdk.ConditionalUserProperty.ACTIVE.equals(host)) {
                            String queryParameter = uri.getQueryParameter("data");
                            String queryParameter2 = uri.getQueryParameter("event");
                            if (!TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(queryParameter)) {
                                final String str2 = new String(Base64.decode(queryParameter, 0), "utf-8");
                                t.a(host, queryParameter2, h.this.E, new t.a() { // from class: com.xmlywind.sdk.videoAd.h.9.1
                                    @Override // com.xmlywind.sdk.base.common.t.a
                                    public void a(Object obj) {
                                        if (obj instanceof PointEntitySigmob) {
                                            ((PointEntitySigmob) obj).setUrl(str2);
                                        }
                                    }
                                });
                            }
                        } else if ("openFourElements".equals(host)) {
                            h.this.b(2);
                        } else if (!h.this.T) {
                            if (h.this.E.getMaterial().disable_auto_deeplink.booleanValue()) {
                                if (h.this.E.getMaterial().click_type.intValue() != i.Button.a()) {
                                    if (h.this.I.getVisibility() == 0) {
                                        if (!TextUtils.isEmpty(uri.getScheme())) {
                                            if (h.this.aa) {
                                                gVar.c(h.this.E);
                                                BaseAdUnit baseAdUnit2 = h.this.E;
                                                h hVar2 = h.this;
                                                t.a(PointCategory.ENDCARD, "click", baseAdUnit2, "0", str, hVar2.g, hVar2.q());
                                                h.this.I();
                                                h.this.aa = false;
                                            }
                                            webView.loadUrl(str);
                                        }
                                    } else if (!TextUtils.isEmpty(uri.getScheme())) {
                                        if (h.this.aa) {
                                            gVar.c(h.this.E);
                                            BaseAdUnit baseAdUnit3 = h.this.E;
                                            h hVar3 = h.this;
                                            t.a(PointCategory.ENDCARD, "click", baseAdUnit3, "0", str, hVar3.g, hVar3.q());
                                            h.this.I();
                                            h.this.aa = false;
                                        }
                                        webView.loadUrl(str);
                                    }
                                } else if (h.this.I.getVisibility() == 0) {
                                    if (!TextUtils.isEmpty(uri.getScheme())) {
                                        if (h.this.aa) {
                                            gVar.c(h.this.E);
                                            BaseAdUnit baseAdUnit4 = h.this.E;
                                            h hVar4 = h.this;
                                            t.a(PointCategory.ENDCARD, "click", baseAdUnit4, "0", str, hVar4.g, hVar4.q());
                                            h.this.I();
                                            h.this.aa = false;
                                        }
                                        webView.loadUrl(str);
                                    }
                                } else if (!TextUtils.isEmpty(uri.getScheme())) {
                                    if (h.this.aa) {
                                        gVar.c(h.this.E);
                                        BaseAdUnit baseAdUnit5 = h.this.E;
                                        h hVar5 = h.this;
                                        t.a(PointCategory.ENDCARD, "click", baseAdUnit5, "0", str, hVar5.g, hVar5.q());
                                        h.this.I();
                                        h.this.aa = false;
                                    }
                                    webView.loadUrl(str);
                                }
                            } else if (h.this.E.getMaterial().click_type.intValue() != i.Button.a()) {
                                if (h.this.I.getVisibility() == 0) {
                                    if (!TextUtils.isEmpty(uri.getScheme())) {
                                        if (h.this.aa) {
                                            gVar.c(h.this.E);
                                            BaseAdUnit baseAdUnit6 = h.this.E;
                                            h hVar6 = h.this;
                                            t.a(PointCategory.ENDCARD, "click", baseAdUnit6, "0", str, hVar6.g, hVar6.q());
                                            h.this.I();
                                            h.this.aa = false;
                                        }
                                        webView.loadUrl(str);
                                    }
                                } else if (!TextUtils.isEmpty(uri.getScheme())) {
                                    if (h.this.aa) {
                                        gVar.c(h.this.E);
                                        BaseAdUnit baseAdUnit7 = h.this.E;
                                        h hVar7 = h.this;
                                        t.a(PointCategory.ENDCARD, "click", baseAdUnit7, "0", str, hVar7.g, hVar7.q());
                                        h.this.I();
                                        h.this.aa = false;
                                    }
                                    webView.loadUrl(str);
                                }
                            } else if (h.this.I.getVisibility() == 0) {
                                if (!TextUtils.isEmpty(uri.getScheme())) {
                                    if (h.this.aa) {
                                        gVar.c(h.this.E);
                                        BaseAdUnit baseAdUnit8 = h.this.E;
                                        h hVar8 = h.this;
                                        t.a(PointCategory.ENDCARD, "click", baseAdUnit8, "0", str, hVar8.g, hVar8.q());
                                        h.this.I();
                                        h.this.aa = false;
                                    }
                                    webView.loadUrl(str);
                                }
                            } else if (!TextUtils.isEmpty(uri.getScheme())) {
                                if (h.this.aa) {
                                    gVar.c(h.this.E);
                                    BaseAdUnit baseAdUnit9 = h.this.E;
                                    h hVar9 = h.this;
                                    t.a(PointCategory.ENDCARD, "click", baseAdUnit9, "0", str, hVar9.g, hVar9.q());
                                    h.this.I();
                                    h.this.aa = false;
                                }
                                webView.loadUrl(str);
                            }
                        }
                    } else if (!h.this.T) {
                        if (h.this.E.getMaterial().disable_auto_deeplink.booleanValue()) {
                            if (h.this.E.getMaterial().click_type.intValue() != i.Button.a()) {
                                if (h.this.I.getVisibility() == 0) {
                                    if (!TextUtils.isEmpty(uri.getScheme())) {
                                        if (h.this.aa) {
                                            gVar.c(h.this.E);
                                            BaseAdUnit baseAdUnit10 = h.this.E;
                                            h hVar10 = h.this;
                                            t.a(PointCategory.ENDCARD, "click", baseAdUnit10, "0", str, hVar10.g, hVar10.q());
                                            h.this.I();
                                            h.this.aa = false;
                                        }
                                        webView.loadUrl(str);
                                    }
                                } else if (!TextUtils.isEmpty(uri.getScheme())) {
                                    if (h.this.aa) {
                                        gVar.c(h.this.E);
                                        BaseAdUnit baseAdUnit11 = h.this.E;
                                        h hVar11 = h.this;
                                        t.a(PointCategory.ENDCARD, "click", baseAdUnit11, "0", str, hVar11.g, hVar11.q());
                                        h.this.I();
                                        h.this.aa = false;
                                    }
                                    webView.loadUrl(str);
                                }
                            } else if (h.this.I.getVisibility() == 0) {
                                if (!TextUtils.isEmpty(uri.getScheme())) {
                                    if (h.this.aa) {
                                        gVar.c(h.this.E);
                                        BaseAdUnit baseAdUnit12 = h.this.E;
                                        h hVar12 = h.this;
                                        t.a(PointCategory.ENDCARD, "click", baseAdUnit12, "0", str, hVar12.g, hVar12.q());
                                        h.this.I();
                                        h.this.aa = false;
                                    }
                                    webView.loadUrl(str);
                                }
                            } else if (!TextUtils.isEmpty(uri.getScheme())) {
                                if (h.this.aa) {
                                    gVar.c(h.this.E);
                                    BaseAdUnit baseAdUnit13 = h.this.E;
                                    h hVar13 = h.this;
                                    t.a(PointCategory.ENDCARD, "click", baseAdUnit13, "0", str, hVar13.g, hVar13.q());
                                    h.this.I();
                                    h.this.aa = false;
                                }
                                webView.loadUrl(str);
                            }
                        } else if (h.this.E.getMaterial().click_type.intValue() != i.Button.a()) {
                            if (h.this.I.getVisibility() == 0) {
                                if (!TextUtils.isEmpty(uri.getScheme())) {
                                    if (h.this.aa) {
                                        gVar.c(h.this.E);
                                        BaseAdUnit baseAdUnit14 = h.this.E;
                                        h hVar14 = h.this;
                                        t.a(PointCategory.ENDCARD, "click", baseAdUnit14, "0", str, hVar14.g, hVar14.q());
                                        h.this.I();
                                        h.this.aa = false;
                                    }
                                    webView.loadUrl(str);
                                }
                            } else if (!TextUtils.isEmpty(uri.getScheme())) {
                                if (h.this.aa) {
                                    gVar.c(h.this.E);
                                    BaseAdUnit baseAdUnit15 = h.this.E;
                                    h hVar15 = h.this;
                                    t.a(PointCategory.ENDCARD, "click", baseAdUnit15, "0", str, hVar15.g, hVar15.q());
                                    h.this.I();
                                    h.this.aa = false;
                                }
                                webView.loadUrl(str);
                            }
                        } else if (h.this.I.getVisibility() == 0) {
                            if (!TextUtils.isEmpty(uri.getScheme())) {
                                if (h.this.aa) {
                                    gVar.c(h.this.E);
                                    BaseAdUnit baseAdUnit16 = h.this.E;
                                    h hVar16 = h.this;
                                    t.a(PointCategory.ENDCARD, "click", baseAdUnit16, "0", str, hVar16.g, hVar16.q());
                                    h.this.I();
                                    h.this.aa = false;
                                }
                                webView.loadUrl(str);
                            }
                        } else if (!TextUtils.isEmpty(uri.getScheme())) {
                            if (h.this.aa) {
                                gVar.c(h.this.E);
                                BaseAdUnit baseAdUnit17 = h.this.E;
                                h hVar17 = h.this;
                                t.a(PointCategory.ENDCARD, "click", baseAdUnit17, "0", str, hVar17.g, hVar17.q());
                                h.this.I();
                                h.this.aa = false;
                            }
                            webView.loadUrl(str);
                        }
                    }
                } catch (Throwable unused) {
                    h.this.c_();
                    SigmobLog.e("webview");
                }
                return true;
            }
        });
        gVar.a().a(creativeWebViewA);
        return creativeWebViewA;
    }

    private BaseVideoView a(Context context, int i) {
        if (this.B.a() == null) {
            throw new IllegalStateException("BaseVideoConfig does not have a video disk path");
        }
        final BaseVideoView baseVideoView = new BaseVideoView(context);
        baseVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.xmlywind.sdk.videoAd.h.16
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                h.this.Q = mediaPlayer.getDuration();
                if (h.this.K != null) {
                    h.this.K.a(h.this.Q);
                }
                mediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.xmlywind.sdk.videoAd.h.16.1
                    @Override // android.media.MediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(MediaPlayer mediaPlayer2) {
                        if (h.this.O) {
                            return;
                        }
                        if ((h.this.x == null || h.this.x.getVisibility() != 0) && !h.this.ag) {
                            h.this.y();
                            mediaPlayer2.start();
                            SigmobLog.i("mediaplayer omPrepared start");
                        }
                    }
                });
                if (h.this.ac > 0) {
                    SigmobLog.i("seek to " + (h.this.ac / 1000));
                    mediaPlayer.seekTo(h.this.ac + (-500));
                } else {
                    SigmobLog.i("seek to 0");
                    mediaPlayer.seekTo(0);
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 3) {
                    mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.xmlywind.sdk.videoAd.h.16.2
                        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                        public void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i3, int i4) {
                            baseVideoView.a(mediaPlayer2.getVideoWidth(), mediaPlayer2.getVideoHeight());
                            baseVideoView.requestLayout();
                        }
                    });
                }
                if (i2 >= 16) {
                    try {
                        String strConcat = "";
                        for (MediaPlayer.TrackInfo trackInfo : mediaPlayer.getTrackInfo()) {
                            strConcat = strConcat.concat(trackInfo.toString());
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (h.this.V) {
                    h.this.U.a(com.xmlywind.sdk.base.views.d.SOUND_MUTE.a());
                    h.this.D.setVolume(0.0f);
                }
                h.this.m().a(h.this.Q, h.this.B.d());
                if (!h.this.O && (h.this.N == 0 || h.this.N == -1)) {
                    SigMacroCommon macroCommon = h.this.E.getMacroCommon();
                    if (macroCommon instanceof SigMacroCommon) {
                        macroCommon.addMarcoKey(SigMacroCommon._COMPLETED_, "0");
                        macroCommon.addMarcoKey(SigMacroCommon._VIDEOTIME_, String.valueOf(h.this.Q / 1000));
                    }
                }
                h.this.C();
                if (h.this.Z) {
                    h.this.H.a(h.this.q(), 0);
                }
                mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.xmlywind.sdk.videoAd.h.16.3
                    @Override // android.media.MediaPlayer.OnInfoListener
                    public boolean onInfo(MediaPlayer mediaPlayer2, int i3, int i4) {
                        String str;
                        if (h.this.m && mediaPlayer2.isPlaying()) {
                            if (i3 == 3) {
                                mediaPlayer2.start();
                                str = "mediaplayer onInfo start";
                            } else if (i3 == 804 && !h.this.ab) {
                                h.this.x();
                                h.this.ab = true;
                                h.this.ac = mediaPlayer2.getCurrentPosition();
                                h.this.H();
                                baseVideoView.pause();
                                str = "videoView.pause()";
                            }
                            SigmobLog.i(str);
                        }
                        return true;
                    }
                });
            }
        });
        try {
            if (!this.w) {
                baseVideoView.a.setDataSource(this.B.a());
                this.j = b(context);
            }
        } catch (Throwable unused) {
        }
        baseVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.xmlywind.sdk.videoAd.h.17
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                if (h.this.m && (h.this.ab || h.this.B() < 0.5f)) {
                    h.this.x();
                } else {
                    h.this.s = "none";
                    h.this.a(true);
                }
            }
        });
        baseVideoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.xmlywind.sdk.videoAd.h.18
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                SigmobLog.e(String.format("what %d, extra %d", Integer.valueOf(i2), Integer.valueOf(i3)));
                if (h.this.m) {
                    h.this.x();
                    h.this.ab = true;
                    h.this.ac = mediaPlayer.getCurrentPosition();
                    h.this.H();
                    baseVideoView.pause();
                    SigmobLog.i("videoView.pause()");
                    return true;
                }
                h.this.P = true;
                h.this.m().a(com.xmlywind.sdk.base.common.a.AD_ERROR, h.this.r());
                h.this.H();
                h.this.F();
                String strConcat = "";
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        for (MediaPlayer.TrackInfo trackInfo : mediaPlayer.getTrackInfo()) {
                            strConcat = strConcat.concat(trackInfo.toString());
                        }
                    }
                } catch (Throwable unused2) {
                }
                h.this.B.a(h.this.i(), strConcat + String.format("what %d, extra %d", Integer.valueOf(i2), Integer.valueOf(i3)), h.this.E, "video", h.this.r());
                HashMap map = new HashMap();
                map.put("error", "ad_unit_key Serializable is null");
                h.this.a(IntentActions.ACTION_REWARDED_VIDEO_PLAYFAIL, map);
                h.this.h().a();
                return false;
            }
        });
        if (this.E.isVideoExist()) {
            baseVideoView.setVideoURI(Uri.fromFile(new File(this.B.a())));
        } else {
            this.m = true;
            com.xmlywind.sdk.base.common.d.f().a(this.E, null);
            com.xmlywind.sdk.base.common.d.f().a(this);
        }
        baseVideoView.setVisibility(i);
        return baseVideoView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(List<String> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sb.append(JsonLexerKt.BEGIN_LIST);
        do {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(list.get(i));
            i++;
        } while (i < list.size());
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        try {
            SigmobLog.d("get video image begin" + System.currentTimeMillis());
            Bitmap frameAtTime = this.D.a.getFrameAtTime((long) (i * 1000), 2);
            SigmobLog.d("get video image end" + System.currentTimeMillis());
            this.j.setScaleType(ImageView.ScaleType.FIT_XY);
            this.j.setImageBitmap(frameAtTime);
        } catch (RuntimeException e) {
            SigmobLog.e(e.getMessage());
        }
    }

    private void a(int i, RelativeLayout.LayoutParams layoutParams) {
        int iB = com.xmlywind.sdk.common.utils.c.b(10.0f, this.b);
        layoutParams.addRule(10);
        VideoButtonWidget videoButtonWidget = this.U;
        if (videoButtonWidget != null) {
            layoutParams.addRule(i, videoButtonWidget.getId());
            layoutParams.setMargins(0, iB * 2, 0, 0);
        } else {
            layoutParams.addRule(i, videoButtonWidget.getId());
            layoutParams.setMargins(iB, iB * 2, iB, iB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        SkipButtonWidget skipButtonWidget = this.J;
        if (skipButtonWidget == null || skipButtonWidget.a()) {
            return;
        }
        this.J.b();
        m().a(z, i);
        m().a(com.xmlywind.sdk.base.common.a.AD_SHOW_SKIP, i);
    }

    private ImageView b(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (this.af == null) {
            com.xmlywind.sdk.base.views.e eVar = new com.xmlywind.sdk.base.views.e(k(), this.E);
            this.af = eVar;
            eVar.a(new com.xmlywind.sdk.base.views.e.b() { // from class: com.xmlywind.sdk.videoAd.h.6
                @Override // com.xmlywind.sdk.base.views.e.b
                public void a() {
                    if (h.this.af != null) {
                        h.this.af.dismiss();
                        h.this.af.c();
                        h.this.af = null;
                        h.this.ag = false;
                    }
                    if (h.this.D != null && i == 1) {
                        h.this.D.start();
                    }
                    h.this.m().a(com.xmlywind.sdk.base.common.a.AD_FOUR_ELEMENTS_CLOSE, h.this.r());
                }

                @Override // com.xmlywind.sdk.base.views.e.b
                public void a(String str, String str2) {
                    if (h.this.K == null) {
                        h.this.s();
                    }
                    if (h.this.K != null) {
                        String landing_page = h.this.a().getLanding_page();
                        h.this.B.a(h.this.a(), (Context) h.this.k(), TextUtils.isEmpty(landing_page) ? str : landing_page, com.xmlywind.sdk.base.a.ENDCARD, str2, true);
                    }
                }

                @Override // com.xmlywind.sdk.base.views.e.b
                public void b() {
                    if (h.this.D != null && h.this.D.isPlaying() && i == 1) {
                        h.this.D.pause();
                    }
                    h.this.m().a(com.xmlywind.sdk.base.common.a.AD_FOUR_ELEMENTS_SHOW, h.this.r());
                }
            });
        }
        com.xmlywind.sdk.base.views.e eVar2 = this.af;
        if (eVar2 == null || !eVar2.a() || this.ag) {
            return;
        }
        this.af.show();
        this.ag = true;
    }

    private void b(int i, RelativeLayout.LayoutParams layoutParams) {
        int i2;
        int iB = com.xmlywind.sdk.common.utils.c.b(10.0f, this.b);
        if (i == 1 || i == 2) {
            layoutParams.addRule(10);
            i2 = 9;
        } else {
            if (i != 3 && i != 4) {
                return;
            }
            layoutParams.addRule(10);
            i2 = 11;
        }
        layoutParams.addRule(i2);
        layoutParams.setMargins(iB, iB * 2, iB, iB);
    }

    private void b(Context context, int i) {
        VideoProgressBarWidget videoProgressBarWidget = new VideoProgressBarWidget(context);
        this.H = videoProgressBarWidget;
        videoProgressBarWidget.setAnchorId(this.D.getId());
        this.H.setVisibility(i);
        j().addView(this.H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, int i) {
        if (this.x != null) {
            return;
        }
        AlertDialogWidget alertDialogWidget = new AlertDialogWidget(context, this.B.l());
        this.x = alertDialogWidget;
        alertDialogWidget.setVisibility(i);
        j().addView(this.x);
        this.x.setDialogListener(new AlertDialogWidget.a() { // from class: com.xmlywind.sdk.videoAd.h.20
            @Override // com.xmlywind.sdk.base.views.AlertDialogWidget.a
            public void a() {
                if (!h.this.O) {
                    h.this.m().a(com.xmlywind.sdk.base.common.a.AD_SKIP, h.this.r());
                    h.this.B.b(h.this.b, h.this.r(), h.this.q(), h.this.E);
                }
                h.this.x.setVisibility(8);
                if (h.this.Y != null && h.this.Y.getFourElementsLayout() != null) {
                    h.this.Y.getFourElementsLayout().setClickable(true);
                }
                if (h.this.B.e()) {
                    h.this.h().a();
                    return;
                }
                if (!h.this.w) {
                    h hVar = h.this;
                    hVar.a(hVar.r());
                }
                h.this.D.stopPlayback();
                h.this.H();
                h.this.F();
                h.this.O = true;
                if (h.this.K != null) {
                    h.this.K.a(h.this.i(), h.this.r(), h.this.a(), h.this.y);
                }
            }

            @Override // com.xmlywind.sdk.base.views.AlertDialogWidget.a
            public void b() {
                h.this.D.start();
                h.this.x.setVisibility(8);
                if (h.this.Y == null || h.this.Y.getFourElementsLayout() == null) {
                    return;
                }
                h.this.Y.getFourElementsLayout().setClickable(true);
            }
        });
    }

    private void d(final Context context, int i) {
        int iArgb;
        int i2;
        int i3;
        int i4;
        int i5;
        int iIntValue;
        boolean z;
        CompanionEndcard companionEndcard = this.E.getMaterial().companion;
        if (companionEndcard == null || TextUtils.isEmpty(companionEndcard.icon_url) || TextUtils.isEmpty(companionEndcard.title) || (TextUtils.isEmpty(companionEndcard.desc) && companionEndcard.score.floatValue() < 1.0f)) {
            SigmobLog.e("ompanionEnd lose informations of UI Display");
            return;
        }
        int iArgb2 = com.xmlywind.sdk.base.views.c.a;
        int iFloatValue = AppletConfig.DEFAULT_DEVICE_SOURCE;
        int iRgb = -1;
        try {
            Color color = companionEndcard.button_color;
            if (color != null && color.alpha.floatValue() > 0.01d) {
                try {
                    iArgb2 = android.graphics.Color.argb((int) (companionEndcard.button_color.alpha.floatValue() * 255.0f), companionEndcard.button_color.red.intValue(), companionEndcard.button_color.green.intValue(), companionEndcard.button_color.blue.intValue());
                } catch (Throwable unused) {
                }
            }
            Color color2 = companionEndcard.button_text_color;
            if (color2 == null || color2.alpha.floatValue() <= 0.01d) {
                iArgb = -1;
            } else {
                try {
                    iArgb = android.graphics.Color.argb((int) (companionEndcard.button_text_color.alpha.floatValue() * 255.0f), companionEndcard.button_text_color.red.intValue(), companionEndcard.button_text_color.green.intValue(), companionEndcard.button_text_color.blue.intValue());
                } catch (Throwable unused2) {
                    iArgb = -1;
                }
            }
            try {
                Color color3 = companionEndcard.bar_color;
                if (color3 != null && color3.alpha.floatValue() > 0.01d) {
                    try {
                        iFloatValue = (int) (companionEndcard.bar_color.alpha.floatValue() * 255.0f);
                        iRgb = android.graphics.Color.rgb(companionEndcard.button_text_color.red.intValue(), companionEndcard.button_text_color.green.intValue(), companionEndcard.button_text_color.blue.intValue());
                    } catch (Throwable unused3) {
                    }
                }
                i2 = iArgb2;
                i5 = iFloatValue;
                i4 = iRgb;
                i3 = iArgb;
            } catch (Throwable unused4) {
                i2 = iArgb2;
                i3 = iArgb;
                i4 = -1;
                i5 = AppletConfig.DEFAULT_DEVICE_SOURCE;
            }
        } catch (Throwable unused5) {
            iArgb = -1;
        }
        try {
            Integer num = companionEndcard.click_type;
            iIntValue = num != null ? num.intValue() : 0;
        } catch (Throwable unused6) {
        }
        String str = companionEndcard.button_text;
        if (TextUtils.isEmpty(str) || str.length() > 4) {
            str = a().getMaterial().interaction_type.intValue() == 2 ? "下载" : "详情";
        }
        CompanionAdsWidget companionAdsWidget = new CompanionAdsWidget(context, this.E, companionEndcard.title, str, companionEndcard.score.floatValue(), companionEndcard.desc, companionEndcard.animate_type.intValue(), this.E.getMaterial().template_type.intValue(), companionEndcard.icon_url, i2, i3, iIntValue, i4, i5, 70.0f);
        this.Y = companionAdsWidget;
        companionAdsWidget.setId(com.xmlywind.sdk.common.a.r());
        LinearLayout fourElementsLayout = this.Y.getFourElementsLayout();
        if (fourElementsLayout != null) {
            fourElementsLayout.setClickable(true);
            fourElementsLayout.setOnClickListener(new View.OnClickListener() { // from class: com.xmlywind.sdk.videoAd.h.21
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    h.this.b(1);
                }
            });
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) * 3) / 5, com.xmlywind.sdk.common.utils.c.c(70.0f, context));
        int iC = com.xmlywind.sdk.common.utils.c.c(8.0f, context);
        if (this.i != null) {
            z = false;
            layoutParams.setMargins(iC, 0, iC, 0);
            layoutParams.addRule(11);
            layoutParams.addRule(2, this.i.getId());
        } else {
            z = false;
            layoutParams.setMargins(iC, 0, iC, this.l + iC);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
        }
        j().addView(this.Y, layoutParams);
        this.A = z;
        this.Y.setClickable(true);
        this.Y.setOnTouchListener(new View.OnTouchListener() { // from class: com.xmlywind.sdk.videoAd.h.22
            public MotionEvent a;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                SigmobLog.d("mCompanionAdsWidget click" + motionEvent.toString());
                if (motionEvent.getAction() == 1) {
                    t.a(h.this.E, motionEvent, com.xmlywind.sdk.base.common.a.AD_COMPANION_CLICK.a(), true);
                    if (this.a == null) {
                        this.a = motionEvent;
                    }
                    SigMacroCommon macroCommon = h.this.E.getMacroCommon();
                    if (macroCommon instanceof SigMacroCommon) {
                        macroCommon.addMarcoKey(SigMacroCommon._PROGRESS_, String.valueOf((h.this.r() * 100) / h.this.q()));
                        macroCommon.addMarcoKey(SigMacroCommon._DOWNX_, String.valueOf((int) this.a.getRawX()));
                        macroCommon.addMarcoKey(SigMacroCommon._DOWNY_, String.valueOf((int) this.a.getRawY()));
                        macroCommon.addMarcoKey(SigMacroCommon._UPX_, String.valueOf((int) motionEvent.getRawX()));
                        macroCommon.addMarcoKey(SigMacroCommon._UPY_, String.valueOf((int) motionEvent.getRawY()));
                    }
                    h.this.g = String.format("%d,%d,%d,%d", Integer.valueOf((int) this.a.getRawX()), Integer.valueOf((int) this.a.getRawY()), Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY()));
                    if (h.this.K == null) {
                        h.this.s();
                    }
                    if (h.this.K != null) {
                        h.this.K.b(context, h.this.a().getLanding_page(), com.xmlywind.sdk.base.a.COMPANION, h.this.a(), h.this.g);
                    }
                } else if (motionEvent.getAction() == 0) {
                    this.a = MotionEvent.obtain(motionEvent);
                }
                return true;
            }
        });
    }

    private void e(Context context, int i) {
        if (this.I != null) {
            return;
        }
        VideoButtonWidget videoButtonWidget = new VideoButtonWidget(context, this.B.f());
        this.I = videoButtonWidget;
        videoButtonWidget.setVisibility(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.xmlywind.sdk.common.utils.c.b(30.0f, context), com.xmlywind.sdk.common.utils.c.b(30.0f, context));
        b(this.B.f(), layoutParams);
        j().addView(this.I, layoutParams);
        if (!TextUtils.isEmpty(this.E.getCloseCardHtmlData()) && !this.K.c()) {
            com.xmlywind.sdk.base.views.g gVar = new com.xmlywind.sdk.base.views.g(k(), this.t, this.E, this.B);
            this.ad = gVar;
            gVar.a(new com.xmlywind.sdk.base.views.g.a() { // from class: com.xmlywind.sdk.videoAd.h.2
                @Override // com.xmlywind.sdk.base.views.g.a
                public void a() {
                    if (h.this.ad != null) {
                        h.this.ad.dismiss();
                        h.this.ad.c();
                    }
                    h.this.T = true;
                    h.this.B.b(h.this.i(), h.this.q(), h.this.E);
                    h.this.h().a();
                }
            });
        }
        this.I.setOnTouchListener(new View.OnTouchListener() { // from class: com.xmlywind.sdk.videoAd.h.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (h.this.K.c() || h.this.ad == null || h.this.ad.a() || h.this.ae) {
                        h.this.T = true;
                        h.this.B.b(h.this.i(), h.this.q(), h.this.E);
                        h.this.h().a();
                    } else {
                        h.this.ad.show();
                        h.this.ae = true;
                    }
                }
                return true;
            }
        });
        this.I.a(this.E);
        String strB = this.B.b();
        if (strB != null) {
            this.I.a(strB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    private void f(final Context context, int i) {
        SkipButtonWidget skipButtonWidget = new SkipButtonWidget(context);
        this.J = skipButtonWidget;
        skipButtonWidget.setId(com.xmlywind.sdk.common.a.r());
        this.J.setVisibility(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.B.h() <= 2) {
            if (this.B.g() <= 2) {
                a(1, layoutParams);
            } else {
                b(this.B.g(), layoutParams);
            }
        } else if (this.B.g() > 2) {
            a(0, layoutParams);
        } else {
            b(this.B.g(), layoutParams);
        }
        j().addView(this.J, layoutParams);
        this.J.setOnClickListener(new View.OnClickListener() { // from class: com.xmlywind.sdk.videoAd.h.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (h.this.J.a()) {
                    h.this.m().a(com.xmlywind.sdk.base.common.a.AD_CLICK_SKIP, h.this.r());
                    if (h.this.W || h.this.E.getAd_type() == 4) {
                        h.this.m().a(com.xmlywind.sdk.base.common.a.AD_SKIP, h.this.r());
                        h.this.B.b(h.this.b, h.this.r(), h.this.q(), h.this.E);
                        h.this.a(false);
                        return;
                    }
                    h.this.D.pause();
                    SigmobLog.i("videoView.pause()");
                    if (h.this.x == null) {
                        h.this.c(context, 4);
                    }
                    h.this.x.setduration(h.this.J.getTime());
                    h.this.x.setVisibility(0);
                    if (h.this.Y == null || h.this.Y.getFourElementsLayout() == null) {
                        return;
                    }
                    h.this.Y.getFourElementsLayout().setClickable(false);
                }
            }
        });
        if ((this.B.m() != 0 || this.B.n() >= 0) && this.B.n() != 0) {
            return;
        }
        a(0, false);
    }

    private void g(Context context, int i) {
        VideoButtonWidget videoButtonWidget = new VideoButtonWidget(context, this.B.h());
        this.U = videoButtonWidget;
        videoButtonWidget.setId(com.xmlywind.sdk.common.a.r());
        this.U.setVisibility(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.xmlywind.sdk.common.utils.c.b(30.0f, context), com.xmlywind.sdk.common.utils.c.b(30.0f, context));
        b(this.B.h(), layoutParams);
        j().addView(this.U, layoutParams);
        this.U.setOnTouchListener(new View.OnTouchListener() { // from class: com.xmlywind.sdk.videoAd.h.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                BaseVideoView baseVideoView;
                float f;
                if (motionEvent.getAction() == 1) {
                    if (h.this.V) {
                        h.this.m().a(com.xmlywind.sdk.base.common.a.AD_UNMUTE, h.this.r());
                        h.this.U.a(com.xmlywind.sdk.base.views.d.SOUND_ON.a());
                        baseVideoView = h.this.D;
                        f = 1.0f;
                    } else {
                        h.this.m().a(com.xmlywind.sdk.base.common.a.AD_MUTE, h.this.r());
                        h.this.U.a(com.xmlywind.sdk.base.views.d.SOUND_MUTE.a());
                        baseVideoView = h.this.D;
                        f = 0.0f;
                    }
                    baseVideoView.setVolume(f);
                    h hVar = h.this;
                    hVar.V = !hVar.V;
                }
                return true;
            }
        });
        if (this.B.j() == 0) {
            this.U.a(com.xmlywind.sdk.base.views.d.SOUND_ON.a());
            return;
        }
        this.U.a(com.xmlywind.sdk.base.views.d.SOUND_MUTE.a());
        this.D.setVolume(0.0f);
        this.V = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        RelativeLayout relativeLayout = this.S;
        if (relativeLayout == null || relativeLayout.getVisibility() == 0) {
            return;
        }
        this.r = System.currentTimeMillis();
        this.S.setVisibility(0);
        this.s = "loading";
        int i = this.n + 1;
        this.n = i;
        if (i > 2) {
            a(r(), true);
        } else {
            this.v.postDelayed(new Runnable() { // from class: com.xmlywind.sdk.videoAd.h.12
                @Override // java.lang.Runnable
                public void run() {
                    h.this.v.removeCallbacksAndMessages(null);
                    h hVar = h.this;
                    hVar.a(hVar.r(), true);
                }
            }, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    public void y() {
        RelativeLayout relativeLayout = this.S;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            return;
        }
        this.p.add(String.format(TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis() - this.r)));
        this.q.add(String.format("%.2f", Float.valueOf(r() / 1000.0f)));
        this.s = "play";
        this.v.removeCallbacksAndMessages(null);
        this.S.setVisibility(4);
    }

    private void z() {
        try {
            if (this.O) {
                return;
            }
            G();
            if (this.N > 0) {
                m().a(com.xmlywind.sdk.base.common.a.AD_PLAYING, this.N);
                SigmobLog.d("video seek to " + this.N);
                this.D.seekTo(this.N);
            } else {
                m().a(com.xmlywind.sdk.base.common.a.AD_PLAY_LOAD, r());
            }
            AlertDialogWidget alertDialogWidget = this.x;
            if ((alertDialogWidget == null || alertDialogWidget.getVisibility() != 0) && !this.ag) {
                this.D.start();
            }
            if (this.N != -1) {
                this.B.a(i(), this.N);
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    @Override // com.xmlywind.sdk.base.common.d.a
    public BaseAdUnit a() {
        return this.E;
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            h().a();
        }
    }

    public void a(Context context) {
        this.S = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(com.xmlywind.sdk.base.views.d.LOADING.a());
        imageView.setId(com.xmlywind.sdk.common.a.r());
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 3600000, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(GmsVersion.VERSION_SAGA);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        imageView.setAnimation(rotateAnimation);
        this.S.addView(imageView, layoutParams);
        this.S.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        j().addView(this.S, layoutParams2);
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void a(Configuration configuration) {
        if (this.B != null && this.K == null) {
            g gVarD = com.xmlywind.sdk.videoAd.a.d(this.E);
            this.K = gVarD;
            gVarD.a(this.B);
        }
        if (m() != null) {
            m().a(com.xmlywind.sdk.base.common.a.AD_ROTATION, r());
        }
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void a(Bundle bundle) {
        try {
            bundle.putBoolean("video_finished", this.O);
            bundle.putInt("current_position", this.N);
            bundle.putBoolean("companionAd_visable", this.R);
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    public void a(com.xmlywind.sdk.base.common.a aVar) {
        if (com.xmlywind.sdk.base.common.a.AD_START.equals(aVar)) {
            a(IntentActions.ACTION_REWARDED_VIDEO_PLAY);
        }
        if (m() != null) {
            m().a(aVar, r());
        }
    }

    @Override // com.xmlywind.sdk.base.common.d.a
    public void a(BaseAdUnit baseAdUnit) {
        if (baseAdUnit.getUuid().equals(this.E.getUuid())) {
            SigmobLog.d("cache_video_ready() called");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xmlywind.sdk.videoAd.h.11
                @Override // java.lang.Runnable
                public void run() {
                    BaseVideoView baseVideoView;
                    Uri uriFromFile;
                    try {
                        if (new File(h.this.E.getVideoPath()).exists()) {
                            baseVideoView = h.this.D;
                            uriFromFile = Uri.fromFile(new File(h.this.E.getVideoPath()));
                        } else {
                            baseVideoView = h.this.D;
                            uriFromFile = Uri.fromFile(new File(h.this.E.getVideoTmpPath()));
                        }
                        baseVideoView.setVideoURI(uriFromFile);
                    } catch (Throwable th) {
                        SigmobLog.e("cache_video_ready error", th);
                    }
                }
            });
        }
    }

    public void a(boolean z) {
        if (!this.W) {
            b(z);
        }
        if (!this.W && this.B.e()) {
            h().a();
            return;
        }
        if (!this.w) {
            if (z) {
                E();
            } else {
                a(r());
            }
        }
        this.D.stopPlayback();
        H();
        if (z) {
            this.E.getMacroCommon().addMarcoKey(SigMacroCommon._PLAYLASTFRAME_, "1");
            this.B.a(this.b, r(), q(), this.E);
            if (!this.P) {
                m().a(com.xmlywind.sdk.base.common.a.AD_COMPLETE, r());
            }
        }
        F();
        this.O = true;
        g gVar = this.K;
        if (gVar != null) {
            gVar.a(i(), r(), a(), this.y);
        }
    }

    @Override // com.xmlywind.sdk.videoAd.b, com.xmlywind.sdk.base.common.g
    public void b() {
        super.b();
        MaterialMeta material = this.E.getMaterial();
        this.l = com.xmlywind.sdk.common.a.n().ad();
        Activity activityK = k();
        if (this.R) {
            F();
            return;
        }
        if (this.B == null) {
            throw new IllegalStateException("BaseVideoConfig does not have a video disk path");
        }
        if (this.Z) {
            b(activityK, 4);
        }
        Boolean bool = material.has_companion_endcard;
        if (bool != null && bool.booleanValue() && material.companion != null) {
            d(activityK, 4);
            this.z = material.companion.show_delay_secs.intValue();
        }
        g(activityK, 0);
        f(activityK, 0);
        this.L = new c(this, this.B, new Handler(Looper.getMainLooper()));
    }

    @Override // com.xmlywind.sdk.base.common.d.a
    public void b(BaseAdUnit baseAdUnit) {
        if (baseAdUnit.getUuid().equals(this.E.getUuid())) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xmlywind.sdk.videoAd.h.13
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        h hVar = h.this;
                        hVar.ac = hVar.r();
                        SigmobLog.d("cache_video_Success() called " + h.this.ac);
                        h.this.m = false;
                        h.this.ab = false;
                        h.this.D.pause();
                        h.this.H();
                        h.this.D.setVideoURI(Uri.fromFile(new File(h.this.E.getVideoPath())));
                        h.this.G();
                    } catch (Throwable th) {
                        SigmobLog.e("cache_video_ready error", th);
                    }
                }
            });
        }
    }

    public void b(boolean z) {
        if (this.E.getAd_type() == 4) {
            return;
        }
        this.W = true;
        int iQ = z ? q() : r();
        a(IntentActions.ACTION_REWARDED_VIDEO_COMPLETE);
        m().a(com.xmlywind.sdk.base.common.a.AD_FINISH, iQ);
        this.B.c(i().getApplicationContext(), iQ, q(), a());
    }

    @Override // com.xmlywind.sdk.videoAd.g.a
    public void b_() {
        I();
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void c() {
        if (this.T) {
            a(IntentActions.ACTION_INTERSTITIAL_DISMISS);
        } else {
            if (this.R) {
                return;
            }
            A();
        }
    }

    @Override // com.xmlywind.sdk.base.common.d.a
    public void c(BaseAdUnit baseAdUnit) {
        if (baseAdUnit.getUuid().equals(this.E.getUuid())) {
            com.xmlywind.sdk.base.common.d.f().a(baseAdUnit, null);
            H();
            SigmobLog.d("cache_video_update() called");
        }
    }

    @Override // com.xmlywind.sdk.videoAd.g.a
    public void c_() {
        SigmobLog.e("onHandleClickFailed");
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void d() {
        if (this.R) {
            return;
        }
        z();
    }

    @Override // com.xmlywind.sdk.base.common.d.a
    public void d(BaseAdUnit baseAdUnit) {
        if (baseAdUnit.getUuid().equals(this.E.getUuid())) {
            SigmobLog.d("cache_video_update() called");
            if (this.ab) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xmlywind.sdk.videoAd.h.14
                    @Override // java.lang.Runnable
                    public void run() {
                        h.this.ab = false;
                        h.this.D.setVideoURI(Uri.fromFile(new File(h.this.E.getVideoTmpPath())));
                        h.this.G();
                    }
                });
            }
        }
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void e() {
        try {
            SigmobLog.d("VideoViewController onDestroy() called");
            H();
            com.xmlywind.sdk.base.common.d.f().b(this);
            if (!this.T) {
                a(IntentActions.ACTION_INTERSTITIAL_DISMISS);
            }
            this.B.c();
            k.c cVar = this.X;
            if (cVar != null) {
                cVar.a();
                this.X = null;
            }
            p pVar = this.G;
            if (pVar != null) {
                pVar.a(com.xmlywind.sdk.base.common.a.AD_VCLOSE, 0);
                this.G.a();
                this.G = null;
            }
            g gVar = this.K;
            if (gVar != null) {
                gVar.a((g.a) null);
            }
            MediaMetadataRetriever mediaMetadataRetriever = this.D.a;
            if (mediaMetadataRetriever != null) {
                mediaMetadataRetriever.release();
            }
            VideoButtonWidget videoButtonWidget = this.I;
            if (videoButtonWidget != null) {
                videoButtonWidget.setOnTouchListener(null);
            }
            SkipButtonWidget skipButtonWidget = this.J;
            if (skipButtonWidget != null) {
                skipButtonWidget.setOnTouchListener(null);
            }
            VideoButtonWidget videoButtonWidget2 = this.U;
            if (videoButtonWidget2 != null) {
                videoButtonWidget2.setOnTouchListener(null);
            }
            BaseVideoView baseVideoView = this.D;
            if (baseVideoView != null) {
                baseVideoView.a();
            }
            View view = this.F;
            if (view != null && (view instanceof CreativeWebView)) {
                ((CreativeWebView) view).setWebViewClickListener(null);
            }
            this.F = null;
            this.H = null;
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    @Override // com.xmlywind.sdk.base.common.d.a
    public void e(BaseAdUnit baseAdUnit) {
        if (baseAdUnit.getUuid().equals(this.E.getUuid()) && baseAdUnit.isEndCardIndexExist()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xmlywind.sdk.videoAd.h.15
                @Override // java.lang.Runnable
                public void run() {
                    h.this.s();
                }
            });
        }
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void f() {
    }

    @Override // com.xmlywind.sdk.base.common.d.a
    public void f(BaseAdUnit baseAdUnit) {
    }

    @Override // com.xmlywind.sdk.base.common.g
    public boolean g() {
        return false;
    }

    public void l() {
        AdLogoView adLogoView = new AdLogoView(i(), 0);
        this.i = adLogoView;
        adLogoView.setId(com.xmlywind.sdk.common.a.r());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, com.xmlywind.sdk.common.utils.c.b(16.0f, i()));
        int iB = com.xmlywind.sdk.common.utils.c.b(10.0f, this.b);
        CompanionAdsWidget companionAdsWidget = this.Y;
        if (companionAdsWidget != null) {
            layoutParams.addRule(8, companionAdsWidget.getId());
        } else {
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, iB);
        }
        try {
            this.i.a(this.E.getAd_source_logo());
            if (!this.E.getInvisibleAdLabel()) {
                this.i.b(com.xmlywind.sdk.base.b.f());
            }
        } catch (Throwable unused) {
        }
        j().addView(this.i, layoutParams);
    }

    public p m() {
        if (this.G == null) {
            p pVar = new p(this.c);
            this.G = pVar;
            pVar.a(this.b, a(), this.t);
        }
        return this.G;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x002f -> B:14:0x0036). Please report as a decompilation issue!!! */
    public boolean n() {
        boolean z = false;
        try {
            long jR = r();
            if (this.B.n() > -1) {
                if ((jR / 1000.0f) + 0.3f >= this.B.n()) {
                    z = true;
                }
            } else if (this.M / 1000.0f < jR / 1000.0f) {
                z = true;
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
        return z;
    }

    public boolean o() {
        CompanionAdsWidget companionAdsWidget = this.Y;
        if (companionAdsWidget != null && companionAdsWidget.a()) {
            return true;
        }
        try {
            boolean z = ((long) r()) / 1000 >= ((long) this.z);
            if (z) {
                SigmobLog.d("showAble CompanionAds");
            }
            return z;
        } catch (Throwable th) {
            SigmobLog.e("shouldBeShowCompanionAds", th);
            return true;
        }
    }

    public void p() {
        CompanionAdsWidget companionAdsWidget;
        if (this.A || (companionAdsWidget = this.Y) == null) {
            return;
        }
        companionAdsWidget.bringToFront();
        this.Y.setVisibility(0);
        this.A = true;
    }

    public int q() {
        BaseVideoView baseVideoView = this.D;
        if (baseVideoView == null) {
            return 0;
        }
        int i = this.Q;
        return i > 0 ? this.B.a(i) : this.B.a(baseVideoView.getDuration());
    }

    public int r() {
        BaseVideoView baseVideoView = this.D;
        if (baseVideoView == null) {
            return 0;
        }
        return baseVideoView.getCurrentPosition();
    }

    public void s() {
        if (this.F == null && this.E.isEndCardIndexExist()) {
            try {
                g gVarD = com.xmlywind.sdk.videoAd.a.d(this.E);
                this.K = gVarD;
                gVarD.a(this.B);
                this.F = a(k(), this.K, 4);
                this.K.a(this.Q);
                e(i(), 4);
                this.K.a(this);
            } catch (Throwable th) {
                this.K = null;
                SigmobLog.e(th.getMessage());
                HashMap map = new HashMap();
                map.put("error", th.getMessage());
                a(IntentActions.ACTION_REWARDED_VIDEO_PLAYFAIL, map);
                this.f.a();
            }
        }
    }

    public void t() {
        if (this.E.getMaterial().disable_auto_deeplink.booleanValue()) {
            s();
        }
        a(r(), false);
        int iQ = (int) (((q() - r()) / 1000.0f) + 0.5f);
        this.J.a(iQ);
        AlertDialogWidget alertDialogWidget = this.x;
        if (alertDialogWidget != null) {
            alertDialogWidget.setduration(iQ);
        }
    }

    public boolean u() {
        return !this.W && B() >= this.B.i();
    }

    public void v() {
        int iQ = (int) (((q() - r()) / 1000.0f) + 0.5f);
        this.J.a(iQ);
        AlertDialogWidget alertDialogWidget = this.x;
        if (alertDialogWidget != null) {
            alertDialogWidget.setduration(iQ);
        }
        if (this.Z) {
            this.H.a(r());
        }
    }
}
