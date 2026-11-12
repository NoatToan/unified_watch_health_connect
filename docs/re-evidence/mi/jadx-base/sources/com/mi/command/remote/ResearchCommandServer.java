package com.mi.command.remote;

import android.os.RemoteException;
import com.mi.command.data.BPSetting;
import com.mi.command.data.CalibrationRequest;
import com.mi.command.data.HBPMCalibrationRequest;
import com.mi.command.data.ResearchApp;
import com.mi.command.data.SleepEvaluateReminder;
import com.mi.command.data.UserProfile;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import defpackage.eu6;
import defpackage.gpk;
import defpackage.gqc;
import defpackage.hpk;
import defpackage.m61;
import defpackage.n7c;
import defpackage.orm;
import defpackage.qpk;
import defpackage.qso;
import defpackage.ru6;
import defpackage.scb;
import defpackage.vuo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\t\b\u0007¢\u0006\u0004\bG\u0010HJ-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0010\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0013\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0016\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J-\u0010(\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010'2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J-\u0010/\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b/\u00100J#\u00102\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b7\u00106J\u0019\u00109\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J#\u0010<\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000eH\u0016¢\u0006\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/mi/command/remote/ResearchCommandServer;", "Lgqc$a;", "", "did", "Lcom/mi/command/data/UserProfile;", "userProfile", "Lhpk;", "callback", "", "setResearchUserProfile", "(Ljava/lang/String;Lcom/mi/command/data/UserProfile;Lhpk;)V", "", "Lcom/mi/command/data/ResearchApp;", "list", "", "researchId", "syncAppResearchList", "(Ljava/lang/String;Ljava/util/List;ILhpk;)V", "Lqso;", "syncDeviceResearchList", "(Ljava/lang/String;ILqso;)V", "researchApp", "updateAppResearch", "(Ljava/lang/String;Lcom/mi/command/data/ResearchApp;Lhpk;)V", "Lcom/mi/command/data/CalibrationRequest;", "request", "Lgpk;", "requestResearchCalibration", "(Ljava/lang/String;Lcom/mi/command/data/CalibrationRequest;Lgpk;)V", "Lqpk;", "requestResearchCalibration2", "(Ljava/lang/String;Lcom/mi/command/data/CalibrationRequest;Lqpk;)V", "Lcom/mi/command/data/SleepEvaluateReminder;", "sleepEvaluateReminder", "setSleepResearchEvaluateReminder", "(Ljava/lang/String;Lcom/mi/command/data/SleepEvaluateReminder;Lhpk;)V", "Lorm;", "getSleepReesearchEvaluateResult", "(Ljava/lang/String;Lorm;)V", "Lcom/mi/command/data/HBPMCalibrationRequest;", "requestHBPMCalibration", "(Ljava/lang/String;Lcom/mi/command/data/HBPMCalibrationRequest;Lqpk;)V", "Lscb;", "getHBPMCalibrationStatus", "(Ljava/lang/String;Lscb;)V", "Lcom/mi/command/data/BPSetting;", "bpSetting", "setBPResearch", "(Ljava/lang/String;Lcom/mi/command/data/BPSetting;Lhpk;)V", "Ln7c;", "requestDeviceHighAccuracySleepSwitch", "(Ljava/lang/String;Ln7c;)V", "Lvuo;", "requestSyncWebStatus", "(Lvuo;)V", "setSyncWebStatus", "Lru6;", "getCurrentDeviceVersionInfo", "(Lru6;)V", "Lm61;", "requestAllDaySpo2witch", "(Ljava/lang/String;Lm61;)V", "getVersion", "()I", "Lcom/mi/command/remote/ResearchCommandPb;", "researchCommandPb", "Lcom/mi/command/remote/ResearchCommandPb;", "getResearchCommandPb", "()Lcom/mi/command/remote/ResearchCommandPb;", "setResearchCommandPb", "(Lcom/mi/command/remote/ResearchCommandPb;)V", "<init>", "()V", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ResearchCommandServer extends gqc.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "Research_Command_Server";

    @Nullable
    private static gpk researchCalibrationCallback;

    @Nullable
    private static qpk researchReportCalibrationCallback;
    public ResearchCommandPb researchCommandPb;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/mi/command/remote/ResearchCommandServer$Companion;", "", "Lgpk;", "researchCalibrationCallback", "Lgpk;", "getResearchCalibrationCallback", "()Lgpk;", "setResearchCalibrationCallback", "(Lgpk;)V", "Lqpk;", "researchReportCalibrationCallback", "Lqpk;", "getResearchReportCalibrationCallback", "()Lqpk;", "setResearchReportCalibrationCallback", "(Lqpk;)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final gpk getResearchCalibrationCallback() {
            return ResearchCommandServer.researchCalibrationCallback;
        }

        @Nullable
        public final qpk getResearchReportCalibrationCallback() {
            return ResearchCommandServer.researchReportCalibrationCallback;
        }

        public final void setResearchCalibrationCallback(@Nullable gpk gpkVar) {
            ResearchCommandServer.researchCalibrationCallback = gpkVar;
        }

        public final void setResearchReportCalibrationCallback(@Nullable qpk qpkVar) {
            ResearchCommandServer.researchReportCalibrationCallback = qpkVar;
        }
    }

    public ResearchCommandServer() {
        FitnessLogUtils.i("Research_Command_Server", "init()");
    }

    @Override // defpackage.gqc
    public void getCurrentDeviceVersionInfo(@Nullable final ru6 callback) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.mi.command.remote.ResearchCommandServer.getCurrentDeviceVersionInfo.1
            @Override // defpackage.eu6
            public void onError(int errorCode) throws RemoteException {
                ru6 ru6Var = callback;
                if (ru6Var != null) {
                    ru6Var.onFailure(String.valueOf(errorCode));
                }
            }

            @Override // defpackage.eu6
            public void onResult(WatchInfo result) throws RemoteException {
                ru6 ru6Var;
                if ((result != null ? result.getFirmwareVersion() : null) == null || (ru6Var = callback) == null) {
                    return;
                }
                ru6Var.onSuccess(result.getFirmwareVersion());
            }
        });
    }

    @Override // defpackage.gqc
    public void getHBPMCalibrationStatus(@Nullable String did, @Nullable scb callback) {
        getResearchCommandPb().getHBPMCalibrationStatus(did, callback);
    }

    @NotNull
    public final ResearchCommandPb getResearchCommandPb() {
        ResearchCommandPb researchCommandPb = this.researchCommandPb;
        if (researchCommandPb != null) {
            return researchCommandPb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("researchCommandPb");
        return null;
    }

    @Override // defpackage.gqc
    public void getSleepReesearchEvaluateResult(@Nullable String did, @Nullable orm callback) {
        try {
            getResearchCommandPb().getSleepReesearchEvaluateResult(did, callback);
        } catch (Exception e) {
            FitnessLogUtils.e("Research_Command_Server", "e:" + e);
        }
    }

    @Override // defpackage.gqc
    public int getVersion() {
        return 0;
    }

    @Override // defpackage.gqc
    public void requestAllDaySpo2witch(@Nullable String did, @Nullable m61 callback) {
        FitnessLogUtils.i("Research_Command_Server", "requestDeviceHighAccuracySleepSwitch , did" + did);
        getResearchCommandPb().requestDeviceAllDaySpo2Switch(did, callback);
    }

    @Override // defpackage.gqc
    public void requestDeviceHighAccuracySleepSwitch(@Nullable String did, @Nullable n7c callback) {
        FitnessLogUtils.i("Research_Command_Server", "requestDeviceHighAccuracySleepSwitch , did" + did);
        getResearchCommandPb().requestDeviceHighAccuracySleepSwitch(did, callback);
    }

    @Override // defpackage.gqc
    public void requestHBPMCalibration(@Nullable String did, @Nullable HBPMCalibrationRequest request, @Nullable qpk callback) {
        if (request == null) {
            FitnessLogUtils.e("Research_Command_Server", "requestHBPMCalibration , request param is null");
        } else {
            researchReportCalibrationCallback = callback;
            getResearchCommandPb().requestHBPMCalibration(did, request, callback);
        }
    }

    @Override // defpackage.gqc
    public void requestResearchCalibration(@Nullable String did, @Nullable CalibrationRequest request, @Nullable gpk callback) {
        if (request == null) {
            FitnessLogUtils.e("Research_Command_Server", "requestResearchCalibration , request param is null");
        } else {
            researchCalibrationCallback = callback;
            getResearchCommandPb().requestResearchCalibration(did, request, callback);
        }
    }

    @Override // defpackage.gqc
    public void requestResearchCalibration2(@Nullable String did, @Nullable CalibrationRequest request, @Nullable qpk callback) {
        if (request == null) {
            FitnessLogUtils.e("Research_Command_Server", "requestResearchCalibration2 , request param is null");
        } else {
            researchReportCalibrationCallback = callback;
            getResearchCommandPb().requestResearchCalibration2(did, request, callback);
        }
    }

    @Override // defpackage.gqc
    public void requestSyncWebStatus(@Nullable vuo callback) throws RemoteException {
        FitnessLogUtils.i("Research_Command_Server", "requestSyncWebStatus");
        if (callback != null) {
            callback.onSuccess(RegionPreference.INSTANCE.getSyncWeb());
        }
    }

    @Override // defpackage.gqc
    public void setBPResearch(@Nullable String did, @Nullable BPSetting bpSetting, @Nullable hpk callback) {
        if (bpSetting == null) {
            FitnessLogUtils.e("Research_Command_Server", "setBPResearch , btSetting param is null");
        } else {
            getResearchCommandPb().setBPResearch(did, bpSetting, callback);
        }
    }

    public final void setResearchCommandPb(@NotNull ResearchCommandPb researchCommandPb) {
        Intrinsics.checkNotNullParameter(researchCommandPb, "<set-?>");
        this.researchCommandPb = researchCommandPb;
    }

    @Override // defpackage.gqc
    public void setResearchUserProfile(@Nullable String did, @Nullable UserProfile userProfile, @Nullable hpk callback) {
        if (userProfile == null) {
            FitnessLogUtils.i("Research_CommandPb", "setResearchUserProfile , userProfile == null");
        } else {
            getResearchCommandPb().setResearchUserProfile(did, userProfile, callback);
        }
    }

    @Override // defpackage.gqc
    public void setSleepResearchEvaluateReminder(@Nullable String did, @Nullable SleepEvaluateReminder sleepEvaluateReminder, @Nullable hpk callback) {
        FitnessLogUtils.i("Research_Command_Server", "setSleepResearchEvaluateReminder , sleepEvaluateReminder:" + sleepEvaluateReminder);
        getResearchCommandPb().setSleepResearchEvaluateReminder(did, sleepEvaluateReminder, callback);
    }

    @Override // defpackage.gqc
    public void setSyncWebStatus(@Nullable vuo callback) throws RemoteException {
        FitnessLogUtils.i("Research_Command_Server", "requestSyncWebStatus");
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        regionPreference.setSyncWeb(true);
        if (callback != null) {
            callback.onSuccess(regionPreference.getSyncWeb());
        }
    }

    @Override // defpackage.gqc
    public void syncAppResearchList(@Nullable String did, @NotNull List<ResearchApp> list, int researchId, @Nullable hpk callback) {
        Intrinsics.checkNotNullParameter(list, "list");
        getResearchCommandPb().syncAppResearchList(did, list, callback);
    }

    @Override // defpackage.gqc
    public void syncDeviceResearchList(@Nullable String did, int researchId, @Nullable qso callback) {
        FitnessLogUtils.i("Research_Command_Server", "syncDeviceResearchList , did: , researchId:");
        getResearchCommandPb().syncDeviceResearchList(did, callback);
    }

    @Override // defpackage.gqc
    public void updateAppResearch(@Nullable String did, @Nullable ResearchApp researchApp, @Nullable hpk callback) {
        if (researchApp == null) {
            FitnessLogUtils.e("Research_Command_Server", "updateAppResearch , researchApp Param is null");
        } else {
            getResearchCommandPb().updateAppResearch(did, researchApp, callback);
        }
    }
}
