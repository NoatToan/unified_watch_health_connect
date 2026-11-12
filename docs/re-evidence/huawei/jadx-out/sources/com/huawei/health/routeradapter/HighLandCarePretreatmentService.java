package com.huawei.health.routeradapter;

import android.content.Context;
import android.content.Intent;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity;
import defpackage.iov;

/* JADX INFO: loaded from: classes2.dex */
public class HighLandCarePretreatmentService implements PretreatmentService {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        d(context);
        return false;
    }

    private void d(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, HighLandBloodOxygenSettingActivity.class);
        intent.putExtra("device_id", 60);
        iov.d(context, intent);
    }
}
