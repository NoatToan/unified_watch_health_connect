package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodecKt;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCTradeInfo;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/TradesCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCTradeInfo;", "", "value", "encode", "decode", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TradesCodec implements ResponseCodec<List<? extends HMNFCTradeInfo>, byte[]> {
    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public List<HMNFCTradeInfo> decode(@NotNull byte[] value) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
        int i = bufByteDecoder.readByte();
        ArrayList arrayList = new ArrayList();
        if (i > 0) {
            int i2 = 0;
            do {
                i2++;
                BufByteDecoder bufByteDecoder2 = new BufByteDecoder(bufByteDecoder.readBytes(bufByteDecoder.readShort()), 0, 2, null);
                HMNFCTradeInfo hMNFCTradeInfo = new HMNFCTradeInfo();
                hMNFCTradeInfo.setAid(ByteArrayKt.toHexString(bufByteDecoder2.readBytes(bufByteDecoder2.readByte())));
                hMNFCTradeInfo.setClientId(ByteArrayKt.toHexString(bufByteDecoder2.readBytes(bufByteDecoder2.readByte())));
                hMNFCTradeInfo.setType(bufByteDecoder2.readByte());
                hMNFCTradeInfo.setConsumption(BufByteDecoder.readInt$default(bufByteDecoder2, 0, 1, null));
                hMNFCTradeInfo.setBalance(BufByteDecoder.readInt$default(bufByteDecoder2, 0, 1, null));
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                hMNFCTradeInfo.setDate(String.format("%02x%02x-%02x-%02x %02x:%02x:%02x", Arrays.copyOf(new Object[]{Integer.valueOf(bufByteDecoder2.readByte()), Integer.valueOf(bufByteDecoder2.readByte()), Integer.valueOf(bufByteDecoder2.readByte()), Integer.valueOf(bufByteDecoder2.readByte()), Integer.valueOf(bufByteDecoder2.readByte()), Integer.valueOf(bufByteDecoder2.readByte()), Integer.valueOf(bufByteDecoder2.readByte())}, 7)));
                hMNFCTradeInfo.setHci(ByteArrayKt.toHexString(bufByteDecoder2.readBytes(bufByteDecoder2.readShort())));
                arrayList.add(hMNFCTradeInfo);
            } while (i2 < i);
        }
        return arrayList;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull List<? extends HMNFCTradeInfo> value) {
        throw new NotImplementedError("An operation is not implemented: 不需要编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<List<? extends HMNFCTradeInfo>> decode(@NotNull ModuleResult<byte[]> originResponse) {
        return ResponseCodecKt.defaultResponseDecode(this, originResponse);
    }
}
