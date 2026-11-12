package com.xiaomi.fitness.milink.circulate;

import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.milink.bean.ExtraHeadsetData;
import com.xiaomi.fitness.milink.util.MilinkHelper;
import defpackage.knb;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J!\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0010R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/milink/circulate/BluetoothDeviceController;", "Lcom/xiaomi/fitness/milink/circulate/BaseDeviceController;", "deviceInfo", "Lcom/miui/circulate/api/service/CirculateDeviceInfo;", "<init>", "(Lcom/miui/circulate/api/service/CirculateDeviceInfo;)V", "onServiceFound", "", "serviceInfo", "Lcom/miui/circulate/api/service/CirculateServiceInfo;", "onServiceUpdate", "checkCanUpdate", "", "onSearchConnect", "handleHeadsetControl", "voiceMode", "", "multiConnection", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "setVolume", "volume", "onBluetoothModeChanged", "mode", "TAG", "", "getTAG", "()Ljava/lang/String;", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothDeviceController extends BaseDeviceController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothDeviceController(@NotNull CirculateDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    private final boolean checkCanUpdate() {
        Set<CirculateServiceInfo> set;
        BaseDeviceController currentDeviceController = MilinkHelper.INSTANCE.getCurrentDeviceController();
        CirculateDeviceInfo deviceInfo = currentDeviceController != null ? currentDeviceController.getDeviceInfo() : null;
        if (deviceInfo != null && (set = deviceInfo.i) != null && !set.isEmpty()) {
            for (CirculateServiceInfo circulateServiceInfo : deviceInfo.i) {
                if (circulateServiceInfo.e() && circulateServiceInfo.c != 393216) {
                    Logger.i(getTAG(), "headset connect, but " + deviceInfo.c + "'s some service is connect");
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    @NotNull
    public String getTAG() {
        return "MilinkHelper_Bluetooth";
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void handleHeadsetControl(@Nullable Integer voiceMode, @Nullable Integer multiConnection) {
        super.handleHeadsetControl(voiceMode, multiConnection);
        if (voiceMode != null) {
            CirculateServiceInfo circulateServiceInfoC = getDeviceInfo().c(393216);
            Logger.i(getTAG(), "handle " + getDeviceInfo().c + "'s " + circulateServiceInfoC);
            if (circulateServiceInfoC == null) {
                Logger.i(getTAG(), "can not handle " + getDeviceInfo().c + "'s service, not found");
            }
            knb headsetController = MilinkHelper.INSTANCE.getHeadsetController();
            CompletableFuture<Integer> completableFutureW = headsetController != null ? headsetController.w(circulateServiceInfoC, voiceMode.intValue() - 1) : null;
            Logger.i(getTAG(), "setNoiseCancelling result: " + completableFutureW);
        }
    }

    public final void onBluetoothModeChanged(int mode) {
        synchronized (getMLock()) {
            try {
                if (getExtraHeadsetData() == null) {
                    setExtraHeadsetData(new ExtraHeadsetData(0, 0, 3, null));
                }
                ExtraHeadsetData extraHeadsetData = getExtraHeadsetData();
                if (extraHeadsetData != null) {
                    extraHeadsetData.setVoiceMode(mode);
                }
                MilinkHelper.INSTANCE.updateCirculateDeviceWrapperList(this);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public boolean onSearchConnect() {
        boolean z;
        Set<CirculateServiceInfo> set;
        for (CirculateServiceInfo circulateServiceInfo : getDeviceInfo().i) {
            if (circulateServiceInfo.c == 393216) {
                MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
                knb headsetController = milinkHelper.getHeadsetController();
                Boolean boolValueOf = headsetController != null ? Boolean.valueOf(headsetController.o(circulateServiceInfo)) : null;
                Logger.i(getTAG(), "onSearchConnect, isHeadsetOutput: " + boolValueOf);
                BaseDeviceController currentDeviceController = milinkHelper.getCurrentDeviceController();
                CirculateDeviceInfo deviceInfo = currentDeviceController != null ? currentDeviceController.getDeviceInfo() : null;
                if (deviceInfo != null && (set = deviceInfo.i) != null && !set.isEmpty()) {
                    Iterator<CirculateServiceInfo> it = deviceInfo.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        CirculateServiceInfo next = it.next();
                        if (next.e() && next.c != 393216) {
                            Logger.i(getTAG(), "headset connect, but " + deviceInfo.c + "'s some service is connect");
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE) && z) {
                    onConnect(circulateServiceInfo);
                    return true;
                }
            }
        }
        return super.onSearchConnect();
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onServiceFound(@NotNull CirculateServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        super.onServiceFound(serviceInfo);
        Logger.i(getTAG(), "onServiceFound, connectId: " + getConnectId());
        MilinkHelper milinkHelper = MilinkHelper.INSTANCE;
        knb headsetController = milinkHelper.getHeadsetController();
        Boolean boolValueOf = headsetController != null ? Boolean.valueOf(headsetController.o(serviceInfo)) : null;
        Logger.i(getTAG(), "onServiceFound, isHeadsetOutput: " + boolValueOf);
        synchronized (getMLock()) {
            try {
                if (getExtraHeadsetData() == null) {
                    setExtraHeadsetData(new ExtraHeadsetData(0, 0, 3, null));
                }
                ExtraHeadsetData extraHeadsetData = getExtraHeadsetData();
                if (extraHeadsetData != null) {
                    knb headsetController2 = milinkHelper.getHeadsetController();
                    extraHeadsetData.setVoiceMode(headsetController2 != null ? headsetController2.l(serviceInfo) : -1);
                }
                milinkHelper.updateCirculateDeviceWrapperList(this);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE) && checkCanUpdate()) {
            String id = getDeviceInfo().f10301a;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            updateOutputId(id);
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void onServiceUpdate(@NotNull CirculateServiceInfo serviceInfo) {
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        super.onServiceUpdate(serviceInfo);
        Logger.i(getTAG(), "onServiceUpdate");
        knb headsetController = MilinkHelper.INSTANCE.getHeadsetController();
        if (headsetController != null && headsetController.o(serviceInfo) && checkCanUpdate()) {
            Logger.i(getTAG(), "after refresh, circulate to bluetooth: " + getDeviceInfo().c);
            String id = getDeviceInfo().f10301a;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            updateOutputId(id);
        }
    }

    @Override // com.xiaomi.fitness.milink.circulate.BaseDeviceController
    public void setVolume(int volume) {
        super.setVolume(volume);
        CirculateServiceInfo circulateServiceInfoC = getDeviceInfo().c(393216);
        knb headsetController = MilinkHelper.INSTANCE.getHeadsetController();
        if (headsetController != null) {
            headsetController.x(circulateServiceInfoC, volume);
        }
    }
}
