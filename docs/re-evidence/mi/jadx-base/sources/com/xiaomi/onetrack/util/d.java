package com.xiaomi.onetrack.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13923a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13924b = "com.xiaomi.onetrack.DEBUG";
    private static final String c = "com.xiaomi.onetrack.permissions.DEBUG_MODE";
    private static final String d = "/api/open/device/writeBack";
    private static final String e = "http://";
    private static final String f = "https://";
    private static final String g = ".mi.com";
    private static volatile d h = null;
    private static final int i = 100;
    private final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f13925k = new e(this, Looper.getMainLooper());
    private BroadcastReceiver l = new f(this);

    private d() {
        Context contextB = com.xiaomi.onetrack.f.a.b();
        this.j = contextB;
        a(contextB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        Toast.makeText(this.j, str, 1).show();
    }

    public static d a() {
        if (h == null) {
            synchronized (d.class) {
                try {
                    if (h == null) {
                        h = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("code");
            String strOptString = jSONObject.optString("message");
            String strOptString2 = jSONObject.optString("result");
            boolean zOptBoolean = jSONObject.optBoolean("success");
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            if (iOptInt == 0 && zOptBoolean) {
                bundle.putString("hint", strOptString2);
            } else {
                bundle.putString("hint", strOptString);
            }
            messageObtain.setData(bundle);
            this.f13925k.sendMessage(messageObtain);
        } catch (JSONException e2) {
            p.b(f13923a, e2.getMessage());
        }
    }

    private void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f13924b);
            context.registerReceiver(this.l, intentFilter, c, null);
        } catch (Exception e2) {
            p.a(f13923a, "registerDebugModeReceiver: " + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.endsWith(g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3) {
        i.a(new g(this, str, str2, str3));
    }
}
