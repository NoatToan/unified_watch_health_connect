package com.xiaomi.fitness.access.health_connect;

import android.content.Intent;
import com.xiaomi.fitness.about.export.AboutManager;
import com.xiaomi.fitness.medal.export.AboutManagerExtKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/access/health_connect/HealthConnectPrivacyActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "initDataFromIntent", "", "intent", "Landroid/content/Intent;", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectPrivacyActivity extends Hilt_HealthConnectPrivacyActivity {
    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initDataFromIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.initDataFromIntent(intent);
        Pair<String, String> privacyPageInfo = AboutManagerExtKt.getInstance(AboutManager.INSTANCE).getPrivacyPageInfo();
        setMUrl(privacyPageInfo.getFirst());
        setMTitle(privacyPageInfo.getSecond());
    }
}
