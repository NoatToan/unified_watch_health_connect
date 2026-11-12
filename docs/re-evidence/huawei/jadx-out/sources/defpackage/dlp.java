package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.operation.utils.TodoTaskInterface;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;

/* JADX INFO: loaded from: classes7.dex */
public class dlp implements TodoTaskInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activityLink")
    private String f31972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("activityName")
    private String f31973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("activityContext")
    private String f31974c;

    @SerializedName("activityId")
    private String d;

    @SerializedName("imgUrl")
    private String e;

    @SerializedName(SyncDataConstant.BI_KEY_ACTIVITY_TYPE)
    private int f;

    @SerializedName("activityPosition")
    private int g;

    @SerializedName("activityStatus")
    private int i;

    @SerializedName("activityTargetTodo")
    private int j;

    @SerializedName("haveHistoryTodo")
    private int k;

    @SerializedName("completeFlagTodo")
    private int l;

    @SerializedName("numberOfPeople")
    private String m;

    @SerializedName("endDate")
    private String n;

    @SerializedName("continuityTodo")
    private int o;

    @SerializedName(CommonUtil.IMAGE_TEXT_SEPARATE_SWITCH)
    private int p;

    @SerializedName("timeZone")
    private String r;

    @SerializedName(CommonUtil.PAGE_TYPE)
    private String s;

    @SerializedName("matchBeginDate")
    private String t;

    @SerializedName("templateType")
    private int u;

    @SerializedName("targetDaysTodo")
    private int v;

    @SerializedName(ParsedFieldTag.BEGIN_DATE)
    private String w;

    @SerializedName("rotinePosition")
    private int x;

    @SerializedName("teamFlag")
    private int y;

    @SerializedName("appVersion")
    private String h = "";

    @SerializedName("workoutUserLable")
    private String q = "";

    @Override // com.huawei.operation.utils.TodoTaskInterface
    public int getIconId() {
        return 0;
    }

    public String w() {
        return this.q;
    }

    public void m(String str) {
        this.q = str;
    }

    public String y() {
        return this.s;
    }

    public void n(String str) {
        this.s = str;
    }

    public String v() {
        return this.r;
    }

    public void k(String str) {
        this.r = str;
    }

    public String d() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public String c() {
        return this.f31973b;
    }

    public void a(String str) {
        this.f31973b = str;
    }

    public String b() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public String s() {
        return this.w;
    }

    public void f(String str) {
        this.w = str;
    }

    public String o() {
        return this.n;
    }

    public void h(String str) {
        this.n = str;
    }

    public String l() {
        return this.m;
    }

    public void i(String str) {
        this.m = str;
    }

    public int i() {
        return this.i;
    }

    public void b(int i) {
        this.i = i;
    }

    public int h() {
        return this.f;
    }

    public void d(int i) {
        this.f = i;
    }

    public int q() {
        return this.u;
    }

    public void i(int i) {
        this.u = i;
    }

    public String e() {
        return this.f31972a;
    }

    public void b(String str) {
        this.f31972a = str;
    }

    public int p() {
        return this.x;
    }

    public void h(int i) {
        this.x = i;
    }

    public int j() {
        return this.g;
    }

    public void c(int i) {
        this.g = i;
    }

    public String r() {
        return this.t;
    }

    public void j(String str) {
        this.t = str;
    }

    public String a() {
        return this.f31974c;
    }

    public void d(String str) {
        this.f31974c = str;
    }

    public int n() {
        return this.k;
    }

    public void g(int i) {
        this.k = i;
    }

    public int g() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }

    public int k() {
        return this.o;
    }

    public void j(int i) {
        this.o = i;
    }

    public int t() {
        return this.v;
    }

    public void f(int i) {
        this.v = i;
    }

    public int m() {
        return this.l;
    }

    public void e(int i) {
        this.l = i;
    }

    public String f() {
        return this.h;
    }

    public void g(String str) {
        this.h = str;
    }

    public void k(int i) {
        this.p = i;
    }

    public int u() {
        return this.p;
    }

    public int x() {
        return this.y;
    }

    public void l(int i) {
        this.y = i;
    }

    public boolean aa() {
        return this.y == 1;
    }

    public String toString() {
        return "OperationObject{activityId='" + this.d + "', activityName='" + this.f31973b + "', activityImgUrl='" + this.e + "', startDate='" + this.w + "', endDate='" + this.n + "', mTimeZone='" + this.r + "', joinNum='" + this.m + "', activityStatus=" + this.i + ", activityType=" + this.f + ", teamFlag=" + this.y + ", matchBeginDate='" + this.t + "', activityContext='" + this.f31974c + "', haveHistoryTodo=" + this.k + ", activityTargetTodo=" + this.j + ", continuityTodo=" + this.o + ", targetDaysTodo=" + this.v + ", completeFlagTodo=" + this.l + ", templateType=" + this.u + ", activityLink='" + this.f31972a + "', rotinePosition=" + this.x + ", activityPosition=" + this.g + ", mPageType=" + this.s + ", mWorkoutUserLable=" + this.q + '}';
    }

    @Override // com.huawei.operation.utils.TodoTaskInterface
    public String getProgress() {
        return "";
    }
}
