package com.huami.account.userinfo.ui;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.facebook.GraphRequest;
import com.huami.account.HMLoginManager;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.api.entity.MinorAuthorizationEntity;
import com.huami.account.ui.common.state.StateWrapper;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.repository.PersonInfoRepository;
import com.huami.account.userinfo.ui.state.PersonInfoUiState;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J'\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR(\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R%\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f0\u00148F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0018\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "", "a", "", "", GraphRequest.FIELDS_PARAM, "updatePartOfPersonInfo", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fetchFreshPersonInfo", "Lcom/huami/account/userinfo/repository/PersonInfoRepository;", "Lcom/huami/account/userinfo/repository/PersonInfoRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/account/ui/common/state/StateWrapper;", "Lcom/huami/account/userinfo/ui/state/PersonInfoUiState;", "b", "Landroidx/lifecycle/MutableLiveData;", "_uiState", "Landroidx/lifecycle/LiveData;", "getUiState", "()Landroidx/lifecycle/LiveData;", "uiState", "isMainLandChildDefaultAge", "()Z", "<init>", "(Lcom/huami/account/userinfo/repository/PersonInfoRepository;)V", "Companion", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoViewModel extends ViewModel {

    @NotNull
    private static final String c = "PersonInfoViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PersonInfoRepository repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<StateWrapper<PersonInfoUiState, Unit>> _uiState = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.account.userinfo.ui.PersonInfoViewModel$fetchFreshPersonInfo$1", f = "PersonInfoViewModel.kt", i = {1}, l = {49, 51}, m = "invokeSuspend", n = {"personInfo"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        /* JADX INFO: renamed from: com.huami.account.userinfo.ui.PersonInfoViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/account/api/entity/MinorAuthorizationEntity;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.account.userinfo.ui.PersonInfoViewModel$fetchFreshPersonInfo$1$minorAuthState$1", f = "PersonInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0272a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MinorAuthorizationEntity>, Object> {
            public int a;

            public C0272a(Continuation<? super C0272a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0272a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super MinorAuthorizationEntity> continuation) {
                return ((C0272a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return HMAccountWebAPI.queryMinorAuthorization();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.account.userinfo.ui.PersonInfoViewModel$fetchFreshPersonInfo$1$personInfo$1", f = "PersonInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HMPersonInfo>, Object> {
            public int a;
            public final /* synthetic */ PersonInfoViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PersonInfoViewModel personInfoViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = personInfoViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HMPersonInfo> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.b.repository.fetchAndSavePersonInfo();
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PersonInfoViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0056  */
        /* JADX WARN: Code duplicated, block: B:20:0x006b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            HMPersonInfo hMPersonInfo;
            MinorAuthorizationEntity minorAuthorizationEntity;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hMPersonInfo = (HMPersonInfo) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                minorAuthorizationEntity = (MinorAuthorizationEntity) obj;
                if (hMPersonInfo != null) {
                    PersonInfoViewModel.this._uiState.postValue(StateWrapper.INSTANCE.success(new PersonInfoUiState(hMPersonInfo, minorAuthorizationEntity)));
                } else {
                    PersonInfoViewModel.this._uiState.postValue(StateWrapper.INSTANCE.failed(Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(PersonInfoViewModel.this, null);
            this.b = 1;
            obj = BuildersKt.withContext(io2, bVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            HMPersonInfo hMPersonInfo2 = (HMPersonInfo) obj;
            CoroutineDispatcher io3 = Dispatchers.getIO();
            C0272a c0272a = new C0272a(null);
            this.a = hMPersonInfo2;
            this.b = 2;
            Object objWithContext = BuildersKt.withContext(io3, c0272a, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            hMPersonInfo = hMPersonInfo2;
            obj = objWithContext;
            minorAuthorizationEntity = (MinorAuthorizationEntity) obj;
            if (hMPersonInfo != null) {
                PersonInfoViewModel.this._uiState.postValue(StateWrapper.INSTANCE.success(new PersonInfoUiState(hMPersonInfo, minorAuthorizationEntity)));
            } else {
                PersonInfoViewModel.this._uiState.postValue(StateWrapper.INSTANCE.failed(Unit.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    public PersonInfoViewModel(@NotNull PersonInfoRepository personInfoRepository) {
        this.repository = personInfoRepository;
    }

    private final boolean a() {
        return !HMLoginManager.isAdultGlobal() && HMPersonInfo.getInstance().getUserInfo().getDefaultFields().contains("birthday");
    }

    public final void fetchFreshPersonInfo() {
        this._uiState.setValue(StateWrapper.INSTANCE.loading(R.string.account_ui_loading));
        e.f(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    @NotNull
    public final LiveData<StateWrapper<PersonInfoUiState, Unit>> getUiState() {
        return this._uiState;
    }

    public final boolean isMainLandChildDefaultAge() {
        return a();
    }

    @Nullable
    public final Object updatePartOfPersonInfo(@NotNull Map<String, String> map, @NotNull Continuation<? super Boolean> continuation) {
        return this.repository.updatePartOfPersonInfo(map, continuation);
    }
}
