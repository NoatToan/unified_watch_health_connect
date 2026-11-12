package defpackage;

import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.interfaces.ServiceApiCallback;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateActivity;
import com.huawei.ui.main.stories.health.pressure.provider.PressureEntryProvider;

/* JADX INFO: loaded from: classes43.dex */
public class uyh extends JsBaseModule {
    @JavascriptInterface
    public void jumpToPressureCalibration(final long j) {
        LogUtil.a("PressureNewJsApi", "jumpToPressureCalibration");
        PressureEntryProvider.c(this.mContext, new IBaseResponseCallback() { // from class: uyj
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.c(j, i, obj);
            }
        }, new ServiceApiCallback<String>() { // from class: uyh.1
            @Override // com.huawei.operation.h5pro.jsmodules.interfaces.ServiceApiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                uyh.this.onSuccessCallback(j, str);
            }

            @Override // com.huawei.operation.h5pro.jsmodules.interfaces.ServiceApiCallback
            public void onFailure(int i, String str) {
                uyh.this.onFailureCallback(j, str);
            }
        });
    }

    /* synthetic */ void c(long j, int i, Object obj) {
        Intent intent = new Intent(this.mContext, (Class<?>) PressureCalibrateActivity.class);
        intent.putExtra("from_health_record", true);
        iov.d(this.mContext, intent);
        onSuccessCallback(j);
    }
}
