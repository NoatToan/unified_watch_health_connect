package com.huami.bluetooth.profile.channel.module.assistant.dto;

import com.huami.bluetooth.profile.channel.module.assistant.response.AppCardsResponse;
import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.huami.bluetooth.profile.channel.module.binary.annotation.Order;
import com.huami.bluetooth.profile.channel.module.binary.struct.UInt16;

/* JADX INFO: loaded from: classes6.dex */
public class ItemDto implements Layout {

    @Order(2)
    public boolean isEnable;

    @Order(1)
    public UInt16 type;

    public AppCardsResponse convert() {
        CardType cardTypeFindValueByInt = CardType.findValueByInt(this.type.ensureValue().intValue());
        if (cardTypeFindValueByInt == null) {
            return null;
        }
        return new AppCardsResponse(cardTypeFindValueByInt, this.isEnable);
    }
}
