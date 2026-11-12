package com.xiaomi.wearable.hm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface c0 extends IInterface {

    public static abstract class a extends Binder implements c0 {
        static final int TRANSACTION_onAudioData = 3;
        static final int TRANSACTION_onStartSession = 1;
        static final int TRANSACTION_onStopSession = 2;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.c0$a$a, reason: collision with other inner class name */
        public static class C0871a implements c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14393a;

            public C0871a(IBinder iBinder) {
                this.f14393a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14393a;
            }

            @Override // com.xiaomi.wearable.hm.c0
            public void onAudioData(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.VoiceCallback");
                    parcelObtain.writeByteArray(bArr);
                    this.f14393a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.c0
            public void onStartSession(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.VoiceCallback");
                    b.d(parcelObtain, huamiDataWrapper, 0);
                    this.f14393a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.c0
            public void onStopSession() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.VoiceCallback");
                    this.f14393a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.VoiceCallback");
        }

        public static c0 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.VoiceCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c0)) ? new C0871a(iBinder) : (c0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.VoiceCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.VoiceCallback");
                return true;
            }
            if (i == 1) {
                onStartSession((HuamiDataWrapper) b.c(parcel, HuamiDataWrapper.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 2) {
                onStopSession();
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onAudioData(parcel.createByteArray());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class b {
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

    void onAudioData(byte[] bArr) throws RemoteException;

    void onStartSession(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void onStopSession() throws RemoteException;
}
