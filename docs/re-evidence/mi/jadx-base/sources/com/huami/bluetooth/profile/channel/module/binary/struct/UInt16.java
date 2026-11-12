package com.huami.bluetooth.profile.channel.module.binary.struct;

import androidx.annotation.Keep;
import defpackage.c3;
import defpackage.tet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\r\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u000bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/struct/UInt16;", "Lcom/huami/bluetooth/profile/channel/module/binary/struct/BaseType;", "", "()V", "value", "(I)V", "decode", "", "data", "", "ensureValue", "()Ljava/lang/Integer;", "defaultValue", "(I)Ljava/lang/Integer;", "toBytes", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UInt16 extends BaseType<Integer> {
    public UInt16() {
        this(0);
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    public void decode(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        setValue(Integer.valueOf(tet.d(data, 0, 2)));
    }

    @Override // com.huami.bluetooth.profile.channel.module.binary.struct.BaseType
    @NotNull
    public byte[] toBytes() {
        return c3.a(ensureValue().intValue(), 2);
    }

    public UInt16(int i) {
        decode(c3.a(i, 2));
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
        return Integer.valueOf(value != null ? value.intValue() : 0);
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
