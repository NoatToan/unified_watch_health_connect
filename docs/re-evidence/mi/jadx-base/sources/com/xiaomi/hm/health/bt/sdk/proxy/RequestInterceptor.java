package com.xiaomi.hm.health.bt.sdk.proxy;

import com.huami.bluetooth.profile.channel.module.DeviceHttpRequest;
import com.huami.bluetooth.profile.channel.module.IHttpRequest;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u00012\u00020\u0002:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/proxy/RequestInterceptor;", "Lcom/huami/bluetooth/profile/channel/module/IHttpRequest;", "Ljava/io/Serializable;", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "deviceHttpRequest", "", "interceptor", "Companion", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public interface RequestInterceptor extends IHttpRequest, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f13578a;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.sdk.proxy.RequestInterceptor$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/proxy/RequestInterceptor$a;", "", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f13578a = new Companion();
    }

    boolean interceptor(@NotNull DeviceHttpRequest deviceHttpRequest);
}
