package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface s extends IInterface {

    public static abstract class a extends Binder implements s {
        static final int TRANSACTION_endCall = 5;
        static final int TRANSACTION_ignoreCall = 6;
        static final int TRANSACTION_illegalBind = 9;
        static final int TRANSACTION_onAlarmCancel = 17;
        static final int TRANSACTION_onAlarmChangeInternal = 1;
        static final int TRANSACTION_onAlarmDelay = 16;
        static final int TRANSACTION_onFindPhone = 11;
        static final int TRANSACTION_onHrOpen = 13;
        static final int TRANSACTION_onMusicControlInternal = 12;
        static final int TRANSACTION_onNotificationDelete = 14;
        static final int TRANSACTION_onReminderChangeInternal = 10;
        static final int TRANSACTION_onSettingsChange = 2;
        static final int TRANSACTION_onSportStart = 3;
        static final int TRANSACTION_onSportStop = 4;
        static final int TRANSACTION_phoneMuteMode = 7;
        static final int TRANSACTION_phoneMuteState = 15;
        static final int TRANSACTION_phoneNormalMode = 8;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.s$a$a, reason: collision with other inner class name */
        public static class C0887a implements s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14409a;

            public C0887a(IBinder iBinder) {
                this.f14409a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14409a;
            }

            @Override // com.xiaomi.wearable.hm.s
            public void endCall() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void ignoreCall() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void illegalBind() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onAlarmCancel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onAlarmChangeInternal(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    b.e(parcelObtain, list, 0);
                    this.f14409a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onAlarmDelay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onFindPhone(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14409a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onHrOpen() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onMusicControlInternal(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14409a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onNotificationDelete(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    parcelObtain.writeInt(i);
                    this.f14409a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onReminderChangeInternal(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    b.e(parcelObtain, list, 0);
                    this.f14409a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onSettingsChange(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14409a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onSportStart(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14409a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void onSportStop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void phoneMuteMode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.s
            public void phoneNormalMode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.LFEventCallback");
                    this.f14409a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.LFEventCallback");
        }

        public static s asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.LFEventCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s)) ? new C0887a(iBinder) : (s) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.LFEventCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.LFEventCallback");
                return true;
            }
            switch (i) {
                case 1:
                    onAlarmChangeInternal(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onSettingsChange(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    onSportStart(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    onSportStop();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    endCall();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    ignoreCall();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    phoneMuteMode();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    phoneNormalMode();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    illegalBind();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    onReminderChangeInternal(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    onFindPhone(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    onMusicControlInternal((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    onHrOpen();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    onNotificationDelete(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    phoneMuteState();
                    parcel2.writeNoException();
                    return true;
                case 16:
                    onAlarmDelay();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    onAlarmCancel();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
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

    void endCall() throws RemoteException;

    void ignoreCall() throws RemoteException;

    void illegalBind() throws RemoteException;

    void onAlarmCancel() throws RemoteException;

    void onAlarmChangeInternal(List<HuamiDataWrapper> list) throws RemoteException;

    void onAlarmDelay() throws RemoteException;

    void onFindPhone(boolean z) throws RemoteException;

    void onHrOpen() throws RemoteException;

    void onMusicControlInternal(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onNotificationDelete(int i) throws RemoteException;

    void onReminderChangeInternal(List<HuamiDataWrapper> list) throws RemoteException;

    void onSettingsChange(boolean z) throws RemoteException;

    void onSportStart(boolean z) throws RemoteException;

    void onSportStop() throws RemoteException;

    void phoneMuteMode() throws RemoteException;

    void phoneMuteState() throws RemoteException;

    void phoneNormalMode() throws RemoteException;
}
