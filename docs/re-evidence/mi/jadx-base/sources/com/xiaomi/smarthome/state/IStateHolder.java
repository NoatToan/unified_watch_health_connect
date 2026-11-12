package com.xiaomi.smarthome.state;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IStateHolder extends IInterface {

    public static abstract class Stub extends Binder implements IStateHolder {
        private static final String DESCRIPTOR = "com.xiaomi.smarthome.state.IStateHolder";
        static final int TRANSACTION_getProp = 5;
        static final int TRANSACTION_getPropsMap = 4;
        static final int TRANSACTION_loadPropsFromLocal = 3;
        static final int TRANSACTION_notifyPropChangedListener = 6;
        static final int TRANSACTION_registerStateChangedListener = 1;
        static final int TRANSACTION_removePropMap = 7;
        static final int TRANSACTION_savePropsCache = 2;

        public static class Proxy implements IStateHolder {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xiaomi.smarthome.state.IStateHolder
            public ValueEntry getProp(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return Stub.readValueEntry(parcelObtain2);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.state.IStateHolder
            public Map<String, ValueEntry> getPropsMap(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    HashMap map = i < 0 ? null : new HashMap();
                    for (int i2 = 0; i2 < i; i2++) {
                        map.put(parcelObtain2.readString(), Stub.readValueEntry(parcelObtain2));
                    }
                    return map;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.state.IStateHolder
            public void loadPropsFromLocal() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.state.IStateHolder
            public Object notifyPropChangedListener(String str, String str2, Object obj, long j, byte b2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    ParcelUtils.writeValue(parcelObtain, obj);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeByte(b2);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return ParcelUtils.readValue(parcelObtain2, getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.state.IStateHolder
            public void registerStateChangedListener(OnStateChangedListener onStateChangedListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(onStateChangedListener != null ? onStateChangedListener.asBinder() : null);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.state.IStateHolder
            public void removePropMap(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.smarthome.state.IStateHolder
            public void savePropsCache() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IStateHolder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IStateHolder)) ? new Proxy(iBinder) : (IStateHolder) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ValueEntry readValueEntry(Parcel parcel) {
            if (parcel.readByte() == -1) {
                return null;
            }
            return new ValueEntry(parcel);
        }

        private static void writeValueEntry(Parcel parcel, ValueEntry valueEntry, int i) {
            if (valueEntry == null) {
                parcel.writeByte((byte) -1);
            } else {
                parcel.writeByte((byte) 1);
                valueEntry.writeToParcel(parcel, i);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerStateChangedListener(OnStateChangedListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    savePropsCache();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    loadPropsFromLocal();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    Map<String, ValueEntry> propsMap = getPropsMap(parcel.readString());
                    parcel2.writeNoException();
                    if (propsMap == null) {
                        parcel2.writeInt(-1);
                    } else {
                        parcel2.writeInt(propsMap.size());
                        for (Map.Entry<String, ValueEntry> entry : propsMap.entrySet()) {
                            parcel2.writeString(entry.getKey());
                            writeValueEntry(parcel2, entry.getValue(), i2);
                        }
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    ValueEntry prop = getProp(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    writeValueEntry(parcel2, prop, i2);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    Object objNotifyPropChangedListener = notifyPropChangedListener(parcel.readString(), parcel.readString(), ParcelUtils.readValue(parcel, getClass().getClassLoader()), parcel.readLong(), parcel.readByte());
                    parcel2.writeNoException();
                    ParcelUtils.writeValue(parcel2, objNotifyPropChangedListener);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    removePropMap(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    ValueEntry getProp(String str, String str2) throws RemoteException;

    Map<String, ValueEntry> getPropsMap(String str) throws RemoteException;

    void loadPropsFromLocal() throws RemoteException;

    Object notifyPropChangedListener(String str, String str2, Object obj, long j, byte b2) throws RemoteException;

    void registerStateChangedListener(OnStateChangedListener onStateChangedListener) throws RemoteException;

    void removePropMap(String str) throws RemoteException;

    void savePropsCache() throws RemoteException;
}
