package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.fitness.sport_xms.data.DeviceInfo;
import com.xiaomi.fitness.sport_xms.data.SportXmsFinishData;
import com.xiaomi.fitness.sport_xms.data.SportXmsRequestData;

/* JADX INFO: loaded from: classes10.dex */
public interface hzc extends IInterface {

    public static abstract class a extends Binder implements hzc {
        static final int TRANSACTION_abnormalChangeSportStateToFinish = 6;
        static final int TRANSACTION_finishSport = 4;
        static final int TRANSACTION_finishSportByType = 24;
        static final int TRANSACTION_getAidongMemberExpireTimestamp = 19;
        static final int TRANSACTION_getCurDeviceMode = 21;
        static final int TRANSACTION_getDeviceBattery = 14;
        static final int TRANSACTION_getDeviceInfo = 23;
        static final int TRANSACTION_goToAidongCoursePaymentPage = 18;
        static final int TRANSACTION_hasOngoingSport = 16;
        static final int TRANSACTION_isDeviceConnected = 11;
        static final int TRANSACTION_isDeviceSporting = 17;
        static final int TRANSACTION_isOpenPaidFeatures = 20;
        static final int TRANSACTION_isSupportSomatosensoryGame = 15;
        static final int TRANSACTION_pauseSport = 2;
        static final int TRANSACTION_restartSport = 5;
        static final int TRANSACTION_resumeSport = 3;
        static final int TRANSACTION_setAidongCourseVipInfoListener = 25;
        static final int TRANSACTION_setDeviceConnectedListener = 12;
        static final int TRANSACTION_setSportStateChangedListener = 7;
        static final int TRANSACTION_setSportXmsDataChangedListener = 8;
        static final int TRANSACTION_setSportXmsSensorDataChangedListener = 9;
        static final int TRANSACTION_setXiaomiUserInfoListener = 10;
        static final int TRANSACTION_shake = 13;
        static final int TRANSACTION_startSport = 1;
        static final int TRANSACTION_switchCurDeviceMode = 22;

        /* JADX INFO: renamed from: hzc$a$a, reason: collision with other inner class name */
        public static class C0961a implements hzc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f20619a;

            public C0961a(IBinder iBinder) {
                this.f20619a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20619a;
            }

            @Override // defpackage.hzc
            public void finishSportByType(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f20619a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hzc
            public void pauseSport(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f20619a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hzc
            public void restartSport(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f20619a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hzc
            public void setSportStateChangedListener(mxc mxcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
                    parcelObtain.writeStrongInterface(mxcVar);
                    this.f20619a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hzc
            public void setSportXmsSensorDataChangedListener(lxc lxcVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
                    parcelObtain.writeStrongInterface(lxcVar);
                    this.f20619a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.hzc
            public void startSport(String str, SportXmsRequestData sportXmsRequestData) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, sportXmsRequestData, 0);
                    this.f20619a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
        }

        public static hzc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof hzc)) ? new C0961a(iBinder) : (hzc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.fitness.sport_xms.launch.ISportXmsApi");
                return true;
            }
            switch (i) {
                case 1:
                    startSport(parcel.readString(), (SportXmsRequestData) b.c(parcel, SportXmsRequestData.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    pauseSport(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    resumeSport(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    finishSport(parcel.readString(), (SportXmsFinishData) b.c(parcel, SportXmsFinishData.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    restartSport(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    abnormalChangeSportStateToFinish();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    setSportStateChangedListener(mxc.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    setSportXmsDataChangedListener(kxc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    setSportXmsSensorDataChangedListener(lxc.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    setXiaomiUserInfoListener(nxc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    boolean zIsDeviceConnected = isDeviceConnected();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsDeviceConnected ? 1 : 0);
                    return true;
                case 12:
                    setDeviceConnectedListener(zwc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    shake(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    String deviceBattery = getDeviceBattery();
                    parcel2.writeNoException();
                    parcel2.writeString(deviceBattery);
                    return true;
                case 15:
                    boolean zIsSupportSomatosensoryGame = isSupportSomatosensoryGame();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupportSomatosensoryGame ? 1 : 0);
                    return true;
                case 16:
                    boolean zHasOngoingSport = hasOngoingSport();
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasOngoingSport ? 1 : 0);
                    return true;
                case 17:
                    isDeviceSporting(cxc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    goToAidongCoursePaymentPage();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    getAidongMemberExpireTimestamp(wwc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    boolean zIsOpenPaidFeatures = isOpenPaidFeatures();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsOpenPaidFeatures ? 1 : 0);
                    return true;
                case 21:
                    getCurDeviceMode(axc.a.s2(parcel.readStrongBinder()));
                    return true;
                case 22:
                    switchCurDeviceMode(parcel.readInt(), axc.a.s2(parcel.readStrongBinder()));
                    return true;
                case 23:
                    DeviceInfo deviceInfo = getDeviceInfo();
                    parcel2.writeNoException();
                    b.d(parcel2, deviceInfo, 1);
                    return true;
                case 24:
                    finishSportByType(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    setAidongCourseVipInfoListener(xwc.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void abnormalChangeSportStateToFinish() throws RemoteException;

    void finishSport(String str, SportXmsFinishData sportXmsFinishData) throws RemoteException;

    void finishSportByType(String str, int i) throws RemoteException;

    void getAidongMemberExpireTimestamp(wwc wwcVar) throws RemoteException;

    void getCurDeviceMode(axc axcVar) throws RemoteException;

    String getDeviceBattery() throws RemoteException;

    DeviceInfo getDeviceInfo() throws RemoteException;

    void goToAidongCoursePaymentPage() throws RemoteException;

    boolean hasOngoingSport() throws RemoteException;

    boolean isDeviceConnected() throws RemoteException;

    void isDeviceSporting(cxc cxcVar) throws RemoteException;

    boolean isOpenPaidFeatures() throws RemoteException;

    boolean isSupportSomatosensoryGame() throws RemoteException;

    void pauseSport(String str, int i) throws RemoteException;

    void restartSport(String str, int i) throws RemoteException;

    void resumeSport(String str, int i) throws RemoteException;

    void setAidongCourseVipInfoListener(xwc xwcVar) throws RemoteException;

    void setDeviceConnectedListener(zwc zwcVar) throws RemoteException;

    void setSportStateChangedListener(mxc mxcVar) throws RemoteException;

    void setSportXmsDataChangedListener(kxc kxcVar) throws RemoteException;

    void setSportXmsSensorDataChangedListener(lxc lxcVar) throws RemoteException;

    void setXiaomiUserInfoListener(nxc nxcVar) throws RemoteException;

    void shake(int i) throws RemoteException;

    void startSport(String str, SportXmsRequestData sportXmsRequestData) throws RemoteException;

    void switchCurDeviceMode(int i, axc axcVar) throws RemoteException;
}
