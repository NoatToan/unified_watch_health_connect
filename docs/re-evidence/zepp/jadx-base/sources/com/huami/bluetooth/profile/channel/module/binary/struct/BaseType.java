package com.huami.bluetooth.profile.channel.module.binary.struct;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H&R$\u0010\f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/binary/struct/BaseType;", "V", "", "", "data", "", "decode", "ensureValue", "()Ljava/lang/Object;", "defaultValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toBytes", "value", "Ljava/lang/Object;", "getValue", "setValue", "(Ljava/lang/Object;)V", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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
