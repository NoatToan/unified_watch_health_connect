package com.huawei.hms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.mai;
import com.huawei.hms.maps.model.CoordinateLatLng;

/* JADX INFO: loaded from: classes10.dex */
public interface ICoordinateConverterDelegate extends IInterface {
    CoordinateLatLng[] rectifyCoordinate(CoordinateLatLng[] coordinateLatLngArr);

    public static abstract class Stub extends Binder implements ICoordinateConverterDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements ICoordinateConverterDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14164a;

            @Override // com.huawei.hms.maps.internal.ICoordinateConverterDelegate
            public CoordinateLatLng[] rectifyCoordinate(CoordinateLatLng[] coordinateLatLngArr) {
                return mai.a(coordinateLatLngArr, this.f14164a, "com.huawei.hms.maps.internal.ICoordinateConverterDelegate", 1);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.internal.ICoordinateConverterDelegate";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14164a;
            }

            Proxy(IBinder iBinder) {
                this.f14164a = iBinder;
            }
        }

        public static ICoordinateConverterDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.internal.ICoordinateConverterDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ICoordinateConverterDelegate)) ? new Proxy(iBinder) : (ICoordinateConverterDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.internal.ICoordinateConverterDelegate");
        }
    }
}
