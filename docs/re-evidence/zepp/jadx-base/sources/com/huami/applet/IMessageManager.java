package com.huami.applet;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMessageManager extends IInterface {

    public static class Default implements IMessageManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huami.applet.IMessageManager
        public void registerListener(IMessageListener iMessageListener) throws RemoteException {
        }

        @Override // com.huami.applet.IMessageManager
        public boolean sendMessage(byte[] bArr) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IMessageManager {
        private static final String a = "com.huami.applet.IMessageManager";
        public static final int b = 1;
        public static final int c = 2;

        public static class a implements IMessageManager {
            public static IMessageManager b;
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            public String d() {
                return Stub.a;
            }

            @Override // com.huami.applet.IMessageManager
            public void registerListener(IMessageListener iMessageListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    parcelObtain.writeStrongBinder(iMessageListener != null ? iMessageListener.asBinder() : null);
                    if (this.a.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().registerListener(iMessageListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huami.applet.IMessageManager
            public boolean sendMessage(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.a);
                    if (bArr == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(bArr.length);
                    }
                    if (!this.a.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendMessage(bArr);
                    }
                    parcelObtain2.readException();
                    boolean z = parcelObtain2.readInt() != 0;
                    parcelObtain2.readByteArray(bArr);
                    return z;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, a);
        }

        public static IMessageManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMessageManager)) ? new a(iBinder) : (IMessageManager) iInterfaceQueryLocalInterface;
        }

        public static IMessageManager getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IMessageManager iMessageManager) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMessageManager == null) {
                return false;
            }
            a.b = iMessageManager;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(a);
                int i3 = parcel.readInt();
                byte[] bArr = i3 < 0 ? null : new byte[i3];
                boolean zSendMessage = sendMessage(bArr);
                parcel2.writeNoException();
                parcel2.writeInt(zSendMessage ? 1 : 0);
                parcel2.writeByteArray(bArr);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(a);
                return true;
            }
            parcel.enforceInterface(a);
            registerListener(IMessageListener.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void registerListener(IMessageListener iMessageListener) throws RemoteException;

    boolean sendMessage(byte[] bArr) throws RemoteException;
}
