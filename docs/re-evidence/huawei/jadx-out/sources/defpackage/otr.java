package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class otr implements AchieveObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f44720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f44722c;
    private Object d;
    private CountDownLatch e = new CountDownLatch(1);

    otr(Context context, int i) {
        this.f44722c = context;
        this.f44721b = i;
    }

    public void a(int[] iArr) {
        if (iArr != null) {
            this.f44720a = (int[]) iArr.clone();
        }
    }

    boolean d(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.e.await(j, timeUnit);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Override // com.huawei.pluginachievement.impl.AchieveObserver
    public void onDataChanged(int i, UserAchieveWrapper userAchieveWrapper) {
        if (userAchieveWrapper == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaObserver", "AchieveKakaObserver wrapper is null");
            return;
        }
        int contentType = userAchieveWrapper.getContentType();
        if (contentType != this.f44721b) {
            LogUtil.j("PLGACHIEVE_AchieveKakaObserver", "AchieveKakaObserver do not need process result");
            return;
        }
        if (i == -1) {
            LogUtil.j("PLGACHIEVE_AchieveKakaObserver", "HttpErrCode or userAchieveWrapper is error");
            this.e.countDown();
            otl.b(BaseApplication.getContext()).d(this);
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveKakaObserver", "AchieveKakaObserver|onDataChanged contentType = ", Integer.valueOf(contentType));
        if (contentType == 11) {
            this.d = pap.e(this.f44720a, userAchieveWrapper.getHealthLifeKakaTaskInfoList());
        } else if (contentType == 12) {
            this.d = userAchieveWrapper.acquireKakaUpdateReturnBody();
            b(contentType, userAchieveWrapper.acquireKakaUpdateReturnBody());
        } else if (contentType == 17) {
            this.d = userAchieveWrapper.getHealthLifeKakaTaskInfoList();
        } else if (contentType == 18) {
            this.d = userAchieveWrapper.acquireKakaUpdateReturnBody();
            b(contentType, userAchieveWrapper.acquireKakaUpdateReturnBody());
        }
        this.e.countDown();
        otl.b(BaseApplication.getContext()).d(this);
    }

    public Object a() {
        return this.d;
    }

    private void b(int i, osd osdVar) {
        if (osdVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveKakaObserver", "updateTaskInfoToDb kakaUpdateReturnBody is null");
            return;
        }
        String strC = osdVar.c();
        int iD = osdVar.d();
        LogUtil.a("PLGACHIEVE_AchieveKakaObserver", "updateTaskInfoToDb UPDATE_TASK_STATUS RewardKaka=", Integer.valueOf(iD));
        if (iD > 0) {
            int iB = osdVar.b();
            LogUtil.d("PLGACHIEVE_AchieveKakaObserver", "onDataChange UPDATE_TASK_STATUS taskIdTemp =", strC);
            otu.b(this.f44722c.getApplicationContext()).b(iB);
            LogUtil.a("PLGACHIEVE_AchieveKakaObserver", "updateTaskInfoToDb getResultCode =", osdVar.e());
            if (i == 12 && "0".equals(osdVar.e())) {
                LogUtil.a("PLGACHIEVE_AchieveKakaObserver", "onDataChange task picked ");
                otu.b(this.f44722c.getApplicationContext()).c(strC, 2);
            }
        }
    }
}
