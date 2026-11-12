package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.mi.command.data.ResearchDevice;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface qso extends IInterface {

    public static abstract class a extends Binder implements qso {

        /* JADX INFO: renamed from: qso$a$a, reason: collision with other inner class name */
        public static class C1092a implements qso {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f31810a;

            public C1092a(IBinder iBinder) {
                this.f31810a = iBinder;
            }

            @Override // defpackage.qso
            public void Z2(String str, List<ResearchDevice> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.SyncDeviceResearchListCallback");
                    parcelObtain.writeString(str);
                    b.b(parcelObtain, list, 0);
                    this.f31810a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f31810a;
            }

            @Override // defpackage.qso
            public void onFailure(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mi.command.callback.SyncDeviceResearchListCallback");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f31810a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static qso s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.callback.SyncDeviceResearchListCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qso)) ? new C1092a(iBinder) : (qso) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                c(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void c(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void Z2(String str, List<ResearchDevice> list) throws RemoteException;

    void onFailure(String str, int i) throws RemoteException;
}
