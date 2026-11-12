package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
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
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cxg {

    @GuardedBy("sEnabledNotificationListenersLock")
    public static String d;

    @GuardedBy("sLock")
    public static e g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f14830b;
    public static final Object c = new Object();

    @GuardedBy("sEnabledNotificationListenersLock")
    public static Set<String> e = new HashSet();
    public static final Object f = new Object();

    @RequiresApi(24)
    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    @RequiresApi(26)
    public static class b {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    public static class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14832b;
        public final String c;
        public final Notification d;

        public c(String str, int i, String str2, Notification notification) {
            this.f14831a = str;
            this.f14832b = i;
            this.c = str2;
            this.d = notification;
        }

        @Override // cxg.f
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f14831a, this.f14832b, this.c, this.d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f14831a + ", id:" + this.f14832b + ", tag:" + this.c + "]";
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f14833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f14834b;

        public d(ComponentName componentName, IBinder iBinder) {
            this.f14833a = componentName;
            this.f14834b = iBinder;
        }
    }

    public static class e implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f14835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HandlerThread f14836b;
        public final Handler c;
        public final Map<ComponentName, a> d = new HashMap();
        public Set<String> e = new HashSet();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentName f14837a;
            public INotificationSideChannel c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f14838b = false;
            public ArrayDeque<f> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.f14837a = componentName;
            }
        }

        public e(Context context) {
            this.f14835a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f14836b = handlerThread;
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f14838b) {
                return true;
            }
            boolean zBindService = this.f14835a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f14837a), this, 33);
            aVar.f14838b = zBindService;
            if (zBindService) {
                aVar.e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.f14837a);
                this.f14835a.unbindService(this);
            }
            return aVar.f14838b;
        }

        public final void b(a aVar) {
            if (aVar.f14838b) {
                this.f14835a.unbindService(this);
                aVar.f14838b = false;
            }
            aVar.c = null;
        }

        public final void c(f fVar) {
            j();
            for (a aVar : this.d.values()) {
                aVar.d.add(fVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = this.d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.d.get(componentName);
            if (aVar != null) {
                aVar.c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = this.d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f14837a);
                sb.append(", ");
                sb.append(aVar.d.size());
                sb.append(" queued tasks");
            }
            if (aVar.d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.c == null) {
                i(aVar);
                return;
            }
            while (true) {
                f fVarPeek = aVar.d.peek();
                if (fVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Sending task ");
                        sb2.append(fVarPeek);
                    }
                    fVarPeek.a(aVar.c);
                    aVar.d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Remote service has died: ");
                        sb3.append(aVar.f14837a);
                    }
                } catch (RemoteException unused2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("RemoteException communicating with ");
                    sb4.append(aVar.f14837a);
                }
            }
            if (aVar.d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(f fVar) {
            this.c.obtainMessage(0, fVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c((f) message.obj);
                return true;
            }
            if (i == 1) {
                d dVar = (d) message.obj;
                e(dVar.f14833a, dVar.f14834b);
                return true;
            }
            if (i == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        public final void i(a aVar) {
            if (this.c.hasMessages(3, aVar.f14837a)) {
                return;
            }
            int i = aVar.e;
            int i2 = i + 1;
            aVar.e = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scheduling retry for ");
                    sb.append(i3);
                    sb.append(" ms");
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(3, aVar.f14837a), i3);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Giving up on delivering ");
            sb2.append(aVar.d.size());
            sb2.append(" tasks to ");
            sb2.append(aVar.f14837a);
            sb2.append(" after ");
            sb2.append(aVar.e);
            sb2.append(" retries");
            aVar.d.clear();
        }

        public final void j() {
            Set<String> setC = cxg.c(this.f14835a);
            if (setC.equals(this.e)) {
                return;
            }
            this.e = setC;
            List<ResolveInfo> listQueryIntentServices = this.f14835a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setC.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Permission present on component ");
                        sb.append(componentName);
                        sb.append(", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding listener record for ");
                        sb2.append(componentName2);
                    }
                    this.d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Removing listener record for ");
                        sb3.append(next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface f {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    public cxg(Context context) {
        this.f14829a = context;
        this.f14830b = (NotificationManager) context.getSystemService("notification");
    }

    public static cxg b(Context context) {
        return new cxg(context);
    }

    public static Set<String> c(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (c) {
            if (string != null) {
                try {
                    if (!string.equals(d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        e = hashSet;
                        d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = e;
        }
        return set;
    }

    public static boolean h(Notification notification) {
        Bundle bundleA = wwg.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f14830b);
    }

    public NotificationChannel d(String str) {
        return b.i(this.f14830b, str);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void e(int i, Notification notification) {
        f(null, i, notification);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void f(String str, int i, Notification notification) {
        if (!h(notification)) {
            this.f14830b.notify(str, i, notification);
        } else {
            g(new c(this.f14829a.getPackageName(), i, str, notification));
            this.f14830b.cancel(str, i);
        }
    }

    public final void g(f fVar) {
        synchronized (f) {
            try {
                if (g == null) {
                    g = new e(this.f14829a.getApplicationContext());
                }
                g.h(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
