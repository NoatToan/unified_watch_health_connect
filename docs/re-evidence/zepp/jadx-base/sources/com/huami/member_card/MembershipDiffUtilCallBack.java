package com.huami.member_card;

import androidx.recyclerview.widget.DiffUtil;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/huami/member_card/MembershipDiffUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "a", "Ljava/util/List;", "oldCards", "b", "newCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class MembershipDiffUtilCallBack extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<MemberCard> oldCards;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<MemberCard> newCards;

    public MembershipDiffUtilCallBack(@NotNull List<MemberCard> list, @NotNull List<MemberCard> list2) {
        this.oldCards = list;
        this.newCards = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        MemberCard memberCard = this.oldCards.get(oldItemPosition);
        MemberCard memberCard2 = this.newCards.get(newItemPosition);
        return Intrinsics.areEqual(memberCard.getNameID(), memberCard2.getNameID()) && memberCard.getCodeType() == memberCard2.getCodeType() && memberCard.getColor() == memberCard2.getColor() && Intrinsics.areEqual(memberCard.getNumber(), memberCard2.getNumber()) && Intrinsics.areEqual(memberCard.getData(), memberCard2.getData());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return true;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.newCards.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.oldCards.size();
    }
}
