package com.xiaomi.fitness.sport.viewmodel;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.viewmodel.IndoorSportVM;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSyncDataListener;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.sport_manager_export.listener.RequestCallback;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import defpackage.c1j;
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
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0013H\u0016J\u0017\u00106\u001a\u0002042\b\u00107\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u00108J\u0012\u00109\u001a\u0002042\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0014\u0010?\u001a\u0002042\f\u0010<\u001a\b\u0012\u0004\u0012\u0002040=J\u0014\u0010@\u001a\u0002042\f\u0010>\u001a\b\u0012\u0004\u0012\u0002040=J$\u0010A\u001a\u0002042\u0006\u0010B\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010G\u001a\u000204H\u0016J\u0014\u0010H\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0IH\u0002J\u0010\u0010S\u001a\u0002042\u0006\u0010T\u001a\u00020 H\u0002J\u0012\u0010U\u001a\u0002042\b\u0010V\u001a\u0004\u0018\u00010KH\u0002J \u0010W\u001a\u0002042\u0006\u0010X\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u001cH\u0016J\u0006\u0010[\u001a\u000204J\b\u0010\\\u001a\u000204H\u0014J\b\u0010]\u001a\u00020\u0007H\u0014J\b\u0010^\u001a\u00020\u0007H\u0014J\u000e\u0010_\u001a\u0002042\u0006\u0010`\u001a\u00020\u001cJ\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020b0IR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u001cX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR\u001c\u0010%\u001a\u00020\u001c8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010(R\u001b\u0010)\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u0010<\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010>\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0\f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\rR\u001e\u0010M\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006c"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/IndoorSportVM;", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport/model/CommonSportModel;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSyncDataListener;", "<init>", "()V", "isFirstInit", "", "()Z", "setFirstInit", "(Z)V", "isCountDownEnd", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "setCountDownEnd", "(Landroidx/lifecycle/MutableLiveData;)V", "isShowAnimation", "setShowAnimation", "updateMusicInfo", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "getUpdateMusicInfo", "updateMusicState", "getUpdateMusicState", "isGymStarted", "setGymStarted", "isGymStartedBool", "setGymStartedBool", "TIME_OUT_CODE", "", "getTIME_OUT_CODE", "()I", "gymReportTimeOut", "", "getGymReportTimeOut", "()J", "isShowMusic", "setShowMusic", "distance", "getDistance", "setDistance", "(I)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "TAG", "", "getTAG", "()Ljava/lang/String;", "onUpdateSongInfo", "", "data", "onPlayState", "isPlaying", "(Ljava/lang/Boolean;)V", "attach", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "Lkotlin/Function0;", "hideLoading", "setShowLoading", "setHideLoading", "onSportFinished", "validSport", "ids", "", "finishSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "startSport", "getStartTimeAndZone", "Lkotlin/Pair;", "recordEmitter", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getRecordEmitter", "dataGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDataGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "setDataGetter", "(Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;)V", "getSportRecord", "startSec", "recordEmitterResponse", "theSportReport", "onSync", "result", "isAppLaunch", "deviceStartTime", "gymNoMoveMent", "onCleared", "isSupportSportMusic", "isNeedJumpSportDetailPage", "hadAdjustmentDistance", "adjustmentDis", "getAdjustmentDisInterval", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndoorSportVM extends BaseSportVM<CommonSportModel> implements ISportSyncDataListener {
    public FitnessDataGetter dataGetter;
    private int distance;

    @Nullable
    private Function0<Unit> hideLoading;
    private boolean isGymStartedBool;

    @Nullable
    private Function0<Unit> showLoading;
    private boolean isFirstInit = true;

    @Nullable
    private MutableLiveData<Boolean> isCountDownEnd = new MutableLiveData<>();
    private boolean isShowAnimation = true;

    @NotNull
    private final MutableLiveData<MusicData> updateMusicInfo = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> updateMusicState = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> isGymStarted = new MutableLiveData<>();
    private final int TIME_OUT_CODE = 2;
    private final long gymReportTimeOut = 10000;
    private boolean isShowMusic = true;

    /* JADX INFO: renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y9d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IndoorSportVM.handler_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<SportBasicReport> recordEmitter = new MutableLiveData<>();

    private final void getSportRecord(long startSec) {
        String did;
        String did2;
        String tag = getTAG();
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = gymDeviceModel.curGymDeviceModel();
        String str = "";
        if (wearableDeviceModelCurGymDeviceModel == null || (did = wearableDeviceModelCurGymDeviceModel.getDid()) == null) {
            did = "";
        }
        FitnessLogUtils.i(tag, "getSportRecord: start = " + startSec + " , did : " + did);
        FitnessDataGetter dataGetter = getDataGetter();
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel2 = gymDeviceModel.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel2 != null && (did2 = wearableDeviceModelCurGymDeviceModel2.getDid()) != null) {
            str = did2;
        }
        SportBasicReport theSportReport = dataGetter.getTheSportReport(str, 3, startSec);
        if (theSportReport == null) {
            finishTrack(null, false);
        } else {
            SportData.a aVar = new SportData.a();
            Integer calories = theSportReport.getCalories();
            finishTrack(aVar.o1(calories != null ? (short) calories.intValue() : (short) 0).u1(theSportReport.getDistance()).h2(theSportReport.getDuration()).M0(), false);
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
    public static final void onSportFinished$lambda$1(IndoorSportVM this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.recordEmitterResponse(null);
    }

    private final void recordEmitterResponse(SportBasicReport theSportReport) {
        FitnessLogUtils.i(getTAG(), "GYM response:" + theSportReport);
        this.recordEmitter.postValue(theSportReport);
        Function0<Unit> function0 = this.hideLoading;
        if (function0 != null) {
            function0.invoke();
        }
        getHandler().removeCallbacksAndMessages(null);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
        getSportStateCaller().setSportSyncDataListener(this);
    }

    @NotNull
    public final Pair<Float, Float> getAdjustmentDisInterval() {
        float f;
        float f2;
        float distance = getDistance();
        double d = distance;
        if (100.0d <= d && d <= 999.0d) {
            f = 1.5f * distance;
            f2 = distance * 0.5f;
            if (f2 < 100.0f) {
                f2 = 100.0f;
            }
        } else if (1000.0d > d || d > 5000.0d) {
            float f3 = 0.7f * distance;
            float f4 = distance * 1.3f;
            if (f4 > 999999.0f) {
                f2 = f3;
                f = 999999.0f;
            } else {
                f = f4;
                f2 = f3;
            }
        } else {
            f = 1.4f * distance;
            f2 = distance * 0.6f;
        }
        FitnessLogUtils.i(getTAG(), "distance : " + getDistance() + " , lower:" + f2 + " , upper:" + f);
        float f5 = (float) 1000;
        return new Pair<>(Float.valueOf(f2 / f5), Float.valueOf(f / f5));
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

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "IndoorSportVM";
    }

    public final int getTIME_OUT_CODE() {
        return this.TIME_OUT_CODE;
    }

    @NotNull
    public final MutableLiveData<MusicData> getUpdateMusicInfo() {
        return this.updateMusicInfo;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUpdateMusicState() {
        return this.updateMusicState;
    }

    public final void gymNoMoveMent() {
        getSportStateCaller().finishSport(getDeviceDid(), getSportType(), new RequestCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.IndoorSportVM.gymNoMoveMent.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                String did;
                FitnessLogUtils.i(IndoorSportVM.this.getTAG(), "gymNoMoveMent , responseCode:" + responseCode);
                if (responseCode != 0) {
                    WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                    WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
                    if (wearableDeviceModelCurGymDeviceModel == null || (did = wearableDeviceModelCurGymDeviceModel.getDid()) == null) {
                        did = "";
                    }
                    deviceManagerExtKt.disconnectDevice(did);
                }
            }
        });
    }

    public final void hadAdjustmentDistance(int adjustmentDis) {
        getSportStateCaller().hadAdjustmentDistance(adjustmentDis);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    public boolean isNeedJumpSportDetailPage() {
        try {
            if (((CommonSportModel) getMModel()).getHabitDayPlan() == null) {
                return true;
            }
            HabitDayPlan habitDayPlan = ((CommonSportModel) getMModel()).getHabitDayPlan();
            Intrinsics.checkNotNull(habitDayPlan);
            return !habitDayPlan.isCreateTestRunning();
        } catch (Exception e) {
            Logger.e(getTAG(), "isNeedJumpSportDetailPage", e);
            return true;
        }
    }

    /* JADX INFO: renamed from: isShowAnimation, reason: from getter */
    public final boolean getIsShowAnimation() {
        return this.isShowAnimation;
    }

    /* JADX INFO: renamed from: isShowMusic, reason: from getter */
    public final boolean getIsShowMusic() {
        return this.isShowMusic;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    public boolean isSupportSportMusic() {
        return true;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, defpackage.dvq
    public void onCleared() {
        super.onCleared();
        getSportStateCaller().setSportSyncDataListener(null);
        this.showLoading = null;
        this.hideLoading = null;
        FitnessLogUtils.i(getTAG(), "onCleared");
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.IPlayerEventListener
    public void onPlayState(@Nullable Boolean isPlaying) {
        super.onPlayState(isPlaying);
        FitnessLogUtils.d(getTAG(), "onPlayState , isPlaying:" + isPlaying);
        MutableLiveData<Boolean> mutableLiveData = this.updateMusicState;
        Intrinsics.checkNotNull(isPlaying);
        mutableLiveData.postValue(isPlaying);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
        super.onSportFinished(validSport, ids, finishSportData);
        if (getDeviceType() == 1) {
            Function0<Unit> function0 = this.showLoading;
            if (function0 != null) {
                function0.invoke();
            }
            getHandler().postDelayed(new Runnable() { // from class: z9d
                @Override // java.lang.Runnable
                public final void run() {
                    IndoorSportVM.onSportFinished$lambda$1(this.f41045a);
                }
            }, this.gymReportTimeOut);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportSyncDataListener
    public void onSync(boolean result, boolean isAppLaunch, int deviceStartTime) {
        FitnessLogUtils.i(getTAG(), "onSync result : " + result + " , startTime : " + getStartTime());
        if (result) {
            getSportRecord(isAppLaunch ? getStartTime() : deviceStartTime);
        } else {
            finishTrack(null, false);
            this.recordEmitter.postValue(null);
        }
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.IPlayerEventListener
    public void onUpdateSongInfo(@Nullable MusicData data) {
        super.onUpdateSongInfo(data);
        if (SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).isHasSportPlaylist()) {
            MutableLiveData<MusicData> mutableLiveData = this.updateMusicInfo;
            Intrinsics.checkNotNull(data);
            mutableLiveData.setValue(data);
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

    public final void setShowMusic(boolean z) {
        this.isShowMusic = z;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    public void startSport() {
        SportTarget sportTarget;
        String did;
        WearableDeviceInfo deviceInfo;
        Pair<Long, Long> startTimeAndZone = getStartTimeAndZone();
        long jLongValue = startTimeAndZone.component1().longValue();
        long jLongValue2 = startTimeAndZone.component2().longValue();
        if (getDeviceType() == 0) {
            super.startSport();
            return;
        }
        if (getIsLocalLaunch()) {
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
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null || (did = deviceInfo.getDid()) == null) {
            did = "";
        }
        setDid(did);
        setCurDeviceDid(getDid());
        SportRequestData.a aVar = new SportRequestData.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        SportRequestData sportRequestDataO = aVar.B(jLongValue, timeUnit).D(jLongValue2, timeUnit).z(getSportType()).H(getSportWearMode()).y(sportTarget).x(1).o();
        ISportRemoteState sportStateCaller = getSportStateCaller();
        String did2 = getDid();
        Intrinsics.checkNotNull(sportRequestDataO);
        sportStateCaller.startSport(did2, sportRequestDataO, new RequestCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.IndoorSportVM.startSport.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.RequestCallback
            public void call(int responseCode) {
                FitnessLogUtils.i(IndoorSportVM.this.getTAG(), "local start sport code : " + responseCode);
                if (responseCode == IndoorSportVM.this.getTIME_OUT_CODE()) {
                    ToastUtil.showShortToast(c1j.L0);
                }
                IndoorSportVM.this.isGymStarted().postValue(Boolean.valueOf(responseCode == 0));
                IndoorSportVM.this.startTrack();
            }
        });
    }
}
