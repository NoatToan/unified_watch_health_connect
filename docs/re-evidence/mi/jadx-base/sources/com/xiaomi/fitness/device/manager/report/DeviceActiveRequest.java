package com.xiaomi.fitness.device.manager.report;

import com.xiaomi.fitness.net.BaseRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/device/manager/report/DeviceActiveRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "", "<init>", "()V", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceActiveRequest extends BaseRequest<Object> {

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "app/v1/";
}
