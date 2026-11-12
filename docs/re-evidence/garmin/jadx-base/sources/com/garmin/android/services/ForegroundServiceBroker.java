package com.garmin.android.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import gt2.b;
import gt2.c;
import hh2.d;
import hh2.e;
import hh2.f;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/services/ForegroundServiceBroker;", "Landroid/app/Service;", "<init>", "()V", "a", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ForegroundServiceBroker extends Service {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f50588e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f50589f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Messenger f50590a = new Messenger(new a.HandlerC1015a(this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f50591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f50592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f50593d;

    static {
        int i14 = c.f79010a;
        f50589f = b.f79005a.i("ForegroundServiceBroker");
    }

    public ForegroundServiceBroker() {
        e.f83760n.getClass();
        this.f50592c = new e(10717, "", "", null, null, null, null, null, 0, 0, 0, 0, Boolean.FALSE);
    }

    public final void a() {
        String str;
        d dVar = this.f50591b;
        String string = dVar == null ? null : dVar.f83757a;
        if (string == null) {
            string = getString(R.string.channel_name);
            string.getClass();
        }
        d dVar2 = this.f50591b;
        String str2 = "ForegroundServiceChannel";
        if (dVar2 != null && (str = dVar2.f83759c) != null) {
            str2 = str;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str2, string, 2);
        d dVar3 = this.f50591b;
        String string2 = dVar3 != null ? dVar3.f83758b : null;
        if (string2 == null) {
            string2 = getString(R.string.channel_description);
        }
        notificationChannel.setDescription(string2);
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        } else {
            x.l("null cannot be cast to non-null type android.app.NotificationManager");
        }
    }

    public final Notification b(e eVar) {
        Bitmap bitmapDecodeResource;
        String str;
        d dVar = this.f50591b;
        String str2 = "ForegroundServiceChannel";
        if (dVar != null && (str = dVar.f83759c) != null) {
            str2 = str;
        }
        q qVar = new q(this, str2);
        String str3 = eVar.f83762b;
        Integer num = eVar.f83770j;
        Integer num2 = eVar.f83769i;
        Boolean bool = eVar.f83773m;
        Integer num3 = eVar.f83771k;
        Integer num4 = eVar.f83772l;
        String str4 = eVar.f83763c;
        qVar.f202683e = q.e(str3);
        qVar.f202684f = q.e(str4);
        qVar.i(2, true);
        qVar.i(8, true);
        qVar.f202691m = -1;
        o oVar = new o();
        oVar.f202664e = q.e(str4);
        qVar.l(oVar);
        Integer num5 = eVar.f83764d;
        if (num5 != null) {
            qVar.D = num5.intValue();
        }
        PendingIntent pendingIntent = eVar.f83765e;
        if (pendingIntent != null) {
            qVar.f202686h = pendingIntent;
        }
        hh2.c cVar = eVar.f83766f;
        if (cVar != null) {
            qVar.a(cVar.f83755b, cVar.f83754a, cVar.f83756c);
        }
        hh2.c cVar2 = eVar.f83767g;
        if (cVar2 != null) {
            qVar.a(cVar2.f83755b, cVar2.f83754a, cVar2.f83756c);
        }
        hh2.c cVar3 = eVar.f83768h;
        if (cVar3 != null) {
            qVar.a(cVar3.f83755b, cVar3.f83754a, cVar3.f83756c);
        }
        if (num4 != null && num4.intValue() > 0 && num3 != null && bool != null) {
            int iIntValue = num4.intValue();
            int iIntValue2 = num3.intValue();
            boolean zBooleanValue = bool.booleanValue();
            qVar.f202697s = iIntValue;
            qVar.f202698t = iIntValue2;
            qVar.f202699u = zBooleanValue;
        }
        if (num2 != null && num2.intValue() > 0) {
            qVar.N.icon = num2.intValue();
        }
        if (num != null && num.intValue() > 0 && (bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), num.intValue())) != null) {
            qVar.j(bitmapDecodeResource);
        }
        Notification notificationC = qVar.c();
        notificationC.getClass();
        return notificationC;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder binder = this.f50590a.getBinder();
        binder.getClass();
        return binder;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i14, int i15) {
        if (intent != null) {
            try {
                this.f50591b = (d) intent.getParcelableExtra("NotificationChannel");
                this.f50593d = (e) intent.getParcelableExtra("NotificationData");
            } catch (Throwable th3) {
                f50589f.error("onStartCommand failed", th3);
                return 3;
            }
        }
        a();
        e eVar = this.f50593d;
        if (eVar == null) {
            eVar = new e(0, null, getString(R.string.default_foreground_message), null, null, null, null, null, Integer.valueOf(R.drawable.garmin_logo), null, null, null, null, 7931, null);
        }
        Notification notificationB = b(eVar);
        e eVar2 = this.f50593d;
        int i16 = eVar2 == null ? 10717 : eVar2.f83761a;
        if (Build.VERSION.SDK_INT < 29) {
            startForeground(i16, notificationB);
            return 3;
        }
        f fVar = intent == null ? null : (f) intent.getParcelableExtra("ServiceConfiguration");
        startForeground(i16, notificationB, fVar == null ? 16 : fVar.f83774a);
        return 3;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/services/ForegroundServiceBroker$a;", "", "<init>", "()V", "", "ILLEGAL_STATE_EXCEPTION", "I", "Lch/qos/logback/classic/Logger;", "LOGGER", "Lch/qos/logback/classic/Logger;", "", "NOTIFICATION_CHANNEL", "Ljava/lang/String;", "NOTIFICATION_DATA", "RESTORE_STATUS", "SECURITY_EXCEPTION", "SERVICE_CONFIGURATION", "START_SERVICE", "STOP_SERVICE", "SUCCESS", "UPDATE_CHANNEL", "UPDATE_STATUS", "a", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.services.ForegroundServiceBroker$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/services/ForegroundServiceBroker$a$a;", "Landroid/os/Handler;", "Lcom/garmin/android/services/ForegroundServiceBroker;", "foregroundServiceBroker", "<init>", "(Lcom/garmin/android/services/ForegroundServiceBroker;)V", "util_services_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class HandlerC1015a extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ForegroundServiceBroker f50594a;

            public HandlerC1015a(ForegroundServiceBroker foregroundServiceBroker) {
                foregroundServiceBroker.getClass();
                this.f50594a = foregroundServiceBroker;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Exception {
                e eVar;
                message.getClass();
                int i14 = message.what;
                ForegroundServiceBroker foregroundServiceBroker = this.f50594a;
                if (i14 == 1) {
                    Object obj = message.obj;
                    if (obj instanceof Intent) {
                        if (obj == null) {
                            x.l("null cannot be cast to non-null type android.content.Intent");
                            return;
                        }
                        try {
                            foregroundServiceBroker.startService((Intent) obj);
                            if (message.replyTo != null) {
                                Message messageObtain = Message.obtain(message);
                                messageObtain.arg1 = 0;
                                message.replyTo.send(messageObtain);
                                return;
                            }
                            return;
                        } catch (Exception e4) {
                            if (message.replyTo != null) {
                                Message messageObtain2 = Message.obtain(message);
                                if (e4 instanceof SecurityException) {
                                    messageObtain2.arg1 = 1;
                                } else {
                                    if (!(e4 instanceof IllegalStateException)) {
                                        throw e4;
                                    }
                                    messageObtain2.arg1 = 2;
                                }
                                message.replyTo.send(messageObtain2);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (i14 == 2) {
                    foregroundServiceBroker.stopForeground(true);
                    foregroundServiceBroker.stopSelf();
                    return;
                }
                e eVar2 = null;
                if (i14 != 3) {
                    if (i14 != 4) {
                        if (i14 != 5) {
                            return;
                        }
                        Object obj2 = message.obj;
                        Bundle bundle = obj2 instanceof Bundle ? (Bundle) obj2 : null;
                        d dVar = bundle != null ? (d) bundle.getParcelable("NotificationChannel") : null;
                        if (dVar == null) {
                            return;
                        }
                        foregroundServiceBroker.f50591b = dVar;
                        foregroundServiceBroker.a();
                        return;
                    }
                    e eVar3 = foregroundServiceBroker.f50593d;
                    if (eVar3 == null) {
                        return;
                    }
                    foregroundServiceBroker.f50593d = foregroundServiceBroker.f50592c;
                    Notification notificationB = foregroundServiceBroker.b(eVar3);
                    Object systemService = foregroundServiceBroker.getSystemService("notification");
                    if (systemService != null) {
                        ((NotificationManager) systemService).notify(eVar3.f83761a, notificationB);
                        return;
                    } else {
                        x.l("null cannot be cast to non-null type android.app.NotificationManager");
                        return;
                    }
                }
                if (!(message.obj instanceof Bundle) || (eVar = foregroundServiceBroker.f50593d) == null) {
                    return;
                }
                foregroundServiceBroker.getClass();
                foregroundServiceBroker.f50592c = eVar;
                Object obj3 = message.obj;
                if (obj3 == null) {
                    x.l("null cannot be cast to non-null type android.os.Bundle");
                    return;
                }
                e eVar4 = (e) ((Bundle) obj3).getParcelable("NotificationData");
                if (eVar4 != null) {
                    e eVar5 = foregroundServiceBroker.f50592c;
                    eVar5.getClass();
                    int i15 = eVar4.f83761a;
                    String str = eVar4.f83762b;
                    if (str == null) {
                        str = eVar5.f83762b;
                    }
                    String str2 = eVar4.f83763c;
                    if (str2 == null) {
                        str2 = eVar5.f83763c;
                    }
                    Integer num = eVar4.f83764d;
                    if (num == null) {
                        num = eVar5.f83764d;
                    }
                    PendingIntent pendingIntent = eVar4.f83765e;
                    if (pendingIntent == null) {
                        pendingIntent = eVar5.f83765e;
                    }
                    hh2.c cVar = eVar4.f83766f;
                    if (cVar == null) {
                        cVar = eVar5.f83766f;
                    }
                    hh2.c cVar2 = eVar4.f83767g;
                    if (cVar2 == null) {
                        cVar2 = eVar5.f83767g;
                    }
                    hh2.c cVar3 = eVar4.f83768h;
                    if (cVar3 == null) {
                        cVar3 = eVar5.f83768h;
                    }
                    Integer num2 = eVar4.f83769i;
                    if (num2 == null) {
                        num2 = eVar5.f83769i;
                    }
                    Integer num3 = num2;
                    Integer num4 = eVar4.f83770j;
                    if (num4 == null) {
                        num4 = eVar5.f83770j;
                    }
                    Integer num5 = num4;
                    Integer num6 = eVar4.f83771k;
                    if (num6 == null) {
                        num6 = eVar5.f83771k;
                    }
                    Integer num7 = num6;
                    Integer num8 = eVar4.f83772l;
                    if (num8 == null) {
                        num8 = eVar5.f83772l;
                    }
                    Integer num9 = num8;
                    Boolean bool = eVar4.f83773m;
                    if (bool == null) {
                        bool = eVar5.f83773m;
                    }
                    eVar2 = new e(i15, str, str2, num, pendingIntent, cVar, cVar2, cVar3, num3, num5, num7, num9, bool);
                }
                if (eVar2 == null) {
                    return;
                }
                foregroundServiceBroker.f50593d = eVar2;
                Notification notificationB2 = foregroundServiceBroker.b(eVar);
                Object systemService2 = foregroundServiceBroker.getSystemService("notification");
                if (systemService2 != null) {
                    ((NotificationManager) systemService2).notify(eVar.f83761a, notificationB2);
                } else {
                    x.l("null cannot be cast to non-null type android.app.NotificationManager");
                }
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
