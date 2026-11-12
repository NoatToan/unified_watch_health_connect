package com.huami.bluetooth.profile.channel.module.phone.dto;

import androidx.annotation.NonNull;
import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;

/* JADX INFO: loaded from: classes6.dex */
public class QueryPairDto implements Layout {

    @Order(2)
    public String name;

    @Order(1)
    public UInt8 type;

    public QueryPairDto(int type, @NonNull String name) {
        this.type = new UInt8(type);
        this.name = name;
    }
}
