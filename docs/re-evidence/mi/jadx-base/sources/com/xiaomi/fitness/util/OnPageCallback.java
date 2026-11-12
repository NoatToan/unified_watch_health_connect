package com.xiaomi.fitness.util;

import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/util/OnPageCallback;", "T", "", "showSuccess", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "(Ljava/lang/Object;)V", "showLoading", "showLoadError", "apiException", "Lcom/xiaomi/fitness/net/response/ApiException;", "showNotLoggedIn", "showNetworkNotConnected", "showPlayChannel", "showWebSyncServiceDisabled", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OnPageCallback<T> {
    void showLoadError(@NotNull ApiException apiException);

    void showLoading();

    void showNetworkNotConnected();

    void showNotLoggedIn();

    void showPlayChannel();

    void showSuccess(@Nullable T t);

    void showWebSyncServiceDisabled();
}
