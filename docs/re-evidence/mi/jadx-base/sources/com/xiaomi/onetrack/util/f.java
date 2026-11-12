package com.xiaomi.onetrack.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;

/* JADX INFO: loaded from: classes11.dex */
class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f13927a;

    public f(d dVar) {
        this.f13927a = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(com.xiaomi.onetrack.api.b.E);
            String stringExtra2 = intent.getStringExtra("packagename");
            String stringExtra3 = intent.getStringExtra(CloudContract.COL_PROJECT_ID);
            String stringExtra4 = intent.getStringExtra(SceneRecogBroadcastReceiver.FROM_USER);
            boolean booleanExtra = intent.getBooleanExtra("logon", false);
            boolean booleanExtra2 = intent.getBooleanExtra("quickuploadon", false);
            String strE = com.xiaomi.onetrack.f.a.e();
            if (!TextUtils.isEmpty(stringExtra2) && !"".equals(stringExtra2) && strE.equals(stringExtra2)) {
                p.f13986a = booleanExtra;
                p.f13987b = booleanExtra2;
                if (booleanExtra2 && this.f13927a.a(stringExtra)) {
                    this.f13927a.a(stringExtra, stringExtra3, stringExtra4);
                }
            }
        } catch (Exception e) {
            p.b(d.f13923a, e.getMessage());
        }
    }
}
