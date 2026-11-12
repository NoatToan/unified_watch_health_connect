package com.xiaomi.hm.health.relation.message;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.huami.relatives.FriendsAndFamilyInject;
import com.huami.web.container.WebActivity;
import com.xiaomi.hm.health.push.BaseMessage;
import com.xiaomi.hm.health.relation.FriendManager;
import com.xiaomi.hm.health.relation.MessageActivity;
import com.xiaomi.hm.health.relation.R;
import kotlin.Lazy;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class FollowMessage extends BaseMessage {
    public static final int TYPE_ACCEPT = 0;
    public static final int TYPE_REFUSE = 2;
    public static final int TYPE_REQUEST = 1;
    private static final String g = "url";
    private static final String h = "from_uid";
    private static final String i = "from_username";
    private static final String j = "request_type";
    private static final String k = "data";
    private static final String l = "pic";
    private static final String m = "app";
    private static Lazy<FriendsAndFamilyInject> n = KoinJavaComponent.inject(FriendsAndFamilyInject.class);
    public final String data;
    private final Uri f;
    public final long fromUid;
    public final String fromUsername;
    public final String icon;
    public final int type;

    public FollowMessage(Context context, long j2, long j3, JSONObject jSONObject) {
        super(context, j2, j3, jSONObject);
        this.f = Uri.parse(jSONObject.optString("url"));
        this.icon = jSONObject.optString("pic");
        this.fromUid = jSONObject.optLong("from_uid");
        this.fromUsername = jSONObject.optString(i);
        int iOptInt = jSONObject.optInt(j);
        this.type = iOptInt;
        this.data = jSONObject.optString("data");
        setSubtype(iOptInt);
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void doWork() {
        int i2 = this.type;
        if (i2 == 1) {
            FriendManager.getInstance().addReuqestMessage(this);
        } else if (i2 == 0) {
            FriendManager.getInstance().addAcceptMessage(this);
        } else if (i2 == 2) {
            FriendManager.getInstance().addRefuseMessage(this);
        }
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public int getNotificationId() {
        return n.getValue().getConstantExternal().getFriendMessageId();
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void show() {
        Intent intent;
        String string;
        if (!"app".equals(this.f.getScheme())) {
            intent = new Intent(this.context, (Class<?>) WebActivity.class);
        } else if (!checkUriAvailable(this.f)) {
            return;
        } else {
            intent = new Intent(this.context, (Class<?>) MessageActivity.class);
        }
        String string2 = this.context.getString(R.string.relatives_message_title_friend);
        int i2 = this.type;
        if (i2 == 1) {
            string = this.context.getString(R.string.relatives_label_friend_add_message, this.fromUsername);
        } else {
            string = i2 == 0 ? this.context.getString(R.string.relatives_label_friend_accept_message, this.fromUsername) : this.context.getString(R.string.relatives_label_friend_refuse_message, this.fromUsername);
        }
        notify(string2, string, PendingIntent.getActivity(this.context, 0, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456));
    }
}
