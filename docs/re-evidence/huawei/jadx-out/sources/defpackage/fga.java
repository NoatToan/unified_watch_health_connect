package defpackage;

import android.content.Context;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fga f34014a;
    private static List<IExecuteResult> e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f34015b;
    private HealthOpenSDK d;

    private fga(Context context) {
        this.f34015b = context.getApplicationContext();
    }

    public static fga d(Context context) {
        if (f34014a == null) {
            f34014a = new fga(context.getApplicationContext());
        }
        return f34014a;
    }

    public void d() {
        if (this.d == null) {
            CommonUtil.d("TimeEat_HealthOpenSDKUtil", "Enter initHealthOpenSDK");
            HealthOpenSDK healthOpenSDK = new HealthOpenSDK();
            this.d = healthOpenSDK;
            healthOpenSDK.initSDK(this.f34015b, new b(), "HuaweiHealth");
            CommonUtil.d("TimeEat_HealthOpenSDKUtil", "Leave initHealthOpenSDK");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static class b implements IExecuteResult {
        private b() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            ObserverManagerUtil.e(ObserveLabels.OPEN_SDK_CONNECT_SUCCESS, new Object[0]);
            ReleaseLogUtil.d("TimeEat_HealthOpenSDKUtil", "healthOpenSDKCallback initSDK success");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            LogUtil.a("TimeEat_HealthOpenSDKUtil", "healthOpenSDKCallback : initSDK Failed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            LogUtil.a("TimeEat_HealthOpenSDKUtil", "healthOpenSDKCallback : onServiceException");
            if (fga.e == null || fga.e.size() <= 0) {
                return;
            }
            for (IExecuteResult iExecuteResult : fga.e) {
                if (iExecuteResult != null) {
                    iExecuteResult.onServiceException(obj);
                }
            }
        }
    }

    public HealthOpenSDK e() {
        LogUtil.a("Track_HealthOpenSDKUtil", "getHealthOpenSDK");
        HealthOpenSDK healthOpenSDK = this.d;
        if (healthOpenSDK != null) {
            return healthOpenSDK;
        }
        LogUtil.a("Track_HealthOpenSDKUtil", "mHealthOpenSDK no init success,init again");
        d();
        return this.d;
    }

    public void d(IExecuteResult iExecuteResult) {
        if (iExecuteResult == null) {
            LogUtil.j("Track_HealthOpenSDKUtil", "addExceptionListener listener is null");
            return;
        }
        List<IExecuteResult> list = e;
        if (list == null || list.contains(iExecuteResult)) {
            return;
        }
        e.add(iExecuteResult);
    }

    public void b(IExecuteResult iExecuteResult) {
        List<IExecuteResult> list = e;
        if (list == null || !list.contains(iExecuteResult)) {
            return;
        }
        e.remove(iExecuteResult);
    }

    public static void e(boolean z) {
        LogUtil.a("Track_HealthOpenSDKUtil", "setNeedNoteRelogin:", Boolean.valueOf(z));
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(b()), "need_relogin", String.valueOf(z), null);
    }

    public static Integer b() {
        return 1007;
    }
}
