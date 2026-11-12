package com.huami.bluetooth.profile.channel.module.device_feature;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.device_feature.codec.DeviceFeatureCodec;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 40)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0015\u0010\n\u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/device_feature/DeviceFeatureModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "queryDeviceFeature", "com/huami/bluetooth/profile/channel/module/device_feature/DeviceFeatureModule$featurePredict$1", "g", "Lcom/huami/bluetooth/profile/channel/module/device_feature/DeviceFeatureModule$featurePredict$1;", "featurePredict", "getFeature", "()Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", Constants.JSON_FEATURE, "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceFeatureModule extends BaseModule {

    @NotNull
    private static final String h = "DeviceFeatureModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final DeviceFeatureModule$featurePredict$1 featurePredict;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.huami.bluetooth.profile.channel.module.device_feature.DeviceFeatureModule$featurePredict$1] */
    public DeviceFeatureModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.featurePredict = new ResponsePredict() { // from class: com.huami.bluetooth.profile.channel.module.device_feature.DeviceFeatureModule$featurePredict$1
            @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
            public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
                return ArraysKt___ArraysKt.first(response) == ArraysKt___ArraysKt.first(FeatureCommand.QueryResponseCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
            }
        };
    }

    @Nullable
    public final Feature getFeature() {
        return queryDeviceFeature();
    }

    @Nullable
    public final Feature queryDeviceFeature() {
        Object objM3845constructorimpl;
        ModuleResult<byte[]> moduleResultSendRequest = sendRequest(new ModuleRequest(FeatureCommand.QueryFeatureCommand.INSTANCE, this.featurePredict, 0L, null, false, 28, null));
        if (!(moduleResultSendRequest instanceof Success)) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new DeviceFeatureCodec().decode(ByteArrayKt.subArrayWithoutFirstElement((byte[]) ((Success) moduleResultSendRequest).getData())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (Feature) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }
}
