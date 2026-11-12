package com.xiaomi.fitness.electronic.scale.export.bean;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/SharedMember;", "Ljava/io/Serializable;", "userId", "", "nickName", "", "shareId", "<init>", "(JLjava/lang/String;J)V", "getUserId", "()J", "setUserId", "(J)V", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "getShareId", "setShareId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SharedMember implements Serializable {

    @NotNull
    private String nickName;
    private long shareId;
    private long userId;

    public SharedMember() {
        this(0L, null, 0L, 7, null);
    }

    public static /* synthetic */ SharedMember copy$default(SharedMember sharedMember, long j, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sharedMember.userId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = sharedMember.nickName;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = sharedMember.shareId;
        }
        return sharedMember.copy(j3, str2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getShareId() {
        return this.shareId;
    }

    @NotNull
    public final SharedMember copy(long userId, @NotNull String nickName, long shareId) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        return new SharedMember(userId, nickName, shareId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedMember)) {
            return false;
        }
        SharedMember sharedMember = (SharedMember) other;
        return this.userId == sharedMember.userId && Intrinsics.areEqual(this.nickName, sharedMember.nickName) && this.shareId == sharedMember.shareId;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final long getShareId() {
        return this.shareId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.userId) * 31) + this.nickName.hashCode()) * 31) + Long.hashCode(this.shareId);
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setShareId(long j) {
        this.shareId = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    @NotNull
    public String toString() {
        return "SharedMember(userId=" + this.userId + ", nickName=" + this.nickName + ", shareId=" + this.shareId + ")";
    }

    public SharedMember(long j, @NotNull String nickName, long j2) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        this.userId = j;
        this.nickName = nickName;
        this.shareId = j2;
    }

    public /* synthetic */ SharedMember(long j, String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j2);
    }
}
