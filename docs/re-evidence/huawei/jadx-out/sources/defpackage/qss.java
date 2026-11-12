package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("abnormalStepTipsPeriod")
    private int f46767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("abnormalContinuousDay")
    private int f46768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("abnormalStepSupportType")
    private String f46769c;

    @SerializedName("afterProcessSwitch")
    private int d;

    @SerializedName("courseDetailStyle")
    private int e;

    @SerializedName("recipeSwitchNew")
    private int f;

    @SerializedName("sleepManagementDefaultSupportDeviceType")
    private String g;

    @SerializedName("healthLifeSwitchNew")
    private int h;

    @SerializedName("disableUpdateHealthLifeModel")
    private List<String> i;

    @SerializedName("sleepManagementReleaseSupportDeviceType")
    private String j;

    @SerializedName("sleepManagementSupportVersions")
    private List<String> k;

    @SerializedName("supportShowStepTipDeviceList")
    private List<String> l;

    @SerializedName("rollbackHealthLifeModel")
    private List<String> n;

    public int a() {
        return this.e;
    }

    public int d() {
        return this.d;
    }

    public int b() {
        return this.f46767a;
    }

    public int c() {
        return this.f46768b;
    }

    public String e() {
        return this.f46769c;
    }

    public List<String> j() {
        return this.l;
    }

    public List<String> g() {
        return this.n;
    }

    public int f() {
        return this.h;
    }

    public int i() {
        return this.f;
    }

    public String toString() {
        return "TemporaryConfigContent{mSupportVersions=" + this.k + ", mReleaseSupportDeviceType='" + this.j + ", mDefaultSupportDeviceType='" + this.g + ", mCourseDetailStyle=" + this.e + ", mAfterProcessSwitch=" + this.d + ", mAbnormalStepSupportType='" + this.f46769c + ", mAbnormalStepTipsPeriod=" + this.f46767a + ", mAbnormalContinuousDay=" + this.f46768b + ", mSupportShowStepTipDeviceList=" + this.l + ", mDisableUpdateHealthLifeModel=" + this.i + ", mRollbackHealthLifeModel=" + this.n + ", mHealthLifeSwitch=" + this.h + '}';
    }
}
