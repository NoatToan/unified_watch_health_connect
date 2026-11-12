package com.huami.bluetooth.profile.channel.module.binary.struct;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\r\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\rH&R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/struct/BaseType;", "V", "", "()V", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "decode", "", "data", "", "ensureValue", "defaultValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toBytes", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseType<V> {

    @Nullable
    private V value;

    public abstract void decode(@NotNull byte[] data);

    public abstract V ensureValue();

    public abstract V ensureValue(V defaultValue);

    @Nullable
    public final V getValue() {
        return this.value;
    }

    public final void setValue(@Nullable V v) {
        this.value = v;
    }

    @NotNull
    public abstract byte[] toBytes();
}
