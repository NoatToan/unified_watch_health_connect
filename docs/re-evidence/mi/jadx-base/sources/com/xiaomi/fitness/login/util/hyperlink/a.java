package com.xiaomi.fitness.login.util.hyperlink;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.util.hyperlink.a;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.lji;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f12367a = lji.f25135b;

    /* JADX INFO: renamed from: com.xiaomi.fitness.login.util.hyperlink.a$a, reason: collision with other inner class name */
    public interface InterfaceC0641a {
        void callBack(String str);
    }

    public static CharSequence b(String str) {
        return c(str, null, f12367a);
    }

    public static CharSequence c(String str, String[] strArr, int i) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            if (strArr == null || strArr.length < length) {
                strArr = new String[length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                e(spannableStringBuilder, uRLSpanArr[i2], strArr[i2], i, null);
            }
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ void d(URLSpan uRLSpan, InterfaceC0641a interfaceC0641a, String str, View view) {
        String url = uRLSpan.getURL();
        if (interfaceC0641a != null) {
            interfaceC0641a.callBack(url);
        }
        if (TextUtils.isEmpty(url)) {
            return;
        }
        WebViewUtilKt.startWebView(url, str, true);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, final URLSpan uRLSpan, final String str, int i, final InterfaceC0641a interfaceC0641a) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        LoginCommonClickSpan loginCommonClickSpan = new LoginCommonClickSpan(new LoginCommonClickSpan.OnLinkClickListener(uRLSpan, interfaceC0641a, str) { // from class: nqe

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ URLSpan f28253a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f28254b;

            {
                this.f28254b = str;
            }

            @Override // com.xiaomi.fitness.login.util.hyperlink.LoginCommonClickSpan.OnLinkClickListener
            public final void onLinkClick(View view) {
                a.d(this.f28253a, null, this.f28254b, view);
            }
        }, i);
        spannableStringBuilder.setSpan(new StyleSpan(1), spanStart, spanEnd, 33);
        spannableStringBuilder.setSpan(loginCommonClickSpan, spanStart, spanEnd, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AppUtil.getApp().getColor(lji.c)), spanStart, spanEnd, 18);
    }
}
