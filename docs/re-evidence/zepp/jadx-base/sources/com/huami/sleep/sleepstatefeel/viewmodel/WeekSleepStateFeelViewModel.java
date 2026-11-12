package com.huami.sleep.sleepstatefeel.viewmodel;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo;
import com.huami.sleep.sleepstatefeel.viewmodel.WeekSleepStateFeelViewModel;
import com.huami.sleep.sleepstatefeel.vo.WeekSleepStateFeelVo;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b/\u00100J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR%\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0015\u0010#R1\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010&0&0%8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010*R1\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010&0&0%8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010*¨\u00061"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/viewmodel/WeekSleepStateFeelViewModel;", "Landroidx/lifecycle/ViewModel;", "", "startTime", "endTime", "", "uid", "", PointCategory.INIT, "Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", "a", "Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", "getRepo", "()Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", CommonLanguageSettingFragment.KEY_REPO, "b", "J", "getStartTime", "()J", "setStartTime", "(J)V", "c", "getEndTime", "setEndTime", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "Landroidx/lifecycle/LiveData;", "Lcom/huami/sleep/sleepstatefeel/vo/WeekSleepStateFeelVo;", "e", "Lkotlin/Lazy;", "()Landroidx/lifecycle/LiveData;", "allManualData", "Landroidx/lifecycle/MediatorLiveData;", "Ljava/util/ArrayList;", "", "f", "getAllSleepFeeling", "()Landroidx/lifecycle/MediatorLiveData;", "allSleepFeeling", "g", "getAllSleepState", "allSleepState", "<init>", "(Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class WeekSleepStateFeelViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepStateFeelRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long endTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String userId = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy allManualData = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy allSleepFeeling = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy allSleepState = LazyKt__LazyJVMKt.lazy(c.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "Lcom/huami/sleep/sleepstatefeel/vo/WeekSleepStateFeelVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LiveData<WeekSleepStateFeelVo>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<WeekSleepStateFeelVo> invoke() {
            return WeekSleepStateFeelViewModel.this.getRepo().getWeekStateFeelLiveData(WeekSleepStateFeelViewModel.this.getUserId(), TimeShowUtilsKt.toDateString(WeekSleepStateFeelViewModel.this.getStartTime()), TimeShowUtilsKt.toDateString(WeekSleepStateFeelViewModel.this.getEndTime()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "Ljava/util/ArrayList;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MediatorLiveData<ArrayList<ArrayList<Integer>>>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<ArrayList<ArrayList<Integer>>> invoke() {
            return new MediatorLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MediatorLiveData;", "Ljava/util/ArrayList;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MediatorLiveData<ArrayList<ArrayList<Integer>>>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediatorLiveData<ArrayList<ArrayList<Integer>>> invoke() {
            return new MediatorLiveData<>();
        }
    }

    public WeekSleepStateFeelViewModel(@NotNull ISleepStateFeelRepo iSleepStateFeelRepo) {
        this.repo = iSleepStateFeelRepo;
    }

    private final LiveData<WeekSleepStateFeelVo> c() {
        return (LiveData) this.allManualData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WeekSleepStateFeelViewModel weekSleepStateFeelViewModel, WeekSleepStateFeelVo weekSleepStateFeelVo) {
        MediatorLiveData<ArrayList<ArrayList<Integer>>> allSleepFeeling = weekSleepStateFeelViewModel.getAllSleepFeeling();
        WeekSleepStateFeelVo value = weekSleepStateFeelViewModel.c().getValue();
        allSleepFeeling.postValue(value == null ? null : value.getFeelInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(WeekSleepStateFeelViewModel weekSleepStateFeelViewModel, WeekSleepStateFeelVo weekSleepStateFeelVo) {
        MediatorLiveData<ArrayList<ArrayList<Integer>>> allSleepState = weekSleepStateFeelViewModel.getAllSleepState();
        WeekSleepStateFeelVo value = weekSleepStateFeelViewModel.c().getValue();
        allSleepState.postValue(value == null ? null : value.getStateInfo());
    }

    @NotNull
    public final MediatorLiveData<ArrayList<ArrayList<Integer>>> getAllSleepFeeling() {
        return (MediatorLiveData) this.allSleepFeeling.getValue();
    }

    @NotNull
    public final MediatorLiveData<ArrayList<ArrayList<Integer>>> getAllSleepState() {
        return (MediatorLiveData) this.allSleepState.getValue();
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final ISleepStateFeelRepo getRepo() {
        return this.repo;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void init(long startTime, long endTime, @NotNull String uid) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.userId = uid;
        getAllSleepFeeling().addSource(c(), new Observer() { // from class: yq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekSleepStateFeelViewModel.e(this.a, (WeekSleepStateFeelVo) obj);
            }
        });
        getAllSleepState().addSource(c(), new Observer() { // from class: xq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekSleepStateFeelViewModel.f(this.a, (WeekSleepStateFeelVo) obj);
            }
        });
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }
}
