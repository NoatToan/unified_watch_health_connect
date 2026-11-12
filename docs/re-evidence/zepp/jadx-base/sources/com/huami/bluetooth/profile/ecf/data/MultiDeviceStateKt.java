package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000\"\u0016\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState;", "toMultiDeviceState", "", "HEADSET_DEVICE_BYTES", LogUtil.I, "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class MultiDeviceStateKt {
    public static final int HEADSET_DEVICE_BYTES = 4;

    @Nullable
    public static final MultiDeviceState toMultiDeviceState(@Nullable byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            return new MultiDeviceState(bArr[0], bArr[1], bArr[2], bArr[3]);
        }
        return null;
    }
}
