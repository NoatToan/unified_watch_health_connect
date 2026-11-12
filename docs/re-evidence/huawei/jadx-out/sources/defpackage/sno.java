package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sno {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f48425a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("behaviorList")
    private List<e> f48426c;

    @SerializedName("resultCode")
    private String d;

    @SerializedName("totalCount")
    private int e;

    public String d() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public List<e> c() {
        return this.f48426c;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(ParsedFieldTag.TASK_COMPLETE_TIME)
        private long f48427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("courseId")
        private String f48428b;

        @SerializedName(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE)
        private int d;

        public long e() {
            return this.f48427a;
        }
    }
}
