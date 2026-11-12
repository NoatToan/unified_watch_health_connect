package com.huami.device.feature.gesture.impl;

import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.device.feature.gesture.api.GestureTypeFactory;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureStateCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "Lcom/huami/device/feature/gesture/api/GestureTypeFactory$GestureState;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class GestureStateCodec implements ResponseCodec<GestureTypeFactory.GestureState, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public GestureTypeFactory.GestureState decode(@NotNull byte[] value) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
        bufByteDecoder.readByte();
        return new GestureTypeFactory.GestureState(bufByteDecoder.readByte(), bufByteDecoder.readByte());
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull GestureTypeFactory.GestureState value) {
        throw new NotImplementedError("An operation is not implemented: 无需编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<GestureTypeFactory.GestureState> decode(@NotNull ModuleResult<byte[]> originResponse) {
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
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new Success(decode((byte[]) ((Success) originResponse).getData())));
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
