package defpackage;

import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nfh {
    public static void e() {
        String strE = ffv.e("healthInsightsState", ipc.c() ? "1" : "0");
        ReleaseLogUtil.d("DEVMGR_HealthInsightsUtil", "json:", strE);
        qhq.d(MatterDataContans.TYPE_HEALTH, "900300079", strE, new HiDataOperateListener() { // from class: nfg
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HealthInsightsUtil", "setSampleConfig code: ", Integer.valueOf(i), ", object: ", obj);
            }
        }, System.currentTimeMillis());
    }
}
