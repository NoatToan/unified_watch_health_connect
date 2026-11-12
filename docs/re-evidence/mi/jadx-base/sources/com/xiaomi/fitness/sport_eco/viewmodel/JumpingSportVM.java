package com.xiaomi.fitness.sport_eco.viewmodel;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.bean.SportingData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport_eco.viewmodel.JumpingSportVM;
import com.xiaomi.fitness.sport_eco_manager_export.data.IntervalSportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.e1j;
import defpackage.oe4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0014\u0010I\u001a\u00020C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020C0GJ\u0014\u0010J\u001a\u00020C2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020C0GJ\u001a\u0010K\u001a\u00020C2\u0006\u0010L\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\b\u0010O\u001a\u00020CH\u0016J\b\u0010P\u001a\u00020CH\u0016J\b\u0010Q\u001a\u00020CH\u0016J\b\u0010R\u001a\u00020CH\u0016J\b\u0010S\u001a\u00020CH\u0016J\u0014\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0UH\u0002J\u0010\u0010_\u001a\u00020C2\u0006\u0010`\u001a\u00020\u001dH\u0002J\u0012\u0010a\u001a\u00020C2\b\u0010b\u001a\u0004\u0018\u00010WH\u0002J \u0010c\u001a\u00020C2\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u0019H\u0016J\b\u0010g\u001a\u00020CH\u0014J\u001a\u0010h\u001a\u00020C2\b\u0010i\u001a\u0004\u0018\u00010?2\u0006\u0010j\u001a\u00020?H\u0016J\u001a\u0010k\u001a\u00020C2\b\u0010i\u001a\u0004\u0018\u00010?2\u0006\u0010j\u001a\u00020?H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u0019X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u00020\u00198FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u00020\u00198FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010#RN\u0010+\u001a\u0016\u0012\u0004\u0012\u00020)\u0018\u00010*j\n\u0012\u0004\u0012\u00020)\u0018\u0001`(2\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u00020)\u0018\u00010*j\n\u0012\u0004\u0012\u00020)\u0018\u0001`(@FX\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00101\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u00104R\u001b\u00108\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\b\u0012\u0004\u0012\u00020C0GX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020C0GX\u0082.¢\u0006\u0002\n\u0000R\u0019\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0\f¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\rR\u001e\u0010Y\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006l"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/viewmodel/JumpingSportVM;", "Lcom/xiaomi/fitness/sport_eco/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportSyncDataListener;", "<init>", "()V", "isFirstInit", "", "()Z", "setFirstInit", "(Z)V", "isCountDownEnd", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "setCountDownEnd", "(Landroidx/lifecycle/MutableLiveData;)V", "isShowAnimation", "setShowAnimation", "isGymStarted", "setGymStarted", "isGymShutdown", "setGymShutdown", "isGymStartedBool", "setGymStartedBool", "TIME_OUT_CODE", "", "getTIME_OUT_CODE", "()I", "gymReportTimeOut", "", "getGymReportTimeOut", "()J", "distance", "getDistance", "setDistance", "(I)V", "jumpCount", "getJumpCount", "setJumpCount", "value", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/IntervalSportTarget;", "Ljava/util/ArrayList;", "intervalSportTargetArr", "getIntervalSportTargetArr", "()Ljava/util/ArrayList;", "setIntervalSportTargetArr", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", SportConstants.KEY_TIMESTAMP, "getTimeStamp", "setTimeStamp", "(J)V", "timeZone", "getTimeZone", "setTimeZone", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "TAG", "", "getTAG", "()Ljava/lang/String;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "Lkotlin/Function0;", "hideLoading", "setShowLoading", "setHideLoading", "onSportFinished", "validSport", "ids", "", "onSportPaused", "onSportRested", "onSportShutdown", "onSportRestarted", "startSport", "getStartTimeAndZone", "Lkotlin/Pair;", "recordEmitter", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getRecordEmitter", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "getSportRecord", "startSec", "recordEmitterResponse", "theSportReport", "onSync", "result", "isAppLaunch", "deviceStartTime", "onCleared", "onDisconnect", "did", "mac", "onConnectSuccess", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JumpingSportVM extends BaseSportVM<CommonSportModel> implements ISportSyncDataListener {
    public FitnessDataGetter dataGetter;
    private int distance;
    private Function0<Unit> hideLoading;

    @Nullable
    private ArrayList<IntervalSportTarget> intervalSportTargetArr;
    private boolean isGymStartedBool;
    private int jumpCount;
    private Function0<Unit> showLoading;
    private long timeStamp;
    private long timeZone;
    private boolean isFirstInit = true;

    @Nullable
    private MutableLiveData<Boolean> isCountDownEnd = new MutableLiveData<>();
    private boolean isShowAnimation = true;

    @NotNull
    private MutableLiveData<Boolean> isGymStarted = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> isGymShutdown = new MutableLiveData<>();
    private final int TIME_OUT_CODE = 2;
    private final long gymReportTimeOut = 90000;

    /* JADX INFO: renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vvd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JumpingSportVM.handler_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<SportBasicReport> recordEmitter = new MutableLiveData<>();

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    private final void getSportRecord(long startSec) {
        String did;
        String did2;
        String str;
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        if (key_gym_local_sport_type != null && key_gym_local_sport_type.length() != 0) {
            setLocalSportType(key_gym_local_sport_type);
        }
        String tag = getTAG();
        EcoDeviceManager.Companion companion = EcoDeviceManager.INSTANCE;
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(getLocalSportType());
        String str2 = "";
        if (localDeviceModel == null || (did = localDeviceModel.getDid()) == null) {
            did = "";
        }
        FitnessLogUtils.i(tag, "getSportRecord: start = " + startSec + " , did : " + did);
        String localSportType = getLocalSportType();
        int i = 14;
        switch (localSportType.hashCode()) {
            case -1798122615:
                if (localSportType.equals("yesoul.exbike.jsc01y")) {
                    i = 7;
                }
                break;
            case -1454035281:
                if (localSportType.equals("runmi.exbike.jscrm1")) {
                    i = 7;
                }
                break;
            case 405899618:
                str = "yunmai.jmprope.sr803";
                localSportType.equals(str);
                break;
            case 405899619:
                str = "yunmai.jmprope.sr804";
                localSportType.equals(str);
                break;
            case 405899620:
                str = com.xiaomi.fitness.sport_eco_manager_export.SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED;
                localSportType.equals(str);
                break;
            case 1396900280:
                if (localSportType.equals("ksmb.treadmill.m1v1")) {
                    i = 3;
                }
                break;
        }
        FitnessDataGetter dataGetter = getDataGetter();
        EcoDeviceModel localDeviceModel2 = EcoDeviceManagerExtKt.getInstance(companion).getLocalDeviceModel(getLocalSportType());
        if (localDeviceModel2 != null && (did2 = localDeviceModel2.getDid()) != null) {
            str2 = did2;
        }
        SportBasicReport theSportReport = dataGetter.getTheSportReport(str2, i, startSec);
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
    public static final void onSportFinished$lambda$1(JumpingSportVM this$0) {
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

    @Nullable
    public final ArrayList<IntervalSportTarget> getIntervalSportTargetArr() {
        return this.intervalSportTargetArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getJumpCount() {
        return ((CommonSportModel) getMModel()).getJumpCount();
    }

    @NotNull
    public final MutableLiveData<SportBasicReport> getRecordEmitter() {
        return this.recordEmitter;
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "JumpingSportVM";
    }

    public final int getTIME_OUT_CODE() {
        return this.TIME_OUT_CODE;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final long getTimeZone() {
        return this.timeZone;
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
    public final MutableLiveData<Boolean> isGymShutdown() {
        return this.isGymShutdown;
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

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Map<CommonSportModel.SportTitle, String> map;
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(getTAG(), "onConnectSuccess");
        oe4 oe4Var = new oe4(did, true);
        MutableLiveData<oe4> connectState = getConnectState();
        if (connectState != null) {
            connectState.postValue(oe4Var);
        }
        SportingData sportData = getSportData();
        if (sportData != null && (map = sportData.getMap()) != null) {
            map.put(CommonSportModel.SportTitle.connectDevice, CommonSportModelUtil.INSTANCE.getJumpDeviceConnectInfo());
        }
        MutableLiveData<SportingData> mData = getMData();
        if (mData != null) {
            mData.postValue(getSportData());
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Map<CommonSportModel.SportTitle, String> map;
        EcoDeviceInfo deviceInfo;
        Intrinsics.checkNotNullParameter(mac, "mac");
        FitnessLogUtils.i(getTAG(), "onDisconnect");
        oe4 oe4Var = new oe4(did, false);
        MutableLiveData<oe4> connectState = getConnectState();
        if (connectState != null) {
            connectState.postValue(oe4Var);
        }
        SportingData sportData = getSportData();
        if (sportData != null && (map = sportData.getMap()) != null) {
            CommonSportModel.SportTitle sportTitle = CommonSportModel.SportTitle.connectDevice;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = AppUtil.getApp().getResources().getString(e1j.L);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Object[] objArr = new Object[1];
            EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(getLocalSportType());
            objArr[0] = (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo.getName();
            String str = String.format(string, Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            map.put(sportTitle, str);
        }
        MutableLiveData<SportingData> mData = getMData();
        if (mData != null) {
            mData.postValue(getSportData());
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
        FitnessLogUtils.i(getTAG(), "onSportFinished()");
        super.onSportFinished(validSport, ids);
        if (getDeviceType() == 1) {
            Function0<Unit> function0 = this.showLoading;
            if (function0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("showLoading");
                function0 = null;
            }
            function0.invoke();
            getHandler().postDelayed(new Runnable() { // from class: wvd
                @Override // java.lang.Runnable
                public final void run() {
                    JumpingSportVM.onSportFinished$lambda$1(this.f38401a);
                }
            }, this.gymReportTimeOut);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        FitnessLogUtils.i(getTAG(), "onSportPaused()");
        super.onSportPaused();
        ((CommonSportModel) getMModel()).onSportPaused();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        FitnessLogUtils.i(getTAG(), "onSportRestarted()");
        super.onSportRestarted();
        ((CommonSportModel) getMModel()).onSportRestarted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        FitnessLogUtils.i(getTAG(), "onSportRested()");
        super.onSportRested();
        ((CommonSportModel) getMModel()).onSportRested();
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
        FitnessLogUtils.i(getTAG(), "onSportShutdown()");
        super.onSportShutdown();
        this.isGymShutdown.postValue(Boolean.TRUE);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportSyncDataListener
    public void onSync(boolean result, boolean isAppLaunch, int deviceStartTime) {
        long startTime;
        FitnessLogUtils.i(getTAG(), "onSync result : " + result + " , startTime : " + getStartTime());
        if (!result) {
            finishTrack(null, false);
            this.recordEmitter.postValue(null);
            return;
        }
        FitnessLogUtils.i(getTAG(), "onSync isLocalLaunch : " + getIsLocalLaunch() + " , isAppLaunch : " + isAppLaunch + " , deviceStartTime : " + deviceStartTime);
        if (getIsLocalLaunch()) {
            startTime = deviceStartTime;
            if (startTime == 0) {
                startTime = getStartTime();
            }
        } else {
            startTime = getStartTime();
        }
        getSportRecord(startTime);
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

    public final void setGymShutdown(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isGymShutdown = mutableLiveData;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIntervalSportTargetArr(@Nullable ArrayList<IntervalSportTarget> arrayList) {
        this.intervalSportTargetArr = arrayList;
        ((CommonSportModel) getMModel()).setJumpIntervalTargetArr(arrayList);
    }

    public final void setJumpCount(int i) {
        this.jumpCount = i;
    }

    public final void setShowAnimation(boolean z) {
        this.isShowAnimation = z;
    }

    public final void setShowLoading(@NotNull Function0<Unit> showLoading) {
        Intrinsics.checkNotNullParameter(showLoading, "showLoading");
        this.showLoading = showLoading;
    }

    public final void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public final void setTimeZone(long j) {
        this.timeZone = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM
    public void startSport() {
        SportTarget sportTarget;
        String did;
        EcoDeviceInfo deviceInfo;
        FitnessLogUtils.i(getTAG(), "startSport()");
        if (getDeviceType() == 1) {
            if (getIsLocalLaunch()) {
                long j = this.timeStamp;
                if (j != 0) {
                    setStartTime(j);
                    FitnessLogUtils.i(getTAG(), "isLocalLaunch startTime: " + getStartTime());
                    SportRequestData.a aVar = new SportRequestData.a();
                    long j2 = this.timeStamp;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    SportRequestData sportRequestDataJ = aVar.u(j2, timeUnit).w(this.timeZone, timeUnit).s(getSportType()).p(1).j();
                    IEcoSportRemoteState sportStateCaller = getSportStateCaller();
                    Intrinsics.checkNotNull(sportRequestDataJ);
                    sportStateCaller.updateSportStateData(sportRequestDataJ);
                }
                ((CommonSportModel) getMModel()).onSportStart();
                return;
            }
            Pair<Long, Long> startTimeAndZone = getStartTimeAndZone();
            long jLongValue = startTimeAndZone.component1().longValue();
            long jLongValue2 = startTimeAndZone.component2().longValue();
            if (getSportGoalType() != -1) {
                sportTarget = new SportTarget();
                int sportGoalType = getSportGoalType();
                if (sportGoalType == 1) {
                    sportTarget.setType(1);
                    sportTarget.setValue((int) (getSportGoalValue() * 60));
                } else if (sportGoalType == 2) {
                    sportTarget.setType(2);
                    sportTarget.setValue((int) getSportGoalValue());
                } else if (sportGoalType == 6) {
                    sportTarget.setType(6);
                    sportTarget.setValue((int) getSportGoalValue());
                }
            } else {
                sportTarget = null;
            }
            String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
            if (key_gym_local_sport_type != null && key_gym_local_sport_type.length() != 0) {
                setLocalSportType(key_gym_local_sport_type);
            }
            EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(getLocalSportType());
            if (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null || (did = deviceInfo.getDid()) == null) {
                did = "";
            }
            setDid(did);
            setCurDeviceDid(getDid());
            SportRequestData.a aVar2 = new SportRequestData.a();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            SportRequestData sportRequestDataJ2 = aVar2.u(jLongValue, timeUnit2).w(jLongValue2, timeUnit2).s(getSportType()).r(getTrainingMode()).m(this.intervalSportTargetArr).q(sportTarget).p(1).j();
            IEcoSportRemoteState sportStateCaller2 = getSportStateCaller();
            String did2 = getDid();
            Intrinsics.checkNotNull(sportRequestDataJ2);
            sportStateCaller2.startSport(did2, sportRequestDataJ2, new RequestCallback() { // from class: com.xiaomi.fitness.sport_eco.viewmodel.JumpingSportVM.startSport.1
                @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.RequestCallback
                public void call(int responseCode) {
                    FitnessLogUtils.i(JumpingSportVM.this.getTAG(), "local start sport code : " + responseCode);
                    if (responseCode == JumpingSportVM.this.getTIME_OUT_CODE()) {
                        ToastUtil.showShortToast(e1j.b0);
                    }
                    JumpingSportVM.this.isGymStarted().postValue(Boolean.valueOf(responseCode == 0));
                }
            });
            ((CommonSportModel) getMModel()).onSportStart();
        }
    }
}
