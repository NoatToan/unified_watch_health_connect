package com.xiaomi.hm.health.push;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ConfigMessage extends BaseMessage {
    public ConfigMessage(Context context, long id, long uid, JSONObject contentJson) {
        super(context, id, uid, contentJson);
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void doWork() {
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public int getNotificationId() {
        return com.huami.watch.hmwatchmanager.R.id.notification_care;
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void show() {
    }
}
