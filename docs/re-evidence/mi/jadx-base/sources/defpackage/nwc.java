package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface nwc extends IInterface {

    public static abstract class a extends Binder implements nwc {

        /* JADX INFO: renamed from: nwc$a$a, reason: collision with other inner class name */
        public static class C1058a implements nwc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f28502a;

            public C1058a(IBinder iBinder) {
                this.f28502a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28502a;
            }

            @Override // defpackage.nwc
            public void d0(String str, Bundle bundle, lwc lwcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.qqmusiclite.business.third.IQQMusicThirdService");
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(lwcVar);
                    this.f28502a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.nwc
            public void e4(List<String> list, mwc mwcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.qqmusiclite.business.third.IQQMusicThirdService");
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongInterface(mwcVar);
                    this.f28502a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.nwc
            public void e5(List<String> list, mwc mwcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.tencent.qqmusiclite.business.third.IQQMusicThirdService");
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongInterface(mwcVar);
                    this.f28502a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static nwc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tencent.qqmusiclite.business.third.IQQMusicThirdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof nwc)) ? new C1058a(iBinder) : (nwc) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void d0(String str, Bundle bundle, lwc lwcVar) throws RemoteException;

    void e4(List<String> list, mwc mwcVar) throws RemoteException;

    void e5(List<String> list, mwc mwcVar) throws RemoteException;
}
