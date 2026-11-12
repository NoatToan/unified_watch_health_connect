package com.miui.headset.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* JADX INFO: renamed from: com.miui.headset.api.e$a$a, reason: collision with other inner class name */
        public static class C0327a implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static e f10318b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f10319a;

            public C0327a(IBinder iBinder) {
                this.f10319a = iBinder;
            }

            @Override // com.miui.headset.api.e
            public int J1(long j, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IQuery");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f10319a.transact(104, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().J1(j, str, str2, str3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.e
            public int K4(long j, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IQuery");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f10319a.transact(105, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().K4(j, str, str2, str3);
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
                return this.f10319a;
            }

            @Override // com.miui.headset.api.e
            public int o2(long j, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IQuery");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f10319a.transact(106, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().o2(j, str, str2, str3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.e
            public int v0(long j, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IQuery");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.f10319a.transact(102, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().v0(j, str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.e
            public int w0(long j, String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IQuery");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.f10319a.transact(103, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().w0(j, str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static e h4() {
            return C0327a.f10318b;
        }

        public static e s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.miui.headset.api.IQuery");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) ? new C0327a(iBinder) : (e) iInterfaceQueryLocalInterface;
        }
    }

    int J1(long j, String str, String str2, String str3) throws RemoteException;

    int K4(long j, String str, String str2, String str3) throws RemoteException;

    int o2(long j, String str, String str2, String str3) throws RemoteException;

    int v0(long j, String str, String str2) throws RemoteException;

    int w0(long j, String str, String str2) throws RemoteException;
}
