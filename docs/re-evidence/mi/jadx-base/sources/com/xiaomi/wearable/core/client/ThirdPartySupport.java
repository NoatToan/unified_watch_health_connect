package com.xiaomi.wearable.core.client;

import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import defpackage.s5f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/wearable/core/client/ThirdPartySupport;", "", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "api", "", "addThirdDeviceInfo", "(Lcom/xiaomi/wearable/core/DeviceInfo;Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;)V", "", "did", "", "type", "detailType", "path", "Ls5f;", "callback", "sendThirdFile", "(Ljava/lang/String;IILjava/lang/String;Ls5f;)V", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public interface ThirdPartySupport {
    void addThirdDeviceInfo(@NotNull com.xiaomi.wearable.core.DeviceInfo deviceInfo, @Nullable IDeviceApiCall api);

    void sendThirdFile(@NotNull String did, int type, int detailType, @NotNull String path, @NotNull s5f callback);
}
