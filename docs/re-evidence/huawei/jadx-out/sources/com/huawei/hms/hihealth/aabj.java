package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.hihealth.data.AppLangItem;
import com.huawei.hms.hihealth.data.ScopeLangItem;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface aabj extends IInterface {
    ScopeLangItem aab(String str, String str2) throws RemoteException;

    List<AppLangItem> aab(String str, int i) throws RemoteException;

    Map aab(List<String> list) throws RemoteException;

    void aab(String str, List<String> list) throws RemoteException;

    void aab(boolean z) throws RemoteException;

    Map aaba(List<String> list) throws RemoteException;

    public static abstract class aab extends Binder implements aabj {

        /* JADX INFO: renamed from: com.huawei.hms.hihealth.aabj$aab$aab, reason: collision with other inner class name */
        static class C0123aab implements aabj {
            private IBinder aab;

            @Override // com.huawei.hms.hihealth.aabj
            public ScopeLangItem aab(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.aab.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ScopeLangItem.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }

            @Override // com.huawei.hms.hihealth.aabj
            public Map aaba(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    parcelObtain.writeStringList(list);
                    this.aab.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabj
            public void aab(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.aab.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabj
            public void aab(String str, List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    this.aab.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabj
            public Map aab(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    parcelObtain.writeStringList(list);
                    this.aab.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabj
            public List<AppLangItem> aab(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IConsentsControllerManager");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.aab.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(AppLangItem.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0123aab(IBinder iBinder) {
                this.aab = iBinder;
            }
        }

        public static aabj aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IConsentsControllerManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aabj)) ? new C0123aab(iBinder) : (aabj) iInterfaceQueryLocalInterface;
        }
    }
}
