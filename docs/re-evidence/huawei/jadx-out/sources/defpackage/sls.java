package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes17.dex */
public class sls implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("operType")
    private int f48331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(WorkoutRecord.Extend.FIT_EXTEND_COURSE_TYPE)
    private int f48332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int f48333c;

    @SerializedName("endTime")
    private long d;

    @SerializedName("pageNo")
    private int e;

    @SerializedName("startTime")
    private long f;

    public void c(int i) {
        this.e = i;
    }

    public void e(int i) {
        this.f48333c = i;
    }

    public void d(int i) {
        this.f48331a = i;
    }

    public void a(int i) {
        this.f48332b = i;
    }

    public void e(long j) {
        this.f = j;
    }

    public void d(long j) {
        this.d = j;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/v3/getBehaviorList";
    }
}
