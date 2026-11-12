package com.huami.bloodoxygen.core.usecase.other;

import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/other/GetIfHistoryExistsFlowUseCase;", "", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "kvKey", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "b", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetIfHistoryExistsFlowUseCase {

    @NotNull
    private static final String c = "GetIfHistoryExistsLiveDataUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvKey kvKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u008a@"}, d2 = {"", "ifClickSpo2Exists", "ifOdiExists", "ifOsaProcessExists", "ifOsaEventExists", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.usecase.other.GetIfHistoryExistsFlowUseCase$execute$1", f = "GetIfHistoryExistsFlowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function5<Boolean, Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;
        public /* synthetic */ boolean d;
        public /* synthetic */ boolean e;

        public a(Continuation<? super a> continuation) {
            super(5, continuation);
        }

        @Nullable
        public final Object a(boolean z, boolean z2, boolean z3, boolean z4, @Nullable Continuation<? super Boolean> continuation) {
            a aVar = new a(continuation);
            aVar.b = z;
            aVar.c = z2;
            aVar.d = z3;
            aVar.e = z4;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b || this.c || this.d || this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.usecase.other.GetIfHistoryExistsFlowUseCase$execute$2", f = "GetIfHistoryExistsFlowUseCase.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetIfHistoryExistsFlowUseCase.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GetIfHistoryExistsFlowUseCase getIfHistoryExistsFlowUseCase = GetIfHistoryExistsFlowUseCase.this;
                this.a = 1;
                if (getIfHistoryExistsFlowUseCase.a(this) == coroutine_suspended) {
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
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetIfHistoryExistsLiveDataUseCase history fetched";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetIfHistoryExistsLiveDataUseCase fetch history success";
        }
    }

    public GetIfHistoryExistsFlowUseCase(@NotNull KvKey kvKey, @NotNull IBloodOxygenRepo iBloodOxygenRepo) {
        this.kvKey = kvKey;
        this.repo = iBloodOxygenRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Continuation<? super Boolean> continuation) {
        Object objM3845constructorimpl;
        if (this.kvKey.getIfHistoryExistsInited() != null) {
            PackagefunctionKt.bloodOxygenDebugLog$default(null, c.a, 1, null);
            return Boxing.boxBoolean(true);
        }
        try {
            Result.Companion companion = Result.Companion;
            IDataCacheDelegate.DefaultImpls.fetchAllTypeData$default(this.repo, BloodOxygen.INSTANCE.getDEFAULT_FROM(), System.currentTimeMillis(), 1, true, false, true, false, 64, null);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            PackagefunctionKt.bloodOxygenDebugLog$default(null, d.a, 1, null);
            this.kvKey.setIfHistoryExistsInited(Boxing.boxBoolean(true));
        }
        return Boxing.boxBoolean(Result.m3851isSuccessimpl(objM3845constructorimpl));
    }

    @NotNull
    public final Flow<Boolean> execute() {
        return FlowKt.distinctUntilChanged(ExtensionKt.onStartInScope(FlowKt.combine(this.repo.getIfLocalClickSpo2ExistsFlow(), this.repo.getIfLocalOdiExistsFlow(), this.repo.getIfLocalOsaProcessExistsFlow(), this.repo.getIfLocalOsaEventExistsFlow(), new a(null)), new b(null)));
    }
}
