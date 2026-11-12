package com.xiaomi.fitness.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.service.OnMedalWallPageShareMethodListener;
import com.xiaomi.fitness.webview.a;
import defpackage.ami;
import defpackage.jsi;
import defpackage.kq2;
import defpackage.m4i;
import defpackage.ni4;
import defpackage.poi;
import defpackage.pvi;
import defpackage.q1j;
import defpackage.s4m;
import defpackage.xpd;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<WebView> f13439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<BaseActivity> f13440b;
    public PopupWindow c;
    public int d = 0;
    public final String e = "window.miWear.dispatchEvent('popMenuClick',{index: %d})";
    public final String f = "window.miWear.dispatchEvent('optionButtonClick',{index: %d})";
    public final String g = "window.miWear.getShareData()";
    public final String h = "javascript:(function isThirdPartyUrl(){if(typeof(window.miWear)!='undefined' && typeof(window.miWear.getShareData)!='undefined' ){ return false; }else{ return true;}})()";
    public final String i = "window.miWear.dispatchEvent('machine_guide_stepReady',{stepName: '%s'})";
    public Handler j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f13441k = AppUtil.getApp();
    public s4m l;
    public OnMedalWallPageShareMethodListener m;

    public a(WeakReference<BaseActivity> weakReference, WeakReference<WebView> weakReference2) {
        this.f13439a = weakReference2;
        this.f13440b = weakReference;
    }

    public static /* synthetic */ boolean C(View view, MotionEvent motionEvent) {
        return false;
    }

    public static boolean l(String str) throws URISyntaxException {
        if (!str.startsWith("https://")) {
            Logger.i("WebViewHelper", "checkDomain: schema error, url = " + str);
            return false;
        }
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.US);
        String str2 = lowerCase.equals("cn") ? "" : lowerCase + ".";
        Logger.i("WebViewHelper", "checkDomain: region = " + str2 + "; url = " + str);
        String[] strArr = {"pv-watch-appstore.iot.mi.com", "st-watch-appstore.iot.mi.com", str2 + "watch-appstore.iot.mi.com", "st-watch.iot.mi.com", str2 + "watch.iot.mi.com", str2 + "res.eco.mi.com", m(str2) + "cdn.eco.mi.com", "res.pre.mi.com", WebviewConstants.DOMAIN_XIAOMI_TV_PRODUCT, WebviewConstants.DOMAIN_XIAOMI_TV_TEST, WebviewConstants.DOMAIN_MIBI_PRODUCT, WebviewConstants.DOMAIN_MIBI_STAGING, WebviewConstants.DOMAIN_MIBI_MAGIC};
        String host = new URI(str).getHost();
        for (int i = 0; i < 13; i++) {
            if (host.equals(strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static String m(String str) {
        if (str.equals("us.")) {
            return "or.";
        }
        if (str.equals("de.")) {
            return "eu.";
        }
        return str.equals("i2.") ? "in." : str;
    }

    public static String s(String str, String str2) {
        return (str.startsWith("http://") || str.startsWith("https://")) ? Uri.parse(str).getQueryParameter(str2) : "";
    }

    public static /* synthetic */ void u(OptionMenu.MenuItem menuItem, String str) {
        Logger.d(String.format("%s menuEvent,index:%d result:%s", "|WEBVIEW|", Integer.valueOf(menuItem.getIndex()), str), new Object[0]);
    }

    public static /* synthetic */ void y(String str) {
    }

    public static /* synthetic */ void z(int i, String str) {
        Logger.d(String.format("%s menuEvent,index:%d result:%s", "|WEBVIEW|", Integer.valueOf(i), str), new Object[0]);
    }

    public final /* synthetic */ void A(boolean z, float f, float f2, boolean z2, String str) {
        if (z) {
            if (Build.VERSION.SDK_INT >= 29 || !PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
                E(f, f2, z2);
                return;
            }
            BaseActivity baseActivity = this.f13440b.get();
            if (baseActivity == null) {
                return;
            }
            PermissionsUtil.INSTANCE.requestPermissions(baseActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
            return;
        }
        OptionShare optionShare = (OptionShare) xpd.f(str, OptionShare.class);
        Logger.i("WebViewHelper", "shareData " + str);
        if (optionShare == null) {
            ToastExtKt.show(AppUtil.getApp(), this.f13441k.getString(q1j.common_hint_unkonwn_error));
        } else {
            D(optionShare.getTitle(), optionShare.getDescription(), optionShare.getUrl(), optionShare.getImageUrl(), true);
        }
    }

    public final /* synthetic */ void B(final boolean z, final float f, final float f2, final boolean z2, final String str) {
        this.j.post(new Runnable() { // from class: ybr
            @Override // java.lang.Runnable
            public final void run() {
                this.f40023a.A(z, f, f2, z2, str);
            }
        });
        Logger.d("|WEBVIEW|share:" + str, new Object[0]);
    }

    public final void D(String str, String str2, String str3, String str4, boolean z) {
        if (this.l == null) {
            BaseActivity baseActivity = this.f13440b.get();
            if (baseActivity == null) {
                return;
            } else {
                this.l = new s4m(baseActivity);
            }
        }
        this.l.x(str, str2, str3, str4, z);
    }

    public final void E(float f, float f2, boolean z) {
        if (this.l == null) {
            BaseActivity baseActivity = this.f13440b.get();
            if (baseActivity == null) {
                return;
            } else {
                this.l = new s4m(baseActivity);
            }
        }
        WebView webViewT = t();
        if (webViewT != null) {
            this.l.m(webViewT, f, f2, z);
            this.l.setOnMedalWallPageShareMethodListener(this.m);
        }
    }

    @SuppressLint({"ClickableViewAccessibility", "InflateParams"})
    public void F(View view, List<OptionMenu.MenuItem> list) {
        LinearLayout linearLayout;
        Context contextR = r();
        if (contextR == null) {
            return;
        }
        PopupWindow popupWindow = this.c;
        if (popupWindow == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(contextR).inflate(pvi.f30830b, (ViewGroup) null);
            PopupWindow popupWindow2 = new PopupWindow((View) linearLayout, -2, -2, true);
            this.c = popupWindow2;
            popupWindow2.setTouchable(true);
            this.c.setTouchInterceptor(new View.OnTouchListener() { // from class: sbr
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return a.C(view2, motionEvent);
                }
            });
            this.c.setBackgroundDrawable(ni4.e(AppUtil.getApp(), poi.j));
        } else {
            linearLayout = (LinearLayout) popupWindow.getContentView();
            linearLayout.removeAllViews();
        }
        j(contextR, linearLayout, list);
        int dimensionPixelSize = contextR.getResources().getDimensionPixelSize(ami.common_top_menu_top_offset);
        m4i.c(this.c, view, -(contextR.getResources().getDimensionPixelSize(ami.common_top_menu_right_offset) + this.d), -dimensionPixelSize, 8388693);
    }

    public final void j(Context context, LinearLayout linearLayout, List<OptionMenu.MenuItem> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            linearLayout.addView(k(context, i, size, list.get(i)));
            if (this.d == 0) {
                linearLayout.measure(0, 0);
                this.d = linearLayout.getMeasuredWidth();
            }
            if (i < size - 1) {
                View view = new View(context);
                view.setBackgroundResource(poi.i);
                view.setLayoutParams(new ViewGroup.LayoutParams(this.d, context.getResources().getDimensionPixelSize(ami.common_divider_height)));
                linearLayout.addView(view);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility", "InflateParams", "DefaultLocale"})
    public final View k(Context context, int i, int i2, OptionMenu.MenuItem menuItem) {
        BitmapDrawable bitmapDrawable;
        final View viewInflate = LayoutInflater.from(context).inflate(pvi.f30829a, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(jsi.d);
        textView.setText(menuItem.getTitle());
        if (i2 == 1) {
            viewInflate.setBackgroundResource(poi.l);
        } else if (i == 0) {
            viewInflate.setBackgroundResource(poi.m);
        } else if (i == i2 - 1) {
            viewInflate.setBackgroundResource(poi.f30589k);
        } else {
            viewInflate.setBackgroundResource(poi.l);
        }
        Bitmap bitmapA = kq2.a(menuItem.getIcon(), DisplayUtil.getScreenDensity() / 3.0f);
        if (bitmapA != null) {
            bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapA);
        } else {
            bitmapDrawable = "share".equals(menuItem.getType()) ? new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), poi.d)) : null;
        }
        if (bitmapDrawable != null) {
            int iDip2px = DisplayUtil.dip2px(25.0f);
            bitmapDrawable.setBounds(0, 0, iDip2px, iDip2px);
            textView.setCompoundDrawables(bitmapDrawable, null, null, null);
        }
        menuItem.setIndex(i);
        viewInflate.setTag(menuItem);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: xbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f38952a.v(viewInflate, view);
            }
        });
        return viewInflate;
    }

    @SuppressLint({"DefaultLocale"})
    public void n(final int i, final boolean z, final boolean z2) {
        final WebView webViewT = t();
        if (webViewT == null) {
            return;
        }
        webViewT.evaluateJavascript("javascript:(function isThirdPartyUrl(){if(typeof(window.miWear)!='undefined' && typeof(window.miWear.getShareData)!='undefined' ){ return false; }else{ return true;}})()", new ValueCallback() { // from class: tbr
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f34552a.x(webViewT, z, z2, i, (String) obj);
            }
        });
    }

    public void o(String str) {
        WebView webViewT = t();
        if (webViewT == null) {
            return;
        }
        webViewT.evaluateJavascript(String.format("window.miWear.dispatchEvent('machine_guide_stepReady',{stepName: '%s'})", str), new ValueCallback() { // from class: ubr
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                a.y((String) obj);
            }
        });
    }

    public void p(final int i) {
        WebView webViewT = t();
        if (webViewT == null) {
            return;
        }
        webViewT.evaluateJavascript(String.format("window.miWear.dispatchEvent('optionButtonClick',{index: %d})", Integer.valueOf(i)), new ValueCallback() { // from class: vbr
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                a.z(i, (String) obj);
            }
        });
    }

    public void q(WebView webView, final boolean z, final float f, final float f2, final boolean z2) {
        webView.evaluateJavascript("window.miWear.getShareData()", new ValueCallback() { // from class: wbr
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f37819a.B(z, f, f2, z2, (String) obj);
            }
        });
    }

    public final Context r() {
        WeakReference<BaseActivity> weakReference = this.f13440b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setOnMedalWallPageShareMethodListener(OnMedalWallPageShareMethodListener onMedalWallPageShareMethodListener) {
        this.m = onMedalWallPageShareMethodListener;
    }

    public final WebView t() {
        WeakReference<WebView> weakReference = this.f13439a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final /* synthetic */ void v(View view, View view2) {
        CustomWebView customWebView = (CustomWebView) t();
        if (customWebView == null) {
            return;
        }
        final OptionMenu.MenuItem menuItem = (OptionMenu.MenuItem) view.getTag();
        if ("share".equals(menuItem.getType())) {
            q(t(), menuItem.isShareTypeScreenShot(), 0.0f, 100.0f, true);
        } else {
            customWebView.setTouchFlag(true);
        }
        customWebView.evaluateJavascript(String.format("window.miWear.dispatchEvent('popMenuClick',{index: %d})", Integer.valueOf(menuItem.getIndex())), new ValueCallback() { // from class: acr
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                a.u(menuItem, (String) obj);
            }
        });
        this.c.dismiss();
    }

    public final /* synthetic */ void w() {
        WebView webViewT = t();
        if (webViewT == null) {
            return;
        }
        D(webViewT.getTitle(), AppUtil.getApp().getResources().getString(q1j.f30994k), webViewT.getUrl(), null, false);
    }

    public final /* synthetic */ void x(WebView webView, boolean z, boolean z2, int i, String str) {
        Logger.d("|WEBVIEW|" + str, new Object[0]);
        if (str != null && str.equals("true")) {
            this.j.post(new Runnable() { // from class: zbr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41106a.w();
                }
            });
        } else {
            q(webView, z, 0.0f, 100.0f, z2);
            p(i);
        }
    }
}
