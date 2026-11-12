package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.di;
import com.xiaomi.push.dx;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class PushMessageHelper {
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String ERROR_TYPE_NEED_PERMISSION = "error_lack_of_permission";
    public static final String KEY_COMMAND = "key_command";
    public static final String KEY_MESSAGE = "key_message";
    public static final int MESSAGE_COMMAND = 3;
    public static final int MESSAGE_ERROR = 5;
    public static final int MESSAGE_QUIT = 4;
    public static final int MESSAGE_RAW = 1;
    public static final int MESSAGE_SENDMESSAGE = 2;
    public static final String MESSAGE_TYPE = "message_type";
    public static final int PUSH_MODE_BROADCAST = 2;
    public static final int PUSH_MODE_CALLBACK = 1;
    private static int a;

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    private static void b(int i) {
        a = i;
    }

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j, String str2, String str3) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(dx dxVar, di diVar, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(dxVar.m3738a());
        if (!TextUtils.isEmpty(dxVar.d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(dxVar.d());
        } else if (!TextUtils.isEmpty(dxVar.c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(dxVar.c());
        } else if (TextUtils.isEmpty(dxVar.f())) {
            miPushMessage.setMessageType(0);
        } else {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(dxVar.f());
        }
        miPushMessage.setCategory(dxVar.e());
        if (dxVar.a() != null) {
            miPushMessage.setContent(dxVar.a().c());
        }
        if (diVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(diVar.m3670a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(diVar.m3675b());
            }
            miPushMessage.setDescription(diVar.d());
            miPushMessage.setTitle(diVar.m3678c());
            miPushMessage.setNotifyType(diVar.a());
            miPushMessage.setNotifyId(diVar.c());
            miPushMessage.setPassThrough(diVar.b());
            miPushMessage.setExtra(diVar.m3671a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    public static di generateMessage(MiPushMessage miPushMessage) {
        di diVar = new di();
        diVar.a(miPushMessage.getMessageId());
        diVar.b(miPushMessage.getTopic());
        diVar.d(miPushMessage.getDescription());
        diVar.c(miPushMessage.getTitle());
        diVar.c(miPushMessage.getNotifyId());
        diVar.a(miPushMessage.getNotifyType());
        diVar.b(miPushMessage.getPassThrough());
        diVar.a(miPushMessage.getExtra());
        return diVar;
    }

    public static int getPushMode(Context context) {
        if (a == 0) {
            b(isUseCallbackPushMode(context) ? 1 : 2);
        }
        return a;
    }

    public static boolean isUseCallbackPushMode(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return a(context, intent);
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(MESSAGE_TYPE, 3);
        intent.putExtra(KEY_COMMAND, miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendQuitMessageBroadcast(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(MESSAGE_TYPE, 4);
        new PushServiceReceiver().onReceive(context, intent);
    }
}
