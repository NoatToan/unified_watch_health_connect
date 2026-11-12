package com.xiaomi.fitness.sport_eco.utils;

import android.content.Intent;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.GuideWebViewActivity;
import com.xiaomi.fitness.webview.WebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"startWebView", "", "url", "", "title", "showTitle", "", "collapseTitle", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WebViewUtilKt {
    public static final void startWebView(@NotNull String url, @Nullable String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Logger.d("webview url = " + url + " , title = " + str, new Object[0]);
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) GuideWebViewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, str);
        intent.putExtra(WebViewActivity.COLLAPSE_TITLE, z2);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, z);
        intent.putExtra("URL", url);
        intent.setFlags(268435456);
        ApplicationExtKt.getApplication().startActivity(intent);
    }

    public static /* synthetic */ void startWebView$default(String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        startWebView(str, str2, z, z2);
    }
}
