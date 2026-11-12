package com.huami.bluetooth.profile.channel.module.base;

import com.huami.bluetooth.profile.channel.module.nfc.NFCErrorCode;
import com.huami.bluetooth.profile.channel.module.nfc.codec.SimpleCodec;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0006"}, d2 = {"F", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "defaultResponseDecode", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class ResponseCodecKt {
    @NotNull
    public static final <F> ModuleResult<F> defaultResponseDecode(@NotNull ResponseCodec<F, byte[]> responseCodec, @NotNull ModuleResult<byte[]> moduleResult) {
        Object objM3845constructorimpl;
        if (moduleResult instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (moduleResult instanceof Failure) {
            Failure failure = (Failure) moduleResult;
            return new Failure(failure.getMsg(), failure.getCode());
        }
        if (!(moduleResult instanceof Success)) {
            return ModuleResult.Companion.fail$default(ModuleResult.INSTANCE, "未知错误类型", 0, 2, null);
        }
        byte[] bArrSubArrayWithoutFirstTwoElement = ByteArrayKt.subArrayWithoutFirstTwoElement((byte[]) ((Success) moduleResult).getData());
        ErrorCode errorCodeDecode = new SimpleCodec().decode(bArrSubArrayWithoutFirstTwoElement);
        if (!(errorCodeDecode instanceof NFCErrorCode.Success)) {
            return new Failure(errorCodeDecode.getDesc(), errorCodeDecode.getCode());
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new Success(responseCodec.decode(ByteArrayKt.subArrayWithoutFirstElement(bArrSubArrayWithoutFirstTwoElement))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            objM3845constructorimpl = new Failure(Intrinsics.stringPlus("解析卡数据失败：", thM3848exceptionOrNullimpl), 0, 2, null);
        }
        return (ModuleResult) objM3845constructorimpl;
    }
}
