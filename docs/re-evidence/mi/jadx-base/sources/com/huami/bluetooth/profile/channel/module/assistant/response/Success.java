package com.huami.bluetooth.profile.channel.module.assistant.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "R", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Success<R> extends Response<R> {
    private final R data;

    public Success(R r2) {
        super(null);
        this.data = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = success.data;
        }
        return success.copy(obj);
    }

    public final R component1() {
        return this.data;
    }

    @NotNull
    public final Success<R> copy(R data) {
        return new Success<>(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Success) && Intrinsics.areEqual(this.data, ((Success) other).data);
    }

    public final R getData() {
        return this.data;
    }

    public int hashCode() {
        R r2 = this.data;
        if (r2 == null) {
            return 0;
        }
        return r2.hashCode();
    }

    @NotNull
    public String toString() {
        return "Success(data=" + this.data + ')';
    }
}
