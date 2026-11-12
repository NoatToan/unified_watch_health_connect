package miui.net;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface IXiaomiAuthService extends IInterface {

    public static abstract class a extends Binder implements IXiaomiAuthService {

        /* JADX INFO: renamed from: miui.net.IXiaomiAuthService$a$a, reason: collision with other inner class name */
        public static class C1018a implements IXiaomiAuthService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f26236a;

            public C1018a(IBinder iBinder) {
                this.f26236a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26236a;
            }

            @Override // miui.net.IXiaomiAuthService
            public Bundle getMiCloudAccessToken(Account account, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.net.IXiaomiAuthService");
                    if (account != null) {
                        parcelObtain.writeInt(1);
                        account.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f26236a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // miui.net.IXiaomiAuthService
            public void invalidateAccessToken(Account account, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("miui.net.IXiaomiAuthService");
                    if (account != null) {
                        parcelObtain.writeInt(1);
                        account.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f26236a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static IXiaomiAuthService s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("miui.net.IXiaomiAuthService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IXiaomiAuthService)) ? new C1018a(iBinder) : (IXiaomiAuthService) iInterfaceQueryLocalInterface;
        }
    }

    Bundle getMiCloudAccessToken(Account account, Bundle bundle) throws RemoteException;

    void invalidateAccessToken(Account account, Bundle bundle) throws RemoteException;
}
