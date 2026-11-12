package com.hihonor.systemserver.activityrecognition;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IActivityRecognitionHardwareService extends IInterface {
    boolean disableActivityEvent(String str, String str2, int i) throws RemoteException;

    boolean disableEnvironmentEvent(String str, String str2, int i) throws RemoteException;

    boolean enableActivityEvent(String str, String str2, int i, long j) throws RemoteException;

    boolean enableActivityExtendEvent(String str, String str2, int i, long j, OtherParameters otherParameters) throws RemoteException;

    boolean enableEnvironmentEvent(String str, String str2, int i, long j, OtherParameters otherParameters) throws RemoteException;

    boolean exitEnvironmentFunction(String str, String str2, OtherParameters otherParameters) throws RemoteException;

    boolean flush() throws RemoteException;

    int getARVersion(String str, int i) throws RemoteException;

    HwActivityChangedExtendEvent getCurrentActivity() throws RemoteException;

    HwActivityChangedExtendEvent getCurrentActivityV1_1() throws RemoteException;

    HwEnvironmentChangedEvent getCurrentEnvironment() throws RemoteException;

    HwEnvironmentChangedEvent getCurrentEnvironmentV1_1() throws RemoteException;

    String[] getSupportedActivities() throws RemoteException;

    String[] getSupportedEnvironments() throws RemoteException;

    int getSupportedModule() throws RemoteException;

    boolean initEnvironmentFunction(String str, String str2, OtherParameters otherParameters) throws RemoteException;

    boolean registerSink(String str, IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink) throws RemoteException;

    boolean unregisterSink(String str, IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink) throws RemoteException;

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class Stub extends Binder implements IActivityRecognitionHardwareService {
        private static final String DESCRIPTOR = "com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService";
        static final int TRANSACTION_disableActivityEvent = 7;
        static final int TRANSACTION_disableEnvironmentEvent = 15;
        static final int TRANSACTION_enableActivityEvent = 5;
        static final int TRANSACTION_enableActivityExtendEvent = 6;
        static final int TRANSACTION_enableEnvironmentEvent = 14;
        static final int TRANSACTION_exitEnvironmentFunction = 12;
        static final int TRANSACTION_flush = 9;
        static final int TRANSACTION_getARVersion = 16;
        static final int TRANSACTION_getCurrentActivity = 8;
        static final int TRANSACTION_getCurrentActivityV1_1 = 17;
        static final int TRANSACTION_getCurrentEnvironment = 13;
        static final int TRANSACTION_getCurrentEnvironmentV1_1 = 18;
        static final int TRANSACTION_getSupportedActivities = 2;
        static final int TRANSACTION_getSupportedEnvironments = 10;
        static final int TRANSACTION_getSupportedModule = 1;
        static final int TRANSACTION_initEnvironmentFunction = 11;
        static final int TRANSACTION_registerSink = 3;
        static final int TRANSACTION_unregisterSink = 4;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IActivityRecognitionHardwareService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IActivityRecognitionHardwareService)) {
                return (IActivityRecognitionHardwareService) iInterfaceQueryLocalInterface;
            }
            return new e(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int supportedModule = getSupportedModule();
                    parcel2.writeNoException();
                    parcel2.writeInt(supportedModule);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    String[] supportedActivities = getSupportedActivities();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(supportedActivities);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zRegisterSink = registerSink(parcel.readString(), IActivityRecognitionHardwareSink.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterSink ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zUnregisterSink = unregisterSink(parcel.readString(), IActivityRecognitionHardwareSink.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnregisterSink ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zEnableActivityEvent = enableActivityEvent(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableActivityEvent ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zEnableActivityExtendEvent = enableActivityExtendEvent(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0 ? OtherParameters.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableActivityExtendEvent ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zDisableActivityEvent = disableActivityEvent(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDisableActivityEvent ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    HwActivityChangedExtendEvent currentActivity = getCurrentActivity();
                    parcel2.writeNoException();
                    if (currentActivity != null) {
                        parcel2.writeInt(1);
                        currentActivity.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zFlush = flush();
                    parcel2.writeNoException();
                    parcel2.writeInt(zFlush ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    String[] supportedEnvironments = getSupportedEnvironments();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(supportedEnvironments);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zInitEnvironmentFunction = initEnvironmentFunction(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? OtherParameters.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zInitEnvironmentFunction ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zExitEnvironmentFunction = exitEnvironmentFunction(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? OtherParameters.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zExitEnvironmentFunction ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    HwEnvironmentChangedEvent currentEnvironment = getCurrentEnvironment();
                    parcel2.writeNoException();
                    if (currentEnvironment != null) {
                        parcel2.writeInt(1);
                        currentEnvironment.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zEnableEnvironmentEvent = enableEnvironmentEvent(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0 ? OtherParameters.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableEnvironmentEvent ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zDisableEnvironmentEvent = disableEnvironmentEvent(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDisableEnvironmentEvent ? 1 : 0);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int aRVersion = getARVersion(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(aRVersion);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    HwActivityChangedExtendEvent currentActivityV1_1 = getCurrentActivityV1_1();
                    parcel2.writeNoException();
                    if (currentActivityV1_1 != null) {
                        parcel2.writeInt(1);
                        currentActivityV1_1.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    HwEnvironmentChangedEvent currentEnvironmentV1_1 = getCurrentEnvironmentV1_1();
                    parcel2.writeNoException();
                    if (currentEnvironmentV1_1 != null) {
                        parcel2.writeInt(1);
                        currentEnvironmentV1_1.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class e implements IActivityRecognitionHardwareService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f4739a;

            e(IBinder iBinder) {
                this.f4739a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4739a;
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public int getSupportedModule() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f4739a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public String[] getSupportedActivities() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f4739a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean registerSink(String str, IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iActivityRecognitionHardwareSink != null ? iActivityRecognitionHardwareSink.asBinder() : null);
                    this.f4739a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean unregisterSink(String str, IActivityRecognitionHardwareSink iActivityRecognitionHardwareSink) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iActivityRecognitionHardwareSink != null ? iActivityRecognitionHardwareSink.asBinder() : null);
                    this.f4739a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean enableActivityEvent(String str, String str2, int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    this.f4739a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean enableActivityExtendEvent(String str, String str2, int i, long j, OtherParameters otherParameters) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    if (otherParameters != null) {
                        parcelObtain.writeInt(1);
                        otherParameters.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f4739a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean disableActivityEvent(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.f4739a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public HwActivityChangedExtendEvent getCurrentActivity() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f4739a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? HwActivityChangedExtendEvent.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean flush() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f4739a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public String[] getSupportedEnvironments() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f4739a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean initEnvironmentFunction(String str, String str2, OtherParameters otherParameters) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (otherParameters != null) {
                        parcelObtain.writeInt(1);
                        otherParameters.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f4739a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean exitEnvironmentFunction(String str, String str2, OtherParameters otherParameters) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (otherParameters != null) {
                        parcelObtain.writeInt(1);
                        otherParameters.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f4739a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public HwEnvironmentChangedEvent getCurrentEnvironment() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f4739a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? HwEnvironmentChangedEvent.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean enableEnvironmentEvent(String str, String str2, int i, long j, OtherParameters otherParameters) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    if (otherParameters != null) {
                        parcelObtain.writeInt(1);
                        otherParameters.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f4739a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public boolean disableEnvironmentEvent(String str, String str2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    this.f4739a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public int getARVersion(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f4739a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public HwActivityChangedExtendEvent getCurrentActivityV1_1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f4739a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? HwActivityChangedExtendEvent.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.hihonor.systemserver.activityrecognition.IActivityRecognitionHardwareService
            public HwEnvironmentChangedEvent getCurrentEnvironmentV1_1() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f4739a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? HwEnvironmentChangedEvent.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
