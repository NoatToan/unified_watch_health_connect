package com.xiaomi.hm.health.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.alipay.sdk.m.k.b;
import com.xiaomi.hm.health.Constant;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class JumpMessage extends BaseMessage {
    private static final String f = "url";
    private static final String g = "title";
    private static final String h = "description";
    public final String description;
    public final String title;
    public final Uri uri;

    public static class a implements Serializable {
        private static final long serialVersionUID = 4575743095201758611L;
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        private a() {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = "";
            this.f = "";
        }

        public boolean equals(Object o) {
            if (o == null || !(o instanceof a)) {
                return false;
            }
            a aVar = (a) o;
            String str = this.d;
            return str != null && str.equals(aVar.d);
        }
    }

    public JumpMessage(Context context, long id, long uid, JSONObject contentJson) {
        super(context, id, uid, contentJson);
        this.uri = Uri.parse(contentJson.optString("url"));
        this.title = contentJson.optString("title");
        this.description = contentJson.optString("description");
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void doWork() {
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public int getNotificationId() {
        return 8;
    }

    @Override // com.xiaomi.hm.health.push.BaseMessage
    public void show() {
        Intent intent;
        if (!"app".equals(this.uri.getScheme())) {
            intent = new Intent(Constant.ACTION_OPEN_PARTNER_MESSAGE);
            a aVar = new a();
            aVar.c = this.uri.toString();
            aVar.a = this.title;
            aVar.b = this.description;
            Bundle bundle = new Bundle();
            bundle.putSerializable(b.v0, aVar);
            intent.putExtras(bundle);
        } else {
            if (!checkUriAvailable(this.uri)) {
                return;
            }
            intent = new Intent(Constant.ACTION_JUMP_MESSAGE);
            intent.putExtra("uri", this.uri.toString());
        }
        notify(this.title, this.description, PendingIntent.getBroadcast(this.context, 0, intent, Build.VERSION.SDK_INT >= 23 ? 335544320 : 268435456));
    }
}
