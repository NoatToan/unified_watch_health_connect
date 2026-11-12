package com.miui.headset.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: com.miui.headset.api.d$a$a, reason: collision with other inner class name */
        public static class C0326a implements d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static d f10316b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f10317a;

            public C0326a(IBinder iBinder) {
                this.f10317a = iBinder;
            }

            @Override // com.miui.headset.api.d
            public int D2(long j, String str, String str2, String str3, String str4) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IProfile");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    try {
                        if (!this.f10317a.transact(104, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                            int iD2 = a.h4().D2(j, str, str2, str3, str4);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iD2;
                        }
                        parcelObtain2.readException();
                        int i = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.miui.headset.api.d
            public int N2(long j, String str, String str2, String str3, String str4, int i) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IProfile");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeInt(i);
                    try {
                        if (!this.f10317a.transact(106, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                            int iN2 = a.h4().N2(j, str, str2, str3, str4, i);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iN2;
                        }
                        parcelObtain2.readException();
                        int i2 = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i2;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10317a;
            }

            @Override // com.miui.headset.api.d
            public int j1(long j, String str, String str2, String str3, String str4) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IProfile");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    try {
                        if (!this.f10317a.transact(103, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                            int iJ1 = a.h4().j1(j, str, str2, str3, str4);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iJ1;
                        }
                        parcelObtain2.readException();
                        int i = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.miui.headset.api.d
            public int r1(long j, String str, String str2, String str3, String str4) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IProfile");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    try {
                        if (!this.f10317a.transact(102, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                            int iR1 = a.h4().r1(j, str, str2, str3, str4);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iR1;
                        }
                        parcelObtain2.readException();
                        int i = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.miui.headset.api.d
            public int u0(long j, String str, String str2, String str3, String str4, int i) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IProfile");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeInt(i);
                    try {
                        if (!this.f10317a.transact(105, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                            int iU0 = a.h4().u0(j, str, str2, str3, str4, i);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iU0;
                        }
                        parcelObtain2.readException();
                        int i2 = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i2;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        public static d h4() {
            return C0326a.f10316b;
        }

        public static d s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.miui.headset.api.IProfile");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) ? new C0326a(iBinder) : (d) iInterfaceQueryLocalInterface;
        }
    }

    int D2(long j, String str, String str2, String str3, String str4) throws RemoteException;

    int N2(long j, String str, String str2, String str3, String str4, int i) throws RemoteException;

    int j1(long j, String str, String str2, String str3, String str4) throws RemoteException;

    int r1(long j, String str, String str2, String str3, String str4) throws RemoteException;

    int u0(long j, String str, String str2, String str3, String str4, int i) throws RemoteException;
}
