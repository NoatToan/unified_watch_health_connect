package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.pluginfitnessadvice.FitWorkout;

/* JADX INFO: loaded from: classes31.dex */
public class ibu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private String f37460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("duration")
    private int f37461b;

    @SerializedName("difficulty")
    private int d;

    @SerializedName("commodityFlag")
    private int e;

    @SerializedName("topicPreviewPicUrl")
    private String f;

    @SerializedName("version")
    private String h;

    @SerializedName("name")
    private String i;

    @SerializedName("publishDate")
    private long j;

    @SerializedName("intervals")
    private int g = -4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(WorkoutRecord.Extend.COURSE_DEFINE_TYPE)
    private int f37462c = 0;

    public String j() {
        return this.f37460a;
    }

    public String i() {
        return this.i;
    }

    public String f() {
        return this.f;
    }

    public int a() {
        return this.f37461b;
    }

    public int h() {
        return this.g;
    }

    public int b() {
        return this.d;
    }

    public int e() {
        return this.f37462c;
    }

    public int d() {
        return this.e;
    }

    public long g() {
        return this.j;
    }

    public FitWorkout c() {
        FitWorkout fitWorkout = new FitWorkout();
        fitWorkout.saveId(this.f37460a);
        fitWorkout.saveName(this.i);
        fitWorkout.saveVersion(this.h);
        fitWorkout.saveDifficulty(this.d);
        fitWorkout.saveDuration(this.f37461b);
        fitWorkout.setTopicPreviewPicUrl(this.f);
        fitWorkout.setIntervals(this.g);
        fitWorkout.setCourseDefineType(this.f37462c);
        fitWorkout.setCommodityFlag(this.e);
        return fitWorkout;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f37463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f37464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f37465c;
        private int d;
        private int e;
        private String f;
        private String g;
        private long h;
        private int i;
        private String j;

        public ibu b() {
            ibu ibuVar = new ibu();
            ibuVar.f37460a = this.f37463a;
            ibuVar.i = this.g;
            ibuVar.h = this.f;
            ibuVar.f = this.j;
            ibuVar.f37461b = this.e;
            ibuVar.g = this.i;
            ibuVar.d = this.f37464b;
            ibuVar.f37462c = this.f37465c;
            ibuVar.e = this.d;
            ibuVar.j = this.h;
            return ibuVar;
        }

        public c c(FitWorkout fitWorkout) {
            if (fitWorkout != null) {
                this.f37463a = fitWorkout.acquireId();
                this.g = fitWorkout.acquireName();
                this.f = fitWorkout.accquireVersion();
                this.j = fitWorkout.getTopicPreviewPicUrl();
                this.e = fitWorkout.acquireDuration();
                this.i = fitWorkout.getIntervals();
                this.f37464b = fitWorkout.acquireDifficulty();
                this.f37465c = fitWorkout.getCourseDefineType();
                this.d = fitWorkout.acquireCommodityFlag();
                this.h = fitWorkout.getPublishDate();
            }
            return this;
        }
    }
}
