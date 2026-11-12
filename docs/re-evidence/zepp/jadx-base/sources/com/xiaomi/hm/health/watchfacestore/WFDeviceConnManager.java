package com.xiaomi.hm.health.watchfacestore;

import android.bluetooth.BluetoothAdapter;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.device.channel.IBlueToothChannel;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/watchfacestore/WFDeviceConnManager;", "", "", PointCategory.INIT, "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/eventbus/EventBluetooth;", "eventBluetooth", "Lcom/xiaomi/hm/health/device/event/HMDeviceBatteryEvent;", "eventBattery", "", "isBluetoothEnable", "Lcom/huami/watchfacesstore/device/channel/IBlueToothChannel;", "a", "Lcom/huami/watchfacesstore/device/channel/IBlueToothChannel;", "channel", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WFDeviceConnManager {

    @NotNull
    public static final WFDeviceConnManager INSTANCE = new WFDeviceConnManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final IBlueToothChannel channel = (IBlueToothChannel) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IBlueToothChannel.class), null, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceConnectionEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
            super(0);
            this.a = hMDeviceConnectionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ EventBluetooth a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EventBluetooth eventBluetooth) {
            super(0);
            this.a = eventBluetooth;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "EventBluetooth " + this.a.isOn;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceBatteryEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDeviceBatteryEvent hMDeviceBatteryEvent) {
            super(0);
            this.a = hMDeviceBatteryEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "eventBattery " + this.a.getBatteryInfo().isCharging();
        }
    }

    private WFDeviceConnManager() {
    }

    public final void init() {
        EventBus.getDefault().registerSticky(this);
    }

    public final boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        int i;
        HMLog.info("DeviceConnManager", new a(event));
        if (event.getDeviceType() == HMDeviceType.MILI || event.getDeviceType() == HMDeviceType.WATCH) {
            if (event.isConnected()) {
                i = 0;
            } else {
                i = event.isConnecting() ? 1 : 2;
            }
            if (isBluetoothEnable()) {
                channel.onDeviceConnectStatus(i);
            }
        }
    }

    public final void onEventMainThread(@NotNull EventBluetooth eventBluetooth) {
        channel.onBleOpened(eventBluetooth.isOn);
        HMLog.info("DeviceConnManager", new b(eventBluetooth));
    }

    public final void onEventMainThread(@NotNull HMDeviceBatteryEvent eventBattery) {
        if (eventBattery.getDeviceType() == HMDeviceType.MILI || eventBattery.getDeviceType() == HMDeviceType.WATCH) {
            HMLog.info("DeviceConnManager", new c(eventBattery));
            channel.onBatteryCharging(eventBattery.getBatteryInfo().isCharging());
        }
    }
}
