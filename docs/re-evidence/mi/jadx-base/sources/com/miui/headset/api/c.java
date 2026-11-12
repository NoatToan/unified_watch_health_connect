package com.miui.headset.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: com.miui.headset.api.c$a$a, reason: collision with other inner class name */
        public static class C0325a implements c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static c f10314b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f10315a;

            public C0325a(IBinder iBinder) {
                this.f10315a = iBinder;
            }

            @Override // com.miui.headset.api.c
            public int B4(long j, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f10315a.transact(107, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().B4(j, str, str2, str3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.c
            public int E2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    parcelObtain.writeString(str);
                    if (!this.f10315a.transact(103, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().E2(str);
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
                return this.f10315a;
            }

            @Override // com.miui.headset.api.c
            public void c5(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    parcelObtain.writeString(str);
                    if (this.f10315a.transact(105, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().c5(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.c
            public int g3(String str, com.miui.headset.api.a aVar, b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.f10315a.transact(102, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().g3(str, aVar, bVar);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.c
            public d getProfile() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    if (!this.f10315a.transact(2, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().getProfile();
                    }
                    parcelObtain2.readException();
                    return d.a.s2(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.c
            public e getQuery() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    if (!this.f10315a.transact(3, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().getQuery();
                    }
                    parcelObtain2.readException();
                    return e.a.s2(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.c
            public int k0(long j, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (!this.f10315a.transact(106, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().k0(j, str, str2, str3);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.c
            public void v(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    parcelObtain.writeString(str);
                    if (this.f10315a.transact(104, parcelObtain, parcelObtain2, 0) || a.h4() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.h4().v(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.miui.headset.api.c
            public int y1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.miui.headset.api.IHeadsetLocalService");
                    if (!this.f10315a.transact(108, parcelObtain, parcelObtain2, 0) && a.h4() != null) {
                        return a.h4().y1();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static c h4() {
            return C0325a.f10314b;
        }

        public static c s2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.miui.headset.api.IHeadsetLocalService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0325a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }
    }

    int B4(long j, String str, String str2, String str3) throws RemoteException;

    int E2(String str) throws RemoteException;

    void c5(String str) throws RemoteException;

    int g3(String str, com.miui.headset.api.a aVar, b bVar) throws RemoteException;

    d getProfile() throws RemoteException;

    e getQuery() throws RemoteException;

    int k0(long j, String str, String str2, String str3) throws RemoteException;

    void v(String str) throws RemoteException;

    int y1() throws RemoteException;
}
