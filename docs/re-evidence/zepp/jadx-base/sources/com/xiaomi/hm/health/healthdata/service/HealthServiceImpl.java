package com.xiaomi.hm.health.healthdata.service;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.Transformations;
import com.huami.health.service.HealthEntry;
import com.huami.health.service.HealthService;
import com.huami.health.service.HealthServiceType;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/service/HealthServiceImpl;", "Lcom/huami/health/service/HealthService;", "Lcom/huami/health/service/HealthServiceType;", "serviceType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/service/HealthEntry;", "loadLatestHealthData", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "a", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "getRepo", "()Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthServiceImpl implements HealthService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthCoreDataRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.service.HealthServiceImpl$loadLatestHealthData$healthDataType$1", f = "HealthServiceImpl.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                this.a = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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

    public HealthServiceImpl(@NotNull HealthCoreDataRepo healthCoreDataRepo) {
        this.repo = healthCoreDataRepo;
    }

    @NotNull
    public final HealthCoreDataRepo getRepo() {
        return this.repo;
    }

    @Override // com.huami.health.service.HealthService
    @NotNull
    public Flow<HealthEntry> loadLatestHealthData(@NotNull HealthServiceType serviceType) {
        HealthDataType healthDataTypeFind = HealthDataType.INSTANCE.find(serviceType.getType());
        return healthDataTypeFind == null ? FlowKt.flow(new a(null)) : FlowLiveDataConversions.asFlow(Transformations.map(this.repo.topByLiveData(healthDataTypeFind, 1), new Function<List<? extends UserDataEntity>, HealthEntry>() { // from class: com.xiaomi.hm.health.healthdata.service.HealthServiceImpl$loadLatestHealthData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final HealthEntry apply(List<? extends UserDataEntity> list) {
                UserDataEntity userDataEntity = (UserDataEntity) CollectionsKt.firstOrNull((List) list);
                if (userDataEntity == null) {
                    return null;
                }
                return HealthServiceImplKt.toHealthEntry(userDataEntity);
            }
        }));
    }
}
