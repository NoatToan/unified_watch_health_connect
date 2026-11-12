package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushServiceReceiver;
import com.xiaomi.push.io;
import com.xiaomi.push.je;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f41194a;

    public static MiPushCommandMessage a(String str, List<String> list, long j, String str2, String str3, List<String> list2) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        miPushCommandMessage.setAutoMarkPkgs(list2);
        return miPushCommandMessage;
    }

    public static MiPushMessage b(je jeVar, io ioVar, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(jeVar.m786a());
        if (!TextUtils.isEmpty(jeVar.d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(jeVar.d());
        } else if (!TextUtils.isEmpty(jeVar.c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(jeVar.c());
        } else if (TextUtils.isEmpty(jeVar.f())) {
            miPushMessage.setMessageType(0);
        } else {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(jeVar.f());
        }
        miPushMessage.setCategory(jeVar.e());
        if (jeVar.a() != null) {
            miPushMessage.setContent(jeVar.a().c());
        }
        if (ioVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(ioVar.m713a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(ioVar.m718b());
            }
            miPushMessage.setDescription(ioVar.d());
            miPushMessage.setTitle(ioVar.m721c());
            miPushMessage.setNotifyType(ioVar.a());
            miPushMessage.setNotifyId(ioVar.c());
            miPushMessage.setPassThrough(ioVar.b());
            miPushMessage.setExtra(ioVar.m714a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    public static int c(Context context) {
        if (f41194a == 0) {
            if (e(context)) {
                g(1);
            } else {
                g(2);
            }
        }
        return f41194a;
    }

    public static boolean d(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean e(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return d(context, intent);
    }

    public static void f(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 3);
        intent.putExtra("key_command", miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void g(int i) {
        f41194a = i;
    }
}
