package com.xiaomi.milink.transmit.core;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.b0d;
import defpackage.c0d;
import defpackage.l7q;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class UDTTransmitService extends Service {
    public l7q d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, byte[]> f13592a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13593b = 0;
    public byte[] c = new byte[0];
    public boolean e = false;

    public class a extends c0d.a {
        public a() {
        }

        @Override // defpackage.c0d
        public int A3(int i) throws RemoteException {
            int iD;
            synchronized (UDTTransmitService.this.c) {
                iD = UDTTransmitService.d(UDTTransmitService.this);
                UDTTransmitService.this.f13592a.put(Integer.valueOf(iD), new byte[i]);
            }
            return iD;
        }

        @Override // defpackage.c0d
        public int E(int i, int i2, int i3, int i4, byte[] bArr) throws RemoteException {
            return UDTTransmitService.this.d.t(i, i2, i3, i4, bArr);
        }

        @Override // defpackage.c0d
        public int M2(int i, int i2, int i3, int i4, boolean z) throws RemoteException {
            return UDTTransmitService.this.d.e(i, i2, i3, i4, z);
        }

        @Override // defpackage.c0d
        public int O3(int i, int i2, int i3, int i4, byte[] bArr) throws RemoteException {
            return UDTTransmitService.this.d.r(i, i2, i3, i4, bArr);
        }

        @Override // defpackage.c0d
        public int T4(int i, int i2, byte[] bArr, int i3) throws RemoteException {
            byte[] bArr2 = (byte[]) UDTTransmitService.this.f13592a.get(Integer.valueOf(i));
            if (bArr2 == null || bArr2.length < i2 + i3) {
                return -1;
            }
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            return 0;
        }

        @Override // defpackage.c0d
        public int d(int i) throws RemoteException {
            return UDTTransmitService.this.d.p(i);
        }

        @Override // defpackage.c0d
        public int d1(int i, int i2, int i3, int i4) throws RemoteException {
            return UDTTransmitService.this.d.a(i, i2, i3, i4);
        }

        @Override // defpackage.c0d
        public int d4(int i) throws RemoteException {
            return UDTTransmitService.this.d.b(i);
        }

        @Override // defpackage.c0d
        public int j0(int i, int i2, int i3, int i4, boolean z) throws RemoteException {
            return UDTTransmitService.this.d.q(i, i2, i3, i4, z);
        }

        @Override // defpackage.c0d
        public int l3(int i) throws RemoteException {
            return UDTTransmitService.this.d.u(i);
        }

        @Override // defpackage.c0d
        public int p3(int i, int i2, int i3, int i4, int i5) throws RemoteException {
            return UDTTransmitService.this.d.s(i, i2, i3, i4, (byte[]) UDTTransmitService.this.f13592a.remove(Integer.valueOf(i5)));
        }

        @Override // defpackage.c0d
        public int q(int i) throws RemoteException {
            return UDTTransmitService.this.d.d(i);
        }

        @Override // defpackage.c0d
        public int v4(int i, b0d b0dVar) throws RemoteException {
            return UDTTransmitService.this.d.m(i, b0dVar);
        }

        @Override // defpackage.c0d
        public int y2(int i) throws RemoteException {
            return UDTTransmitService.this.d.w(i);
        }
    }

    public static /* synthetic */ int d(UDTTransmitService uDTTransmitService) {
        int i = uDTTransmitService.f13593b + 1;
        uDTTransmitService.f13593b = i;
        return i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new a();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.d.c();
        this.d = null;
        this.f13592a.clear();
        this.e = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (!this.e) {
            l7q l7qVar = new l7q();
            this.d = l7qVar;
            l7qVar.v();
            this.d.u(6093);
            this.e = true;
        }
        super.onStartCommand(intent, i, i2);
        sendBroadcast(new Intent("com.xiaomi.milink.action.UDT_START"));
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
