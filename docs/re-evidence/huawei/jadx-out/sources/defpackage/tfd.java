package defpackage;

import android.os.Bundle;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class tfd implements IExecuteResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<Integer> f49051c;
    WeakReference<sho> d;
    String e;

    public tfd(sho shoVar, List<Integer> list, String str) {
        this.d = new WeakReference<>(shoVar);
        this.f49051c = list;
        this.e = str;
    }

    @Override // com.huawei.hihealth.motion.IExecuteResult
    public void onSuccess(Object obj) {
        List<Integer> list;
        LogUtil.a("HealthOpenSdkKeepAliveCallback", "isNeedPromptKeepAlive onSuccess");
        WeakReference<sho> weakReference = this.d;
        if (weakReference == null || this.f49051c == null) {
            LogUtil.j("HealthOpenSdkKeepAliveCallback", "mWeakRef == null || mTipsListRef == null");
            return;
        }
        sho shoVar = weakReference.get();
        if (shoVar == null || (list = this.f49051c) == null) {
            LogUtil.j("HealthOpenSdkKeepAliveCallback", "cardData == null || tipsList == null");
            return;
        }
        if (list.contains(2)) {
            ReleaseLogUtil.d("R_HealthOpenSdkKeepAliveCallback", "isNeedPromptKeepAlive onSuccess");
            return;
        }
        if (obj instanceof Bundle) {
            boolean z = ((Bundle) obj).getBoolean("isNeedPromptKeepAlive", false);
            ReleaseLogUtil.d("R_HealthOpenSdkKeepAliveCallback", "isNeedPromptKeepAlive:", Boolean.valueOf(z), "source", this.e);
            if (z) {
                ipb.a(this.e);
                shoVar.d(2);
                ReleaseLogUtil.d("HealthOpenSdkKeepAliveCallback", "add keep alive tips");
            }
        }
    }

    @Override // com.huawei.hihealth.motion.IExecuteResult
    public void onFailed(Object obj) {
        LogUtil.j("HealthOpenSdkKeepAliveCallback", "isNeedPromptKeepAlive onFailed");
    }

    @Override // com.huawei.hihealth.motion.IExecuteResult
    public void onServiceException(Object obj) {
        LogUtil.j("HealthOpenSdkKeepAliveCallback", "isNeedPromptKeepAlive onServiceException");
    }
}
