package com.xiaomi.fitness.push.core;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.fitness.push.bean.PushMessageStatus;
import com.xiaomi.fitness.push.request.PushHelper;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.fgl;
import defpackage.xei;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class MessageReceiver extends PushMessageReceiver {
    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        String command = miPushCommandMessage.getCommand();
        List<String> commandArguments = miPushCommandMessage.getCommandArguments();
        String str = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
        if (LoginPreferenceConfig.TYPE_REGISTER.equals(command)) {
            if (miPushCommandMessage.getResultCode() == 0) {
                xei.d("register clientId:" + str);
                PushHelper.INSTANCE.registerPushId(str);
                return;
            }
            xei.a(miPushCommandMessage.getResultCode() + ", " + miPushCommandMessage.getReason());
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        byte b2;
        super.onNotificationMessageArrived(context, miPushMessage);
        xei.d("onNotificationMessageArrived");
        if (miPushMessage != null) {
            String content = miPushMessage.getContent();
            if (TextUtils.isEmpty(content)) {
                return;
            }
            try {
                String string = new JSONObject(content).getString("launch_uri");
                int iHashCode = string.hashCode();
                if (iHashCode != -1139294875) {
                    if (iHashCode == 1095967996 && string.equals("mihealth://intent/huamisport/migrate/fail")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (string.equals("mihealth://intent/huamisport/migrate/success")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0 || b2 == 1) {
                    fgl.a(context, Uri.parse(string));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageClicked(context, miPushMessage);
        xei.d("onNotificationMessageClicked");
        MessageCenter.INSTANCE.processPushNotification(PushMessageStatus.CLICK_PUSH_MESSAGE, miPushMessage);
        b.U(context, miPushMessage);
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        super.onReceivePassThroughMessage(context, miPushMessage);
        xei.d("onReceivePassThroughMessage");
        MessageCenter.INSTANCE.processPushNotification(PushMessageStatus.RECEIVE_PUSH_MESSAGE, miPushMessage);
    }
}
