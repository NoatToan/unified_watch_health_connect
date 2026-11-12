package com.xiaomi.fitness.milink.component;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.milink.MilinkConstants;
import com.xiaomi.fitness.milink.MilinkDataHandler;
import com.xiaomi.fitness.milink.component.MiLinkComponent;
import com.xiaomi.fitness.milink.export.MilinkManager;
import com.xiaomi.fitness.milink.export.MilinkManagerExtKt;
import com.xiaomi.fitness.milink.screencast.ScreenCastHandler;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0004\n\u0002\b\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/milink/component/MiLinkComponent;", "", "<init>", "()V", "TAG", "", "TAG$1", "mDataHandler", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "getMDataHandler", "()Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "mDataHandler$delegate", "Lkotlin/Lazy;", "milinkDataHandler", "getMilinkDataHandler", "milinkDataHandler$delegate", "launchMiLinkComponent", "", "init", "addCirculateHandler", "isScreenCastHandlerAdded", "", "()Z", "setScreenCastHandlerAdded", "(Z)V", "initScreenCastHandler", "initMilinkClient", "Companion", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "milink")
public final class MiLinkComponent {

    @NotNull
    public static final String TAG = "MiLinkComponent";
    private boolean isScreenCastHandlerAdded;

    /* JADX INFO: renamed from: TAG$1, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "MiLinkComponent";

    /* JADX INFO: renamed from: mDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bvf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiLinkComponent.mDataHandler_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: milinkDataHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy milinkDataHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cvf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiLinkComponent.milinkDataHandler_delegate$lambda$1();
        }
    });

    private final void addCirculateHandler() {
        MilinkHelper.INSTANCE.initCirculateContext();
        initMilinkClient();
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(23, getMilinkDataHandler());
    }

    private final DataHandlerWrapper getMDataHandler() {
        return (DataHandlerWrapper) this.mDataHandler.getValue();
    }

    private final DataHandlerWrapper getMilinkDataHandler() {
        return (DataHandlerWrapper) this.milinkDataHandler.getValue();
    }

    private final void init() {
        addCirculateHandler();
    }

    private final void initMilinkClient() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.milink.component.MiLinkComponent.initMilinkClient.1
            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectFailure(String did, int errorCode, int retryTimes) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectStart(String did) {
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onConnectSuccess(String did) {
                MiLinkComponent.this.initScreenCastHandler();
                boolean zIsDeviceSupportMilink = MilinkManagerExtKt.getInstance(MilinkManager.INSTANCE).isDeviceSupportMilink();
                Logger.i(MiLinkComponent.this.TAG, "initMilinkClient isDeviceSupportMilink: " + zIsDeviceSupportMilink);
                MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                if (milinkHelper.isSupportMilink() && zIsDeviceSupportMilink) {
                    MilinkHelper.initCirculateClient$default(milinkHelper, MilinkConstants.INSTANCE.getLocalOnlyProtocolTypes(), false, 2, null);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
            public void onDisconnect(String did) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initScreenCastHandler() {
        if (this.isScreenCastHandlerAdded) {
            return;
        }
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(23, getMDataHandler());
        this.isScreenCastHandlerAdded = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenCastHandler mDataHandler_delegate$lambda$0() {
        return new ScreenCastHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MilinkDataHandler milinkDataHandler_delegate$lambda$1() {
        return new MilinkDataHandler();
    }

    /* JADX INFO: renamed from: isScreenCastHandlerAdded, reason: from getter */
    public final boolean getIsScreenCastHandlerAdded() {
        return this.isScreenCastHandlerAdded;
    }

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void launchMiLinkComponent() {
        Logger.i(this.TAG, "launchMiLinkComponent");
        init();
    }

    public final void setScreenCastHandlerAdded(boolean z) {
        this.isScreenCastHandlerAdded = z;
    }
}
