package com.mi.command.remote;

import android.os.IBinder;
import android.os.RemoteException;
import com.mi.command.data.BPSetting;
import com.mi.command.data.CalibrationRequest;
import com.mi.command.data.HBPMCalibrationRequest;
import com.mi.command.data.ResearchApp;
import com.mi.command.data.ResearchDevice;
import com.mi.command.data.SleepEvaluateReminder;
import com.mi.command.data.SleepEvaluateResult;
import com.mi.command.data.UserProfile;
import com.mi.command.remote.ResearchCommandPb;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.fr9;
import defpackage.gpk;
import defpackage.hpk;
import defpackage.ht9;
import defpackage.it9;
import defpackage.jt9;
import defpackage.ls9;
import defpackage.lt9;
import defpackage.m61;
import defpackage.mt9;
import defpackage.n7c;
import defpackage.orm;
import defpackage.ot9;
import defpackage.pt9;
import defpackage.qpk;
import defpackage.qso;
import defpackage.qt9;
import defpackage.s7r;
import defpackage.scb;
import defpackage.t64;
import defpackage.tu9;
import defpackage.ur9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\t\b\u0007¢\u0006\u0004\b<\u0010=J1\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0015\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\t\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010&¢\u0006\u0004\b'\u0010(J)\u0010+\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)2\b\u0010\t\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)2\b\u0010\t\u001a\u0004\u0018\u00010&¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u000102¢\u0006\u0004\b3\u00104J+\u00107\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u00106\u001a\u0004\u0018\u0001052\b\u0010\t\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u000109¢\u0006\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/mi/command/remote/ResearchCommandPb;", "", "", "did", "Ls7r;", "wearPacket", "", "needResponse", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "callback", "", "call", "(Ljava/lang/String;Ls7r;ZLcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)V", "Lcom/mi/command/data/UserProfile;", "userProfile", "Lhpk;", "setResearchUserProfile", "(Ljava/lang/String;Lcom/mi/command/data/UserProfile;Lhpk;)V", "", "Lcom/mi/command/data/ResearchApp;", "list", "syncAppResearchList", "(Ljava/lang/String;Ljava/util/List;Lhpk;)V", "Lqso;", "syncDeviceResearchList", "(Ljava/lang/String;Lqso;)V", "researchApp", "updateAppResearch", "(Ljava/lang/String;Lcom/mi/command/data/ResearchApp;Lhpk;)V", "Lcom/mi/command/data/BPSetting;", "bpSetting", "setBPResearch", "(Ljava/lang/String;Lcom/mi/command/data/BPSetting;Lhpk;)V", "Lscb;", "getHBPMCalibrationStatus", "(Ljava/lang/String;Lscb;)V", "Lcom/mi/command/data/HBPMCalibrationRequest;", "request", "Lqpk;", "requestHBPMCalibration", "(Ljava/lang/String;Lcom/mi/command/data/HBPMCalibrationRequest;Lqpk;)V", "Lcom/mi/command/data/CalibrationRequest;", "Lgpk;", "requestResearchCalibration", "(Ljava/lang/String;Lcom/mi/command/data/CalibrationRequest;Lgpk;)V", "requestResearchCalibration2", "(Ljava/lang/String;Lcom/mi/command/data/CalibrationRequest;Lqpk;)V", "Ln7c;", "requestDeviceHighAccuracySleepSwitch", "(Ljava/lang/String;Ln7c;)V", "Lm61;", "requestDeviceAllDaySpo2Switch", "(Ljava/lang/String;Lm61;)V", "Lcom/mi/command/data/SleepEvaluateReminder;", "sleepEvaluateReminder", "setSleepResearchEvaluateReminder", "(Ljava/lang/String;Lcom/mi/command/data/SleepEvaluateReminder;Lhpk;)V", "Lorm;", "getSleepReesearchEvaluateResult", "(Ljava/lang/String;Lorm;)V", "<init>", "()V", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nResearchCommandServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResearchCommandServer.kt\ncom/mi/command/remote/ResearchCommandPb\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,743:1\n37#2:744\n36#2,3:745\n*S KotlinDebug\n*F\n+ 1 ResearchCommandServer.kt\ncom/mi/command/remote/ResearchCommandPb\n*L\n675#1:744\n675#1:745,3\n*E\n"})
public final class ResearchCommandPb {

    @NotNull
    public static final String TAG = "Research_CommandPb";

