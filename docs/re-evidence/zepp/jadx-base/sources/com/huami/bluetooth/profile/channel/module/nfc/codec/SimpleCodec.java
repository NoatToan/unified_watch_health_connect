package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.nfc.NFCErrorCode;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/SimpleCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SimpleCodec implements ResponseCodec<ErrorCode, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public ErrorCode decode(@NotNull byte[] value) {
        return NFCErrorCode.INSTANCE.toErrorCode(ArraysKt___ArraysKt.first(value));
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull ErrorCode value) {
        throw new NotImplementedError("An operation is not implemented: 无需编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<ErrorCode> decode(@NotNull ModuleResult<byte[]> originResponse) {
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            return new Failure(((Failure) originResponse).getMsg(), 0, 2, null);
        }
        if (!(originResponse instanceof Success)) {
            return ModuleResult.Companion.fail$default(ModuleResult.INSTANCE, "未知错误类型", 0, 2, null);
        }
        ErrorCode errorCodeDecode = decode(ByteArrayKt.subArrayWithoutFirstTwoElement((byte[]) ((Success) originResponse).getData()));
        if (errorCodeDecode instanceof NFCErrorCode.Success) {
            return ModuleResult.INSTANCE.success(errorCodeDecode);
        }
        return ModuleResult.INSTANCE.fail(errorCodeDecode.getDesc(), errorCodeDecode.getCode());
    }
}
