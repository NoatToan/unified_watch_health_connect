package com.huami.watchfacesstore.ui.store;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.watchfacesstore.bean.BannerBean;
import com.huami.watchfacesstore.bean.Category;
import com.huami.watchfacesstore.bean.HomeListBean;
import com.huami.watchfacesstore.bean.HomePageBean;
import com.huami.watchfacesstore.bean.NewWatchFace;
import com.huami.watchfacesstore.bean.Ranking;
import com.huami.watchfacesstore.bean.Subject;
import com.huami.watchfacesstore.bean.Topic;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.repo.LocalCacheManager;
import com.huami.watchfacesstore.ui.HomePageItemType;
import com.huami.watchfacesstore.ui.base.BaseViewModel;
import com.huami.watchfacesstore.ui.repo.WatchFaceRepo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082\bJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R+\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00180\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00180\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006$"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/WatchStoreViewModel;", "Lcom/huami/watchfacesstore/ui/base/BaseViewModel;", "Lcom/huami/watchfacesstore/bean/HomePageBean;", "originBean", "", "Lcom/huami/watchfacesstore/bean/HomeListBean;", "c", "", "newBean", "Lkotlin/Function0;", "", "filter", "", "a", "", "device", "getHomeList", "", "pageNum", "getWatchFaceList", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "watchFaceRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "b", "Landroidx/lifecycle/MutableLiveData;", "getHomeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "homeLiveData", "Lcom/huami/watchfacesstore/bean/WatchData;", "getWatchListLiveData", "watchListLiveData", "<init>", "(Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchStoreViewModel extends BaseViewModel {
    private static final int d = 10;
    private static final int e = 3;

    @NotNull
    private static final String f = "week";

    @NotNull
    private static final String g = "";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceRepo watchFaceRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<List<HomeListBean>>> homeLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<List<WatchData>>> watchListLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.WatchStoreViewModel$1", f = "WatchStoreViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
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
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LocalCacheManager localCacheManager = LocalCacheManager.INSTANCE;
                this.a = 1;
                if (localCacheManager.observerLocalData(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/HomeListBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.WatchStoreViewModel$getHomeList$1", f = "WatchStoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends HomeListBean>>>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(1, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchStoreViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends HomeListBean>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<HomeListBean>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<HomeListBean>>> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchStoreViewModel watchStoreViewModel = WatchStoreViewModel.this;
            return new Success(watchStoreViewModel.c(watchStoreViewModel.watchFaceRepo.getHomeList(this.c)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.WatchStoreViewModel$getWatchFaceList$1", f = "WatchStoreViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i, Continuation<? super c> continuation) {
            super(1, continuation);
            this.c = str;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchStoreViewModel.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(WatchFaceRepo.getWatchFaceList$default(WatchStoreViewModel.this.watchFaceRepo, this.c, this.d, 0, 4, null).getData());
        }
    }

    public WatchStoreViewModel(@NotNull WatchFaceRepo watchFaceRepo) {
        this.watchFaceRepo = watchFaceRepo;
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    private final void a(List<HomeListBean> list, HomeListBean homeListBean, Function0<Boolean> function0) {
        if (((homeListBean.getData() instanceof List) && ((List) homeListBean.getData()).isEmpty()) || function0.invoke().booleanValue()) {
            return;
        }
        list.add(homeListBean);
    }

    public static /* synthetic */ void b(WatchStoreViewModel watchStoreViewModel, List list, HomeListBean homeListBean, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: com.huami.watchfacesstore.ui.store.WatchStoreViewModel$addHomeListBean$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    return Boolean.valueOf(invoke2());
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final boolean invoke2() {
                    return false;
                }
            };
        }
        if (((homeListBean.getData() instanceof List) && ((List) homeListBean.getData()).isEmpty()) || ((Boolean) function0.invoke()).booleanValue()) {
            return;
        }
        list.add(homeListBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<HomeListBean> c(HomePageBean originBean) {
        ArrayList arrayList = new ArrayList();
        List<BannerBean> listComponent1 = originBean.component1();
        List<Category> listComponent2 = originBean.component2();
        List<WatchData> listComponent3 = originBean.component3();
        List<Ranking> listComponent4 = originBean.component4();
        List<Subject> listComponent5 = originBean.component5();
        List<Topic> listComponent6 = originBean.component6();
        int total = originBean.getTotal();
        int new_count = originBean.getNew_count();
        int i = 0;
        if (listComponent6 != null) {
            for (Topic topic : listComponent6) {
                if (Intrinsics.areEqual(topic.getType(), Topic.TODAY_RECOMMEND) && (!topic.getData().isEmpty())) {
                    WatchData watchData = topic.getData().get(0);
                    WFAnalyticHelper.INSTANCE.reportWatchFaceViewAnalytic(WFStateEvent.WF_REC_SINGLE_V, watchData.getId(), watchData.isFree());
                    arrayList.add(new HomeListBean(HomePageItemType.TODAY_RECOMMEND, topic));
                } else if (Intrinsics.areEqual(topic.getType(), Topic.COOL_SPECIAL) && (!topic.getData().isEmpty())) {
                    WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_REC_SERIES_V, null, null, null, 14, null);
                    arrayList.add(new HomeListBean(HomePageItemType.COOL_SPECIAL, topic));
                }
            }
        }
        HomeListBean homeListBean = new HomeListBean(HomePageItemType.NEW_WATCH, new NewWatchFace(new_count, listComponent3));
        if (!(homeListBean.getData() instanceof List) || !((List) homeListBean.getData()).isEmpty()) {
            if (!(total < 10 || listComponent3.size() < 3)) {
                arrayList.add(homeListBean);
            }
        }
        HomeListBean homeListBean2 = new HomeListBean(HomePageItemType.BANNER, listComponent1);
        if (!(homeListBean2.getData() instanceof List) || !((List) homeListBean2.getData()).isEmpty()) {
            arrayList.add(homeListBean2);
        }
        HomePageItemType homePageItemType = HomePageItemType.RANKING;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listComponent4) {
            if (Intrinsics.areEqual(((Ranking) obj).getType(), "week")) {
                arrayList2.add(obj);
            }
        }
        HomeListBean homeListBean3 = new HomeListBean(homePageItemType, arrayList2);
        if (!(homeListBean3.getData() instanceof List) || !((List) homeListBean3.getData()).isEmpty()) {
            if (!(total < 10)) {
                arrayList.add(homeListBean3);
            }
        }
        HomeListBean homeListBean4 = new HomeListBean(HomePageItemType.NPS, "");
        if (!(homeListBean4.getData() instanceof List) || !((List) homeListBean4.getData()).isEmpty()) {
            arrayList.add(homeListBean4);
        }
        int size = listComponent5.size() + listComponent2.size();
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                if (i < listComponent5.size()) {
                    arrayList.add(new HomeListBean(HomePageItemType.SUBJECT, listComponent5.get(i)));
                }
                if (i < listComponent2.size()) {
                    HomePageItemType homePageItemType2 = HomePageItemType.CATEGORY;
                    Category category = listComponent2.get(i);
                    category.setCategoryNum(listComponent2.size());
                    Unit unit = Unit.INSTANCE;
                    arrayList.add(new HomeListBean(homePageItemType2, category));
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public final void getHomeList(@NotNull String device) {
        startWithLoading(this.homeLiveData, new b(device, null));
    }

    @NotNull
    public final MutableLiveData<State<List<HomeListBean>>> getHomeLiveData() {
        return this.homeLiveData;
    }

    public final void getWatchFaceList(@NotNull String device, int pageNum) {
        startWithLoading(this.watchListLiveData, new c(device, pageNum, null));
    }

    @NotNull
    public final MutableLiveData<State<List<WatchData>>> getWatchListLiveData() {
        return this.watchListLiveData;
    }
}
