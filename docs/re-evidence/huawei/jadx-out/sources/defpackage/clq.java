package defpackage;

import com.huawei.devicesdk.connect.retry.ExecuteActionInterface;
import com.huawei.devicesdk.connect.retry.RetryCallbackInterface;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class clq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1745b = 0;
    private int e;

    public clq(int i) {
        this.e = Math.max(i, 0);
    }

    public void c(ExecuteActionInterface executeActionInterface, RetryCallbackInterface retryCallbackInterface, boolean z) {
        if (executeActionInterface == null || retryCallbackInterface == null) {
            LogUtil.d("ActionRetryExecutor", "action or retryCallback is null");
        } else if (z) {
            b(executeActionInterface, retryCallbackInterface);
        } else {
            e(executeActionInterface, retryCallbackInterface);
        }
    }

    private void b(ExecuteActionInterface executeActionInterface, RetryCallbackInterface retryCallbackInterface) {
        String actionName = executeActionInterface.getActionName();
        if (this.f1745b <= this.e) {
            e(executeActionInterface, retryCallbackInterface, actionName);
            return;
        }
        LogUtil.d("ActionRetryExecutor", "action  ", actionName, " execute failed.");
        d();
        retryCallbackInterface.doFailureAction();
    }

    private void e(ExecuteActionInterface executeActionInterface, RetryCallbackInterface retryCallbackInterface) {
        String actionName = executeActionInterface.getActionName();
        while (this.f1745b <= this.e) {
            if (e(executeActionInterface, retryCallbackInterface, actionName)) {
                return;
            }
        }
        LogUtil.d("ActionRetryExecutor", "action  ", actionName, " execute failed.");
        d();
        retryCallbackInterface.doFailureAction();
    }

    private boolean e(ExecuteActionInterface executeActionInterface, RetryCallbackInterface retryCallbackInterface, String str) {
        if (!executeActionInterface.execute()) {
            LogUtil.e("ActionRetryExecutor", "action ", str, " execute failed. start to retry. currentRetry:", Integer.valueOf(this.f1745b));
            retryCallbackInterface.doRetryAction(this.f1745b);
            this.f1745b++;
            return false;
        }
        d();
        LogUtil.b("ActionRetryExecutor", "action ", str, " execute success.");
        retryCallbackInterface.doSuccessAction();
        return true;
    }

    public void d() {
        this.f1745b = 0;
    }
}
