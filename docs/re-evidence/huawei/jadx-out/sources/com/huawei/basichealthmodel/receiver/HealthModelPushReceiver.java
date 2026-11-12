package com.huawei.basichealthmodel.receiver;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cbg;
import defpackage.cfb;
import defpackage.qrs;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class HealthModelPushReceiver implements IpushBase {
    private static final int HEALTH_MODEL_PUSH_TYPE = 31;
    private static final int HEALTH_MODEL_SHEDDING_FOUR_DAY = 4;
    private static final int HEALTH_MODEL_SHEDDING_SEVEN_DAY = 7;
    private static final int HEALTH_MODEL_SHEDDING_TWO_DAY = 2;
    private static final String TAG = "HL_HealthModelPushReceiver";

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("31");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "processPushMsg Error PushMsg is Empty");
            return;
        }
        LogUtil.d(TAG, "health model get message", str);
        HealthMsgPushBean healthMsgPushBean = (HealthMsgPushBean) new Gson().fromJson(str, HealthMsgPushBean.class);
        if (healthMsgPushBean == null || healthMsgPushBean.pushType != 31) {
            LogUtil.j(TAG, "bean == null, pushType != SYNC_DATA");
            return;
        }
        int iA = qrs.a(healthMsgPushBean.msgContext);
        int reminderType = getReminderType(iA);
        if (reminderType == -1) {
            LogUtil.j(TAG, "sheddingDays", Integer.valueOf(iA));
            return;
        }
        long reminderTime = getReminderTime();
        cfb.e(reminderType, reminderTime, 1, 1);
        LogUtil.a(TAG, "registerHealthModelReminder reminderId", Integer.valueOf(reminderType), "reminderTime", Long.valueOf(reminderTime));
    }

    private int getReminderType(int i) {
        if (i == 2 || i == 4) {
            return 4000;
        }
        return (i % 7 != 0 || i == 0) ? -1 : 4001;
    }

    private long getReminderTime() {
        Calendar calendarS = cbg.s();
        calendarS.add(12, HwExerciseConstants.NINE_MINUTES_PACE);
        if (System.currentTimeMillis() > calendarS.getTimeInMillis()) {
            calendarS.add(5, 1);
        }
        return calendarS.getTimeInMillis();
    }

    static class HealthMsgPushBean {
        private int pushType = 0;
        private String msgContext = "";

        private HealthMsgPushBean() {
        }

        public String toString() {
            return "HiSyncMsgPushBean{, pushType='" + this.pushType + "', pushId='" + this.msgContext + "'}";
        }
    }
}
