package com.xiaomi.fitness.nfc.hyperlink;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.xiaomi.fitness.nfc.hyperlink.a;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.rji;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f12520a = rji.o;

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.hyperlink.a$a, reason: collision with other inner class name */
    public interface InterfaceC0650a {
        void callBack(String str);
    }

    public static CharSequence b(String str) {
        return e(str, null, f12520a);
    }

    public static CharSequence c(String str, InterfaceC0650a interfaceC0650a) {
        return f(str, null, interfaceC0650a);
    }

    public static CharSequence d(String str, String[] strArr) {
        return e(str, strArr, f12520a);
    }

    public static CharSequence e(String str, String[] strArr, int i) {
        if (str == null || TextUtils.isEmpty(str)) {
            return "";
        }
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            if (strArr == null || strArr.length < length) {
                strArr = new String[length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                h(spannableStringBuilder, uRLSpanArr[i2], strArr[i2], i, null);
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence f(String str, String[] strArr, InterfaceC0650a interfaceC0650a) {
        Spanned spannedFromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            if (strArr == null || strArr.length < length) {
                strArr = new String[length];
            }
            for (int i = 0; i < length; i++) {
                h(spannableStringBuilder, uRLSpanArr[i], strArr[i], f12520a, interfaceC0650a);
            }
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ void g(URLSpan uRLSpan, InterfaceC0650a interfaceC0650a, String str, View view) {
        String url = uRLSpan.getURL();
        if (interfaceC0650a != null) {
            interfaceC0650a.callBack(url);
        }
        if (TextUtils.isEmpty(url)) {
            return;
        }
        WebViewUtilKt.startWebView(url, str, true);
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, final URLSpan uRLSpan, final String str, int i, final InterfaceC0650a interfaceC0650a) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        CommonClickSpan commonClickSpan = new CommonClickSpan(new CommonClickSpan.OnLinkClickListener() { // from class: l84
            @Override // com.xiaomi.fitness.nfc.hyperlink.CommonClickSpan.OnLinkClickListener
            public final void onLinkClick(View view) {
                a.g(uRLSpan, interfaceC0650a, str, view);
            }
        }, i);
        spannableStringBuilder.setSpan(new StyleSpan(1), spanStart, spanEnd, 33);
        spannableStringBuilder.setSpan(commonClickSpan, spanStart, spanEnd, 33);
    }
}
