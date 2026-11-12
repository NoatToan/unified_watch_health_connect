package com.huami.device.feature.health.device;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/device/feature/health/device/IDeviceAppApi;", "", "", "key", "getUserProperty", "value", "", "saveUserProperty", "uploadUserProperty", "Landroid/app/Activity;", "activity", "url", "openWebActivity", "health-base_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceAppApi {
    @NotNull
    String getUserProperty(@NotNull String key);

    void openWebActivity(@NotNull Activity activity, @NotNull String url);

    void saveUserProperty(@NotNull String key, @NotNull String value);

    void uploadUserProperty(@NotNull String key);
}
