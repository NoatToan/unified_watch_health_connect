package com.xiaomi.fitness.sport_eco.viewmodel;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.viewmodel.IndoorRunningSportVM;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import defpackage.e1j;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0014\u00103\u001a\u00020-2\f\u00100\u001a\b\u0012\u0004\u0012\u00020-01J\u0014\u00104\u001a\u00020-2\f\u00102\u001a\b\u0012\u0004\u0012\u00020-01J\u001a\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020-H\u0016J\u0014\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0;H\u0002J\u0010\u0010E\u001a\u00020-2\u0006\u0010F\u001a\u00020\u001bH\u0002J\u0012\u0010G\u001a\u00020-2\b\u0010H\u001a\u0004\u0018\u00010=H\u0002J \u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0017H\u0016J\u0006\u0010M\u001a\u00020-J\b\u0010N\u001a\u00020-H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\u0017X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u00020\u00178FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020-01X\u0082.¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020-01X\u0082.¢\u0006\u0002\n\u0000R\u0019\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\rR\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/viewmodel/IndoorRunningSportVM;", "Lcom/xiaomi/fitness/sport_eco/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "<init>", "()V", "isFirstInit", "", "()Z", "setFirstInit", "(Z)V", "isCountDownEnd", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "setCountDownEnd", "(Landroidx/lifecycle/MutableLiveData;)V", "isShowAnimation", "setShowAnimation", "isGymStarted", "setGymStarted", "isGymStartedBool", "setGymStartedBool", "TIME_OUT_CODE", "", "getTIME_OUT_CODE", "()I", "gymReportTimeOut", "", "getGymReportTimeOut", "()J", "distance", "getDistance", "setDistance", "(I)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "TAG", "", "getTAG", "()Ljava/lang/String;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "Lkotlin/Function0;", "hideLoading", "setShowLoading", "setHideLoading", "onSportFinished", "validSport", "ids", "", "startSport", "getStartTimeAndZone", "Lkotlin/Pair;", "recordEmitter", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getRecordEmitter", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "getSportRecord", "startSec", "recordEmitterResponse", "theSportReport", "onSync", "result", "isAppLaunch", "deviceStartTime", "gymNoMoveMent", "onCleared", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndoorRunningSportVM extends BaseSportVM<CommonSportModel> implements ISportSyncDataListener {
    public FitnessDataGetter dataGetter;
    private int distance;
    private Function0<Unit> hideLoading;
    private boolean isGymStartedBool;
    private Function0<Unit> showLoading;
    private boolean isFirstInit = true;

    @Nullable
    private MutableLiveData<Boolean> isCountDownEnd = new MutableLiveData<>();
    private boolean isShowAnimation = true;

    @NotNull
    private MutableLiveData<Boolean> isGymStarted = new MutableLiveData<>();
    private final int TIME_OUT_CODE = 2;
    private final long gymReportTimeOut = 10000;

    /* JADX INFO: renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s9d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IndoorRunningSportVM.handler_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<SportBasicReport> recordEmitter = new MutableLiveData<>();

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    private final void getSportRecord(long startSec) {
        String did;
        String did2;
        String tag = getTAG();
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(getLocalSportType());
        String str = "";
        if (localDeviceModel == null || (did = localDeviceModel.getDid()) == null) {
            did = "";
        }
        FitnessLogUtils.i(tag, "getSportRecord: start = " + startSec + " , did : " + did);
        String localSportType = getLocalSportType();
        int iHashCode = localSportType.hashCode();
        int i = 3;
        if (iHashCode != -1798122615) {
            if (iHashCode != -1454035281) {
                if (iHashCode == 1396900280) {
                    localSportType.equals("ksmb.treadmill.m1v1");
                }
            } else if (localSportType.equals("runmi.exbike.jscrm1")) {
                i = 7;
            }
        } else if (localSportType.equals("yesoul.exbike.jsc01y")) {
            i = 7;
        }
        FitnessDataGetter dataGetter = getDataGetter();
        EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(getLocalSportType());
        if (localDeviceModel2 != null && (did2 = localDeviceModel2.getDid()) != null) {
            str = did2;
        }
        SportBasicReport theSportReport = dataGetter.getTheSportReport(str, i, startSec);
        if (theSportReport == null) {
            finishTrack(null, false);
        } else {
            SportData.a aVar = new SportData.a();
            Integer calories = theSportReport.getCalories();
            finishTrack(aVar.R(calories != null ? (short) calories.intValue() : (short) 0).V(theSportReport.getDistance()).t0(theSportReport.getDuration()).M(), false);
        }
        FitnessLogUtils.i(getTAG(), "getSportRecord: " + theSportReport);
        recordEmitterResponse(theSportReport);
    }

    private final Pair<Long, Long> getStartTimeAndZone() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long tZOffsetInMilli = FitnessDateUtils.getTZOffsetInMilli(jCurrentTimeMillis);
        setStartTime(TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis));
        FitnessLogUtils.i(getTAG(), "getStartTimeAndZone: " + getStartTime());
        return new Pair<>(Long.valueOf(jCurrentTimeMillis), Long.valueOf(tZOffsetInMilli));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSportFinished$lambda$1(IndoorRunningSportVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.recordEmitterResponse(null);
    }

    private final void recordEmitterResponse(SportBasicReport theSportReport) {
        FitnessLogUtils.i(getTAG(), "GYM response:" + theSportReport);
        this.recordEmitter.postValue(theSportReport);
        Function0<Unit> function0 = this.hideLoading;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("hideLoading");
            function0 = null;
        }
        function0.invoke();
        getHandler().removeCallbacksAndMessages(null);
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        getSportStateCaller().setSportSyncDataListener(this);
    }

    @NotNull
    public final FitnessDataGetter getDataGetter() {
        FitnessDataGetter fitnessDataGetter = this.dataGetter;
        if (fitnessDataGetter != null) {
            return fitnessDataGetter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataGetter");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getDistance() {
        return ((CommonSportModel) getMModel()).getDistance();
    }

    public final long getGymReportTimeOut() {
        return this.gymReportTimeOut;
    }

    @NotNull
    public final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    @NotNull
    public final MutableLiveData<SportBasicReport> getRecordEmitter() {
        return this.recordEmitter;
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "IndoorSportVM";
    }

    public final int getTIME_OUT_CODE() {
        return this.TIME_OUT_CODE;
    }

    public final void gymNoMoveMent() {
        getSportStateCaller().finishSport(getDeviceDid(), getSportType(), new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.viewmodel.IndoorRunningSportVM.gymNoMoveMent.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                String did;
                FitnessLogUtils.i(IndoorRunningSportVM.this.getTAG(), "gymNoMoveMent , responseCode:" + responseCode);
                if (responseCode != 0) {
                    EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
                    EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(companion);
                    EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(IndoorRunningSportVM.this.getLocalSportType());
                    if (localDeviceModel == null || (did = localDeviceModel.getDid()) == null) {
                        did = "";
                    }
                    ecoDeviceManagerExtKt.disconnectDevice(did);
                }
            }
        });
    }

    @Nullable
    public final MutableLiveData<Boolean> isCountDownEnd() {
        return this.isCountDownEnd;
    }

    /* JADX INFO: renamed from: isFirstInit, reason: from getter */
    public final boolean getIsFirstInit() {
        return this.isFirstInit;
    }

    @NotNull
    public final MutableLiveData<Boolean> isGymStarted() {
        return this.isGymStarted;
    }

    /* JADX INFO: renamed from: isGymStartedBool, reason: from getter */
    public final boolean getIsGymStartedBool() {
        return this.isGymStartedBool;
    }

    /* JADX INFO: renamed from: isShowAnimation, reason: from getter */
    public final boolean getIsShowAnimation() {
        return this.isShowAnimation;
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, defpackage.dvq
    public void onCleared() {
        super.onCleared();
        getSportStateCaller().setSportSyncDataListener(null);
        FitnessLogUtils.i(getTAG(), "onCleared");
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
        super.onSportFinished(validSport, ids);
        if (getDeviceType() == 1) {
            Function0<Unit> function0 = this.showLoading;
            if (function0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("showLoading");
                function0 = null;
            }
            function0.invoke();
            getHandler().postDelayed(new Runnable() { // from class: r9d
                @Override // java.lang.Runnable
                public final void run() {
                    IndoorRunningSportVM.onSportFinished$lambda$1(this.f32331a);
                }
            }, this.gymReportTimeOut);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener
    public void onSync(boolean result, boolean isAppLaunch, int deviceStartTime) {
        FitnessLogUtils.i(getTAG(), "onSync result : " + result + " , startTime : " + getStartTime());
        if (result) {
            getSportRecord(isAppLaunch ? getStartTime() : deviceStartTime);
        } else {
            finishTrack(null, false);
            this.recordEmitter.postValue(null);
        }
    }

    public final void setCountDownEnd(@Nullable MutableLiveData<Boolean> mutableLiveData) {
        this.isCountDownEnd = mutableLiveData;
    }

    public final void setDataGetter(@NotNull FitnessDataGetter fitnessDataGetter) {
        Intrinsics.checkNotNullParameter(fitnessDataGetter, "<set-?>");
        this.dataGetter = fitnessDataGetter;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setFirstInit(boolean z) {
        this.isFirstInit = z;
    }

    public final void setGymStarted(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isGymStarted = mutableLiveData;
    }

    public final void setGymStartedBool(boolean z) {
        this.isGymStartedBool = z;
    }

    public final void setHideLoading(@NotNull Function0<Unit> hideLoading) {
        Intrinsics.checkNotNullParameter(hideLoading, "hideLoading");
        this.hideLoading = hideLoading;
    }

    public final void setShowAnimation(boolean z) {
        this.isShowAnimation = z;
    }

    public final void setShowLoading(@NotNull Function0<Unit> showLoading) {
        Intrinsics.checkNotNullParameter(showLoading, "showLoading");
        this.showLoading = showLoading;
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM
    public void startSport() {
        SportTarget sportTarget;
        String did;
        EcoDeviceInfo deviceInfo;
        Pair<Long, Long> startTimeAndZone = getStartTimeAndZone();
        long jLongValue = startTimeAndZone.component1().longValue();
        long jLongValue2 = startTimeAndZone.component2().longValue();
        if (getDeviceType() == 0) {
            super.startSport();
            return;
        }
        if (getSportGoalType() != -1) {
            sportTarget = new SportTarget();
            int sportGoalType = getSportGoalType();
            if (sportGoalType == 0) {
                sportTarget.setType(3);
                sportTarget.setValue((int) (getSportGoalValue() * 1000));
            } else if (sportGoalType == 1) {
                sportTarget.setType(1);
                sportTarget.setValue((int) (getSportGoalValue() * 60));
            } else if (sportGoalType == 2) {
                sportTarget.setType(2);
                sportTarget.setValue((int) getSportGoalValue());
            }
        } else {
            sportTarget = null;
        }
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(getLocalSportType());
        if (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null || (did = deviceInfo.getDid()) == null) {
            did = "";
        }
        setDid(did);
        setCurDeviceDid(getDid());
        SportRequestData.a aVar = new SportRequestData.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SportRequestData sportRequestDataJ = aVar.u(jLongValue, timeUnit).w(jLongValue2, timeUnit).s(getSportType()).q(sportTarget).p(1).j();
        IEcoSportRemoteState sportStateCaller = getSportStateCaller();
        String did2 = getDid();
        Intrinsics.checkNotNull(sportRequestDataJ);
        sportStateCaller.startSport(did2, sportRequestDataJ, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.viewmodel.IndoorRunningSportVM.startSport.1
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(IndoorRunningSportVM.this.getTAG(), "local start sport code : " + responseCode);
                if (responseCode == IndoorRunningSportVM.this.getTIME_OUT_CODE()) {
                    ToastUtil.showShortToast(e1j.b0);
                }
                IndoorRunningSportVM.this.isGymStarted().postValue(Boolean.valueOf(responseCode == 0));
                IndoorRunningSportVM.this.startTrack();
            }
        });
    }
}
