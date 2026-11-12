package com.huami.bluetooth.profile.channel.module.phone.dto;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;

/* JADX INFO: loaded from: classes6.dex */
public class ItemDto implements Layout {

    @Order(1)
    public byte key = 1;

    @Order(2)
    public boolean value = false;

    public String toString() {
        return "ItemDto{key=" + ((int) this.key) + ", value=" + this.value + '}';
    }
}
