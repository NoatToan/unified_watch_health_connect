package com.ingenic.iwds.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.ingenic.iwds.utils.IwdsLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class NotificationProxyService extends Service {
    private NotificationProxyServiceStub a = new NotificationProxyServiceStub();

    public class NotificationProxyServiceStub extends INotificationProxyService.Stub {
        private a a;
        private HashMap<String, String> b;

        public class a {
            private ArrayList<C0722a> a = new ArrayList<>();

            /* JADX INFO: renamed from: com.ingenic.iwds.app.NotificationProxyService$NotificationProxyServiceStub$a$a, reason: collision with other inner class name */
            public final class C0722a implements IBinder.DeathRecipient {
                public INotificationServiceBackend a;
                public String b;

                public C0722a(INotificationServiceBackend iNotificationServiceBackend, String str) {
                    this.a = iNotificationServiceBackend;
                    this.b = str;
                }

                @Override // android.os.IBinder.DeathRecipient
                public void binderDied() {
                    IwdsLog.e("NotificationProxyService", "Backend died: " + this.b);
                    synchronized (this.a) {
                        a.this.a.remove(this);
                    }
                }
            }

            public a() {
            }

            public int a() {
                return this.a.size();
            }

            public INotificationServiceBackend b(int i) {
                return this.a.get(i).a;
            }

            public INotificationServiceBackend c(String str) {
                for (C0722a c0722a : this.a) {
                    if (c0722a.b.equals(str)) {
                        return c0722a.a;
                    }
                }
                return null;
            }

            public boolean e(INotificationServiceBackend iNotificationServiceBackend) {
                C0722a next;
                Iterator<C0722a> it2 = this.a.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!next.a.equals(iNotificationServiceBackend));
                if (next == null) {
                    return false;
                }
                this.a.remove(next);
                next.a.asBinder().unlinkToDeath(next, 0);
                return true;
            }

            public boolean f(INotificationServiceBackend iNotificationServiceBackend, String str) {
                if (c(str) != null) {
                    return false;
                }
                IBinder iBinderAsBinder = iNotificationServiceBackend.asBinder();
                try {
                    C0722a c0722a = new C0722a(iNotificationServiceBackend, str);
                    iBinderAsBinder.linkToDeath(c0722a, 0);
                    this.a.add(c0722a);
                    return true;
                } catch (RemoteException unused) {
                    return false;
                }
            }

            public void g() {
            }
        }

        public NotificationProxyServiceStub() {
            synchronized (this) {
                this.a = new a();
                HashMap<String, String> map = new HashMap<>();
                this.b = map;
                map.put("com.ingenic.launcher", "9207c288-dd9f-8fdd-0b88-3ea582bbbeb2");
                this.b.put("com.ingenic.iwds.test.notificationproxyservice.backend", "396bdc12-b834-bc70-f12c-1196ce75f99c");
            }
        }

        @Override // com.ingenic.iwds.app.INotificationProxyService
        public void cancel(String str, int i) throws RemoteException {
            synchronized (this) {
                int iA = this.a.a();
                for (int i2 = 0; i2 < iA; i2++) {
                    try {
                        this.a.b(i2).onCancelNotification(str, i);
                    } catch (RemoteException unused) {
                    }
                }
                this.a.g();
            }
        }

        @Override // com.ingenic.iwds.app.INotificationProxyService
        public void cancelAll(String str) throws RemoteException {
            synchronized (this) {
                int iA = this.a.a();
                for (int i = 0; i < iA; i++) {
                    try {
                        this.a.b(i).onCancelAllNotification(str);
                    } catch (RemoteException unused) {
                    }
                }
                this.a.g();
            }
        }

        @Override // com.ingenic.iwds.app.INotificationProxyService
        public boolean notify(String str, int i, Note note) throws RemoteException {
            synchronized (this) {
                int iA = this.a.a();
                for (int i2 = 0; i2 < iA; i2++) {
                    try {
                        this.a.b(i2).onHandleNotification(str, i, note);
                    } catch (RemoteException unused) {
                    }
                }
                this.a.g();
            }
            return true;
        }

        @Override // com.ingenic.iwds.app.INotificationProxyService
        public boolean registerBackend(INotificationServiceBackend iNotificationServiceBackend, String str, String str2) throws RemoteException {
            synchronized (this) {
                String str3 = this.b.get(str);
                if (str3 != null && str3.equals(str2)) {
                    if (this.a.c(str) == null) {
                        return this.a.f(iNotificationServiceBackend, str);
                    }
                    IwdsLog.e(this, "Already registered applicant: " + str);
                    return false;
                }
                IwdsLog.e(this, "Unqualified applicant: " + str);
                return false;
            }
        }

        @Override // com.ingenic.iwds.app.INotificationProxyService
        public boolean unregisterBackend(String str, String str2) throws RemoteException {
            synchronized (this) {
                String str3 = this.b.get(str);
                if (str3 != null && str3.equals(str2)) {
                    INotificationServiceBackend iNotificationServiceBackendC = this.a.c(str);
                    if (iNotificationServiceBackendC != null) {
                        return this.a.e(iNotificationServiceBackendC);
                    }
                    IwdsLog.e(this, "No such backend: " + str);
                    return false;
                }
                IwdsLog.e(this, "Unqualified applicant: " + str);
                return false;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
