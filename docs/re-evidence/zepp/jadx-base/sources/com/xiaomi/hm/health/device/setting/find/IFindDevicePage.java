package com.xiaomi.hm.health.device.setting.find;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\b\u001a\u00020\u0004H&J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/IFindDevicePage;", "", "Lcom/xiaomi/hm/health/device/setting/find/IDialogActionHandler;", "action", "", "showDeviceAlertDialog", "dismissDeviceAlertDialog", "showDeviceShakeDialog", "dismissDeviceShakeDialog", "Lcom/xiaomi/hm/health/device/setting/find/IAlertDialogChooseHandler;", "chooseHandler", "showDeviceConHeadsetDialog", "dismissDeviceConHeadsetDialog", "showFindDeviceFailed", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IFindDevicePage {
    void dismissDeviceAlertDialog();

    void dismissDeviceConHeadsetDialog();

    void dismissDeviceShakeDialog();

    void showDeviceAlertDialog(@Nullable IDialogActionHandler action);

    void showDeviceConHeadsetDialog(@Nullable IAlertDialogChooseHandler chooseHandler);

    void showDeviceShakeDialog(@Nullable IDialogActionHandler action);

    void showFindDeviceFailed();
}
