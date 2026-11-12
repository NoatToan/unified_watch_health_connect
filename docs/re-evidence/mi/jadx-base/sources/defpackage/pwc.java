package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface pwc extends IInterface {

    public static abstract class a extends Binder implements pwc {

        /* JADX INFO: renamed from: pwc$a$a, reason: collision with other inner class name */
        public static class C1080a implements pwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f30855a;

            public C1080a(IBinder iBinder) {
                this.f30855a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f30855a;
            }

            @Override // defpackage.pwc
            public void f0(owc owcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.voiceassistant.query.IQueryRequest");
                    parcelObtain.writeStrongInterface(owcVar);
                    this.f30855a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.pwc
            public void h5(owc owcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.voiceassistant.query.IQueryRequest");
                    parcelObtain.writeStrongInterface(owcVar);
                    this.f30855a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.pwc
            public Bundle l(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.voiceassistant.query.IQueryRequest");
                    b.d(parcelObtain, bundle, 0);
                    this.f30855a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) b.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static pwc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.voiceassistant.query.IQueryRequest");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof pwc)) ? new C1080a(iBinder) : (pwc) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void f0(owc owcVar) throws RemoteException;

    void h5(owc owcVar) throws RemoteException;

    Bundle l(Bundle bundle) throws RemoteException;
}
