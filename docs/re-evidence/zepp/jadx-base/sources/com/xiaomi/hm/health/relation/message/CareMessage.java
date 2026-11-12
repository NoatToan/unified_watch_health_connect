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
import com.xiaomi.hm.health.relation.RelationExternalsKt;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class CareMessage extends BaseMessage {
    private static final String g = "url";
    private static final String h = "from_uid";
    private static final String i = "from_username";
    private static final String j = "nick";
    private static final String k = "pic";
    private static final String l = "app";
    private static Lazy<FriendsAndFamilyInject> m = KoinJavaComponent.inject(FriendsAndFamilyInject.class);
    private final Uri f;
    public final String fromUid;
    public final String fromUsername;
    public final String picUrl;

    public CareMessage(Context context, long j2, long j3, JSONObject jSONObject) {
        super(context, j2, j3, jSONObject);
        this.f = Uri.parse(jSONObject.optString("url"));
        this.fromUid = jSONObject.optString("from_uid");
        String strOptString = !jSONObject.isNull("nick") ? jSONObject.optString("nick") : null;
        String strOptString2 = jSONObject.optString(i);
        if (strOptString == null || "".equals(strOptString.trim())) {
            this.fromUsername = strOptString2;
        } else {
            this.fromUsername = strOptString;
        }
        this.picUrl = jSONObject.optString("pic");
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void doWork() {
        FriendManager.getInstance().updateCareCount(this);
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public int getNotificationId() {
        return m.getValue().getConstantExternal().getFriendMessageId();
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void show() {
        Intent intent;
        if (!"app".equals(this.f.getScheme())) {
            intent = new Intent(this.context, (Class<?>) WebActivity.class);
        } else if (!checkUriAvailable(this.f)) {
            return;
        } else {
            intent = new Intent(this.context, (Class<?>) MessageActivity.class);
        }
        notify(this.context.getString(R.string.relatives_message_title_care), this.context.getString(R.string.relatives_label_friend_care_message, this.fromUsername), PendingIntent.getActivity(this.context, 0, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456));
        RelationExternalsKt.getFriendsAndFamilyInjectDelegate().deviceAlert(this.fromUsername);
    }

    @NotNull
    public String toString() {
        return "CareMessage [uri=" + this.f + ", fromUid=" + this.fromUid + ", fromUsername=" + this.fromUsername + ", picUrl=" + this.picUrl + "]";
    }
}
