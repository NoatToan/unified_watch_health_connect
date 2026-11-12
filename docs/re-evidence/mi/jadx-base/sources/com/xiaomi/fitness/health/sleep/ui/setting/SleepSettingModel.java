package com.xiaomi.fitness.health.sleep.ui.setting;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingModel;
import com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepSettingRepository;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u00015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u000bH\u0002J\b\u00104\u001a\u00020\u0013H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u0012¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u001f\u0010$\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0011\u0010&\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010(\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010*\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001d0-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0-¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "settingRepo", "Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "getSettingRepo", "()Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepSettingRepository;", "settingRepo$delegate", "Lkotlin/Lazy;", "value", "", "sleepGoalTime", "getSleepGoalTime", "()I", "setSleepGoalTime", "(I)V", "sleepGoalTimeText", "Landroidx/lifecycle/MutableLiveData;", "", "getSleepGoalTimeText", "()Landroidx/lifecycle/MutableLiveData;", "deviceSupport", "Landroidx/databinding/ObservableBoolean;", "getDeviceSupport", "()Landroidx/databinding/ObservableBoolean;", "deviceSleepAssistSwitch", "getDeviceSleepAssistSwitch", "sleepBreathDetectionSupport", "", "kotlin.jvm.PlatformType", "getSleepBreathDetectionSupport", "sleepBreathRateSupport", "getSleepBreathRateSupport", "sleepBreathDetectionSwitch", "getSleepBreathDetectionSwitch", "sleepBreathRateSwitch", "getSleepBreathRateSwitch", "romSupport", "getRomSupport", "scheduleSupport", "getScheduleSupport", "sleepTraceEnabled", "getSleepTraceEnabled", "deepSleepDetection", "Landroidx/lifecycle/LiveData;", "getDeepSleepDetection", "()Landroidx/lifecycle/LiveData;", "snoreDetection", "getSnoreDetection", "getSleepGoalText", "time", "toString", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepSettingModel extends BaseModel {
    public static final int DEFAULT_GOAL = 480;

    @NotNull
    private final LiveData<Boolean> deepSleepDetection;

    @NotNull
    private final ObservableBoolean romSupport;

    @NotNull
    private final ObservableBoolean scheduleSupport;

    @NotNull
    private final MutableLiveData<Boolean> sleepBreathDetectionSupport;

    @NotNull
    private final MutableLiveData<Boolean> sleepBreathDetectionSwitch;

    @NotNull
    private final MutableLiveData<Boolean> sleepBreathRateSupport;

    @NotNull
    private final MutableLiveData<Boolean> sleepBreathRateSwitch;

    @NotNull
    private final ObservableBoolean sleepTraceEnabled;

    @NotNull
    private final LiveData<Integer> snoreDetection;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final int[] SLEEP_GOAL_HOUR_INTERVAL = CollectionsKt___CollectionsKt.toIntArray(CollectionsKt___CollectionsKt.toList(new IntRange(4, 12)));

    @NotNull
    private static final int[] SLEEP_GOAL_MINUTE_INTERVAL = CollectionsKt___CollectionsKt.toIntArray(CollectionsKt___CollectionsKt.toList(RangesKt___RangesKt.step(new IntRange(0, 50), 10)));

    /* JADX INFO: renamed from: settingRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wxm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepSettingModel.settingRepo_delegate$lambda$0();
        }
    });
    private int sleepGoalTime = 480;

    @NotNull
    private final MutableLiveData<String> sleepGoalTimeText = new MutableLiveData<>(getSleepGoalText(this.sleepGoalTime));

    @NotNull
    private final ObservableBoolean deviceSupport = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean deviceSleepAssistSwitch = new ObservableBoolean(false);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingModel$Companion;", "", "<init>", "()V", "DEFAULT_GOAL", "", "SLEEP_GOAL_HOUR_INTERVAL", "", "getSLEEP_GOAL_HOUR_INTERVAL", "()[I", "SLEEP_GOAL_MINUTE_INTERVAL", "getSLEEP_GOAL_MINUTE_INTERVAL", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final int[] getSLEEP_GOAL_HOUR_INTERVAL() {
            return SleepSettingModel.SLEEP_GOAL_HOUR_INTERVAL;
        }

        @NotNull
        public final int[] getSLEEP_GOAL_MINUTE_INTERVAL() {
            return SleepSettingModel.SLEEP_GOAL_MINUTE_INTERVAL;
        }
    }

    public SleepSettingModel() {
        Boolean bool = Boolean.FALSE;
        this.sleepBreathDetectionSupport = new MutableLiveData<>(bool);
        this.sleepBreathRateSupport = new MutableLiveData<>(bool);
        this.sleepBreathDetectionSwitch = new MutableLiveData<>(bool);
        this.sleepBreathRateSwitch = new MutableLiveData<>(bool);
        this.romSupport = new ObservableBoolean(false);
        this.scheduleSupport = new ObservableBoolean(false);
        this.sleepTraceEnabled = new ObservableBoolean(true);
        this.deepSleepDetection = getSettingRepo().getDeepLightDetectEnableLiveData();
        this.snoreDetection = getSettingRepo().getSnoreDetectSwitchStateLiveData();
    }

    private final SleepSettingRepository getSettingRepo() {
        return (SleepSettingRepository) this.settingRepo.getValue();
    }

    private final String getSleepGoalText(int time) {
        return TimeDateUtil.getHMFormatInMinutes(ApplicationExtKt.getApplication(), time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepSettingRepository settingRepo_delegate$lambda$0() {
        return new SleepSettingRepository();
    }

    @NotNull
    public final LiveData<Boolean> getDeepSleepDetection() {
        return this.deepSleepDetection;
    }

    @NotNull
    public final ObservableBoolean getDeviceSleepAssistSwitch() {
        return this.deviceSleepAssistSwitch;
    }

    @NotNull
    public final ObservableBoolean getDeviceSupport() {
        return this.deviceSupport;
    }

    @NotNull
    public final ObservableBoolean getRomSupport() {
        return this.romSupport;
    }

    @NotNull
    public final ObservableBoolean getScheduleSupport() {
        return this.scheduleSupport;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepBreathDetectionSupport() {
        return this.sleepBreathDetectionSupport;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepBreathDetectionSwitch() {
        return this.sleepBreathDetectionSwitch;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepBreathRateSupport() {
        return this.sleepBreathRateSupport;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSleepBreathRateSwitch() {
        return this.sleepBreathRateSwitch;
    }

    public final int getSleepGoalTime() {
        return this.sleepGoalTime;
    }

    @NotNull
    public final MutableLiveData<String> getSleepGoalTimeText() {
        return this.sleepGoalTimeText;
    }

    @NotNull
    public final ObservableBoolean getSleepTraceEnabled() {
        return this.sleepTraceEnabled;
    }

    @NotNull
    public final LiveData<Integer> getSnoreDetection() {
        return this.snoreDetection;
    }

    public final void setSleepGoalTime(int i) {
        this.sleepGoalTime = i;
        this.sleepGoalTimeText.postValue(getSleepGoalText(i));
        SleepTrackHelper.INSTANCE.trackSleepGoalValue(i);
    }

    @NotNull
    public String toString() {
        return "SleepSettingModel(sleepGoalTime=" + this.sleepGoalTime + ", sleepGoalTimeText=" + this.sleepGoalTimeText + ", deviceSupport=" + this.deviceSupport.get() + ", deviceSleepAssistSwitch=" + this.deviceSleepAssistSwitch.get() + ", roomSupport=" + this.romSupport.get() + ", scheduleSupport=" + this.scheduleSupport.get() + ", sleepTraceEnabled=" + this.sleepTraceEnabled.get() + ", deepSleepDetection=" + this.deepSleepDetection.getValue() + ", snoreDetection=" + this.snoreDetection.getValue() + ")";
    }
}
