package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.push.fm;
import defpackage.gft;
import defpackage.gxs;
import defpackage.k5s;
import defpackage.oss;
import defpackage.wft;
import defpackage.x9s;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class MessageHandleService extends BaseService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<a> f13626a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ExecutorService f54a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PushMessageReceiver f13627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Intent f13628b;

        public a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f13627a = pushMessageReceiver;
            this.f13628b = intent;
        }

        public Intent a() {
            return this.f13628b;
        }

        public PushMessageReceiver b() {
            return this.f13627a;
        }
    }

    public static void addJob(Context context, a aVar) {
        if (aVar != null) {
            f13626a.add(aVar);
            b(context);
            startService(context);
        }
    }

    private static void b(Context context) {
        if (f54a.isShutdown()) {
            return;
        }
        f54a.execute(new wft(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        try {
            a(context, f13626a.poll());
        } catch (RuntimeException e) {
            x9s.s(e);
        }
    }

    public static void startService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) MessageHandleService.class));
        k5s.a(context).g(new gft(context, intent));
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    public static void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        b(context);
    }

    public static void a(Context context, a aVar) {
        String[] stringArrayExtra;
        if (aVar == null) {
            return;
        }
        try {
            PushMessageReceiver pushMessageReceiverB = aVar.b();
            Intent intentA = aVar.a();
            int intExtra = intentA.getIntExtra("message_type", 1);
            if (intExtra != 1) {
                if (intExtra != 3) {
                    if (intExtra == 5 && "error_lack_of_permission".equals(intentA.getStringExtra("error_type")) && (stringArrayExtra = intentA.getStringArrayExtra("error_message")) != null) {
                        x9s.E("begin execute onRequirePermissions, lack of necessary permissions");
                        pushMessageReceiverB.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                }
                MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) intentA.getSerializableExtra("key_command");
                x9s.E("(Local) begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                pushMessageReceiverB.onCommandResult(context, miPushCommandMessage);
                if (TextUtils.equals(miPushCommandMessage.getCommand(), fm.COMMAND_REGISTER.f62a)) {
                    pushMessageReceiverB.onReceiveRegisterResult(context, miPushCommandMessage);
                    PushMessageHandler.a(context, miPushCommandMessage);
                    if (miPushCommandMessage.getResultCode() == 0) {
                        gxs.l(context);
                        return;
                    }
                    return;
                }
                return;
            }
            PushMessageHandler.a aVarB = e.e(context).b(intentA);
            int intExtra2 = intentA.getIntExtra("eventMessageType", -1);
            if (aVarB == null) {
                x9s.C("MessageHandleService", "no message from raw for receiver");
                return;
            }
            if (aVarB instanceof MiPushMessage) {
                MiPushMessage miPushMessage = (MiPushMessage) aVarB;
                if (!miPushMessage.isArrivedMessage()) {
                    pushMessageReceiverB.onReceiveMessage(context, miPushMessage);
                }
                if (miPushMessage.getPassThrough() == 1) {
                    oss.a(context.getApplicationContext()).d(context.getPackageName(), intentA, 2004, null);
                    x9s.C("MessageHandleService", "begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                    pushMessageReceiverB.onReceivePassThroughMessage(context, miPushMessage);
                    return;
                }
                if (miPushMessage.isNotified()) {
                    if (intExtra2 == 1000) {
                        oss.a(context.getApplicationContext()).d(context.getPackageName(), intentA, 1007, null);
                    } else {
                        oss.a(context.getApplicationContext()).d(context.getPackageName(), intentA, ErrorCode.DATA_NOT_READY, null);
                    }
                    x9s.C("MessageHandleService", "begin execute onNotificationMessageClicked from\u3000" + miPushMessage.getMessageId());
                    pushMessageReceiverB.onNotificationMessageClicked(context, miPushMessage);
                    return;
                }
                x9s.C("MessageHandleService", "begin execute onNotificationMessageArrived from " + miPushMessage.getMessageId());
                pushMessageReceiverB.onNotificationMessageArrived(context, miPushMessage);
                return;
            }
            if (aVarB instanceof MiPushCommandMessage) {
                MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) aVarB;
                x9s.C("MessageHandleService", "begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                pushMessageReceiverB.onCommandResult(context, miPushCommandMessage2);
                if (TextUtils.equals(miPushCommandMessage2.getCommand(), fm.COMMAND_REGISTER.f62a)) {
                    pushMessageReceiverB.onReceiveRegisterResult(context, miPushCommandMessage2);
                    PushMessageHandler.a(context, miPushCommandMessage2);
                    if (miPushCommandMessage2.getResultCode() == 0) {
                        gxs.l(context);
                        return;
                    }
                    return;
                }
                return;
            }
            x9s.C("MessageHandleService", "unknown raw message: " + aVarB);
        } catch (RuntimeException e) {
            x9s.q("MessageHandleService", e);
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* JADX INFO: renamed from: a */
    public boolean mo673a() {
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = f13626a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }
}
