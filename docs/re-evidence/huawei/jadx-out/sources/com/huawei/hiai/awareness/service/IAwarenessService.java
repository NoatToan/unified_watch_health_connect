package com.huawei.hiai.awareness.service;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hiai.awareness.client.AwarenessEnvelope;
import com.huawei.hiai.awareness.client.OnEnvelopeReceiver;
import com.huawei.hiai.awareness.client.OnResultListener;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public interface IAwarenessService extends IInterface {
    public static final String DESCRIPTOR = "com.huawei.hiai.awareness.service.IAwarenessService";

    public static class Default implements IAwarenessService {
        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean accept(AwarenessEnvelope awarenessEnvelope) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean acceptBatch(List<AwarenessEnvelope> list, OnResultListener onResultListener) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean checkSdkVersion(int i) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean checkServerVersion(int i) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public String getAwarenessApiVersion() throws RemoteException {
            return null;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public RequestResult getCurrentAwareness(int i, boolean z, Bundle bundle, String str) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public RequestResult getCurrentStatus(int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public RequestResult getExtendFenceTriggerResult(ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public RequestResult getFenceTriggerResult(AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public RequestResult getSupportAwarenessCapability(int i) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean isIntegrateSensorHub() throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean ohosAccept(AwarenessEnvelope awarenessEnvelope) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean ohosAcceptBatch(List<AwarenessEnvelope> list, OnEnvelopeReceiver onEnvelopeReceiver, OnResultListener onResultListener) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean ohosAcceptEx(AwarenessEnvelope awarenessEnvelope, OnEnvelopeReceiver onEnvelopeReceiver) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean ohosAcceptExEx(AwarenessEnvelope awarenessEnvelope, OnEnvelopeReceiver onEnvelopeReceiver, OnResultListener onResultListener) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerAppLifeChangeFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerAppUseTotalTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerAwarenessListener(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, IAwarenessListener iAwarenessListener) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerBroadcastEventFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerCustomLocationFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerDatabaseMonitorFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerDeviceStatusFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerDeviceUseTotalTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerLocationFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerMapInfoReportFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerMotionFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerMovementFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerOneAppContinuousUseTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerScreenUnlockFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerScreenUnlockTotalNumberFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerSwingFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean registerTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean setClientInfo(String str, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public RequestResult setReportPeriod(ExtendAwarenessFence extendAwarenessFence) throws RemoteException {
            return null;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public int setSwingController(int i) throws RemoteException {
            return 0;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean unRegisterAwarenessListener(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, IAwarenessListener iAwarenessListener) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean unRegisterExtendFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }

        @Override // com.huawei.hiai.awareness.service.IAwarenessService
        public boolean unRegisterFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
            return false;
        }
    }

    boolean accept(AwarenessEnvelope awarenessEnvelope) throws RemoteException;

    boolean acceptBatch(List<AwarenessEnvelope> list, OnResultListener onResultListener) throws RemoteException;

    boolean checkSdkVersion(int i) throws RemoteException;

    boolean checkServerVersion(int i) throws RemoteException;

    String getAwarenessApiVersion() throws RemoteException;

    RequestResult getCurrentAwareness(int i, boolean z, Bundle bundle, String str) throws RemoteException;

    RequestResult getCurrentStatus(int i) throws RemoteException;

    RequestResult getExtendFenceTriggerResult(ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    RequestResult getFenceTriggerResult(AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    RequestResult getSupportAwarenessCapability(int i) throws RemoteException;

    boolean isIntegrateSensorHub() throws RemoteException;

    boolean ohosAccept(AwarenessEnvelope awarenessEnvelope) throws RemoteException;

    boolean ohosAcceptBatch(List<AwarenessEnvelope> list, OnEnvelopeReceiver onEnvelopeReceiver, OnResultListener onResultListener) throws RemoteException;

    boolean ohosAcceptEx(AwarenessEnvelope awarenessEnvelope, OnEnvelopeReceiver onEnvelopeReceiver) throws RemoteException;

    boolean ohosAcceptExEx(AwarenessEnvelope awarenessEnvelope, OnEnvelopeReceiver onEnvelopeReceiver, OnResultListener onResultListener) throws RemoteException;

    boolean registerAppLifeChangeFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerAppUseTotalTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerAwarenessListener(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, IAwarenessListener iAwarenessListener) throws RemoteException;

    boolean registerBroadcastEventFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerCustomLocationFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerDatabaseMonitorFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerDeviceStatusFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerDeviceUseTotalTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerLocationFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerMapInfoReportFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerMotionFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerMovementFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerOneAppContinuousUseTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerScreenUnlockFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerScreenUnlockTotalNumberFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerSwingFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean registerTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean setClientInfo(String str, Bundle bundle) throws RemoteException;

    RequestResult setReportPeriod(ExtendAwarenessFence extendAwarenessFence) throws RemoteException;

    int setSwingController(int i) throws RemoteException;

    boolean unRegisterAwarenessListener(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, IAwarenessListener iAwarenessListener) throws RemoteException;

    boolean unRegisterExtendFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    boolean unRegisterFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException;

    public static abstract class Stub extends Binder implements IAwarenessService {
        static final int TRANSACTION_accept = 33;
        static final int TRANSACTION_acceptBatch = 37;
        static final int TRANSACTION_checkSdkVersion = 32;
        static final int TRANSACTION_checkServerVersion = 12;
        static final int TRANSACTION_getAwarenessApiVersion = 13;
        static final int TRANSACTION_getCurrentAwareness = 14;
        static final int TRANSACTION_getCurrentStatus = 1;
        static final int TRANSACTION_getExtendFenceTriggerResult = 18;
        static final int TRANSACTION_getFenceTriggerResult = 11;
        static final int TRANSACTION_getSupportAwarenessCapability = 19;
        static final int TRANSACTION_isIntegrateSensorHub = 23;
        static final int TRANSACTION_ohosAccept = 34;
        static final int TRANSACTION_ohosAcceptBatch = 38;
        static final int TRANSACTION_ohosAcceptEx = 35;
        static final int TRANSACTION_ohosAcceptExEx = 36;
        static final int TRANSACTION_registerAppLifeChangeFence = 24;
        static final int TRANSACTION_registerAppUseTotalTimeFence = 5;
        static final int TRANSACTION_registerAwarenessListener = 27;
        static final int TRANSACTION_registerBroadcastEventFence = 16;
        static final int TRANSACTION_registerCustomLocationFence = 15;
        static final int TRANSACTION_registerDatabaseMonitorFence = 31;
        static final int TRANSACTION_registerDeviceStatusFence = 21;
        static final int TRANSACTION_registerDeviceUseTotalTimeFence = 7;
        static final int TRANSACTION_registerLocationFence = 4;
        static final int TRANSACTION_registerMapInfoReportFence = 30;
        static final int TRANSACTION_registerMotionFence = 2;
        static final int TRANSACTION_registerMovementFence = 20;
        static final int TRANSACTION_registerOneAppContinuousUseTimeFence = 6;
        static final int TRANSACTION_registerScreenUnlockFence = 9;
        static final int TRANSACTION_registerScreenUnlockTotalNumberFence = 8;
        static final int TRANSACTION_registerSwingFence = 25;
        static final int TRANSACTION_registerTimeFence = 3;
        static final int TRANSACTION_setClientInfo = 29;
        static final int TRANSACTION_setReportPeriod = 22;
        static final int TRANSACTION_setSwingController = 26;
        static final int TRANSACTION_unRegisterAwarenessListener = 28;
        static final int TRANSACTION_unRegisterExtendFence = 17;
        static final int TRANSACTION_unRegisterFence = 10;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IAwarenessService.DESCRIPTOR);
        }

        public static IAwarenessService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAwarenessService.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IAwarenessService)) {
                return (IAwarenessService) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAwarenessService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAwarenessService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    RequestResult currentStatus = getCurrentStatus(parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, currentStatus, 1);
                    return true;
                case 2:
                    boolean zRegisterMotionFence = registerMotionFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterMotionFence ? 1 : 0);
                    return true;
                case 3:
                    boolean zRegisterTimeFence = registerTimeFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterTimeFence ? 1 : 0);
                    return true;
                case 4:
                    boolean zRegisterLocationFence = registerLocationFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterLocationFence ? 1 : 0);
                    return true;
                case 5:
                    boolean zRegisterAppUseTotalTimeFence = registerAppUseTotalTimeFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterAppUseTotalTimeFence ? 1 : 0);
                    return true;
                case 6:
                    boolean zRegisterOneAppContinuousUseTimeFence = registerOneAppContinuousUseTimeFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterOneAppContinuousUseTimeFence ? 1 : 0);
                    return true;
                case 7:
                    boolean zRegisterDeviceUseTotalTimeFence = registerDeviceUseTotalTimeFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterDeviceUseTotalTimeFence ? 1 : 0);
                    return true;
                case 8:
                    boolean zRegisterScreenUnlockTotalNumberFence = registerScreenUnlockTotalNumberFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterScreenUnlockTotalNumberFence ? 1 : 0);
                    return true;
                case 9:
                    boolean zRegisterScreenUnlockFence = registerScreenUnlockFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterScreenUnlockFence ? 1 : 0);
                    return true;
                case 10:
                    boolean zUnRegisterFence = unRegisterFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnRegisterFence ? 1 : 0);
                    return true;
                case 11:
                    RequestResult fenceTriggerResult = getFenceTriggerResult((AwarenessFence) _Parcel.readTypedObject(parcel, AwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, fenceTriggerResult, 1);
                    return true;
                case 12:
                    boolean zCheckServerVersion = checkServerVersion(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zCheckServerVersion ? 1 : 0);
                    return true;
                case 13:
                    String awarenessApiVersion = getAwarenessApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeString(awarenessApiVersion);
                    return true;
                case 14:
                    RequestResult currentAwareness = getCurrentAwareness(parcel.readInt(), parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, currentAwareness, 1);
                    return true;
                case 15:
                    boolean zRegisterCustomLocationFence = registerCustomLocationFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterCustomLocationFence ? 1 : 0);
                    return true;
                case 16:
                    boolean zRegisterBroadcastEventFence = registerBroadcastEventFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterBroadcastEventFence ? 1 : 0);
                    return true;
                case 17:
                    boolean zUnRegisterExtendFence = unRegisterExtendFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnRegisterExtendFence ? 1 : 0);
                    return true;
                case 18:
                    RequestResult extendFenceTriggerResult = getExtendFenceTriggerResult((ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, extendFenceTriggerResult, 1);
                    return true;
                case 19:
                    RequestResult supportAwarenessCapability = getSupportAwarenessCapability(parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, supportAwarenessCapability, 1);
                    return true;
                case 20:
                    boolean zRegisterMovementFence = registerMovementFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterMovementFence ? 1 : 0);
                    return true;
                case 21:
                    boolean zRegisterDeviceStatusFence = registerDeviceStatusFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterDeviceStatusFence ? 1 : 0);
                    return true;
                case 22:
                    RequestResult reportPeriod = setReportPeriod((ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, reportPeriod, 1);
                    return true;
                case 23:
                    boolean zIsIntegrateSensorHub = isIntegrateSensorHub();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsIntegrateSensorHub ? 1 : 0);
                    return true;
                case 24:
                    boolean zRegisterAppLifeChangeFence = registerAppLifeChangeFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterAppLifeChangeFence ? 1 : 0);
                    return true;
                case 25:
                    boolean zRegisterSwingFence = registerSwingFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterSwingFence ? 1 : 0);
                    return true;
                case 26:
                    int swingController = setSwingController(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(swingController);
                    return true;
                case 27:
                    boolean zRegisterAwarenessListener = registerAwarenessListener(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), IAwarenessListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterAwarenessListener ? 1 : 0);
                    return true;
                case 28:
                    boolean zUnRegisterAwarenessListener = unRegisterAwarenessListener(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), IAwarenessListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnRegisterAwarenessListener ? 1 : 0);
                    return true;
                case 29:
                    boolean clientInfo = setClientInfo(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(clientInfo ? 1 : 0);
                    return true;
                case 30:
                    boolean zRegisterMapInfoReportFence = registerMapInfoReportFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterMapInfoReportFence ? 1 : 0);
                    return true;
                case 31:
                    boolean zRegisterDatabaseMonitorFence = registerDatabaseMonitorFence(IRequestCallBack.Stub.asInterface(parcel.readStrongBinder()), (ExtendAwarenessFence) _Parcel.readTypedObject(parcel, ExtendAwarenessFence.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), (PendingIntent) _Parcel.readTypedObject(parcel, PendingIntent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterDatabaseMonitorFence ? 1 : 0);
                    return true;
                case 32:
                    boolean zCheckSdkVersion = checkSdkVersion(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zCheckSdkVersion ? 1 : 0);
                    return true;
                case 33:
                    boolean zAccept = accept((AwarenessEnvelope) _Parcel.readTypedObject(parcel, AwarenessEnvelope.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zAccept ? 1 : 0);
                    return true;
                case 34:
                    boolean zOhosAccept = ohosAccept((AwarenessEnvelope) _Parcel.readTypedObject(parcel, AwarenessEnvelope.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zOhosAccept ? 1 : 0);
                    return true;
                case 35:
                    boolean zOhosAcceptEx = ohosAcceptEx((AwarenessEnvelope) _Parcel.readTypedObject(parcel, AwarenessEnvelope.CREATOR), OnEnvelopeReceiver.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zOhosAcceptEx ? 1 : 0);
                    return true;
                case 36:
                    boolean zOhosAcceptExEx = ohosAcceptExEx((AwarenessEnvelope) _Parcel.readTypedObject(parcel, AwarenessEnvelope.CREATOR), OnEnvelopeReceiver.Stub.asInterface(parcel.readStrongBinder()), OnResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zOhosAcceptExEx ? 1 : 0);
                    return true;
                case 37:
                    boolean zAcceptBatch = acceptBatch(parcel.createTypedArrayList(AwarenessEnvelope.CREATOR), OnResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zAcceptBatch ? 1 : 0);
                    return true;
                case 38:
                    boolean zOhosAcceptBatch = ohosAcceptBatch(parcel.createTypedArrayList(AwarenessEnvelope.CREATOR), OnEnvelopeReceiver.Stub.asInterface(parcel.readStrongBinder()), OnResultListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zOhosAcceptBatch ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class Proxy implements IAwarenessService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAwarenessService.DESCRIPTOR;
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public RequestResult getCurrentStatus(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (RequestResult) _Parcel.readTypedObject(parcelObtain2, RequestResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerMotionFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerLocationFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerAppUseTotalTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerOneAppContinuousUseTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerDeviceUseTotalTimeFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerScreenUnlockTotalNumberFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerScreenUnlockFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean unRegisterFence(IRequestCallBack iRequestCallBack, AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public RequestResult getFenceTriggerResult(AwarenessFence awarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, awarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (RequestResult) _Parcel.readTypedObject(parcelObtain2, RequestResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean checkServerVersion(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public String getAwarenessApiVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public RequestResult getCurrentAwareness(int i, boolean z, Bundle bundle, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (RequestResult) _Parcel.readTypedObject(parcelObtain2, RequestResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerCustomLocationFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerBroadcastEventFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean unRegisterExtendFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public RequestResult getExtendFenceTriggerResult(ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (RequestResult) _Parcel.readTypedObject(parcelObtain2, RequestResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public RequestResult getSupportAwarenessCapability(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (RequestResult) _Parcel.readTypedObject(parcelObtain2, RequestResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerMovementFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerDeviceStatusFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public RequestResult setReportPeriod(ExtendAwarenessFence extendAwarenessFence) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    this.mRemote.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (RequestResult) _Parcel.readTypedObject(parcelObtain2, RequestResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean isIntegrateSensorHub() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    this.mRemote.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerAppLifeChangeFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerSwingFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public int setSwingController(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerAwarenessListener(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, IAwarenessListener iAwarenessListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    parcelObtain.writeStrongInterface(iAwarenessListener);
                    this.mRemote.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean unRegisterAwarenessListener(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, IAwarenessListener iAwarenessListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    parcelObtain.writeStrongInterface(iAwarenessListener);
                    this.mRemote.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean setClientInfo(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerMapInfoReportFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean registerDatabaseMonitorFence(IRequestCallBack iRequestCallBack, ExtendAwarenessFence extendAwarenessFence, Bundle bundle, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iRequestCallBack);
                    _Parcel.writeTypedObject(parcelObtain, extendAwarenessFence, 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    _Parcel.writeTypedObject(parcelObtain, pendingIntent, 0);
                    this.mRemote.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean checkSdkVersion(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean accept(AwarenessEnvelope awarenessEnvelope) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, awarenessEnvelope, 0);
                    this.mRemote.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean ohosAccept(AwarenessEnvelope awarenessEnvelope) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, awarenessEnvelope, 0);
                    this.mRemote.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean ohosAcceptEx(AwarenessEnvelope awarenessEnvelope, OnEnvelopeReceiver onEnvelopeReceiver) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, awarenessEnvelope, 0);
                    parcelObtain.writeStrongInterface(onEnvelopeReceiver);
                    this.mRemote.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean ohosAcceptExEx(AwarenessEnvelope awarenessEnvelope, OnEnvelopeReceiver onEnvelopeReceiver, OnResultListener onResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, awarenessEnvelope, 0);
                    parcelObtain.writeStrongInterface(onEnvelopeReceiver);
                    parcelObtain.writeStrongInterface(onResultListener);
                    this.mRemote.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean acceptBatch(List<AwarenessEnvelope> list, OnResultListener onResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    parcelObtain.writeStrongInterface(onResultListener);
                    this.mRemote.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.hiai.awareness.service.IAwarenessService
            public boolean ohosAcceptBatch(List<AwarenessEnvelope> list, OnEnvelopeReceiver onEnvelopeReceiver, OnResultListener onResultListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAwarenessService.DESCRIPTOR);
                    parcelObtain.writeTypedList(list);
                    parcelObtain.writeStrongInterface(onEnvelopeReceiver);
                    parcelObtain.writeStrongInterface(onResultListener);
                    this.mRemote.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
