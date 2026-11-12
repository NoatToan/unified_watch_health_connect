package com.xiaomi.fitness.sport.sporttab.uimodel;

import com.mi.health.course.export.data.CourseModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.uimodel.CourseSeriesDataModel, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/uimodel/CourseSeriesDataModel;", "", "courseList", "", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "courseSeriesName", "", "courseSeriesDes", "url", "isError", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCourseList", "()Ljava/util/List;", "getCourseSeriesName", "()Ljava/lang/String;", "getCourseSeriesDes", "getUrl", "()Z", "setError", "(Z)V", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SerialCourseDataModel {

    @NotNull
    private final List<CourseModel.CourseData> courseList;

    @NotNull
    private final String courseSeriesDes;

    @NotNull
    private final String courseSeriesName;
    private boolean isError;

    @NotNull
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public SerialCourseDataModel(@NotNull List<? extends CourseModel.CourseData> courseList, @NotNull String courseSeriesName, @NotNull String courseSeriesDes, @NotNull String url, boolean z) {
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        Intrinsics.checkNotNullParameter(courseSeriesName, "courseSeriesName");
        Intrinsics.checkNotNullParameter(courseSeriesDes, "courseSeriesDes");
        Intrinsics.checkNotNullParameter(url, "url");
        this.courseList = courseList;
        this.courseSeriesName = courseSeriesName;
        this.courseSeriesDes = courseSeriesDes;
        this.url = url;
        this.isError = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerialCourseDataModel copy$default(SerialCourseDataModel serialCourseDataModel, List list, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = serialCourseDataModel.courseList;
        }
        if ((i & 2) != 0) {
            str = serialCourseDataModel.courseSeriesName;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = serialCourseDataModel.courseSeriesDes;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = serialCourseDataModel.url;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = serialCourseDataModel.isError;
        }
        return serialCourseDataModel.copy(list, str4, str5, str6, z);
    }

    @NotNull
    public final List<CourseModel.CourseData> component1() {
        return this.courseList;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCourseSeriesName() {
        return this.courseSeriesName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCourseSeriesDes() {
        return this.courseSeriesDes;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    @NotNull
    public final SerialCourseDataModel copy(@NotNull List<? extends CourseModel.CourseData> courseList, @NotNull String courseSeriesName, @NotNull String courseSeriesDes, @NotNull String url, boolean isError) {
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        Intrinsics.checkNotNullParameter(courseSeriesName, "courseSeriesName");
        Intrinsics.checkNotNullParameter(courseSeriesDes, "courseSeriesDes");
        Intrinsics.checkNotNullParameter(url, "url");
        return new SerialCourseDataModel(courseList, courseSeriesName, courseSeriesDes, url, isError);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerialCourseDataModel)) {
            return false;
        }
        SerialCourseDataModel serialCourseDataModel = (SerialCourseDataModel) other;
        return Intrinsics.areEqual(this.courseList, serialCourseDataModel.courseList) && Intrinsics.areEqual(this.courseSeriesName, serialCourseDataModel.courseSeriesName) && Intrinsics.areEqual(this.courseSeriesDes, serialCourseDataModel.courseSeriesDes) && Intrinsics.areEqual(this.url, serialCourseDataModel.url) && this.isError == serialCourseDataModel.isError;
    }

    @NotNull
    public final List<CourseModel.CourseData> getCourseList() {
        return this.courseList;
    }

    @NotNull
    public final String getCourseSeriesDes() {
        return this.courseSeriesDes;
    }

    @NotNull
    public final String getCourseSeriesName() {
        return this.courseSeriesName;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((this.courseList.hashCode() * 31) + this.courseSeriesName.hashCode()) * 31) + this.courseSeriesDes.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.isError);
    }

    public final boolean isError() {
        return this.isError;
    }

    public final void setError(boolean z) {
        this.isError = z;
    }

    @NotNull
    public String toString() {
        return "SerialCourseDataModel(courseList=" + this.courseList + ")";
    }

    public /* synthetic */ SerialCourseDataModel(List list, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, (i & 16) != 0 ? false : z);
    }
}
