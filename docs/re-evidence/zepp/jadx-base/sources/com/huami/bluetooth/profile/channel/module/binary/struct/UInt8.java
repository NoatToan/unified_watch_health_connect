package com.huami.bluetooth.profile.channel.module.binary.struct;

import androidx.annotation.Keep;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\t\b\u0016¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8;", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/BaseType;", "", "", "data", "", "decode", "ensureValue", "()Ljava/lang/Integer;", "toBytes", "defaultValue", "(I)Ljava/lang/Integer;", "<init>", "()V", "value", "(I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class UInt8 extends BaseType<Integer> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt8$Companion;", "", "", "byte", "", "toInt", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int toInt(byte b) {
            return GattUtils.bytesToInt(new byte[]{b}, 0, 1);
        }
    }

    public UInt8() {
        this(0);
    }

    @JvmStatic
    public static final int toInt(byte b) {
        return INSTANCE.toInt(b);
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    public void decode(@NotNull byte[] data) {
        setValue(Integer.valueOf(GattUtils.bytesToInt(data, 0, 1)));
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    @NotNull
    public byte[] toBytes() {
        return ByteUtilsKt.toByteArray(ensureValue().intValue(), 1);
    }

    public UInt8(int i) {
        decode(ByteUtilsKt.toByteArray(i, 1));
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
