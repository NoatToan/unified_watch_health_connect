package com.huami.bluetooth.profile.channel.module.sport.codec;

import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.sport.PHNErrorCode;
import com.huami.bluetooth.profile.channel.module.sport.PHNSummaryResult;
import com.huami.bluetooth.utils.BufByteDecoder;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/codec/PhnSummaryCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNSummaryResult;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PhnSummaryCodec implements ResponseCodec<PHNSummaryResult, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @Nullable
    public PHNSummaryResult decode(@NotNull byte[] value) {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        if (value.length == 0) {
            return null;
        }
        BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
        int int$default = BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null);
        int int$default2 = BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null);
        float f = bufByteDecoder.readFloat();
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Integer.valueOf(BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = -1;
        }
        long jIntValue = ((Number) objM3845constructorimpl).intValue();
        try {
            Result.Companion companion3 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl(Integer.valueOf(bufByteDecoder.readByte()));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) != null) {
            objM3845constructorimpl2 = -56;
        }
        return new PHNSummaryResult(int$default, int$default2, f, jIntValue, ((Number) objM3845constructorimpl2).intValue());
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@Nullable PHNSummaryResult value) {
        throw new NotImplementedError("An operation is not implemented: 无需编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<PHNSummaryResult> decode(@NotNull ModuleResult<byte[]> originResponse) {
        Object objM3845constructorimpl;
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            return new Failure(((Failure) originResponse).getMsg(), 0, 2, null);
        }
        if (!(originResponse instanceof Success)) {
            return ModuleResult.Companion.fail$default(ModuleResult.INSTANCE, "未知错误类型", 0, 2, null);
        }
        BufByteDecoder bufByteDecoder = new BufByteDecoder((byte[]) ((Success) originResponse).getData(), 0, 2, null);
        bufByteDecoder.readByte();
        PHNErrorCode errorCode = PHNErrorCode.INSTANCE.toErrorCode(bufByteDecoder.readByte());
        if (errorCode.getCode() != PHNErrorCode.SUCCESS.getCode()) {
            return ModuleResult.Companion.fail$default(ModuleResult.INSTANCE, Intrinsics.stringPlus("解析PHN失败：", errorCode.getDesc()), 0, 2, null);
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new Success(decode(BufByteDecoder.readBytes$default(bufByteDecoder, 0, 1, null))));
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
}
