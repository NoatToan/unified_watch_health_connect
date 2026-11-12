package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface wsc extends IInterface {

    public static abstract class a extends Binder implements wsc {
        public a() {
            attachInterface(this, "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
            }
            if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService");
                return true;
            }
            if (i == 1) {
                a2(parcel.readString(), parcel.readString(), lyc.a.s2(parcel.readStrongBinder()));
            } else if (i == 2) {
                c1(parcel.readString(), vsc.a.s2(parcel.readStrongBinder()));
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                z(parcel.readString(), usc.a.s2(parcel.readStrongBinder()));
            }
            return true;
        }
    }

    void a2(String str, String str2, lyc lycVar) throws RemoteException;

    void c1(String str, vsc vscVar) throws RemoteException;

    void z(String str, usc uscVar) throws RemoteException;
}
