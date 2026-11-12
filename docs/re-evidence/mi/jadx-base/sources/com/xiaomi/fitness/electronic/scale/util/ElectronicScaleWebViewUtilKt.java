package com.xiaomi.fitness.electronic.scale.util;

import android.content.Intent;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.ElectronicScaleWebViewActivity;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.eji;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"startEcoWebView", "", "url", "", "title", "showTitle", "", "collapseTitle", "colorRes", "", "did", "mac", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "electronic-scale_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScaleWebViewUtilKt {
    @JvmOverloads
    public static final void startEcoWebView(@NotNull String url, @NotNull String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        startEcoWebView$default(url, null, false, false, null, did, mac, 30, null);
    }

    public static /* synthetic */ void startEcoWebView$default(String str, String str2, boolean z, boolean z2, Integer num, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str5 = str2;
        boolean z3 = (i & 4) != 0 ? true : z;
        boolean z4 = (i & 8) != 0 ? true : z2;
        if ((i & 16) != 0) {
            num = Integer.valueOf(eji.x);
        }
        startEcoWebView(str, str5, z3, z4, num, str3, str4);
    }

    @JvmOverloads
    public static final void startEcoWebView(@NotNull String url, @Nullable String str, @NotNull String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        startEcoWebView$default(url, str, false, false, null, did, mac, 28, null);
    }

    @JvmOverloads
    public static final void startEcoWebView(@NotNull String url, @Nullable String str, boolean z, @NotNull String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        startEcoWebView$default(url, str, z, false, null, did, mac, 24, null);
    }

    @JvmOverloads
    public static final void startEcoWebView(@NotNull String url, @Nullable String str, boolean z, boolean z2, @NotNull String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        startEcoWebView$default(url, str, z, z2, null, did, mac, 16, null);
    }

    @JvmOverloads
    public static final void startEcoWebView(@NotNull String url, @Nullable String str, boolean z, boolean z2, @Nullable Integer num, @NotNull String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i("webview url = " + url + " , title = " + str, new Object[0]);
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) ElectronicScaleWebViewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, str);
        intent.putExtra(WebViewActivity.COLLAPSE_TITLE, z2);
        intent.putExtra(WebViewActivity.SHOW_TITLE_COLOR, num);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, z);
        intent.putExtra("URL", url);
        intent.putExtra("did", did);
        intent.putExtra("mac", mac);
        intent.setFlags(268435456);
        ApplicationExtKt.getApplication().startActivity(intent);
    }
}
