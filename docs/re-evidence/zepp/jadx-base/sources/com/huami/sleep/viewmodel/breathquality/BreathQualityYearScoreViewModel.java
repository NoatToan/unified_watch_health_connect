package com.huami.sleep.viewmodel.breathquality;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.repo.IBreathQualityRepo;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.view.SleepPosCircleView;
import com.huami.sleep.vo.BreathQualityYearScoreVo;
import com.huami.snore.core.ext.KoinExtKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR+\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR+\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR+\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b¨\u0006,"}, d2 = {"Lcom/huami/sleep/viewmodel/breathquality/BreathQualityYearScoreViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "", "time", "", "getScoreStatisticData", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "a", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "getRepo", "()Lcom/huami/sleep/repo/IBreathQualityRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/vo/BreathQualityYearScoreVo;", "b", "Lkotlin/Lazy;", "getScoreStatisticLifeData", "()Landroidx/lifecycle/MutableLiveData;", "scoreStatisticLifeData", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "c", "Landroidx/lifecycle/LiveData;", "getNormalDays", "()Landroidx/lifecycle/LiveData;", "normalDays", GoogleApiAvailabilityLight.a, "getLowDays", "lowDays", "e", "getMediumDays", "mediumDays", "f", "getHighDays", "highDays", "", "g", "getNoData", "noData", "<init>", "(Lcom/huami/sleep/repo/IBreathQualityRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityYearScoreViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualityRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy scoreStatisticLifeData = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Integer, String>> normalDays = Transformations.map(getScoreStatisticLifeData(), new Function<BreathQualityYearScoreVo, Pair<? extends Integer, ? extends String>>() { // from class: com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel$special$$inlined$map$1
        @Override // androidx.arch.core.util.Function
        public final Pair<? extends Integer, ? extends String> apply(BreathQualityYearScoreVo breathQualityYearScoreVo) {
            BreathQualityYearScoreVo breathQualityYearScoreVo2 = breathQualityYearScoreVo;
            return new Pair<>(Integer.valueOf(breathQualityYearScoreVo2.getData().get(0).getMValue()), KoinExtKt.getAppContext().getResources().getQuantityString(R.plurals.sleep_record_unit, breathQualityYearScoreVo2.getData().get(0).getMValue()));
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Integer, String>> lowDays = Transformations.map(getScoreStatisticLifeData(), new Function<BreathQualityYearScoreVo, Pair<? extends Integer, ? extends String>>() { // from class: com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel$special$$inlined$map$2
        @Override // androidx.arch.core.util.Function
        public final Pair<? extends Integer, ? extends String> apply(BreathQualityYearScoreVo breathQualityYearScoreVo) {
            BreathQualityYearScoreVo breathQualityYearScoreVo2 = breathQualityYearScoreVo;
            return new Pair<>(Integer.valueOf(breathQualityYearScoreVo2.getData().get(1).getMValue()), KoinExtKt.getAppContext().getResources().getQuantityString(R.plurals.sleep_record_unit, breathQualityYearScoreVo2.getData().get(1).getMValue()));
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Integer, String>> mediumDays = Transformations.map(getScoreStatisticLifeData(), new Function<BreathQualityYearScoreVo, Pair<? extends Integer, ? extends String>>() { // from class: com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel$special$$inlined$map$3
        @Override // androidx.arch.core.util.Function
        public final Pair<? extends Integer, ? extends String> apply(BreathQualityYearScoreVo breathQualityYearScoreVo) {
            BreathQualityYearScoreVo breathQualityYearScoreVo2 = breathQualityYearScoreVo;
            return new Pair<>(Integer.valueOf(breathQualityYearScoreVo2.getData().get(2).getMValue()), KoinExtKt.getAppContext().getResources().getQuantityString(R.plurals.sleep_record_unit, breathQualityYearScoreVo2.getData().get(2).getMValue()));
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<Integer, String>> highDays = Transformations.map(getScoreStatisticLifeData(), new Function<BreathQualityYearScoreVo, Pair<? extends Integer, ? extends String>>() { // from class: com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel$special$$inlined$map$4
        @Override // androidx.arch.core.util.Function
        public final Pair<? extends Integer, ? extends String> apply(BreathQualityYearScoreVo breathQualityYearScoreVo) {
            BreathQualityYearScoreVo breathQualityYearScoreVo2 = breathQualityYearScoreVo;
            return new Pair<>(Integer.valueOf(breathQualityYearScoreVo2.getData().get(3).getMValue()), KoinExtKt.getAppContext().getResources().getQuantityString(R.plurals.sleep_record_unit, breathQualityYearScoreVo2.getData().get(3).getMValue()));
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> noData = Transformations.map(getScoreStatisticLifeData(), new Function<BreathQualityYearScoreVo, Boolean>() { // from class: com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel$special$$inlined$map$5
        @Override // androidx.arch.core.util.Function
        public final Boolean apply(BreathQualityYearScoreVo breathQualityYearScoreVo) {
            ArrayList<SleepPosCircleView.Item> data = breathQualityYearScoreVo.getData();
            boolean z = false;
            if (!(data instanceof Collection) || !data.isEmpty()) {
                Iterator<T> it2 = data.iterator();
                while (it2.hasNext()) {
                    if (((SleepPosCircleView.Item) it2.next()).getMValue() > 0) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(!z);
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel$getScoreStatisticData$1", f = "BreathQualityYearScoreViewModel.kt", i = {}, l = {29, 34}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        /* JADX INFO: renamed from: com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/sleep/vo/BreathQualityYearScoreVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel$getScoreStatisticData$1$1", f = "BreathQualityYearScoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0590a extends SuspendLambda implements Function2<BreathQualityYearScoreVo, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ BreathQualityYearScoreViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0590a(BreathQualityYearScoreViewModel breathQualityYearScoreViewModel, Continuation<? super C0590a> continuation) {
                super(2, continuation);
                this.c = breathQualityYearScoreViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull BreathQualityYearScoreVo breathQualityYearScoreVo, @Nullable Continuation<? super Unit> continuation) {
                return ((C0590a) create(breathQualityYearScoreVo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0590a c0590a = new C0590a(this.c, continuation);
                c0590a.b = obj;
                return c0590a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.getScoreStatisticLifeData().postValue((BreathQualityYearScoreVo) this.b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BreathQualityYearScoreViewModel.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            IBreathQualityRepo repo = BreathQualityYearScoreViewModel.this.getRepo();
            Context appContext = KoinExtKt.getAppContext();
            String str = this.c;
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            long firstDayOfYearTime = sleepTimeUtil.getFirstDayOfYearTime(this.d);
            long lastDayOfYearTime = sleepTimeUtil.getLastDayOfYearTime(this.d);
            this.a = 1;
            obj = repo.getYearScoreShowInfo(appContext, str, firstDayOfYearTime, lastDayOfYearTime, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            C0590a c0590a = new C0590a(BreathQualityYearScoreViewModel.this, null);
            this.a = 2;
            if (FlowKt.collectLatest((Flow) obj, c0590a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/vo/BreathQualityYearScoreVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<BreathQualityYearScoreVo>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<BreathQualityYearScoreVo> invoke() {
            return new MutableLiveData<>();
        }
    }

    public BreathQualityYearScoreViewModel(@NotNull IBreathQualityRepo iBreathQualityRepo) {
        this.repo = iBreathQualityRepo;
    }

    @NotNull
    public final LiveData<Pair<Integer, String>> getHighDays() {
        return this.highDays;
    }

    @NotNull
    public final LiveData<Pair<Integer, String>> getLowDays() {
        return this.lowDays;
    }

    @NotNull
    public final LiveData<Pair<Integer, String>> getMediumDays() {
        return this.mediumDays;
    }

    @NotNull
    public final LiveData<Boolean> getNoData() {
        return this.noData;
    }

    @NotNull
    public final LiveData<Pair<Integer, String>> getNormalDays() {
        return this.normalDays;
    }

    @NotNull
    public final IBreathQualityRepo getRepo() {
        return this.repo;
    }

    public final void getScoreStatisticData(@NotNull String userId, long time) {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(userId, time, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<BreathQualityYearScoreVo> getScoreStatisticLifeData() {
        return (MutableLiveData) this.scoreStatisticLifeData.getValue();
    }
}
