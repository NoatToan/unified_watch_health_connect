package com.xiaomi.fitness.sport_manager_export.data;

import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/data/SportCourse;", "Ljava/io/Serializable;", "<init>", "()V", "type", "", "getType", "()I", "setType", "(I)V", FitnessReportKey.cloudCourseId, "", "getCloudCourseId", "()J", "setCloudCourseId", "(J)V", "courseName", "", "getCourseName", "()Ljava/lang/String;", "setCourseName", "(Ljava/lang/String;)V", "courseDuration", "getCourseDuration", "setCourseDuration", "cloudCourseReferenceCal", "getCloudCourseReferenceCal", "setCloudCourseReferenceCal", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportCourse implements Serializable {
    private long cloudCourseId;
    private int cloudCourseReferenceCal;
    private int courseDuration;

    @Nullable
    private String courseName;
    private int type;

    public final long getCloudCourseId() {
        return this.cloudCourseId;
    }

    public final int getCloudCourseReferenceCal() {
        return this.cloudCourseReferenceCal;
    }

    public final int getCourseDuration() {
        return this.courseDuration;
    }

    @Nullable
    public final String getCourseName() {
        return this.courseName;
    }

    public final int getType() {
        return this.type;
    }

    public final void setCloudCourseId(long j) {
        this.cloudCourseId = j;
    }

    public final void setCloudCourseReferenceCal(int i) {
        this.cloudCourseReferenceCal = i;
    }

    public final void setCourseDuration(int i) {
        this.courseDuration = i;
    }

    public final void setCourseName(@Nullable String str) {
        this.courseName = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
