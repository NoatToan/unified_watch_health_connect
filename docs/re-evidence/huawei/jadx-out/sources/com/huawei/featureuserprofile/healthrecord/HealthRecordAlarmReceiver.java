package com.huawei.featureuserprofile.healthrecord;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.featureuserprofile.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.lsb;
import defpackage.qrs;
import defpackage.xjk;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class HealthRecordAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("HealthRecordAlarmReceiver", "Receive alarm broadcast-----------");
        if (intent == null) {
            LogUtil.j("HealthRecordAlarmReceiver", "onReceive intent == null");
            return;
        }
        int intExtra = intent.getIntExtra("physicalExaminationId", 0);
        String strC = StringUtils.c((Object) intent.getStringExtra(JsbMapKeyNames.H5_USER_ID));
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        LogUtil.d("HealthRecordAlarmReceiver", "onReceive userId= ", strC, " currentUserId = ", accountInfo);
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(accountInfo) || !strC.equals(accountInfo)) {
            return;
        }
        LogUtil.a("HealthRecordAlarmReceiver", "onReceive examinationId = ", Integer.valueOf(intExtra));
        if (xjk.d(intent)) {
            int iE = xjk.e(intent);
            long jC = xjk.c(intent);
            if (iE < 0) {
                xjk.d(intExtra, intent, 201326592);
                xjk.d(intExtra, intent, 201326592, 0, jC);
            }
            ReleaseLogUtil.c("HealthRecordAlarmReceiver", "onReceive offset ", Integer.valueOf(iE), " timeMillis ", Long.valueOf(jC));
            return;
        }
        c(context, intExtra);
    }

    private void c(Context context, int i) {
        lsb.d().e(i);
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        Resources resources = BaseApplication.getContext().getResources();
        builderC.setContentTitle(resources.getString(R.string.IDS_health_record)).setContentText(resources.getString(R.string.IDS_health_record_notify));
        builderC.setContentIntent(PendingIntent.getActivity(context, 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.health-record&from=healthRecord&type=1&examinationId=" + i)), 67108864));
        builderC.setAutoCancel(true);
        lsb.d().c(i, builderC.build());
        LogUtil.a("HealthRecordAlarmReceiver", "notifyHealthRecordMessage success");
    }
}
