package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/CodeCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "", "value", "encode", "decode", "([B)Ljava/lang/Integer;", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CodeCodec implements ResponseCodec<Integer, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    public /* bridge */ /* synthetic */ Object encode(Object obj) {
        return encode(((Number) obj).intValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public Integer decode(@NotNull byte[] value) {
        return Integer.valueOf(ArraysKt___ArraysKt.first(value));
    }

    @NotNull
    public byte[] encode(int value) {
        throw new NotImplementedError("An operation is not implemented: 无需编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<Integer> decode(@NotNull ModuleResult<byte[]> originResponse) {
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            return new Failure(((Failure) originResponse).getMsg(), 0, 2, null);
        }
        if (!(originResponse instanceof Success)) {
            return ModuleResult.Companion.fail$default(ModuleResult.INSTANCE, "未知错误类型", 0, 2, null);
        }
        return ModuleResult.INSTANCE.success(Integer.valueOf(decode(ByteArrayKt.subArrayWithoutFirstTwoElement((byte[]) ((Success) originResponse).getData())).intValue()));
    }
}
