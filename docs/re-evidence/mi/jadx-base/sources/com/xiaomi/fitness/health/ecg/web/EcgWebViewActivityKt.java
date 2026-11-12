package com.xiaomi.fitness.health.ecg.web;

import android.content.Intent;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0007¨\u0006\b"}, d2 = {"startEcgWebActivity", "", "url", "", "ecgMedicalItemReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "origin", "title", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcgWebViewActivityKt {
    @JvmOverloads
    public static final void startEcgWebActivity(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        startEcgWebActivity$default(url, null, null, null, 14, null);
    }

    public static /* synthetic */ void startEcgWebActivity$default(String str, EcgMedicalItemReport ecgMedicalItemReport, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            ecgMedicalItemReport = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        startEcgWebActivity(str, ecgMedicalItemReport, str2, str3);
    }

    @JvmOverloads
    public static final void startEcgWebActivity(@NotNull String url, @Nullable EcgMedicalItemReport ecgMedicalItemReport) {
        Intrinsics.checkNotNullParameter(url, "url");
        startEcgWebActivity$default(url, ecgMedicalItemReport, null, null, 12, null);
    }

    @JvmOverloads
    public static final void startEcgWebActivity(@NotNull String url, @Nullable EcgMedicalItemReport ecgMedicalItemReport, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        startEcgWebActivity$default(url, ecgMedicalItemReport, str, null, 8, null);
    }

    @JvmOverloads
    public static final void startEcgWebActivity(@NotNull String url, @Nullable EcgMedicalItemReport ecgMedicalItemReport, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        Logger.i(EcgWebViewActivity.TAG, "url = " + url + " , title = " + str2);
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) EcgWebViewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, str2);
        intent.putExtra("URL", url);
        intent.putExtra("origin", str);
        intent.putExtra(EcgConstantsKt.PARAM_REPORT, ecgMedicalItemReport);
        intent.setFlags(268435456);
        ApplicationExtKt.getApplication().startActivity(intent);
    }
}
