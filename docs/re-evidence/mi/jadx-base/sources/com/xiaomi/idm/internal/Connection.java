package com.xiaomi.idm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0013\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0019HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006-"}, d2 = {"Lcom/xiaomi/idm/internal/Connection;", "", "connectionId", "", "(Ljava/lang/String;)V", "advanceChannelConnected", "", "getAdvanceChannelConnected", "()Z", "setAdvanceChannelConnected", "(Z)V", "advancedDirectChannelConnected", "getAdvancedDirectChannelConnected", "setAdvancedDirectChannelConnected", "autoChannelConnected", "getAutoChannelConnected", "setAutoChannelConnected", "basicChannelConnected", "getBasicChannelConnected", "setBasicChannelConnected", "connected", "getConnected", "getConnectionId", "()Ljava/lang/String;", "sendBlockMaxParallelTaskNumber", "", "getSendBlockMaxParallelTaskNumber", "()I", "setSendBlockMaxParallelTaskNumber", "(I)V", "sendBlockSizePerPacket", "getSendBlockSizePerPacket", "setSendBlockSizePerPacket", "sendBlockTimeout", "", "getSendBlockTimeout", "()J", "setSendBlockTimeout", "(J)V", "component1", "copy", "equals", "other", "hashCode", "toString", "IDMSdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Connection {
    private volatile boolean advanceChannelConnected;
    private volatile boolean advancedDirectChannelConnected;
    private volatile boolean autoChannelConnected;
    private volatile boolean basicChannelConnected;

    @NotNull
    private final String connectionId;
    private volatile int sendBlockMaxParallelTaskNumber;
    private volatile int sendBlockSizePerPacket;
    private volatile long sendBlockTimeout;

    public Connection(@NotNull String connectionId) {
        Intrinsics.checkNotNullParameter(connectionId, "connectionId");
        this.connectionId = connectionId;
        this.sendBlockTimeout = 10000L;
        this.sendBlockMaxParallelTaskNumber = 20;
        this.sendBlockSizePerPacket = 8000;
    }

    public static /* synthetic */ Connection copy$default(Connection connection, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connection.connectionId;
        }
        return connection.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConnectionId() {
        return this.connectionId;
    }

    @NotNull
    public final Connection copy(@NotNull String connectionId) {
        Intrinsics.checkNotNullParameter(connectionId, "connectionId");
        return new Connection(connectionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Connection) && Intrinsics.areEqual(this.connectionId, ((Connection) other).connectionId);
    }

    public final boolean getAdvanceChannelConnected() {
        return this.advanceChannelConnected;
    }

    public final boolean getAdvancedDirectChannelConnected() {
        return this.advancedDirectChannelConnected;
    }

    public final boolean getAutoChannelConnected() {
        return this.autoChannelConnected;
    }

    public final boolean getBasicChannelConnected() {
        return this.basicChannelConnected;
    }

    public final boolean getConnected() {
        return this.autoChannelConnected || this.basicChannelConnected || this.advanceChannelConnected || this.advancedDirectChannelConnected;
    }

    @NotNull
    public final String getConnectionId() {
        return this.connectionId;
    }

    public final int getSendBlockMaxParallelTaskNumber() {
        return this.sendBlockMaxParallelTaskNumber;
    }

    public final int getSendBlockSizePerPacket() {
        return this.sendBlockSizePerPacket;
    }

    public final long getSendBlockTimeout() {
        return this.sendBlockTimeout;
    }

    public int hashCode() {
        return this.connectionId.hashCode();
    }

    public final void setAdvanceChannelConnected(boolean z) {
        this.advanceChannelConnected = z;
    }

    public final void setAdvancedDirectChannelConnected(boolean z) {
        this.advancedDirectChannelConnected = z;
    }

    public final void setAutoChannelConnected(boolean z) {
        this.autoChannelConnected = z;
    }

    public final void setBasicChannelConnected(boolean z) {
        this.basicChannelConnected = z;
    }

    public final void setSendBlockMaxParallelTaskNumber(int i) {
        this.sendBlockMaxParallelTaskNumber = i;
    }

    public final void setSendBlockSizePerPacket(int i) {
        this.sendBlockSizePerPacket = i;
    }

    public final void setSendBlockTimeout(long j) {
        this.sendBlockTimeout = j;
    }

    @NotNull
    public String toString() {
        return "Connection(connectionId=" + this.connectionId + ')';
    }
}
