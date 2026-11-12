package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.phonenum.data.AccountCertification;

/* JADX INFO: loaded from: classes11.dex */
public interface soc extends IInterface {

    public static abstract class a extends Binder implements soc {

        /* JADX INFO: renamed from: soc$a$a, reason: collision with other inner class name */
        public static class C1105a implements soc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f33837a;

            public C1105a(IBinder iBinder) {
                this.f33837a = iBinder;
            }

            @Override // defpackage.soc
            public void I0(String str, String str2, String[] strArr, toc tocVar, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.phonenum.service.IAccountPhoneNumberManagerService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeStrongInterface(tocVar);
                    parcelObtain.writeString(str3);
                    this.f33837a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.soc
            public void K(String str, String str2, int i, toc tocVar, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.phonenum.service.IAccountPhoneNumberManagerService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(tocVar);
                    parcelObtain.writeString(str3);
                    this.f33837a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.soc
            public int Y3(String str, String str2, AccountCertification accountCertification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.phonenum.service.IAccountPhoneNumberManagerService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, accountCertification, 0);
                    this.f33837a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33837a;
            }
        }

        public static soc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.phonenum.service.IAccountPhoneNumberManagerService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof soc)) ? new C1105a(iBinder) : (soc) iInterfaceQueryLocalInterface;
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

    void I0(String str, String str2, String[] strArr, toc tocVar, String str3) throws RemoteException;

    void K(String str, String str2, int i, toc tocVar, String str3) throws RemoteException;

    int Y3(String str, String str2, AccountCertification accountCertification) throws RemoteException;
}
