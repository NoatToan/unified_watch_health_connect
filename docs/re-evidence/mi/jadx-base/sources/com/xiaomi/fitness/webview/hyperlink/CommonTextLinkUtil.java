package com.xiaomi.fitness.webview.hyperlink;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.kki;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\rJ)\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J4\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0002J/\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u001aJ*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/webview/hyperlink/CommonTextLinkUtil;", "", "<init>", "()V", "defaultHighColorId", "", "getClickableHtml", "", "html", "", "titles", "", "callBack", "Lcom/xiaomi/fitness/webview/hyperlink/CommonTextLinkUtil$OnLinkClickCallBack;", "(Ljava/lang/String;[Ljava/lang/String;Lcom/xiaomi/fitness/webview/hyperlink/CommonTextLinkUtil$OnLinkClickCallBack;)Ljava/lang/CharSequence;", "highColorId", "onClickListener", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/CharSequence;", "setLinkClickable", "", "clickableHtmlBuilder", "Landroid/text/SpannableStringBuilder;", "urlSpan", "Landroid/text/style/URLSpan;", "title", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Ljava/lang/String;[Ljava/lang/String;I)Ljava/lang/CharSequence;", "Landroid/view/View$OnClickListener;", "OnLinkClickCallBack", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonTextLinkUtil {

    @NotNull
    public static final CommonTextLinkUtil INSTANCE = new CommonTextLinkUtil();
    private static final int defaultHighColorId = kki.f23952b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/webview/hyperlink/CommonTextLinkUtil$OnLinkClickCallBack;", "", "callBack", "", "url", "", "webview_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnLinkClickCallBack {
        void callBack(@Nullable String url);
    }

    private CommonTextLinkUtil() {
    }

    private final void setLinkClickable(SpannableStringBuilder clickableHtmlBuilder, final URLSpan urlSpan, final String title, int highColorId, final OnLinkClickCallBack listener) {
        int spanStart = clickableHtmlBuilder.getSpanStart(urlSpan);
        int spanEnd = clickableHtmlBuilder.getSpanEnd(urlSpan);
        CommonClickSpan commonClickSpan = new CommonClickSpan(new CommonClickSpan.OnLinkClickListener() { // from class: com.xiaomi.fitness.webview.hyperlink.CommonTextLinkUtil$setLinkClickable$clickSpan$1
            @Override // com.xiaomi.fitness.webview.hyperlink.CommonClickSpan.OnLinkClickListener
            public void onLinkClick(View view) {
                String url = urlSpan.getURL();
                CommonTextLinkUtil.OnLinkClickCallBack onLinkClickCallBack = listener;
                if (onLinkClickCallBack != null) {
                    onLinkClickCallBack.callBack(url);
                }
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                Intrinsics.checkNotNull(url);
                WebViewUtilKt.startWebView$default(url, title, true, false, null, false, null, false, 248, null);
            }
        }, highColorId);
        clickableHtmlBuilder.setSpan(new StyleSpan(1), spanStart, spanEnd, 33);
        clickableHtmlBuilder.setSpan(commonClickSpan, spanStart, spanEnd, 33);
    }

    @NotNull
    public final CharSequence getClickableHtml(@Nullable String html, @Nullable String[] titles, @Nullable OnLinkClickCallBack callBack) {
        Spanned spannedFromHtml = Html.fromHtml(html);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            if (titles == null || titles.length < length) {
                titles = new String[length];
            }
            for (int i = 0; i < length; i++) {
                URLSpan uRLSpan = uRLSpanArr[i];
                String str = titles[i];
                Intrinsics.checkNotNull(uRLSpan);
                setLinkClickable(spannableStringBuilder, uRLSpan, str, defaultHighColorId, callBack);
            }
        }
        return spannableStringBuilder;
    }

    private final void setLinkClickable(SpannableStringBuilder clickableHtmlBuilder, URLSpan urlSpan, int highColorId, final View.OnClickListener onClickListener) {
        int spanStart = clickableHtmlBuilder.getSpanStart(urlSpan);
        int spanEnd = clickableHtmlBuilder.getSpanEnd(urlSpan);
        CommonClickSpan commonClickSpan = new CommonClickSpan(new CommonClickSpan.OnLinkClickListener() { // from class: com.xiaomi.fitness.webview.hyperlink.CommonTextLinkUtil$setLinkClickable$clickSpan$2
            @Override // com.xiaomi.fitness.webview.hyperlink.CommonClickSpan.OnLinkClickListener
            public void onLinkClick(View view) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        }, highColorId);
        clickableHtmlBuilder.setSpan(new StyleSpan(1), spanStart, spanEnd, 33);
        clickableHtmlBuilder.setSpan(commonClickSpan, spanStart, spanEnd, 33);
    }

    @NotNull
    public final CharSequence getClickableHtml(@Nullable String html) {
        return getClickableHtml(html, (String[]) null, defaultHighColorId);
    }

    @NotNull
    public final CharSequence getClickableHtml(@Nullable String html, int highColorId) {
        return getClickableHtml(html, (String[]) null, highColorId);
    }

    @NotNull
    public final CharSequence getClickableHtml(@Nullable String html, @Nullable OnLinkClickCallBack onClickListener) {
        return getClickableHtml(html, (String[]) null, onClickListener);
    }

    @Nullable
    public final CharSequence getClickableHtml(@Nullable String html, @Nullable String[] titles) {
        return getClickableHtml(html, titles, defaultHighColorId);
    }

    @NotNull
    public final CharSequence getClickableHtml(@Nullable String html, @Nullable String[] titles, int highColorId) {
        Spanned spannedFromHtml = Html.fromHtml(html);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            if (titles == null || titles.length < length) {
                titles = new String[length];
            }
            for (int i = 0; i < length; i++) {
                URLSpan uRLSpan = uRLSpanArr[i];
                String str = titles[i];
                Intrinsics.checkNotNull(uRLSpan);
                setLinkClickable(spannableStringBuilder, uRLSpan, str, highColorId, null);
            }
        }
        return spannableStringBuilder;
    }
}
