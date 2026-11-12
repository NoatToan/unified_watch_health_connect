package com.huami.member_card.bean;

import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/huami/member_card/bean/MemberCardProperty;", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "toMemberCard", "toMemberCardProperty", "member_card_release"}, k = 2, mv = {1, 5, 1})
public final class MemberCardPropertyKt {
    @NotNull
    public static final MemberCard toMemberCard(@NotNull MemberCardProperty memberCardProperty) {
        return new MemberCard(memberCardProperty.getName(), memberCardProperty.getNumber(), memberCardProperty.getContent(), memberCardProperty.getCodeType(), memberCardProperty.getColor());
    }

    @NotNull
    public static final MemberCardProperty toMemberCardProperty(@NotNull MemberCard memberCard) {
        return new MemberCardProperty(memberCard.getNameID(), memberCard.getNumber(), memberCard.getData(), memberCard.getColor(), memberCard.getCodeType());
    }
}
