package com.xiaomi.fitness.sport_eco.model;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.bean.SportingData;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.interfaces.ISportDataListener;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport_eco_manager_export.data.IntervalSportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.bg4;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.y7r;
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
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001hB\t\b\u0007¢\u0006\u0004\bg\u0010\nJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u001d\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\nJ\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\nJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"R(\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b;\u0010\"\"\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\"\u0010I\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER$\u0010L\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010\bR$\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010O\"\u0004\bS\u0010\bR$\u0010T\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00106\u001a\u0004\bU\u00108\"\u0004\bV\u0010:R6\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020X\u0018\u00010Wj\n\u0012\u0004\u0012\u00020X\u0018\u0001`Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel;", "Lcom/xiaomi/fitness/sport_eco/model/SportModel;", "Lcom/xiaomi/fitness/sport_eco/bean/SportingData;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "", "handleDuration", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)V", "disposeJump", "()V", "buildDataToUI", "buildJumpDataToUI", "Lcom/xiaomi/fitness/sport_eco/interfaces/ISportDataListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, LoginPreferenceConfig.TYPE_REGISTER, "(Lcom/xiaomi/fitness/sport_eco/interfaces/ISportDataListener;)V", LifecycleConstantKt.ON_DESTROY, "Ly7r;", "wearSportData", "onReceiveWearData", "(Ly7r;)V", "onPhoneDataChanged", "onSportStart", "onSportPaused", "onSportRested", "onSportRestarted", "", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "isValidSport", "()Z", "", "Lcom/xiaomi/fitness/sport_eco/bean/SportingItemData;", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "", "Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel$SportTitle;", "", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "Ljz6;", "disposable", "Ljz6;", "getDisposable", "()Ljz6;", "setDisposable", "(Ljz6;)V", "isSportPause", "Z", "setSportPause", "(Z)V", "", "jumpCount", "I", "getJumpCount", "()I", "setJumpCount", "(I)V", "distance", "getDistance", "setDistance", "step", "getStep", "setStep", "bikingData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "getBikingData", "()Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "setBikingData", "jumpingData", "getJumpingData", "setJumpingData", "jumpDisposable", "getJumpDisposable", "setJumpDisposable", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/IntervalSportTarget;", "Lkotlin/collections/ArrayList;", "jumpIntervalTargetArr", "Ljava/util/ArrayList;", "getJumpIntervalTargetArr", "()Ljava/util/ArrayList;", "setJumpIntervalTargetArr", "(Ljava/util/ArrayList;)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "sportDataCaller", "Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "getSportDataCaller", "()Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;", "setSportDataCaller", "(Lcom/xiaomi/fitness/sport_eco_manager_export/launch/IEcoSportRemoteData;)V", "<init>", "SportTitle", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class CommonSportModel extends SportModel<SportingData> implements ISportDataChangedListener {

    @Nullable
    private PhoneSportData bikingData;

    @Nullable
    private jz6 disposable;
    private int distance;
    private boolean isSportPause;
    private int jumpCount;

    @Nullable
    private jz6 jumpDisposable;

    @Nullable
    private ArrayList<IntervalSportTarget> jumpIntervalTargetArr;

    @Nullable
    private PhoneSportData jumpingData;

    @NotNull
    private List<SportingItemData> list = new ArrayList();

    @NotNull
    private Map<SportTitle, String> map = new HashMap();

    @NotNull
    private IEcoSportRemoteData sportDataCaller = SportEcoManagerExtKt.getInstance(IEcoSportRemoteData.INSTANCE);
    private int step;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel$SportTitle;", "", "<init>", "(Ljava/lang/String;I)V", "SportType", "connectDevice", "majorData", "progressDetail", "progressPercentage", "progressValue", "unit", "groupData", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum SportTitle {
        SportType,
        connectDevice,
        majorData,
        progressDetail,
        progressPercentage,
        progressValue,
        unit,
        groupData;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<SportTitle> getEntries() {
            return $ENTRIES;
        }
    }

    private final void buildDataToUI(PhoneSportData phoneSportData) {
        int i;
        int i2;
        ISportDataListener<SportingData> iSportDataListener;
        FitnessLogUtils.i("CommonSportModel", "phoneSportData : " + phoneSportData + " , distance:" + this.distance + ",step:" + this.step);
        if (phoneSportData != null && (i = phoneSportData.distance) >= this.distance && (i2 = phoneSportData.step) >= this.step) {
            this.distance = i;
            this.step = i2;
            this.list.clear();
            CommonSportModelUtil.INSTANCE.buildTitle(getDeviceDid(), this.map, phoneSportData, getSportGoalValue(), getSportGoalType(), getSportType(), this.list);
            SportingData sportingData = new SportingData();
            sportingData.setList(this.list);
            sportingData.setMap(this.map);
            WeakReference<ISportDataListener<SportingData>> weak = getWeak();
            if (weak == null || (iSportDataListener = weak.get()) == null) {
                return;
            }
            iSportDataListener.onSuccess(sportingData);
        }
    }

    private final void buildJumpDataToUI(PhoneSportData phoneSportData) {
        ISportDataListener<SportingData> iSportDataListener;
        FitnessLogUtils.i("CommonSportModel", "phoneSportData : " + phoneSportData + " , jumpCount:" + this.jumpCount + " , trainingMode:" + getTrainingMode());
        if (phoneSportData == null) {
            return;
        }
        this.jumpCount = phoneSportData.jumpCount;
        this.list.clear();
        CommonSportModelUtil.INSTANCE.buildJumpTitle(this.map, phoneSportData, getSportGoalValue(), getSportGoalType(), this.jumpIntervalTargetArr, getSportType(), getTrainingMode(), this.list);
        SportingData sportingData = new SportingData();
        sportingData.setList(this.list);
        sportingData.setMap(this.map);
        sportingData.setSportDurtaion(phoneSportData.jumpDuration);
        WeakReference<ISportDataListener<SportingData>> weak = getWeak();
        if (weak == null || (iSportDataListener = weak.get()) == null) {
            return;
        }
        iSportDataListener.onSuccess(sportingData);
    }

    private final void disposeJump() {
        if (getSportType() == 14) {
            jz6 jz6Var = this.jumpDisposable;
            if (jz6Var != null) {
                jz6Var.dispose();
            }
            this.jumpDisposable = null;
        }
    }

    private final void handleDuration(PhoneSportData phoneSportData) {
        if (this.disposable == null) {
            buildDataToUI(phoneSportData);
            o4h<Long> o4hVarY = o4h.y(500L, 1000L, TimeUnit.MILLISECONDS);
            final Function1 function1 = new Function1() { // from class: s74
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CommonSportModel.handleDuration$lambda$0(this.f33364a, (Long) obj);
                }
            };
            this.disposable = o4hVarY.N(new bg4() { // from class: u74
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
        if (!this$0.isSportPause) {
            PhoneSportData phoneSportData = this$0.bikingData;
            if (phoneSportData != null) {
                phoneSportData.duration = (int) SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).getSportDurationInSec();
            }
            this$0.buildDataToUI(this$0.bikingData);
        }
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

    public final int getJumpCount() {
        return this.jumpCount;
    }

    @Nullable
    public final jz6 getJumpDisposable() {
        return this.jumpDisposable;
    }

    @Nullable
    public final ArrayList<IntervalSportTarget> getJumpIntervalTargetArr() {
        return this.jumpIntervalTargetArr;
    }

    @Nullable
    public final PhoneSportData getJumpingData() {
        return this.jumpingData;
    }

    @NotNull
    public final List<SportingItemData> getList() {
        return this.list;
    }

    @NotNull
    public final Map<SportTitle, String> getMap() {
        return this.map;
    }

    @NotNull
    public final IEcoSportRemoteData getSportDataCaller() {
        return this.sportDataCaller;
    }

    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: isSportPause, reason: from getter */
    public final boolean getIsSportPause() {
        return this.isSportPause;
    }

    @Override // com.xiaomi.fitness.sport_eco.model.SportModel
    public boolean isValidSport() {
        return this.distance >= 100;
    }

    @Override // com.xiaomi.fitness.sport_eco.model.SportModel
    public void onDestroy() {
        super.onDestroy();
        Logger.d("CommonSportModel", "CommonSportModel is destroy");
        this.sportDataCaller.removeSportDataChangedListener(this, this);
        onSportFinished(true, null);
        this.jumpCount = 0;
        this.distance = 0;
        this.step = 0;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        this.bikingData = phoneSportData;
        if (getSportType() == 14) {
            this.jumpingData = phoneSportData;
            buildJumpDataToUI(phoneSportData);
        } else if (getSportType() == 3 || getSportType() == 7) {
            buildDataToUI(phoneSportData);
        } else {
            handleDuration(phoneSportData);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable y7r wearSportData) {
    }

    public final void onSportFinished(boolean validSport, @Nullable byte[] ids) {
        jz6 jz6Var = this.disposable;
        if (jz6Var != null) {
            jz6Var.dispose();
        }
        this.disposable = null;
        disposeJump();
        Logger.d("CommonSportModel", "goalType onSportFinished reset");
    }

    public final void onSportPaused() {
        this.isSportPause = true;
    }

    public final void onSportRestarted() {
        this.isSportPause = false;
    }

    public final void onSportRested() {
    }

    public final void onSportStart() {
        ISportDataListener<SportingData> iSportDataListener;
        if (getSportType() == 14 && this.jumpingData == null) {
            PhoneSportData phoneSportData = new PhoneSportData();
            this.list.clear();
            CommonSportModelUtil.INSTANCE.buildJumpTitle(this.map, phoneSportData, getSportGoalValue(), getSportGoalType(), this.jumpIntervalTargetArr, getSportType(), getTrainingMode(), this.list);
            SportingData sportingData = new SportingData();
            sportingData.setList(this.list);
            sportingData.setMap(this.map);
            sportingData.setSportDurtaion(phoneSportData.jumpDuration);
            WeakReference<ISportDataListener<SportingData>> weak = getWeak();
            if (weak == null || (iSportDataListener = weak.get()) == null) {
                return;
            }
            iSportDataListener.onSuccess(sportingData);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco.model.SportModel
    public void register(@NotNull ISportDataListener<SportingData> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.register(listener);
        Logger.d("CommonSportModel", "CommonSportModel is register");
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

    public final void setJumpCount(int i) {
        this.jumpCount = i;
    }

    public final void setJumpDisposable(@Nullable jz6 jz6Var) {
        this.jumpDisposable = jz6Var;
    }

    public final void setJumpIntervalTargetArr(@Nullable ArrayList<IntervalSportTarget> arrayList) {
        this.jumpIntervalTargetArr = arrayList;
    }

    public final void setJumpingData(@Nullable PhoneSportData phoneSportData) {
        this.jumpingData = phoneSportData;
    }

    public final void setList(@NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.list = list;
    }

    public final void setMap(@NotNull Map<SportTitle, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
    }

    public final void setSportDataCaller(@NotNull IEcoSportRemoteData iEcoSportRemoteData) {
        Intrinsics.checkNotNullParameter(iEcoSportRemoteData, "<set-?>");
        this.sportDataCaller = iEcoSportRemoteData;
    }

    public final void setSportPause(boolean z) {
        this.isSportPause = z;
    }

    public final void setStep(int i) {
        this.step = i;
    }
}
