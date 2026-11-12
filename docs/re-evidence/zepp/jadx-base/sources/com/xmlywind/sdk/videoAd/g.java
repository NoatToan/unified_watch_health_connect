package com.xmlywind.sdk.videoAd;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.common.x;
import com.xmlywind.sdk.base.common.y;
import com.xmlywind.sdk.base.common.z;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.utils.j;
import com.xmlywind.sdk.common.utils.m;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class g implements Serializable {
    private static final long serialVersionUID = 0;
    private final int a;
    private final int b;
    private final com.xmlywind.sdk.base.views.b c;
    private final int d;
    private a e;
    private String f;
    private String g;
    private int h;
    private boolean i = false;
    private com.xmlywind.sdk.videoAd.a j;

    /* JADX INFO: renamed from: com.xmlywind.sdk.videoAd.g$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.xmlywind.sdk.base.a.values().length];
            a = iArr;
            try {
                iArr[com.xmlywind.sdk.base.a.COMPANION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.xmlywind.sdk.base.a.VIDEO_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface a {
        void b_();

        void c_();
    }

    public g(int i, int i2, int i3, String str, String str2, com.xmlywind.sdk.base.views.b bVar) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.g = str2;
        this.f = str;
        this.c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final BaseAdUnit baseAdUnit, String str, com.xmlywind.sdk.base.a aVar, String str2) {
        if (TextUtils.isEmpty(this.f)) {
            a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.c_();
                return;
            }
            return;
        }
        final String strMacroProcess = baseAdUnit.getMacroCommon().macroProcess(this.f);
        t.a(str, "click", baseAdUnit, "0", strMacroProcess, str2, this.h);
        if (this.d == f.BrowserType.a()) {
            z.a(strMacroProcess, new z.a() { // from class: com.xmlywind.sdk.videoAd.g.2
                @Override // com.xmlywind.sdk.base.common.z.a
                public void a(String str3) {
                    if (!baseAdUnit.getAd().forbiden_parse_landingpage.booleanValue()) {
                        t.a(baseAdUnit, str3);
                    }
                    try {
                        j.a(context.getApplicationContext(), Uri.parse(str3));
                        if (g.this.e != null) {
                            g.this.e.b_();
                        }
                    } catch (Throwable th) {
                        SigmobLog.e(th.getMessage());
                        if (g.this.e != null) {
                            g.this.e.c_();
                        }
                    }
                }

                @Override // com.xmlywind.sdk.base.common.z.a
                public void a(String str3, Throwable th) {
                    if (!baseAdUnit.getAd().forbiden_parse_landingpage.booleanValue()) {
                        t.a(baseAdUnit, strMacroProcess);
                    }
                    try {
                        j.a(context.getApplicationContext(), Uri.parse(strMacroProcess));
                        if (g.this.e != null) {
                            g.this.e.b_();
                        }
                    } catch (com.xmlywind.sdk.common.c.b e) {
                        SigmobLog.e(e.getMessage());
                        if (g.this.e != null) {
                            g.this.e.c_();
                        }
                    }
                }
            });
            return;
        }
        this.j.a(context, baseAdUnit, strMacroProcess, aVar, str2, false);
        a aVar3 = this.e;
        if (aVar3 != null) {
            aVar3.b_();
        }
    }

    private void a(com.xmlywind.sdk.base.a aVar, BaseAdUnit baseAdUnit, String str, String str2) {
        int i = AnonymousClass3.a[aVar.ordinal()];
        if (i == 1) {
            t.a(PointCategory.COMPANION, "click", baseAdUnit, "0", str, str2, this.h);
            a(baseAdUnit);
            return;
        }
        int i2 = this.h;
        if (i != 2) {
            t.a(PointCategory.ENDCARD, "click", baseAdUnit, "0", str, str2, i2);
            c(baseAdUnit);
        } else {
            t.a(PointCategory.VIDEO_CLICK, "click", baseAdUnit, "0", str, str2, i2);
            b(baseAdUnit);
        }
    }

    private void a(final BaseAdUnit baseAdUnit, final Context context, String str, final String str2, final com.xmlywind.sdk.base.a aVar) {
        String str3;
        int i = AnonymousClass3.a[aVar.ordinal()];
        if (i == 1) {
            a(baseAdUnit);
            str3 = PointCategory.COMPANION;
        } else if (i != 2) {
            c(baseAdUnit);
            str3 = PointCategory.ENDCARD;
        } else {
            b(baseAdUnit);
            str3 = PointCategory.VIDEO_CLICK;
        }
        final String str4 = str3;
        new y.a().a(x.IGNORE_ABOUT_SCHEME, x.OPEN_WITH_BROWSER, x.FOLLOW_DEEP_LINK).a(new y.b() { // from class: com.xmlywind.sdk.videoAd.g.1
            @Override // com.xmlywind.sdk.base.common.y.b
            public void a(String str5, x xVar) {
            }

            @Override // com.xmlywind.sdk.base.common.y.b
            public void b(String str5, x xVar) {
            }

            @Override // com.xmlywind.sdk.base.common.y.b
            public void c(String str5, x xVar) {
                String str6;
                BaseAdUnit baseAdUnit2;
                String str7;
                int i2;
                String str8;
                String str9;
                SigmobLog.d("urlHandlingFailed: " + xVar.name() + " url: " + str5);
                if (!baseAdUnit.getAd().forbiden_parse_landingpage.booleanValue()) {
                    t.a(baseAdUnit, str5);
                }
                if (x.FOLLOW_DEEP_LINK == xVar) {
                    com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_OPEN_DEEPLINK);
                    str6 = str4;
                    baseAdUnit2 = baseAdUnit;
                    str7 = str2;
                    i2 = g.this.h;
                    str8 = "click";
                    str9 = "1";
                } else {
                    if (!TextUtils.isEmpty(g.this.g)) {
                        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_OPEN_DEEPLINK_FAIL);
                    }
                    str6 = str4;
                    baseAdUnit2 = baseAdUnit;
                    str7 = str2;
                    i2 = g.this.h;
                    str8 = "click";
                    str9 = "0";
                }
                t.a(str6, str8, baseAdUnit2, str9, str5, str7, i2);
                if (g.this.e != null) {
                    g.this.e.b_();
                }
            }

            @Override // com.xmlywind.sdk.base.common.y.b
            public void d(String str5, x xVar) {
                SigmobLog.d("urlHandlingFailed: " + xVar.name() + " url: " + str5);
                if (!baseAdUnit.getAd().forbiden_parse_landingpage.booleanValue()) {
                    t.a(baseAdUnit, str5);
                }
                if (x.FOLLOW_DEEP_LINK == xVar) {
                    com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_OPEN_DEEPLINK_FAIL);
                    g.this.a(context, baseAdUnit, str4, aVar, str2);
                } else {
                    t.a(str4, "click", baseAdUnit, "0", str5, str2, g.this.h);
                    if (g.this.e != null) {
                        g.this.e.c_();
                    }
                }
            }
        }).a(baseAdUnit.isSkipSigmobBrowser()).a(baseAdUnit).b(baseAdUnit.getAd().forbiden_parse_landingpage.booleanValue()).a().a(context, str);
    }

    public com.xmlywind.sdk.base.views.b a() {
        return this.c;
    }

    public void a(int i) {
        this.h = i;
    }

    public void a(Context context, int i, BaseAdUnit baseAdUnit, String str) {
        m.a.a(context);
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_SHOW);
        t.a(PointCategory.ENDCARD, "show", baseAdUnit);
    }

    public void a(Context context, String str, com.xmlywind.sdk.base.a aVar, BaseAdUnit baseAdUnit, String str2) {
        m.a.a(context);
        b(context, this.f, aVar, baseAdUnit, str2);
    }

    public void a(BaseAdUnit baseAdUnit) {
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_COMPANION_CLICK);
    }

    public void a(com.xmlywind.sdk.videoAd.a aVar) {
        this.j = aVar;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    public void a(String str) {
        this.g = str;
    }

    public String b() {
        return this.g;
    }

    public void b(Context context, String str, com.xmlywind.sdk.base.a aVar, BaseAdUnit baseAdUnit, String str2) {
        a aVar2;
        this.i = true;
        if (!TextUtils.isEmpty(this.g)) {
            a(baseAdUnit, context, baseAdUnit.getMacroCommon().macroProcess(this.g), str2, aVar);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            SigmobLog.e("landing page is null");
            aVar2 = this.e;
            if (aVar2 == null) {
                return;
            }
        } else {
            if (this.d == f.DownloadType.a() || this.d == f.DownloadOpenDeepLinkType.a()) {
                a(aVar, baseAdUnit, str, str2);
                a aVar3 = this.e;
                if (aVar3 != null) {
                    aVar3.b_();
                }
                this.j.a(context, baseAdUnit, str, (com.xmlywind.sdk.base.a) null, str2, false);
                return;
            }
            if (this.d == f.BrowserType.a()) {
                a(baseAdUnit, context, str, str2, aVar);
                return;
            }
            SigmobLog.e("not support interActionType");
            aVar2 = this.e;
            if (aVar2 == null) {
                return;
            }
        }
        aVar2.c_();
    }

    public void b(BaseAdUnit baseAdUnit) {
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_VIDEO_CLICK);
    }

    public void c(BaseAdUnit baseAdUnit) {
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_CLICK);
    }

    public boolean c() {
        return this.i;
    }
}
