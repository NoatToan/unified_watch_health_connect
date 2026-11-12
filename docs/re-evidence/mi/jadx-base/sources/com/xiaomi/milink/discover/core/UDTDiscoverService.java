package com.xiaomi.milink.discover.core;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.duokan.airkan.common.aidl.ParcelDeviceData;
import com.duokan.airkan.common.aidl.ParcelService;
import defpackage.a0d;
import defpackage.r6q;
import defpackage.zzc;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class UDTDiscoverService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r6q f13589a = null;

    public class a extends a0d.a {
        public a() {
        }

        @Override // defpackage.a0d
        public int N3(int i, zzc zzcVar) throws RemoteException {
            return UDTDiscoverService.this.f13589a.B(i, zzcVar);
        }

        @Override // defpackage.a0d
        public int Q0(int i, ParcelService parcelService) throws RemoteException {
            return UDTDiscoverService.this.f13589a.G(i, parcelService);
        }

        @Override // defpackage.a0d
        public int X1(int i, String str) throws RemoteException {
            return UDTDiscoverService.this.f13589a.N(i, str);
        }

        @Override // defpackage.a0d
        public int d(int i) throws RemoteException {
            return UDTDiscoverService.this.f13589a.K(i);
        }

        @Override // defpackage.a0d
        public int h1(String str, List<ParcelDeviceData> list) throws RemoteException {
            return UDTDiscoverService.this.f13589a.w(str, list);
        }

        @Override // defpackage.a0d
        public int h2(int i, String str) throws RemoteException {
            return UDTDiscoverService.this.f13589a.H(i, str);
        }

        @Override // defpackage.a0d
        public int m2(int i, String str) throws RemoteException {
            return UDTDiscoverService.this.f13589a.E(i, str);
        }

        @Override // defpackage.a0d
        public int s4(int i, ParcelService parcelService) throws RemoteException {
            return UDTDiscoverService.this.f13589a.M(i, parcelService);
        }

        @Override // defpackage.a0d
        public int z4(int i, String str) throws RemoteException {
            return UDTDiscoverService.this.f13589a.L(i, str);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new a();
    }

    @Override // android.app.Service
    public void onCreate() {
        r6q r6qVar = new r6q(this);
        this.f13589a = r6qVar;
        r6qVar.P();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f13589a.o();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
