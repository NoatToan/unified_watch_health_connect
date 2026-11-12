package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u00020\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH&R\u0018\u0010\u0005\u001a\u00020\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00028\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u001c\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0012\u0010\u001f\u001a\u00020 X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DeviceModel;", "T", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "", "deviceStatus", "", "getDeviceStatus", "()I", "setDeviceStatus", "(I)V", "isDeviceConnected", "", "()Z", "did", "", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "deviceInfo", "getDeviceInfo", "()Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "setDeviceInfo", "(Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;)V", "destroy", "", "isRemoved", "isCurrent", "alias", "getAlias", "product", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "getProduct", "()Lcom/xiaomi/fitness/device/manager/bean/Product;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceModel<T extends DeviceInfo<? extends Device>> {
    void destroy(boolean isRemoved);

    @Nullable
    String getAlias();

    @NotNull
    T getDeviceInfo();

    int getDeviceStatus();

    @NotNull
    String getDid();

    @NotNull
    Product getProduct();

    boolean isCurrent();

    boolean isDeviceConnected();

    void setDeviceInfo(@NotNull T t);

    void setDeviceStatus(int i);

    void setDid(@NotNull String str);
}
