package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface suc extends IInterface {

    public static abstract class a extends Binder implements suc {
        static final int TRANSACTION_onItemPush = 2;
        static final int TRANSACTION_onItemPushEnd = 3;
        static final int TRANSACTION_onItemPushStart = 1;
        static final int TRANSACTION_onLowStorage = 4;
        static final int TRANSACTION_onPushEnd = 5;

        /* JADX INFO: renamed from: suc$a$a, reason: collision with other inner class name */
        public static class C1108a implements suc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f33992a;

            public C1108a(IBinder iBinder) {
                this.f33992a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33992a;
            }

            @Override // defpackage.suc
            public void onItemPush(MusicBean musicBean, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushHandler");
                    b.f(parcelObtain, musicBean, 0);
                    parcelObtain.writeInt(i);
                    this.f33992a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.suc
            public void onItemPushEnd(MusicBean musicBean) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushHandler");
                    b.f(parcelObtain, musicBean, 0);
                    this.f33992a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.suc
            public void onItemPushStart(MusicBean musicBean, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushHandler");
                    b.f(parcelObtain, musicBean, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f33992a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.suc
            public void onLowStorage() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushHandler");
                    this.f33992a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.suc
            public void onPushEnd(List<MusicBean> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushHandler");
                    b.e(parcelObtain, list, 0);
                    this.f33992a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.devicesettings.IMusicPushHandler");
        }

        public static suc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.devicesettings.IMusicPushHandler");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof suc)) ? new C1108a(iBinder) : (suc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.devicesettings.IMusicPushHandler");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.devicesettings.IMusicPushHandler");
                return true;
            }
            if (i == 1) {
                onItemPushStart((MusicBean) b.d(parcel, MusicBean.INSTANCE), parcel.readInt(), parcel.readInt());
            } else if (i == 2) {
                onItemPush((MusicBean) b.d(parcel, MusicBean.INSTANCE), parcel.readInt());
            } else if (i == 3) {
                onItemPushEnd((MusicBean) b.d(parcel, MusicBean.INSTANCE));
            } else if (i == 4) {
                onLowStorage();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onPushEnd(parcel.createTypedArrayList(MusicBean.INSTANCE));
            }
            return true;
        }
    }

    public static class b {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void onItemPush(MusicBean musicBean, int i) throws RemoteException;

    void onItemPushEnd(MusicBean musicBean) throws RemoteException;

    void onItemPushStart(MusicBean musicBean, int i, int i2) throws RemoteException;

    void onLowStorage() throws RemoteException;

    void onPushEnd(List<MusicBean> list) throws RemoteException;
}
