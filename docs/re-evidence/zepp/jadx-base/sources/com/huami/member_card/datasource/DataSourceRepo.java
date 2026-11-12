package com.huami.member_card.datasource;

import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH'J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH'¨\u0006\u000e"}, d2 = {"Lcom/huami/member_card/datasource/DataSourceRepo;", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "memberCard", "", "addMemberCard", "deleteMemberCard", "", "oldNameID", "modifyMemberCard", "", "memberCards", "issuedMemberCards", "queryAllMemberCards", "member_card_release"}, k = 1, mv = {1, 5, 1})
public interface DataSourceRepo {
    @WorkerThread
    boolean addMemberCard(@NotNull MemberCard memberCard);

    @WorkerThread
    boolean deleteMemberCard(@NotNull MemberCard memberCard);

    @WorkerThread
    boolean issuedMemberCards(@NotNull List<MemberCard> memberCards);

    @WorkerThread
    boolean modifyMemberCard(@NotNull String oldNameID, @NotNull MemberCard memberCard);

    @WorkerThread
    @Nullable
    List<MemberCard> queryAllMemberCards();
}
