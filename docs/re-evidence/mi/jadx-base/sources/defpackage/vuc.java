package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.xms.wearable.node.Node;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface vuc extends IInterface {

    public static abstract class a extends Binder implements vuc {

        /* JADX INFO: renamed from: vuc$a$a, reason: collision with other inner class name */
        public static class C1126a implements vuc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f37232a;

            public C1126a(IBinder iBinder) {
                this.f37232a = iBinder;
            }

            @Override // defpackage.vuc
            public void O1(List<Node> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.xms.wearable.node.INodeCallback");
                    b.b(parcelObtain, list, 0);
                    this.f37232a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f37232a;
            }
        }

        public static vuc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.xms.wearable.node.INodeCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof vuc)) ? new C1126a(iBinder) : (vuc) iInterfaceQueryLocalInterface;
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

    void O1(List<Node> list) throws RemoteException;
}
