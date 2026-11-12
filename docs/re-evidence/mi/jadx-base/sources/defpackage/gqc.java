package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.mi.command.data.BPSetting;
import com.mi.command.data.CalibrationRequest;
import com.mi.command.data.HBPMCalibrationRequest;
import com.mi.command.data.ResearchApp;
import com.mi.command.data.SleepEvaluateReminder;
import com.mi.command.data.UserProfile;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface gqc extends IInterface {

    public static abstract class a extends Binder implements gqc {
        static final int TRANSACTION_getCurrentDeviceVersionInfo = 10;
        static final int TRANSACTION_getHBPMCalibrationStatus = 14;
        static final int TRANSACTION_getSleepReesearchEvaluateResult = 17;
        static final int TRANSACTION_getVersion = 12;
        static final int TRANSACTION_requestAllDaySpo2witch = 11;
        static final int TRANSACTION_requestDeviceHighAccuracySleepSwitch = 7;
        static final int TRANSACTION_requestHBPMCalibration = 13;
        static final int TRANSACTION_requestResearchCalibration = 5;
        static final int TRANSACTION_requestResearchCalibration2 = 15;
        static final int TRANSACTION_requestSyncWebStatus = 8;
        static final int TRANSACTION_setBPResearch = 6;
        static final int TRANSACTION_setResearchUserProfile = 1;
        static final int TRANSACTION_setSleepResearchEvaluateReminder = 16;
        static final int TRANSACTION_setSyncWebStatus = 9;
        static final int TRANSACTION_syncAppResearchList = 2;
        static final int TRANSACTION_syncDeviceResearchList = 3;
        static final int TRANSACTION_updateAppResearch = 4;

        /* JADX INFO: renamed from: gqc$a$a, reason: collision with other inner class name */
        public static class C0944a implements gqc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f19233a;

            public C0944a(IBinder iBinder) {
                this.f19233a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f19233a;
            }
        }

        public a() {
            attachInterface(this, "com.mi.command.ICommand");
        }

        public static gqc asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mi.command.ICommand");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gqc)) ? new C0944a(iBinder) : (gqc) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.mi.command.ICommand");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.mi.command.ICommand");
                return true;
            }
            switch (i) {
                case 1:
                    setResearchUserProfile(parcel.readString(), (UserProfile) b.b(parcel, UserProfile.CREATOR), hpk.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    syncAppResearchList(parcel.readString(), parcel.createTypedArrayList(ResearchApp.CREATOR), parcel.readInt(), hpk.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    syncDeviceResearchList(parcel.readString(), parcel.readInt(), qso.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    updateAppResearch(parcel.readString(), (ResearchApp) b.b(parcel, ResearchApp.CREATOR), hpk.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    requestResearchCalibration(parcel.readString(), (CalibrationRequest) b.b(parcel, CalibrationRequest.CREATOR), gpk.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    setBPResearch(parcel.readString(), (BPSetting) b.b(parcel, BPSetting.CREATOR), hpk.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    requestDeviceHighAccuracySleepSwitch(parcel.readString(), n7c.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    requestSyncWebStatus(vuo.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    setSyncWebStatus(vuo.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    getCurrentDeviceVersionInfo(ru6.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    requestAllDaySpo2witch(parcel.readString(), m61.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    int version = getVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(version);
                    return true;
                case 13:
                    requestHBPMCalibration(parcel.readString(), (HBPMCalibrationRequest) b.b(parcel, HBPMCalibrationRequest.CREATOR), qpk.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    getHBPMCalibrationStatus(parcel.readString(), scb.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    requestResearchCalibration2(parcel.readString(), (CalibrationRequest) b.b(parcel, CalibrationRequest.CREATOR), qpk.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    setSleepResearchEvaluateReminder(parcel.readString(), (SleepEvaluateReminder) b.b(parcel, SleepEvaluateReminder.CREATOR), hpk.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    getSleepReesearchEvaluateResult(parcel.readString(), orm.a.s2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void getCurrentDeviceVersionInfo(ru6 ru6Var) throws RemoteException;

    void getHBPMCalibrationStatus(String str, scb scbVar) throws RemoteException;

    void getSleepReesearchEvaluateResult(String str, orm ormVar) throws RemoteException;

    int getVersion() throws RemoteException;

    void requestAllDaySpo2witch(String str, m61 m61Var) throws RemoteException;

    void requestDeviceHighAccuracySleepSwitch(String str, n7c n7cVar) throws RemoteException;

    void requestHBPMCalibration(String str, HBPMCalibrationRequest hBPMCalibrationRequest, qpk qpkVar) throws RemoteException;

    void requestResearchCalibration(String str, CalibrationRequest calibrationRequest, gpk gpkVar) throws RemoteException;

    void requestResearchCalibration2(String str, CalibrationRequest calibrationRequest, qpk qpkVar) throws RemoteException;

    void requestSyncWebStatus(vuo vuoVar) throws RemoteException;

    void setBPResearch(String str, BPSetting bPSetting, hpk hpkVar) throws RemoteException;

    void setResearchUserProfile(String str, UserProfile userProfile, hpk hpkVar) throws RemoteException;

    void setSleepResearchEvaluateReminder(String str, SleepEvaluateReminder sleepEvaluateReminder, hpk hpkVar) throws RemoteException;

    void setSyncWebStatus(vuo vuoVar) throws RemoteException;

    void syncAppResearchList(String str, List<ResearchApp> list, int i, hpk hpkVar) throws RemoteException;

    void syncDeviceResearchList(String str, int i, qso qsoVar) throws RemoteException;

    void updateAppResearch(String str, ResearchApp researchApp, hpk hpkVar) throws RemoteException;
}
