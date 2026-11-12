package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.android.g;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.hm.health.sleep.eventbus.SlpHMDeviceSyncDataEventObserver;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.ag;
import com.xiaomi.mipush.sdk.am;
import com.xiaomi.mipush.sdk.x;
import com.xiaomi.push.cx;
import com.xiaomi.push.service.ServiceClient;
import com.xiaomi.push.y;

/* JADX INFO: loaded from: classes22.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {
    private static boolean a = false;
    private boolean b;

    public NetworkStatusReceiver() {
        this.b = false;
        this.b = true;
    }

    public NetworkStatusReceiver(Object obj) {
        this.b = false;
        a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (!ag.a(context).m3472a() && com.xiaomi.mipush.sdk.a.m3457a(context).m3465c() && !com.xiaomi.mipush.sdk.a.m3457a(context).m3468f()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ServiceClient.getInstance(context).startServiceSafely(intent);
            } catch (Exception e) {
                b.a(e);
            }
        }
        cx.m3649a(context);
        if (y.m3842a(context) && ag.a(context).m3474b()) {
            ag.a(context).c();
        }
        if (y.m3842a(context)) {
            if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(context).a(am.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(context).a(am.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(context).a(am.UPLOAD_HUAWEI_TOKEN))) {
                MiPushClient.syncAssemblePushToken(context);
            }
            if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(context).a(am.UPLOAD_FCM_TOKEN))) {
                MiPushClient.syncAssembleFCMPushToken(context);
            }
            if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(context).a(am.UPLOAD_COS_TOKEN))) {
                MiPushClient.syncAssembleCOSPushToken(context);
            }
            if (SlpHMDeviceSyncDataEventObserver.SYNCING.equals(x.a(context).a(am.UPLOAD_FTOS_TOKEN))) {
                MiPushClient.syncAssembleFTOSPushToken(context);
            }
            if (HWPushHelper.needConnect() && HWPushHelper.shouldTryConnect(context)) {
                HWPushHelper.setConnectTime(context);
                HWPushHelper.registerHuaWeiAssemblePush(context);
            }
            COSPushHelper.doInNetworkChange(context);
            FTOSPushHelper.doInNetworkChange(context);
        }
    }

    public static boolean a() {
        return a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.b) {
            return;
        }
        g.a().post(new a(this, context));
    }
}
