package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"action", "key", "endTime"}, tableName = "server_request")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/ServerRequestEntity;", "", "action", "", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getKey", "watermark", "", "getWatermark", "()J", "setWatermark", "(J)V", "startTime", "getStartTime", "setStartTime", "endTime", "getEndTime", "setEndTime", "nextKey", "getNextKey", "setNextKey", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ServerRequestEntity {

    @NotNull
    private final String action;
    private long endTime;

    @NotNull
    private final String key;

    @Nullable
    private String nextKey;
    private long startTime;
    private long watermark;

    public ServerRequestEntity(@NotNull String action, @NotNull String key) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(key, "key");
        this.action = action;
        this.key = key;
    }

    public static /* synthetic */ ServerRequestEntity copy$default(ServerRequestEntity serverRequestEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverRequestEntity.action;
        }
        if ((i & 2) != 0) {
            str2 = serverRequestEntity.key;
        }
        return serverRequestEntity.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final ServerRequestEntity copy(@NotNull String action, @NotNull String key) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(key, "key");
        return new ServerRequestEntity(action, key);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerRequestEntity)) {
            return false;
        }
        ServerRequestEntity serverRequestEntity = (ServerRequestEntity) other;
        return Intrinsics.areEqual(this.action, serverRequestEntity.action) && Intrinsics.areEqual(this.key, serverRequestEntity.key);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getNextKey() {
        return this.nextKey;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getWatermark() {
        return this.watermark;
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + this.key.hashCode();
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setNextKey(@Nullable String str) {
        this.nextKey = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setWatermark(long j) {
        this.watermark = j;
    }

    @NotNull
    public String toString() {
        return "ServerRequestEntity(action=" + this.action + ", key=" + this.key + ")";
    }
}
