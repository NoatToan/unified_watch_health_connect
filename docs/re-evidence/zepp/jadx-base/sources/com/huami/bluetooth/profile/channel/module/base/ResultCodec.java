package com.huami.bluetooth.profile.channel.module.base;

import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/ResultCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "", "", "value", "encode", "decode", "([B)Ljava/lang/Boolean;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ResultCodec implements Codec<Boolean, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    public /* bridge */ /* synthetic */ byte[] encode(Boolean bool) {
        return encode(bool.booleanValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public Boolean decode(@NotNull byte[] value) {
        return Boolean.valueOf(value.length == 0 ? false : ByteUtilsKt.toBoolean(value[0]));
    }

    @NotNull
    public byte[] encode(boolean value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
