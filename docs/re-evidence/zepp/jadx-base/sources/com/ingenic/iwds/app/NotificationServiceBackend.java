package com.ingenic.iwds.app;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public class NotificationServiceBackend {
    public INotificationServiceBackend b = new b();
    private Handler a = new a();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                NotificationServiceBackend.this.onCancelAll(((c) message.obj).a);
            } else if (i == 19) {
                c cVar = (c) message.obj;
                NotificationServiceBackend.this.onHandle(cVar.a, cVar.b, cVar.c);
            } else {
                if (i != 87) {
                    return;
                }
                c cVar2 = (c) message.obj;
                NotificationServiceBackend.this.onCancel(cVar2.a, cVar2.b);
            }
        }
    }

    public class b extends INotificationServiceBackend.Stub {
        public b() {
        }

        @Override // com.ingenic.iwds.app.INotificationServiceBackend
        public void onCancelAllNotification(String str) throws RemoteException {
            Message.obtain(NotificationServiceBackend.this.a, 3, NotificationServiceBackend.this.new c(str, 0, null)).sendToTarget();
        }

        @Override // com.ingenic.iwds.app.INotificationServiceBackend
        public void onCancelNotification(String str, int i) throws RemoteException {
            Message.obtain(NotificationServiceBackend.this.a, 87, NotificationServiceBackend.this.new c(str, i, null)).sendToTarget();
        }

        @Override // com.ingenic.iwds.app.INotificationServiceBackend
        public boolean onHandleNotification(String str, int i, Note note) throws RemoteException {
            Message.obtain(NotificationServiceBackend.this.a, 19, NotificationServiceBackend.this.new c(str, i, note)).sendToTarget();
            return true;
        }
    }

    public class c {
        public String a;
        public int b;
        public Note c;

        public c(String str, int i, Note note) {
            this.a = str;
            this.b = i;
            this.c = note;
        }
    }

    public void onCancel(String str, int i) {
    }

    public void onCancelAll(String str) {
    }

    public boolean onHandle(String str, int i, Note note) {
        return true;
    }
}
