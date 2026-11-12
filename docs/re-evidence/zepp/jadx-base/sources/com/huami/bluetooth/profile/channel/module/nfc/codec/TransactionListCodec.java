package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodecKt;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.profile.nfc.entity.CardTransEntity;
import com.xiaomi.hm.health.bt.profile.nfc.entity.NFCExtensionsKt;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/TransactionListCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/entity/CardTransEntity;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "value", "encode", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class TransactionListCodec implements ResponseCodec<List<? extends CardTransEntity>, byte[]> {
    private static final int a = 2;
    private static final int b = 3;
    private static final int c = 4;
    private static final int d = 6;
    private static final int e = 7;

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<List<? extends CardTransEntity>> decode(@NotNull ModuleResult<byte[]> originResponse) {
        return ResponseCodecKt.defaultResponseDecode(this, originResponse);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull List<CardTransEntity> value) {
        throw new NotImplementedError("An operation is not implemented: 不编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public List<CardTransEntity> decode(@NotNull byte[] value) {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
        bufByteDecoder.readBytes(bufByteDecoder.readByte());
        ArrayList arrayList = new ArrayList();
        int i = bufByteDecoder.readByte();
        if (i > 0) {
            int i2 = 0;
            do {
                i2++;
                BufByteDecoder bufByteDecoder2 = new BufByteDecoder(bufByteDecoder.readBytes(bufByteDecoder.readShort()), 0, 2, null);
                if (bufByteDecoder2.remain() >= 2) {
                    String hexString = ByteArrayKt.toHexString(bufByteDecoder2.readBytes(2));
                    int intBE = bufByteDecoder2.readIntBE(3);
                    int intBE$default = BufByteDecoder.readIntBE$default(bufByteDecoder2, 0, 1, null);
                    int i3 = bufByteDecoder2.readByte();
                    String hexString2 = ByteArrayKt.toHexString(bufByteDecoder2.readBytes(6));
                    long recordDate = NFCExtensionsKt.getRecordDate(ByteArrayKt.toHexString(bufByteDecoder2.readBytes(7)));
                    int i4 = bufByteDecoder2.readByte();
                    int i5 = bufByteDecoder2.readByte();
                    arrayList.add(new CardTransEntity(hexString, recordDate, intBE$default, i3, hexString2, intBE, i4, i5, ByteArrayKt.toHexString(bufByteDecoder2.readBytes(i5))));
                }
            } while (i2 < i);
        }
        return arrayList;
    }
}
