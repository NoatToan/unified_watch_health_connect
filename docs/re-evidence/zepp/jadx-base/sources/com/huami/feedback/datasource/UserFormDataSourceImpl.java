package com.huami.feedback.datasource;

import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.util.ConstantsKt;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/feedback/datasource/UserFormDataSourceImpl;", "Lcom/huami/feedback/datasource/UserFormDataSource;", "", "a", "Lcom/huami/feedback/entity/UserForm;", "getFormData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "setFormData", "(Lcom/huami/feedback/entity/UserForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/account/service/AccountService;", "Lcom/huami/account/service/AccountService;", "accountService", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/huami/account/service/AccountService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class UserFormDataSourceImpl implements UserFormDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/feedback/entity/UserForm;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.UserFormDataSourceImpl$getFormData$2", f = "UserFormDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserForm>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserFormDataSourceImpl.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super UserForm> continuation) {
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
            String strA = UserFormDataSourceImpl.this.a();
            if (strA == null) {
                return null;
            }
            return KvKit.getKvPersistence$default(ConstantsKt.FEEDBACK_KV_FILE, false, 2, null).getParcelableValue(strA, UserForm.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.UserFormDataSourceImpl$setFormData$2", f = "UserFormDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ UserForm c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserForm userForm, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = userForm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserFormDataSourceImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
            String strA = UserFormDataSourceImpl.this.a();
            if (strA == null) {
                return Unit.INSTANCE;
            }
            KvPersistence kvPersistence$default = KvKit.getKvPersistence$default(ConstantsKt.FEEDBACK_KV_FILE, false, 2, null);
            UserForm userForm = this.c;
            if (userForm == null) {
                kvPersistence$default.removeValuesForKeys(strA);
            } else {
                kvPersistence$default.setValue(strA, userForm);
            }
            return Unit.INSTANCE;
        }
    }

    public UserFormDataSourceImpl(@NotNull AccountService accountService, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.accountService = accountService;
        this.dispatcher = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        String strUserId = AccountServiceExtKt.userId(this.accountService);
        if (strUserId == null) {
            return null;
        }
        return Intrinsics.stringPlus(ConstantsKt.FEEDBACK_USER_FORM_KEY, strUserId);
    }

    @Override // com.huami.feedback.datasource.UserFormDataSource
    @Nullable
    public Object getFormData(@NotNull Continuation<? super UserForm> continuation) {
        return BuildersKt.withContext(this.dispatcher, new a(null), continuation);
    }

    @Override // com.huami.feedback.datasource.UserFormDataSource
    @Nullable
    public Object setFormData(@Nullable UserForm userForm, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new b(userForm, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public /* synthetic */ UserFormDataSourceImpl(AccountService accountService, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountService, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
