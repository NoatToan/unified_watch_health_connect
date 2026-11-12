package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gif implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("actionSummary")
    private String f35173a;

    @SerializedName("weekSequence")
    private Integer aa;

    @SerializedName(WorkoutRecord.Extend.RunWorkout.RUN_WORKOUT_TRAJECTORY_ID)
    private String ab;

    @SerializedName("wearType")
    private Integer ac;

    @SerializedName("trainingLoadPeak")
    private Integer ad;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bestPace")
    private Integer f35174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("by")
    private Integer f35175c;

    @SerializedName("actualCalorie")
    private Float d;

    @SerializedName("actualDistance")
    private Integer e;

    @SerializedName("distance")
    private Integer f;

    @SerializedName("completionRate")
    private Float g;

    @SerializedName("displayorder")
    private Integer h;

    @SerializedName(ParsedFieldTag.TASK_COMPLETE_TIME)
    private Long i;

    @SerializedName("calorie")
    private Float j;

    @SerializedName("heartRateDown")
    private Integer k;

    @SerializedName("extend")
    private String l;

    @SerializedName("heartRateUp")
    private Integer m;

    @SerializedName("heartRateList")
    private List<e> n;

    @SerializedName("duration")
    private Integer o;

    @SerializedName("invalidHeartRateList")
    private List<e> p;

    @SerializedName(ParsedFieldTag.NPES_TOTAL_SCORE)
    private Long q;

    @SerializedName("recordModeType")
    private Integer r;

    @SerializedName("id")
    private Integer s;

    @SerializedName(HwExerciseConstants.JSON_NAME_TRAINING_POINTS)
    private Integer t;

    @SerializedName("name")
    private String u;

    @SerializedName("planId")
    private String v;

    @SerializedName("overwrite")
    private Boolean w;

    @SerializedName("oxygen")
    private Double x;

    @SerializedName("trainingDate")
    private Long y;

    @SerializedName("version")
    private String z;

    private gif(b bVar) {
        this.s = bVar.r;
        this.f35175c = bVar.e;
        this.v = bVar.u;
        this.aa = bVar.aa;
        this.y = bVar.v;
        this.ah = bVar.af;
        this.u = bVar.w;
        this.h = bVar.g;
        this.f = bVar.f;
        this.j = bVar.h;
        this.e = bVar.f35178c;
        this.d = bVar.f35177b;
        this.g = bVar.j;
        this.o = bVar.m;
        this.m = bVar.o;
        this.k = bVar.k;
        this.f35174b = bVar.d;
        this.i = bVar.i;
        this.x = bVar.y;
        this.ad = bVar.ad;
        this.ab = bVar.ab;
        this.f35173a = bVar.f35176a;
        this.z = bVar.z;
        this.ac = bVar.ac;
        this.l = bVar.l;
        this.t = bVar.t;
        this.q = bVar.s;
        this.r = bVar.p;
        this.n = bVar.n;
        this.p = bVar.q;
        this.w = bVar.x;
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("time")
        private Long f35179b;

        @SerializedName(IndoorEquipManagerApi.KEY_HEART_RATE)
        private Integer e;

        private e(b bVar) {
            this.e = bVar.d;
            this.f35179b = bVar.f35180a;
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Long f35180a;
            private Integer d;

            public b c(Integer num) {
                this.d = num;
                return this;
            }

            public b c(Long l) {
                this.f35180a = l;
                return this;
            }

            public e a() {
                return new e(this);
            }
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.m();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35176a;
        private Integer aa;
        private String ab;
        private Integer ac;
        private Integer ad;
        private String af;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Float f35177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35178c;
        private Integer d;
        private Integer e;
        private Integer f;
        private Integer g;
        private Float h;
        private Long i;
        private Float j;
        private Integer k;
        private String l;
        private Integer m;
        private List<e> n;
        private Integer o;
        private Integer p;
        private List<e> q;
        private Integer r;
        private Long s;
        private Integer t;
        private String u;
        private Long v;
        private String w;
        private Boolean x;
        private Double y;
        private String z;

        public b f(Integer num) {
            this.r = num;
            return this;
        }

        public b a(Integer num) {
            this.e = num;
            return this;
        }

        public b e(String str) {
            this.u = str;
            return this;
        }

        public b n(Integer num) {
            this.aa = num;
            return this;
        }

        public b c(Long l) {
            this.v = l;
            return this;
        }

        public b j(String str) {
            this.af = str;
            return this;
        }

        public b b(String str) {
            this.w = str;
            return this;
        }

        public b d(Integer num) {
            this.g = num;
            return this;
        }

        public b e(Integer num) {
            this.f = num;
            return this;
        }

        public b c(Float f) {
            this.h = f;
            return this;
        }

        public b b(Integer num) {
            this.f35178c = num;
            return this;
        }

        public b a(Float f) {
            this.f35177b = f;
            return this;
        }

        public b b(Float f) {
            this.j = f;
            return this;
        }

        public b i(Integer num) {
            this.m = num;
            return this;
        }

        public b g(Integer num) {
            this.o = num;
            return this;
        }

        public b j(Integer num) {
            this.k = num;
            return this;
        }

        public b c(Integer num) {
            this.d = num;
            return this;
        }

        public b e(Long l) {
            this.i = l;
            return this;
        }

        public b d(Double d) {
            this.y = d;
            return this;
        }

        public b l(Integer num) {
            this.ad = num;
            return this;
        }

        public b a(String str) {
            this.ab = str;
            return this;
        }

        public b d(String str) {
            this.f35176a = str;
            return this;
        }

        public b i(String str) {
            this.z = str;
            return this;
        }

        public b m(Integer num) {
            this.ac = num;
            return this;
        }

        public b c(String str) {
            this.l = str;
            return this;
        }

        public b b(List<e> list) {
            this.n = list;
            return this;
        }

        public b d(Long l) {
            this.s = l;
            return this;
        }

        public b h(Integer num) {
            this.p = num;
            return this;
        }

        public b c(List<e> list) {
            this.q = list;
            return this;
        }

        public b c(Boolean bool) {
            this.x = bool;
            return this;
        }

        public gif b() {
            return new gif(this);
        }
    }
}
