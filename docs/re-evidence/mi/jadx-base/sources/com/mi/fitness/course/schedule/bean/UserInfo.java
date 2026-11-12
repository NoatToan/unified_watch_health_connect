package com.mi.fitness.course.schedule.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/mi/fitness/course/schedule/bean/UserInfo;", "", "userId", "", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getDeviceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "course-schedule_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserInfo {

    @NotNull
    private final String deviceId;

    @NotNull
    private final String userId;

    public UserInfo(@NotNull String userId, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.userId = userId;
        this.deviceId = deviceId;
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.deviceId;
        }
        return userInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final UserInfo copy(@NotNull String userId, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new UserInfo(userId, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return Intrinsics.areEqual(this.userId, userInfo.userId) && Intrinsics.areEqual(this.deviceId, userInfo.deviceId);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.deviceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserInfo(userId=" + this.userId + ", deviceId=" + this.deviceId + ")";
    }
}
