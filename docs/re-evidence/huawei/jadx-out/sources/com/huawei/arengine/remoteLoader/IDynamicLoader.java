package com.huawei.arengine.remoteLoader;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes23.dex */
public interface IDynamicLoader extends IInterface {
    boolean checkUpdate(long j, boolean z);

    void closeLibrary(long j);

    long openLibrary(String str);

    boolean updateResourceFromRemote(String str, String str2);

    public static abstract class a extends Binder implements IDynamicLoader {

        /* JADX INFO: renamed from: com.huawei.arengine.remoteLoader.IDynamicLoader$a$a, reason: collision with other inner class name */
        static class C0062a implements IDynamicLoader {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static IDynamicLoader f5268c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IBinder f5269b;

            @Override // com.huawei.arengine.remoteLoader.IDynamicLoader
            public boolean updateResourceFromRemote(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.remoteLoader.IDynamicLoader");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.f5269b.transact(4, parcelObtain, parcelObtain2, 0) && a.a() != null) {
                        return a.a().updateResourceFromRemote(str, str2);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.arengine.remoteLoader.IDynamicLoader
            public long openLibrary(String str) {
                long jOpenLibrary;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.remoteLoader.IDynamicLoader");
                    parcelObtain.writeString(str);
                    if (this.f5269b.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        jOpenLibrary = parcelObtain2.readLong();
                    } else {
                        jOpenLibrary = a.a().openLibrary(str);
                    }
                    return jOpenLibrary;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.arengine.remoteLoader.IDynamicLoader
            public void closeLibrary(long j) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.remoteLoader.IDynamicLoader");
                    parcelObtain.writeLong(j);
                    if (this.f5269b.transact(2, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.a().closeLibrary(j);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.arengine.remoteLoader.IDynamicLoader
            public boolean checkUpdate(long j, boolean z) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.remoteLoader.IDynamicLoader");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.f5269b.transact(3, parcelObtain, parcelObtain2, 0) && a.a() != null) {
                        return a.a().checkUpdate(j, z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5269b;
            }

            C0062a(IBinder iBinder) {
                this.f5269b = iBinder;
            }
        }

        public static IDynamicLoader a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.arengine.remoteLoader.IDynamicLoader");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDynamicLoader)) ? new C0062a(iBinder) : (IDynamicLoader) iInterfaceQueryLocalInterface;
        }

        public static IDynamicLoader a() {
            return C0062a.f5268c;
        }
    }
}
