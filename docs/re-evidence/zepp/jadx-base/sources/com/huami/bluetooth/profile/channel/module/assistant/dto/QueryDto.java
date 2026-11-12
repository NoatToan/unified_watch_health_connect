package com.huami.bluetooth.profile.channel.module.assistant.dto;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;

/* JADX INFO: loaded from: classes6.dex */
public class QueryDto implements Layout {

    @Order(2)
    public Boolean displayMatters;

    @Order(1)
    public UInt8 type;
}
