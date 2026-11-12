package com.huawei.wearengine;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.notify.NotificationHarmony;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotifyHanrmonyCallback;
import com.huawei.wearengine.notify.NotifySendCallback;

/* JADX INFO: loaded from: classes20.dex */
public interface NotifyManager extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.wearengine.NotifyManager";

    int notify(Device device, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) throws RemoteException;

    int notifyHarmonyEx(Device device, NotificationHarmony notificationHarmony, NotifyHanrmonyCallback notifyHanrmonyCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements NotifyManager {
        static final int TRANSACTION_notify = 1;
        static final int TRANSACTION_notifyHarmonyEx = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, NotifyManager.DESCRIPTOR);
        }

        public static NotifyManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(NotifyManager.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof NotifyManager)) {
                return (NotifyManager) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(NotifyManager.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(NotifyManager.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int iNotify = notify((Device) d.a(parcel, Device.CREATOR), (NotificationParcel) d.a(parcel, NotificationParcel.CREATOR), NotifySendCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iNotify);
            } else if (i == 2) {
                int iNotifyHarmonyEx = notifyHarmonyEx((Device) d.a(parcel, Device.CREATOR), (NotificationHarmony) d.a(parcel, NotificationHarmony.CREATOR), NotifyHanrmonyCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(iNotifyHarmonyEx);
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class c implements NotifyManager {
            private IBinder e;

            c(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.wearengine.NotifyManager
            public int notify(Device device, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(NotifyManager.DESCRIPTOR);
                    d.e(parcelObtain, device, 0);
                    d.e(parcelObtain, notificationParcel, 0);
                    parcelObtain.writeStrongInterface(notifySendCallback);
                    this.e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.wearengine.NotifyManager
            public int notifyHarmonyEx(Device device, NotificationHarmony notificationHarmony, NotifyHanrmonyCallback notifyHanrmonyCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(NotifyManager.DESCRIPTOR);
                    d.e(parcelObtain, device, 0);
                    d.e(parcelObtain, notificationHarmony, 0);
                    parcelObtain.writeStrongInterface(notifyHanrmonyCallback);
                    this.e.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class d {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T a(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void e(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
