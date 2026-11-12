package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface esc extends IInterface {

    public static abstract class a extends Binder implements esc {
        static final int TRANSACTION_onSportFinished = 4;
        static final int TRANSACTION_onSportPaused = 3;
        static final int TRANSACTION_onSportRestarted = 2;
        static final int TRANSACTION_onSportRested = 5;
        static final int TRANSACTION_onSportShutdown = 6;
        static final int TRANSACTION_onSportStarted = 1;

        /* JADX INFO: renamed from: esc$a$a, reason: collision with other inner class name */
        public static class C0927a implements esc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f17018a;

            public C0927a(IBinder iBinder) {
                this.f17018a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17018a;
            }

            @Override // defpackage.esc
            public void onSportFinished(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f17018a.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.esc
            public void onSportPaused() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
                    this.f17018a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.esc
            public void onSportRestarted() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
                    this.f17018a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.esc
            public void onSportRested() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
                    this.f17018a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.esc
            public void onSportShutdown() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
                    this.f17018a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.esc
            public void onSportStarted(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    this.f17018a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
        }

        public static esc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof esc)) ? new C0927a(iBinder) : (esc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_eco_manager_export.listener.IEcoRemoteSportStateChangedListener");
                return true;
            }
            switch (i) {
                case 1:
                    onSportStarted(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 2:
                    onSportRestarted();
                    return true;
                case 3:
                    onSportPaused();
                    return true;
                case 4:
                    onSportFinished(parcel.readInt() != 0);
                    return true;
                case 5:
                    onSportRested();
                    return true;
                case 6:
                    onSportShutdown();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void onSportFinished(boolean z) throws RemoteException;

    void onSportPaused() throws RemoteException;

    void onSportRestarted() throws RemoteException;

    void onSportRested() throws RemoteException;

    void onSportShutdown() throws RemoteException;

    void onSportStarted(int i, int i2, int i3, int i4) throws RemoteException;
}
