package com.huami.health.afppg.usecase;

import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.health.afppg.utils.PPGExtensionsKt;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/health/afppg/usecase/GetAfibListUseCase;", "", "", "timeFrom", "timeTo", "", "limit", "Lkotlin/Function1;", "", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "", "onFinished", Constant.METHOD_EXECUTE, "Lcom/huami/health/afppg/usecase/GetAFibEventsUseCase;", "a", "Lcom/huami/health/afppg/usecase/GetAFibEventsUseCase;", "eventsUseCase", "Lcom/huami/health/afppg/PpgCoroutineScope;", "b", "Lcom/huami/health/afppg/PpgCoroutineScope;", "scope", "<init>", "(Lcom/huami/health/afppg/usecase/GetAFibEventsUseCase;Lcom/huami/health/afppg/PpgCoroutineScope;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class GetAfibListUseCase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long c = 60;
    private static final long d = 1000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetAFibEventsUseCase eventsUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PpgCoroutineScope scope;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/health/afppg/usecase/GetAfibListUseCase$Companion;", "", "", "", "duration", "convertToEndTime", "TIME_UNIT_MILLISECOND", "J", "TIME_UNIT_SECOND", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long convertToEndTime(long j, int i) {
            return j + (((long) i) * 60 * 1000);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.health.afppg.usecase.GetAfibListUseCase$execute$1", f = "GetAfibListUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<List<AtrialFibrillation>, Unit> b;
        public final /* synthetic */ GetAfibListUseCase c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super List<AtrialFibrillation>, Unit> function1, GetAfibListUseCase getAfibListUseCase, long j, long j2, int i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = getAfibListUseCase;
            this.d = j;
            this.e = j2;
            this.f = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, this.f, continuation);
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
            this.b.invoke(this.c.eventsUseCase.queryHREvents(PPGExtensionsKt.timestampToYMDHMSChinaLocale$default(this.d, null, 2, null), PPGExtensionsKt.timestampToYMDHMSChinaLocale$default(this.e, null, 2, null), this.f, new ArrayList()));
            return Unit.INSTANCE;
        }
    }

    public GetAfibListUseCase(@NotNull GetAFibEventsUseCase getAFibEventsUseCase, @NotNull PpgCoroutineScope ppgCoroutineScope) {
        this.eventsUseCase = getAFibEventsUseCase;
        this.scope = ppgCoroutineScope;
    }

    public final void execute(long timeFrom, long timeTo, int limit, @NotNull Function1<? super List<AtrialFibrillation>, Unit> onFinished) {
        e.f(this.scope, null, null, new a(onFinished, this, timeFrom, timeTo, limit, null), 3, null);
    }
}
