package com.huami.watchfacesstore.ui.store.list;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Fail;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.http.HttpError;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.watchfacesstore.bean.Metas;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.bean.WatchListBean;
import com.huami.watchfacesstore.device.WFDeviceManager;
import com.huami.watchfacesstore.device.WFDeviceManagerFactory;
import com.huami.watchfacesstore.device.WatchFaceState;
import com.huami.watchfacesstore.device.WatchFaceStatus;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.repo.HistoryRecordRepo;
import com.huami.watchfacesstore.repo.WatchFaceStatusRepo;
import com.huami.watchfacesstore.ui.LiveDataChannel;
import com.huami.watchfacesstore.ui.base.BaseViewModel;
import com.huami.watchfacesstore.ui.repo.WatchFaceRepo;
import com.huami.watchfacesstore.ui.store.list.ListViewModel;
import com.huami.watchfacesstore.usecase.DeleteHistoryRecordUseCase;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0016\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0016\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u001c\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0016\u0010(\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R(\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007000/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R+\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007000/8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b3\u00104R\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00170/8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b6\u00104R%\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208000/8\u0006@\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b:\u00104R\"\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001d\u0010F\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b9\u0010ER?\u0010L\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 H*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u000100000G8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010KR?\u0010N\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007 H*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u000100000G8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bM\u0010K¨\u0006Q"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/ListViewModel;", "Lcom/huami/watchfacesstore/ui/base/BaseViewModel;", "", "id", "", "i", "m", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "dataList", "f", "c", "e", "h", GoogleApiAvailabilityLight.b, "o", "categoryId", "g", "publisherId", com.google.android.exoplayer2.text.ttml.b.r, hl.k, "pageMode", "getDataLists", "", "rankType", "getRankLists", "deleteWatchFace", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "a", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;", "b", "Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;", "historyRecordRepo", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "statusRepo", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "deviceId", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "wfDeviceManager", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "deviceManager", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Landroidx/lifecycle/MutableLiveData;", "rankLiveData", "getListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "listLiveData", "getCategoryTitleLiveData", "categoryTitleLiveData", "Lcom/huami/watchfacesstore/device/WatchFaceState;", z.j, "getDeleteLiveData", "deleteLiveData", LogUtil.I, "getPageNum", "()I", "setPageNum", "(I)V", "pageNum", "Lcom/huami/watchfacesstore/usecase/DeleteHistoryRecordUseCase;", "l", "Lkotlin/Lazy;", "()Lcom/huami/watchfacesstore/usecase/DeleteHistoryRecordUseCase;", "deleteHistoryRecordUseCase", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "Landroidx/lifecycle/LiveData;", "getHeaderLiveData", "()Landroidx/lifecycle/LiveData;", "headerLiveData", "getOtherListsLiveData", "otherListsLiveData", "<init>", "(Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ListViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HistoryRecordRepo historyRecordRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceStatusRepo statusRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String deviceId = KoinExtKt.getDeviceInfo().getDeviceId();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final WFDeviceManager wfDeviceManager = WFDeviceManagerFactory.INSTANCE.getHMDeviceManager();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final IDeviceManager deviceManager = KoinExtKt.getDeviceManager();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<List<WatchData>>> rankLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<List<WatchData>>> listLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> categoryTitleLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<WatchFaceState>> deleteLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int pageNum;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteHistoryRecordUseCase;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final LiveData<State<List<WatchData>>> headerLiveData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final LiveData<State<List<WatchData>>> otherListsLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$deleteDeviceWatchFace$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<WatchData> b;
        public final /* synthetic */ ListViewModel c;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.list.ListViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/device/WatchFaceState;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0705a extends Lambda implements Function1<WatchFaceState, Unit> {
            public final /* synthetic */ ListViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0705a(ListViewModel listViewModel) {
                super(1);
                this.a = listViewModel;
            }

            public final void a(@NotNull WatchFaceState watchFaceState) {
                this.a.getDeleteLiveData().postValue(new Success(watchFaceState));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchFaceState watchFaceState) {
                a(watchFaceState);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<WatchData> list, ListViewModel listViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = listViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
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
            List<WatchData> list = this.b;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                kotlin.collections.h.addAll(arrayList, kotlin.collections.e.listOf(Boxing.boxInt(((WatchData) it2.next()).getId())));
            }
            this.c.wfDeviceManager.deleteWatchFace(arrayList, new C0705a(this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$deleteHistoryRecords$1", f = "ListViewModel.kt", i = {0}, l = {153, 155}, m = "invokeSuspend", n = {"ids"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super State<? extends WatchFaceState>>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ List<WatchData> c;
        public final /* synthetic */ ListViewModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<WatchData> list, ListViewModel listViewModel, Continuation<? super b> continuation) {
            super(1, continuation);
            this.c = list;
            this.d = listViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends WatchFaceState>> continuation) {
            return invoke2((Continuation<? super State<WatchFaceState>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<WatchFaceState>> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<Integer> arrayList;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    arrayList = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return new Success(new WatchFaceState(WatchFaceStatus.DELETE_SUCCESS, null, 2, null));
            }
            ResultKt.throwOnFailure(obj);
            List<WatchData> list = this.c;
            arrayList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boxing.boxInt(((WatchData) it2.next()).getId()));
            }
            DeleteHistoryRecordUseCase deleteHistoryRecordUseCaseJ = this.d.j();
            String str = this.d.deviceId;
            this.a = arrayList;
            this.b = 1;
            obj = deleteHistoryRecordUseCaseJ.invoke(str, arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                return new Success(new WatchFaceState(WatchFaceStatus.DELETE_FAIL, null, 2, null));
            }
            WatchFaceStatusRepo watchFaceStatusRepo = this.d.statusRepo;
            this.a = null;
            this.b = 2;
            if (watchFaceStatusRepo.notifyUpdate(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Success(new WatchFaceState(WatchFaceStatus.DELETE_SUCCESS, null, 2, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/watchfacesstore/device/WatchFaceState;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$deleteLocalWatchFace$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super State<? extends WatchFaceState>>, Object> {
        public int a;
        public final /* synthetic */ List<WatchData> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<WatchData> list, Continuation<? super c> continuation) {
            super(1, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends WatchFaceState>> continuation) {
            return invoke2((Continuation<? super State<WatchFaceState>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<WatchFaceState>> continuation) {
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
            if (!ListViewModel.this.repo.deleteLocalWatchFaceInfo(ListViewModel.this.deviceId, this.c)) {
                return new Success(new WatchFaceState(WatchFaceStatus.DELETE_FAIL, null, 2, null));
            }
            LiveDataChannel.INSTANCE.getLocalWatchLiveData().postValue(null);
            return new Success(new WatchFaceState(WatchFaceStatus.DELETE_SUCCESS, null, 2, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getCategoryList$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, Continuation<? super d> continuation) {
            super(1, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchListBean categoryList$default = WatchFaceRepo.getCategoryList$default(ListViewModel.this.repo, ListViewModel.this.deviceId, this.c, ListViewModel.this.getPageNum(), 0, 8, null);
            ListViewModel listViewModel = ListViewModel.this;
            listViewModel.setPageNum(listViewModel.getPageNum() + 1);
            List<WatchData> data = categoryList$default.getData();
            ListViewModel.this.getCategoryTitleLiveData().postValue(categoryList$default.getCategoryName());
            return new Success(data);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getCollectList$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((e) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<WatchData> data = WatchFaceRepo.getCollectionLists$default(ListViewModel.this.repo, ListViewModel.this.deviceId, ListViewModel.this.getPageNum(), 0, 4, null).getData();
            ListViewModel listViewModel = ListViewModel.this;
            listViewModel.setPageNum(listViewModel.getPageNum() + 1);
            return new Success(data);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getCoolSpecialList$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i, Continuation<? super f> continuation) {
            super(1, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchListBean coolSpecialList = ListViewModel.this.repo.getCoolSpecialList(this.c, ListViewModel.this.deviceId);
            List<WatchData> data = coolSpecialList.getData();
            ListViewModel.this.getCategoryTitleLiveData().postValue(coolSpecialList.getCategoryName());
            return new Success(data);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getDeviceOnlineWatchFaceLists$1", f = "ListViewModel.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((g) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws HttpError {
            Object myWatchList;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(ListViewModel.this.deviceManager.getAllWatchFaceIds(), (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                WatchFaceRepo watchFaceRepo = ListViewModel.this.repo;
                String str = ListViewModel.this.deviceId;
                this.a = 1;
                myWatchList = watchFaceRepo.getMyWatchList(str, strJoinToString$default, this);
                if (myWatchList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                myWatchList = obj;
            }
            ArrayList<MyWatchFaceBean> arrayList = new ArrayList();
            for (Object obj2 : (Iterable) myWatchList) {
                if (Boxing.boxBoolean(!((MyWatchFaceBean) obj2).getOfficialBuiltin()).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (MyWatchFaceBean myWatchFaceBean : arrayList) {
                arrayList2.add(new WatchData(null, myWatchFaceBean.getBuiltinId(), myWatchFaceBean.getImage(), null, new Metas(myWatchFaceBean.getGif(), null, myWatchFaceBean.getTransparentBackground(), null, null, 26, null), null, null, null, null, myWatchFaceBean.getColor(), 1, null, null, null, null, null, null, null, null, 522729, null));
            }
            return new Success(arrayList2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getHistoryList$1", f = "ListViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object historyRecord$default;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HistoryRecordRepo historyRecordRepo = ListViewModel.this.historyRecordRepo;
                String str = ListViewModel.this.deviceId;
                int pageNum = ListViewModel.this.getPageNum();
                this.a = 1;
                historyRecord$default = HistoryRecordRepo.DefaultImpls.getHistoryRecord$default(historyRecordRepo, str, pageNum, 0, this, 4, null);
                if (historyRecord$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                historyRecord$default = obj;
            }
            Iterable<WatchData> iterable = (Iterable) historyRecord$default;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (WatchData watchData : iterable) {
                arrayList.add(watchData.copy((499575 & 1) != 0 ? watchData.customizable : null, (499575 & 2) != 0 ? watchData.id : 0, (499575 & 4) != 0 ? watchData.image : null, (499575 & 8) != 0 ? watchData.isFree : null, (499575 & 16) != 0 ? watchData.metas : null, (499575 & 32) != 0 ? watchData.name : null, (499575 & 64) != 0 ? watchData.price : null, (499575 & 128) != 0 ? watchData.rank : null, (499575 & 256) != 0 ? watchData.size : null, (499575 & 512) != 0 ? watchData.color : null, (499575 & 1024) != 0 ? watchData.status : 0, (499575 & 2048) != 0 ? watchData.dialPath : null, (499575 & 4096) != 0 ? watchData.publisherId : null, (499575 & 8192) != 0 ? watchData.currencyCode : null, (499575 & 16384) != 0 ? watchData.isPurchased : null, (499575 & 32768) != 0 ? watchData.version : null, (499575 & 65536) != 0 ? watchData.thirdPartyProductId : null, (499575 & 131072) != 0 ? watchData.skuId : null, (499575 & 262144) != 0 ? watchData.publisher : null));
            }
            ListViewModel listViewModel = ListViewModel.this;
            listViewModel.setPageNum(listViewModel.getPageNum() + 1);
            return new Success(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getLocalWatchList$1", f = "ListViewModel.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_CHESS}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((i) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceRepo watchFaceRepo = ListViewModel.this.repo;
                String str = ListViewModel.this.deviceId;
                this.a = 1;
                obj = watchFaceRepo.getLocalWatchFaceInfoList(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return new Success((List) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getNewWatchList$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(ListViewModel.this.repo.getNewWatchList(ListViewModel.this.deviceId));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getPublisherWatchList$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i, Continuation<? super k> continuation) {
            super(1, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new k(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((k) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<WatchData> data = WatchFaceRepo.getPublisherWatchList$default(ListViewModel.this.repo, this.c, ListViewModel.this.deviceId, ListViewModel.this.getPageNum(), 0, 8, null).getData();
            ListViewModel listViewModel = ListViewModel.this;
            listViewModel.setPageNum(listViewModel.getPageNum() + 1);
            return new Success(data);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.store.list.ListViewModel$getRankLists$1", f = "ListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends WatchData>>>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, Continuation<? super l> continuation) {
            super(1, continuation);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return ListViewModel.this.new l(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends WatchData>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<WatchData>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<WatchData>>> continuation) {
            return ((l) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<WatchData> data = WatchFaceRepo.getRankLists$default(ListViewModel.this.repo, ListViewModel.this.deviceId, this.c, ListViewModel.this.getPageNum(), 0, 8, null).getData();
            ListViewModel listViewModel = ListViewModel.this;
            listViewModel.setPageNum(listViewModel.getPageNum() + 1);
            return new Success(data);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListViewModel(@NotNull WatchFaceRepo watchFaceRepo, @NotNull HistoryRecordRepo historyRecordRepo, @NotNull WatchFaceStatusRepo watchFaceStatusRepo) {
        this.repo = watchFaceRepo;
        this.historyRecordRepo = historyRecordRepo;
        this.statusRepo = watchFaceStatusRepo;
        MutableLiveData<State<List<WatchData>>> mutableLiveData = new MutableLiveData<>();
        this.rankLiveData = mutableLiveData;
        this.listLiveData = new MutableLiveData<>();
        this.categoryTitleLiveData = new MutableLiveData<>();
        this.deleteLiveData = new MutableLiveData<>();
        this.pageNum = 1;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deleteHistoryRecordUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeleteHistoryRecordUseCase>() { // from class: com.huami.watchfacesstore.ui.store.list.ListViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.watchfacesstore.usecase.DeleteHistoryRecordUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeleteHistoryRecordUseCase getA() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(DeleteHistoryRecordUseCase.class), qualifier, objArr);
            }
        });
        this.headerLiveData = Transformations.switchMap(mutableLiveData, new Function() { // from class: qo4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ListViewModel.q(this.a, (State) obj);
            }
        });
        this.otherListsLiveData = Transformations.switchMap(mutableLiveData, new Function() { // from class: ro4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ListViewModel.r(this.a, (State) obj);
            }
        });
    }

    private final void c(List<WatchData> dataList) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(dataList, this, null), 2, null);
    }

    private final void e(List<WatchData> dataList) {
        startWithLoading(this.deleteLiveData, new b(dataList, this, null));
    }

    private final void f(List<WatchData> dataList) {
        startWithLoading(this.deleteLiveData, new c(dataList, null));
    }

    private final void g(int categoryId) {
        startWithLoading(this.listLiveData, new d(categoryId, null));
    }

    private final void h() {
        startWithLoading(this.listLiveData, new e(null));
    }

    private final void i(int id) {
        startWithLoading(this.listLiveData, new f(id, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeleteHistoryRecordUseCase j() {
        return (DeleteHistoryRecordUseCase) this.deleteHistoryRecordUseCase.getValue();
    }

    private final void k() {
        startWithLoading(this.listLiveData, new g(null));
    }

    private final void m() {
        startWithLoading(this.listLiveData, new h(null));
    }

    private final void n() {
        startWithLoading(this.listLiveData, new i(null));
    }

    private final void o() {
        startWithLoading(this.listLiveData, new j(null));
    }

    private final void p(int publisherId) {
        startWithLoading(this.listLiveData, new k(publisherId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData q(ListViewModel listViewModel, State state) {
        Object fail;
        List listSubList;
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (state instanceof Loading) {
            fail = new Loading();
        } else if (state instanceof Success) {
            List list = (List) ((Success) state).getValue();
            List list2 = null;
            if (listViewModel.getPageNum() == 2 && list != null && (listSubList = list.subList(0, 3)) != null) {
                Collections.swap(listSubList, 1, 2);
                list2 = listSubList;
            }
            fail = new Success(list2);
        } else {
            if (!(state instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            fail = new Fail(((Fail) state).getError());
        }
        mutableLiveData.setValue(fail);
        return mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData r(ListViewModel listViewModel, State state) {
        Object fail;
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (state instanceof Loading) {
            fail = new Loading();
        } else if (state instanceof Success) {
            List listSubList = (List) ((Success) state).getValue();
            if (listViewModel.getPageNum() == 2) {
                listSubList = listSubList == null ? null : listSubList.subList(3, listSubList.size());
            }
            fail = new Success(listSubList);
        } else {
            if (!(state instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            fail = new Fail(((Fail) state).getError());
        }
        mutableLiveData.setValue(fail);
        return mutableLiveData;
    }

    public final void deleteWatchFace(int pageMode, @NotNull List<WatchData> dataList) {
        if (pageMode == 6) {
            f(dataList);
        } else if (pageMode == 7) {
            c(dataList);
        } else {
            if (pageMode != 10) {
                return;
            }
            e(dataList);
        }
    }

    @NotNull
    public final MutableLiveData<String> getCategoryTitleLiveData() {
        return this.categoryTitleLiveData;
    }

    public final void getDataLists(int pageMode, int id) {
        switch (pageMode) {
            case 3:
                o();
                break;
            case 4:
                h();
                break;
            case 5:
                g(id);
                break;
            case 6:
                n();
                break;
            case 7:
                k();
                break;
            case 8:
                p(id);
                break;
            case 9:
                i(id);
                break;
            case 10:
                m();
                break;
        }
    }

    @NotNull
    public final MutableLiveData<State<WatchFaceState>> getDeleteLiveData() {
        return this.deleteLiveData;
    }

    @NotNull
    public final LiveData<State<List<WatchData>>> getHeaderLiveData() {
        return this.headerLiveData;
    }

    @NotNull
    public final MutableLiveData<State<List<WatchData>>> getListLiveData() {
        return this.listLiveData;
    }

    @NotNull
    public final LiveData<State<List<WatchData>>> getOtherListsLiveData() {
        return this.otherListsLiveData;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final void getRankLists(@NotNull String rankType) {
        startWithLoading(this.rankLiveData, new l(rankType, null));
    }

    public final void setPageNum(int i2) {
        this.pageNum = i2;
    }
}
