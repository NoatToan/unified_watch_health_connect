package com.huami.health.afppg.usecase;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.data.remote.dto.UserEvents;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/health/afppg/usecase/GetAllEventsUseCase;", "", "", "timeNext", "", "queryDataFromServer", "(Ljava/lang/Long;)V", "Lcom/huami/health/afppg/repository/PPGRepository;", "a", "Lcom/huami/health/afppg/repository/PPGRepository;", "ppgRepository", "Lcom/huami/health/afppg/PpgCoroutineScope;", "b", "Lcom/huami/health/afppg/PpgCoroutineScope;", "scope", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/health/afppg/data/remote/dto/UserEvents;", "c", "Landroidx/lifecycle/MutableLiveData;", "_liveData", "Landroidx/lifecycle/LiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "getHrEventsData", "()Landroidx/lifecycle/LiveData;", "hrEventsData", "<init>", "(Lcom/huami/health/afppg/repository/PPGRepository;Lcom/huami/health/afppg/PpgCoroutineScope;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class GetAllEventsUseCase {

    @NotNull
    private static final String e = "af_ppg_GetAllEventsService";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PPGRepository ppgRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PpgCoroutineScope scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<UserEvents> _liveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<UserEvents> hrEventsData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.health.afppg.usecase.GetAllEventsUseCase$queryDataFromServer$1", f = "GetAllEventsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Long c;

        /* JADX INFO: renamed from: com.huami.health.afppg.usecase.GetAllEventsUseCase$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0431a extends Lambda implements Function0<String> {
            public final /* synthetic */ UserEvents a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0431a(UserEvents userEvents) {
                super(0);
                this.a = userEvents;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "queryDataFromServer size: " + this.a.getItems().size() + ", ";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetAllEventsUseCase.this.new a(this.c, continuation);
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
            UserEvents hREventFromServer = GetAllEventsUseCase.this.ppgRepository.getHREventFromServer(this.c, 10);
            GetAllEventsUseCase getAllEventsUseCase = GetAllEventsUseCase.this;
            HMLog.info(GetAllEventsUseCase.e, new C0431a(hREventFromServer));
            getAllEventsUseCase._liveData.postValue(hREventFromServer);
            return Unit.INSTANCE;
        }
    }

    public GetAllEventsUseCase(@NotNull PPGRepository pPGRepository, @NotNull PpgCoroutineScope ppgCoroutineScope) {
        this.ppgRepository = pPGRepository;
        this.scope = ppgCoroutineScope;
        MutableLiveData<UserEvents> mutableLiveData = new MutableLiveData<>();
        this._liveData = mutableLiveData;
        this.hrEventsData = mutableLiveData;
    }

    @NotNull
    public final LiveData<UserEvents> getHrEventsData() {
        return this.hrEventsData;
    }

    public final void queryDataFromServer(@Nullable Long timeNext) {
        e.f(this.scope, null, null, new a(timeNext, null), 3, null);
    }
}
