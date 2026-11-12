package com.xiaomi.hm.health.relation.message;

import android.content.Context;
import android.net.Uri;
import com.xiaomi.hm.health.push.BaseMessage;
import com.xiaomi.hm.health.relation.FriendManager;
import com.xiaomi.hm.health.relation.R;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class UnfollowMessage extends BaseMessage {
    private static final String f = "url";
    private static final String g = "from_uid";
    public final long fromUid;
    public final Uri uri;

    public UnfollowMessage(Context context, long j, long j2, JSONObject jSONObject) {
        super(context, j, j2, jSONObject);
        this.uri = Uri.parse(jSONObject.optString("url"));
        this.fromUid = jSONObject.optLong("from_uid");
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void doWork() {
        FriendManager.getInstance().unfollowMessage(this);
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public int getNotificationId() {
        return R.id.relatives_notification_care;
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void show() {
    }
}
