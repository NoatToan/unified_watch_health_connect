package com.huami.bluetooth.profile.channel.module.connect.codec;

import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.connect.ConnectParam;
import com.huami.bluetooth.utils.BufByteDecoder;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/codec/ConnectionParamCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParam;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "value", "encode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ConnectionParamCodec implements ResponseCodec<ConnectParam, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<ConnectParam> decode(@NotNull ModuleResult<byte[]> originResponse) {
        Object objM3845constructorimpl;
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            Failure failure = (Failure) originResponse;
            return new Failure(failure.getMsg(), failure.getCode());
        }
        if (!(originResponse instanceof Success)) {
            return ModuleResult.Companion.fail$default(ModuleResult.INSTANCE, "未知错误类型", 0, 2, null);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new Success(decode((byte[]) ((Success) originResponse).getData())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            objM3845constructorimpl = new Failure(Intrinsics.stringPlus("解析数据失败：", thM3848exceptionOrNullimpl), 0, 2, null);
        }
        return (ModuleResult) objM3845constructorimpl;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull ConnectParam value) {
        throw new NotImplementedError("An operation is not implemented: No encode");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public ConnectParam decode(@NotNull byte[] value) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
        bufByteDecoder.readByte();
        return new ConnectParam(bufByteDecoder.readShort() + 3);
    }
}
