package yj;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import wj.f;

/* JADX INFO: loaded from: classes7.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: yj.d$a$a, reason: collision with other inner class name */
        public static class C3701a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f197471a;

            public C3701a(IBinder iBinder) {
                this.f197471a = iBinder;
            }

            @Override // yj.d
            public final boolean N(Messenger messenger) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcelObtain.writeInt(1);
                    messenger.writeToParcel(parcelObtain, 0);
                    this.f197471a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.d
            public final boolean S(Messenger messenger) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    if (messenger != null) {
                        parcelObtain.writeInt(1);
                        messenger.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f197471a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.d
            public final Bundle a(Message message, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcelObtain.writeInt(1);
                    message.writeToParcel(parcelObtain, 0);
                    this.f197471a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    Bundle bundle2 = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return bundle2;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f197471a;
            }

            @Override // yj.d
            public final void b(byte[] bArr, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcelObtain.writeByteArray(bArr);
                    this.f197471a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.d
            public final void d(byte[] bArr, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcelObtain.writeByteArray(bArr);
                    this.f197471a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.d
            public final void f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    this.f197471a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.d
            public final void g0(Binder binder) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcelObtain.writeStrongBinder(binder);
                    this.f197471a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.d
            public final f getCapabilities() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    this.f197471a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? f.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.d
            public final void m(dk.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcelObtain.writeInt(1);
                    aVar.writeToParcel(parcelObtain, 0);
                    this.f197471a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.d
            public final dk.a q(dk.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcelObtain.writeInt(1);
                    aVar.writeToParcel(parcelObtain, 0);
                    this.f197471a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    dk.a aVarCreateFromParcel = parcelObtain2.readInt() != 0 ? dk.a.CREATOR.createFromParcel(parcelObtain2) : null;
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return aVarCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
        }

        public static d k0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C3701a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 == 1598968902) {
                parcel2.writeString("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                return true;
            }
            switch (i14) {
                case 1:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    dk.a aVarCreateFromParcel = parcel.readInt() != 0 ? dk.a.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle = new Bundle();
                    m(aVarCreateFromParcel, bundle);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                case 2:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    dk.a aVarCreateFromParcel2 = parcel.readInt() != 0 ? dk.a.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle2 = new Bundle();
                    dk.a aVarQ = q(aVarCreateFromParcel2, bundle2);
                    parcel2.writeNoException();
                    if (aVarQ != null) {
                        parcel2.writeInt(1);
                        aVarQ.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    parcel2.writeInt(1);
                    bundle2.writeToParcel(parcel2, 1);
                    return true;
                case 3:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcel.createByteArray();
                    Bundle bundle3 = new Bundle();
                    n();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle3.writeToParcel(parcel2, 1);
                    return true;
                case 4:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    Bundle bundle4 = new Bundle();
                    b(bArrCreateByteArray, bundle4);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle4.writeToParcel(parcel2, 1);
                    return true;
                case 5:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcel.createByteArray();
                    Bundle bundle5 = new Bundle();
                    B();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle5.writeToParcel(parcel2, 1);
                    return true;
                case 6:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    Bundle bundle6 = new Bundle();
                    d(bArrCreateByteArray2, bundle6);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle6.writeToParcel(parcel2, 1);
                    return true;
                case 7:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    Bundle bundle7 = new Bundle();
                    U();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundle7.writeToParcel(parcel2, 1);
                    return true;
                case 8:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    g0((Binder) parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    parcel.readStrongBinder();
                    T();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    boolean zN = N(parcel.readInt() != 0 ? (Messenger) Messenger.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zN ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    boolean zS = S(parcel.readInt() != 0 ? (Messenger) Messenger.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zS ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    f capabilities = getCapabilities();
                    parcel2.writeNoException();
                    if (capabilities == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    capabilities.writeToParcel(parcel2, 1);
                    return true;
                case 13:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    f();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelAidl");
                    Message message = parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle8 = new Bundle();
                    Bundle bundleA = a(message, bundle8);
                    parcel2.writeNoException();
                    if (bundleA != null) {
                        parcel2.writeInt(1);
                        bundleA.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    parcel2.writeInt(1);
                    bundle8.writeToParcel(parcel2, 1);
                    return true;
                default:
                    return super.onTransact(i14, parcel, parcel2, i15);
            }
        }
    }

    void B();

    boolean N(Messenger messenger);

    boolean S(Messenger messenger);

    void T();

    void U();

    Bundle a(Message message, Bundle bundle);

    void b(byte[] bArr, Bundle bundle);

    void d(byte[] bArr, Bundle bundle);

    void f();

    void g0(Binder binder);

    f getCapabilities();

    void m(dk.a aVar, Bundle bundle);

    void n();

    dk.a q(dk.a aVar, Bundle bundle);
}
