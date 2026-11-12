package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes19.dex */
public class vhx implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private Integer f51132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pageNum")
    private Integer f51133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endTime")
    private int f51134c;

    @SerializedName("includeOverview")
    private Integer d;

    @SerializedName("startTime")
    private int e;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl") + "/healthExpansion/calorieIntake/getDietaryIntake";
    }

    public int a() {
        return this.e;
    }

    public void d(int i) {
        this.e = i;
    }

    public int d() {
        return this.f51134c;
    }

    public void b(int i) {
        this.f51134c = i;
    }

    public void d(Integer num) {
        this.f51132a = num;
    }

    public void b(Integer num) {
        this.f51133b = num;
    }

    public String toString() {
        return "GetDietaryIntakeRequest{mStartTime=" + this.e + ", mEndTime=" + this.f51134c + ", mPageSize=" + this.f51132a + ", mPageNum=" + this.f51133b + ", mIncludeOverview" + this.d + '}';
    }

    public Integer b() {
        return this.d;
    }

    public void a(Integer num) {
        this.d = num;
    }

    public void a(vhx vhxVar) {
        this.e = vhxVar.e;
        this.f51134c = vhxVar.f51134c;
        this.d = vhxVar.d;
        this.f51133b = vhxVar.f51133b;
        this.f51132a = vhxVar.f51132a;
    }
}
