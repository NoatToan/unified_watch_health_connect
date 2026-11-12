package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.device.manager.bean.Device;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceContainer;", "", "requestBindDeviceList", "", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBindDeviceList", "getAllDeviceList", "removeDevice", "", "did", "", "clearAll", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceContainer {
    void clearAll();

    @NotNull
    List<Device> getAllDeviceList();

    @NotNull
    List<Device> getBindDeviceList();

    void removeDevice(@NotNull String did);

    @Nullable
    Object requestBindDeviceList(@NotNull Continuation<? super List<? extends Device>> continuation);
}
