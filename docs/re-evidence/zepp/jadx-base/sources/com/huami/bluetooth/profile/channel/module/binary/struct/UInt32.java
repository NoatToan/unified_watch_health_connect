package com.huami.bluetooth.profile.channel.module.binary.struct;

import androidx.annotation.Keep;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt32;", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/BaseType;", "", "", "data", "", "decode", "ensureValue", "()Ljava/lang/Long;", "toBytes", "defaultValue", "(J)Ljava/lang/Long;", "<init>", "()V", "", "value", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UInt32 extends BaseType<Long> {
    public UInt32() {
        this(0);
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    public void decode(@NotNull byte[] data) {
        setValue(Long.valueOf(GattUtils.bytesToLong(data, 0, 4)));
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    @NotNull
    public byte[] toBytes() {
        return GattUtils.numberToBytes(ensureValue().longValue(), 4);
    }

    public UInt32(int i) {
        decode(ByteUtilsKt.toByteArray(i, 4));
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    public /* bridge */ /* synthetic */ Long ensureValue(Long l) {
        return ensureValue(l.longValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    @NotNull
    public Long ensureValue() {
        Long value = getValue();
        return Long.valueOf(value == null ? 0L : value.longValue());
    }

    @NotNull
    public Long ensureValue(long defaultValue) {
        Long value = getValue();
        if (value != null) {
            defaultValue = value.longValue();
        }
        return Long.valueOf(defaultValue);
    }
}
