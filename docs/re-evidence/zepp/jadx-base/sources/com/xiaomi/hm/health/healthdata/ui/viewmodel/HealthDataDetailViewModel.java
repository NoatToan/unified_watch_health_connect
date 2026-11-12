package com.xiaomi.hm.health.healthdata.ui.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.amap.api.mapcore.util.hl;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.ui.view.BloodOxygenStatisticsView;
import com.loc.z;
import com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.repository.BodyCompositionRepo;
import com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder;
import com.xiaomi.hm.health.healthdata.ui.vo.TimeParam;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u000f\u001a\u0004\u0018\u00010\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR!\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u00102R!\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001cR!\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010\u001a\u001a\u0004\b8\u0010\u001cR\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0016R@\u0010>\u001a,\u0012(\u0012&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0<\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0<0<0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\u001aR\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010\u001a\u001a\u0004\b\u000e\u0010\u001cR\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020(0\u00188\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010\u001a\u001a\u0004\bB\u0010\u001cR\u001f\u0010E\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010\u001a\u001a\u0004\b\u000f\u0010\u001cR\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020(0\u00188\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010\u001a\u001a\u0004\bG\u0010\u001c¨\u0006M"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataDetailViewModel;", "Lcom/xiaomi/hm/health/healthdata/core/AbstractHealthDataViewModel;", "", "value", "", "setDataValue", "(Ljava/lang/Float;)V", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", "setHealthDataType", "Lcom/xiaomi/hm/health/healthdata/ui/vo/TimeParam;", "timeParam", "loadBpRange", "", "getSbpRangeString", "getDbpRangeString", "Lcom/xiaomi/hm/health/healthdata/repository/BodyCompositionRepo;", "g", "Lcom/xiaomi/hm/health/healthdata/repository/BodyCompositionRepo;", "bodyCompositionRepo", "Landroidx/lifecycle/MutableLiveData;", "h", "Landroidx/lifecycle/MutableLiveData;", "dataType", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getDataName", "()Landroidx/lifecycle/LiveData;", "dataName", z.j, "getDataIntro", "dataIntro", "", hl.k, "getDataIntroImg", "dataIntroImg", "l", "getDataUnit", "dataUnit", "", "m", "getShowAddData", "showAddData", "Lcom/xiaomi/hm/health/healthdata/ui/view/ColoredProgressBarBuilder;", GoogleApiAvailabilityLight.b, "getBarBuilder", "barBuilder", "o", "getDataValue", "()Landroidx/lifecycle/MutableLiveData;", "dataValue", b.r, "getLevelIntro", "levelIntro", DTransferConstants.SEARCH_KEY, "getBarProgress", "barProgress", "r", "time", "Lkotlin/Pair;", SOAP.XMLNS, "bpRange", "t", "sbpRangeString", "u", "getSbpUnitVisible", "sbpUnitVisible", "v", "dbpRangeString", "w", "getDbpUnitVisible", "dbpUnitVisible", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "healthDataRepo", "<init>", "(Lcom/xiaomi/hm/health/healthdata/repository/BodyCompositionRepo;Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataDetailViewModel extends AbstractHealthDataViewModel {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final BodyCompositionRepo bodyCompositionRepo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HealthDataType> dataType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dataName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dataIntro;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> dataIntroImg;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dataUnit;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> showAddData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ColoredProgressBarBuilder> barBuilder;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Float> dataValue;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> levelIntro;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Float> barProgress;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeParam> time;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Pair<Integer, Integer>, Pair<Integer, Integer>>> bpRange;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> sbpRangeString;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> sbpUnitVisible;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dbpRangeString;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> dbpUnitVisible;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.DAY.ordinal()] = 1;
            iArr[TimeMode.WEEK.ordinal()] = 2;
            iArr[TimeMode.MONTH.ordinal()] = 3;
            iArr[TimeMode.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HealthDataDetailViewModel(@NotNull BodyCompositionRepo bodyCompositionRepo, @NotNull HealthCoreDataRepo healthCoreDataRepo) {
        super(healthCoreDataRepo, null, null, 6, null);
        this.bodyCompositionRepo = bodyCompositionRepo;
        MutableLiveData<HealthDataType> mutableLiveData = new MutableLiveData<>();
        this.dataType = mutableLiveData;
        this.dataName = Transformations.map(mutableLiveData, new Function<HealthDataType, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final String apply(HealthDataType healthDataType) {
                return HealthDataUtils.INSTANCE.getHealthDataName(healthDataType);
            }
        });
        this.dataIntro = Transformations.map(mutableLiveData, new Function<HealthDataType, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final String apply(HealthDataType healthDataType) {
                return HealthDataUtils.INSTANCE.getHealthDataIntro(healthDataType);
            }
        });
        this.dataIntroImg = Transformations.map(mutableLiveData, new Function<HealthDataType, Integer>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final Integer apply(HealthDataType healthDataType) {
                return Integer.valueOf(HealthDataUtils.INSTANCE.getHealthDataIntroImg(healthDataType));
            }
        });
        this.dataUnit = Transformations.map(mutableLiveData, new Function<HealthDataType, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$4
            @Override // androidx.arch.core.util.Function
            public final String apply(HealthDataType healthDataType) {
                return HealthDataUtils.INSTANCE.getHealthDataUnit(healthDataType);
            }
        });
        this.showAddData = Transformations.map(mutableLiveData, new Function<HealthDataType, Boolean>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(HealthDataType healthDataType) {
                return Boolean.valueOf(!HealthDataUtils.INSTANCE.isBodyCompositionType(healthDataType));
            }
        });
        this.barBuilder = Transformations.map(mutableLiveData, new Function<HealthDataType, ColoredProgressBarBuilder>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$6
            @Override // androidx.arch.core.util.Function
            public final ColoredProgressBarBuilder apply(HealthDataType healthDataType) {
                return this.a.bodyCompositionRepo.getColoredProgressBarBuilder(healthDataType);
            }
        });
        MutableLiveData<Float> mutableLiveData2 = new MutableLiveData<>();
        this.dataValue = mutableLiveData2;
        this.levelIntro = Transformations.map(mutableLiveData2, new Function<Float, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.arch.core.util.Function
            public final String apply(Float f) {
                Float f2 = f;
                HealthDataType healthDataType = (HealthDataType) this.a.dataType.getValue();
                if (healthDataType == null) {
                    return null;
                }
                return this.a.bodyCompositionRepo.getBodyCompositionLevelIntro(healthDataType, f2.floatValue());
            }
        });
        this.barProgress = Transformations.map(mutableLiveData2, new Function<Float, Float>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.arch.core.util.Function
            public final Float apply(Float f) {
                Float f2 = f;
                HealthDataType healthDataType = (HealthDataType) this.a.dataType.getValue();
                if (healthDataType == null) {
                    return null;
                }
                return this.a.bodyCompositionRepo.getBodyCompositionBarProgress(healthDataType, f2.floatValue());
            }
        });
        MutableLiveData<TimeParam> mutableLiveData3 = new MutableLiveData<>();
        this.time = mutableLiveData3;
        LiveData<Pair<Pair<Integer, Integer>, Pair<Integer, Integer>>> liveDataSwitchMap = Transformations.switchMap(mutableLiveData3, new Function<TimeParam, LiveData<Pair<? extends Pair<? extends Integer, ? extends Integer>, ? extends Pair<? extends Integer, ? extends Integer>>>>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            public final LiveData<Pair<? extends Pair<? extends Integer, ? extends Integer>, ? extends Pair<? extends Integer, ? extends Integer>>> apply(TimeParam timeParam) {
                TimeParam timeParam2 = timeParam;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(timeParam2.getTime());
                Date time = calendar.getTime();
                int i = HealthDataDetailViewModel.WhenMappings.$EnumSwitchMapping$0[timeParam2.getMode().ordinal()];
                if (i == 1) {
                    return this.a.findLatestBpRangeByDay(time);
                }
                if (i == 2) {
                    return this.a.findLatestBpRangeByWeek(time);
                }
                if (i == 3) {
                    return this.a.findLatestBpRangeByMonth(time);
                }
                if (i == 4) {
                    return this.a.findLatestBpRangeByYear(time);
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        this.bpRange = liveDataSwitchMap;
        LiveData<String> map = Transformations.map(liveDataSwitchMap, new Function<Pair<? extends Pair<? extends Integer, ? extends Integer>, ? extends Pair<? extends Integer, ? extends Integer>>, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$9
            @Override // androidx.arch.core.util.Function
            public final String apply(Pair<? extends Pair<? extends Integer, ? extends Integer>, ? extends Pair<? extends Integer, ? extends Integer>> pair) {
                Pair<? extends Integer, ? extends Integer> first = pair.getFirst();
                if (first.getFirst().intValue() == first.getSecond().intValue()) {
                    return first.getFirst().intValue() != 0 ? String.valueOf(first.getFirst().intValue()) : BloodOxygenStatisticsView.INVALID;
                }
                return first.getFirst() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + first.getSecond();
            }
        });
        this.sbpRangeString = map;
        this.sbpUnitVisible = Transformations.map(map, new Function<String, Boolean>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$10
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(String str) {
                return Boolean.valueOf(!Intrinsics.areEqual(str, BloodOxygenStatisticsView.INVALID));
            }
        });
        LiveData<String> map2 = Transformations.map(liveDataSwitchMap, new Function<Pair<? extends Pair<? extends Integer, ? extends Integer>, ? extends Pair<? extends Integer, ? extends Integer>>, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$11
            @Override // androidx.arch.core.util.Function
            public final String apply(Pair<? extends Pair<? extends Integer, ? extends Integer>, ? extends Pair<? extends Integer, ? extends Integer>> pair) {
                Pair<? extends Integer, ? extends Integer> second = pair.getSecond();
                if (second.getFirst().intValue() == second.getSecond().intValue()) {
                    return second.getFirst().intValue() != 0 ? String.valueOf(second.getFirst().intValue()) : BloodOxygenStatisticsView.INVALID;
                }
                return second.getFirst() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + second.getSecond();
            }
        });
        this.dbpRangeString = map2;
        this.dbpUnitVisible = Transformations.map(map2, new Function<String, Boolean>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel$special$$inlined$map$12
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(String str) {
                return Boolean.valueOf(!Intrinsics.areEqual(str, BloodOxygenStatisticsView.INVALID));
            }
        });
    }

    @NotNull
    public final LiveData<ColoredProgressBarBuilder> getBarBuilder() {
        return this.barBuilder;
    }

    @NotNull
    public final LiveData<Float> getBarProgress() {
        return this.barProgress;
    }

    @NotNull
    public final LiveData<String> getDataIntro() {
        return this.dataIntro;
    }

    @NotNull
    public final LiveData<Integer> getDataIntroImg() {
        return this.dataIntroImg;
    }

    @NotNull
    public final LiveData<String> getDataName() {
        return this.dataName;
    }

    @NotNull
    public final LiveData<String> getDataUnit() {
        return this.dataUnit;
    }

    @NotNull
    public final MutableLiveData<Float> getDataValue() {
        return this.dataValue;
    }

    @NotNull
    public final LiveData<String> getDbpRangeString() {
        return this.dbpRangeString;
    }

    @NotNull
    public final LiveData<Boolean> getDbpUnitVisible() {
        return this.dbpUnitVisible;
    }

    @NotNull
    public final LiveData<String> getLevelIntro() {
        return this.levelIntro;
    }

    @NotNull
    public final LiveData<String> getSbpRangeString() {
        return this.sbpRangeString;
    }

    @NotNull
    public final LiveData<Boolean> getSbpUnitVisible() {
        return this.sbpUnitVisible;
    }

    @NotNull
    public final LiveData<Boolean> getShowAddData() {
        return this.showAddData;
    }

    public final void loadBpRange(@NotNull TimeParam timeParam) {
        this.time.setValue(timeParam);
    }

    public final void setDataValue(@Nullable Float value) {
        MutableLiveData<Float> mutableLiveData = this.dataValue;
        if (value == null || Float.isNaN(value.floatValue())) {
            value = Float.valueOf(-1.0f);
        }
        mutableLiveData.setValue(value);
    }

    public final void setHealthDataType(@NotNull HealthDataType type) {
        this.dataType.setValue(type);
    }

    @Nullable
    /* JADX INFO: renamed from: getDbpRangeString, reason: collision with other method in class */
    public final String m3448getDbpRangeString() {
        return this.dbpRangeString.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getSbpRangeString, reason: collision with other method in class */
    public final String m3449getSbpRangeString() {
        return this.sbpRangeString.getValue();
    }
}
