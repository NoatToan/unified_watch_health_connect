package com.huami.bluetooth.profile.channel.module;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/IHttpRequest;", "Ljava/io/Serializable;", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "deviceHttpRequest", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpResponse;", "request", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface IHttpRequest extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f9857a;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.IHttpRequest$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/IHttpRequest$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f9857a = new Companion();
    }

    @NotNull
    DeviceHttpResponse request(@NotNull DeviceHttpRequest deviceHttpRequest);
}
