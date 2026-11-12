package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.push.Cif;
import com.xiaomi.push.fm;
import com.xiaomi.push.i;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import defpackage.odt;
import defpackage.oss;
import defpackage.p5s;
import defpackage.x9s;
import defpackage.xes;
import defpackage.zei;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class PushMessageHandler extends BaseService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<b.a> f13630a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<b.AbstractC0828b> f13631b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f56a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public interface a extends Serializable {
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e) {
            x9s.p("PushMessageHandler", e.getMessage());
        }
    }

    public static void b() {
        synchronized (f13630a) {
            f13630a.clear();
        }
    }

    private static void c(Context context, Intent intent) {
        if (intent != null && !f56a.isShutdown()) {
            f56a.execute(new p5s(context, intent));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("-->scheduleJob() fail, case");
        sb.append(intent == null ? "0" : "1");
        x9s.C("PushMessageHandler", sb.toString());
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        c(getApplicationContext(), intent);
    }

    public static void b(Context context, Intent intent) {
        boolean booleanExtra;
        ResolveInfo next;
        try {
            booleanExtra = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th) {
            x9s.p("PushMessageHandler", "intent unparcel error:" + th);
            booleanExtra = false;
        }
        try {
            x9s.r("PushMessageHandler", "-->onHandleIntent(): action=", intent.getAction());
            if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                Cif cif = new Cif();
                i.d(cif, intent.getByteArrayExtra("mipush_payload"));
                x9s.z("PushMessageHandler", "PushMessageHandler.onHandleIntent " + cif.d());
                c.a(context, cif);
            } else if (1 == zei.c(context)) {
                if (m672b()) {
                    x9s.t("PushMessageHandler", "receive a message before application calling initialize");
                    if (booleanExtra) {
                        b(context);
                        return;
                    }
                    return;
                }
                a aVarB = e.e(context).b(intent);
                if (aVarB != null) {
                    a(context, aVarB);
                }
            } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                try {
                    List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                    if (listQueryBroadcastReceivers == null) {
                        next = null;
                        break;
                    }
                    Iterator<ResolveInfo> it = listQueryBroadcastReceivers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        ActivityInfo activityInfo = next.activityInfo;
                        if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(odt.c(context, next.activityInfo.name))) {
                            break;
                        }
                    }
                    if (next != null) {
                        a(context, intent2, next, booleanExtra);
                    } else {
                        x9s.t("PushMessageHandler", "cannot find the receiver to handler this message, check your manifest");
                        oss.a(context).e(context.getPackageName(), intent, b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD);
                    }
                } catch (Exception e) {
                    x9s.q("PushMessageHandler", e);
                    oss.a(context).e(context.getPackageName(), intent, UserConfig.KEY_LITE_SCENE_ORDER);
                }
            }
            if (!booleanExtra) {
            }
        } catch (Throwable th2) {
            try {
                x9s.q("PushMessageHandler", th2);
                oss.a(context).e(context.getPackageName(), intent, b4s.APPLY_CHANNEL_TOKEN2_CARD_NO_BIND_CARD);
            } finally {
                if (booleanExtra) {
                    b(context);
                }
            }
        }
    }

    public static void a(Context context, Intent intent) {
        x9s.z("PushMessageHandler", "addjob PushMessageHandler " + intent);
        if (intent != null) {
            c(context, intent);
            a(context);
        }
    }

    public static void a(b.AbstractC0828b abstractC0828b) {
        synchronized (f13631b) {
            try {
                if (!f13631b.contains(abstractC0828b)) {
                    f13631b.add(abstractC0828b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(b.a aVar) {
        synchronized (f13630a) {
            try {
                if (!f13630a.contains(aVar)) {
                    f13630a.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a() {
        synchronized (f13631b) {
            f13631b.clear();
        }
    }

    private static void a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z) {
        try {
            MessageHandleService.a aVar = new MessageHandleService.a(intent, (PushMessageReceiver) odt.c(context, resolveInfo.activityInfo.name).newInstance());
            if (z) {
                MessageHandleService.a(context.getApplicationContext(), aVar);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), aVar);
            }
            MessageHandleService.a(context, new Intent(context.getApplicationContext(), (Class<?>) MessageHandleService.class));
        } catch (Throwable th) {
            x9s.s(th);
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean mo673a() {
        ThreadPoolExecutor threadPoolExecutor = f56a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f56a.getQueue().size() <= 0) ? false : true;
    }

    public static void a(Context context, a aVar) {
        if (aVar instanceof MiPushMessage) {
            a(context, (MiPushMessage) aVar);
            return;
        }
        if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (fm.COMMAND_REGISTER.f62a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (!fm.COMMAND_SET_ALIAS.f62a.equals(command) && !fm.COMMAND_UNSET_ALIAS.f62a.equals(command) && !fm.COMMAND_SET_ACCEPT_TIME.f62a.equals(command)) {
                if (fm.COMMAND_SUBSCRIBE_TOPIC.f62a.equals(command)) {
                    List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                    if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                        str = commandArguments2.get(0);
                    }
                    a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                    return;
                }
                if (fm.COMMAND_UNSUBSCRIBE_TOPIC.f62a.equals(command)) {
                    List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                    if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                        str = commandArguments3.get(0);
                    }
                    b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                    return;
                }
                return;
            }
            a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
        }
    }

    private static void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, xes.a(context));
        } catch (Exception e) {
            x9s.p("PushMessageHandler", "callback sync error" + e);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m672b() {
        return f13631b.isEmpty();
    }

    public static void b(Context context, String str, long j, String str2, String str3) {
        synchronized (f13631b) {
            try {
                for (b.AbstractC0828b abstractC0828b : f13631b) {
                    if (a(str, abstractC0828b.a())) {
                        abstractC0828b.g(j, str2, str3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context, MiPushMessage miPushMessage) {
        synchronized (f13631b) {
            try {
                for (b.AbstractC0828b abstractC0828b : f13631b) {
                    if (a(miPushMessage.getCategory(), abstractC0828b.a())) {
                        abstractC0828b.e(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                        abstractC0828b.d(miPushMessage);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(long j, String str, String str2) {
        synchronized (f13631b) {
            try {
                Iterator<b.AbstractC0828b> it = f13631b.iterator();
                while (it.hasNext()) {
                    it.next().c(j, str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context, String str, long j, String str2, String str3) {
        synchronized (f13631b) {
            try {
                for (b.AbstractC0828b abstractC0828b : f13631b) {
                    if (a(str, abstractC0828b.a())) {
                        abstractC0828b.f(j, str2, str3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (f13631b) {
            try {
                for (b.AbstractC0828b abstractC0828b : f13631b) {
                    if (a(str, abstractC0828b.a())) {
                        abstractC0828b.b(str2, j, str3, list);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    public static void a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f13630a) {
            try {
                for (b.a aVar : f13630a) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
