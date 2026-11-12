package com.huami.mifit.sportlib;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huami.mifit.sportlib.callback.IServiceDataCallback;
import com.huami.mifit.sportlib.callback.IServiceSportCallback;

/* JADX INFO: loaded from: classes11.dex */
public interface IServiceObtain extends IInterface {

    public static class Default implements IServiceObtain {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void changeSportType(int i) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public String getGPSProvider() throws RemoteException {
            return null;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public int getGPSSignalLevel() throws RemoteException {
            return 0;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public int getSportState() throws RemoteException {
            return 0;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public int getSportType() throws RemoteException {
            return 0;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public long getTickerTimeInMillisecond() throws RemoteException {
            return 0L;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public long getTrackId() throws RemoteException {
            return 0L;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public int getUserOpState() throws RemoteException {
            return 0;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void pauseSport(int i) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void recoverRun(long j) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void registerDataCallback(IServiceDataCallback iServiceDataCallback) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void registerSportCallback(IServiceSportCallback iServiceSportCallback) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void restoreGpsLine() throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void resumeSport(int i) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void setLocationProvider(LocationProvider locationProvider) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public long startSport(int i) throws RemoteException {
            return 0L;
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void stopSport(int i) throws RemoteException {
        }

        @Override // com.huami.mifit.sportlib.IServiceObtain
        public void verifyIndoorDistance(int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IServiceObtain {
        private static final String a = "com.huami.mifit.sportlib.IServiceObtain";
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
        public static final int q = 16;
        public static final int r = 17;
        public static final int s = 18;

        public static class a implements IServiceObtain {
            public static IServiceObtain b;
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void changeSportType(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (this.a.transact(6, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().changeSportType(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String d() {
                return Stub.a;
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public String getGPSProvider() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(18, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getGPSProvider();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public int getGPSSignalLevel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getGPSSignalLevel();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public int getSportState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSportState();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public int getSportType() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(14, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSportType();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public long getTickerTimeInMillisecond() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(16, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTickerTimeInMillisecond();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public long getTrackId() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(17, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTrackId();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public int getUserOpState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (!this.a.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUserOpState();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void pauseSport(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (this.a.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().pauseSport(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void recoverRun(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeLong(j);
                    if (this.a.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().recoverRun(j);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void registerDataCallback(IServiceDataCallback iServiceDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iServiceDataCallback != null ? iServiceDataCallback.asBinder() : null);
                    if (this.a.transact(8, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().registerDataCallback(iServiceDataCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void registerSportCallback(IServiceSportCallback iServiceSportCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iServiceSportCallback != null ? iServiceSportCallback.asBinder() : null);
                    if (this.a.transact(9, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().registerSportCallback(iServiceSportCallback);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void restoreGpsLine() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (this.a.transact(5, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().restoreGpsLine();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void resumeSport(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (this.a.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().resumeSport(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void setLocationProvider(LocationProvider locationProvider) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(locationProvider != null ? locationProvider.asBinder() : null);
                    if (this.a.transact(10, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().setLocationProvider(locationProvider);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public long startSport(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (!this.a.transact(15, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startSport(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void stopSport(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (this.a.transact(4, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().stopSport(i);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.mifit.sportlib.IServiceObtain
            public void verifyIndoorDistance(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeInt(i);
                    if (this.a.transact(7, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().verifyIndoorDistance(i);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IServiceObtain asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IServiceObtain)) ? new a(iBinder) : (IServiceObtain) iInterfaceQueryLocalInterface;
        }

        public static IServiceObtain getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IServiceObtain iServiceObtain) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iServiceObtain == null) {
                return false;
            }
            a.b = iServiceObtain;
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
                    recoverRun(parcel.readLong());
                    return true;
                case 2:
                    parcel.enforceInterface(a);
                    pauseSport(parcel.readInt());
                    return true;
                case 3:
                    parcel.enforceInterface(a);
                    resumeSport(parcel.readInt());
                    return true;
                case 4:
                    parcel.enforceInterface(a);
                    stopSport(parcel.readInt());
                    return true;
                case 5:
                    parcel.enforceInterface(a);
                    restoreGpsLine();
                    return true;
                case 6:
                    parcel.enforceInterface(a);
                    changeSportType(parcel.readInt());
                    return true;
                case 7:
                    parcel.enforceInterface(a);
                    verifyIndoorDistance(parcel.readInt());
                    return true;
                case 8:
                    parcel.enforceInterface(a);
                    registerDataCallback(IServiceDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    parcel.enforceInterface(a);
                    registerSportCallback(IServiceSportCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 10:
                    parcel.enforceInterface(a);
                    setLocationProvider(LocationProvider.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 11:
                    parcel.enforceInterface(a);
                    int gPSSignalLevel = getGPSSignalLevel();
                    parcel2.writeNoException();
                    parcel2.writeInt(gPSSignalLevel);
                    return true;
                case 12:
                    parcel.enforceInterface(a);
                    int sportState = getSportState();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportState);
                    return true;
                case 13:
                    parcel.enforceInterface(a);
                    int userOpState = getUserOpState();
                    parcel2.writeNoException();
                    parcel2.writeInt(userOpState);
                    return true;
                case 14:
                    parcel.enforceInterface(a);
                    int sportType = getSportType();
                    parcel2.writeNoException();
                    parcel2.writeInt(sportType);
                    return true;
                case 15:
                    parcel.enforceInterface(a);
                    long jStartSport = startSport(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jStartSport);
                    return true;
                case 16:
                    parcel.enforceInterface(a);
                    long tickerTimeInMillisecond = getTickerTimeInMillisecond();
                    parcel2.writeNoException();
                    parcel2.writeLong(tickerTimeInMillisecond);
                    return true;
                case 17:
                    parcel.enforceInterface(a);
                    long trackId = getTrackId();
                    parcel2.writeNoException();
                    parcel2.writeLong(trackId);
                    return true;
                case 18:
                    parcel.enforceInterface(a);
                    String gPSProvider = getGPSProvider();
                    parcel2.writeNoException();
                    parcel2.writeString(gPSProvider);
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void changeSportType(int i) throws RemoteException;

    String getGPSProvider() throws RemoteException;

    int getGPSSignalLevel() throws RemoteException;

    int getSportState() throws RemoteException;

    int getSportType() throws RemoteException;

    long getTickerTimeInMillisecond() throws RemoteException;

    long getTrackId() throws RemoteException;

    int getUserOpState() throws RemoteException;

    void pauseSport(int i) throws RemoteException;

    void recoverRun(long j) throws RemoteException;

    void registerDataCallback(IServiceDataCallback iServiceDataCallback) throws RemoteException;

    void registerSportCallback(IServiceSportCallback iServiceSportCallback) throws RemoteException;

    void restoreGpsLine() throws RemoteException;

    void resumeSport(int i) throws RemoteException;

    void setLocationProvider(LocationProvider locationProvider) throws RemoteException;

    long startSport(int i) throws RemoteException;

    void stopSport(int i) throws RemoteException;

    void verifyIndoorDistance(int i) throws RemoteException;
}
