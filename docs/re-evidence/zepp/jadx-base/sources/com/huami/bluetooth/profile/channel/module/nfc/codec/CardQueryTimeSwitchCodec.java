package com.huami.bluetooth.profile.channel.module.nfc.codec;

import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodecKt;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMCardSwitchTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/nfc/codec/CardQueryTimeSwitchCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "", "Lcom/xiaomi/hm/health/bt/model/HMCardSwitchTime;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "value", "encode", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CardQueryTimeSwitchCodec implements ResponseCodec<List<? extends HMCardSwitchTime>, byte[]> {

    @NotNull
    private static final String a = "CardQueryTimeSwitchCodec";

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<List<? extends HMCardSwitchTime>> decode(@NotNull ModuleResult<byte[]> originResponse) {
        return ResponseCodecKt.defaultResponseDecode(this, originResponse);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull List<HMCardSwitchTime> value) {
        throw new NotImplementedError("An operation is not implemented: 不编码");
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public List<HMCardSwitchTime> decode(@NotNull byte[] value) {
        ArrayList arrayList = new ArrayList();
        try {
            BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
            byte[] bytes = bufByteDecoder.readBytes(bufByteDecoder.readInt(1));
            int i = bufByteDecoder.readInt(1);
            bufByteDecoder.readInt(1);
            while (bufByteDecoder.remain() > 0) {
                int i2 = bufByteDecoder.readInt(1);
                int i3 = bufByteDecoder.readInt(1);
                arrayList.add(new HMCardSwitchTime(i, GattUtils.bytesToHexStringNoSpace(bytes), bufByteDecoder.readLong(4), i2, i3));
            }
        } catch (Exception e) {
            Debug.fi(a, e.getMessage());
        }
        return arrayList;
    }
}
