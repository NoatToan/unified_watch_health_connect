package z6;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f202577d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c f202580g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f202582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f202576c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f202578e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f202579f = new Object();

    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f202584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f202585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Notification f202586d;

        public a(String str, int i14, String str2, Notification notification) {
            this.f202583a = str;
            this.f202584b = i14;
            this.f202585c = str2;
            this.f202586d = notification;
        }

        @Override // z6.a0.d
        public final void a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.f202583a, this.f202584b, this.f202585c, this.f202586d);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("NotifyTask[packageName:");
            sb3.append(this.f202583a);
            sb3.append(", id:");
            sb3.append(this.f202584b);
            sb3.append(", tag:");
            return am.j.o(this.f202585c, "]", sb3);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f202587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f202588b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f202587a = componentName;
            this.f202588b = iBinder;
        }
    }

    public static class c implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f202589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f202590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f202591c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set<String> f202592d = new HashSet();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentName f202593a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public INotificationSideChannel f202595c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f202594b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final ArrayDeque<d> f202596d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f202597e = 0;

            public a(ComponentName componentName) {
                this.f202593a = componentName;
            }
        }

        public c(Context context) {
            this.f202589a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f202590b = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z14;
            ArrayDeque<d> arrayDeque = aVar.f202596d;
            ComponentName componentName = aVar.f202593a;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
                arrayDeque.size();
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (aVar.f202594b) {
                z14 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f202589a;
                boolean zBindService = context.bindService(component, this, 33);
                aVar.f202594b = zBindService;
                if (zBindService) {
                    aVar.f202597e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z14 = aVar.f202594b;
            }
            if (!z14 || aVar.f202595c == null) {
                b(aVar);
                return;
            }
            while (true) {
                d dVarPeek = arrayDeque.peek();
                if (dVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        dVarPeek.toString();
                    }
                    dVarPeek.a(aVar.f202595c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(componentName);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            ComponentName componentName = aVar.f202593a;
            ArrayDeque<d> arrayDeque = aVar.f202596d;
            Handler handler = this.f202590b;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i14 = aVar.f202597e;
            int i15 = i14 + 1;
            aVar.f202597e = i15;
            if (i15 <= 6) {
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i14) * 1000);
                return;
            }
            arrayDeque.size();
            Objects.toString(componentName);
            arrayDeque.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i14 = message.what;
            Context context = this.f202589a;
            HashMap map = this.f202591c;
            if (i14 == 0) {
                d dVar = (d) message.obj;
                Set<String> setB = a0.b(context);
                if (!setB.equals(this.f202592d)) {
                    this.f202592d = setB;
                    List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : listQueryIntentServices) {
                        if (((HashSet) setB).contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                componentName.toString();
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet) {
                        if (!map.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Objects.toString(componentName2);
                            }
                            map.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Objects.toString(entry.getKey());
                            }
                            a aVar = (a) entry.getValue();
                            if (aVar.f202594b) {
                                context.unbindService(this);
                                aVar.f202594b = false;
                            }
                            aVar.f202595c = null;
                            it.remove();
                        }
                    }
                }
                for (a aVar2 : map.values()) {
                    aVar2.f202596d.add(dVar);
                    a(aVar2);
                }
            } else if (i14 == 1) {
                b bVar = (b) message.obj;
                ComponentName componentName3 = bVar.f202587a;
                IBinder iBinder = bVar.f202588b;
                a aVar3 = (a) map.get(componentName3);
                if (aVar3 != null) {
                    aVar3.f202595c = INotificationSideChannel.Stub.asInterface(iBinder);
                    aVar3.f202597e = 0;
                    a(aVar3);
                    return true;
                }
            } else if (i14 == 2) {
                a aVar4 = (a) map.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    if (aVar4.f202594b) {
                        context.unbindService(this);
                        aVar4.f202594b = false;
                    }
                    aVar4.f202595c = null;
                    return true;
                }
            } else {
                if (i14 != 3) {
                    return false;
                }
                a aVar5 = (a) map.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    a(aVar5);
                    return true;
                }
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f202590b.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f202590b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface d {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    private a0(Context context) {
        this.f202581a = context;
        this.f202582b = (NotificationManager) context.getSystemService("notification");
    }

    public static a0 a(Context context) {
        return new a0(context);
    }

    public static Set<String> b(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f202576c) {
            if (string != null) {
                try {
                    if (!string.equals(f202577d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f202578e = hashSet2;
                        f202577d = string;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            hashSet = f202578e;
        }
        return hashSet;
    }

    public final void c(int i14, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f202582b.notify(null, i14, notification);
            return;
        }
        a aVar = new a(this.f202581a.getPackageName(), i14, null, notification);
        synchronized (f202579f) {
            try {
                if (f202580g == null) {
                    f202580g = new c(this.f202581a.getApplicationContext());
                }
                f202580g.f202590b.obtainMessage(0, aVar).sendToTarget();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f202582b.cancel(null, i14);
    }

    public a0(NotificationManager notificationManager, Context context) {
        this.f202581a = context;
        this.f202582b = notificationManager;
    }
}
