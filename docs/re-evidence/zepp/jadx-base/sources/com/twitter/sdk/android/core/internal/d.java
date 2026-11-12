package com.twitter.sdk.android.core.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.twitter.sdk.android.core.Twitter;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
class d implements e {
    private static final String b = "com.android.vending";
    private static final String c = "com.google.android.gms.ads.identifier.service.START";
    private static final String d = "com.google.android.gms";
    private final Context a;

    public static final class b implements ServiceConnection {
        private static final int c = 200;
        private boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private b() {
            this.b = new LinkedBlockingQueue<>(1);
        }

        public IBinder a() {
            if (this.a) {
                Twitter.getLogger().e("Twitter", "getBinder already called");
            }
            this.a = true;
            try {
                return this.b.poll(200L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.b.clear();
        }
    }

    public static final class c implements IInterface {
        private static final int b = 0;
        private static final int c = 1;
        private static final int d = 2;
        private static final String e = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        private final IBinder a;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            boolean z = false;
            try {
                parcelObtain.writeInterfaceToken(e);
                parcelObtain.writeInt(1);
                this.a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z = true;
                }
            } catch (Exception unused) {
                Twitter.getLogger().d("Twitter", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
            return z;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String getId() throws RemoteException {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken(e);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Exception unused) {
                    Twitter.getLogger().d("Twitter", "Could not get parcel from Google Play Service to capture AdvertisingId");
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    string = null;
                }
                return string;
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }

        private c(IBinder iBinder) {
            this.a = iBinder;
        }
    }

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.twitter.sdk.android.core.internal.e
    public com.twitter.sdk.android.core.internal.a a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Twitter.getLogger().d("Twitter", "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b();
            Intent intent = new Intent(c);
            intent.setPackage("com.google.android.gms");
            try {
                if (this.a.bindService(intent, bVar, 1)) {
                    try {
                        c cVar = new c(bVar.a());
                        return new com.twitter.sdk.android.core.internal.a(cVar.getId(), cVar.d());
                    } catch (Exception e) {
                        Twitter.getLogger().w("Twitter", "Exception in binding to Google Play Service to capture AdvertisingId", e);
                        return null;
                    } finally {
                        this.a.unbindService(bVar);
                    }
                }
                Twitter.getLogger().d("Twitter", "Could not bind to Google Play Service to capture AdvertisingId");
            } catch (Throwable th) {
                Twitter.getLogger().d("Twitter", "Could not bind to Google Play Service to capture AdvertisingId", th);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Twitter.getLogger().d("Twitter", "Unable to find Google Play Services package name");
            return null;
        } catch (Exception e2) {
            Twitter.getLogger().d("Twitter", "Unable to determine if Google Play Services is available", e2);
            return null;
        }
    }
}
