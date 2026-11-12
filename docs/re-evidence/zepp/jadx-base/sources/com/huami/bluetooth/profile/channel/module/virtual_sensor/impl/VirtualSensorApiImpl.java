package com.huami.bluetooth.profile.channel.module.virtual_sensor.impl;

import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.base.ToBytesKt;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.SensorData;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.VirtualSensorApi;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.VirtualSensorCommand;
import com.huami.bluetooth.profile.channel.module.virtual_sensor.VirtualSensorModule;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/impl/VirtualSensorApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorApi;", "", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorData;", "list", "", "syncSensorData", BehaviorTaggingWebApi.g.b, "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorModule;", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorModule;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class VirtualSensorApiImpl implements VirtualSensorApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final VirtualSensorModule module;

    public VirtualSensorApiImpl(@NotNull VirtualSensorModule virtualSensorModule) {
        this.module = virtualSensorModule;
    }

    @Override // com.huami.bluetooth.profile.channel.module.virtual_sensor.VirtualSensorApi
    public boolean syncSensorData(@NotNull List<SensorData> list) {
        return BaseModule.syncSendData$default(this.module, VirtualSensorCommand.SyncSensorDataCommand.INSTANCE.withByte(list.size()).withBytes(ToBytesKt.toBytes(list)).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String(), 0, 2, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.virtual_sensor.VirtualSensorApi
    public boolean syncSensorData(@NotNull SensorData sensorData) {
        return syncSensorData(e.listOf(sensorData));
    }
}
