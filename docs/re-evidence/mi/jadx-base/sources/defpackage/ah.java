package defpackage;

import com.huami.bluetooth.profile.channel.module.ProxyModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.sdk.proxy.RequestInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lah;", "", "Lkd;", "device", "Lcom/xiaomi/hm/health/bt/sdk/proxy/RequestInterceptor;", "interceptor", "", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class ah {
    public final void a(@NotNull kd device, @NotNull RequestInterceptor interceptor) {
        ProxyModule proxyModule;
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (device.V() && (proxyModule = (ProxyModule) device.y(ProxyModule.class)) != null) {
            pp ppVar = new pp();
            ppVar.a(interceptor);
            proxyModule.setHttpRequestClient(ppVar);
            proxyModule.start();
        }
    }

    public final void a(@NotNull kd device) {
        Intrinsics.checkNotNullParameter(device, "device");
        ProxyModule proxyModule = (ProxyModule) device.y(ProxyModule.class);
        if (proxyModule == null) {
            return;
        }
        proxyModule.setHttpRequestClient(new pp());
        proxyModule.stop();
    }
}
