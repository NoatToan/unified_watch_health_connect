package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes7.dex */
public interface s0 extends IInterface {

    public static abstract class a extends Binder implements s0 {
        static final int TRANSACTION_transferData = 1;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.connectiq.s0$a$a, reason: collision with other inner class name */
        public static class C0519a implements s0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f32002a;

            public C0519a(IBinder iBinder) {
                this.f32002a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f32002a;
            }

            @Override // com.garmin.android.apps.connectmobile.connectiq.s0
            public final String transferData(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.garmin.android.apps.connectmobile.connectiq.ICompanionAppService");
                    parcelObtain.writeString(str);
                    this.f32002a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.garmin.android.apps.connectmobile.connectiq.ICompanionAppService");
        }

        public static s0 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.garmin.android.apps.connectmobile.connectiq.ICompanionAppService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s0)) ? new C0519a(iBinder) : (s0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i14, Parcel parcel, Parcel parcel2, int i15) {
            if (i14 >= 1 && i14 <= 16777215) {
                parcel.enforceInterface("com.garmin.android.apps.connectmobile.connectiq.ICompanionAppService");
            }
            if (i14 == 1598968902) {
                parcel2.writeString("com.garmin.android.apps.connectmobile.connectiq.ICompanionAppService");
                return true;
            }
            if (i14 != 1) {
                return super.onTransact(i14, parcel, parcel2, i15);
            }
            String strTransferData = transferData(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strTransferData);
            return true;
        }
    }

    String transferData(String str);
}
