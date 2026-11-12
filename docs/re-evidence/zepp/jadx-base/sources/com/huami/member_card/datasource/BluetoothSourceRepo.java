package com.huami.member_card.datasource;

import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCardModule;
import com.huami.bluetooth.profile.channel.module.member_card.Version;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010j\u0002`\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fH\u0016R\"\u0010\u0015\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010j\u0002`\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/member_card/datasource/BluetoothSourceRepo;", "Lcom/huami/member_card/datasource/DataSourceRepo;", "Lcom/huami/bluetooth/profile/channel/module/member_card/Version;", "queryProtocolVersion", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCard;", "memberCard", "", "addMemberCard", "deleteMemberCard", "", "oldNameID", "modifyMemberCard", "", "memberCards", "issuedMemberCards", "queryAllMemberCards", "Lkotlin/Function0;", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCardModule;", "Lcom/huami/member_card/datasource/MemberModuleFactory;", "a", "Lkotlin/jvm/functions/Function0;", "memberModuleFactory", "Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCardApi;", "()Lcom/huami/bluetooth/profile/channel/module/member_card/MemberCardApi;", "memberCardApi", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class BluetoothSourceRepo implements DataSourceRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<MemberCardModule> memberModuleFactory;

    public BluetoothSourceRepo(@NotNull Function0<MemberCardModule> function0) {
        this.memberModuleFactory = function0;
    }

    private final MemberCardApi a() {
        MemberCardModule memberCardModuleInvoke = this.memberModuleFactory.invoke();
        if (memberCardModuleInvoke == null) {
            return null;
        }
        return memberCardModuleInvoke.loadApi();
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    public boolean addMemberCard(@NotNull MemberCard memberCard) {
        Response<Boolean> responseAddMemberCard;
        MemberCardApi memberCardApiA = a();
        if (memberCardApiA == null || (responseAddMemberCard = memberCardApiA.addMemberCard(memberCard)) == null) {
            return false;
        }
        return responseAddMemberCard instanceof Success;
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    public boolean deleteMemberCard(@NotNull MemberCard memberCard) {
        Response<Boolean> responseDeleteMemberCard;
        MemberCardApi memberCardApiA = a();
        if (memberCardApiA == null || (responseDeleteMemberCard = memberCardApiA.deleteMemberCard(memberCard)) == null) {
            return false;
        }
        return responseDeleteMemberCard instanceof Success;
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    public boolean issuedMemberCards(@NotNull List<MemberCard> memberCards) {
        Response<Boolean> responseIssuedAllMemberCard;
        MemberCardApi memberCardApiA = a();
        if (memberCardApiA == null || (responseIssuedAllMemberCard = memberCardApiA.issuedAllMemberCard(memberCards)) == null) {
            return false;
        }
        return responseIssuedAllMemberCard instanceof Success;
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    public boolean modifyMemberCard(@NotNull String oldNameID, @NotNull MemberCard memberCard) {
        Response<Boolean> responseModifyMemberCard;
        MemberCardApi memberCardApiA = a();
        if (memberCardApiA == null || (responseModifyMemberCard = memberCardApiA.modifyMemberCard(oldNameID, memberCard)) == null) {
            return false;
        }
        return responseModifyMemberCard instanceof Success;
    }

    @Override // com.huami.member_card.datasource.DataSourceRepo
    @Nullable
    public List<MemberCard> queryAllMemberCards() {
        Response<List<MemberCard>> responseQueryAllMemberCard;
        MemberCardApi memberCardApiA = a();
        if (memberCardApiA == null || (responseQueryAllMemberCard = memberCardApiA.queryAllMemberCard()) == null || !(responseQueryAllMemberCard instanceof Success)) {
            return null;
        }
        return (List) ((Success) responseQueryAllMemberCard).getData();
    }

    @WorkerThread
    @Nullable
    public final Version queryProtocolVersion() {
        Response<Version> responseQueryVersion;
        MemberCardApi memberCardApiA = a();
        if (memberCardApiA == null || (responseQueryVersion = memberCardApiA.queryVersion()) == null || !(responseQueryVersion instanceof Success)) {
            return null;
        }
        return (Version) ((Success) responseQueryVersion).getData();
    }
}
