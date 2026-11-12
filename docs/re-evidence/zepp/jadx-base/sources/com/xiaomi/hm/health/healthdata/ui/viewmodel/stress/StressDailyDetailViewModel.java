package com.xiaomi.hm.health.healthdata.ui.viewmodel.stress;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.daysleep.sleepstagechart.vo.Resource;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase;
import com.huami.stress.domain.usecase.device.GetMeasureFrequencyUseCase;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.config.Config;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.healthdata.repository.ChartRepo;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.DayStressDetailData;
import com.xiaomi.hm.health.healthtag.api.request.WebConst;
import com.xiaomi.hm.health.healthtag.core.dto.TagInfoDto;
import com.xiaomi.hm.health.healthtag.core.dto.UserMakeTagDto;
import com.xiaomi.hm.health.healthtag.core.repo.HealthTagRepo;
import com.xiaomi.hm.health.healthtag.ui.utils.TagUtils;
import com.xiaomi.hm.health.healthtag.ui.vo.TagInfoVo;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\bZ\u0010[J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J!\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rR\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010&\u001a\n #*\u0004\u0018\u00010\t0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R'\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u0001020+8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00100R#\u0010;\u001a\b\u0012\u0004\u0012\u0002070+8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u00100R#\u0010>\u001a\b\u0012\u0004\u0012\u0002070+8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u00100R%\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060?0+8\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\bA\u00100R/\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D0C0+8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u00100R\u001f\u0010M\u001a\b\u0012\u0004\u0012\u00020\t0H8\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR3\u0010R\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020Nj\b\u0012\u0004\u0012\u00020\u0002`O0+8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u00109\u001a\u0004\bQ\u00100R)\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0S0+8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\bU\u00100R#\u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0+8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u00109\u001a\u0004\bX\u00100¨\u0006\\"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/stress/StressDailyDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto;", "info", "", "b", "Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;", "tagInfo", "a", "", "c", "checkMakeTagEnable", "Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;", "", "timeStamp", "addNewTag", "(Lcom/xiaomi/hm/health/healthtag/ui/vo/TagInfoVo;Ljava/lang/Long;)V", "loadUserMakeTagByDate", "(Ljava/lang/Long;)V", "uploadManualTag", "time", "loadDailyStress", "Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;", "Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;", "combineUseCase", "Lcom/huami/stress/domain/usecase/device/GetMeasureFrequencyUseCase;", "Lcom/huami/stress/domain/usecase/device/GetMeasureFrequencyUseCase;", "frequencyUseCase", "Lcom/xiaomi/hm/health/healthtag/core/repo/HealthTagRepo;", "Lcom/xiaomi/hm/health/healthtag/core/repo/HealthTagRepo;", "tagRepo", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "chartRep", "kotlin.jvm.PlatformType", "e", "Ljava/lang/String;", "tag", "", "f", LogUtil.I, "mMaxTagNum", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/DayStressDetailData;", "g", "Landroidx/lifecycle/MutableLiveData;", "getStressDataLiveData", "()Landroidx/lifecycle/MutableLiveData;", "stressDataLiveData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "", "h", "getLatestValueLiveData", "latestValueLiveData", "", "i", "Lkotlin/Lazy;", "getMakeTagEnableLiveData", "makeTagEnableLiveData", z.j, "getLaggingLiveDate", "laggingLiveDate", "", hl.k, "getMTagList", "mTagList", "Lkotlin/Pair;", "", "l", "getMDragInterval", "mDragInterval", "Landroidx/lifecycle/LiveData;", "m", "Landroidx/lifecycle/LiveData;", "getMDragIntervalStr", "()Landroidx/lifecycle/LiveData;", "mDragIntervalStr", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.b, "getMUserMakeTagListLiveData", "mUserMakeTagListLiveData", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/Resource;", "o", "getWebResultLiveData", "webResultLiveData", com.google.android.exoplayer2.text.ttml.b.r, "getMToast", "mToast", "<init>", "(Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;Lcom/huami/stress/domain/usecase/device/GetMeasureFrequencyUseCase;Lcom/xiaomi/hm/health/healthtag/core/repo/HealthTagRepo;Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressDailyDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetCombineStressBetweenStampUseCase combineUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GetMeasureFrequencyUseCase frequencyUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HealthTagRepo tagRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final ChartRepo chartRep;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<TagInfoDto>> mTagList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String tag = StressDailyDetailViewModel.class.getSimpleName();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int mMaxTagNum = 4;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<DayStressDetailData> stressDataLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BarChartVo<Number>> latestValueLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy makeTagEnableLiveData = LazyKt__LazyJVMKt.lazy(i.a);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy laggingLiveDate = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDragInterval = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> mDragIntervalStr = Transformations.map(getMDragInterval(), new Function<Pair<? extends Float, ? extends Float>, String>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$special$$inlined$map$1
        @Override // androidx.arch.core.util.Function
        public final String apply(Pair<? extends Float, ? extends Float> pair) {
            Pair<? extends Float, ? extends Float> pair2 = pair;
            return TimeUtils.formatTime(BraceletApp.getContext(), (int) pair2.getFirst().floatValue()) + " - " + TimeUtils.formatTime(BraceletApp.getContext(), (int) pair2.getSecond().floatValue());
        }
    });

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Lazy mUserMakeTagListLiveData = LazyKt__LazyJVMKt.lazy(h.a);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy webResultLiveData = LazyKt__LazyJVMKt.lazy(l.a);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy mToast = LazyKt__LazyJVMKt.lazy(g.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$addNewTag$1$1$1$1", f = "StressDailyDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Pair<Float, Float> b;
        public final /* synthetic */ TagInfoVo c;
        public final /* synthetic */ StressDailyDetailViewModel d;
        public final /* synthetic */ Long e;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0964a extends Lambda implements Function0<String> {
            public static final C0964a a = new C0964a();

            public C0964a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return " lunch";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Pair<Float, Float> pair, TagInfoVo tagInfoVo, StressDailyDetailViewModel stressDailyDetailViewModel, Long l, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = pair;
            this.c = tagInfoVo;
            this.d = stressDailyDetailViewModel;
            this.e = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Resource<String> resourceError$default;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMLog.debug$default(null, C0964a.a, 1, null);
            UserMakeTagDto userMakeTagDto = new UserMakeTagDto((int) this.b.getFirst().floatValue(), (int) this.b.getSecond().floatValue(), this.c.getTag(), this.c.getTagType());
            boolean zUploadMakeTagEvent = this.d.tagRepo.uploadMakeTagEvent(this.d.c(), WebConst.Param.STRESS_TAG_RECORD, TagUtils.INSTANCE.getTagTimeStamp(this.e), userMakeTagDto);
            MutableLiveData<Resource<String>> webResultLiveData = this.d.getWebResultLiveData();
            if (zUploadMakeTagEvent) {
                this.d.b(userMakeTagDto);
                resourceError$default = Resource.Companion.success$default(Resource.INSTANCE, null, 1, null);
            } else {
                resourceError$default = Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null);
            }
            webResultLiveData.postValue(resourceError$default);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadDailyStress time:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<SingleStress> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<SingleStress> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "raw combine stress:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$loadUserMakeTagByDate$1$1$1", f = "StressDailyDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ android.util.Pair<Long, Long> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(android.util.Pair<Long, Long> pair, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = pair;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return StressDailyDetailViewModel.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableLiveData<ArrayList<UserMakeTagDto>> mUserMakeTagListLiveData = StressDailyDetailViewModel.this.getMUserMakeTagListLiveData();
            ArrayList<UserMakeTagDto> arrayList = new ArrayList<>();
            StressDailyDetailViewModel stressDailyDetailViewModel = StressDailyDetailViewModel.this;
            android.util.Pair<Long, Long> pair = this.c;
            List<UserMakeTagDto> listLoadUserMakeTagByDate = stressDailyDetailViewModel.tagRepo.loadUserMakeTagByDate(stressDailyDetailViewModel.c(), "HealthTagRecord", WebConst.Param.STRESS_TAG_RECORD, ((Number) pair.first).longValue(), ((Number) pair.second).longValue());
            if ((listLoadUserMakeTagByDate == null ? null : Boxing.boxBoolean(arrayList.addAll(listLoadUserMakeTagByDate))) == null) {
                stressDailyDetailViewModel.getMakeTagEnableLiveData().postValue(Boxing.boxBoolean(false));
            }
            Unit unit = Unit.INSTANCE;
            mUserMakeTagListLiveData.postValue(arrayList);
            return unit;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MutableLiveData<Pair<? extends Float, ? extends Float>>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Pair<Float, Float>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<MutableLiveData<String>> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00030\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<MutableLiveData<ArrayList<UserMakeTagDto>>> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<ArrayList<UserMakeTagDto>> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<MutableLiveData<Boolean>> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ TagInfoVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TagInfoVo tagInfoVo) {
            super(0);
            this.a = tagInfoVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上传自定义标签 " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel$uploadManualTag$2$1$1", f = "StressDailyDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ TagInfoVo b;
        public final /* synthetic */ StressDailyDetailViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(TagInfoVo tagInfoVo, StressDailyDetailViewModel stressDailyDetailViewModel, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = tagInfoVo;
            this.c = stressDailyDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Resource<String> resourceError$default;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TagInfoDto tagInfoDto = new TagInfoDto(this.b.getTag(), this.b.getTagType());
            MutableLiveData<Resource<String>> webResultLiveData = this.c.getWebResultLiveData();
            if (this.c.tagRepo.uploadTagEvent(this.c.c(), WebConst.Param.STRESS_SELF_TAG_RECORD, tagInfoDto)) {
                this.c.a(tagInfoDto);
                resourceError$default = Resource.Companion.success$default(Resource.INSTANCE, null, 1, null);
            } else {
                resourceError$default = Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null);
            }
            webResultLiveData.postValue(resourceError$default);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/Resource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<MutableLiveData<Resource<? extends String>>> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Resource<String>> invoke() {
            return new MutableLiveData<>();
        }
    }

    public StressDailyDetailViewModel(@NotNull GetCombineStressBetweenStampUseCase getCombineStressBetweenStampUseCase, @NotNull GetMeasureFrequencyUseCase getMeasureFrequencyUseCase, @NotNull HealthTagRepo healthTagRepo, @NotNull ChartRepo chartRepo) {
        this.combineUseCase = getCombineStressBetweenStampUseCase;
        this.frequencyUseCase = getMeasureFrequencyUseCase;
        this.tagRepo = healthTagRepo;
        this.chartRep = chartRepo;
        this.mTagList = healthTagRepo.loadAllTagData(c(), "HealthTagRecord", WebConst.Param.STRESS_SELF_TAG_RECORD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(TagInfoDto tagInfo) {
        this.tagRepo.addTagInfo(tagInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(UserMakeTagDto info) {
        MutableLiveData<ArrayList<UserMakeTagDto>> mUserMakeTagListLiveData = getMUserMakeTagListLiveData();
        ArrayList<UserMakeTagDto> value = getMUserMakeTagListLiveData().getValue();
        if (value == null) {
            value = null;
        } else {
            value.add(info);
            Unit unit = Unit.INSTANCE;
        }
        if (value == null) {
            value = new ArrayList<>();
            value.add(info);
            Unit unit2 = Unit.INSTANCE;
        }
        mUserMakeTagListLiveData.postValue(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return HMPersonInfo.getInstance().getUserInfo().getUserid();
    }

    public final void addNewTag(@Nullable TagInfoVo tagInfo, @Nullable Long timeStamp) {
        Pair<Float, Float> value;
        if (tagInfo == null) {
            getMToast().setValue(KoinExtKt.getAppContext().getString(R.string.stress_no_tag_select));
        }
        if (tagInfo == null || (value = getMDragInterval().getValue()) == null) {
            return;
        }
        ArrayList<UserMakeTagDto> value2 = getMUserMakeTagListLiveData().getValue();
        if ((value2 == null ? 0 : value2.size()) >= this.mMaxTagNum) {
            getMToast().setValue(KoinExtKt.getAppContext().getString(R.string.slp_tag_limite_tip));
            getLaggingLiveDate().setValue(Boolean.FALSE);
        } else if (((int) value.getFirst().floatValue()) == ((int) value.getSecond().floatValue())) {
            getMToast().setValue(KoinExtKt.getAppContext().getString(R.string.stress_invalid_drag_time_tip));
        } else {
            getWebResultLiveData().setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
            getLaggingLiveDate().setValue(Boolean.FALSE);
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getMain()), null, new StressDailyDetailViewModel$addNewTag$lambda3$lambda2$$inlined$safeLaunch$default$1(null, value, tagInfo, this, timeStamp), 2, null);
        }
        Unit unit = Unit.INSTANCE;
    }

    public final void checkMakeTagEnable() {
        getMakeTagEnableLiveData().setValue(Boolean.valueOf(!Config.isUserOversea(BraceletApp.getContext())));
    }

    @NotNull
    public final MutableLiveData<Boolean> getLaggingLiveDate() {
        return (MutableLiveData) this.laggingLiveDate.getValue();
    }

    @NotNull
    public final MutableLiveData<BarChartVo<Number>> getLatestValueLiveData() {
        return this.latestValueLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<Float, Float>> getMDragInterval() {
        return (MutableLiveData) this.mDragInterval.getValue();
    }

    @NotNull
    public final LiveData<String> getMDragIntervalStr() {
        return this.mDragIntervalStr;
    }

    @NotNull
    public final MutableLiveData<List<TagInfoDto>> getMTagList() {
        return this.mTagList;
    }

    @NotNull
    public final MutableLiveData<String> getMToast() {
        return (MutableLiveData) this.mToast.getValue();
    }

    @NotNull
    public final MutableLiveData<ArrayList<UserMakeTagDto>> getMUserMakeTagListLiveData() {
        return (MutableLiveData) this.mUserMakeTagListLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getMakeTagEnableLiveData() {
        return (MutableLiveData) this.makeTagEnableLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<DayStressDetailData> getStressDataLiveData() {
        return this.stressDataLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getWebResultLiveData() {
        return (MutableLiveData) this.webResultLiveData.getValue();
    }

    public final void loadDailyStress(long time) {
        HMLog.info(this.tag, new c(time));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new StressDailyDetailViewModel$loadDailyStress$$inlined$safeLaunch$1(null, time, this), 2, null);
    }

    public final void loadUserMakeTagByDate(@Nullable Long timeStamp) {
        if (timeStamp == null) {
            return;
        }
        timeStamp.longValue();
        android.util.Pair<Long, Long> dayStartEndTimeStamp = TagUtils.INSTANCE.getDayStartEndTimeStamp(timeStamp);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getMain()), null, new StressDailyDetailViewModel$loadUserMakeTagByDate$lambda7$$inlined$safeLaunch$default$1(null, this, dayStartEndTimeStamp), 2, null);
    }

    public final void uploadManualTag(@Nullable TagInfoVo tagInfo) {
        HMLog.debug$default(null, new j(tagInfo), 1, null);
        if (tagInfo == null) {
            return;
        }
        getWebResultLiveData().setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getMain()), null, new StressDailyDetailViewModel$uploadManualTag$lambda9$$inlined$safeLaunch$default$1(null, tagInfo, this), 2, null);
    }
}
