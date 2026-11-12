package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.profile.nfc.entity.BusCardInfoResponse;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardInfoEntity;
import com.xiaomi.hm.health.bt.profile.nfc.entity.NFCExtensionsKt;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/CardDetailCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/BusCardInfoResponse;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "value", "encode", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CardDetailCodec implements ResponseCodec<BusCardInfoResponse, byte[]> {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<BusCardInfoResponse> decode(@NotNull ModuleResult<byte[]> originResponse) {
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
            objM3845constructorimpl = Result.m3845constructorimpl(new Success(decode(ByteArrayKt.subArrayWithoutFirstTwoElement((byte[]) ((Success) originResponse).getData()))));
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
    public byte[] encode(@NotNull BusCardInfoResponse value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public BusCardInfoResponse decode(@NotNull byte[] value) {
        String strSubstring;
        BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        int i = bufByteDecoder.readByte();
        if (i == 0) {
            atomicInteger.set(0);
        } else {
            if (i == 1) {
                return new BusCardInfoResponse(-100, null, 2, null);
            }
            if (i == 2) {
                return new BusCardInfoResponse(-101, null, 2, null);
            }
            if (i == 3) {
                atomicInteger.set(-102);
            } else if (i == 4) {
                atomicInteger.set(-103);
            }
        }
        bufByteDecoder.readBytes(bufByteDecoder.readByte());
        int i2 = bufByteDecoder.readByte();
        boolean z = (i2 & 128) == 128;
        int i3 = i2 & 63;
        byte[] bytes = bufByteDecoder.readBytes((i3 + 1) / 2);
        String hexString = bytes.length == 0 ? "" : ByteArrayKt.toHexString(bytes);
        if (i3 % 2 != 0) {
            Objects.requireNonNull(hexString, "null cannot be cast to non-null type java.lang.String");
            strSubstring = hexString.substring(1);
        } else {
            strSubstring = hexString;
        }
        return new BusCardInfoResponse(atomicInteger.get(), new CardInfoEntity(strSubstring, NFCExtensionsKt.toYMDTimestamp(ByteArrayKt.toHexString(bufByteDecoder.readBytes(4))), NFCExtensionsKt.toYMDTimestamp(ByteArrayKt.toHexString(bufByteDecoder.readBytes(4))), z, BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null), BufByteDecoder.readInt$default(bufByteDecoder, 0, 1, null), bufByteDecoder.readByte() == 1));
    }
}
