package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.api.HwEarPairApi;
import com.huawei.health.device.callback.EarphoneInfoCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.syncmgr.periodrri.PeriodRriSyncApi;

/* JADX INFO: loaded from: classes38.dex */
@ApiDefine(uri = PeriodRriSyncApi.class)
public class lwy implements HwEarPairApi {
    @Override // com.huawei.health.device.api.HwEarPairApi
    public void getEarphoneInfoFromCache(DeviceInfo deviceInfo, final EarphoneInfoCallback earphoneInfoCallback) {
        lxb.c().e(deviceInfo, new EarPhoneResponseCallback() { // from class: lwu
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public final void onResponse(int i, edj edjVar) {
                lwy.e(earphoneInfoCallback, i, edjVar);
            }
        });
    }

    static /* synthetic */ void e(EarphoneInfoCallback earphoneInfoCallback, int i, edj edjVar) {
        if (edjVar == null || TextUtils.isEmpty(edjVar.d())) {
            earphoneInfoCallback.onResponse(true, edjVar);
            return;
        }
        boolean zB = lxb.c().b(edjVar.d());
        LogUtil.a("HwEarPairApiImpl", "getEarPhoneInfoFromCached pairState:", Boolean.valueOf(zB));
        if (!zB) {
            earphoneInfoCallback.onResponse(true, edjVar);
        } else {
            earphoneInfoCallback.onResponse(false, edjVar);
        }
    }
}
