package com.xiaomi.hm.health.running;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.running.BoltEntranceViewModel;
import com.xiaomi.hm.health.webapi.PreLaunchApi;
import com.xiaomi.hm.health.webapi.PreLaunchItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/running/BoltEntranceViewModel;", "Landroidx/lifecycle/ViewModel;", "", "", "Lcom/xiaomi/hm/health/webapi/PreLaunchItem;", "c", "a", "Ljava/lang/String;", "BOLT_PRE_LAUNCH_KEY", "b", "BOLT_STATUS_PAGE_ENTRANCE_KEY", "BOLT_STATUS_PAGE_RESOURCE_KEY", "Landroidx/lifecycle/LiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "boltStatusPageEntrance", "", "e", "getStatusPageEntranceLiveData", "()Landroidx/lifecycle/LiveData;", "statusPageEntranceLiveData", "f", "getStatusPageResourceLiveData", "statusPageResourceLiveData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BoltEntranceViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String BOLT_PRE_LAUNCH_KEY = HMBoltClassicDevice.NAME_BOLT;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String BOLT_STATUS_PAGE_ENTRANCE_KEY = "bolt_status_entrance";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String BOLT_STATUS_PAGE_RESOURCE_KEY = "bolt_status_resource";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Map<String, PreLaunchItem>> boltStatusPageEntrance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> statusPageEntranceLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> statusPageResourceLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "Lcom/xiaomi/hm/health/webapi/PreLaunchItem;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.running.BoltEntranceViewModel$boltStatusPageEntrance$1", f = "BoltEntranceViewModel.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<LiveDataScope<Map<String, ? extends PreLaunchItem>>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<Map<String, PreLaunchItem>> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = BoltEntranceViewModel.this.new a(continuation);
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
                Map mapC = BoltEntranceViewModel.this.c();
                this.a = 1;
                if (liveDataScope.emit(mapC, this) == coroutine_suspended) {
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

    public BoltEntranceViewModel() {
        LiveData<Map<String, PreLaunchItem>> liveDataLiveData$default = CoroutineLiveDataKt.liveData$default(ViewModelKt.getViewModelScope(this).getCoroutineContext().plus(Dispatchers.getIO()), 0L, new a(null), 2, (Object) null);
        this.boltStatusPageEntrance = liveDataLiveData$default;
        this.statusPageEntranceLiveData = Transformations.map(liveDataLiveData$default, new Function() { // from class: i40
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return BoltEntranceViewModel.e(this.a, (Map) obj);
            }
        });
        this.statusPageResourceLiveData = Transformations.map(liveDataLiveData$default, new Function() { // from class: h40
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return BoltEntranceViewModel.f(this.a, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, PreLaunchItem> c() {
        return PreLaunchApi.INSTANCE.getPreLaunch(this.BOLT_PRE_LAUNCH_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(BoltEntranceViewModel boltEntranceViewModel, Map map) {
        PreLaunchItem preLaunchItem = (PreLaunchItem) map.get(boltEntranceViewModel.BOLT_STATUS_PAGE_ENTRANCE_KEY);
        return Boolean.valueOf(preLaunchItem == null ? true : preLaunchItem.isOn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(BoltEntranceViewModel boltEntranceViewModel, Map map) {
        PreLaunchItem preLaunchItem;
        String value;
        PreLaunchItem preLaunchItem2 = (PreLaunchItem) map.get(boltEntranceViewModel.BOLT_STATUS_PAGE_ENTRANCE_KEY);
        boolean z = false;
        if (preLaunchItem2 != null && preLaunchItem2.isOn()) {
            z = true;
        }
        return (!z || (preLaunchItem = (PreLaunchItem) map.get(boltEntranceViewModel.BOLT_STATUS_PAGE_RESOURCE_KEY)) == null || (value = preLaunchItem.getValue()) == null) ? "" : value;
    }

    @NotNull
    public final LiveData<Boolean> getStatusPageEntranceLiveData() {
        return this.statusPageEntranceLiveData;
    }

    @NotNull
    public final LiveData<String> getStatusPageResourceLiveData() {
        return this.statusPageResourceLiveData;
    }
}
