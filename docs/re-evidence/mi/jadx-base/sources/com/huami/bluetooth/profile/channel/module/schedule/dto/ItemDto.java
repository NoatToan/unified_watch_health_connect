package com.huami.bluetooth.profile.channel.module.schedule.dto;

import androidx.annotation.Keep;
import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt32;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt8;
import defpackage.yn;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class ItemDto implements Layout {

    @yn(6)
    public int alertTime;

    @yn(3)
    public String description;

    @yn(1)
    public UInt32 id;

    @yn(10)
    public String imageUrl;

    @yn(9)
    public boolean isAllDayEvent;

    @yn(7)
    public UInt32 repeatMode;

    @yn(8)
    public UInt32 repeatStopTime;

    @yn(11)
    public UInt8 source;

    @yn(4)
    public UInt32 startTime;

    @yn(5)
    public UInt32 stopTime;

    @yn(2)
    public String title;

    @yn(12)
    public UInt32 updateVersion;
}
