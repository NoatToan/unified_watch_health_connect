package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface INotificationSideChannel extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$app$INotificationSideChannel".replace(Typography.dollar, '.');

    public static class Default implements INotificationSideChannel {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(String str, int i, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String str) throws RemoteException {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationSideChannel {

        public static class Proxy implements INotificationSideChannel {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f1238a;

            public Proxy(IBinder iBinder) {
                this.f1238a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1238a;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancel(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.f1238a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancelAll(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f1238a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return INotificationSideChannel.DESCRIPTOR;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    _Parcel.d(parcelObtain, notification, 0);
                    this.f1238a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, INotificationSideChannel.DESCRIPTOR);
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) ? new Proxy(iBinder) : (INotificationSideChannel) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = INotificationSideChannel.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) _Parcel.c(parcel, Notification.CREATOR));
            } else if (i == 2) {
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                cancelAll(parcel.readString());
            }
            return true;
        }
    }

    public static class _Parcel {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void cancel(String str, int i, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i, String str2, Notification notification) throws RemoteException;
}
