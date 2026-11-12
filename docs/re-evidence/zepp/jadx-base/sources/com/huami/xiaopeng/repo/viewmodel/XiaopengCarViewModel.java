package com.huami.xiaopeng.repo.viewmodel;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.nfc.car.entity.VCardInfo;
import com.huami.wallet.common.util.SingleLiveEvent;
import com.huami.xiaopeng.repo.exception.XpExceptionHandlerApi;
import com.huami.xiaopeng.repo.repo.XiaopengCardRepo;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR.\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R.\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R.\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R.\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018¨\u0006-"}, d2 = {"Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "Lcom/huami/xiaopeng/repo/viewmodel/BaseViewModel;", "", "getVCardInfo", "", "action", "token", "keyToken", "issueCard", "deleteCard", "isDefaultCard", "setDefaultCard", "Lcom/huami/xiaopeng/repo/repo/XiaopengCardRepo;", "b", "Lcom/huami/xiaopeng/repo/repo/XiaopengCardRepo;", "xiaopengCardRepo", "Lcom/huami/wallet/common/util/SingleLiveEvent;", "Lcom/huami/arch/core/State;", "Lcom/huami/nfc/car/entity/VCardInfo;", "c", "Lcom/huami/wallet/common/util/SingleLiveEvent;", "getCardListLiveData", "()Lcom/huami/wallet/common/util/SingleLiveEvent;", "setCardListLiveData", "(Lcom/huami/wallet/common/util/SingleLiveEvent;)V", "cardListLiveData", GoogleApiAvailabilityLight.a, "getDeleteCardLiveData", "setDeleteCardLiveData", "deleteCardLiveData", "e", "getIssueCardLiveData", "setIssueCardLiveData", "issueCardLiveData", "", "f", "isDefaultCardLiveData", "setDefaultCardLiveData", "g", "getSetDefaultCardLiveData", "setSetDefaultCardLiveData", "Lcom/huami/xiaopeng/repo/exception/XpExceptionHandlerApi;", "exceptionHandler", "<init>", "(Lcom/huami/xiaopeng/repo/repo/XiaopengCardRepo;Lcom/huami/xiaopeng/repo/exception/XpExceptionHandlerApi;)V", "xiaopeng-repo_release"}, k = 1, mv = {1, 5, 1})
public final class XiaopengCarViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final XiaopengCardRepo xiaopengCardRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private SingleLiveEvent<State<VCardInfo>> cardListLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private SingleLiveEvent<State<Unit>> deleteCardLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private SingleLiveEvent<State<Unit>> issueCardLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private SingleLiveEvent<State<Boolean>> isDefaultCardLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private SingleLiveEvent<State<Boolean>> setDefaultCardLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel$deleteCard$1", f = "XiaopengCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super State<? extends Unit>>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return XiaopengCarViewModel.this.new a(continuation);
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
            return new Success(XiaopengCarViewModel.this.xiaopengCardRepo.deleteCard());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/nfc/car/entity/VCardInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel$getVCardInfo$1", f = "XiaopengCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super State<? extends VCardInfo>>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return XiaopengCarViewModel.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends VCardInfo>> continuation) {
            return invoke2((Continuation<? super State<VCardInfo>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<VCardInfo>> continuation) {
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
            return new Success(XiaopengCarViewModel.this.xiaopengCardRepo.getVCardInfo());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel$isDefaultCard$1", f = "XiaopengCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return XiaopengCarViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
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
            return new Success(Boxing.boxBoolean(XiaopengCarViewModel.this.xiaopengCardRepo.isDefaultCard("D2760001185347410002")));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel$issueCard$1", f = "XiaopengCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super State<? extends Unit>>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, Continuation<? super d> continuation) {
            super(1, continuation);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return XiaopengCarViewModel.this.new d(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Unit>> continuation) {
            return invoke2((Continuation<? super State<Unit>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Unit>> continuation) {
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
            return new Success(XiaopengCarViewModel.this.xiaopengCardRepo.issueCard(this.c, this.d, this.e));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel$setDefaultCard$1", f = "XiaopengCarViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function1<Continuation<? super State<? extends Boolean>>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return XiaopengCarViewModel.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super State<Boolean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Boolean>> continuation) {
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
            return new Success(Boxing.boxBoolean(XiaopengCarViewModel.this.xiaopengCardRepo.setDefaultCard("D2760001185347410002")));
        }
    }

    public XiaopengCarViewModel(@NotNull XiaopengCardRepo xiaopengCardRepo, @NotNull XpExceptionHandlerApi xpExceptionHandlerApi) {
        super(xpExceptionHandlerApi);
        this.xiaopengCardRepo = xiaopengCardRepo;
        this.cardListLiveData = new SingleLiveEvent<>();
        this.deleteCardLiveData = new SingleLiveEvent<>();
        this.issueCardLiveData = new SingleLiveEvent<>();
        this.isDefaultCardLiveData = new SingleLiveEvent<>();
        this.setDefaultCardLiveData = new SingleLiveEvent<>();
    }

    public final void deleteCard() {
        startWithLoading(this.deleteCardLiveData, new a(null));
    }

    @NotNull
    public final SingleLiveEvent<State<VCardInfo>> getCardListLiveData() {
        return this.cardListLiveData;
    }

    @NotNull
    public final SingleLiveEvent<State<Unit>> getDeleteCardLiveData() {
        return this.deleteCardLiveData;
    }

    @NotNull
    public final SingleLiveEvent<State<Unit>> getIssueCardLiveData() {
        return this.issueCardLiveData;
    }

    @NotNull
    public final SingleLiveEvent<State<Boolean>> getSetDefaultCardLiveData() {
        return this.setDefaultCardLiveData;
    }

    public final void getVCardInfo() {
        startWithLoading(this.cardListLiveData, new b(null));
    }

    public final void isDefaultCard() {
        startWithLoading(this.isDefaultCardLiveData, new c(null));
    }

    @NotNull
    public final SingleLiveEvent<State<Boolean>> isDefaultCardLiveData() {
        return this.isDefaultCardLiveData;
    }

    public final void issueCard(@NotNull String action, @Nullable String token, @Nullable String keyToken) {
        startWithLoading(this.issueCardLiveData, new d(action, token, keyToken, null));
    }

    public final void setCardListLiveData(@NotNull SingleLiveEvent<State<VCardInfo>> singleLiveEvent) {
        this.cardListLiveData = singleLiveEvent;
    }

    public final void setDefaultCard() {
        startWithLoading(this.setDefaultCardLiveData, new e(null));
    }

    public final void setDefaultCardLiveData(@NotNull SingleLiveEvent<State<Boolean>> singleLiveEvent) {
        this.isDefaultCardLiveData = singleLiveEvent;
    }

    public final void setDeleteCardLiveData(@NotNull SingleLiveEvent<State<Unit>> singleLiveEvent) {
        this.deleteCardLiveData = singleLiveEvent;
    }

    public final void setIssueCardLiveData(@NotNull SingleLiveEvent<State<Unit>> singleLiveEvent) {
        this.issueCardLiveData = singleLiveEvent;
    }

    public final void setSetDefaultCardLiveData(@NotNull SingleLiveEvent<State<Boolean>> singleLiveEvent) {
        this.setDefaultCardLiveData = singleLiveEvent;
    }
}
