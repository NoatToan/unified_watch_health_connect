package com.xiaomi.hm.health.healthdata.ui.viewmodel;

import android.util.SparseArray;
import androidx.arch.core.util.Function;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.repository.HealthDataRepo;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0014R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020!0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0014R\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001aR\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020*0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010\u001aR\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020*0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u0010\u001aR\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020*0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010\u0018\u001a\u0004\b5\u0010\u001a¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/DataDetailBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "type", "", "a", "setDataType", "Lcom/xiaomi/hm/health/healthdata/repository/HealthDataRepo;", "Lcom/xiaomi/hm/health/healthdata/repository/HealthDataRepo;", "baseRepo", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "b", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "coreRepo", "", "c", "Ljava/lang/String;", "tag", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "dataType", "Landroidx/lifecycle/LiveData;", "e", "Landroidx/lifecycle/LiveData;", "getDataName", "()Landroidx/lifecycle/LiveData;", "dataName", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "f", "getFragmentsLiveData", "fragmentsLiveData", "", "g", "dayTime", "h", "weekTime", "i", "monthTime", z.j, "yearTime", "", hl.k, "getDayDefaultPagePosLiveData", "dayDefaultPagePosLiveData", "l", "getWeekDefaultPagePosLiveData", "weekDefaultPagePosLiveData", "m", "getMonthDefaultPagePosLiveData", "monthDefaultPagePosLiveData", GoogleApiAvailabilityLight.b, "getYearDefaultPagePosLiveData", "yearDefaultPagePosLiveData", "<init>", "(Lcom/xiaomi/hm/health/healthdata/repository/HealthDataRepo;Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataDetailBaseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthDataRepo baseRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthCoreDataRepo coreRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String tag = "DataDetailBaseViewModel";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DataType> dataType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> dataName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<SparseArray<Fragment>> fragmentsLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Long> dayTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Long> weekTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Long> monthTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Long> yearTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> dayDefaultPagePosLiveData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> weekDefaultPagePosLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> monthDefaultPagePosLiveData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> yearDefaultPagePosLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateDayTime:" + this.a;
        }
    }

    public DataDetailBaseViewModel(@NotNull HealthDataRepo healthDataRepo, @NotNull HealthCoreDataRepo healthCoreDataRepo) {
        this.baseRepo = healthDataRepo;
        this.coreRepo = healthCoreDataRepo;
        MutableLiveData<DataType> mutableLiveData = new MutableLiveData<>();
        this.dataType = mutableLiveData;
        this.dataName = Transformations.map(mutableLiveData, new Function<DataType, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final String apply(DataType dataType) {
                return HealthDataUtils.INSTANCE.getHealthDataName(dataType);
            }
        });
        this.fragmentsLiveData = Transformations.map(mutableLiveData, new Function<DataType, SparseArray<Fragment>>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final SparseArray<Fragment> apply(DataType dataType) {
                return this.a.baseRepo.timeModeFragments(dataType);
            }
        });
        this.dayTime = new MutableLiveData<>();
        this.weekTime = new MutableLiveData<>();
        this.monthTime = new MutableLiveData<>();
        this.yearTime = new MutableLiveData<>();
        this.dayDefaultPagePosLiveData = Transformations.map(this.dayTime, new Function<Long, Integer>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final Integer apply(Long l) {
                return Integer.valueOf(HealthDataTimeUtils.INSTANCE.getDifferFromRegisterDay(l.longValue(), TimeMode.DAY));
            }
        });
        this.weekDefaultPagePosLiveData = Transformations.map(this.weekTime, new Function<Long, Integer>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel$special$$inlined$map$4
            @Override // androidx.arch.core.util.Function
            public final Integer apply(Long l) {
                return Integer.valueOf(HealthDataTimeUtils.INSTANCE.getDifferFromRegisterDay(l.longValue(), TimeMode.WEEK));
            }
        });
        this.monthDefaultPagePosLiveData = Transformations.map(this.monthTime, new Function<Long, Integer>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final Integer apply(Long l) {
                return Integer.valueOf(HealthDataTimeUtils.INSTANCE.getDifferFromRegisterDay(l.longValue(), TimeMode.MONTH));
            }
        });
        this.yearDefaultPagePosLiveData = Transformations.map(this.yearTime, new Function<Long, Integer>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel$special$$inlined$map$6
            @Override // androidx.arch.core.util.Function
            public final Integer apply(Long l) {
                return Integer.valueOf(HealthDataTimeUtils.INSTANCE.getDifferFromRegisterDay(l.longValue(), TimeMode.YEAR));
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.dayTime.postValue(Long.valueOf(jCurrentTimeMillis));
        this.weekTime.postValue(Long.valueOf(jCurrentTimeMillis));
        this.monthTime.postValue(Long.valueOf(jCurrentTimeMillis));
        this.yearTime.postValue(Long.valueOf(jCurrentTimeMillis));
    }

    private final void a(DataType type) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DataDetailBaseViewModel$updateLatestTime$$inlined$safeLaunch$1(null, this, type), 2, null);
    }

    @NotNull
    public final LiveData<String> getDataName() {
        return this.dataName;
    }

    @NotNull
    public final LiveData<Integer> getDayDefaultPagePosLiveData() {
        return this.dayDefaultPagePosLiveData;
    }

    @NotNull
    public final LiveData<SparseArray<Fragment>> getFragmentsLiveData() {
        return this.fragmentsLiveData;
    }

    @NotNull
    public final LiveData<Integer> getMonthDefaultPagePosLiveData() {
        return this.monthDefaultPagePosLiveData;
    }

    @NotNull
    public final LiveData<Integer> getWeekDefaultPagePosLiveData() {
        return this.weekDefaultPagePosLiveData;
    }

    @NotNull
    public final LiveData<Integer> getYearDefaultPagePosLiveData() {
        return this.yearDefaultPagePosLiveData;
    }

    public final void setDataType(@NotNull DataType type) {
        this.dataType.setValue(type);
        a(type);
    }
}
