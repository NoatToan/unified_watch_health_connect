package com.xiaomi.fitness.research.upgrade;

import android.net.Uri;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.iqc;
import defpackage.ue5;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/research/upgrade/DownloadWebViewClient;", "Lue5;", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "", "goToUriPage", "(Landroid/net/Uri;)V", "Ljava/lang/ref/WeakReference;", "Liqc;", "webViewPage", "<init>", "(Ljava/lang/ref/WeakReference;)V", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DownloadWebViewClient extends ue5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWebViewClient(@NotNull WeakReference<iqc> webViewPage) {
        super(webViewPage);
        Intrinsics.checkNotNullParameter(webViewPage, "webViewPage");
    }

    @Override // defpackage.ue5
    public void goToUriPage(@Nullable Uri uri) {
        new AppDownloader().startDownload("MiResearch", String.valueOf(uri));
        iqc view = getView();
        if (view != null) {
            view.finishFromWeb();
        }
    }
}
