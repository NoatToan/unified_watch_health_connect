package com.huami.bluetooth.profile.channel.module.phone.dto;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;

/* JADX INFO: loaded from: classes6.dex */
public class UpdateDto implements Layout {

    @Order(2)
    public Boolean isSuccess;

    @Order(1)
    public UInt8 type;
}
