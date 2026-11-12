package com.huawei.pluginfitnessadvice.plandata;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.sport.model.WorkoutRecord;
import defpackage.pds;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class CourseDataBean implements Serializable, Cloneable {
    private static final long serialVersionUID = 774731271769351368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("clockFlag")
    private int f22332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("courseInfo")
    private pds f22333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE)
    private int f22334c;

    @SerializedName("courseId")
    private String d;

    public pds d() {
        return this.f22333b;
    }

    public int b() {
        return this.f22334c;
    }

    public String e() {
        return this.d;
    }

    public void d(boolean z) {
        if (z) {
            this.f22332a = 1;
        } else {
            this.f22332a = 0;
        }
    }

    public boolean a() {
        return this.f22332a == 1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public enum PlanCourseType {
        RACE_DAY(0),
        RUN_COURSE(1),
        STRENGHT_COURSE(2);

        int mValue;

        PlanCourseType(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }
    }
}
