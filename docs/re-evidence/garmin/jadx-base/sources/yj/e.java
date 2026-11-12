package yj;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import wj.f;

/* JADX INFO: loaded from: classes7.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f197472a = 0;

        /* JADX INFO: renamed from: yj.e$a$a, reason: collision with other inner class name */
        public static class C3702a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f197473a;

            public C3702a(IBinder iBinder) {
                this.f197473a = iBinder;
            }

            @Override // yj.e
            public final int I() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
                    parcelObtain.writeInt(0);
                    this.f197473a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // yj.e
            public final c a(Message message, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
                    parcelObtain.writeInt(1);
                    message.writeToParcel(parcelObtain, 0);
                    this.f197473a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    c cVarCreateFromParcel = parcelObtain2.readInt() != 0 ? c.CREATOR.createFromParcel(parcelObtain2) : null;
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return cVarCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f197473a;
            }

            @Override // yj.e
            public final d p(int i14, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
                    parcelObtain.writeInt(i14);
                    parcelObtain.writeInt(0);
                    parcelObtain.writeInt(0);
                    this.f197473a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    d dVarK0 = d.a.k0(parcelObtain2.readStrongBinder());
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                    return dVarK0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 == 1) {
                parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
                int i16 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    f.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                    f.CREATOR.createFromParcel(parcel);
                }
                Bundle bundle = new Bundle();
                d dVarP = p(i16, bundle);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(dVarP != null ? dVarP.asBinder() : null);
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            }
            if (i14 == 2) {
                parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
                parcel.createByteArray();
                if (parcel.readInt() != 0) {
                    f.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                    f.CREATOR.createFromParcel(parcel);
                }
                Bundle bundle2 = new Bundle();
                d dVarY = Y();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(dVarY != null ? dVarY.asBinder() : null);
                parcel2.writeInt(1);
                bundle2.writeToParcel(parcel2, 1);
                return true;
            }
            if (i14 == 3) {
                parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
                if (parcel.readInt() != 0) {
                    f.CREATOR.createFromParcel(parcel);
                }
                int I = I();
                parcel2.writeNoException();
                parcel2.writeInt(I);
                return true;
            }
            if (i14 == 4) {
                parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
                boolean zS = s();
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            }
            if (i14 != 5) {
                if (i14 != 1598968902) {
                    return super.onTransact(i14, parcel, parcel2, i15);
                }
                parcel2.writeString("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
                return true;
            }
            parcel.enforceInterface("com.dsi.ant.channel.ipc.aidl.IAntChannelProviderAidl");
            Message message = parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null;
            Bundle bundle3 = new Bundle();
            c cVarA = a(message, bundle3);
            parcel2.writeNoException();
            if (cVarA != null) {
                parcel2.writeInt(1);
                cVarA.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            parcel2.writeInt(1);
            bundle3.writeToParcel(parcel2, 1);
            return true;
        }
    }

    int I();

    d Y();

    c a(Message message, Bundle bundle);

    d p(int i14, Bundle bundle);

    boolean s();
}
