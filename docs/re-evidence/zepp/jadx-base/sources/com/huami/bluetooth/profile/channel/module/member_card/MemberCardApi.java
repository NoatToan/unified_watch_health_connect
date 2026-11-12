package com.huami.bluetooth.profile.channel.module.member_card;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\r\u001a\u00020\u0006H&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\r\u001a\u00020\u0006H&J\u001e\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0011H&¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCardApi;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/member_card/Version;", "queryVersion", "", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "", "issuedAllMemberCard", "queryAllMemberCard", "", "oldNameId", "memberCard", "modifyMemberCard", "addMemberCard", "deleteMemberCard", "Lkotlin/Function0;", "function", "", "requestMemberCard", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface MemberCardApi {
    @NotNull
    Response<Boolean> addMemberCard(@NotNull MemberCard memberCard);

    @NotNull
    Response<Boolean> deleteMemberCard(@NotNull MemberCard memberCard);

    @NotNull
    Response<Boolean> issuedAllMemberCard(@NotNull List<MemberCard> cards);

    @NotNull
    Response<Boolean> modifyMemberCard(@NotNull String oldNameId, @NotNull MemberCard memberCard);

    @NotNull
    Response<List<MemberCard>> queryAllMemberCard();

    @NotNull
    Response<Version> queryVersion();

    void requestMemberCard(@NotNull Function0<? extends List<MemberCard>> function);
}
