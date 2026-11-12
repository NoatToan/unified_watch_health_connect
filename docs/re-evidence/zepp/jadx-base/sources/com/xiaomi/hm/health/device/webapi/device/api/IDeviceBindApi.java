package com.xiaomi.hm.health.device.webapi.device.api;

import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/device/api/IDeviceBindApi;", "", "Lcom/xiaomi/hm/health/device/webapi/device/HMWebBindInfo;", "info", "", "sync", "Lcom/huami/network/base/handler/IHMBasicHttpResponseHandler;", "handler", "", "request", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IDeviceBindApi {
    void request(@NotNull HMWebBindInfo info, boolean sync, @NotNull IHMBasicHttpResponseHandler handler);
}
