package com.huami.device.feature.gesture.impl.dto;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;

/* JADX INFO: loaded from: classes6.dex */
public class StatusResponseDto implements Layout {

    @Order(2)
    public UInt8 gestureType;

    @Order(3)
    public UInt8 status;

    @Order(1)
    public UInt8 type;
}
