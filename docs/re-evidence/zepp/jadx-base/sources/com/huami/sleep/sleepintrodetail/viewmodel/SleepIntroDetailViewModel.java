package com.huami.sleep.sleepintrodetail.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.entry.SkyCardEntry;
import com.huami.sky.entry.TagInfo;
import com.huami.sky.service.SkyCardService;
import com.huami.sleep.sleepintrodetail.util.SleepIntroDetailUtil;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroItemVo;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b4\u00105J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00108\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016R\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020*0\f8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010-R/\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0006\u0012\u0004\u0018\u0001000/0\f8\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b2\u0010-¨\u00066"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;", "detailVo", "", StatEvent.BF_OPERATION_STATICS_TYPE, "canShowSkyEntry", "setIntroDetail", "Lcom/huami/sky/service/SkyCardService;", "a", "Lcom/huami/sky/service/SkyCardService;", "skyCardService", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "detail", "Landroidx/lifecycle/LiveData;", "", "", "c", "Landroidx/lifecycle/LiveData;", "getIntroValue", "()Landroidx/lifecycle/LiveData;", "introValue", "", GoogleApiAvailabilityLight.a, "getIntroValueImgRes", "introValueImgRes", "e", "getIntroTrendInfo", "introTrendInfo", "f", "getRefValue", "refValue", "", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroItemVo;", "g", "getIntroItem", "introItem", "h", "getRefDoc", "refDoc", "", "i", "getShowSky", "()Landroidx/lifecycle/MutableLiveData;", "showSky", "Lkotlin/Pair;", "Lcom/huami/sky/entry/TagInfo;", z.j, "getTags", "tags", "<init>", "(Lcom/huami/sky/service/SkyCardService;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepIntroDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final SkyCardService skyCardService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<SleepIntroDetailVo> detail;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String[]> introValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> introValueImgRes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> introTrendInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> refValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<SleepIntroItemVo>> introItem;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> refDoc;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showSky;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<TagInfo, TagInfo>> tags;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel$canShowSkyEntry$1", f = "SleepIntroDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0586a extends Lambda implements Function0<String> {
            public static final C0586a a = new C0586a();

            public C0586a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "canShowSkyEntry had exception";
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepIntroDetailViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                SkyCardEntry skyCardEntry = SleepIntroDetailViewModel.this.skyCardService.getSkyCardEntry(null);
                SleepIntroDetailViewModel.this.getShowSky().postValue(Boxing.boxBoolean(skyCardEntry.getDisplay()));
                SleepIntroDetailViewModel.this.getTags().postValue(new Pair<>((TagInfo) CollectionsKt.firstOrNull((List) skyCardEntry.getTags()), (TagInfo) CollectionsKt.getOrNull(skyCardEntry.getTags(), 1)));
            } catch (Exception e) {
                HMLog.error$default(null, null, e, C0586a.a, 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepIntroDetailViewModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SleepIntroDetailViewModel(SkyCardService skyCardService, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : skyCardService);
    }

    public final void canShowSkyEntry() {
        if (this.skyCardService == null) {
            this.showSky.setValue(Boolean.FALSE);
        } else {
            e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
        }
    }

    @NotNull
    public final LiveData<List<SleepIntroItemVo>> getIntroItem() {
        return this.introItem;
    }

    @NotNull
    public final LiveData<String> getIntroTrendInfo() {
        return this.introTrendInfo;
    }

    @NotNull
    public final LiveData<String[]> getIntroValue() {
        return this.introValue;
    }

    @NotNull
    public final LiveData<Integer> getIntroValueImgRes() {
        return this.introValueImgRes;
    }

    @NotNull
    public final LiveData<String> getRefDoc() {
        return this.refDoc;
    }

    @NotNull
    public final LiveData<String> getRefValue() {
        return this.refValue;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowSky() {
        return this.showSky;
    }

    @NotNull
    public final MutableLiveData<Pair<TagInfo, TagInfo>> getTags() {
        return this.tags;
    }

    public final void setIntroDetail(@NotNull SleepIntroDetailVo detailVo) {
        this.detail.setValue(detailVo);
    }

    public final void statistics(@NotNull SleepIntroDetailVo detailVo) {
        SleepIntroDetailUtil.INSTANCE.statistics(detailVo);
    }

    public SleepIntroDetailViewModel(@Nullable SkyCardService skyCardService) {
        this.skyCardService = skyCardService;
        MutableLiveData<SleepIntroDetailVo> mutableLiveData = new MutableLiveData<>();
        this.detail = mutableLiveData;
        this.introValue = Transformations.map(mutableLiveData, new Function<SleepIntroDetailVo, String[]>() { // from class: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final String[] apply(SleepIntroDetailVo sleepIntroDetailVo) {
                return SleepIntroDetailUtil.INSTANCE.getIntroValue(sleepIntroDetailVo);
            }
        });
        this.introValueImgRes = Transformations.map(this.detail, new Function<SleepIntroDetailVo, Integer>() { // from class: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final Integer apply(SleepIntroDetailVo sleepIntroDetailVo) {
                return Integer.valueOf(sleepIntroDetailVo.getValueImageRes());
            }
        });
        this.introTrendInfo = Transformations.map(this.detail, new Function<SleepIntroDetailVo, String>() { // from class: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel$special$$inlined$map$3
            @Override // androidx.arch.core.util.Function
            public final String apply(SleepIntroDetailVo sleepIntroDetailVo) {
                return sleepIntroDetailVo.getValueTrendInfo();
            }
        });
        this.refValue = Transformations.map(this.detail, new Function<SleepIntroDetailVo, String>() { // from class: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel$special$$inlined$map$4
            @Override // androidx.arch.core.util.Function
            public final String apply(SleepIntroDetailVo sleepIntroDetailVo) {
                return SleepIntroDetailUtil.INSTANCE.getRefValue(sleepIntroDetailVo);
            }
        });
        this.introItem = Transformations.map(this.detail, new Function<SleepIntroDetailVo, List<? extends SleepIntroItemVo>>() { // from class: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final List<? extends SleepIntroItemVo> apply(SleepIntroDetailVo sleepIntroDetailVo) {
                return SleepIntroDetailUtil.INSTANCE.getIntroItems(sleepIntroDetailVo.getType());
            }
        });
        this.refDoc = Transformations.map(this.detail, new Function<SleepIntroDetailVo, String>() { // from class: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel$special$$inlined$map$6
            @Override // androidx.arch.core.util.Function
            public final String apply(SleepIntroDetailVo sleepIntroDetailVo) {
                return SleepIntroDetailUtil.INSTANCE.getRefDoc(sleepIntroDetailVo.getType());
            }
        });
        this.showSky = new MutableLiveData<>();
        this.tags = new MutableLiveData<>();
    }
}
