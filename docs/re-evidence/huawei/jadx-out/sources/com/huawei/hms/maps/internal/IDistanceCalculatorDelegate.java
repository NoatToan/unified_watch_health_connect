package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.LatLng;

/* JADX INFO: loaded from: classes10.dex */
public interface IDistanceCalculatorDelegate extends IInterface {
    double computeDistanceBetween(LatLng latLng, LatLng latLng2);

    public static abstract class Stub extends Binder implements IDistanceCalculatorDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements IDistanceCalculatorDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14166a;

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.IDistanceCalculatorDelegate";
            }

            @Override // com.huawei.hms.maps.internal.IDistanceCalculatorDelegate
            public double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
                return mai.a(this.f14166a, "com.huawei.hms.maps.internal.IDistanceCalculatorDelegate", 1, 2, latLng, latLng2).doubleValue();
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14166a;
            }

            Proxy(IBinder iBinder) {
                this.f14166a = iBinder;
            }
        }

        public static IDistanceCalculatorDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.IDistanceCalculatorDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDistanceCalculatorDelegate)) ? new Proxy(iBinder) : (IDistanceCalculatorDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.internal.IDistanceCalculatorDelegate");
        }
    }
}
