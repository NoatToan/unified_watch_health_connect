package com.huami.bloodoxygen.core.usecase.clickspo2;

import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001b\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLatestClickSpo2FlowUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "a", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "b", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "kvKey", "<init>", "(Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetLatestClickSpo2FlowUseCase {

    @NotNull
    private static final String c = "GetLatestClickSpo2FlowUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final KvKey kvKey;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetLatestClickSpo2FlowUseCase execute";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.usecase.clickspo2.GetLatestClickSpo2FlowUseCase$execute$2", f = "GetLatestClickSpo2FlowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetLatestClickSpo2FlowUseCase.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            KvKey kvKey;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            KvKey kvKey2 = GetLatestClickSpo2FlowUseCase.this.kvKey;
            if (kvKey2 == null ? false : Intrinsics.areEqual(kvKey2.getClickSpo2AllFetched(), Boxing.boxBoolean(true))) {
                return Unit.INSTANCE;
            }
            List<ClickMeasuredSpo2> listFetchClickSpo2 = GetLatestClickSpo2FlowUseCase.this.repo.fetchClickSpo2(BloodOxygen.INSTANCE.getDEFAULT_FROM(), System.currentTimeMillis(), 1, true, false, true, true);
            GetLatestClickSpo2FlowUseCase getLatestClickSpo2FlowUseCase = GetLatestClickSpo2FlowUseCase.this;
            if (listFetchClickSpo2.size() < 999 && (kvKey = getLatestClickSpo2FlowUseCase.kvKey) != null) {
                kvKey.setClickSpo2AllFetched(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    public GetLatestClickSpo2FlowUseCase(@NotNull IBloodOxygenRepo iBloodOxygenRepo, @Nullable KvKey kvKey) {
        this.repo = iBloodOxygenRepo;
        this.kvKey = kvKey;
    }

    @NotNull
    public final Flow<ClickMeasuredSpo2> execute() {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, a.a, 1, null);
        return ExtensionKt.onStartInScope(this.repo.getLocalLatestClickSpo2Flow(), new b(null));
    }

    public /* synthetic */ GetLatestClickSpo2FlowUseCase(IBloodOxygenRepo iBloodOxygenRepo, KvKey kvKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iBloodOxygenRepo, (i & 2) != 0 ? null : kvKey);
    }
}
