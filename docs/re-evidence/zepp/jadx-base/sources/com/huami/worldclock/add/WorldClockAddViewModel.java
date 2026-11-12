package com.huami.worldclock.add;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.bean.AppType;
import com.huami.worldclock.bean.WorldClockBean;
import com.huami.worldclock.bean.WorldClockCityBean;
import com.huami.worldclock.manager.TimeZonesJsonHelper;
import com.huami.worldclock.manager.WorldClockConfig;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001f\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/worldclock/add/WorldClockAddViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/worldclock/bean/AppType;", "appType", "", "setAppType", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getSupportTimeZones", "Lcom/huami/worldclock/bean/WorldClockCityBean;", LargeWatchSkinActivity.KEY_BEAN, "Lcom/huami/worldclock/add/AddWorldClockCallback;", "callback", "addNewWorldClock", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "_worldClock", "b", "_appType", "Landroidx/lifecycle/LiveData;", "getWorldClockCity", "()Landroidx/lifecycle/LiveData;", "worldClockCity", "getAppType", "<init>", "()V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class WorldClockAddViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<List<WorldClockCityBean>> _worldClock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<AppType> _appType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.add.WorldClockAddViewModel$addNewWorldClock$1", f = "WorldClockAddViewModel.kt", i = {}, l = {56, 62, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WorldClockCityBean b;
        public final /* synthetic */ AddWorldClockCallback c;

        /* JADX INFO: renamed from: com.huami.worldclock.add.WorldClockAddViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.worldclock.add.WorldClockAddViewModel$addNewWorldClock$1$1", f = "WorldClockAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0713a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AddWorldClockCallback b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0713a(AddWorldClockCallback addWorldClockCallback, Continuation<? super C0713a> continuation) {
                super(2, continuation);
                this.b = addWorldClockCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0713a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0713a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.onExceedLimit();
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.worldclock.add.WorldClockAddViewModel$addNewWorldClock$1$2", f = "WorldClockAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AddWorldClockCallback b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AddWorldClockCallback addWorldClockCallback, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = addWorldClockCallback;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
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
                this.b.onDuplicateData();
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.worldclock.add.WorldClockAddViewModel$addNewWorldClock$1$3", f = "WorldClockAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AddWorldClockCallback b;
            public final /* synthetic */ WorldClockBean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AddWorldClockCallback addWorldClockCallback, WorldClockBean worldClockBean, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = addWorldClockCallback;
                this.c = worldClockBean;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.onAddable(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WorldClockCityBean worldClockCityBean, AddWorldClockCallback addWorldClockCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = worldClockCityBean;
            this.c = addWorldClockCallback;
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
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            WorldClockConfig worldClockConfig = WorldClockConfig.INSTANCE;
            if (worldClockConfig.getLocalWorldClock().size() >= 20) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0713a c0713a = new C0713a(this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c0713a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (worldClockConfig.isContainTimeZone(this.b)) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                b bVar = new b(this.c, null);
                this.a = 2;
                if (BuildersKt.withContext(main2, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            WorldClockBean worldClockBean = new WorldClockBean(this.b.getCityCN(), this.b.getCity(), false, this.b.getIdentifier(), this.b.getCityCode(), 0, 0L, false, 228, null);
            MainCoroutineDispatcher main3 = Dispatchers.getMain();
            c cVar = new c(this.c, worldClockBean, null);
            this.a = 3;
            if (BuildersKt.withContext(main3, cVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.worldclock.add.WorldClockAddViewModel$getSupportTimeZones$1", f = "WorldClockAddViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ WorldClockAddViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, WorldClockAddViewModel worldClockAddViewModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = context;
            this.c = worldClockAddViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<WorldClockBean> listManagerTimeZonesData = TimeZonesJsonHelper.INSTANCE.managerTimeZonesData(this.b);
            if (listManagerTimeZonesData == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listManagerTimeZonesData, 10));
                for (WorldClockBean worldClockBean : listManagerTimeZonesData) {
                    arrayList2.add(new WorldClockCityBean(worldClockBean.getCityCN(), worldClockBean.getCity(), false, worldClockBean.getIdentifier(), worldClockBean.getCityCode(), 4, null));
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            this.c._worldClock.postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
            return Unit.INSTANCE;
        }
    }

    public WorldClockAddViewModel() {
        MutableLiveData<List<WorldClockCityBean>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new ArrayList());
        Unit unit = Unit.INSTANCE;
        this._worldClock = mutableLiveData;
        MutableLiveData<AppType> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(AppType.MIDONG);
        this._appType = mutableLiveData2;
    }

    public final void addNewWorldClock(@NotNull WorldClockCityBean bean, @NotNull AddWorldClockCallback callback) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(bean, callback, null), 2, null);
    }

    @NotNull
    public final LiveData<AppType> getAppType() {
        return this._appType;
    }

    public final void getSupportTimeZones(@NotNull Context context) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(context, this, null), 2, null);
    }

    @NotNull
    public final LiveData<List<WorldClockCityBean>> getWorldClockCity() {
        return this._worldClock;
    }

    public final void setAppType(@NotNull AppType appType) {
        this._appType.setValue(appType);
    }
}
