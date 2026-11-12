package com.xmlywind.sdk.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.p;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.base.models.PlacementType;
import com.xmlywind.sdk.base.views.VideoButtonWidget;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.models.SigmobError;
import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class i extends com.xmlywind.sdk.videoAd.b {
    public p g;
    private final String h;
    private int i;
    private com.xmlywind.sdk.videoAd.a j;
    private int k;
    private boolean l;
    private BaseAdUnit m;
    private c n;
    private VideoButtonWidget o;
    private Integer p;
    private boolean q;
    private boolean r;
    private com.xmlywind.sdk.base.views.e s;
    private boolean t;

    public i(Activity activity, BaseAdUnit baseAdUnit, Bundle bundle, Bundle bundle2, String str, com.xmlywind.sdk.base.common.h hVar) {
        super(activity, str, hVar);
        this.r = false;
        this.t = false;
        this.m = baseAdUnit;
        this.h = bundle.getString("ad_scene");
        com.xmlywind.sdk.videoAd.a aVar = (com.xmlywind.sdk.videoAd.a) this.m.getAdConfig();
        this.j = aVar;
        aVar.a(k(), this.m, (com.xmlywind.sdk.base.views.e.b) null);
        this.k = com.xmlywind.sdk.common.a.n().ad();
        int iIntValue = this.m.getAd().display_orientation.intValue();
        this.i = iIntValue != 1 ? iIntValue != 2 ? bundle.getInt(Constants.REQUESTED_ORIENTATION, 3) : 6 : 7;
        h().a(this.i);
        k().requestWindowFeature(1);
        k().getWindow().addFlags(16778240);
        b(bundle);
        j().setBackgroundColor(0);
    }

    private void a(int i, RelativeLayout.LayoutParams layoutParams) {
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

    private void a(Context context, int i) {
        if (this.o != null) {
            return;
        }
        VideoButtonWidget videoButtonWidget = new VideoButtonWidget(context, this.j.f());
        this.o = videoButtonWidget;
        videoButtonWidget.setVisibility(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(com.xmlywind.sdk.common.utils.c.b(30.0f, context), com.xmlywind.sdk.common.utils.c.b(30.0f, context));
        a(this.j.f(), layoutParams);
        j().addView(this.o, layoutParams);
        this.o.setOnTouchListener(new View.OnTouchListener() { // from class: com.xmlywind.sdk.mraid.i.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    i.this.r = true;
                    i.this.j.b(i.this.i(), i.this.p != null ? i.this.p.intValue() : -1, i.this.m);
                    i.this.h().a();
                }
                return true;
            }
        });
        this.o.a(this.m);
        String strB = this.j.b();
        if (strB != null) {
            this.o.a(strB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        VideoButtonWidget videoButtonWidget = this.o;
        if (videoButtonWidget != null) {
            videoButtonWidget.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.o == null) {
            a(this.b, 0);
        }
        this.o.setVisibility(0);
    }

    public View a() {
        String str = this.a;
        l.a aVarA = str != null ? l.a(str) : null;
        this.n = (aVarA == null || aVarA.c() == null) ? new c(this.b, this.m, PlacementType.INTERSTITIAL) : aVarA.c();
        this.n.a(new c.f() { // from class: com.xmlywind.sdk.mraid.i.2
            private boolean b;

            @Override // com.xmlywind.sdk.mraid.c.f
            public void a() {
                SigmobLog.d("adImpression() called");
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void a(Integer num) {
                i.this.p = num;
                i iVar = i.this;
                iVar.g.a(iVar.p.intValue(), i.this.j.d());
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void a(Map<String, String> map) {
                try {
                    map.get("id");
                    String str2 = map.get("url");
                    if (!map.get("playerHandles").equalsIgnoreCase("false")) {
                        i.this.j.b(i.this.m, i.this.b, str2, com.xmlywind.sdk.base.a.ENDCARD, i.this.n.a(), true);
                    }
                    i.this.a(com.xmlywind.sdk.base.common.a.AD_COMPANION_CLICK);
                    i.this.a(IntentActions.ACTION_INTERSTITIAL_CLICK);
                    SigmobLog.d("adClickThru() called" + map.toString());
                } catch (Throwable th) {
                    SigmobLog.e("adClickThru", th);
                }
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void b() {
                if (this.b) {
                    return;
                }
                i.this.a(com.xmlywind.sdk.base.common.a.AD_PAUSE);
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void b(Map<String, String> map) {
                i.this.a(IntentActions.ACTION_MRAID_PLAYFAIL);
                i.this.a(com.xmlywind.sdk.base.common.a.AD_ERROR);
                SigmobLog.d("adError() called " + map);
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void c() {
                i.this.a(com.xmlywind.sdk.base.common.a.AD_PLAYING);
                SigmobLog.d("adPlaying() called");
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void d() {
                this.b = true;
                if (!i.this.l && i.this.m.getAd_type() != 4) {
                    i.this.l = true;
                    i.this.a(IntentActions.ACTION_REWARDED_VIDEO_COMPLETE);
                    i iVar = i.this;
                    iVar.g.a(com.xmlywind.sdk.base.common.a.AD_FINISH, iVar.n.e().intValue());
                }
                i.this.a(com.xmlywind.sdk.base.common.a.AD_COMPLETE);
                SigmobLog.d("adVideoComplete() called");
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void e() {
                i.this.a(com.xmlywind.sdk.base.common.a.AD_PLAY_QUARTER);
                SigmobLog.d("adVideoFirstQuartile() called");
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void f() {
                i.this.a(com.xmlywind.sdk.base.common.a.AD_PLAY_THREE_QUARTERS);
                SigmobLog.d("adVideoThirdQuartile() called");
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void g() {
                i.this.a(com.xmlywind.sdk.base.common.a.AD_PLAY_TWO_QUARTERS);
                SigmobLog.d("adVideoMidpoint() called");
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void h() {
                i.this.a(com.xmlywind.sdk.base.common.a.AD_VIDEO_START);
                SigmobLog.d("adVideoStart() called");
            }
        });
        this.n.a(new c.a() { // from class: com.xmlywind.sdk.mraid.i.3
            @Override // com.xmlywind.sdk.mraid.c.a
            public void a() {
                i.this.a(com.xmlywind.sdk.base.common.a.AD_SHOW);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(float f) {
                if (i.this.l) {
                    return;
                }
                i.this.l = true;
                i.this.a(com.xmlywind.sdk.base.common.a.AD_FINISH);
                i.this.a(IntentActions.ACTION_REWARDED_VIDEO_COMPLETE);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(int i, int i2, int i3, int i4, CloseableLayout.a aVar, boolean z) {
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(View view) {
                i.this.a(com.xmlywind.sdk.base.common.a.AD_START);
                SigmobLog.d("onLoaded() called");
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(SigmobError sigmobError) {
                SigmobLog.d("Finishing the activity due to a problem: " + sigmobError);
                i.this.a(com.xmlywind.sdk.base.common.a.AD_ERROR);
                if (i.this.a != null) {
                    i.this.a(IntentActions.ACTION_INTERSTITIAL_FAIL);
                }
                i.this.f.a();
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(String str2) {
                boolean z;
                if (TextUtils.isEmpty(str2)) {
                    z = true;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        int iOptInt = jSONObject.optInt("type");
                        i.this.n.a(String.valueOf(jSONObject.optInt("x")), String.valueOf(jSONObject.optInt("y")));
                        if (iOptInt != 1) {
                            i.this.a(com.xmlywind.sdk.base.common.a.AD_COMPANION_CLICK);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Exception unused) {
                        i.this.n.a("0", "0");
                        i.this.a(com.xmlywind.sdk.base.common.a.AD_COMPANION_CLICK);
                    }
                }
                i.this.j.b(i.this.m, i.this.b, (String) null, com.xmlywind.sdk.base.a.COMPANION, i.this.n.a(), z);
                i.this.a(IntentActions.ACTION_INTERSTITIAL_CLICK);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(URI uri, com.xmlywind.sdk.videoAd.f fVar, String str2) {
                boolean z;
                boolean z2;
                boolean z3 = false;
                if (TextUtils.isEmpty(str2)) {
                    i.this.n.a("0", "0");
                    i.this.a(com.xmlywind.sdk.base.common.a.AD_CLICK);
                    z2 = true;
                    z = false;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        int iOptInt = jSONObject.optInt("type");
                        int iOptInt2 = jSONObject.optInt("x");
                        int iOptInt3 = jSONObject.optInt("y");
                        boolean zOptBoolean = jSONObject.optBoolean("disable_landing");
                        try {
                            i.this.n.a(String.valueOf(iOptInt2), String.valueOf(iOptInt3));
                            if (iOptInt != 1) {
                                i.this.a(com.xmlywind.sdk.base.common.a.AD_CLICK);
                                z3 = true;
                            }
                            z = zOptBoolean;
                            z2 = z3;
                        } catch (Exception unused) {
                            z3 = zOptBoolean;
                            i.this.n.a("0", "0");
                            i.this.a(com.xmlywind.sdk.base.common.a.AD_CLICK);
                            z = z3;
                            z2 = true;
                        }
                    } catch (Exception unused2) {
                    }
                }
                i.this.j.a(i.this.m, i.this.b, uri.toString(), com.xmlywind.sdk.base.a.ENDCARD, i.this.n.a(), z2, z);
                i.this.a(IntentActions.ACTION_INTERSTITIAL_CLICK);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(boolean z) {
                i iVar;
                com.xmlywind.sdk.base.common.a aVar;
                if (z) {
                    iVar = i.this;
                    aVar = com.xmlywind.sdk.base.common.a.AD_MUTE;
                } else {
                    iVar = i.this;
                    aVar = com.xmlywind.sdk.base.common.a.AD_UNMUTE;
                }
                iVar.a(aVar);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void b() {
                i.this.a(com.xmlywind.sdk.base.common.a.AD_SHOW_SKIP);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void b(float f) {
                if (i.this.q) {
                    return;
                }
                i.this.q = true;
                i.this.a(com.xmlywind.sdk.base.common.a.AD_SKIP);
                i.this.a(IntentActions.ACTION_REWARDED_VIDEO_SKIP);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void c() {
                SigmobLog.d("MraidActivity failed to load. Finishing the activity");
                if (i.this.a != null) {
                    i.this.a(IntentActions.ACTION_INTERSTITIAL_FAIL);
                }
                i.this.f.a();
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void d() {
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void e() {
                if (i.this.s == null) {
                    i.this.s = new com.xmlywind.sdk.base.views.e(i.this.k(), i.this.m);
                    i.this.s.a(new com.xmlywind.sdk.base.views.e.b() { // from class: com.xmlywind.sdk.mraid.i.3.2
                        @Override // com.xmlywind.sdk.base.views.e.b
                        public void a() {
                            if (i.this.s != null) {
                                i.this.s.dismiss();
                                i.this.s.c();
                                i.this.s = null;
                                i.this.t = false;
                            }
                            p pVar = i.this.g;
                            if (pVar != null) {
                                pVar.a(com.xmlywind.sdk.base.common.a.AD_FOUR_ELEMENTS_CLOSE, 0);
                            }
                        }

                        @Override // com.xmlywind.sdk.base.views.e.b
                        public void a(String str2, String str3) {
                            if (i.this.j != null) {
                                i.this.j.a(i.this.m, i.this.b, str2, com.xmlywind.sdk.base.a.COMPANION, str3, true);
                                i.this.a(com.xmlywind.sdk.base.common.a.AD_CLICK);
                                i.this.a(IntentActions.ACTION_INTERSTITIAL_CLICK);
                            }
                        }

                        @Override // com.xmlywind.sdk.base.views.e.b
                        public void b() {
                            p pVar = i.this.g;
                            if (pVar != null) {
                                pVar.a(com.xmlywind.sdk.base.common.a.AD_FOUR_ELEMENTS_SHOW, 0);
                            }
                        }
                    });
                }
                if (i.this.s == null || !i.this.s.a() || i.this.t) {
                    return;
                }
                i.this.s.show();
                i.this.t = true;
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void f() {
                i.this.n.a(new ValueCallback<String>() { // from class: com.xmlywind.sdk.mraid.i.3.1
                    @Override // android.webkit.ValueCallback
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onReceiveValue(String str2) {
                        if (a.a(str2) != null) {
                            Float fValueOf = Float.valueOf(str2);
                            if (fValueOf.floatValue() < 0.999f && !i.this.q) {
                                i.this.q = true;
                                i.this.a(com.xmlywind.sdk.base.common.a.AD_SKIP);
                            }
                            if (i.this.l || i.this.m.getAd_type() == 4 || fValueOf.floatValue() <= i.this.m.getFinishedTime()) {
                                return;
                            }
                            i.this.l = true;
                            i iVar = i.this;
                            iVar.g.a(com.xmlywind.sdk.base.common.a.AD_FINISH, iVar.n.e().intValue());
                            i.this.a(IntentActions.ACTION_REWARDED_VIDEO_COMPLETE);
                        }
                    }
                });
                i.this.a(IntentActions.ACTION_REWARDED_VIDEO_CLOSE);
                i.this.r = true;
                i.this.f.a();
            }
        });
        this.n.a(new c.e() { // from class: com.xmlywind.sdk.mraid.i.4
            @Override // com.xmlywind.sdk.mraid.c.e
            public void a(boolean z) {
                if (z) {
                    i.this.l();
                } else {
                    i.this.m();
                }
            }
        });
        if (aVarA != null) {
            this.g = aVarA.b();
        } else if (!TextUtils.isEmpty(this.m.getHtmlData())) {
            this.n.a(this.m.getHtmlData(), new c.b() { // from class: com.xmlywind.sdk.mraid.i.5
                @Override // com.xmlywind.sdk.mraid.c.b
                public void a(MraidWebView mraidWebView, p pVar) {
                    i iVar = i.this;
                    if (pVar != null) {
                        iVar.g = pVar;
                        return;
                    }
                    iVar.g = new p(iVar.b);
                    i iVar2 = i.this;
                    iVar2.g.a(iVar2.b, i.this.m, i.this.h);
                }
            });
        } else if (!TextUtils.isEmpty(this.m.getHtmlUrl())) {
            this.n.b(this.m.getHtmlUrl(), new c.b() { // from class: com.xmlywind.sdk.mraid.i.6
                @Override // com.xmlywind.sdk.mraid.c.b
                public void a(MraidWebView mraidWebView, p pVar) {
                    i iVar = i.this;
                    if (pVar != null) {
                        iVar.g = pVar;
                        return;
                    }
                    iVar.g = new p(iVar.b);
                    i iVar2 = i.this;
                    iVar2.g.a(iVar2.b, i.this.m, i.this.h);
                }
            });
        }
        return this.n.o();
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void a(Configuration configuration) {
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void a(Bundle bundle) {
    }

    public void a(final com.xmlywind.sdk.base.common.a aVar) {
        final Integer numE = this.n.e();
        this.n.a(new ValueCallback<String>() { // from class: com.xmlywind.sdk.mraid.i.1
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                Integer num;
                try {
                    if (a.a(str) == null) {
                        if (aVar.equals(com.xmlywind.sdk.base.common.a.AD_SHOW_SKIP)) {
                            i.this.g.a(false, 0);
                        }
                        i.this.g.a(aVar, 0);
                        return;
                    }
                    Float fValueOf = Float.valueOf(str);
                    float fIntValue = -1.0f;
                    if (fValueOf.floatValue() > 1.0E-7d && (num = numE) != null && num.intValue() > 0) {
                        fIntValue = numE.intValue() * fValueOf.floatValue();
                    }
                    if (aVar.equals(com.xmlywind.sdk.base.common.a.AD_SHOW_SKIP)) {
                        i.this.g.a(false, (int) fIntValue);
                    }
                    i.this.g.a(aVar, (int) fIntValue);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.xmlywind.sdk.videoAd.b, com.xmlywind.sdk.base.common.g
    public void b() {
        super.b();
        p pVar = this.g;
        if (pVar != null) {
            pVar.a(com.xmlywind.sdk.base.common.a.AD_SHOW, 0);
        }
        j().addView(a(), new FrameLayout.LayoutParams(-1, -1));
        c cVar = this.n;
        if (cVar != null) {
            cVar.a(k());
        }
        a(IntentActions.ACTION_REWARDED_VIDEO_PLAY);
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void c() {
        if (this.r) {
            a(IntentActions.ACTION_INTERSTITIAL_DISMISS);
        } else {
            this.n.b();
        }
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void d() {
        this.n.c();
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void e() {
        p pVar = this.g;
        if (pVar != null) {
            pVar.a(com.xmlywind.sdk.base.common.a.AD_VCLOSE, 0);
            this.g.a();
            this.g = null;
        }
        c cVar = this.n;
        if (cVar != null) {
            cVar.k();
        }
        this.j.c();
        if (this.r) {
            return;
        }
        a(IntentActions.ACTION_INTERSTITIAL_DISMISS);
    }

    @Override // com.xmlywind.sdk.base.common.g
    public void f() {
    }

    @Override // com.xmlywind.sdk.base.common.g
    public boolean g() {
        return false;
    }
}
