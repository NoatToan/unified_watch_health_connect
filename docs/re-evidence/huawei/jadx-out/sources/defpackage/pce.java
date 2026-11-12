package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.pluginfitnessadvice.TargetConfig;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class pce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resource")
    private d f45142a;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String d;

    @SerializedName("planExecuteTime")
    private long e;

    public String c() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public long b() {
        return this.e;
    }

    public void d(long j) {
        this.e = j;
    }

    public d d() {
        return this.f45142a;
    }

    public String toString() {
        return "CustomCourseParameter{workoutId='" + this.d + "', planExecuteTime=" + this.e + ", resource=" + this.f45142a + '}';
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("calorie")
        private long f45150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("difficulty")
        private int f45151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("calorieMan")
        private long f45152c;

        @SerializedName("customCourseInfo")
        private String d;

        @SerializedName("algCourseNameId")
        private String e;

        @SerializedName("duration")
        private long f;

        @SerializedName("difficultyMan")
        private int g;

        @SerializedName("sourceType")
        private String h;

        @SerializedName("id")
        private String i;

        @SerializedName("durationMan")
        private long j;

        @SerializedName("title")
        private String n;

        public long e() {
            return this.f45150a;
        }

        public long d() {
            return this.f45152c;
        }

        public int c() {
            return this.f45151b;
        }

        public int b() {
            return this.g;
        }

        public long i() {
            return this.f;
        }

        public long f() {
            return this.j;
        }

        public String g() {
            return this.i;
        }

        public String h() {
            return this.h;
        }

        public String a() {
            return this.d;
        }

        public String j() {
            return this.n;
        }

        public String toString() {
            return "Resource{algCourseNameId='" + this.e + "', calorie=" + this.f45150a + ", calorieMan=" + this.f45152c + ", difficulty=" + this.f45151b + ", difficultyMan=" + this.g + ", duration=" + this.f + ", durationMan=" + this.j + ", id='" + this.i + "', sourceType='" + this.h + "', customCourseInfo='" + this.d + "', title='" + this.n + "'}";
        }
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("combNum")
        private int f45145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("courseComb")
        private List<a> f45146c;

        public List<a> d() {
            return this.f45146c;
        }

        public String toString() {
            return "CustomCourseInfo{combNum=" + this.f45145b + ", courseComb=" + this.f45146c + '}';
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("actionNum")
        private int f45143a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("repeatTimes")
        private int f45144c;

        @SerializedName("actionList")
        private List<c> e;

        public int e() {
            return this.f45144c;
        }

        public List<c> b() {
            return this.e;
        }

        public String toString() {
            return "CourseComb{actionNum=" + this.f45143a + ", repeatTimes=" + this.f45144c + ", actionList=" + this.e + '}';
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("strength")
        private TargetConfig f45147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("name")
        private String f45148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("target")
        private TargetConfig f45149c;

        @SerializedName("actionId")
        private String e;

        public String e() {
            return this.e;
        }

        public String a() {
            return this.f45148b;
        }

        public TargetConfig b() {
            return this.f45147a;
        }

        public TargetConfig c() {
            return this.f45149c;
        }

        public String toString() {
            return "ActionList{actionId='" + this.e + "', name='" + this.f45148b + "', strength=" + this.f45147a + ", target=" + this.f45149c + '}';
        }
    }
}
