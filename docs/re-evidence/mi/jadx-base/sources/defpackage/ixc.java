package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface ixc extends IInterface {

    public static abstract class a extends Binder implements ixc {
        static final int TRANSACTION_onSportFinished = 4;
        static final int TRANSACTION_onSportPaused = 3;
        static final int TRANSACTION_onSportRestarted = 2;
        static final int TRANSACTION_onSportStarted = 1;

        /* JADX INFO: renamed from: ixc$a$a, reason: collision with other inner class name */
        public static class C0979a implements ixc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f22192a;

            public C0979a(IBinder iBinder) {
                this.f22192a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f22192a;
            }

            @Override // defpackage.ixc
            public void onSportFinished(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportStateChangedListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f22192a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.ixc
            public void onSportPaused() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportStateChangedListener");
                    this.f22192a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.ixc
            public void onSportRestarted() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportStateChangedListener");
                    this.f22192a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.ixc
            public void onSportStarted(int i, int i2, int i3, int i4, int i5) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportStateChangedListener");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    this.f22192a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportStateChangedListener");
        }

        public static ixc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportStateChangedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ixc)) ? new C0979a(iBinder) : (ixc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportStateChangedListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_manager_export.listener.IRemoteSportStateChangedListener");
                return true;
            }
            if (i == 1) {
                onSportStarted(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            } else if (i == 2) {
                onSportRestarted();
            } else if (i == 3) {
                onSportPaused();
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onSportFinished(parcel.readInt() != 0);
            }
            return true;
        }
    }

    void onSportFinished(boolean z) throws RemoteException;

    void onSportPaused() throws RemoteException;

    void onSportRestarted() throws RemoteException;

    void onSportStarted(int i, int i2, int i3, int i4, int i5) throws RemoteException;
}
