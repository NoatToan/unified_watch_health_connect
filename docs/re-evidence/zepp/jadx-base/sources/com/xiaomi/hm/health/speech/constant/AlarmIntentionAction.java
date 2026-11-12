package com.xiaomi.hm.health.speech.constant;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes21.dex */
public enum AlarmIntentionAction {
    Alarm("alarm"),
    Reminder(NotificationCompat.CATEGORY_REMINDER),
    Timer("timer"),
    NOT_SUPPORTED("not_supported");

    private String alarmIntentionAction;

    AlarmIntentionAction(String intentionAction) {
        this.alarmIntentionAction = intentionAction;
    }

    public static AlarmIntentionAction findCorrespondAlarmIntentionActionByActionDesc(String alarmIntentionActionDesc) {
        AlarmIntentionAction alarmIntentionAction = null;
        for (AlarmIntentionAction alarmIntentionAction2 : values()) {
            if (alarmIntentionActionDesc.equals(alarmIntentionAction2.getAlarmIntentionActionDesc())) {
                alarmIntentionAction = alarmIntentionAction2;
            }
        }
        return alarmIntentionAction;
    }

    public String getAlarmIntentionActionDesc() {
        return this.alarmIntentionAction;
    }
}
