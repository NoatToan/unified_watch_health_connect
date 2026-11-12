package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodecKt;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/AreaCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "value", "encode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AreaCodec implements ResponseCodec<String, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<String> decode(@NotNull ModuleResult<byte[]> originResponse) {
        return ResponseCodecKt.defaultResponseDecode(this, originResponse);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull String value) {
        throw new NotImplementedError("An operation is not implemented: 不编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public String decode(@NotNull byte[] value) {
        return ByteArrayKt.toHexString(BufByteDecoder.readBytes$default(new BufByteDecoder(value, 0, 2, null), 0, 1, null));
    }
}
