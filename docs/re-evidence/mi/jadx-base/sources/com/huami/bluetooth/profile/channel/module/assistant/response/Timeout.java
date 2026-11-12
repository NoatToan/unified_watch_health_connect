package com.huami.bluetooth.profile.channel.module.assistant.response;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/response/Timeout;", "R", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/huami/bluetooth/profile/channel/module/assistant/response/Timeout;", "equals", "", "other", "", "hashCode", "", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Timeout<R> extends Response<R> {

    @Nullable
    private final R value;

    /* JADX WARN: Illegal instructions before constructor call */
    public Timeout() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Timeout copy$default(Timeout timeout, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = timeout.value;
        }
        return timeout.copy(obj);
    }

    @Nullable
    public final R component1() {
        return this.value;
    }

    @NotNull
    public final Timeout<R> copy(@Nullable R value) {
        return new Timeout<>(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Timeout) && Intrinsics.areEqual(this.value, ((Timeout) other).value);
    }

    @Nullable
    public final R getValue() {
        return this.value;
    }

    public int hashCode() {
        R r2 = this.value;
        if (r2 == null) {
            return 0;
        }
        return r2.hashCode();
    }

    @NotNull
    public String toString() {
        return "Timeout(value=" + this.value + ')';
    }

    public Timeout(@Nullable R r2) {
        super(null);
        this.value = r2;
    }

    public /* synthetic */ Timeout(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }
}
