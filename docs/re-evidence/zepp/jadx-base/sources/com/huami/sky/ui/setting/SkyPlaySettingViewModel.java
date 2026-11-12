package com.huami.sky.ui.setting;

import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.repo.settings.IPlaySettingRepo;
import com.huami.sky.ui.koin.SkyServiceKoinScopeKt;
import com.huami.sky.ui.play.SkyPlayServiceHelper;
import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0012\u0010\u0018R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/sky/ui/setting/SkyPlaySettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "minutes", "", "setPlayDuration", "Lkotlinx/coroutines/flow/Flow;", "getPlayDuration", "", "isSmartClose", "setSmartPLayClose", "observerPlayTimeChange", "Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;", "a", "Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;", "playSettingRepoImp", "Lcom/huami/sky/lib/api/DeviceDataApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/sky/lib/api/DeviceDataApi;", "deviceDataApi", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "c", "()Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "serviceHelper", "Landroidx/lifecycle/LiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "isSmartCloseVisible", "()Landroidx/lifecycle/LiveData;", "<init>", "(Lcom/huami/sky/lib/repo/settings/IPlaySettingRepo;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlaySettingViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IPlaySettingRepo playSettingRepoImp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceDataApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy serviceHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> isSmartCloseVisible;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.setting.SkyPlaySettingViewModel$isSmartCloseVisible$1", f = "SkyPlaySettingViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<Boolean> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = SkyPlaySettingViewModel.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.b;
                Boolean boolBoxBoolean = Boxing.boxBoolean(SkyPlaySettingViewModel.this.a().isSupportSleepNotify());
                this.a = 1;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setPlayDuration: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setSmartPLayClose: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkyPlaySettingViewModel(@NotNull IPlaySettingRepo iPlaySettingRepo) {
        this.playSettingRepoImp = iPlaySettingRepo;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceDataApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceDataApi>() { // from class: com.huami.sky.ui.setting.SkyPlaySettingViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.lib.api.DeviceDataApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceDataApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceDataApi.class), qualifier, objArr);
            }
        });
        final Scope scopeSkyServiceScope = SkyServiceKoinScopeKt.skyServiceScope(getKoin());
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.serviceHelper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyPlayServiceHelper>() { // from class: com.huami.sky.ui.setting.SkyPlaySettingViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.sky.ui.play.SkyPlayServiceHelper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyPlayServiceHelper invoke() {
                return scopeSkyServiceScope.get(Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), objArr2, objArr3);
            }
        });
        this.isSmartCloseVisible = CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, new a(null), 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceDataApi a() {
        return (DeviceDataApi) this.deviceDataApi.getValue();
    }

    private final SkyPlayServiceHelper b() {
        return (SkyPlayServiceHelper) this.serviceHelper.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final Flow<Integer> getPlayDuration() {
        return this.playSettingRepoImp.getPlayDuration();
    }

    @NotNull
    public final Flow<Boolean> isSmartClose() {
        return this.playSettingRepoImp.isSmartClose();
    }

    @NotNull
    public final LiveData<Boolean> isSmartCloseVisible() {
        return this.isSmartCloseVisible;
    }

    @NotNull
    public final Flow<Integer> observerPlayTimeChange() {
        return b().getCountDownTimeChangeFlow();
    }

    public final void setPlayDuration(int minutes) {
        HMLog.info("SkyPlaySettingViewModel", new b(minutes));
        this.playSettingRepoImp.setPlayDuration(minutes);
    }

    public final void setSmartPLayClose(boolean isSmartClose) {
        HMLog.info("SkyPlaySettingViewModel", new c(isSmartClose));
        this.playSettingRepoImp.setSmartPLayClose(isSmartClose);
    }
}
