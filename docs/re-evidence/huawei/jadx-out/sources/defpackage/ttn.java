package defpackage;

import androidx.media3.common.C;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ttn {
    public static ttr e() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ttu ttuVar = new ttu();
        ttuVar.a(0);
        ttuVar.c(1);
        ttuVar.e(1);
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());
        String strC = ofe.c(healthDataCloudFactory.getBody(ttuVar));
        LogUtil.a("SCUI_ThreeCircleTaskCloudHelper", "queryTask body ", strC);
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("achievementUrl");
        ttr ttrVar = (ttr) oet.d().e(url + "/achievement/queryTaskInfo", healthDataCloudFactory.getHeaders(), strC, ttr.class);
        countDownLatch.countDown();
        LogUtil.a("SCUI_ThreeCircleTaskCloudHelper", "queryTask response", ttrVar);
        try {
            if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                LogUtil.j("SCUI_ThreeCircleTaskCloudHelper", "queryTask wait timeout with 3s");
                return ttrVar;
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("SCUI_ThreeCircleTaskCloudHelper", "interrupted while waiting for requestData");
        }
        return ttrVar;
    }

    public static void e(ResultCallback<ttm> resultCallback, String str) {
        ttu ttuVar = new ttu();
        ttuVar.a(str);
        c(ttuVar, "/achievement/subscribeTask", ttm.class, resultCallback);
    }

    public static void d(ResultCallback<ttm> resultCallback, ttr ttrVar) {
        tto ttoVar = new tto();
        ttoVar.a(ttrVar.b());
        ttoVar.d(ttrVar.i());
        c(ttoVar, "/achievement/acquirePoints", ttm.class, resultCallback);
    }

    public static void d(ResultCallback<tth> resultCallback) {
        c(new ttq(), "/achievement/queryPointsNewAdd", tth.class, resultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void c(final ttq ttqVar, final String str, final Class<T> cls, final ResultCallback<T> resultCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ttv
                @Override // java.lang.Runnable
                public final void run() {
                    ttn.c(ttqVar, str, cls, resultCallback);
                }
            });
            return;
        }
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());
        String strC = ofe.c(healthDataCloudFactory.getBody(ttqVar));
        LogUtil.a("SCUI_ThreeCircleTaskCloudHelper", "url: ", str, "callHttpPostCommon body ", strC);
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("achievementUrl");
        oet.d().c(url + str, healthDataCloudFactory.getHeaders(), strC, cls, resultCallback);
    }
}
