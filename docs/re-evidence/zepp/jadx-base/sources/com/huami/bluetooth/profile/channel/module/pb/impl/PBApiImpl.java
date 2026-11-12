package com.huami.bluetooth.profile.channel.module.pb.impl;

import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.pb.PBApi;
import com.huami.bluetooth.profile.channel.module.pb.PBCommand;
import com.huami.bluetooth.profile.channel.module.pb.PBUtils;
import com.huami.bluetooth.profile.channel.module.pb.PersonalBestModule;
import com.huami.bluetooth.profile.channel.module.pb.codec.CodeCodec;
import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pb/impl/PBApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/pb/PBApi;", "", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/SmartWatchProfile$BlePBInfo;", "list", "", "isFull", "setPBInfos", "Lcom/huami/bluetooth/profile/channel/module/pb/PersonalBestModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/pb/PersonalBestModule;", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/pb/PersonalBestModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PBApiImpl implements PBApi {
    private static final int b = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PersonalBestModule module;

    public PBApiImpl(@NotNull PersonalBestModule personalBestModule) {
        this.module = personalBestModule;
    }

    @Override // com.huami.bluetooth.profile.channel.module.pb.PBApi
    public boolean setPBInfos(@NotNull List<? extends SmartWatchProfile.BlePBInfo> list, boolean isFull) {
        Integer num = (Integer) ModuleResultKt.peel(new CodeCodec().decode(this.module.sendRequest(new ModuleRequest(PBCommand.UpdateRecodesCommand.INSTANCE.withByte(list.size()).withBytes(PBUtils.INSTANCE.pbList2BytesC(list)), IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
        return num != null && num.intValue() == 1;
    }
}
