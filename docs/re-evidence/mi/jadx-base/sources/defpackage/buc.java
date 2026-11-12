package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.miplay.audioclient.MediaMetaData;

/* JADX INFO: loaded from: classes11.dex */
public interface buc extends IInterface {

    public static abstract class a extends Binder implements buc {

        /* JADX INFO: renamed from: buc$a$a, reason: collision with other inner class name */
        public static class C0099a implements buc {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static buc f4612b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4613a;

            public C0099a(IBinder iBinder) {
                this.f4613a = iBinder;
            }

            @Override // defpackage.buc
            public int A4(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(12, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().A4(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int F2(String[] strArr, String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(28, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().F2(strArr, str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int H4(String[] strArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(40, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().H4(strArr, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int N4(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(8, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().N4(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int O2(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(14, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().O2(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int S(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(24, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().S(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int V1(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(7, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().V1(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int W(String[] strArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(43, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().W(strArr, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int W0(String str, cuc cucVar, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(cucVar != null ? cucVar.asBinder() : null);
                    parcelObtain.writeString(str2);
                    if (!this.f4613a.transact(1, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().W0(str, cucVar, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int X0(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(34, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().X0(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int Z0(String[] strArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(47, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().Z0(strArr, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int Z3(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(11, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().Z3(strArr);
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
                return this.f4613a;
            }

            @Override // defpackage.buc
            public int b4(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(64, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().b4(str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int c3(String[] strArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(42, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().c3(strArr, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int d2(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(23, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().d2(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int e2(String[] strArr, long j, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(41, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().e2(strArr, j, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int g5(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(48, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().g5(str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int i() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    if (!this.f4613a.transact(49, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().i();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int j2(String[] strArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(39, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().j2(strArr, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int m(String[] strArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(46, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().m(strArr, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int n4(String[] strArr, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeLong(j);
                    if (!this.f4613a.transact(10, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().n4(strArr, j);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int n5(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(18, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().n5(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int p0(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f4613a.transact(9, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().p0(strArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int q4(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(3, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().q4(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int stopDiscovery() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    if (!this.f4613a.transact(4, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().stopDiscovery();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public MediaMetaData u2() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    if (!this.f4613a.transact(33, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().u2();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MediaMetaData.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int y(String[] strArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(17, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().y(strArr, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.buc
            public int y4(String[] strArr, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.miplay.audioclient.IMiPlayClient");
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeInt(i);
                    if (!this.f4613a.transact(45, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().y4(strArr, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static buc h4() {
            return C0099a.f4612b;
        }

        public static buc s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.miplay.audioclient.IMiPlayClient");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof buc)) ? new C0099a(iBinder) : (buc) iInterfaceQueryLocalInterface;
        }
    }

    int A4(String[] strArr) throws RemoteException;

    int F2(String[] strArr, String str, int i) throws RemoteException;

    int H4(String[] strArr, int i) throws RemoteException;

    int N4(String[] strArr) throws RemoteException;

    int O2(String[] strArr) throws RemoteException;

    int S(String[] strArr) throws RemoteException;

    int V1(String[] strArr) throws RemoteException;

    int W(String[] strArr, int i) throws RemoteException;

    int W0(String str, cuc cucVar, String str2) throws RemoteException;

    int X0(String[] strArr) throws RemoteException;

    int Z0(String[] strArr, int i) throws RemoteException;

    int Z3(String[] strArr) throws RemoteException;

    int b4(String str, int i) throws RemoteException;

    int c3(String[] strArr, int i) throws RemoteException;

    int d2(String[] strArr) throws RemoteException;

    int e2(String[] strArr, long j, int i) throws RemoteException;

    int g5(String str, int i) throws RemoteException;

    int i() throws RemoteException;

    int j2(String[] strArr, int i) throws RemoteException;

    int m(String[] strArr, int i) throws RemoteException;

    int n4(String[] strArr, long j) throws RemoteException;

    int n5(String[] strArr) throws RemoteException;

    int p0(String[] strArr) throws RemoteException;

    int q4(int i) throws RemoteException;

    int stopDiscovery() throws RemoteException;

    MediaMetaData u2() throws RemoteException;

    int y(String[] strArr, int i) throws RemoteException;

    int y4(String[] strArr, int i) throws RemoteException;
}
