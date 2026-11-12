package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodecKt;
import com.huami.bluetooth.utils.BufByteDecoder;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/CardSetTimeSwitchCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "value", "encode", "([B)Ljava/lang/Boolean;", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CardSetTimeSwitchCodec implements ResponseCodec<Boolean, byte[]> {

    @NotNull
    private static final String a = "CardSetTimeSwitchCodec";

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    public /* bridge */ /* synthetic */ Object encode(Object obj) {
        return encode(((Boolean) obj).booleanValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<Boolean> decode(@NotNull ModuleResult<byte[]> originResponse) {
        return ResponseCodecKt.defaultResponseDecode(this, originResponse);
    }

    @NotNull
    public byte[] encode(boolean value) {
        throw new NotImplementedError("An operation is not implemented: 不编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public Boolean decode(@NotNull byte[] value) {
        boolean z = false;
        try {
            BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
            bufByteDecoder.readBytes(bufByteDecoder.readInt(1));
            bufByteDecoder.readInt(1);
            z = true;
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
