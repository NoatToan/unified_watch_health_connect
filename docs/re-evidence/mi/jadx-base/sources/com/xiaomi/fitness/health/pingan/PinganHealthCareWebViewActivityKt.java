package com.xiaomi.fitness.health.pingan;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.webview.WebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"startPinganHealthCareWebActivity", "", "url", "", "context", "Landroid/content/Context;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PinganHealthCareWebViewActivityKt {
    public static final void startPinganHealthCareWebActivity(@NotNull String url, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.i(PinganHealthCareWebViewActivity.TAG, "url = " + url);
        Intent intent = new Intent(context, (Class<?>) PinganHealthCareWebViewActivity.class);
        intent.putExtra("URL", url);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, false);
        intent.putExtra(WebViewActivity.TITLE_BAR_MATCH_STATUS_BAR, RomUtils.isXiaomi());
        context.startActivity(intent);
    }
}
