package com.huami.bluetooth.profile.ecf.data;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¨\u0006\u0003"}, d2 = {"", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", "toHeadsetSideListenSetting", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class HeadsetSideListenSettingKt {
    @Nullable
    public static final HeadsetSideListenSetting toHeadsetSideListenSetting(@Nullable byte[] bArr) {
        return HeadsetSideListenSetting.INSTANCE.from(bArr);
    }
}
