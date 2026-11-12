package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface nl5 extends IInterface {

    public static abstract class a extends Binder implements nl5 {
        static final int TRANSACTION_handleDataInternal = 1;
        static final int TRANSACTION_handlePacketInternal = 2;
        static final int TRANSACTION_handleWearData = 3;

        /* JADX INFO: renamed from: nl5$a$a, reason: collision with other inner class name */
        public static class C1048a implements nl5 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f28032a;

            public C1048a(IBinder iBinder) {
                this.f28032a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28032a;
            }

            @Override // defpackage.nl5
            public boolean handleDataInternal(String str, int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.export.DataHandlerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.f28032a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.nl5
            public boolean handlePacketInternal(String str, int i, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.device.contact.export.DataHandlerRemote");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeByteArray(bArr);
                    this.f28032a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.device.contact.export.DataHandlerRemote");
        }

        public static nl5 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.device.contact.export.DataHandlerRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof nl5)) ? new C1048a(iBinder) : (nl5) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.device.contact.export.DataHandlerRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.device.contact.export.DataHandlerRemote");
                return true;
            }
            if (i == 1) {
                boolean zHandleDataInternal = handleDataInternal(parcel.readString(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeInt(zHandleDataInternal ? 1 : 0);
            } else if (i == 2) {
                boolean zHandlePacketInternal = handlePacketInternal(parcel.readString(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeInt(zHandlePacketInternal ? 1 : 0);
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                handleWearData(parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    boolean handleDataInternal(String str, int i, byte[] bArr) throws RemoteException;

    boolean handlePacketInternal(String str, int i, byte[] bArr) throws RemoteException;

    void handleWearData(String str, String str2, byte[] bArr) throws RemoteException;
}
