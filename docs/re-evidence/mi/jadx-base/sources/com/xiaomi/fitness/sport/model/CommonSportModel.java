package com.xiaomi.fitness.sport.model;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.interfaces.ISportDataListener;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.bg4;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.x7r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001dB\t\b\u0007¢\u0006\u0004\bc\u0010\u000fJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u000fJ\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u000fJ)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0017¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\u0017¢\u0006\u0004\b&\u0010$J\u0015\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R(\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R.\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\"R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bG\u0010$\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010N\"\u0004\bS\u0010PR\"\u0010T\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010L\u001a\u0004\bU\u0010N\"\u0004\bV\u0010PR$\u0010W\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\bR\"\u0010]\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/sport/model/CommonSportModel;", "Lcom/xiaomi/fitness/sport/model/SportModel;", "Lcom/xiaomi/fitness/sport/bean/SportingData;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportDataChangedListener;", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "", "handleDuration", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)V", "buildDataToUI", "Lcom/xiaomi/fitness/sport/interfaces/ISportDataListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, LoginPreferenceConfig.TYPE_REGISTER, "(Lcom/xiaomi/fitness/sport/interfaces/ISportDataListener;)V", LifecycleConstantKt.ON_DESTROY, "()V", "Lx7r;", "wearSportData", "onReceiveWearData", "(Lx7r;)V", "onPhoneDataChanged", "onSportPaused", "onSportRestarted", "", "validSport", "", "ids", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "finishSportData", "onSportFinished", "(Z[BLcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "location", "onLocationChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;)V", "isValidSport", "()Z", "isValidAbilityTrainingPlan", "isValidHabitTrainingPlan", "", StepsInfo.KEY_DISTANCE, "isValidHabitCreateTrainingPlan", "(I)Z", "", "Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "", "Lcom/xiaomi/fitness/sport/model/CommonSportModel$SportTitle;", "", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "getLocation", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "setLocation", "Ljz6;", "disposable", "Ljz6;", "getDisposable", "()Ljz6;", "setDisposable", "(Ljz6;)V", "isSportPause", "Z", "setSportPause", "(Z)V", "distance", "I", "getDistance", "()I", "setDistance", "(I)V", "duration", "getDuration", "setDuration", "step", "getStep", "setStep", "bikingData", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "getBikingData", "()Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "setBikingData", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "sportDataCaller", "Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "getSportDataCaller", "()Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;", "setSportDataCaller", "(Lcom/xiaomi/fitness/sport_manager_export/launch/ISportRemoteData;)V", "<init>", "SportTitle", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class CommonSportModel extends SportModel<SportingData> implements ISportDataChangedListener {

    @Nullable
    private PhoneSportData bikingData;

    @Nullable
    private jz6 disposable;
    private int distance;
    private int duration;
    private boolean isSportPause;

    @Nullable
    private SportLocationResult location;
    private int step;

    @NotNull
    private List<SportingItemData> list = new ArrayList();

    @NotNull
    private Map<SportTitle, String> map = new HashMap();

    @NotNull
    private ISportRemoteData sportDataCaller = SportManagerExtKt.getInstance(ISportRemoteData.INSTANCE);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/model/CommonSportModel$SportTitle;", "", "<init>", "(Ljava/lang/String;I)V", "SportType", "connectDevice", "majorData", "progressDetail", "progressPercentage", "progressValue", "unit", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum SportTitle {
        SportType,
        connectDevice,
        majorData,
        progressDetail,
        progressPercentage,
        progressValue,
        unit;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<SportTitle> getEntries() {
            return $ENTRIES;
        }
    }

    private final void buildDataToUI(PhoneSportData phoneSportData) {
        ISportDataListener<SportingData> iSportDataListener;
        FitnessLogUtils.i("CommonSportModel", "phoneSportData : " + phoneSportData + " , distance:" + this.distance + ",step:" + this.step);
        if (phoneSportData == null) {
            return;
        }
        this.distance = phoneSportData.distance;
        this.duration = phoneSportData.duration;
        this.step = phoneSportData.step;
        this.list.clear();
        CommonSportModelUtil.INSTANCE.buildTitle(getDeviceDid(), this.map, phoneSportData, getSportGoalValue(), getSportGoalType(), getSportType(), this.list, getSportWearMode());
        SportingData sportingData = new SportingData();
        sportingData.setList(this.list);
        sportingData.setMap(this.map);
        SportLocationResult sportLocationResult = this.location;
        if (sportLocationResult != null) {
            sportingData.getLocationResult().clear();
            sportLocationResult.accuracyStatus = phoneSportData.gpsAccuracyStatus;
            sportingData.getLocationResult().add(sportLocationResult);
        }
        sportingData.setPhoneSportData(phoneSportData);
        sportingData.setDistance(phoneSportData.distance);
        sportingData.setDuration(phoneSportData.duration);
        sportingData.setCalorie(phoneSportData.calorie);
        sportingData.setAvePace(phoneSportData.avePace);
        WeakReference<ISportDataListener<SportingData>> weak = getWeak();
        if (weak != null && (iSportDataListener = weak.get()) != null) {
            iSportDataListener.onSuccess(sportingData);
        }
        SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).setBPM(phoneSportData.stride_frequency);
    }

    private final void handleDuration(PhoneSportData phoneSportData) {
        if (this.disposable == null) {
            buildDataToUI(phoneSportData);
            o4h<Long> o4hVarY = o4h.y(500L, 1000L, TimeUnit.MILLISECONDS);
            final Function1 function1 = new Function1() { // from class: t74
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommonSportModel.handleDuration$lambda$0(this.f34402a, (Long) obj);
                }
            };
            this.disposable = o4hVarY.N(new bg4() { // from class: v74
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    CommonSportModel.handleDuration$lambda$1(function1, obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDuration$lambda$0(CommonSportModel this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PhoneSportData phoneSportData = this$0.bikingData;
        if (phoneSportData != null) {
            phoneSportData.duration = (int) SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getSportDurationInSec();
        }
        this$0.buildDataToUI(this$0.bikingData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleDuration$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Nullable
    public final PhoneSportData getBikingData() {
        return this.bikingData;
    }

    @Nullable
    public final jz6 getDisposable() {
        return this.disposable;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final List<SportingItemData> getList() {
        return this.list;
    }

    @Nullable
    public final SportLocationResult getLocation() {
        return this.location;
    }

    @NotNull
    public final Map<SportTitle, String> getMap() {
        return this.map;
    }

    @NotNull
    public final ISportRemoteData getSportDataCaller() {
        return this.sportDataCaller;
    }

    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: isSportPause, reason: from getter */
    public final boolean getIsSportPause() {
        return this.isSportPause;
    }

    public final boolean isValidAbilityTrainingPlan() {
        if (getAbilityPlanCourse() != null) {
            int i = this.duration;
            AbilityPlanRunningCourse abilityPlanCourse = getAbilityPlanCourse();
            Intrinsics.checkNotNull(abilityPlanCourse);
            if (i >= ((int) (((double) (abilityPlanCourse.getTotalDuration() * 60)) * 0.9d))) {
                return true;
            }
        }
        return false;
    }

    public final boolean isValidHabitCreateTrainingPlan(int dis) {
        if (getHabitDayPlan() != null) {
            HabitDayPlan habitDayPlan = getHabitDayPlan();
            Intrinsics.checkNotNull(habitDayPlan);
            if (habitDayPlan.isCreateTestRunning()) {
                HabitDayPlan habitDayPlan2 = getHabitDayPlan();
                Intrinsics.checkNotNull(habitDayPlan2);
                if (dis >= ((int) (habitDayPlan2.getDistance() * 1000))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isValidHabitTrainingPlan() {
        if (getHabitDayPlan() != null) {
            int i = this.distance;
            HabitDayPlan habitDayPlan = getHabitDayPlan();
            Intrinsics.checkNotNull(habitDayPlan);
            if (i >= ((int) (habitDayPlan.getDistance() * 1000))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.sport.model.SportModel
    public boolean isValidSport() {
        return this.distance >= 100;
    }

    @Override // com.xiaomi.fitness.sport.model.SportModel
    public void onDestroy() {
        super.onDestroy();
        FitnessLogUtils.i("CommonSportModel", "CommonSportModel is destroy");
        this.sportDataCaller.removeSportDataChangedListener(this, this);
        onSportFinished(true, null, null);
        this.distance = 0;
        this.step = 0;
        this.duration = 0;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(@Nullable SportLocationResult location) {
        this.location = location;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        this.bikingData = phoneSportData;
        if (getSportType() == 3) {
            buildDataToUI(phoneSportData);
        } else {
            handleDuration(phoneSportData);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable x7r wearSportData) {
    }

    public final void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
        jz6 jz6Var = this.disposable;
        if (jz6Var != null) {
            jz6Var.dispose();
        }
        this.disposable = null;
        Logger.d("CommonSportModel", "goalType onSportFinished reset");
    }

    public final void onSportPaused() {
        this.isSportPause = true;
    }

    public final void onSportRestarted() {
        this.isSportPause = false;
    }

    @Override // com.xiaomi.fitness.sport.model.SportModel
    public void register(@NotNull ISportDataListener<SportingData> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.register(listener);
        FitnessLogUtils.i("CommonSportModel", "CommonSportModel is register");
        this.sportDataCaller.addSportDataChangedListener(this, this);
    }

    public final void setBikingData(@Nullable PhoneSportData phoneSportData) {
        this.bikingData = phoneSportData;
    }

    public final void setDisposable(@Nullable jz6 jz6Var) {
        this.disposable = jz6Var;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setList(@NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    public final void setLocation(@Nullable SportLocationResult sportLocationResult) {
        this.location = sportLocationResult;
    }

    public final void setMap(@NotNull Map<SportTitle, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
    }

    public final void setSportDataCaller(@NotNull ISportRemoteData iSportRemoteData) {
        Intrinsics.checkNotNullParameter(iSportRemoteData, "<set-?>");
        this.sportDataCaller = iSportRemoteData;
    }

    public final void setSportPause(boolean z) {
        this.isSportPause = z;
    }

    public final void setStep(int i) {
        this.step = i;
    }
}
