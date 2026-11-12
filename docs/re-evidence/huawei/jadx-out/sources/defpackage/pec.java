package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes14.dex */
public class pec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planTime")
    private long f45234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.TASK_COMPLETE_TIME)
    private long f45235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planId")
    private String f45236c;

    @SerializedName("feedback")
    private String d;

    @SerializedName("dayNumber")
    private int e;

    @SerializedName("weekNumber")
    private int h;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String i;

    public String c() {
        return this.f45236c;
    }

    public void c(String str) {
        this.f45236c = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public void c(long j) {
        this.f45235b = j;
    }

    public void a(String str) {
        this.d = str;
    }

    public void e(int i) {
        this.h = i;
    }

    public void c(int i) {
        this.e = i;
    }

    public void a(long j) {
        this.f45234a = j;
    }

    public long e() {
        return this.f45234a;
    }
}
