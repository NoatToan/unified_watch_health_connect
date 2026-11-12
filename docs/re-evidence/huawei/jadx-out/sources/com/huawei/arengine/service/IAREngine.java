package com.huawei.arengine.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes23.dex */
public interface IAREngine extends IInterface {
    int[] getMetaData();

    ParcelFileDescriptor getSharedFile(String str);

    int getVersionCode();

    String getVersionName();

    public static abstract class a extends Binder implements IAREngine {

        static class e implements IAREngine {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static IAREngine f5272b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f5273a;

            @Override // com.huawei.arengine.service.IAREngine
            public String getVersionName() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.service.IAREngine");
                    if (this.f5273a.transact(1, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    } else {
                        string = a.a().getVersionName();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.arengine.service.IAREngine
            public int getVersionCode() {
                int versionCode;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.service.IAREngine");
                    if (this.f5273a.transact(2, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        versionCode = parcelObtain2.readInt();
                    } else {
                        versionCode = a.a().getVersionCode();
                    }
                    return versionCode;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.arengine.service.IAREngine
            public ParcelFileDescriptor getSharedFile(String str) {
                ParcelFileDescriptor sharedFile;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.service.IAREngine");
                    parcelObtain.writeString(str);
                    if (this.f5273a.transact(4, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        sharedFile = parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        sharedFile = a.a().getSharedFile(str);
                    }
                    return sharedFile;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.arengine.service.IAREngine
            public int[] getMetaData() {
                int[] iArrCreateIntArray;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.arengine.service.IAREngine");
                    if (this.f5273a.transact(3, parcelObtain, parcelObtain2, 0) || a.a() == null) {
                        parcelObtain2.readException();
                        iArrCreateIntArray = parcelObtain2.createIntArray();
                    } else {
                        iArrCreateIntArray = a.a().getMetaData();
                    }
                    return iArrCreateIntArray;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5273a;
            }

            e(IBinder iBinder) {
                this.f5273a = iBinder;
            }
        }

        public static IAREngine a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.arengine.service.IAREngine");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAREngine)) ? new e(iBinder) : (IAREngine) iInterfaceQueryLocalInterface;
        }

        public static IAREngine a() {
            return e.f5272b;
        }
    }
}
