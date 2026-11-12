package com.huawei.openalliance.ad;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.webkit.ProxyConfig;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.IPPSWebEventCallback;
import com.huawei.operation.utils.Constants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class od extends jr<com.huawei.openalliance.ad.views.interfaces.w> implements or<com.huawei.openalliance.ad.views.interfaces.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f19818c = "od";
    private rc d;
    private Context e;
    private AdLandingPageData f;
    private IPPSWebEventCallback h;
    private com.huawei.openalliance.ad.analysis.c i;
    private com.huawei.openalliance.ad.analysis.i j;
    private long l;
    private Long m;
    private String o;
    private boolean g = false;
    private Boolean k = false;
    private boolean n = false;
    private long p = 0;

    String b(String str) {
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    @Override // com.huawei.openalliance.ad.or
    public long j() {
        long j;
        long jCurrentTimeMillis;
        long jLongValue;
        long j2;
        if (this.m == null) {
            if (this.l > 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
                jLongValue = this.l;
            } else {
                j = 0;
            }
            AdLandingPageData adLandingPageData = this.f;
            j2 = (adLandingPageData == null && adLandingPageData.getAdType() == 7 && !this.n) ? 0L : j;
            if (hw.a()) {
                hw.a(f19818c, "getWebHasShownTime, webShowTime, duration: %s", Long.valueOf(j2));
            }
            return j2;
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        jLongValue = this.m.longValue();
        j = jCurrentTimeMillis - jLongValue;
        AdLandingPageData adLandingPageData2 = this.f;
        if (adLandingPageData2 == null) {
        }
        if (hw.a()) {
            hw.a(f19818c, "getWebHasShownTime, webShowTime, duration: %s", Long.valueOf(j2));
        }
        return j2;
    }

    public void i() {
        this.j.b(this.f);
    }

    public void h() {
        this.j.a(this.f);
    }

    @Override // com.huawei.openalliance.ad.or
    public void d(long j) {
        this.m = Long.valueOf(j);
        this.n = true;
    }

    @Override // com.huawei.openalliance.ad.or
    public String d(String str) {
        if (com.huawei.openalliance.ad.utils.dg.g(str, this.o) && com.huawei.openalliance.ad.utils.as.a(this.f)) {
            str = com.huawei.openalliance.ad.utils.dg.e(this.f.getAppInfo().getAppName());
        }
        if (str == null) {
            return this.e.getResources().getString(R.string.hiad_detail);
        }
        return (TextUtils.equals(str, Constants.ABOUT_BLANK) || com.huawei.openalliance.ad.utils.dg.l(str)) ? " " : str;
    }

    public void c(String str) {
        this.i.a(this.f, str);
    }

    @Override // com.huawei.openalliance.ad.or
    public void c(long j) {
        if (hw.a()) {
            hw.a(f19818c, "setWebOpenTime, webOpenTime= %s", Long.valueOf(j));
        }
        this.l = j;
        this.m = null;
    }

    @Override // com.huawei.openalliance.ad.or
    public void c() {
        this.i.a(this.f);
    }

    @Override // com.huawei.openalliance.ad.or
    public void b() {
        IPPSWebEventCallback iPPSWebEventCallback = this.h;
        if (iPPSWebEventCallback != null) {
            iPPSWebEventCallback.onWebloadFinish();
        }
        if (hw.a()) {
            hw.a(f19818c, "onWebloadFinish");
        }
        if (this.m == null) {
            this.m = Long.valueOf(System.currentTimeMillis());
        }
        rc rcVar = this.d;
        if (rcVar != null) {
            rcVar.h();
        }
    }

    @Override // com.huawei.openalliance.ad.or
    public boolean a(WebView webView, Uri uri) {
        Intent intentB;
        String str = f19818c;
        hw.a(str, "shouldOverrideUrlLoading uri: %s", uri);
        Intent intentA = a(uri);
        if (intentA == null) {
            if (!fp.b(this.e).j(com.huawei.openalliance.ad.utils.dg.m(uri.toString()))) {
                return false;
            }
            c();
            return true;
        }
        try {
            intentB = b(intentA);
            if (intentB != null) {
                try {
                    c("2");
                    intentA = intentB;
                } catch (RuntimeException | Exception unused) {
                    hw.c(f19818c, "shouldOverrideUrlLoading error");
                    this.e.startActivity(intentB);
                    return false;
                }
            }
            com.huawei.openalliance.ad.utils.k.a aVarA = a(intentA);
            if (aVarA == null) {
                hw.b(str, "shouldOverrideUrlLoading, queryIntentActivities failed");
                c("3");
                return true;
            }
            String strA = aVarA.a();
            if (!cc.b(this.e) || fp.b(this.e).i(strA)) {
                return a(webView, intentA, aVarA, uri);
            }
            hw.b(str, "shouldOverrideUrlLoading, whilelist check failed");
            c("4");
            return true;
        } catch (RuntimeException | Exception unused2) {
            intentB = intentA;
        }
    }

    protected boolean a(WebView webView, Intent intent, com.huawei.openalliance.ad.utils.k.a aVar, Uri uri) {
        ContentRecord contentRecordA;
        String strA = aVar.a();
        Boolean boolK = fp.b(this.e).k(strA);
        intent.addFlags(268435456);
        com.huawei.openalliance.ad.utils.dcservice.c.a aVar2 = new com.huawei.openalliance.ad.utils.dcservice.c.a();
        if (this.f19383a != null) {
            contentRecordA = this.f19383a;
        } else {
            rc rcVar = this.d;
            contentRecordA = rcVar != null ? rcVar.a() : null;
        }
        if (uri != null && !k()) {
            a(contentRecordA, uri.toString(), strA);
        }
        if (b(strA, contentRecordA)) {
            a(aVar, contentRecordA);
            return true;
        }
        aVar2.a(contentRecordA, this.e).c(strA).a(intent);
        if (contentRecordA != null && contentRecordA.D() == 1) {
            hw.a(f19818c, "current interactionType is WEB_PAGE, showOpenAppDialog");
            a(webView, aVar, intent, aVar2.a(), true);
            return true;
        }
        if (boolK != null && boolK.booleanValue()) {
            com.huawei.openalliance.ad.utils.k.a(this.e, intent, aVar2.a());
            return true;
        }
        if (fp.b(this.e).bm()) {
            a(webView, aVar, intent, aVar2.a(), false);
        } else {
            com.huawei.openalliance.ad.utils.k.a(this.e, intent, aVar2.a());
        }
        return true;
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(String str, String str2, String str3) {
        this.i.a(str, str2, str3, this.f);
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(String str, WebView webView) {
        if (!com.huawei.openalliance.ad.utils.dg.b(str)) {
            if (!str.startsWith("https://") && !str.startsWith("http://")) {
                str = "https://" + str;
            }
            str = b(str);
        }
        if (webView != null) {
            if (a(str, webView.getContext())) {
                str = Constants.ABOUT_BLANK;
            }
            webView.loadUrl(str);
            com.huawei.openalliance.ad.utils.dq.a(new a(webView), 1000L);
        }
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(Object obj, String str, WebView webView) {
        if (webView != null) {
            hw.a(f19818c, "inject js");
            webView.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(rc rcVar) {
        this.d = rcVar;
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(IPPSWebEventCallback iPPSWebEventCallback) {
        this.h = iPPSWebEventCallback;
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(MaterialClickInfo materialClickInfo, boolean z) {
        if (this.d == null || materialClickInfo == null) {
            hw.d(f19818c, "onClickLandingpage, clickInfo is null");
            return;
        }
        if (hw.a()) {
            hw.a(f19818c, materialClickInfo.a());
        }
        this.d.a(materialClickInfo, z);
    }

    @Override // com.huawei.openalliance.ad.or
    public final void a(AdLandingPageData adLandingPageData) {
        if (adLandingPageData != null) {
            this.f = adLandingPageData;
            Context context = this.e;
            pc pcVar = new pc(context, sw.a(context, adLandingPageData.getAdType()));
            this.d = pcVar;
            pcVar.a(adLandingPageData.z());
        }
    }

    public void a(final ContentRecord contentRecord, final String str, final String str2) {
        com.huawei.openalliance.ad.utils.o.b(new Runnable() { // from class: com.huawei.openalliance.ad.od.6
            @Override // java.lang.Runnable
            public void run() {
                od.this.j.a(str, str2, contentRecord);
            }
        });
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(WebView webView) {
        String str;
        StringBuilder sb;
        if (webView == null) {
            return;
        }
        b(webView);
        WebSettings settings = webView.getSettings();
        a(settings);
        try {
            String userAgentString = settings.getUserAgentString();
            if (userAgentString != null && userAgentString.indexOf(com.huawei.openalliance.ad.constant.Constants.PPS_UA) < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(userAgentString);
                sb2.append(" HuaweiPPS/3.4.84.300");
                if (this.e != null) {
                    sb2.append(" ");
                    sb2.append(this.e.getPackageName());
                    sb2.append("/");
                    sb2.append(com.huawei.openalliance.ad.utils.k.a(this.e));
                }
                userAgentString = sb2.toString();
                settings.setUserAgentString(userAgentString);
            }
            hw.a(f19818c, "UserAgent:%s", userAgentString);
        } catch (RuntimeException e) {
            e = e;
            str = f19818c;
            sb = new StringBuilder("add useragent RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.d(str, sb.toString());
        } catch (Exception e2) {
            e = e2;
            str = f19818c;
            sb = new StringBuilder("add useragent Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.d(str, sb.toString());
        }
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(int i, int i2) {
        this.j.a(i, i2, pn.a(this.f));
    }

    @Override // com.huawei.openalliance.ad.or
    public void a(int i) {
        long jCurrentTimeMillis;
        IPPSWebEventCallback iPPSWebEventCallback = this.h;
        if (iPPSWebEventCallback != null) {
            iPPSWebEventCallback.onWebClose(i);
        }
        Long l = this.m;
        ContentRecord contentRecordA = null;
        if (l != null) {
            hw.a(f19818c, "webLoadFinishTime is %s, webCloseTime is %s", l, Long.valueOf(System.currentTimeMillis()));
            jCurrentTimeMillis = System.currentTimeMillis() - this.m.longValue();
            this.m = null;
        } else {
            long j = this.l;
            if (j > 0) {
                hw.a(f19818c, "webOpenTime is %s, webCloseTime is %s", Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                jCurrentTimeMillis = System.currentTimeMillis() - this.l;
                this.l = 0L;
            } else {
                jCurrentTimeMillis = 0;
            }
        }
        AdLandingPageData adLandingPageData = this.f;
        long j2 = (adLandingPageData == null || adLandingPageData.getAdType() != 7 || this.n) ? jCurrentTimeMillis : 0L;
        if (hw.a()) {
            hw.a(f19818c, "onWebClose, duration: %s", Long.valueOf(j2));
        }
        if (j2 <= fp.b(this.e).ay()) {
            rc rcVar = this.d;
            if (rcVar != null) {
                rcVar.a(i, j2);
                return;
            }
            return;
        }
        if (this.f19383a != null) {
            contentRecordA = this.f19383a;
        } else {
            rc rcVar2 = this.d;
            if (rcVar2 != null) {
                contentRecordA = rcVar2.a();
            }
        }
        this.i.a(contentRecordA, j2);
        hw.a(f19818c, "duration exceeding the limit, duration: %s", Long.valueOf(j2));
    }

    @Override // com.huawei.openalliance.ad.or
    public void a() {
        IPPSWebEventCallback iPPSWebEventCallback = this.h;
        if (iPPSWebEventCallback != null) {
            iPPSWebEventCallback.onWebOpen();
        }
        rc rcVar = this.d;
        if (rcVar != null) {
            rcVar.g();
        }
    }

    private Set<String> l() {
        MetaData metaData;
        AdLandingPageData adLandingPageData = this.f;
        if (adLandingPageData != null && (metaData = (MetaData) com.huawei.openalliance.ad.utils.bk.b(adLandingPageData.u(), MetaData.class, new Class[0])) != null) {
            List<String> listE = metaData.E();
            if (!com.huawei.openalliance.ad.utils.bm.a(listE)) {
                return new HashSet(listE);
            }
        }
        return new HashSet();
    }

    private boolean k() {
        return System.currentTimeMillis() - this.p < 2000;
    }

    private boolean b(String str, ContentRecord contentRecord) {
        if (contentRecord != null && contentRecord.ag() != null && contentRecord.ag().getPackageName() != null) {
            List listAsList = Arrays.asList(fp.b(this.e).ax().split(","));
            if (!com.huawei.openalliance.ad.utils.bm.a(listAsList) && listAsList.contains(str)) {
                hw.b(f19818c, "packageName in white packagenames");
                return false;
            }
            if (contentRecord.D() == 7 && !str.equals(contentRecord.ag().getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static void b(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(false);
        settings.setCacheMode(-1);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
    }

    private Intent b(Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        Set<String> setL = l();
        String scheme = safeIntent.getScheme();
        if (com.huawei.openalliance.ad.utils.bm.a(setL) || !a(safeIntent, setL, scheme)) {
            Set<String> setBO = fp.b(this.e).bO();
            if (com.huawei.openalliance.ad.utils.bm.a(setBO)) {
                return null;
            }
            if (!a(safeIntent, setBO, scheme)) {
                if (this.k.booleanValue() || !com.huawei.openalliance.ad.constant.Constants.SCHEME_MARKET.equalsIgnoreCase(scheme) || !com.huawei.openalliance.ad.utils.k.a(this.e, "com.huawei.appmarket")) {
                    return null;
                }
                safeIntent.setPackage("com.huawei.appmarket");
                return safeIntent;
            }
        }
        return safeIntent;
    }

    private boolean a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!fp.b(context).j(com.huawei.openalliance.ad.utils.dg.m(str))) {
            return false;
        }
        hw.b(f19818c, "url is blocked");
        c();
        return true;
    }

    private boolean a(Intent intent, Set<String> set, String str) {
        boolean z;
        Iterator<String> it = set.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String[] strArrSplit = it.next().split(":");
            if (strArrSplit.length == 2 && (strArrSplit[0].equalsIgnoreCase(str) || strArrSplit[0].equalsIgnoreCase("*"))) {
                z = true;
                intent.setPackage(strArrSplit[1]);
                if (com.huawei.openalliance.ad.constant.Constants.SCHEME_MARKET.equalsIgnoreCase(str)) {
                    this.k = true;
                }
                if (a(intent) != null) {
                    break;
                }
            }
        }
        return z;
    }

    private void a(final String str, final ContentRecord contentRecord) {
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.od.2
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(od.this.e).c(str, contentRecord);
            }
        });
    }

    private void a(final Object obj) {
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.od.1
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.utils.cr.a(obj, od.this.f.e());
            }
        });
    }

    private void a(com.huawei.openalliance.ad.utils.k.a aVar, ContentRecord contentRecord) {
        if (k()) {
            return;
        }
        this.p = System.currentTimeMillis();
        hw.a(f19818c, "different app name, info appName: %s, intent appName: %s", aVar.a(), contentRecord.ag().getPackageName());
        String strB = com.huawei.openalliance.ad.utils.dg.b(aVar.b()) ? "" : aVar.b();
        Context context = this.e;
        Toast.makeText(context, context.getString(R.string.hiad_interception_landing_page, strB), 0).show();
        a(aVar.a(), contentRecord);
    }

    private void a(WebView webView, final com.huawei.openalliance.ad.utils.k.a aVar, final Intent intent, final com.huawei.openalliance.ad.utils.dcservice.c cVar, boolean z) {
        try {
            View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.hiad_open_app_dialog, (ViewGroup) null);
            CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.hiad_open_app_nomore_remind);
            TextView textView = (TextView) viewInflate.findViewById(R.id.hiad_open_app_tips);
            String strB = aVar.b();
            if (TextUtils.isEmpty(strB) || !cc.b(this.e) || z) {
                if (!z) {
                    strB = this.e.getString(R.string.hiad_default_app_name);
                }
                checkBox.setVisibility(8);
            }
            textView.setText(this.e.getString(R.string.hiad_landing_page_open_app, strB));
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.openalliance.ad.od.3
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    od.this.g = z2;
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(this.e);
            builder.setView(viewInflate);
            builder.setPositiveButton(R.string.hiad_dialog_allow, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.od.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    od.this.h();
                    com.huawei.openalliance.ad.utils.k.a(od.this.e, intent, cVar);
                    if (od.this.g) {
                        fp.b(od.this.e).a(aVar.a(), true);
                    }
                }
            });
            builder.setNeutralButton(R.string.hiad_dialog_reject, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.od.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    od.this.i();
                    if (od.this.g) {
                        fp.b(od.this.e).a(aVar.a(), false);
                    }
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            if (!(webView.getContext() instanceof Activity)) {
                alertDialogCreate.getWindow().setType(2003);
            }
            alertDialogCreate.show();
            com.huawei.openalliance.ad.analysis.c cVar2 = this.i;
            if (cVar2 != null) {
                cVar2.a(this.f19383a, true, (String) null);
            }
        } catch (Exception e) {
            hw.d(f19818c, "alertDialog.show error : %s, %s", e.getClass().getSimpleName(), e.getMessage());
            com.huawei.openalliance.ad.analysis.c cVar3 = this.i;
            if (cVar3 != null) {
                cVar3.a(this.f19383a, false, e.getClass().getSimpleName());
            }
        }
    }

    private void a(Context context, com.huawei.openalliance.ad.views.interfaces.w wVar) {
        this.e = context;
        a(wVar);
        this.i = new com.huawei.openalliance.ad.analysis.c(context);
        this.j = new com.huawei.openalliance.ad.analysis.i(context);
        this.o = fp.b(context).am();
    }

    private com.huawei.openalliance.ad.utils.k.a a(Intent intent) {
        Set<com.huawei.openalliance.ad.utils.k.a> setA = com.huawei.openalliance.ad.utils.k.a(this.e, intent);
        if (setA == null || setA.isEmpty()) {
            return null;
        }
        if (setA.size() > 1 && cc.b(this.e)) {
            return null;
        }
        Iterator<com.huawei.openalliance.ad.utils.k.a> it = setA.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    private Intent a(Uri uri) {
        String str;
        String str2;
        try {
            String scheme = uri.getScheme();
            if (!scheme.equals("http") && !scheme.equals(ProxyConfig.MATCH_HTTPS)) {
                if (!scheme.equals(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)) {
                    return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
                }
                Intent uri2 = Intent.parseUri(uri.toString(), 1);
                if (uri2.getData() != null) {
                    uri2 = uri2.setDataAndTypeAndNormalize(uri2.getData(), uri2.getType());
                }
                uri2.setComponent(null);
                uri2.setSelector(null);
                uri2.addCategory("android.intent.category.BROWSABLE");
                return uri2;
            }
            hw.a(f19818c, "getIntent contains http");
            return null;
        } catch (RuntimeException unused) {
            str = f19818c;
            str2 = "getIntent RuntimeException";
            hw.c(str, str2);
            return null;
        } catch (Exception unused2) {
            str = f19818c;
            str2 = "getIntent Exception";
            hw.c(str, str2);
            return null;
        }
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WebView f19833a;

        @Override // java.lang.Runnable
        public void run() {
            WebView webView = this.f19833a;
            if (webView != null) {
                webView.clearHistory();
            }
        }

        public a(WebView webView) {
            this.f19833a = webView;
        }
    }

    public od(Context context, com.huawei.openalliance.ad.views.interfaces.w wVar) {
        a(context, wVar);
    }

    public od(Context context, AdLandingPageData adLandingPageData, com.huawei.openalliance.ad.views.interfaces.w wVar) {
        a(context, wVar);
        a(adLandingPageData);
    }
}
