package com.huawei.health.ui.notification.uihandlers;

import android.content.Context;
import android.os.Bundle;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.provider.HealthOpenProvider;
import com.huawei.health.ui.notification.common.IReporter;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.etr;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.StepsRecord;

/* JADX INFO: loaded from: classes2.dex */
public class HealthFaHelper extends IReporter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f10317c;
    private StepsRecord e = new StepsRecord();

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void languageChanged() {
    }

    public HealthFaHelper(Context context) {
        if (context != null) {
            this.f10317c = context.getApplicationContext();
        } else {
            this.f10317c = BaseApplication.b();
        }
        ReleaseLogUtil.c("Step_HealthFaHelper", "HealthFaHelper create");
        etr.d().f();
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStart(Bundle bundle) {
        LogUtil.j("Step_HealthFaHelper", "onStart");
        super.onStart(bundle);
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStop() {
        LogUtil.j("Step_HealthFaHelper", "onStop");
        super.onStop();
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void refresh(final StepsRecord stepsRecord) {
        if (stepsRecord == null || this.f10317c == null) {
            LogUtil.j("Step_HealthFaHelper", "record == null || mContext == null");
            return;
        }
        if (stepsRecord.equals(this.e)) {
            return;
        }
        this.e.a(stepsRecord);
        etr.d().b(stepsRecord, false);
        if (etr.d().a()) {
            return;
        }
        ThreadPoolManager.c().b("Step_HealthFaHelper", new Runnable() { // from class: com.huawei.health.ui.notification.uihandlers.HealthFaHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!etr.d().e()) {
                    ReleaseLogUtil.d("Step_HealthFaHelper", "uri is invalid ");
                } else if (HealthOpenProvider.e()) {
                    etr.d().d(stepsRecord);
                }
            }
        });
    }
}
