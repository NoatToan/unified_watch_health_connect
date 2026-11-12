package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.euicc.server.model.EUICCDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface gvc extends IInterface {

    public static abstract class a extends Binder implements gvc {

        /* JADX INFO: renamed from: gvc$a$a, reason: collision with other inner class name */
        public static class C0947a implements gvc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f19366a;

            public C0947a(IBinder iBinder) {
                this.f19366a = iBinder;
            }

            @Override // defpackage.gvc
            public void D3(EUICCDeviceInfo eUICCDeviceInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.euicc.server.model.IOpenEUICCCalbcak");
                    b.b(parcelObtain, eUICCDeviceInfo, 0);
                    this.f19366a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19366a;
            }
        }

        public static gvc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.euicc.server.model.IOpenEUICCCalbcak");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gvc)) ? new C0947a(iBinder) : (gvc) iInterfaceQueryLocalInterface;
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

    void D3(EUICCDeviceInfo eUICCDeviceInfo) throws RemoteException;
}
