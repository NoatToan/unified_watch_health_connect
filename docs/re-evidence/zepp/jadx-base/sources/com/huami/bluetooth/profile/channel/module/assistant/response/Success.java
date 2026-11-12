package com.huami.bluetooth.profile.channel.module.assistant.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0007\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "R", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "toString", "component1", "()Ljava/lang/Object;", "data", "copy", "(Ljava/lang/Object;)Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Object;", "getData", "<init>", "(Ljava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Success<R> extends Response<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final R data;

    public Success(R r) {
        super(null);
        this.data = r;
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
        R r = this.data;
        if (r == null) {
            return 0;
        }
        return r.hashCode();
    }

    @NotNull
    public String toString() {
        return "Success(data=" + this.data + ')';
    }
}
