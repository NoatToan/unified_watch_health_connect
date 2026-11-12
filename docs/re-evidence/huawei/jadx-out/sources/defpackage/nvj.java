package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.info.EnterpriseResponseInfo;
import com.huawei.hwversionmgr.utils.callback.EnterpriseResultCallback;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes11.dex */
public class nvj {
    private static volatile nvj d;
    private static final byte[] e = new byte[1];

    public static nvj c() {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new nvj();
                }
            }
        }
        return d;
    }

    public void a(final DeviceInfo deviceInfo, final EnterpriseResultCallback enterpriseResultCallback) {
        if (Utils.o()) {
            c(deviceInfo, enterpriseResultCallback);
        } else {
            nut.b(0, eeq.d(deviceInfo.getUuid()), new ResultCallback<EnterpriseResponseInfo>() { // from class: nvj.4
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(EnterpriseResponseInfo enterpriseResponseInfo) {
                    LogUtil.a("EnterpriseUpdateUtil", "queryCustomizedDetail Enterprise isEmpty:", Boolean.valueOf(TextUtils.isEmpty(enterpriseResponseInfo.getEnterprise())));
                    if (TextUtils.isEmpty(enterpriseResponseInfo.getEnterprise())) {
                        nvj.this.c(deviceInfo, enterpriseResultCallback);
                        return;
                    }
                    EnterpriseResultCallback enterpriseResultCallback2 = enterpriseResultCallback;
                    if (enterpriseResultCallback2 != null) {
                        enterpriseResultCallback2.onSuccess(enterpriseResponseInfo);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("EnterpriseUpdateUtil", "queryCustomizedDetail queryRouteDetail onFailure:", th.getMessage());
                    nvj.this.c(deviceInfo, enterpriseResultCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo, final EnterpriseResultCallback enterpriseResultCallback) {
        nut.c(0, eeq.d(deviceInfo.getUuid()), new ResultCallback<nug>() { // from class: nvj.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(nug nugVar) {
                LogUtil.a("EnterpriseUpdateUtil", "queryHealthKitCustomizedDetail response: ", nugVar);
                EnterpriseResponseInfo enterpriseResponseInfo = new EnterpriseResponseInfo();
                nug.e eVarC = nugVar.c();
                if (eVarC != null && eVarC.c()) {
                    enterpriseResponseInfo.setEnterprise(eVarC.e());
                    enterpriseResponseInfo.setExpiredTime(String.valueOf(System.currentTimeMillis()));
                }
                EnterpriseResultCallback enterpriseResultCallback2 = enterpriseResultCallback;
                if (enterpriseResultCallback2 != null) {
                    enterpriseResultCallback2.onSuccess(enterpriseResponseInfo);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("EnterpriseUpdateUtil", "queryHealthKitCustomizedDetail  onFailure:", th.getMessage());
                EnterpriseResultCallback enterpriseResultCallback2 = enterpriseResultCallback;
                if (enterpriseResultCallback2 != null) {
                    enterpriseResultCallback2.onFailure(th);
                }
            }
        });
    }
}
