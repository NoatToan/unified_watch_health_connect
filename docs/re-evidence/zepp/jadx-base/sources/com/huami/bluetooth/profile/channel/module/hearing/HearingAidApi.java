package com.huami.bluetooth.profile.channel.module.hearing;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.hearing.entity.DSPTestParam;
import com.huami.bluetooth.profile.channel.module.hearing.entity.DSPTestResult;
import com.huami.bluetooth.profile.channel.module.hearing.entity.EQParam;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingAidBattery;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingAidComponents;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingAidPositionParam;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingScenes;
import com.huami.bluetooth.profile.channel.module.hearing.entity.HighBassParam;
import com.huami.bluetooth.profile.channel.module.hearing.entity.WDRCParam;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 33)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J*\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J*\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\f2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J*\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J*\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00112\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J*\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00132\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J&\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u0016H&J\u001e\u0010\u0018\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0016H&J.\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00070\u0016H&J&\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00070\u0016H&J&\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00070\u0016H&J&\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00070\u0016H&J\u001e\u0010 \u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u00070\u0016H&J\"\u0010!\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J*\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\f2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J*\u0010#\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J$\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00070\u0016H&J\"\u0010(\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H&J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H&R\u0016\u0010/\u001a\u00020,8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidApi;", "", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HighBassParam;", "param", "Lkotlin/Function2;", "", "", "", "onResult", "setHighBass", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingScenes;", "setHearingMode", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/EQParam;", "setEQ", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/DSPTestParam;", "dsp", "setDSP", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidPositionParam;", "setHearingPosition", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/WDRCParam;", "setWDRC", "scene", "Lkotlin/Function1;", "getHighBass", "getHearingMode", "hearingAidPosition", "getEQ", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/DSPTestResult;", "getDSP", "getHearingPosition", "getWDRC", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidBattery;", "getHearingAidBattery", "deviceDiscovery", "resetUnusedEQ", "resetUnusedHighBass", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidComponents;", "component", "", "getSn", "reportDeviceBound", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnHearingListener", "Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidProtocolVersion;", "version", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface HearingAidApi {
    void deviceDiscovery(@NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void getDSP(int hearingAidPosition, @NotNull Function1<? super DSPTestResult, Unit> onResult);

    void getEQ(int hearingAidPosition, int scene, @NotNull Function1<? super EQParam, Unit> onResult);

    void getHearingAidBattery(@NotNull Function1<? super HearingAidBattery, Unit> onResult);

    void getHearingMode(@NotNull Function1<? super HearingScenes, Unit> onResult);

    void getHearingPosition(int hearingAidPosition, @NotNull Function1<? super HearingAidPositionParam, Unit> onResult);

    void getHighBass(int scene, @NotNull Function1<? super HighBassParam, Unit> onResult);

    void getSn(@NotNull HearingAidComponents component, @NotNull Function1<? super String, Unit> onResult);

    @NotNull
    HearingAidProtocolVersion getVersion();

    void getWDRC(int hearingAidPosition, @NotNull Function1<? super WDRCParam, Unit> onResult);

    void reportDeviceBound(@NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void resetUnusedEQ(@NotNull EQParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void resetUnusedHighBass(@NotNull HighBassParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void setDSP(@NotNull DSPTestParam dsp, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void setEQ(@NotNull EQParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void setHearingMode(@NotNull HearingScenes param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void setHearingPosition(@NotNull HearingAidPositionParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void setHighBass(@NotNull HighBassParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);

    void setOnHearingListener(@NotNull HearingAidListener listener);

    void setWDRC(@NotNull WDRCParam param, @NotNull Function2<? super Boolean, ? super Integer, Unit> onResult);
}
