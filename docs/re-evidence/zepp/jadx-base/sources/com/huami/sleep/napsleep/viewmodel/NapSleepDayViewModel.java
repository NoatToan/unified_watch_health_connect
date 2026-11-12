package com.huami.sleep.napsleep.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.sleep.daysleep.daydetail.vo.SleepShowData;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepStageDurationInfo;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.napsleep.repo.NapSleepRepo;
import com.huami.sleep.napsleep.vo.NapSleepRecordItem;
import com.huami.sleep.util.PercentageCalculateUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.loc.z;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\bT\u0010UJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020)0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020,0 8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002000 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\"R\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060 8\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010$R%\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0 8\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b\u000b\u0010$R\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020;0 8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$R%\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?0 8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010\"\u001a\u0004\bB\u0010$R!\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010D0 8\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010\"\u001a\u0004\bF\u0010$R\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u001eR!\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0 8\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010\"\u001a\u0004\bL\u0010$R!\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060 8\u0006@\u0006¢\u0006\f\n\u0004\bN\u0010\"\u001a\u0004\bO\u0010$R!\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060 8\u0006@\u0006¢\u0006\f\n\u0004\bQ\u0010\"\u001a\u0004\bR\u0010$¨\u0006V"}, d2 = {"Lcom/huami/sleep/napsleep/viewmodel/NapSleepDayViewModel;", "Landroidx/lifecycle/ViewModel;", "", "index", "", "touchDown", "", "date", "setDate", "getDateFormatStr", "", "getSleepDuration", "()[Ljava/lang/String;", "onCleared", "Lcom/huami/sleep/napsleep/repo/NapSleepRepo;", "a", "Lcom/huami/sleep/napsleep/repo/NapSleepRepo;", CommonLanguageSettingFragment.KEY_REPO, "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "c", "[Ljava/lang/String;", "empty", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "dateLiveData", "Landroidx/lifecycle/LiveData;", "e", "Landroidx/lifecycle/LiveData;", "getDateValue", "()Landroidx/lifecycle/LiveData;", "dateValue", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "f", "sleepInfoLiveData", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepShowData;", "g", "sleepShowDataLiveData", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepStageDurationInfo;", "h", "getSleepDurationParam", "sleepDurationParam", "", "i", "durationRationInfo", z.j, "getDeepRation", "deepRation", hl.k, "getLightRation", "lightRation", "l", "sleepDuration", "", "m", "getHasNapData", "hasNapData", "", "Lcom/huami/sleep/napsleep/vo/NapSleepRecordItem;", GoogleApiAvailabilityLight.b, "getSleepRecord", "sleepRecord", "Lcom/huami/chart/data/ChartDataList;", "o", "getSleepChartData", "sleepChartData", b.r, "chartTouchDownIndex", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", DTransferConstants.SEARCH_KEY, "getTouchDownDuration", "touchDownDuration", "r", "getStartDateString", "startDateString", SOAP.XMLNS, "getEndDateString", "endDateString", "<init>", "(Lcom/huami/sleep/napsleep/repo/NapSleepRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class NapSleepDayViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final NapSleepRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private String userId = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String[] empty = {"--", ""};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> dateLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dateValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepInfo> sleepInfoLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepShowData> sleepShowDataLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SleepStageDurationInfo> sleepDurationParam;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<int[]> durationRationInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> deepRation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> lightRation;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String[]> sleepDuration;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> hasNapData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<NapSleepRecordItem>> sleepRecord;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ChartDataList> sleepChartData;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> chartTouchDownIndex;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final LiveData<StageSleep> touchDownDuration;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> startDateString;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> endDateString;

    public NapSleepDayViewModel(@NotNull NapSleepRepo napSleepRepo) {
        this.repo = napSleepRepo;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.dateLiveData = mutableLiveData;
        this.dateValue = Transformations.map(mutableLiveData, new Function<String, String>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final String apply(String str) {
                return SleepTimeUtil.INSTANCE.formatDateTimeForYMD(SportDay.fromString(str).getTimestamp());
            }
        });
        LiveData<SleepInfo> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function<String, LiveData<SleepInfo>>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<SleepInfo> apply(String str) {
                return this.a.repo.getSleepInfoLiveData(this.a.getUserId(), str);
            }
        });
        this.sleepInfoLiveData = liveDataSwitchMap;
        LiveData<SleepShowData> map = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, SleepShowData>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final SleepShowData apply(SleepInfo sleepInfo) {
                return this.a.repo.sleepShowData(sleepInfo);
            }
        });
        this.sleepShowDataLiveData = map;
        LiveData<SleepStageDurationInfo> map2 = Transformations.map(map, new Function<SleepShowData, SleepStageDurationInfo>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final SleepStageDurationInfo apply(SleepShowData sleepShowData) {
                return this.a.repo.sleepDurationParam(sleepShowData);
            }
        });
        this.sleepDurationParam = map2;
        LiveData<int[]> map3 = Transformations.map(map2, new Function<SleepStageDurationInfo, int[]>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$4
            @Override // androidx.arch.core.util.Function
            public final int[] apply(SleepStageDurationInfo sleepStageDurationInfo) {
                SleepStageDurationInfo sleepStageDurationInfo2 = sleepStageDurationInfo;
                PercentageCalculateUtil percentageCalculateUtil = PercentageCalculateUtil.INSTANCE;
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf(sleepStageDurationInfo2.getDeepDuration()));
                arrayList.add(Integer.valueOf(sleepStageDurationInfo2.getLightDuration()));
                arrayList.add(Integer.valueOf(sleepStageDurationInfo2.getRemDuration()));
                Unit unit = Unit.INSTANCE;
                return percentageCalculateUtil.calculatePercentages(arrayList, 100);
            }
        });
        this.durationRationInfo = map3;
        this.deepRation = Transformations.map(map3, new Function<int[], String>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final String apply(int[] iArr) {
                return "  " + iArr[0] + "%";
            }
        });
        this.lightRation = Transformations.map(map3, new Function<int[], String>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$6
            @Override // androidx.arch.core.util.Function
            public final String apply(int[] iArr) {
                return "  " + iArr[1] + "%";
            }
        });
        this.sleepDuration = Transformations.map(map2, new Function<SleepStageDurationInfo, String[]>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$7
            @Override // androidx.arch.core.util.Function
            public final String[] apply(SleepStageDurationInfo sleepStageDurationInfo) {
                SleepStageDurationInfo sleepStageDurationInfo2 = sleepStageDurationInfo;
                return sleepStageDurationInfo2.getDuration() == 0 ? this.a.empty : TimeShowUtilsKt.getDurationStr$default(sleepStageDurationInfo2.getDuration(), KoinExtKt.getAppContext(), false, false, 6, null);
            }
        });
        this.hasNapData = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, Boolean>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$8
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepInfo sleepInfo) {
                SleepInfo sleepInfo2 = sleepInfo;
                ArrayList<StageSleep> oddStageSleep = sleepInfo2 == null ? null : sleepInfo2.getOddStageSleep();
                return Boolean.valueOf(!(oddStageSleep == null || oddStageSleep.isEmpty()));
            }
        });
        LiveData<List<NapSleepRecordItem>> map4 = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, List<? extends NapSleepRecordItem>>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$9
            @Override // androidx.arch.core.util.Function
            public final List<? extends NapSleepRecordItem> apply(SleepInfo sleepInfo) {
                return this.a.repo.sleepRecord(sleepInfo);
            }
        });
        this.sleepRecord = map4;
        this.sleepChartData = Transformations.map(liveDataSwitchMap, new Function<SleepInfo, ChartDataList>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$10
            @Override // androidx.arch.core.util.Function
            public final ChartDataList apply(SleepInfo sleepInfo) {
                return this.a.repo.daySleepChartDataList(sleepInfo);
            }
        });
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.chartTouchDownIndex = mutableLiveData2;
        this.touchDownDuration = Transformations.map(mutableLiveData2, new Function<Integer, StageSleep>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$11
            @Override // androidx.arch.core.util.Function
            public final StageSleep apply(Integer num) {
                ArrayList<StageSleep> oddStageSleep;
                int iIntValue = num.intValue();
                SleepInfo sleepInfo = (SleepInfo) this.a.sleepInfoLiveData.getValue();
                if (sleepInfo == null || (oddStageSleep = sleepInfo.getOddStageSleep()) == null) {
                    return null;
                }
                return (StageSleep) CollectionsKt.getOrNull(oddStageSleep, iIntValue);
            }
        });
        this.startDateString = Transformations.map(map4, new Function<List<? extends NapSleepRecordItem>, String>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$12
            @Override // androidx.arch.core.util.Function
            public final String apply(List<? extends NapSleepRecordItem> list) {
                NapSleepRecordItem napSleepRecordItem = (NapSleepRecordItem) CollectionsKt.firstOrNull((List) list);
                if (napSleepRecordItem == null) {
                    return null;
                }
                return napSleepRecordItem.getStartDateStr();
            }
        });
        this.endDateString = Transformations.map(map4, new Function<List<? extends NapSleepRecordItem>, String>() { // from class: com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel$special$$inlined$map$13
            @Override // androidx.arch.core.util.Function
            public final String apply(List<? extends NapSleepRecordItem> list) {
                NapSleepRecordItem napSleepRecordItem = (NapSleepRecordItem) CollectionsKt.lastOrNull((List) list);
                if (napSleepRecordItem == null) {
                    return null;
                }
                return napSleepRecordItem.getEndDateStr();
            }
        });
    }

    @Nullable
    public final String getDateFormatStr() {
        return this.dateValue.getValue();
    }

    @NotNull
    public final LiveData<String> getDateValue() {
        return this.dateValue;
    }

    @NotNull
    public final LiveData<String> getDeepRation() {
        return this.deepRation;
    }

    @NotNull
    public final LiveData<String> getEndDateString() {
        return this.endDateString;
    }

    @NotNull
    public final LiveData<Boolean> getHasNapData() {
        return this.hasNapData;
    }

    @NotNull
    public final LiveData<String> getLightRation() {
        return this.lightRation;
    }

    @NotNull
    public final LiveData<ChartDataList> getSleepChartData() {
        return this.sleepChartData;
    }

    @NotNull
    public final LiveData<String[]> getSleepDuration() {
        return this.sleepDuration;
    }

    @NotNull
    public final LiveData<SleepStageDurationInfo> getSleepDurationParam() {
        return this.sleepDurationParam;
    }

    @NotNull
    public final LiveData<List<NapSleepRecordItem>> getSleepRecord() {
        return this.sleepRecord;
    }

    @NotNull
    public final LiveData<String> getStartDateString() {
        return this.startDateString;
    }

    @NotNull
    public final LiveData<StageSleep> getTouchDownDuration() {
        return this.touchDownDuration;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }

    public final void setDate(@NotNull String date) {
        this.dateLiveData.setValue(date);
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void touchDown(int index) {
        this.chartTouchDownIndex.setValue(Integer.valueOf(index));
    }

    @NotNull
    /* JADX INFO: renamed from: getSleepDuration, reason: collision with other method in class */
    public final String[] m3389getSleepDuration() {
        String[] value = this.sleepDuration.getValue();
        return value == null ? this.empty : value;
    }
}
