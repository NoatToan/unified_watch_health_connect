package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes8.dex */
public class gsx {
    private static a d;

    public static void e(Context context) {
        LogUtil.a("PushTokenReceiverHelper", "Enter registerReceivePushToken()");
        d = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.ACTION_RECEIVE_PUSH_TOKEN");
        BroadcastManagerUtil.d(context, d, intentFilter, LocalBroadcast.f36595c, null);
    }

    public static void d(Context context) {
        LogUtil.a("PushTokenReceiverHelper", "Enter unregisterPushTokenChange");
        try {
            context.unregisterReceiver(d);
        } catch (IllegalArgumentException e) {
            LogUtil.e("PushTokenReceiverHelper", "unregisterPushTokenChange illegalArgumentException ", LogAnonymous.b(e));
        } catch (RuntimeException e2) {
            LogUtil.e("PushTokenReceiverHelper", "unregisterPushTokenChange runtimeException", LogAnonymous.b(e2));
        }
    }

    static class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("PushTokenReceiver", "GetPushTokenReceiver enter");
            if (context == null || intent == null) {
                LogUtil.j("PushTokenReceiver", "GetPushTokenReceiver context or intent is null.");
                return;
            }
            if (intent.getAction() != null && "com.huawei.health.action.ACTION_RECEIVE_PUSH_TOKEN".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN);
                LogUtil.a("PushTokenReceiver", "GetPushTokenReceiver LocalBroadcast.ACTION_RECEIVE_PUSH_TOKEN");
                if (!TextUtils.isEmpty(stringExtra)) {
                    ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).saveToken(stringExtra);
                }
            }
            gsx.d(context);
        }
    }
}
