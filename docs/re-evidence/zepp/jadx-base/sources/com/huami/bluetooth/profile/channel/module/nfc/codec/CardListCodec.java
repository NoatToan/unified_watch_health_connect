package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardIdent;
import java.io.ByteArrayOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/CardListCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "Lcom/xiaomi/hm/health/bt/profile/nfc/HMNFCCardIdent;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "value", "encode", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CardListCodec implements ResponseCodec<List<? extends HMNFCCardIdent>, byte[]> {
    private static final int a = 2;
    private static final int b = 2;

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<List<? extends HMNFCCardIdent>> decode(@NotNull ModuleResult<byte[]> originResponse) {
        throw new NotImplementedError("An operation is not implemented: 不实现");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull List<? extends HMNFCCardIdent> value) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(value.size());
        for (HMNFCCardIdent hMNFCCardIdent : value) {
            byteArrayOutputStream.write(GattUtils.numberToBytes(hMNFCCardIdent.getAidLen() + 2, 2));
            byteArrayOutputStream.write(hMNFCCardIdent.getType().ordinal());
            if (hMNFCCardIdent.getAidLen() > 0) {
                byteArrayOutputStream.write(hMNFCCardIdent.getAidLen());
                byteArrayOutputStream.write(GattUtils.hexStringToBytes(hMNFCCardIdent.getAid()));
            } else {
                byteArrayOutputStream.write(0);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public List<HMNFCCardIdent> decode(@NotNull byte[] value) {
        throw new NotImplementedError("An operation is not implemented: 不实现");
    }
}
