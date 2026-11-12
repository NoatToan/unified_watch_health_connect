package com.huami.bloodoxygen.core.usecase.clickspo2;

import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.ResourceKt;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetReverseClickSpo2UseCase;", "", "", "from", "to", "", "limit", "Lcom/huami/bigdata/statistics/core/resource/Resource;", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", Constant.METHOD_EXECUTE, "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "a", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "b", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "kvKey", "<init>", "(Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetReverseClickSpo2UseCase {

    @NotNull
    private static final String c = "GetReverseClickSpo2UseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final KvKey kvKey;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, int i) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetReverseClickSpo2UseCase execute " + this.a + " " + this.b + " " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.core.usecase.clickspo2.GetReverseClickSpo2UseCase$execute$3", f = "GetReverseClickSpo2UseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super List<? extends ClickMeasuredSpo2>>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2, int i, Continuation<? super b> continuation) {
            super(1, continuation);
            this.c = j;
            this.d = j2;
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return GetReverseClickSpo2UseCase.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ClickMeasuredSpo2>> continuation) {
            return invoke2((Continuation<? super List<ClickMeasuredSpo2>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super List<ClickMeasuredSpo2>> continuation) {
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
            KvKey kvKey = GetReverseClickSpo2UseCase.this.kvKey;
            List<ClickMeasuredSpo2> listReversed = kvKey == null ? false : Intrinsics.areEqual(kvKey.getClickSpo2AllFetched(), Boxing.boxBoolean(true)) ? CollectionsKt___CollectionsKt.reversed(GetReverseClickSpo2UseCase.this.repo.getLocalClickSpo2s(this.c, this.d)) : GetReverseClickSpo2UseCase.this.repo.fetchClickSpo2(this.c, this.d, this.e, true, false, true, true);
            int size = listReversed.size();
            int i = this.e;
            return size >= i ? listReversed.subList(0, i) : listReversed;
        }
    }

    public GetReverseClickSpo2UseCase(@NotNull IBloodOxygenRepo iBloodOxygenRepo, @Nullable KvKey kvKey) {
        this.repo = iBloodOxygenRepo;
        this.kvKey = kvKey;
    }

    @Nullable
    public final Object execute(long j, long j2, int i, @NotNull Continuation<? super Resource<List<ClickMeasuredSpo2>>> continuation) {
        HMLog.info$default(null, new a(j, j2, i), 1, null);
        return ResourceKt.mapToResource(new b(j, j2, i, null), continuation);
    }

    public /* synthetic */ GetReverseClickSpo2UseCase(IBloodOxygenRepo iBloodOxygenRepo, KvKey kvKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iBloodOxygenRepo, (i & 2) != 0 ? null : kvKey);
    }
}
