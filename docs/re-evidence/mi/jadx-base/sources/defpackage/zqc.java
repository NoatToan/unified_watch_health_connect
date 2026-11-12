package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.node.DataItem;

/* JADX INFO: loaded from: classes2.dex */
public interface zqc extends IInterface {

    public static abstract class a extends Binder implements zqc {

        /* JADX INFO: renamed from: zqc$a$a, reason: collision with other inner class name */
        public static class C1170a implements zqc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f41563a;

            public C1170a(IBinder iBinder) {
                this.f41563a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f41563a;
            }

            @Override // defpackage.zqc
            public void l5(String str, DataItem dataItem, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.node.IDataListener");
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, dataItem, 0);
                    b.b(parcelObtain, bundle, 0);
                    this.f41563a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static zqc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.node.IDataListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zqc)) ? new C1170a(iBinder) : (zqc) iInterfaceQueryLocalInterface;
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

    void l5(String str, DataItem dataItem, Bundle bundle) throws RemoteException;
}
