package com.xiaomi.fitness.webview;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.webview.healthwebview.HealthWebViewActivity;
import com.xiaomi.wearable.yrn.export.YRNPushHandler;
import com.xiaomi.wearable.yrn.export.YRNPushHandlerExtKt;
import defpackage.kki;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\r\u001aW\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u001a\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0014"}, d2 = {"startWebView", "", "url", "", "title", "showTitle", "", "collapseTitle", "colorRes", "", "supportShare", "singleTitleBar", "isAddUrlToSet", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/Boolean;Z)V", "starWebViewSupportPDFDownload", "pdfName", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "activityOptions", "Landroid/app/ActivityOptions;", "checkToRn", "webview_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WebViewUtilKt {
    private static final boolean checkToRn(String str) {
        try {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNull(uri);
            if (YRNPushHandlerExtKt.isVirtualPage(uri)) {
                YRNPushHandlerExtKt.getInstance(YRNPushHandler.INSTANCE).handlePushRNPage(uri);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final void starWebViewSupportPDFDownload(@NotNull String url, @Nullable String str, boolean z, boolean z2, @Nullable Integer num, @Nullable Boolean bool, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Logger.d("webview url = " + url + " , title = " + str, new Object[0]);
        if (checkToRn(url)) {
            return;
        }
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) DownloadWebViewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, str);
        intent.putExtra(WebViewActivity.COLLAPSE_TITLE, z2);
        intent.putExtra(WebViewActivity.SHOW_TITLE_COLOR, num);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, z);
        intent.putExtra("URL", url);
        if (bool != null) {
            intent.putExtra(WebViewActivity.SHOW_SINGLE_TITLE_BAR, bool.booleanValue());
        }
        intent.putExtra(DownloadWebViewActivity.KEY_DOWNLOAD_PDF_NAME, str2);
        intent.setFlags(268435456);
        ApplicationExtKt.getApplication().startActivity(intent);
    }

    public static /* synthetic */ void starWebViewSupportPDFDownload$default(String str, String str2, boolean z, boolean z2, Integer num, Boolean bool, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            num = Integer.valueOf(kki.d);
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        starWebViewSupportPDFDownload(str, str2, z, z2, num, bool, str3);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, null, false, false, null, false, null, false, 254, null);
    }

    public static /* synthetic */ void startWebView$default(String str, String str2, boolean z, boolean z2, Integer num, boolean z3, Boolean bool, boolean z4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            num = Integer.valueOf(kki.d);
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            z4 = true;
        }
        startWebView(str, str2, z, z2, num, z3, bool, z4);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, activityOptions, null, false, false, 28, null);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable ActivityOptions activityOptions, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, activityOptions, str, false, false, 24, null);
    }

    public static /* synthetic */ void startWebView$default(String str, ActivityOptions activityOptions, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        startWebView(str, activityOptions, str2, z, z2);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable ActivityOptions activityOptions, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, activityOptions, str, z, false, 16, null);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, str, false, false, null, false, null, false, 252, null);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, str, z, false, null, false, null, false, 248, null);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, str, z, z2, null, false, null, false, 240, null);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable String str, boolean z, boolean z2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, str, z, z2, num, false, null, false, SportReportBaseParser.ReportType.avgFreq, null);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable String str, boolean z, boolean z2, @Nullable Integer num, boolean z3) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, str, z, z2, num, z3, null, false, 192, null);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable String str, boolean z, boolean z2, @Nullable Integer num, boolean z3, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(url, "url");
        startWebView$default(url, str, z, z2, num, z3, bool, false, 128, null);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable String str, boolean z, boolean z2, @Nullable Integer num, boolean z3, @Nullable Boolean bool, boolean z4) {
        Intrinsics.checkNotNullParameter(url, "url");
        Logger.d("webview url = " + url + " , title = " + str, new Object[0]);
        if (checkToRn(url)) {
            return;
        }
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) (z3 ? HealthWebViewActivity.class : WebViewActivity.class));
        intent.putExtra(WebViewActivity.TITLE, str);
        intent.putExtra(WebViewActivity.COLLAPSE_TITLE, z2);
        intent.putExtra(WebViewActivity.SHOW_TITLE_COLOR, num);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, z);
        intent.putExtra("URL", url);
        if (bool != null) {
            intent.putExtra(WebViewActivity.SHOW_SINGLE_TITLE_BAR, bool.booleanValue());
        }
        intent.putExtra(WebViewActivity.IS_ADD_URL_TO_URL_SET, z4);
        intent.setFlags(268435456);
        ApplicationExtKt.getApplication().startActivity(intent);
    }

    @JvmOverloads
    public static final void startWebView(@NotNull String url, @Nullable ActivityOptions activityOptions, @Nullable String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Logger.d("webview url = " + url + " , title = " + str, new Object[0]);
        if (checkToRn(url)) {
            return;
        }
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) WebViewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, str);
        intent.putExtra(WebViewActivity.COLLAPSE_TITLE, z2);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, z);
        intent.putExtra("URL", url);
        intent.setFlags(268435456);
        ApplicationExtKt.getApplication().startActivity(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }
}
