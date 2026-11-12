package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.connectiq.ConnectIQ;
import com.garmin.android.connectiq.IQApp;
import com.garmin.android.connectiq.IQDevice;
import com.garmin.android.connectiq.IQMessage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public interface t0 extends IInterface {

    public static abstract class a extends Binder implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f32021a = 0;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connectiq.t0$a$a, reason: collision with other inner class name */
        public static class C0520a implements t0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f32022a;

            public C0520a(IBinder iBinder) {
                this.f32022a = iBinder;
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final boolean F(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    parcelObtain.writeString(str);
                    this.f32022a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final int J(IQDevice iQDevice) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    b.c(parcelObtain, iQDevice, 0);
                    this.f32022a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final void M(IQMessage iQMessage, IQDevice iQDevice, IQApp iQApp) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    b.c(parcelObtain, iQMessage, 0);
                    b.c(parcelObtain, iQDevice, 0);
                    b.c(parcelObtain, iQApp, 0);
                    this.f32022a.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final void O(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f32022a.transact(15, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final ArrayList P() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    this.f32022a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(IQDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final void X(IQApp iQApp, String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    b.c(parcelObtain, iQApp, 0);
                    parcelObtain.writeString(ConnectIQ.INCOMING_MESSAGE);
                    parcelObtain.writeString(str2);
                    this.f32022a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final void a0(IQApp iQApp, String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    b.c(parcelObtain, iQApp, 0);
                    parcelObtain.writeString(str);
                    this.f32022a.transact(13, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f32022a;
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final void e0(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString("com.garmin.android.connectiq.GARMIN_BINDING_SERVICE_ACTION");
                    this.f32022a.transact(14, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final void f0(IQMessage iQMessage, IQDevice iQDevice, IQApp iQApp) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    b.c(parcelObtain, iQMessage, 0);
                    b.c(parcelObtain, iQDevice, 0);
                    b.c(parcelObtain, iQApp, 0);
                    this.f32022a.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final ArrayList getConnectedDevices() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    this.f32022a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(IQDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final void l(String str, String str2, IQDevice iQDevice, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(ConnectIQ.APPLICATION_INFO);
                    b.c(parcelObtain, iQDevice, 0);
                    parcelObtain.writeString(str3);
                    this.f32022a.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final String o(IQDevice iQDevice) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    b.c(parcelObtain, iQDevice, 0);
                    this.f32022a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final ArrayList r() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    this.f32022a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(IQDevice.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.t0
            public final void x(String str, String str2, IQDevice iQDevice, IQApp iQApp) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(ConnectIQ.OPEN_APPLICATION);
                    b.c(parcelObtain, iQDevice, 0);
                    b.c(parcelObtain, iQApp, 0);
                    this.f32022a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
            }
            if (i14 == 1598968902) {
                parcel2.writeString("com.garmin.android.apps.connectmobile.connectiq.IConnectIQService");
                return true;
            }
            switch (i14) {
                case 1:
                    boolean zF = ((ConnectIQService.a) this).F(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zF ? 1 : 0);
                    return true;
                case 2:
                    ArrayList connectedDevices = ((ConnectIQService.a) this).getConnectedDevices();
                    parcel2.writeNoException();
                    b.b(parcel2, connectedDevices);
                    return true;
                case 3:
                    ArrayList arrayListP = ((ConnectIQService.a) this).P();
                    parcel2.writeNoException();
                    b.b(parcel2, arrayListP);
                    return true;
                case 4:
                    int iJ = ((ConnectIQService.a) this).J((IQDevice) b.a(parcel, IQDevice.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iJ);
                    return true;
                case 5:
                    ((ConnectIQService.a) this).l(parcel.readString(), parcel.readString(), (IQDevice) b.a(parcel, IQDevice.CREATOR), parcel.readString());
                    return true;
                case 6:
                    ((ConnectIQService.a) this).x(parcel.readString(), parcel.readString(), (IQDevice) b.a(parcel, IQDevice.CREATOR), (IQApp) b.a(parcel, IQApp.CREATOR));
                    return true;
                case 7:
                    ((ConnectIQService.a) this).f0((IQMessage) b.a(parcel, IQMessage.CREATOR), (IQDevice) b.a(parcel, IQDevice.CREATOR), (IQApp) b.a(parcel, IQApp.CREATOR));
                    return true;
                case 8:
                    IQMessage iQMessage = (IQMessage) b.a(parcel, IQMessage.CREATOR);
                    IQDevice iQDevice = (IQDevice) b.a(parcel, IQDevice.CREATOR);
                    IQApp iQApp = (IQApp) b.a(parcel, IQApp.CREATOR);
                    z0 z0VarF = z0.f(ConnectIQService.this);
                    String str = iQMessage.notificationPackage;
                    iQDevice.getDeviceIdentifier();
                    iQApp.getApplicationId();
                    z0VarF.getClass();
                    com.google.protobuf.a.m();
                    return false;
                case 9:
                    ((ConnectIQService.a) this).X((IQApp) b.a(parcel, IQApp.CREATOR), parcel.readString(), parcel.readString());
                    return true;
                case 10:
                    ((ConnectIQService.a) this).M((IQMessage) b.a(parcel, IQMessage.CREATOR), (IQDevice) b.a(parcel, IQDevice.CREATOR), (IQApp) b.a(parcel, IQApp.CREATOR));
                    return true;
                case 11:
                    String strO = ((ConnectIQService.a) this).o((IQDevice) b.a(parcel, IQDevice.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeString(strO);
                    return true;
                case 12:
                    ArrayList arrayListR = ((ConnectIQService.a) this).r();
                    parcel2.writeNoException();
                    b.b(parcel2, arrayListR);
                    return true;
                case 13:
                    ((ConnectIQService.a) this).a0((IQApp) b.a(parcel, IQApp.CREATOR), parcel.readString());
                    return true;
                case 14:
                    ((ConnectIQService.a) this).e0(parcel.readString(), parcel.readString(), parcel.readString());
                    return true;
                case 15:
                    ((ConnectIQService.a) this).O(parcel.readString(), parcel.readString());
                    return true;
                default:
                    return super.onTransact(i14, parcel, parcel2, i15);
            }
        }
    }

    public static class b {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, ArrayList arrayList) {
            int size = arrayList.size();
            parcel.writeInt(size);
            for (int i14 = 0; i14 < size; i14++) {
                c(parcel, (Parcelable) arrayList.get(i14), 1);
            }
        }

        public static <T extends Parcelable> void c(Parcel parcel, T t7, int i14) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t7.writeToParcel(parcel, i14);
            }
        }
    }

    boolean F(String str);

    int J(IQDevice iQDevice);

    void M(IQMessage iQMessage, IQDevice iQDevice, IQApp iQApp);

    void O(String str, String str2);

    ArrayList P();

    void X(IQApp iQApp, String str, String str2);

    void a0(IQApp iQApp, String str);

    void e0(String str, String str2, String str3);

    void f0(IQMessage iQMessage, IQDevice iQDevice, IQApp iQApp);

    ArrayList getConnectedDevices();

    void l(String str, String str2, IQDevice iQDevice, String str3);

    String o(IQDevice iQDevice);

    ArrayList r();

    void x(String str, String str2, IQDevice iQDevice, IQApp iQApp);
}
