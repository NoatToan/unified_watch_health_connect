package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes14.dex */
public class pcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("hasNextTrain")
    private boolean f45139a;

    @SerializedName("subtitleUrl")
    private String aa;

    @SerializedName("resourceName")
    private String ab;

    @SerializedName("resourceType")
    private String ac;

    @SerializedName(BleConstants.SPORT_TYPE)
    private int ad;

    @SerializedName("trackTargetValue")
    private float ae;

    @SerializedName("userDefinedType")
    private int af;

    @SerializedName("trackTarget")
    private int ag;

    @SerializedName("topicName")
    private String ah;

    @SerializedName("trackType")
    private int ai;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String aj;

    @SerializedName("workoutPackageId")
    private String ak;

    @SerializedName("weekNumber")
    private int am;

    @SerializedName("version")
    private String an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("algId")
    private String f45140b;

    @SerializedName("entrance")
    private String d;

    @SerializedName("abInfo")
    private String e;

    @SerializedName("isAfterRun")
    private boolean f;

    @SerializedName("entranceType")
    private String h;

    @SerializedName("isDeviceTraining")
    private boolean i;

    @SerializedName("isSendCourseDevice")
    private boolean k;

    @SerializedName("isNeedExecuteDown")
    private boolean l;

    @SerializedName("isFromScheme")
    private boolean m;

    @SerializedName("isImmediateStart")
    private boolean n;

    @SerializedName("isPlanFit")
    private boolean o;

    @SerializedName("planExecuteTime")
    private long p;

    @SerializedName("itemId")
    private String q;

    @SerializedName("moveTaskToBack")
    private boolean r;

    @SerializedName("longCoachUrl")
    private String s;

    @SerializedName("isShowButton")
    private boolean t;

    @SerializedName("pullFrom")
    private String u;

    @SerializedName("planId")
    private String v;

    @SerializedName("planTempId")
    private String w;

    @SerializedName("promoteTag")
    private String x;

    @SerializedName("pullOrder")
    private String y;

    @SerializedName("resourceID")
    private String z;

    @SerializedName("workoutOrder")
    private int al = 1;

    @SerializedName("executeImmediateErrorType")
    private int j = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("enterAnim")
    private int f45141c = -1;

    @SerializedName("exitAnim")
    private int g = -1;

    public pcd(String str) {
        this.aj = str;
    }

    public boolean af() {
        return this.m;
    }

    public void e(boolean z) {
        this.m = z;
    }

    public String ac() {
        return this.aj;
    }

    public void s(String str) {
        this.aj = str;
    }

    public String aa() {
        return this.an;
    }

    public void q(String str) {
        this.an = str;
    }

    public String e() {
        return this.h;
    }

    public void b(String str) {
        this.h = str;
    }

    public String c() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public String z() {
        return this.ak;
    }

    public void t(String str) {
        this.ak = str;
    }

    public String s() {
        return this.ac;
    }

    public String o() {
        return this.w;
    }

    public void i(String str) {
        this.w = str;
    }

    public String n() {
        return this.u;
    }

    public void h(String str) {
        this.u = str;
    }

    public String p() {
        return this.z;
    }

    public void o(String str) {
        this.z = str;
    }

    public String r() {
        return this.ab;
    }

    public void m(String str) {
        this.ab = str;
    }

    public String l() {
        return this.y;
    }

    public void k(String str) {
        this.y = str;
    }

    public String a() {
        return this.f45140b;
    }

    public void e(String str) {
        this.f45140b = str;
    }

    public String m() {
        return this.x;
    }

    public void f(String str) {
        this.x = str;
    }

    public String h() {
        return this.q;
    }

    public void c(String str) {
        this.q = str;
    }

    public String k() {
        return this.v;
    }

    public void g(String str) {
        this.v = str;
    }

    public String b() {
        return this.e;
    }

    public void d(String str) {
        this.e = str;
    }

    public int u() {
        return this.af;
    }

    public void i(int i) {
        this.af = i;
    }

    public boolean aj() {
        return this.k;
    }

    public void i(boolean z) {
        this.k = z;
    }

    public boolean an() {
        return this.r;
    }

    public void g(boolean z) {
        this.r = z;
    }

    public long f() {
        return this.p;
    }

    public void e(long j) {
        this.p = j;
    }

    public String j() {
        return this.s;
    }

    public void j(String str) {
        this.s = str;
    }

    public String t() {
        return this.aa;
    }

    public void l(String str) {
        this.aa = str;
    }

    public int ad() {
        return this.al;
    }

    public void g(int i) {
        this.al = i;
    }

    public int ab() {
        return this.am;
    }

    public void j(int i) {
        this.am = i;
    }

    public boolean al() {
        return this.o;
    }

    public void j(boolean z) {
        this.o = z;
    }

    public boolean ai() {
        return this.f;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public int g() {
        return this.j;
    }

    public void c(int i) {
        this.j = i;
    }

    public boolean am() {
        return this.l;
    }

    public void h(boolean z) {
        this.l = z;
    }

    public boolean ak() {
        return this.t;
    }

    public void f(boolean z) {
        this.t = z;
    }

    public int v() {
        return this.ai;
    }

    public void f(int i) {
        this.ai = i;
    }

    public int y() {
        return this.ag;
    }

    public void a(int i) {
        this.ag = i;
    }

    public float w() {
        return this.ae;
    }

    public void b(float f) {
        this.ae = f;
    }

    public boolean ah() {
        return this.n;
    }

    public void d(boolean z) {
        this.n = z;
    }

    public int d() {
        return this.f45141c;
    }

    public void b(int i) {
        this.f45141c = i;
    }

    public int i() {
        return this.g;
    }

    public void d(int i) {
        this.g = i;
    }

    public boolean ag() {
        return this.i;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public String x() {
        return this.ah;
    }

    public void n(String str) {
        this.ah = str;
    }

    public boolean ae() {
        return this.f45139a;
    }

    public void c(boolean z) {
        this.f45139a = z;
    }

    public int q() {
        return this.ad;
    }

    public void e(int i) {
        this.ad = i;
    }

    public String toString() {
        return "CourseJumpParameter{mIsFromScheme=" + this.m + ", mWorkoutId='" + this.aj + "', mVersion='" + this.an + "', mEntranceType='" + this.h + "', mEntrance='" + this.d + "', mWorkoutPackageId='" + this.ak + "', mResourceType='" + this.ac + "', mPlanTempId='" + this.w + "', mPullFrom='" + this.u + "', mResourceID='" + this.z + "', mResourceName='" + this.ab + "', mPullOrder='" + this.y + "', mAlgId='" + this.f45140b + "', mPromoteTag='" + this.x + "', mItemId='" + this.q + "', mPlanId='" + this.v + "', mAbInfo='" + this.e + "', mUserDefinedType=" + this.af + ", mIsSendCourseDevice=" + this.k + ", mMoveTaskToBack=" + this.r + ", mPlanExecuteTime=" + this.p + ", mLongCoachUrl='" + this.s + "', mSubtitleUrl='" + this.aa + "', mWorkoutOrder=" + this.al + ", mWeekNumber=" + this.am + ", mIsPlanFit=" + this.o + ", mIsAfterRun=" + this.f + ", mIsNeedExecuteDown=" + this.l + ", mExecuteImmediateErrorType=" + this.j + ", mIsShowButton=" + this.t + ", mTrackType=" + this.ai + ", mTrackTarget=" + this.ag + ", mTrackTargetValue=" + this.ae + ", mIsImmediateStart=" + this.n + ", mEnterAnim=" + this.f45141c + ", mExitAnim=" + this.g + ", mIsDeviceTraining=" + this.i + ", mTopicName='" + this.ah + "', hasNextTrain=" + this.f45139a + ", mSportType=" + this.ad + '}';
    }
}
