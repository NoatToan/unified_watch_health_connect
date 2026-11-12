package com.huawei.hms.hihealth;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.hihealth.data.DataCollector;
import com.huawei.hms.hihealth.data.DataType;
import com.huawei.hms.hihealth.data.Record;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface aabg extends IInterface {
    List<Record> aab(DataType dataType) throws RemoteException;

    void aab(DataCollector dataCollector) throws RemoteException;

    void aab(DataType dataType, com.huawei.hms.hihealth.options.aabc aabcVar, com.huawei.hms.hihealth.options.aabb aabbVar) throws RemoteException;

    void aab(Record record) throws RemoteException;

    void aaba(DataCollector dataCollector) throws RemoteException;

    void aaba(DataType dataType) throws RemoteException;

    void aaba(DataType dataType, com.huawei.hms.hihealth.options.aabc aabcVar, com.huawei.hms.hihealth.options.aabb aabbVar) throws RemoteException;

    List<Record> aabb() throws RemoteException;

    void aabb(DataType dataType) throws RemoteException;

    public static abstract class aab extends Binder implements aabg {

        /* JADX INFO: renamed from: com.huawei.hms.hihealth.aabg$aab$aab, reason: collision with other inner class name */
        static class C0120aab implements aabg {
            private IBinder aab;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.aab;
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aabb(DataType dataType) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(parcelObtain, dataType, 0);
                    this.aab.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public List<Record> aabb() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    this.aab.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Record.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aaba(DataType dataType, com.huawei.hms.hihealth.options.aabc aabcVar, com.huawei.hms.hihealth.options.aabb aabbVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(parcelObtain, dataType, 0);
                    parcelObtain.writeStrongInterface(aabcVar);
                    parcelObtain.writeStrongInterface(aabbVar);
                    this.aab.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aaba(DataType dataType) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(parcelObtain, dataType, 0);
                    this.aab.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aaba(DataCollector dataCollector) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(parcelObtain, dataCollector, 0);
                    this.aab.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aab(Record record) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(parcelObtain, record, 0);
                    this.aab.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aab(DataType dataType, com.huawei.hms.hihealth.options.aabc aabcVar, com.huawei.hms.hihealth.options.aabb aabbVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(parcelObtain, dataType, 0);
                    parcelObtain.writeStrongInterface(aabcVar);
                    parcelObtain.writeStrongInterface(aabbVar);
                    this.aab.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public void aab(DataCollector dataCollector) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(parcelObtain, dataCollector, 0);
                    this.aab.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hms.hihealth.aabg
            public List<Record> aab(DataType dataType) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
                    aabc.aaba.aab(parcelObtain, dataType, 0);
                    this.aab.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Record.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            C0120aab(IBinder iBinder) {
                this.aab = iBinder;
            }
        }

        public static aabg aab(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.hihealth.IAutoRecorderControllerManager");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof aabg)) ? new C0120aab(iBinder) : (aabg) iInterfaceQueryLocalInterface;
        }
    }
}
