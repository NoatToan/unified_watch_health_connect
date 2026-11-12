package com.huami.device.feature.health.device;

import androidx.p008lifecycle.LiveData;
import com.huami.device.feature.health.device.init.BaseHealthInit;
import com.huami.hid.takepic.TakePicSettingActivity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0002H&J\b\u0010\u000f\u001a\u00020\u0002H&J\b\u0010\u0010\u001a\u00020\u0002H&R\u0016\u0010\u0013\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/huami/device/feature/health/device/HealthDevice;", "", "", "isConnect", "Landroidx/lifecycle/LiveData;", "observeConnectStatus", "isForceHrAndRemEnable", "isHuamiOs", "isHealthDetect", TakePicSettingActivity.KEY_IS_WATCH, "", "source", "isGt2Source", "isIndiaOrHankou", "isMedicalDevice", "isComoDevice", "isMifit", "getDeviceSource", "()I", "deviceSource", "getDeviceType", "deviceType", "", "getDeviceId", "()Ljava/lang/String;", "deviceId", "", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "getHealthList", "()Ljava/util/List;", "healthList", "health-base_release"}, k = 1, mv = {1, 5, 1})
public interface HealthDevice {
    @NotNull
    String getDeviceId();

    int getDeviceSource();

    int getDeviceType();

    @NotNull
    List<BaseHealthInit> getHealthList();

    boolean isComoDevice();

    boolean isConnect();

    boolean isForceHrAndRemEnable();

    boolean isGt2Source(int source);

    boolean isHealthDetect();

    boolean isHuamiOs();

    boolean isIndiaOrHankou();

    boolean isMedicalDevice();

    boolean isMifit();

    boolean isWatch();

    @NotNull
    LiveData<Boolean> observeConnectStatus();
}
