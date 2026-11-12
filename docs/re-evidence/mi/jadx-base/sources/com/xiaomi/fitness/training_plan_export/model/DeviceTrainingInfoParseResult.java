package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/DeviceTrainingInfoParseResult;", "", "type", "", "id", "", "courseList", "", "", "", "Lcom/xiaomi/fitness/training_plan_export/model/CourseInfoHolder;", "<init>", "(IJLjava/util/Map;)V", "getType", "()I", "getId", "()J", "getCourseList", "()Ljava/util/Map;", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceTrainingInfoParseResult {

    @SerializedName("finishedCourseInfo")
    @NotNull
    private final Map<String, List<CourseInfoHolder>> courseList;

    @SerializedName("planId")
    private final long id;

    @SerializedName("trainingType")
    private final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceTrainingInfoParseResult(int i, long j, @NotNull Map<String, ? extends List<CourseInfoHolder>> courseList) {
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        this.type = i;
        this.id = j;
        this.courseList = courseList;
    }

    @NotNull
    public final Map<String, List<CourseInfoHolder>> getCourseList() {
        return this.courseList;
    }

    public final long getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }
}
