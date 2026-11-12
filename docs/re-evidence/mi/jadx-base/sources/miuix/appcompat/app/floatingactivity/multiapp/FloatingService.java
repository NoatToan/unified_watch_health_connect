package miuix.appcompat.app.floatingactivity.multiapp;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteCallbackList<b> f26344a = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<LinkedList<String>> f26345b = new SparseArray<>();
    public final ConcurrentHashMap<String, Integer> c = new ConcurrentHashMap<>();
    public final miuix.appcompat.app.floatingactivity.multiapp.a d = new a();

    public class a extends miuix.appcompat.app.floatingactivity.multiapp.a.AbstractBinderC1023a {
        public a() {
        }

        @Override // miuix.appcompat.app.floatingactivity.multiapp.a
        public void I2(b bVar, String str) throws RemoteException {
            Pair<String, Integer> pairH4 = h4(str);
            String str2 = (String) pairH4.first;
            int iIntValue = ((Integer) pairH4.second).intValue();
            LinkedList linkedList = (LinkedList) FloatingService.this.f26345b.get(iIntValue);
            if (linkedList != null) {
                linkedList.remove(str2);
                if (linkedList.isEmpty()) {
                    FloatingService.this.f26345b.remove(iIntValue);
                }
            }
            FloatingService.this.f26344a.unregister(bVar);
            FloatingService.this.c.remove(str2);
        }

        @Override // miuix.appcompat.app.floatingactivity.multiapp.a
        public int J3(b bVar, String str) throws RemoteException {
            Pair<String, Integer> pairH4 = h4(str);
            String str2 = (String) pairH4.first;
            int iIntValue = ((Integer) pairH4.second).intValue();
            LinkedList linkedList = (LinkedList) FloatingService.this.f26345b.get(iIntValue);
            if (linkedList == null) {
                linkedList = new LinkedList();
                FloatingService.this.f26345b.put(iIntValue, linkedList);
            } else {
                linkedList.remove(str2);
            }
            FloatingService.this.f26344a.unregister(bVar);
            int registeredCallbackCount = FloatingService.this.f26344a.getRegisteredCallbackCount();
            FloatingService.this.f26344a.register(bVar, str2);
            linkedList.add(str2);
            return registeredCallbackCount;
        }

        @Override // miuix.appcompat.app.floatingactivity.multiapp.a
        public Bundle R4(int i, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            int i2 = 0;
            if (i == 6) {
                bundle2.putInt(String.valueOf(6), FloatingService.this.n(bundle != null ? bundle.getInt("key_task_id", 0) : 0));
            } else if (i != 7) {
                String string = null;
                if (i == 9) {
                    if (bundle != null) {
                        i2 = bundle.getInt("key_task_id", 0);
                        string = bundle.getString("key_request_identity");
                    }
                    bundle2.putBoolean("check_finishing", FloatingService.this.j(i, string, i2));
                } else if (i != 10) {
                    FloatingService.this.p(i);
                } else {
                    if (bundle != null) {
                        i2 = bundle.getInt("key_task_id", 0);
                        string = bundle.getString("execute_slide");
                    }
                    FloatingService.this.o(i, string, i2);
                }
            } else {
                String strL = FloatingService.this.l(bundle.getString("key_request_identity"), bundle.getInt("key_task_id", 0));
                int iBeginBroadcast = FloatingService.this.f26344a.beginBroadcast();
                while (i2 < iBeginBroadcast) {
                    if (TextUtils.equals(strL, FloatingService.this.f26344a.getBroadcastCookie(i2).toString())) {
                        ((b) FloatingService.this.f26344a.getBroadcastItem(i2)).P2(8, bundle);
                        break;
                    }
                    i2++;
                }
                FloatingService.this.f26344a.finishBroadcast();
            }
            return bundle2;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0022  */
        public final Pair<String, Integer> h4(String str) {
            String str2;
            int i = 0;
            if (TextUtils.isEmpty(str)) {
                str2 = null;
            } else {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length == 1) {
                    str2 = strArrSplit[0];
                } else if (strArrSplit.length >= 2) {
                    String str3 = strArrSplit[0];
                    try {
                        i = Integer.parseInt(strArrSplit[1]);
                    } catch (Exception unused) {
                    }
                    str2 = str3;
                } else {
                    str2 = null;
                }
            }
            return new Pair<>(str2, Integer.valueOf(FloatingService.this.m(i)));
        }

        @Override // miuix.appcompat.app.floatingactivity.multiapp.a
        public void i3(String str, int i) throws RemoteException {
            FloatingService.this.c.put((String) h4(str).first, Integer.valueOf(i));
        }
    }

    public final boolean j(int i, String str, int i2) throws RemoteException {
        boolean z = false;
        if (str == null) {
            return false;
        }
        try {
            int iBeginBroadcast = this.f26344a.beginBroadcast();
            String strK = k(str, i2);
            for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                if (TextUtils.equals(strK, this.f26344a.getBroadcastCookie(i3).toString())) {
                    z = ((b) this.f26344a.getBroadcastItem(i3)).P2(i, null).getBoolean("check_finishing");
                    break;
                }
            }
        } catch (RemoteException unused) {
        } finally {
            this.f26344a.finishBroadcast();
        }
        return z;
    }

    public final String k(String str, int i) {
        Integer num = this.c.get(str);
        int iIntValue = num == null ? -1 : num.intValue() + 1;
        for (String str2 : this.c.keySet()) {
            Integer num2 = this.c.get(str2);
            if (num2 != null && num2.intValue() == iIntValue) {
                return str2;
            }
        }
        LinkedList<String> linkedList = this.f26345b.get(m(i));
        if (linkedList != null) {
            boolean zEquals = false;
            for (String str3 : linkedList) {
                if (zEquals) {
                    return str3;
                }
                zEquals = TextUtils.equals(str, str3);
            }
        }
        return null;
    }

    public final String l(String str, int i) {
        LinkedList<String> linkedList = this.f26345b.get(m(i));
        String str2 = null;
        if (linkedList != null) {
            for (String str3 : linkedList) {
                if (TextUtils.equals(str, str3)) {
                    break;
                }
                str2 = str3;
            }
        }
        return str2;
    }

    public final int m(int i) {
        return (i != 0 || this.f26345b.size() <= 0) ? i : this.f26345b.keyAt(0);
    }

    public final int n(int i) {
        LinkedList<String> linkedList = this.f26345b.get(m(i));
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    public final void o(int i, String str, int i2) throws RemoteException {
        if (str == null) {
            return;
        }
        int iBeginBroadcast = this.f26344a.beginBroadcast();
        String strL = l(str, m(i2));
        for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
            if (TextUtils.equals(strL, this.f26344a.getBroadcastCookie(i3).toString())) {
                ((b) this.f26344a.getBroadcastItem(i3)).P2(i, null);
                break;
            }
        }
        this.f26344a.finishBroadcast();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.d.asBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        stopSelf();
        return super.onUnbind(intent);
    }

    public final void p(int i) throws RemoteException {
        int iBeginBroadcast = this.f26344a.beginBroadcast();
        for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
            ((b) this.f26344a.getBroadcastItem(i2)).P2(i, null);
        }
        this.f26344a.finishBroadcast();
    }
}
