package com.xiaomi.hm.health.device.amazfit_watch;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.bind.PhoneBindActivity;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u0010J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0014j\b\u0012\u0004\u0012\u00020\u0007`\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR)\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/amazfit_watch/SupportWatchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "h", "g", "f", "", PhoneBindActivity.EXTRA_BIND_TYPE, "", "e", "", "url", "Lcom/xiaomi/hm/health/device/amazfit_watch/SupportWatchItem;", "a", "onCleared", "Landroidx/lifecycle/MutableLiveData;", "", "getSupportItems", "isWearCompanionDevice", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "preSupportWatch", "", "b", "Ljava/util/Map;", "preSupportMap", "Lkotlinx/coroutines/CompletableJob;", "c", "Lkotlinx/coroutines/CompletableJob;", "viewModelJob", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "supportWatches", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SupportWatchViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> preSupportWatch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Boolean> preSupportMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CompletableJob viewModelJob;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportWatches;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.amazfit_watch.SupportWatchViewModel$loadSupportItems$1", f = "SupportWatchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.amazfit_watch.SupportWatchViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.amazfit_watch.SupportWatchViewModel$loadSupportItems$1$1", f = "SupportWatchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0799a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SupportWatchViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0799a(SupportWatchViewModel supportWatchViewModel, Continuation<? super C0799a> continuation) {
                super(2, continuation);
                this.b = supportWatchViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0799a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0799a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.f();
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SupportWatchViewModel.this.new a(continuation);
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
            e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new C0799a(SupportWatchViewModel.this, null), 2, null);
            SupportWatchViewModel.this.g();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/device/amazfit_watch/SupportWatchItem;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<List<? extends SupportWatchItem>>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<SupportWatchItem>> getA() {
            return new MutableLiveData<>();
        }
    }

    public SupportWatchViewModel() {
        this.preSupportWatch = GlobalConfig.get().isBuildMidong() ? CollectionsKt__CollectionsKt.arrayListOf(27, 26, 21, 22, 19, 21, 13, 12, 11, 17, 10, 8, 7, 15, 14, 16) : CollectionsKt__CollectionsKt.arrayListOf(8, 7, 10);
        Boolean bool = Boolean.TRUE;
        this.preSupportMap = r.mapOf(TuplesKt.to(27, bool), TuplesKt.to(23, Boolean.FALSE), TuplesKt.to(21, bool), TuplesKt.to(19, Boolean.valueOf(GlobalConfig.get().isBuildMidong())), TuplesKt.to(22, bool), TuplesKt.to(13, bool), TuplesKt.to(12, bool), TuplesKt.to(8, bool), TuplesKt.to(7, bool), TuplesKt.to(11, bool), TuplesKt.to(10, bool), TuplesKt.to(16, Boolean.valueOf(GlobalConfig.get().isBuildMidong())), TuplesKt.to(14, Boolean.valueOf(GlobalConfig.get().isBuildMidong())), TuplesKt.to(15, Boolean.valueOf(GlobalConfig.get().isBuildMidong())), TuplesKt.to(17, Boolean.valueOf(GlobalConfig.get().isBuildMidong())), TuplesKt.to(26, bool));
        this.viewModelJob = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        this.supportWatches = LazyKt__LazyJVMKt.lazy(b.a);
        h();
    }

    private final SupportWatchItem a(int bindType, String url) {
        String string;
        boolean z = Language.isSimplifiedChinese() || Language.isTraditionalChinese();
        boolean z2 = bindType == 17;
        BindServiceApi bindServiceApi = (BindServiceApi) getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(BindServiceApi.class), null, null);
        if (z2 && z) {
            string = bindServiceApi.getWatchName(bindType) + " " + DeviceXFunctionsKt.getContext().getString(R.string.series);
        } else {
            string = z2 ? DeviceXFunctionsKt.getContext().getString(R.string.xihu_name_for_bind) : BindWatchUtils.INSTANCE.getWatchName(bindType);
        }
        String str = string;
        return url != null ? new SupportWatchItem(bindType, str, null, url, 4, null) : new SupportWatchItem(bindType, str, BindWatchUtils.INSTANCE.getWatchIcon(bindType), null, 8, null);
    }

    public static /* synthetic */ SupportWatchItem b(SupportWatchViewModel supportWatchViewModel, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return supportWatchViewModel.a(i, str);
    }

    private final MutableLiveData<List<SupportWatchItem>> c() {
        return (MutableLiveData) this.supportWatches.getValue();
    }

    private final boolean e(int bindType) {
        Boolean bool = this.preSupportMap.get(Integer.valueOf(bindType));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        MutableLiveData<List<SupportWatchItem>> mutableLiveDataC = c();
        ArrayList<Integer> arrayList = this.preSupportWatch;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (e(((Number) obj).intValue())) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(b(this, ((Number) it2.next()).intValue(), null, 2, null));
        }
        mutableLiveDataC.setValue(arrayList3);
    }

    private final void h() {
        e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new a(null), 2, null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<List<SupportWatchItem>> getSupportItems() {
        return c();
    }

    public final boolean isWearCompanionDevice(int bindType) {
        return bindType == 16 || bindType == 14 || bindType == 15 || bindType == 17 || bindType == 13;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Job.DefaultImpls.cancel$default((Job) this.viewModelJob, (CancellationException) null, 1, (Object) null);
    }
}
