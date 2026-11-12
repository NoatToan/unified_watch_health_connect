package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.Status;
import com.xiaomi.xms.wearable.node.DataItem;

/* JADX INFO: loaded from: classes2.dex */
public interface yqc extends IInterface {

    public static abstract class a extends Binder implements yqc {

        /* JADX INFO: renamed from: yqc$a$a, reason: collision with other inner class name */
        public static class C1157a implements yqc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f40426a;

            public C1157a(IBinder iBinder) {
                this.f40426a = iBinder;
            }

            @Override // defpackage.yqc
            public void I1(DataItem dataItem, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.node.IDataCallback");
                    b.b(parcelObtain, dataItem, 0);
                    b.b(parcelObtain, bundle, 0);
                    this.f40426a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.yqc
            public void a(Status status) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.node.IDataCallback");
                    b.b(parcelObtain, status, 0);
                    this.f40426a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f40426a;
            }
        }

        public static yqc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.node.IDataCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yqc)) ? new C1157a(iBinder) : (yqc) iInterfaceQueryLocalInterface;
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

    void I1(DataItem dataItem, Bundle bundle) throws RemoteException;

    void a(Status status) throws RemoteException;
}
