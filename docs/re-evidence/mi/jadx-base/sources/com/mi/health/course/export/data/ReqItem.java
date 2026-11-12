package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.sesdk.SDKConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/mi/health/course/export/data/ReqItem;", "", SDKConstants.SOURCE_TYPE, "", "courseIds", "", "", "<init>", "(ILjava/util/List;)V", "getSourceType", "()I", "getCourseIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReqItem {

    @SerializedName("course_ids")
    @NotNull
    private final List<String> courseIds;

    @SerializedName("source_type")
    private final int sourceType;

    public ReqItem(int i, @NotNull List<String> courseIds) {
        Intrinsics.checkNotNullParameter(courseIds, "courseIds");
        this.sourceType = i;
        this.courseIds = courseIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReqItem copy$default(ReqItem reqItem, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reqItem.sourceType;
        }
        if ((i2 & 2) != 0) {
            list = reqItem.courseIds;
        }
        return reqItem.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final List<String> component2() {
        return this.courseIds;
    }

    @NotNull
    public final ReqItem copy(int sourceType, @NotNull List<String> courseIds) {
        Intrinsics.checkNotNullParameter(courseIds, "courseIds");
        return new ReqItem(sourceType, courseIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReqItem)) {
            return false;
        }
        ReqItem reqItem = (ReqItem) other;
        return this.sourceType == reqItem.sourceType && Intrinsics.areEqual(this.courseIds, reqItem.courseIds);
    }

    @NotNull
    public final List<String> getCourseIds() {
        return this.courseIds;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.sourceType) * 31) + this.courseIds.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReqItem(sourceType=" + this.sourceType + ", courseIds=" + this.courseIds + ")";
    }
}
