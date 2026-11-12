package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface xtc extends IInterface {

    public static abstract class a extends Binder implements xtc {

        /* JADX INFO: renamed from: xtc$a$a, reason: collision with other inner class name */
        public static class C1150a implements xtc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f39454a;

            public C1150a(IBinder iBinder) {
                this.f39454a = iBinder;
            }

            @Override // defpackage.xtc
            public void M(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.message.IMessageListener");
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    this.f39454a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f39454a;
            }
        }

        public static xtc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.message.IMessageListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof xtc)) ? new C1150a(iBinder) : (xtc) iInterfaceQueryLocalInterface;
        }
    }

    void M(String str, byte[] bArr) throws RemoteException;
}
