package com.xiaomi.hm.health.device.recover;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCard;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCardApi;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCardModule;
import com.huami.member_card.datasource.UserPropertiesSourceRepo;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.introduce.recocver.IRecover;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/recover/MemberRestore;", "Lcom/xiaomi/hm/health/device/introduce/recocver/IRecover;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "notRecover", "recover", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MemberRestore implements IRecover {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not support MemberCardModule";
        }
    }

    @Override // com.xiaomi.hm.health.device.introduce.recocver.IRecover
    public boolean notRecover(@NotNull HMMiLiProDevice device) {
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover
    public boolean recover(@NotNull HMMiLiProDevice device) {
        MemberCardApi memberCardApiLoadApi;
        Response<Boolean> responseIssuedAllMemberCard;
        if (!device.supportModule(MemberCardModule.class)) {
            HMLog.info(LogTagUtilsKt.getTAG(this), a.a);
            return false;
        }
        List<MemberCard> listQueryAllMemberCards = new UserPropertiesSourceRepo().queryAllMemberCards();
        MemberCardModule memberCardModule = (MemberCardModule) device.getChannelModule(MemberCardModule.class);
        if (memberCardModule == null || (memberCardApiLoadApi = memberCardModule.loadApi()) == null || (responseIssuedAllMemberCard = memberCardApiLoadApi.issuedAllMemberCard(listQueryAllMemberCards)) == null) {
            return false;
        }
        if (!(responseIssuedAllMemberCard instanceof Success)) {
            responseIssuedAllMemberCard = null;
        }
        if (responseIssuedAllMemberCard == null) {
            return false;
        }
        return ((Boolean) ((Success) responseIssuedAllMemberCard).getData()).booleanValue();
    }
}
