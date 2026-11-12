package com.huami.bluetooth.profile.channel.module.device_feature.codec;

import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.feature.HMFeatureProfile;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/device_feature/codec/DeviceFeatureCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "", "value", "encode", "decode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceFeatureCodec implements Codec<Feature, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public Feature decode(@NotNull byte[] value) {
        return HMFeatureProfile.fromByteArray(value);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull Feature value) {
        throw new NotImplementedError("An operation is not implemented: 不管编码");
    }
}
