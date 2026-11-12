package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public interface fqc extends IInterface {

    public static abstract class a extends Binder implements fqc {

        /* JADX INFO: renamed from: fqc$a$a, reason: collision with other inner class name */
        public static class C0934a implements fqc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static fqc f18081b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f18082a;

            public C0934a(IBinder iBinder) {
                this.f18082a = iBinder;
            }

            @Override // defpackage.fqc
            public int N(int i, int[] iArr, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.cognition.ICognitionEngineInterface");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeIntArray(iArr);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f18082a.transact(8, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().N(i, iArr, str, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.fqc
            public int U3(int i, int[] iArr, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.cognition.ICognitionEngineInterface");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeIntArray(iArr);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f18082a.transact(7, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().U3(i, iArr, str, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f18082a;
            }

            @Override // defpackage.fqc
            public int y3(int i, int i2, int i3, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.aicr.cognition.ICognitionEngineInterface");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f18082a.transact(10, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().y3(i, i2, i3, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static fqc h4() {
            return C0934a.f18081b;
        }

        public static fqc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.aicr.cognition.ICognitionEngineInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof fqc)) ? new C0934a(iBinder) : (fqc) iInterfaceQueryLocalInterface;
        }
    }

    int N(int i, int[] iArr, String str, Bundle bundle) throws RemoteException;

    int U3(int i, int[] iArr, String str, Bundle bundle) throws RemoteException;

    int y3(int i, int i2, int i3, Bundle bundle) throws RemoteException;
}
