package com.huami.bluetooth.profile.channel.module.sport.codec;

import com.google.protobuf.InvalidProtocolBufferException;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.sport.PHNErrorCode;
import com.huami.bluetooth.profile.channel.module.sport.PHNModelKt;
import com.huami.bluetooth.profile.channel.module.sport.PHNResultMessageDto;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.proto.Phn;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/codec/PhnCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PhnCodec implements ResponseCodec<String, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @Nullable
    public String decode(@NotNull byte[] value) throws InvalidProtocolBufferException {
        if (value.length == 0) {
            return null;
        }
        Phn.PHNResultMessage from = Phn.PHNResultMessage.parseFrom(value);
        PHNResultMessageDto pHNResultMessageDto = from == null ? null : PHNModelKt.toPHNResultMessageDto(from);
        if (pHNResultMessageDto == null) {
            return null;
        }
        Json.Companion companion = Json.INSTANCE;
        return companion.encodeToString(SerializersKt.serializer(companion.getSerializersModule(), Reflection.typeOf(PHNResultMessageDto.class)), pHNResultMessageDto);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@Nullable String value) {
        throw new NotImplementedError("An operation is not implemented: 无需编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<String> decode(@NotNull ModuleResult<byte[]> originResponse) {
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
