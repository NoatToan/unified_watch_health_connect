package com.huami.bluetooth.profile.channel.module.binary.struct;

import androidx.annotation.Keep;
import defpackage.c3;
import defpackage.tet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\r\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt32;", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/BaseType;", "", "()V", "value", "", "(I)V", "decode", "", "data", "", "ensureValue", "()Ljava/lang/Long;", "defaultValue", "(J)Ljava/lang/Long;", "toBytes", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UInt32 extends BaseType<Long> {
    public UInt32() {
        this(0);
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    public void decode(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        setValue(Long.valueOf(tet.v(data, 0, 4)));
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    @NotNull
    public byte[] toBytes() {
        byte[] bArrR = tet.r(ensureValue().longValue(), 4);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(ensureValue(), 4)");
        return bArrR;
    }

    public UInt32(int i) {
        decode(c3.a(i, 4));
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
        return Long.valueOf(value != null ? value.longValue() : 0L);
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
