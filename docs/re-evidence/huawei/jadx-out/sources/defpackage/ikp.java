package defpackage;

import com.huawei.health.threeCircle.remind.model.ThreeCircleRemindData;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class ikp implements ResponseCallback<ThreeCircleRemindData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResponseCallback<ThreeCircleRemindData> f37747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ikr f37748c;
    private boolean d;

    public ikp(ikr ikrVar, String str, boolean z, ResponseCallback<ThreeCircleRemindData> responseCallback) {
        this.f37748c = ikrVar;
        this.f37746a = str;
        this.d = z;
        this.f37747b = responseCallback;
    }

    public ikp(ikr ikrVar, String str, ResponseCallback<ThreeCircleRemindData> responseCallback) {
        this.f37748c = ikrVar;
        this.f37746a = str;
        this.d = false;
        this.f37747b = responseCallback;
    }

    public boolean a() {
        return this.d;
    }

    @Override // com.huawei.hwbasemgr.ResponseCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onResponse(int i, ThreeCircleRemindData threeCircleRemindData) {
        LogUtil.a("RemindDataCallback", "onResponse:", Integer.valueOf(i), "remindType:", this.f37746a);
        if (threeCircleRemindData == null) {
            LogUtil.j("RemindDataCallback", "onResponse data == null");
            return;
        }
        if (this.f37748c == null || this.f37747b == null) {
            LogUtil.e("RemindDataCallback", "onResponse: mRemindDataQueue == null or mResponseCallback == null");
            return;
        }
        ReleaseLogUtil.d("R_RemindDataCallback", "remindType:", this.f37746a, " data:", threeCircleRemindData.getRemindText(), " ", threeCircleRemindData.getRemindType(), " isFromDevice:", Boolean.valueOf(this.d));
        if (this.d) {
            this.f37747b.onResponse(0, threeCircleRemindData);
            return;
        }
        this.f37746a = threeCircleRemindData.getRemindType();
        this.f37748c.d(threeCircleRemindData);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("R_RemindDataCallback", "sleep error.", LogAnonymous.b(e));
        }
        c(threeCircleRemindData);
    }

    private void c(ThreeCircleRemindData threeCircleRemindData) {
        ThreeCircleRemindData threeCircleRemindDataD = this.f37748c.d();
        if (threeCircleRemindDataD == null) {
            ReleaseLogUtil.a("R_RemindDataCallback", "remindData == null.");
            this.f37747b.onResponse(-1, null);
            return;
        }
        String str = this.f37746a;
        if (str == null || str.equals(threeCircleRemindDataD.getRemindType())) {
            this.f37747b.onResponse(0, threeCircleRemindDataD);
            this.f37748c.e();
        } else {
            int priority = threeCircleRemindData.getPriority();
            ReleaseLogUtil.e("R_RemindDataCallback", "priority too low, has other remind.no need response.", Integer.valueOf(priority), threeCircleRemindData.getRemindType());
        }
    }
}
