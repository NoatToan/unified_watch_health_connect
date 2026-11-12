package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.nfc.PluginPay;
import com.huawei.wear.healthadapter.HealthAdapter;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class rgc extends ecw implements HealthAdapter {
    private static volatile rgc d;
    private static final Object e = new Object();

    private rgc() {
    }

    public static rgc b() {
        rgc rgcVar;
        synchronized (e) {
            if (d == null) {
                d = new rgc();
            }
            ReleaseLogUtil.d("R_HealthAdapterImpl", "getInstance");
            rgcVar = d;
        }
        return rgcVar;
    }

    @Override // defpackage.ecw, com.huawei.wear.healthadapter.HealthAdapter
    public void launchActivity(Context context, Intent intent) {
        ReleaseLogUtil.d("R_HealthAdapterImpl", "launchActivity enter");
        PluginPay.getInstance(context).setAdapter(lkw.t());
        ddy.e().initHealthPayAdapter(BaseApplication.getContext());
        ddy.e().launchActivity(context, intent);
    }
}
