package com.huami.bluetooth.profile.channel.module.assistant.v2;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class ItemDto implements Layout {

    @Order(1)
    @NotNull
    public String appId;

    @Order(2)
    @NotNull
    public String cardId;

    @Order(3)
    public boolean visible;
}
