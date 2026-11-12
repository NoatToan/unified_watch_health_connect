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
public interface tuc extends IInterface {

    public static abstract class a extends Binder implements tuc {
        static final int TRANSACTION_addMusicPushHandler = 1;
        static final int TRANSACTION_cancel = 5;
        static final int TRANSACTION_flushComplete = 4;
        static final int TRANSACTION_removeMusicPushHandler = 2;
        static final int TRANSACTION_startPush = 3;

        /* JADX INFO: renamed from: tuc$a$a, reason: collision with other inner class name */
        public static class C1113a implements tuc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f35053a;

            public C1113a(IBinder iBinder) {
                this.f35053a = iBinder;
            }

            @Override // defpackage.tuc
            public void addMusicPushHandler(suc sucVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushService");
                    parcelObtain.writeStrongInterface(sucVar);
                    this.f35053a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f35053a;
            }

            @Override // defpackage.tuc
            public void cancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushService");
                    this.f35053a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.tuc
            public void flushComplete() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushService");
                    this.f35053a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.tuc
            public void removeMusicPushHandler(suc sucVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushService");
                    parcelObtain.writeStrongInterface(sucVar);
                    this.f35053a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.tuc
            public void startPush(List<MusicBean> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.devicesettings.IMusicPushService");
                    b.b(parcelObtain, list, 0);
                    this.f35053a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.devicesettings.IMusicPushService");
        }

        public static tuc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.devicesettings.IMusicPushService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof tuc)) ? new C1113a(iBinder) : (tuc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.devicesettings.IMusicPushService");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.devicesettings.IMusicPushService");
                return true;
            }
            if (i == 1) {
                addMusicPushHandler(suc.a.asInterface(parcel.readStrongBinder()));
            } else if (i == 2) {
                removeMusicPushHandler(suc.a.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                startPush(parcel.createTypedArrayList(MusicBean.INSTANCE));
            } else if (i == 4) {
                flushComplete();
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                cancel();
            }
            return true;
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

    void addMusicPushHandler(suc sucVar) throws RemoteException;

    void cancel() throws RemoteException;

    void flushComplete() throws RemoteException;

    void removeMusicPushHandler(suc sucVar) throws RemoteException;

    void startPush(List<MusicBean> list) throws RemoteException;
}
