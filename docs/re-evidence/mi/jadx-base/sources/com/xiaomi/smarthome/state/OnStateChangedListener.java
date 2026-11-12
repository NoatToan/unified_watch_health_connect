package com.xiaomi.smarthome.state;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes2.dex */
public interface OnStateChangedListener extends IInterface {

    public static abstract class Stub extends Binder implements OnStateChangedListener {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.state.OnStateChangedListener";
        static final int TRANSACTION_onStateChanged = 1;
        static final int TRANSACTION_onTimeChanged = 2;

        public static class Proxy implements OnStateChangedListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.xiaomi.smarthome.state.OnStateChangedListener, android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.smarthome.state.OnStateChangedListener
            public void onStateChanged(String str, String str2, Object obj, long j, byte b2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        ParcelUtils.writeValue(parcelObtain, obj);
                        parcelObtain.writeLong(j);
                        parcelObtain.writeByte(b2);
                        this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                    } catch (Exception e) {
                        MiJiaLog.writeLogOnAll(LogType.CARD, Stub.DESCRIPTOR, Log.getStackTraceString(e));
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.state.OnStateChangedListener
            public void onTimeChanged(String str, String str2, Object obj, long j, byte b2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                        parcelObtain.writeString(str);
                        parcelObtain.writeString(str2);
                        ParcelUtils.writeValue(parcelObtain, obj);
                        parcelObtain.writeLong(j);
                        parcelObtain.writeByte(b2);
                        this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                    } catch (Exception e) {
                        MiJiaLog.writeLogOnAll(LogType.CARD, Stub.DESCRIPTOR, Log.getStackTraceString(e));
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static OnStateChangedListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OnStateChangedListener)) ? new Proxy(iBinder) : (OnStateChangedListener) iInterfaceQueryLocalInterface;
        }

        @Override // com.xiaomi.smarthome.state.OnStateChangedListener, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onStateChanged(parcel.readString(), parcel.readString(), ParcelUtils.readValue(parcel, getClass().getClassLoader()), parcel.readLong(), parcel.readByte());
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onTimeChanged(parcel.readString(), parcel.readString(), ParcelUtils.readValue(parcel, getClass().getClassLoader()), parcel.readLong(), parcel.readByte());
            parcel2.writeNoException();
            return true;
        }
    }

    @Override // android.os.IInterface
    default IBinder asBinder() {
        return null;
    }

    default void onStateChanged(String str, String str2, Object obj, long j, byte b2) {
    }

    default void onTimeChanged(String str, String str2, Object obj, long j, byte b2) {
        onStateChanged(str, str2, obj, j, b2);
    }
}
