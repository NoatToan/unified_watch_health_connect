package com.xmlywind.sdk.base.views;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.p;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.PlacementType;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.mraid.CloseableLayout;
import com.xmlywind.sdk.mraid.MraidWebView;
import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class g extends Dialog implements DialogInterface.OnShowListener {
    public p a;
    private View b;
    private Window c;
    private a d;
    private RelativeLayout e;
    private com.xmlywind.sdk.videoAd.a f;
    private BaseAdUnit g;
    private com.xmlywind.sdk.mraid.c h;
    private Context i;
    private String j;
    private int k;
    private int l;
    private boolean m;

    public interface a {
        void a();
    }

    public g(Context context, String str, BaseAdUnit baseAdUnit, com.xmlywind.sdk.videoAd.a aVar) {
        super(context, com.xmlywind.sdk.base.b.d());
        this.c = null;
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.i = context.getApplicationContext();
        this.g = baseAdUnit;
        this.f = aVar;
        this.j = str;
        this.b = b();
    }

    private void d() {
        Window window = getWindow();
        this.c = window;
        if (window != null) {
            window.setGravity(80);
            int iE = com.xmlywind.sdk.base.b.e();
            if (iE != 0) {
                this.c.setWindowAnimations(iE);
            }
            this.c.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = this.c.getAttributes();
            int i = this.i.getResources().getDisplayMetrics().widthPixels;
            int i2 = this.i.getResources().getDisplayMetrics().heightPixels;
            int i3 = this.l;
            if (i3 - 1 <= i) {
                attributes.width = -1;
            } else {
                attributes.width = i3;
            }
            int i4 = this.k;
            if (i4 - 1 <= i2) {
                attributes.height = -1;
            } else {
                attributes.height = i4;
            }
            SigmobLog.i("RecommendDialog windowDeploy: " + i + "====" + i2 + "====" + attributes.width + "====" + attributes.height);
            this.c.setAttributes(attributes);
        }
    }

    public void a(com.xmlywind.sdk.base.common.a aVar) {
        p pVar = this.a;
        if (pVar != null) {
            pVar.a(aVar, 0);
        }
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public boolean a() {
        if (this.l <= 0 || this.k <= 0) {
            this.m = true;
        }
        return this.m;
    }

    public View b() {
        if (this.h == null) {
            this.h = new com.xmlywind.sdk.mraid.c(this.i, this.g, PlacementType.INTERSTITIAL);
        }
        this.h.a(new com.xmlywind.sdk.mraid.c.f() { // from class: com.xmlywind.sdk.base.views.g.1
            @Override // com.xmlywind.sdk.mraid.c.f
            public void a() {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void a(Integer num) {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void a(Map<String, String> map) {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void b() {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void b(Map<String, String> map) {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void c() {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void d() {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void e() {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void f() {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void g() {
            }

            @Override // com.xmlywind.sdk.mraid.c.f
            public void h() {
            }
        });
        this.h.a(new com.xmlywind.sdk.mraid.c.a() { // from class: com.xmlywind.sdk.base.views.g.2
            @Override // com.xmlywind.sdk.mraid.c.a
            public void a() {
                SigmobLog.d("RecommendDialog onEndCardShow()");
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(float f) {
                SigmobLog.d("RecommendDialog onReward()");
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(int i, int i2, int i3, int i4, CloseableLayout.a aVar, boolean z) {
                int i5 = g.this.i.getResources().getDisplayMetrics().widthPixels;
                int i6 = g.this.i.getResources().getDisplayMetrics().heightPixels;
                SigmobLog.i("RecommendDialog Origin onResize :" + i + "==" + i2 + "==" + i3 + "==" + i4 + "==" + z);
                g gVar = g.this;
                gVar.l = com.xmlywind.sdk.common.utils.c.b((float) i, gVar.i);
                g gVar2 = g.this;
                gVar2.k = com.xmlywind.sdk.common.utils.c.b((float) i2, gVar2.i);
                int iB = com.xmlywind.sdk.common.utils.c.b((float) i3, g.this.i);
                int iB2 = com.xmlywind.sdk.common.utils.c.b((float) i4, g.this.i);
                if (g.this.b != null) {
                    if (!z) {
                        if (iB < 0) {
                            iB = 0;
                        }
                        if (iB > i5) {
                            iB = i5;
                        }
                        if (iB2 < 0) {
                            iB2 = 0;
                        }
                        if (iB2 > i6) {
                            iB2 = i6;
                        }
                        if (g.this.l + iB > i5) {
                            g.this.l = i5 - iB;
                        }
                        if (g.this.k + iB2 > i6) {
                            g.this.k = i6 - iB2;
                        }
                    }
                    SigmobLog.i("RecommendDialog onResize: " + g.this.l + "==" + g.this.k + "==" + iB + "==" + iB2);
                    if (g.this.l <= 0 || g.this.k <= 0) {
                        g.this.m = true;
                    }
                    g.this.b.setX(iB);
                    g.this.b.setY(iB2);
                    g.this.b.setLayoutParams(new RelativeLayout.LayoutParams(g.this.l, g.this.k));
                    g.this.b.requestLayout();
                }
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(View view) {
                SigmobLog.d("RecommendDialog onLoaded()");
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(SigmobError sigmobError) {
                SigmobLog.i("RecommendDialog onRenderProcessGone:" + sigmobError.toString());
                g.this.m = true;
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(String str) {
                boolean z;
                SigmobLog.i("RecommendDialog onCompanionClick:" + str);
                if (TextUtils.isEmpty(str)) {
                    z = true;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("type");
                        g.this.h.a(String.valueOf(jSONObject.optInt("x")), String.valueOf(jSONObject.optInt("y")));
                        if (iOptInt != 1) {
                            g.this.a(com.xmlywind.sdk.base.common.a.AD_COMPANION_CLICK);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Exception unused) {
                        g.this.h.a("0", "0");
                        g.this.a(com.xmlywind.sdk.base.common.a.AD_COMPANION_CLICK);
                    }
                }
                g.this.f.b(g.this.g, g.this.i, (String) null, com.xmlywind.sdk.base.a.COMPANION, g.this.h.a(), z);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(URI uri, com.xmlywind.sdk.videoAd.f fVar, String str) {
                boolean z;
                boolean z2;
                SigmobLog.i("RecommendDialog  onOpen:" + uri + "======" + fVar + "=====" + str);
                boolean z3 = false;
                if (TextUtils.isEmpty(str)) {
                    g.this.h.a("0", "0");
                    g.this.a(com.xmlywind.sdk.base.common.a.AD_CLICK);
                    z2 = true;
                    z = false;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("type");
                        int iOptInt2 = jSONObject.optInt("x");
                        int iOptInt3 = jSONObject.optInt("y");
                        boolean zOptBoolean = jSONObject.optBoolean("disable_landing");
                        try {
                            g.this.h.a(String.valueOf(iOptInt2), String.valueOf(iOptInt3));
                            if (iOptInt != 1) {
                                g.this.a(com.xmlywind.sdk.base.common.a.AD_CLICK);
                                z3 = true;
                            }
                            z = zOptBoolean;
                            z2 = z3;
                        } catch (Exception unused) {
                            z3 = zOptBoolean;
                            g.this.h.a("0", "0");
                            g.this.a(com.xmlywind.sdk.base.common.a.AD_CLICK);
                            z = z3;
                            z2 = true;
                        }
                    } catch (Exception unused2) {
                    }
                }
                g.this.f.a(g.this.g, g.this.i, uri.toString(), com.xmlywind.sdk.base.a.ENDCARD, g.this.h.a(), z2, z);
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void a(boolean z) {
                SigmobLog.d("RecommendDialog onMute()");
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void b() {
                SigmobLog.d("RecommendDialog onShowSkipTime()");
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void b(float f) {
                SigmobLog.d("RecommendDialog onSkip()");
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void c() {
                SigmobLog.i("RecommendDialog onFailedToLoad()");
                g.this.m = true;
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void d() {
                SigmobLog.i("RecommendDialog onUnload()");
                g.this.dismiss();
                g.this.a(com.xmlywind.sdk.base.common.a.AD_CLOSE_CARD_CLOSE);
                g.this.c();
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void e() {
            }

            @Override // com.xmlywind.sdk.mraid.c.a
            public void f() {
                SigmobLog.i("RecommendDialog onClose()");
                g.this.a(com.xmlywind.sdk.base.common.a.AD_FINISH);
                if (g.this.d != null) {
                    g.this.d.a();
                }
            }
        });
        if (!TextUtils.isEmpty(this.g.getCloseCardHtmlData())) {
            this.h.a(this.g.getCloseCardHtmlData(), new com.xmlywind.sdk.mraid.c.b() { // from class: com.xmlywind.sdk.base.views.g.3
                @Override // com.xmlywind.sdk.mraid.c.b
                public void a(MraidWebView mraidWebView, p pVar) {
                    g gVar = g.this;
                    if (pVar != null) {
                        gVar.a = pVar;
                        return;
                    }
                    gVar.a = new p(gVar.i);
                    g gVar2 = g.this;
                    gVar2.a.a(gVar2.i, g.this.g, g.this.j);
                }
            });
        }
        return this.h.o();
    }

    public void c() {
        com.xmlywind.sdk.mraid.c cVar = this.h;
        if (cVar != null) {
            this.d = null;
            cVar.k();
            this.h = null;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.e = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.e.setBackgroundColor(0);
        setContentView(this.e);
        setOnShowListener(this);
        SigmobLog.i("RecommendDialog onCreate:" + this.l + ":" + this.k);
        View view = this.b;
        if (view != null) {
            this.e.addView(view);
        }
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        d();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        SigmobLog.i("RecommendDialog  onShow");
        a(com.xmlywind.sdk.base.common.a.AD_CLOSE_CARD_SHOW);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getWindow().getDecorView().setSystemUiVisibility(6918);
    }
}
