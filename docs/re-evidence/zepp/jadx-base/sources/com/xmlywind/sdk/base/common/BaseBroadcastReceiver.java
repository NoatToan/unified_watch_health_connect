package com.xmlywind.sdk.base.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.xmlywind.sdk.common.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseBroadcastReceiver extends BroadcastReceiver {
    private Context a;
    private String b;

    public BaseBroadcastReceiver(String str) {
        this.b = str;
    }

    public static void a(Context context, String str, String str2) {
        a(context, str, null, str2, 0);
    }

    public static void a(Context context, String str, String str2, int i) {
        a(context, str, null, str2, i);
    }

    public static void a(Context context, String str, Map<String, Object> map, String str2) {
        a(context, str, map, str2, 0);
    }

    public static void a(Context context, String str, Map<String, Object> map, String str2, int i) {
        com.xmlywind.sdk.common.utils.m.a.a(context);
        com.xmlywind.sdk.common.utils.m.a.a(str2);
        Intent intent = new Intent(str2);
        intent.putExtra(Constants.BROADCAST_IDENTIFIER_KEY, str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                try {
                    intent.putExtra(str3, (String) map.get(str3));
                } catch (Throwable unused) {
                }
            }
        }
        w wVarA = w.a(context);
        if (wVarA != null) {
            try {
                wVarA.a(intent, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public abstract IntentFilter a();

    public void a(BroadcastReceiver broadcastReceiver) {
        Context context = this.a;
        if (context == null || broadcastReceiver == null) {
            return;
        }
        w wVarA = w.a(context);
        if (wVarA != null) {
            try {
                wVarA.a(broadcastReceiver);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.a = null;
    }

    public void a(BroadcastReceiver broadcastReceiver, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        w wVarA = w.a(applicationContext);
        if (wVarA != null) {
            try {
                wVarA.a(broadcastReceiver, a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean a(Intent intent) {
        com.xmlywind.sdk.common.utils.m.a.a(intent);
        String stringExtra = intent.getStringExtra(Constants.BROADCAST_IDENTIFIER_KEY);
        return !TextUtils.isEmpty(stringExtra) && this.b.equalsIgnoreCase(stringExtra);
    }
}
