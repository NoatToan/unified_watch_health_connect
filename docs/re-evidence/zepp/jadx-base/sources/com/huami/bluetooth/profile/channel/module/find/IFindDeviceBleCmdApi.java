package com.huami.bluetooth.profile.channel.module.find;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000eH&¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "Lcom/huami/bluetooth/profile/channel/module/find/FindDeviceApi;", "Lcom/huami/bluetooth/profile/channel/module/find/DeviceFindStatus;", "findDeviceWithStatus", "", "stopFindDevice", "enable", "enableRing", "Lcom/huami/bluetooth/profile/channel/module/find/IFindPhoneCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerFindPhoneCallback", "callback", "unregisterFindPhoneCallback", "Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceCallback;", "registerFindDeviceCallback", "unregisterFindDeviceCallback", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IFindDeviceBleCmdApi extends FindDeviceApi {
    boolean enableRing(boolean enable);

    @Nullable
    DeviceFindStatus findDeviceWithStatus();

    void registerFindDeviceCallback(@NotNull IFindDeviceCallback callback);

    void registerFindPhoneCallback(@NotNull IFindPhoneCallback listener);

    boolean stopFindDevice();

    void unregisterFindDeviceCallback(@NotNull IFindDeviceCallback callback);

    void unregisterFindPhoneCallback(@NotNull IFindPhoneCallback callback);
}
