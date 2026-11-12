package com.huawei.hwdevice.mainprocess.mgr.hwotamanager;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsb;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes10.dex */
public class NotificationManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f17370b;
    private MessageObject e;

    private boolean d(int i) {
        return i == 1;
    }

    public NotificationManager(Context context) {
        this(context, null);
    }

    public NotificationManager(Context context, MessageObject messageObject) {
        this.f17370b = context;
        this.e = messageObject;
    }

    public void c(long j) {
        LogUtil.a("NotificationManager", "start_showNotification");
        Context context = this.f17370b;
        if (context == null || this.e == null) {
            LogUtil.j("NotificationManager", "showUpdateMessageNotification return");
            return;
        }
        String strE = SharedPreferenceManager.e(context, Integer.toString(10000), "health_msg_switch_noticebar");
        LogUtil.a("NotificationManager", "showNotification() noticeRecommend", strE);
        if ("0".equals(strE) || !d() || d(this.e.getReadFlag()) || this.e.getNotified() == 1) {
            return;
        }
        try {
            Notification.Builder builderC = lsb.d().c();
            LogUtil.a("NotificationManager", "builder =  ", builderC, "msgObj.getMsgTitle() ", this.e.getMsgTitle(), "msgObj.getMsgContent() ", this.e.getMsgContent(), "msgObj.getDetailUri() ", this.e.getDetailUri(), "msgObj.getMsgId() ", this.e.getMsgId(), "msgObj.getWeight() ", Integer.valueOf(this.e.getWeight()), "msgObj.getCreateTime() ", Long.valueOf(this.e.getCreateTime()));
            builderC.setContentTitle(this.e.getMsgTitle()).setContentText(this.e.getMsgContent()).setContentIntent(d(this.e.getDetailUri(), this.e.getMsgId())).setTicker(this.e.getMsgTitle()).setNumber(this.e.getWeight()).setWhen(this.e.getCreateTime()).setStyle(new Notification.BigTextStyle().bigText(this.e.getMsgContent())).setShowWhen(true).setPriority(0).setAutoCancel(true).setOngoing(false).setDefaults(2);
            LogUtil.a("NotificationManager", "Builder_setMess");
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            LogUtil.a("NotificationManager", "getMessageNotifyId  ", Long.valueOf(j));
            lsb.d().c((int) j, builderC.build());
            LogUtil.a("NotificationManager", "end showNotification");
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("NotificationManager", "ResourcesNotFoundException");
        } catch (NumberFormatException e) {
            LogUtil.e("NotificationManager", e.getMessage());
        }
    }

    private boolean d() {
        return this.e.getPosition() == 2 || this.e.getPosition() == 3;
    }

    private PendingIntent d(String str, String str2) {
        LogUtil.d("NotificationManager", "detailUri ", str);
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.d(), "com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity");
        intent.putExtra(CommonUtil.DETAIL_URI, str);
        intent.putExtra("msgId", str2);
        intent.putExtra("notifiUri", str);
        if (str2.length() > 1) {
            health.compact.a.CommonUtil.b(str2.substring(1), 10);
        }
        return PendingIntent.getActivity(this.f17370b, 0, intent, 201326592);
    }

    public void e(int i) {
        LogUtil.a("NotificationManager", "Enter cancelNotification");
        try {
            lsb.d().e(i);
        } catch (Exception unused) {
            LogUtil.e("NotificationManager", "error cancelNotification");
        }
    }
}
