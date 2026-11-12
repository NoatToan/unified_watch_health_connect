package com.huami.treadmill.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/treadmill/data/NetworkState;", "", "Lcom/huami/treadmill/data/Status;", "component1", "", "component2", "status", "msg", "copy", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/treadmill/data/Status;", "getStatus", "()Lcom/huami/treadmill/data/Status;", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "<init>", "(Lcom/huami/treadmill/data/Status;Ljava/lang/String;)V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NetworkState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final NetworkState LOADED;

    @NotNull
    private static final NetworkState LOADING;

    @Nullable
    private final String msg;

    @NotNull
    private final Status status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0019\u0010\u0006\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/treadmill/data/NetworkState$Companion;", "", "", "msg", "Lcom/huami/treadmill/data/NetworkState;", "error", "LOADED", "Lcom/huami/treadmill/data/NetworkState;", "getLOADED", "()Lcom/huami/treadmill/data/NetworkState;", "LOADING", "getLOADING", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkState error(@Nullable String msg) {
            return new NetworkState(Status.FAILED, msg, null);
        }

        @NotNull
        public final NetworkState getLOADED() {
            return NetworkState.LOADED;
        }

        @NotNull
        public final NetworkState getLOADING() {
            return NetworkState.LOADING;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 2;
        LOADED = new NetworkState(Status.SUCCESS, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        LOADING = new NetworkState(Status.RUNNING, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    private NetworkState(Status status, String str) {
        this.status = status;
        this.msg = str;
    }

    public /* synthetic */ NetworkState(Status status, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, str);
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, Status status, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            status = networkState.status;
        }
        if ((i & 2) != 0) {
            str = networkState.msg;
        }
        return networkState.copy(status, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final NetworkState copy(@NotNull Status status, @Nullable String msg) {
        return new NetworkState(status, msg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) other;
        return this.status == networkState.status && Intrinsics.areEqual(this.msg, networkState.msg);
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.msg;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "NetworkState(status=" + this.status + ", msg=" + ((Object) this.msg) + ')';
    }

    public /* synthetic */ NetworkState(Status status, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i & 2) != 0 ? null : str);
    }
}
