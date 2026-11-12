package com.huawei.hms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.mai;

/* JADX INFO: loaded from: classes34.dex */
public interface IOnLocationChangeListener extends IInterface {
    void onLocationChange(Location location);

    public static abstract class Stub extends Binder implements IOnLocationChangeListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IOnLocationChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14172a;

            @Override // com.huawei.hms.maps.internal.IOnLocationChangeListener
            public void onLocationChange(Location location) {
                mai.a(this.f14172a, "com.huawei.hms.maps.internal.IOnLocationChangeListener", 1, location);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IOnLocationChangeListener";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14172a;
            }

            Proxy(IBinder iBinder) {
                this.f14172a = iBinder;
            }
        }

        public static IOnLocationChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IOnLocationChangeListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOnLocationChangeListener)) ? new Proxy(iBinder) : (IOnLocationChangeListener) iInterfaceQueryLocalInterface;
        }
    }
}
