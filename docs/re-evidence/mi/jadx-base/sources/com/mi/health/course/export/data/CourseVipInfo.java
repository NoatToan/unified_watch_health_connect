package com.mi.health.course.export.data;

import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/mi/health/course/export/data/CourseVipInfo;", "", AppStateModule.APP_STATE_ACTIVE, "", "expired_at", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExpired_at", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/mi/health/course/export/data/CourseVipInfo;", "equals", "other", "hashCode", "", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseVipInfo {

    @Nullable
    private final Boolean active;

    @Nullable
    private final String expired_at;

    public CourseVipInfo(@Nullable Boolean bool, @Nullable String str) {
        this.active = bool;
        this.expired_at = str;
    }

    public static /* synthetic */ CourseVipInfo copy$default(CourseVipInfo courseVipInfo, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = courseVipInfo.active;
        }
        if ((i & 2) != 0) {
            str = courseVipInfo.expired_at;
        }
        return courseVipInfo.copy(bool, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpired_at() {
        return this.expired_at;
    }

    @NotNull
    public final CourseVipInfo copy(@Nullable Boolean active, @Nullable String expired_at) {
        return new CourseVipInfo(active, expired_at);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseVipInfo)) {
            return false;
        }
        CourseVipInfo courseVipInfo = (CourseVipInfo) other;
        return Intrinsics.areEqual(this.active, courseVipInfo.active) && Intrinsics.areEqual(this.expired_at, courseVipInfo.expired_at);
    }

    @Nullable
    public final Boolean getActive() {
        return this.active;
    }

    @Nullable
    public final String getExpired_at() {
        return this.expired_at;
    }

    public int hashCode() {
        Boolean bool = this.active;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.expired_at;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CourseVipInfo(active=" + this.active + ", expired_at=" + this.expired_at + ")";
    }
}
