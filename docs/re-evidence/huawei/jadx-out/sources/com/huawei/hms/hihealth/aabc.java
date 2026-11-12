package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hms.hihealth.data.ActivityRecord;
import com.huawei.hms.hihealth.data.ComponentInfo;

/* JADX INFO: loaded from: classes10.dex */
public interface aabc extends IInterface {

    /* JADX INFO: loaded from: classes34.dex */
    public static class aaba {
        static /* synthetic */ void aab(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    void aab(ActivityRecord activityRecord, ComponentInfo componentInfo, com.huawei.hms.hihealth.options.aab aabVar) throws RemoteException;

    void aab(String str) throws RemoteException;

    ComponentInfo aabe() throws RemoteException;

    public static abstract class aab extends Binder implements aabc {

        /* JADX INFO: renamed from: com.huawei.hms.hihealth.aabc$aab$aab, reason: collision with other inner class name */
        static class C0118aab implements aabc {
            private IBinder aab;

            @Override // com.huawei.hms.hihealth.aabc
            public void aab(ActivityRecord activityRecord, ComponentInfo componentInfo, com.huawei.hms.hihealth.options.aab aabVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IActivityRecordsControllerManager");
                    if (activityRecord != null) {
                        parcelObtain.writeInt(1);
                        activityRecord.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (componentInfo != null) {
                        parcelObtain.writeInt(1);
                        componentInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongInterface(aabVar);
                    this.aab.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabc
            public ComponentInfo aabe() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IActivityRecordsControllerManager");
                    this.aab.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ComponentInfo.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }

            @Override // com.huawei.hms.hihealth.aabc
            public void aab(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IActivityRecordsControllerManager");
                    parcelObtain.writeString(str);
                    this.aab.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0118aab(IBinder iBinder) {
                this.aab = iBinder;
            }
        }

        public static aabc aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IActivityRecordsControllerManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aabc)) ? new C0118aab(iBinder) : (aabc) iInterfaceQueryLocalInterface;
        }
    }
}