    /* JADX INFO: renamed from: com.mi.command.remote.ResearchCommandPb$getHBPMCalibrationStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/mi/command/remote/ResearchCommandPb$getHBPMCalibrationStatus$1", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements OnSyncCallback {
        final /* synthetic */ scb $callback;

        public AnonymousClass1(scb scbVar) {
            this.$callback = scbVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onSuccess$lambda$1() {
            FitnessLogUtils.i("Research_CommandPb", "hbpmCaliStatus == null");
            return Unit.INSTANCE;
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String did, int type, int code) throws RemoteException {
            FitnessLogUtils.i("Research_CommandPb", "getHBPMCalibrationStatus , code:" + code);
            scb scbVar = this.$callback;
            if (scbVar != null) {
                scbVar.onFail(did, code);
            }
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String did, int type, SyncResult result) throws RemoteException {
            s7r packet;
            ur9 ur9VarU;
            jt9 jt9VarR;
            FitnessLogUtils.i("Research_CommandPb", "getHBPMCalibrationStatus , onSuccess");
            if (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null || (jt9VarR = ur9VarU.r()) == null) {
                new Function0() { // from class: ipk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResearchCommandPb.AnonymousClass1.onSuccess$lambda$1();
                    }
                };
                return;
            }
            scb scbVar = this.$callback;
            FitnessLogUtils.i("Research_CommandPb", "calibSuccessTimes:" + jt9VarR.c + " , calibSuccessTs:" + jt9VarR.d);
            if (scbVar != null) {
                scbVar.k5(did, jt9VarR.c, jt9VarR.d);
            }
        }
    }

    private final void call(String did, s7r wearPacket, boolean needResponse, OnSyncCallback callback) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did == null ? "" : did);
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, wearPacket, needResponse, callback, 0, 16, (Object) null);
            return;
        }
        FitnessLogUtils.i("Research_CommandPb", "device is not connected , did:" + did);
    }

    public final void getHBPMCalibrationStatus(@Nullable String did, @Nullable scb callback) {
        FitnessLogUtils.i("Research_CommandPb", "getHBPMCalibrationStatus , did:" + did);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 91;
        call(did, s7rVar, true, new AnonymousClass1(callback));
    }

    public final void getSleepReesearchEvaluateResult(@Nullable String did, @Nullable final orm callback) {
        FitnessLogUtils.i("Research_CommandPb", "getSleepReesearchEvaluateResult , did:" + did);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 100;
        call(did, s7rVar, true, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.getSleepReesearchEvaluateResult.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "getSleepReesearchEvaluateResult , onError");
                orm ormVar = callback;
                if (ormVar != null) {
                    ormVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                orm ormVar;
                s7r packet;
                ur9 ur9VarU;
                qt9.a aVarP;
                qt9[] qt9VarArr;
                ArrayList arrayList = new ArrayList();
                if (result != null && (packet = result.getPacket()) != null && (ur9VarU = packet.u()) != null && (aVarP = ur9VarU.P()) != null && (qt9VarArr = aVarP.c) != null) {
                    ArrayList arrayList2 = new ArrayList(qt9VarArr.length);
                    for (qt9 qt9Var : qt9VarArr) {
                        arrayList2.add(Boolean.valueOf(arrayList.add(new SleepEvaluateResult(qt9Var.c, qt9Var.d, qt9Var.e, qt9Var.f))));
                    }
                }
                FitnessLogUtils.i("Research_CommandPb", "getSleepReesearchEvaluateResult , onSuccess , result:" + CollectionsKt___CollectionsKt.toList(arrayList));
                if (result == null || (ormVar = callback) == null) {
                    return;
                }
                ormVar.onSuccess(arrayList);
            }
        });
    }

    public final void requestDeviceAllDaySpo2Switch(@Nullable String did, @Nullable final m61 callback) {
        FitnessLogUtils.i("Research_CommandPb", "requestDeviceHighAccuracySleepSwitch , did:" + did);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 8;
        call(did, s7rVar, true, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.requestDeviceAllDaySpo2Switch.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.i("Research_CommandPb", "onError , did:" + did2 + " , code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                s7r packet;
                ur9 ur9VarU;
                fr9 fr9VarQ;
                boolean z = false;
                if (result != null && (packet = result.getPacket()) != null && (ur9VarU = packet.u()) != null && (fr9VarQ = ur9VarU.q()) != null && fr9VarQ.d == 2) {
                    z = true;
                }
                FitnessLogUtils.i("Research_CommandPb", "onSuccess , did:" + did2 + " , result:" + result);
                m61 m61Var = callback;
                if (m61Var != null) {
                    m61Var.f(did2, z);
                }
            }
        });
    }

    public final void requestDeviceHighAccuracySleepSwitch(@Nullable String did, @Nullable final n7c callback) {
        FitnessLogUtils.i("Research_CommandPb", "requestDeviceHighAccuracySleepSwitch , did:" + did);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 10;
        call(did, s7rVar, true, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.requestDeviceHighAccuracySleepSwitch.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                FitnessLogUtils.i("Research_CommandPb", "onError , did:" + did2 + " , code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                s7r packet;
                ur9 ur9VarU;
                ls9 ls9VarZ;
                ls9.a aVar;
                boolean z = (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null || (ls9VarZ = ur9VarU.z()) == null || (aVar = ls9VarZ.j) == null) ? false : aVar.c;
                FitnessLogUtils.i("Research_CommandPb", "onSuccess , did:" + did2 + " , result:" + result);
                n7c n7cVar = callback;
                if (n7cVar != null) {
                    n7cVar.f(did2, z);
                }
            }
        });
    }

    public final void requestHBPMCalibration(@Nullable String did, @NotNull HBPMCalibrationRequest request, @Nullable final qpk callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        FitnessLogUtils.i("Research_CommandPb", "requestHBPMCalibration , request:" + request);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 90;
        it9 it9Var = new it9();
        it9Var.c = request.getResearchId();
        it9Var.d = request.getNeedCalibTimes();
        it9Var.e = request.getCurrentCalibTimes();
        it9Var.f = request.getSystolicBp();
        it9Var.g = request.getDiastolicBp();
        ur9 ur9Var = new ur9();
        ur9Var.i0(it9Var);
        s7rVar.S(ur9Var);
        call(did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.requestHBPMCalibration.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "requestHBPMCalibrationStatus , onError, did::" + did2 + " , code:" + code);
                qpk qpkVar = callback;
                if (qpkVar != null) {
                    qpkVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "requestHBPMCalibrationStatus , onSuccess, did::" + did2);
                qpk qpkVar = callback;
                if (qpkVar != null) {
                    qpkVar.onSuccess(did2);
                }
            }
        });
    }

    public final void requestResearchCalibration(@Nullable String did, @NotNull CalibrationRequest request, @Nullable final gpk callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        FitnessLogUtils.i("Research_CommandPb", "requestResearchCalibration , did:" + did + ", request:" + request + ", callback:" + callback);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 79;
        mt9 mt9Var = new mt9();
        mt9Var.c = request.getResearchId();
        mt9Var.d = request.getType();
        ur9 ur9Var = new ur9();
        ur9Var.E0(mt9Var);
        s7rVar.S(ur9Var);
        call(did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.requestResearchCalibration.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "requestResearchCalibration , onError, did::" + did2 + " , code:" + code);
                gpk gpkVar = callback;
                if (gpkVar != null) {
                    gpkVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "requestResearchCalibration , onSuccess, did::" + did2);
                gpk gpkVar = callback;
                if (gpkVar != null) {
                    gpkVar.onSuccess(did2);
                }
            }
        });
    }

    public final void requestResearchCalibration2(@Nullable String did, @NotNull CalibrationRequest request, @Nullable final qpk callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        FitnessLogUtils.i("Research_CommandPb", "requestResearchCalibration2 , did:" + did + ", request:" + request + ", callback:" + callback);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 79;
        mt9 mt9Var = new mt9();
        mt9Var.c = request.getResearchId();
        mt9Var.d = request.getType();
        ur9 ur9Var = new ur9();
        ur9Var.E0(mt9Var);
        s7rVar.S(ur9Var);
        call(did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.requestResearchCalibration2.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "requestResearchCalibration , onError, did::" + did2 + " , code:" + code);
                qpk qpkVar = callback;
                if (qpkVar != null) {
                    qpkVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "requestResearchCalibration , onSuccess, did::" + did2);
                qpk qpkVar = callback;
                if (qpkVar != null) {
                    qpkVar.onSuccess(did2);
                }
            }
        });
    }

    public final void setBPResearch(@Nullable String did, @NotNull BPSetting bpSetting, @Nullable final hpk callback) {
        Intrinsics.checkNotNullParameter(bpSetting, "bpSetting");
        FitnessLogUtils.i("Research_CommandPb", "setBPResearch , did:" + did + " , bpSetting:" + bpSetting);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 82;
        lt9 lt9Var = new lt9();
        lt9Var.c = bpSetting.getResearchId();
        t64 t64Var = new t64();
        t64Var.c = bpSetting.getCaliMorning().getHour();
        t64Var.d = bpSetting.getCaliMorning().getMinuter();
        t64Var.e = bpSetting.getCaliMorning().getSecond();
        t64Var.f = bpSetting.getCaliMorning().getMillisecond();
        t64 t64Var2 = new t64();
        t64Var2.c = bpSetting.getCaliAfternoon().getHour();
        t64Var2.d = bpSetting.getCaliAfternoon().getMinuter();
        t64Var2.e = bpSetting.getCaliAfternoon().getSecond();
        t64Var2.f = bpSetting.getCaliAfternoon().getMillisecond();
        lt9Var.d = t64Var;
        lt9Var.e = t64Var2;
        lt9Var.f = bpSetting.getReminderFrequence();
        ur9 ur9Var = new ur9();
        ur9Var.D0(lt9Var);
        s7rVar.S(ur9Var);
        call(did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.setBPResearch.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "setBPResearch , onError , type:" + type + " , did:" + did2 + " , code:" + code);
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "setBPResearch , onSuccess , type:" + type + " , did:" + did2);
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onSuccess(did2);
                }
            }
        });
    }

    public final void setResearchUserProfile(@Nullable String did, @NotNull UserProfile userProfile, @Nullable final hpk callback) {
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        FitnessLogUtils.i("Research_CommandPb", "setResearchUserProfile , userProfile:" + userProfile + " , callback:" + callback);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 70;
        tu9 tu9Var = new tu9();
        tu9Var.e = userProfile.getBirth();
        tu9Var.c = userProfile.getHeight();
        tu9Var.d = userProfile.getWeight();
        tu9Var.f = userProfile.getSex();
        ur9 ur9Var = new ur9();
        ur9Var.S0(tu9Var);
        s7rVar.S(ur9Var);
        call(did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.setResearchUserProfile.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "setResearchUserProfile , onSuccess , did:" + did2 + " , code:" + code);
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "setResearchUserProfile , onSuccess , did:" + did2);
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onSuccess(did2);
                }
            }
        });
    }

    public final void setSleepResearchEvaluateReminder(@Nullable String did, @Nullable SleepEvaluateReminder sleepEvaluateReminder, @Nullable final hpk callback) {
        FitnessLogUtils.i("Research_CommandPb", "setSleepResearchEvaluateReminder , did:" + did + " , sleepEvaluateReminder:" + sleepEvaluateReminder);
        if (sleepEvaluateReminder == null) {
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 99;
        pt9 pt9Var = new pt9();
        pt9Var.c = sleepEvaluateReminder.getResearchId();
        ArrayList arrayList = new ArrayList();
        if (sleepEvaluateReminder.getRemindTimes().size() >= 1) {
            t64 t64Var = new t64();
            t64Var.c = sleepEvaluateReminder.getRemindTimes().get(0).getHour();
            t64Var.d = sleepEvaluateReminder.getRemindTimes().get(0).getMinuter();
            t64Var.e = sleepEvaluateReminder.getRemindTimes().get(0).getSecond();
            t64Var.f = sleepEvaluateReminder.getRemindTimes().get(0).getMillisecond();
            arrayList.add(t64Var);
        }
        if (sleepEvaluateReminder.getRemindTimes().size() >= 2) {
            t64 t64Var2 = new t64();
            t64Var2.c = sleepEvaluateReminder.getRemindTimes().get(1).getHour();
            t64Var2.d = sleepEvaluateReminder.getRemindTimes().get(1).getMinuter();
            t64Var2.e = sleepEvaluateReminder.getRemindTimes().get(1).getSecond();
            t64Var2.f = sleepEvaluateReminder.getRemindTimes().get(1).getMillisecond();
            arrayList.add(t64Var2);
        }
        FitnessLogUtils.i("Research_CommandPb", "setSleepResearchEvaluateReminder , timeList:" + CollectionsKt___CollectionsKt.toList(arrayList));
        pt9Var.d = (t64[]) arrayList.toArray(new t64[0]);
        ur9 ur9Var = new ur9();
        ur9Var.H0(pt9Var);
        s7rVar.S(ur9Var);
        call(did, s7rVar, true, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.setSleepResearchEvaluateReminder.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "setSleepResearchEvaluateReminder , onError");
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "setSleepResearchEvaluateReminder , onSuccess");
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onSuccess(did2);
                }
            }
        });
    }

    public final void syncAppResearchList(@Nullable String did, @Nullable List<ResearchApp> list, @Nullable final hpk callback) {
        FitnessLogUtils.i("Research_CommandPb", "syncAppResearchList , did:" + did + " , list.size:" + (list != null ? Integer.valueOf(list.size()) : null) + ", callback:" + callback);
        if (list == null || list.size() == 0) {
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 77;
        ht9[] ht9VarArr = new ht9[list.size()];
        int i = 0;
        for (ResearchApp researchApp : list) {
            FitnessLogUtils.d("Research_CommandPb", "i:" + i + " , v:" + researchApp);
            ht9 ht9Var = new ht9();
            ht9Var.c = researchApp.getResearchId();
            ht9Var.d = researchApp.getType();
            ht9Var.e = researchApp.getEnable();
            ht9Var.f = researchApp.getTimestamp();
            Unit unit = Unit.INSTANCE;
            ht9VarArr[i] = ht9Var;
            i++;
        }
        ht9.a aVar = new ht9.a();
        aVar.c = ht9VarArr;
        ur9 ur9Var = new ur9();
        ur9Var.C0(aVar);
        s7rVar.S(ur9Var);
        call(did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.syncAppResearchList.2
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "syncAppResearchList , onError , did:" + did2 + " , code:" + code);
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "syncAppResearchList , onSuccess , did:" + did2);
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onSuccess(did2);
                }
            }
        });
    }

    public final void syncDeviceResearchList(@Nullable String did, @Nullable final qso callback) {
        FitnessLogUtils.i("Research_CommandPb", "syncDeviceResearchList , did:" + did + ",  callback:" + callback);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 78;
        call(did, s7rVar, true, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.syncDeviceResearchList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                IBinder iBinderAsBinder;
                qso qsoVar;
                FitnessLogUtils.i("Research_CommandPb", "syncDeviceResearchList ,onError ,  did:" + did2 + ", code:" + code);
                qso qsoVar2 = callback;
                if (qsoVar2 == null || (iBinderAsBinder = qsoVar2.asBinder()) == null || !iBinderAsBinder.isBinderAlive() || (qsoVar = callback) == null) {
                    return;
                }
                qsoVar.onFailure(did2, code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                IBinder iBinderAsBinder;
                qso qsoVar;
                ot9[] ot9VarArr;
                s7r packet;
                ur9 ur9VarU;
                ot9.a aVarL = (result == null || (packet = result.getPacket()) == null || (ur9VarU = packet.u()) == null) ? null : ur9VarU.L();
                ArrayList arrayList = new ArrayList();
                if (aVarL != null && (ot9VarArr = aVarL.c) != null) {
                    for (ot9 ot9Var : ot9VarArr) {
                        arrayList.add(new ResearchDevice(ot9Var.c, ot9Var.d));
                    }
                }
                FitnessLogUtils.i("Research_CommandPb", "syncDeviceResearchList ,onSuccess ,  did:" + did2 + ",  mList.size:" + arrayList.size());
                qso qsoVar2 = callback;
                if (qsoVar2 == null || (iBinderAsBinder = qsoVar2.asBinder()) == null || !iBinderAsBinder.isBinderAlive() || (qsoVar = callback) == null) {
                    return;
                }
                qsoVar.Z2(did2, arrayList);
            }
        });
    }

    public final void updateAppResearch(@Nullable String did, @NotNull ResearchApp researchApp, @Nullable final hpk callback) {
        Intrinsics.checkNotNullParameter(researchApp, "researchApp");
        FitnessLogUtils.i("Research_CommandPb", "updateAppResearch , did:" + did + ", researchApp:" + researchApp);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 76;
        ht9 ht9Var = new ht9();
        ht9Var.c = researchApp.getResearchId();
        ht9Var.d = researchApp.getType();
        ht9Var.e = researchApp.getEnable();
        ht9Var.f = researchApp.getTimestamp();
        ur9 ur9Var = new ur9();
        ur9Var.B0(ht9Var);
        s7rVar.S(ur9Var);
        call(did, s7rVar, false, new OnSyncCallback() { // from class: com.mi.command.remote.ResearchCommandPb.updateAppResearch.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "updateAppResearch ,onError ,  did:" + did2 + " , code:" + code);
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onFailure(did2, code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) throws RemoteException {
                FitnessLogUtils.i("Research_CommandPb", "updateAppResearch ,onSuccess ,  did:" + did2);
                hpk hpkVar = callback;
                if (hpkVar != null) {
                    hpkVar.onSuccess(did2);
                }
            }
        });
    }
}
