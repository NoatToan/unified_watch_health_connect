package com.huami.watch.companion.ecg.arch;

import android.app.Application;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.ecg.arch.EcgListViewModel;
import com.huami.watch.companion.ecg.model.EcgSection;
import com.loc.z;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J;\u0010\n\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ,\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00020\u0012R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 R\"\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0#0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0#0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\"8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u00104R\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/huami/watch/companion/ecg/arch/EcgListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", "m", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "func", GoogleApiAvailabilityLight.b, "(Lkotlin/jvm/functions/Function2;)V", "", WebAPI.PARAM_IS_REFRESH, "loadData", "Lcom/huami/ecg/core/db/entity/EcgData;", "ecgData", "isSnapshot", "Lkotlin/Function1;", "Lcom/huami/ecg/core/model/FilterRecord;", "callback", "loadFilterRecord", "Lcom/huami/ecg/EcgDataRepo;", "a", "Lkotlin/Lazy;", z.j, "()Lcom/huami/ecg/EcgDataRepo;", "mEcgRepo", "Landroidx/lifecycle/MutableLiveData;", "", "b", hl.k, "()Landroidx/lifecycle/MutableLiveData;", "mListSizeData", "Landroidx/lifecycle/LiveData;", "", "c", "Landroidx/lifecycle/LiveData;", "ecgList", "Lcom/huami/ecg/core/db/entity/EcgTag;", GoogleApiAvailabilityLight.a, "ecgTagList", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/huami/watch/companion/ecg/model/EcgSection;", "e", "Landroidx/lifecycle/MediatorLiveData;", "getEcgSectionLiveData", "()Landroidx/lifecycle/MediatorLiveData;", "ecgSectionLiveData", "f", "getEcgLatestLiveData", "()Landroidx/lifecycle/LiveData;", "ecgLatestLiveData", "g", "Landroidx/lifecycle/MutableLiveData;", "getHasMoreData", "hasMoreData", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgListViewModel extends AndroidViewModel {
    private static final int h = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcgRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mListSizeData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<EcgData>> ecgList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<EcgTag>> ecgTagList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<List<EcgSection>> ecgSectionLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<EcgData> ecgLatestLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> hasMoreData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgListViewModel$loadData$1", f = "EcgListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ EcgListViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, EcgListViewModel ecgListViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = ecgListViewModel;
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
            EcgData ecgData;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            int size = 10;
            if (this.b) {
                this.c.j().refreshTags();
            } else {
                List list = (List) this.c.ecgList.getValue();
                size = 10 + (list == null ? 0 : list.size());
            }
            String currentUid = AccountManager.getDefault(this.c.getApplication()).getCurrentUid();
            List list2 = (List) this.c.ecgList.getValue();
            Long lBoxLong = null;
            if (list2 != null && (ecgData = (EcgData) CollectionsKt.lastOrNull(list2)) != null) {
                lBoxLong = Boxing.boxLong(ecgData.getTimestamp());
            }
            boolean zLoadFromNetSaveIgnore = this.c.j().loadFromNetSaveIgnore(0L, (lBoxLong == null ? System.currentTimeMillis() / ((long) 1000) : lBoxLong.longValue()) - 1, 10, currentUid, false);
            int ecgCount = this.c.j().getEcgCount();
            MutableLiveData<Boolean> hasMoreData = this.c.getHasMoreData();
            if (zLoadFromNetSaveIgnore && ecgCount > 0 && ecgCount >= size) {
                z = true;
            }
            hasMoreData.postValue(Boxing.boxBoolean(z));
            this.c.k().postValue(Boxing.boxInt(size));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgListViewModel$loadFilterRecord$1", f = "EcgListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EcgData c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Function1<FilterRecord, Unit> e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgListViewModel$loadFilterRecord$1$1", f = "EcgListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<FilterRecord, Unit> b;
            public final /* synthetic */ FilterRecord c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super FilterRecord, Unit> function1, FilterRecord filterRecord, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = filterRecord;
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
                this.b.invoke(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(EcgData ecgData, boolean z, Function1<? super FilterRecord, Unit> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = ecgData;
            this.d = z;
            this.e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EcgListViewModel.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.e.f(CoroutineScopeKt.MainScope(), null, null, new a(this.e, EcgListViewModel.this.j().getFilterRecord(this.c, this.d, true), null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/ecg/EcgDataRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EcgDataRepo> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgDataRepo invoke() {
            return new EcgDataRepo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watch.companion.ecg.arch.EcgListViewModel$safeLaunch$1", f = "EcgListViewModel.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(this.c, continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.c;
                this.a = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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

    public EcgListViewModel(@NotNull Application application) {
        super(application);
        this.mEcgRepo = LazyKt__LazyJVMKt.lazy(c.a);
        this.mListSizeData = LazyKt__LazyJVMKt.lazy(d.a);
        LiveData<List<EcgData>> liveDataSwitchMap = Transformations.switchMap(k(), new Function() { // from class: dh1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EcgListViewModel.h(this.a, (Integer) obj);
            }
        });
        this.ecgList = liveDataSwitchMap;
        LiveData<List<EcgTag>> liveDataSwitchMap2 = Transformations.switchMap(liveDataSwitchMap, new Function() { // from class: eh1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return EcgListViewModel.i(this.a, (List) obj);
            }
        });
        this.ecgTagList = liveDataSwitchMap2;
        MediatorLiveData<List<EcgSection>> mediatorLiveData = new MediatorLiveData<>();
        this.ecgSectionLiveData = mediatorLiveData;
        this.ecgLatestLiveData = EcgDataRepo.getLatestEcgData$default(j(), null, 1, null);
        this.hasMoreData = new MutableLiveData<>();
        mediatorLiveData.addSource(liveDataSwitchMap2, new Observer() { // from class: fh1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgListViewModel.f(this.a, (List) obj);
            }
        });
        mediatorLiveData.addSource(liveDataSwitchMap, new Observer() { // from class: gh1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgListViewModel.g(this.a, (List) obj);
            }
        });
        loadData(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EcgListViewModel ecgListViewModel, List list) {
        ecgListViewModel.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EcgListViewModel ecgListViewModel, List list) {
        ecgListViewModel.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData h(EcgListViewModel ecgListViewModel, Integer num) {
        return EcgDataRepo.loadData$default(ecgListViewModel.j(), 0, num == null ? 0 : num.intValue(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData i(EcgListViewModel ecgListViewModel, List list) {
        List<Long> listEmptyList;
        EcgDataRepo ecgDataRepoJ = ecgListViewModel.j();
        if (list == null) {
            listEmptyList = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((EcgData) it2.next()).getTimestamp()));
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return ecgDataRepoJ.loadTagsData(listEmptyList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgDataRepo j() {
        return (EcgDataRepo) this.mEcgRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<Integer> k() {
        return (MutableLiveData) this.mListSizeData.getValue();
    }

    private final void m() {
        n(new EcgListViewModel$refreshEcgSection$1(this, null));
    }

    private final void n(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> func) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(func, null), 2, null);
    }

    @NotNull
    public final LiveData<EcgData> getEcgLatestLiveData() {
        return this.ecgLatestLiveData;
    }

    @NotNull
    public final MediatorLiveData<List<EcgSection>> getEcgSectionLiveData() {
        return this.ecgSectionLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHasMoreData() {
        return this.hasMoreData;
    }

    public final void loadData(boolean isRefresh) {
        n(new a(isRefresh, this, null));
    }

    public final void loadFilterRecord(@NotNull EcgData ecgData, boolean isSnapshot, @NotNull Function1<? super FilterRecord, Unit> callback) {
        n(new b(ecgData, isSnapshot, callback, null));
    }
}
