package com.huami.bluetooth.profile.channel.module.phonemute;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/phonemute/PhoneMuteListener;", "", "", "isMute", "", "onDeviceStateChange", "onDeviceStateQuery", "()Ljava/lang/Boolean;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface PhoneMuteListener {
    void onDeviceStateChange(boolean isMute);

    @Nullable
    Boolean onDeviceStateQuery();
}
