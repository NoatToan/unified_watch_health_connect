package com.huami.bluetooth.profile.channel.module.binary.struct;

import androidx.annotation.Keep;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt16;", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/BaseType;", "", "", "data", "", "decode", "ensureValue", "()Ljava/lang/Integer;", "toBytes", "defaultValue", "(I)Ljava/lang/Integer;", "<init>", "()V", "value", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UInt16 extends BaseType<Integer> {
    public UInt16() {
        this(0);
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    public void decode(@NotNull byte[] data) {
        setValue(Integer.valueOf(GattUtils.bytesToInt(data, 0, 2)));
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    @NotNull
    public byte[] toBytes() {
        return ByteUtilsKt.toByteArray(ensureValue().intValue(), 2);
    }

    public UInt16(int i) {
        decode(ByteUtilsKt.toByteArray(i, 2));
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    public /* bridge */ /* synthetic */ Integer ensureValue(Integer num) {
        return ensureValue(num.intValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    @NotNull
    public Integer ensureValue() {
        Integer value = getValue();
        return Integer.valueOf(value == null ? 0 : value.intValue());
    }

    @NotNull
    public Integer ensureValue(int defaultValue) {
        Integer value = getValue();
        if (value != null) {
            defaultValue = value.intValue();
        }
        return Integer.valueOf(defaultValue);
    }
}
