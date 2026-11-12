package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.wearable.hm.m;

/* JADX INFO: loaded from: classes2.dex */
public interface etc extends IInterface {

    public static abstract class a extends Binder implements etc {
        static final int TRANSACTION_addHuamiApiChanageListener = 2;
        static final int TRANSACTION_getHuamiApi = 1;
        static final int TRANSACTION_removeHuamiApi = 3;

        /* JADX INFO: renamed from: etc$a$a, reason: collision with other inner class name */
        public static class C0928a implements etc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f17042a;

            public C0928a(IBinder iBinder) {
                this.f17042a = iBinder;
            }

            @Override // defpackage.etc
            public void addHuamiApiChanageListener(String str, dtc dtcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.common.connect.IHuamiApiService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(dtcVar);
                    this.f17042a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17042a;
            }

            @Override // defpackage.etc
            public m getHuamiApi(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.common.connect.IHuamiApiService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f17042a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return m.a.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.etc
            public void removeHuamiApi(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.common.connect.IHuamiApiService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f17042a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.common.connect.IHuamiApiService");
        }

        public static etc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.common.connect.IHuamiApiService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof etc)) ? new C0928a(iBinder) : (etc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.common.connect.IHuamiApiService");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.common.connect.IHuamiApiService");
                return true;
            }
            if (i == 1) {
                m huamiApi = getHuamiApi(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongInterface(huamiApi);
            } else if (i == 2) {
                addHuamiApiChanageListener(parcel.readString(), dtc.a.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                removeHuamiApi(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void addHuamiApiChanageListener(String str, dtc dtcVar) throws RemoteException;

    m getHuamiApi(String str, String str2) throws RemoteException;

    void removeHuamiApi(String str, String str2) throws RemoteException;
}
