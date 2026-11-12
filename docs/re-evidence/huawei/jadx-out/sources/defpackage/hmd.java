package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.FitWorkout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class hmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("courseBelongType")
    private int f36898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("entrance")
    private String f36899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fitWorkout")
    private FitWorkout f36900c;

    @SerializedName("coachData")
    private CoachData d;

    @SerializedName("currRecordIndex")
    private int e;

    @SerializedName("planStartTime")
    private long f;

    @SerializedName("longVideoUrl")
    private String g;

    @SerializedName("longVideoProperty")
    private int h;

    @SerializedName("isPlanFit")
    private boolean i;

    @SerializedName("isShowButton")
    private boolean j;

    @SerializedName("trackType")
    private int k;

    @SerializedName("topicName")
    private String l;

    @SerializedName("record")
    private WorkoutRecord m;

    @SerializedName(ParsedFieldTag.KAKA_CHECKED_IN_RECORDES)
    private ArrayList<WorkoutRecord> n;

    @SerializedName("workoutPackageId")
    private String o;

    public boolean l() {
        return this.j;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public int o() {
        return this.k;
    }

    public void b(int i) {
        this.k = i;
    }

    public long i() {
        return this.f;
    }

    public void e(long j) {
        this.f = j;
    }

    public WorkoutRecord j() {
        return this.m;
    }

    public void e(WorkoutRecord workoutRecord) {
        this.m = workoutRecord;
    }

    public boolean k() {
        return this.i;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public CoachData e() {
        return this.d;
    }

    public void c(CoachData coachData) {
        this.d = coachData;
    }

    public FitWorkout b() {
        return this.f36900c;
    }

    public void e(FitWorkout fitWorkout) {
        this.f36900c = fitWorkout;
    }

    public String g() {
        return this.g;
    }

    public void e(String str) {
        this.g = str;
    }

    public int f() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public ArrayList<WorkoutRecord> h() {
        return this.n;
    }

    public void e(ArrayList<WorkoutRecord> arrayList) {
        this.n = arrayList;
    }

    public int d() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public String n() {
        return this.l;
    }

    public void c(String str) {
        this.l = str;
    }

    public String c() {
        return this.f36899b;
    }

    public void d(String str) {
        this.f36899b = str;
    }

    public String m() {
        return this.o;
    }

    public void a(String str) {
        this.o = str;
    }

    public int a() {
        return this.f36898a;
    }

    public void a(int i) {
        this.f36898a = i;
    }
}
