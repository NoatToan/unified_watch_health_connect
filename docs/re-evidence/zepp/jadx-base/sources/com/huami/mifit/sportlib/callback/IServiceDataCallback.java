package com.huami.mifit.sportlib.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IServiceDataCallback extends IInterface {

    public static class Default implements IServiceDataCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onAltitudeChanged(float f) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onAvgPaceChanged(float f) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onCalorieChanged(float f) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onClimbAscendChanged(float f) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onDistanceChanged(float f) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onFinish() throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onGPSLineInfoChanged(List<GPSPoint> list, RouteLineInfo routeLineInfo) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onHrChanged(int i, int i2) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onLocationChanged(GPSPoint gPSPoint) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onPaceChanged(float f) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onSportControl(int i, int i2) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onSportTimeChanged(long j) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onStepChanged(int i) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onStepFreqChanged(float f) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onTestLocationChanged(GPSPoint gPSPoint) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceDataCallback {
        private static final String a = "com.huami.mifit.sportlib.callback.IServiceDataCallback";
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;
        public static final int g = 6;
        public static final int h = 7;
        public static final int i = 8;
        public static final int j = 9;
        public static final int k = 10;
        public static final int l = 11;
        public static final int m = 12;
        public static final int n = 13;
        public static final int o = 14;
        public static final int p = 15;

        public static class a implements IServiceDataCallback {
            public static IServiceDataCallback b;
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String d() {
                return Stub.a;
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onAltitudeChanged(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeFloat(f);
                    if (this.a.transact(9, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAltitudeChanged(f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onAvgPaceChanged(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeFloat(f);
                    if (this.a.transact(13, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onAvgPaceChanged(f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onCalorieChanged(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeFloat(f);
                    if (this.a.transact(14, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onCalorieChanged(f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onClimbAscendChanged(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeFloat(f);
                    if (this.a.transact(15, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onClimbAscendChanged(f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onDistanceChanged(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeFloat(f);
                    if (this.a.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onDistanceChanged(f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onFinish() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (this.a.transact(12, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onFinish();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onGPSLineInfoChanged(List<GPSPoint> list, RouteLineInfo routeLineInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeTypedList(list);
                    if (routeLineInfo != null) {
                        parcelObtain.writeInt(1);
                        routeLineInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.a.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onGPSLineInfoChanged(list, routeLineInfo);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onHrChanged(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.a.transact(11, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onHrChanged(i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onLocationChanged(GPSPoint gPSPoint) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (gPSPoint != null) {
                        parcelObtain.writeInt(1);
                        gPSPoint.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.a.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onLocationChanged(gPSPoint);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onPaceChanged(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeFloat(f);
                    if (this.a.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onPaceChanged(f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onSportControl(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.a.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSportControl(i, i2);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onSportTimeChanged(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeLong(j);
                    if (this.a.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onSportTimeChanged(j);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onStepChanged(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (this.a.transact(10, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onStepChanged(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onStepFreqChanged(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeFloat(f);
                    if (this.a.transact(8, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onStepFreqChanged(f);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
            public void onTestLocationChanged(GPSPoint gPSPoint) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (gPSPoint != null) {
                        parcelObtain.writeInt(1);
                        gPSPoint.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.a.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onTestLocationChanged(gPSPoint);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IServiceDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceDataCallback)) ? new a(iBinder) : (IServiceDataCallback) iInterfaceQueryLocalInterface;
        }

        public static IServiceDataCallback getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IServiceDataCallback iServiceDataCallback) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iServiceDataCallback == null) {
                return false;
            }
            a.b = iServiceDataCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString(a);
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface(a);
                    onSportTimeChanged(parcel.readLong());
                    return true;
                case 2:
                    parcel.enforceInterface(a);
                    onTestLocationChanged(parcel.readInt() != 0 ? GPSPoint.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3:
                    parcel.enforceInterface(a);
                    onSportControl(parcel.readInt(), parcel.readInt());
                    return true;
                case 4:
                    parcel.enforceInterface(a);
                    onLocationChanged(parcel.readInt() != 0 ? GPSPoint.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface(a);
                    onGPSLineInfoChanged(parcel.createTypedArrayList(GPSPoint.CREATOR), parcel.readInt() != 0 ? RouteLineInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 6:
                    parcel.enforceInterface(a);
                    onPaceChanged(parcel.readFloat());
                    return true;
                case 7:
                    parcel.enforceInterface(a);
                    onDistanceChanged(parcel.readFloat());
                    return true;
                case 8:
                    parcel.enforceInterface(a);
                    onStepFreqChanged(parcel.readFloat());
                    return true;
                case 9:
                    parcel.enforceInterface(a);
                    onAltitudeChanged(parcel.readFloat());
                    return true;
                case 10:
                    parcel.enforceInterface(a);
                    onStepChanged(parcel.readInt());
                    return true;
                case 11:
                    parcel.enforceInterface(a);
                    onHrChanged(parcel.readInt(), parcel.readInt());
                    return true;
                case 12:
                    parcel.enforceInterface(a);
                    onFinish();
                    return true;
                case 13:
                    parcel.enforceInterface(a);
                    onAvgPaceChanged(parcel.readFloat());
                    return true;
                case 14:
                    parcel.enforceInterface(a);
                    onCalorieChanged(parcel.readFloat());
                    return true;
                case 15:
                    parcel.enforceInterface(a);
                    onClimbAscendChanged(parcel.readFloat());
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void onAltitudeChanged(float f) throws RemoteException;

    void onAvgPaceChanged(float f) throws RemoteException;

    void onCalorieChanged(float f) throws RemoteException;

    void onClimbAscendChanged(float f) throws RemoteException;

    void onDistanceChanged(float f) throws RemoteException;

    void onFinish() throws RemoteException;

    void onGPSLineInfoChanged(List<GPSPoint> list, RouteLineInfo routeLineInfo) throws RemoteException;

    void onHrChanged(int i, int i2) throws RemoteException;

    void onLocationChanged(GPSPoint gPSPoint) throws RemoteException;

    void onPaceChanged(float f) throws RemoteException;

    void onSportControl(int i, int i2) throws RemoteException;

    void onSportTimeChanged(long j) throws RemoteException;

    void onStepChanged(int i) throws RemoteException;

    void onStepFreqChanged(float f) throws RemoteException;

    void onTestLocationChanged(GPSPoint gPSPoint) throws RemoteException;
}
