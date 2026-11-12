package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface vtc extends IInterface {

    public static abstract class a extends Binder implements vtc {
        static final int TRANSACTION_confirmMedicalId = 4;
        static final int TRANSACTION_delOriginalData = 5;
        static final int TRANSACTION_getHistoryMedicalIds = 2;
        static final int TRANSACTION_getTodayMedicalIds = 1;
        static final int TRANSACTION_getVersion = 6;
        static final int TRANSACTION_requestMedicalData = 3;

        /* JADX INFO: renamed from: vtc$a$a, reason: collision with other inner class name */
        public static class C1125a implements vtc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f37205a;

            public C1125a(IBinder iBinder) {
                this.f37205a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f37205a;
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fit.fitness.sync.export.IMedicalSyncForResearchRemote");
        }

        public static vtc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fit.fitness.sync.export.IMedicalSyncForResearchRemote");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vtc)) ? new C1125a(iBinder) : (vtc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fit.fitness.sync.export.IMedicalSyncForResearchRemote");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fit.fitness.sync.export.IMedicalSyncForResearchRemote");
                return true;
            }
            switch (i) {
                case 1:
                    getTodayMedicalIds(parcel.readString(), vnf.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    getHistoryMedicalIds(parcel.readString(), vnf.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    requestMedicalData(parcel.readString(), parcel.createByteArray(), wnf.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    confirmMedicalId(parcel.readString(), parcel.createByteArray(), vnf.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    delOriginalData(parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    int version = getVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(version);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void confirmMedicalId(String str, byte[] bArr, vnf vnfVar) throws RemoteException;

    void delOriginalData(byte[] bArr) throws RemoteException;

    void getHistoryMedicalIds(String str, vnf vnfVar) throws RemoteException;

    void getTodayMedicalIds(String str, vnf vnfVar) throws RemoteException;

    int getVersion() throws RemoteException;

    void requestMedicalData(String str, byte[] bArr, wnf wnfVar) throws RemoteException;
}
