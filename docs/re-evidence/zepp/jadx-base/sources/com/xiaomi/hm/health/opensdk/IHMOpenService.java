package com.xiaomi.hm.health.opensdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xiaomi.hm.health.opensdk.model.HMApduRequest;
import com.xiaomi.hm.health.opensdk.model.HMApduResponse;
import com.xiaomi.hm.health.opensdk.model.HMReminder;
import com.xiaomi.hm.health.opensdk.model.NfcTag;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public interface IHMOpenService extends IInterface {
    public static final String DESCRIPTOR = "com.xiaomi.hm.health.opensdk.IHMOpenService";

    public static class Default implements IHMOpenService {
        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int alert(String title, String message) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int closeApduChannel() throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String deleteCard(Map info) throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int dfu(int type, String path, IHMCallback cb) throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String getMacAddress() throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public NfcTag getNfcTag() throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String getSN() throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String getSeId(Map info) throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int openApduChannel() throws RemoteException {
            return 0;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String queryCardInfo(Map info) throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public HMApduResponse sendApduRequest(HMApduRequest request) throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public HMApduResponse sendMasterApduRequest(HMApduRequest request) throws RemoteException {
            return null;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int setReminder(HMReminder reminder) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IHMOpenService {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 8;
        public static final int i = 9;
        public static final int j = 10;
        public static final int k = 11;
        public static final int l = 12;
        public static final int m = 13;

        public static class a implements IHMOpenService {
            public static IHMOpenService b;
            private IBinder a;

            public a(IBinder remote) {
                this.a = remote;
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public int alert(String title, String message) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    parcelObtain.writeString(title);
                    parcelObtain.writeString(message);
                    if (!this.a.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().alert(title, message);
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
                return this.a;
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public int closeApduChannel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    if (!this.a.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().closeApduChannel();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String d() {
                return IHMOpenService.DESCRIPTOR;
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public String deleteCard(Map info) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(info);
                    if (!this.a.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().deleteCard(info);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public int dfu(int type, String path, IHMCallback cb) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    parcelObtain.writeInt(type);
                    parcelObtain.writeString(path);
                    parcelObtain.writeStrongBinder(cb != null ? cb.asBinder() : null);
                    if (!this.a.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dfu(type, path, cb);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public String getMacAddress() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    if (!this.a.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMacAddress();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public NfcTag getNfcTag() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    if (!this.a.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNfcTag();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? NfcTag.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public String getSN() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    if (!this.a.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSN();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public String getSeId(Map info) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(info);
                    if (!this.a.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSeId(info);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public int openApduChannel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    if (!this.a.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().openApduChannel();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public String queryCardInfo(Map info) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    parcelObtain.writeMap(info);
                    if (!this.a.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryCardInfo(info);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public HMApduResponse sendApduRequest(HMApduRequest request) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    if (request != null) {
                        parcelObtain.writeInt(1);
                        request.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.a.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendApduRequest(request);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? HMApduResponse.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public HMApduResponse sendMasterApduRequest(HMApduRequest request) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    if (request != null) {
                        parcelObtain.writeInt(1);
                        request.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.a.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendMasterApduRequest(request);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? HMApduResponse.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
            public int setReminder(HMReminder reminder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IHMOpenService.DESCRIPTOR);
                    if (reminder != null) {
                        parcelObtain.writeInt(1);
                        reminder.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.a.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setReminder(reminder);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IHMOpenService.DESCRIPTOR);
        }

        public static IHMOpenService asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(IHMOpenService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHMOpenService)) ? new a(obj) : (IHMOpenService) iInterfaceQueryLocalInterface;
        }

        public static IHMOpenService getDefaultImpl() {
            return a.b;
        }

        public static boolean setDefaultImpl(IHMOpenService impl) {
            if (a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl == null) {
                return false;
            }
            a.b = impl;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1598968902) {
                parcel2.writeString(IHMOpenService.DESCRIPTOR);
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    int iOpenApduChannel = openApduChannel();
                    parcel2.writeNoException();
                    parcel2.writeInt(iOpenApduChannel);
                    return true;
                case 2:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    int iCloseApduChannel = closeApduChannel();
                    parcel2.writeNoException();
                    parcel2.writeInt(iCloseApduChannel);
                    return true;
                case 3:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    HMApduResponse hMApduResponseSendApduRequest = sendApduRequest(parcel.readInt() != 0 ? HMApduRequest.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (hMApduResponseSendApduRequest != null) {
                        parcel2.writeInt(1);
                        hMApduResponseSendApduRequest.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    HMApduResponse hMApduResponseSendMasterApduRequest = sendMasterApduRequest(parcel.readInt() != 0 ? HMApduRequest.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (hMApduResponseSendMasterApduRequest != null) {
                        parcel2.writeInt(1);
                        hMApduResponseSendMasterApduRequest.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 5:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    int iAlert = alert(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iAlert);
                    return true;
                case 6:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    int reminder = setReminder(parcel.readInt() != 0 ? HMReminder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(reminder);
                    return true;
                case 7:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    String macAddress = getMacAddress();
                    parcel2.writeNoException();
                    parcel2.writeString(macAddress);
                    return true;
                case 8:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    int iDfu = dfu(parcel.readInt(), parcel.readString(), IHMCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iDfu);
                    return true;
                case 9:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    String sn = getSN();
                    parcel2.writeNoException();
                    parcel2.writeString(sn);
                    return true;
                case 10:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    NfcTag nfcTag = getNfcTag();
                    parcel2.writeNoException();
                    if (nfcTag != null) {
                        parcel2.writeInt(1);
                        nfcTag.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    String seId = getSeId(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(seId);
                    return true;
                case 12:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    String strDeleteCard = deleteCard(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strDeleteCard);
                    return true;
                case 13:
                    parcel.enforceInterface(IHMOpenService.DESCRIPTOR);
                    String strQueryCardInfo = queryCardInfo(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeString(strQueryCardInfo);
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    int alert(String title, String message) throws RemoteException;

    int closeApduChannel() throws RemoteException;

    String deleteCard(Map info) throws RemoteException;

    int dfu(int type, String path, IHMCallback cb) throws RemoteException;

    String getMacAddress() throws RemoteException;

    NfcTag getNfcTag() throws RemoteException;

    String getSN() throws RemoteException;

    String getSeId(Map info) throws RemoteException;

    int openApduChannel() throws RemoteException;

    String queryCardInfo(Map info) throws RemoteException;

    HMApduResponse sendApduRequest(HMApduRequest request) throws RemoteException;

    HMApduResponse sendMasterApduRequest(HMApduRequest request) throws RemoteException;

    int setReminder(HMReminder reminder) throws RemoteException;
}
