package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.sport.model.WorkoutRecord;

/* JADX INFO: loaded from: classes31.dex */
public class gzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("courseId")
    private String f36291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("completionValue")
    private float f36292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("defineType")
    private int f36293c;

    @SerializedName("completionRate")
    private float d;

    @SerializedName("modifiedTime")
    private long e;

    @SerializedName("courseName")
    private String g;

    @SerializedName(WorkoutRecord.Extend.COURSE_TARGET_TYPE)
    private int h;

    @SerializedName(WorkoutRecord.Extend.COURSE_TARGET_VALUE)
    private float i;

    public String toString() {
        return "RecordCourseSummary{mCourseId='" + this.f36291a + "', mCourseName='" + this.g + "', mCompletionRate='" + this.d + "', mCourseTargetType=" + this.h + ", mCourseTargetValue=" + this.i + ", mCompletionValue=" + this.f36292b + ", mCourseDefineType=" + this.f36293c + ", mCourseModifiedTime=" + this.e + '}';
    }
}
