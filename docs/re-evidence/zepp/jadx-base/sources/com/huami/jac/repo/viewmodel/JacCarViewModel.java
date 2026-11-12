package com.huami.jac.repo.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.jac.repo.exception.JacExceptionHandlerApi;
import com.huami.jac.repo.repo.JacCardRepo;
import com.huami.nfc.car.entity.SupportCar;
import com.huami.nfc.car.entity.VCardInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J6\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R.\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR4\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR.\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR.\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR.\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR.\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0017\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001b¨\u00066"}, d2 = {"Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "Lcom/huami/jac/repo/viewmodel/BaseViewModel;", "", "getVCardInfo", "getSupportCarList", "", "action", "token", "keyToken", "watchId", "vin", "issueCard", "deleteCard", "isDefaultCard", "setDefaultCard", "Lcom/huami/jac/repo/repo/JacCardRepo;", "b", "Lcom/huami/jac/repo/repo/JacCardRepo;", "jacpengCardRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "Lcom/huami/nfc/car/entity/VCardInfo;", "c", "Landroidx/lifecycle/MutableLiveData;", "getCardListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setCardListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "cardListLiveData", "", "Lcom/huami/nfc/car/entity/SupportCar;", GoogleApiAvailabilityLight.a, "getSupportCarListLiveData", "setSupportCarListLiveData", "supportCarListLiveData", "e", "getDeleteCardLiveData", "setDeleteCardLiveData", "deleteCardLiveData", "f", "getIssueCardLiveData", "setIssueCardLiveData", "issueCardLiveData", "", "g", "isDefaultCardLiveData", "setDefaultCardLiveData", "h", "getSetDefaultCardLiveData", "setSetDefaultCardLiveData", "Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;", "exceptionHandler", "<init>", "(Lcom/huami/jac/repo/repo/JacCardRepo;Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;)V", "jac-repo_release"}, k = 1, mv = {1, 5, 1})
public final class JacCarViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final JacCardRepo jacpengCardRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<VCardInfo>> cardListLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<List<SupportCar>>> supportCarListLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<Unit>> deleteCardLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<Unit>> issueCardLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<Boolean>> isDefaultCardLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<State<Boolean>> setDefaultCardLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.JacCarViewModel$deleteCard$1", f = "JacCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super State<? extends Unit>>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(1, continuation);
            this.c = str;
            this.d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return JacCarViewModel.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Unit>> continuation) {
            return invoke2((Continuation<? super State<Unit>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Unit>> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(JacCarViewModel.this.jacpengCardRepo.deleteCard(this.c, this.d));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/nfc/car/entity/SupportCar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.JacCarViewModel$getSupportCarList$1", f = "JacCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super State<? extends List<SupportCar>>>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return JacCarViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super State<? extends List<SupportCar>>> continuation) {
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
            return new Success(JacCarViewModel.this.jacpengCardRepo.getSupportCarList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/nfc/car/entity/VCardInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.JacCarViewModel$getVCardInfo$1", f = "JacCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super State<? extends VCardInfo>>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return JacCarViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends VCardInfo>> continuation) {
            return invoke2((Continuation<? super State<VCardInfo>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<VCardInfo>> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(JacCarViewModel.this.jacpengCardRepo.getVCardInfo());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.JacCarViewModel$isDefaultCard$1", f = "JacCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return JacCarViewModel.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(Boxing.boxBoolean(JacCarViewModel.this.jacpengCardRepo.isDefaultCard("F060BBA2E1B8FD6B01")));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.JacCarViewModel$issueCard$1", f = "JacCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function1<Continuation<? super State<? extends Unit>>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, String str4, String str5, Continuation<? super e> continuation) {
            super(1, continuation);
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return JacCarViewModel.this.new e(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Unit>> continuation) {
            return invoke2((Continuation<? super State<Unit>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Unit>> continuation) {
            return ((e) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(JacCarViewModel.this.jacpengCardRepo.issueCard(this.c, this.d, this.e, this.f, this.g));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.jac.repo.viewmodel.JacCarViewModel$setDefaultCard$1", f = "JacCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return JacCarViewModel.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Success(Boxing.boxBoolean(JacCarViewModel.this.jacpengCardRepo.setDefaultCard("F060BBA2E1B8FD6B01")));
        }
    }

    public JacCarViewModel(@NotNull JacCardRepo jacCardRepo, @NotNull JacExceptionHandlerApi jacExceptionHandlerApi) {
        super(jacExceptionHandlerApi);
        this.jacpengCardRepo = jacCardRepo;
        this.cardListLiveData = new MutableLiveData<>();
        this.supportCarListLiveData = new MutableLiveData<>();
        this.deleteCardLiveData = new MutableLiveData<>();
        this.issueCardLiveData = new MutableLiveData<>();
        this.isDefaultCardLiveData = new MutableLiveData<>();
        this.setDefaultCardLiveData = new MutableLiveData<>();
    }

    public final void deleteCard(@Nullable String watchId, @Nullable String vin) {
        startWithLoading(this.deleteCardLiveData, new a(watchId, vin, null));
    }

    @NotNull
    public final MutableLiveData<State<VCardInfo>> getCardListLiveData() {
        return this.cardListLiveData;
    }

    @NotNull
    public final MutableLiveData<State<Unit>> getDeleteCardLiveData() {
        return this.deleteCardLiveData;
    }

    @NotNull
    public final MutableLiveData<State<Unit>> getIssueCardLiveData() {
        return this.issueCardLiveData;
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> getSetDefaultCardLiveData() {
        return this.setDefaultCardLiveData;
    }

    public final void getSupportCarList() {
        startWithLoading(this.supportCarListLiveData, new b(null));
    }

    @NotNull
    public final MutableLiveData<State<List<SupportCar>>> getSupportCarListLiveData() {
        return this.supportCarListLiveData;
    }

    public final void getVCardInfo() {
        startWithLoading(this.cardListLiveData, new c(null));
    }

    public final void isDefaultCard() {
        startWithLoading(this.isDefaultCardLiveData, new d(null));
    }

    @NotNull
    public final MutableLiveData<State<Boolean>> isDefaultCardLiveData() {
        return this.isDefaultCardLiveData;
    }

    public final void issueCard(@NotNull String action, @Nullable String token, @Nullable String keyToken, @Nullable String watchId, @Nullable String vin) {
        startWithLoading(this.issueCardLiveData, new e(action, token, keyToken, watchId, vin, null));
    }

    public final void setCardListLiveData(@NotNull MutableLiveData<State<VCardInfo>> mutableLiveData) {
        this.cardListLiveData = mutableLiveData;
    }

    public final void setDefaultCard() {
        startWithLoading(this.setDefaultCardLiveData, new f(null));
    }

    public final void setDefaultCardLiveData(@NotNull MutableLiveData<State<Boolean>> mutableLiveData) {
        this.isDefaultCardLiveData = mutableLiveData;
    }

    public final void setDeleteCardLiveData(@NotNull MutableLiveData<State<Unit>> mutableLiveData) {
        this.deleteCardLiveData = mutableLiveData;
    }

    public final void setIssueCardLiveData(@NotNull MutableLiveData<State<Unit>> mutableLiveData) {
        this.issueCardLiveData = mutableLiveData;
    }

    public final void setSetDefaultCardLiveData(@NotNull MutableLiveData<State<Boolean>> mutableLiveData) {
        this.setDefaultCardLiveData = mutableLiveData;
    }

    public final void setSupportCarListLiveData(@NotNull MutableLiveData<State<List<SupportCar>>> mutableLiveData) {
        this.supportCarListLiveData = mutableLiveData;
    }
}
