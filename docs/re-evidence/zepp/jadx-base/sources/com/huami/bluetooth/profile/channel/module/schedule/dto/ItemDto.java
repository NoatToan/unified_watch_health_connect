package com.huami.bluetooth.profile.channel.module.schedule.dto;

import androidx.annotation.Keep;
import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt32;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class ItemDto implements Layout {

    @Order(6)
    public int alertTime;

    @Order(3)
    public String description;

    @Order(1)
    public UInt32 id;

    @Order(10)
    public String imageUrl;

    @Order(9)
    public boolean isAllDayEvent;

    @Order(7)
    public UInt32 repeatMode;

    @Order(8)
    public UInt32 repeatStopTime;

    @Order(11)
    public UInt8 source;

    @Order(4)
    public UInt32 startTime;

    @Order(5)
    public UInt32 stopTime;

    @Order(2)
    public String title;

    @Order(12)
    public UInt32 updateVersion;
}
