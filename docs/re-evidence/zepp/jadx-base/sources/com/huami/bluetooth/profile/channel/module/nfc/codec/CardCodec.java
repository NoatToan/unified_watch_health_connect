package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.ErrorCode;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.nfc.NFCErrorCode;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCBlockInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/CardCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardInfo;", "", "value", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCBlockInfo;", "a", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CardCodec implements ResponseCodec<HMNFCCardInfo, byte[]> {
    private static final int a = 18;

    private final HMNFCBlockInfo a(byte[] value) {
        HMNFCBlockInfo hMNFCBlockInfo = new HMNFCBlockInfo();
        BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
        hMNFCBlockInfo.setIndex(bufByteDecoder.readShort());
        hMNFCBlockInfo.setData(BufByteDecoder.readBytes$default(bufByteDecoder, 0, 1, null));
        return hMNFCBlockInfo;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public HMNFCCardInfo decode(@NotNull byte[] value) throws Exception {
        ErrorCode errorCodeDecode = new SimpleCodec().decode(value);
        HMNFCCardInfo hMNFCCardInfo = new HMNFCCardInfo();
        int i = 0;
        BufByteDecoder bufByteDecoder = new BufByteDecoder(ByteArrayKt.subArrayWithoutFirstElement(value), 0, 2, null);
        if (errorCodeDecode instanceof NFCErrorCode.Success) {
            hMNFCCardInfo.setEncrypt(bufByteDecoder.readBoolean());
            if (hMNFCCardInfo.isEncrypt()) {
                hMNFCCardInfo.setResult(9);
            }
            hMNFCCardInfo.setAtqa(ByteArrayKt.toHexString(bufByteDecoder.readBytes(2)));
            hMNFCCardInfo.setSak(ByteArrayKt.toHexString(bufByteDecoder.readBytes(1)));
            hMNFCCardInfo.setUidLen(bufByteDecoder.readByte());
            hMNFCCardInfo.setUid(ByteArrayKt.toHexString(bufByteDecoder.readBytes(hMNFCCardInfo.getUidLen())));
            hMNFCCardInfo.setBlockNum(bufByteDecoder.readShort());
        }
        ArrayList arrayList = new ArrayList();
        int blockNum = hMNFCCardInfo.getBlockNum();
        if (blockNum > 0) {
            do {
                i++;
                arrayList.add(a(bufByteDecoder.readBytes(18)));
            } while (i < blockNum);
        }
        if (bufByteDecoder.remain() > 0) {
            throw new Exception("解析Card异常:数据仍有剩余");
        }
        if (true ^ arrayList.isEmpty()) {
            hMNFCCardInfo.setBlockInfos(new ArrayList<>(arrayList));
        }
        return hMNFCCardInfo;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull HMNFCCardInfo value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<HMNFCCardInfo> decode(@NotNull ModuleResult<byte[]> originResponse) {
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
        byte[] bArrSubArrayWithoutFirstTwoElement = ByteArrayKt.subArrayWithoutFirstTwoElement((byte[]) ((Success) originResponse).getData());
        ErrorCode errorCodeDecode = new SimpleCodec().decode(bArrSubArrayWithoutFirstTwoElement);
        if (!(errorCodeDecode instanceof NFCErrorCode.Success) && !(errorCodeDecode instanceof NFCErrorCode.EncryptedCard)) {
            return new Failure(errorCodeDecode.getDesc(), errorCodeDecode.getCode());
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new Success(decode(bArrSubArrayWithoutFirstTwoElement)));
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
