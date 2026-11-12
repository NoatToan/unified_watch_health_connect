package com.huawei.health.ecologydevice.ecologydevicediscoveryfreeservice;

import android.content.Context;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class EcologyDeviceDiscoveryFreePretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        LogUtil.a("EcologyDeviceDiscoveryFreePretreatmentService", "enter EcologyDeviceDiscoveryFreePretreatmentService pretreatment");
        ThreadPoolManager.c().execute(new Runnable() { // from class: egi
            @Override // java.lang.Runnable
            public final void run() {
                egh.d().e();
            }
        });
        return false;
    }
}
