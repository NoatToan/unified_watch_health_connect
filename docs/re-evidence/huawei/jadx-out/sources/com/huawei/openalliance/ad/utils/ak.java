package com.huawei.openalliance.ad.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.openalliance.ad.hw;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class ak {

    static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f20405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f20406b;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            hw.a("GaidUtil", "onServiceDisconnected %d", Long.valueOf(System.currentTimeMillis()));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                hw.a("GaidUtil", "onServiceConnected %d", Long.valueOf(System.currentTimeMillis()));
                if (iBinder != null) {
                    this.f20406b.put(iBinder);
                }
            } catch (InterruptedException unused) {
                hw.c("GaidUtil", "onServiceConnected InterruptedException " + System.currentTimeMillis());
            }
        }

        public IBinder a() {
            if (this.f20405a) {
                throw new IllegalStateException();
            }
            this.f20405a = true;
            return this.f20406b.poll(100L, TimeUnit.MILLISECONDS);
        }

        private b() {
            this.f20405a = false;
            this.f20406b = new LinkedBlockingQueue<>(1);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f20404b;

        public boolean b() {
            return this.f20404b;
        }

        public String a() {
            return this.f20403a;
        }

        a(String str, boolean z) {
            this.f20403a = str;
            this.f20404b = z;
        }
    }

    static final class c implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f20407a;

        public boolean b() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f20407a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f20407a;
        }

        public String a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f20407a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public c(IBinder iBinder) {
            this.f20407a = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d(Context context) {
        String str;
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            hw.a("GaidUtil", "bind ok");
            try {
                try {
                    IBinder iBinderA = bVar.a();
                    if (iBinderA == null) {
                        return null;
                    }
                    c cVar = new c(iBinderA);
                    a aVar = new a(cVar.a(), cVar.b());
                    hw.a("GaidUtil", "gaid: %s", dg.i(aVar.f20403a));
                    return aVar;
                } finally {
                    context.unbindService(bVar);
                }
            } catch (RemoteException unused) {
                str = "bind gms service RemoteException";
                hw.d("GaidUtil", str);
                context.unbindService(bVar);
                return null;
            } catch (IllegalStateException unused2) {
                str = "bind gms service IllegalStateException";
                hw.d("GaidUtil", str);
                context.unbindService(bVar);
                return null;
            } catch (InterruptedException unused3) {
                str = "bind gms service InterruptedException";
                hw.d("GaidUtil", str);
                context.unbindService(bVar);
                return null;
            }
        }
        hw.a("GaidUtil", "bind failed");
        return null;
    }

    public static boolean b(Context context) {
        return !com.huawei.openalliance.ad.cc.a(context).d();
    }

    public static a a(final Context context) {
        final cn cnVarA = cn.a(context);
        if (cnVarA == null) {
            return null;
        }
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ak.1
            @Override // java.lang.Runnable
            public void run() {
                a aVarD = ak.d(context);
                if (aVarD != null) {
                    cnVarA.E(aVarD.a());
                    cnVarA.a(Boolean.valueOf(aVarD.b()));
                }
            }
        });
        String strJ = cnVarA.J();
        Boolean boolK = cnVarA.K();
        if (dg.b(strJ) || boolK == null) {
            return null;
        }
        return new a(strJ, boolK.booleanValue());
    }
}
