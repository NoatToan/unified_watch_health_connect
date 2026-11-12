package com.huami.bloodoxygen.core.usecase.odi;

import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.ResourceKt;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/odi/GetDateOdiUseCase;", "", "", "timestamp", "Lcom/huami/bigdata/statistics/core/resource/Resource;", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", Constant.METHOD_EXECUTE, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "a", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetDateOdiUseCase {

    @NotNull
    private static final String b = "GetDateOdiUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetDateOdiUseCase execute " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.usecase.odi.GetDateOdiUseCase$execute$3", f = "GetDateOdiUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super Odi>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, Continuation<? super b> continuation) {
            super(1, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return GetDateOdiUseCase.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Odi> continuation) {
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
            return CollectionsKt.firstOrNull(IDataCacheDelegate.DefaultImpls.fetchOdi$default(GetDateOdiUseCase.this.repo, ExtensionKt.toZeroTimestamp(this.c), ExtensionKt.toLastTimestamp(this.c), 0, false, false, false, false, 124, null));
        }
    }

    public GetDateOdiUseCase(@NotNull IBloodOxygenRepo iBloodOxygenRepo) {
        this.repo = iBloodOxygenRepo;
    }

    @Nullable
    public final Object execute(long j, @NotNull Continuation<? super Resource<Odi>> continuation) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, new a(j), 1, null);
        return ResourceKt.mapToResource(new b(j, null), continuation);
    }
}
