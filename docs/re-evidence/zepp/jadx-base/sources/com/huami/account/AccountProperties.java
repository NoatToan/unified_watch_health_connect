package com.huami.account;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.UserPropertyRegistry;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import com.huami.userproperty.service.entity.remote.SimpleResultFuture;
import com.huami.userproperty.service.interceptor.FetchInterceptor;
import com.huami.userproperty.service.interceptor.GetInterceptor;
import com.huami.userproperty.service.interceptor.Interceptor;
import com.huami.userproperty.service.interceptor.PushInterceptor;
import com.huami.userproperty.service.interceptor.SetInterceptor;
import com.huami.userproperty.service.repo.UserPropertyRepo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R$\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00168B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006 "}, d2 = {"Lcom/huami/account/AccountProperties;", "Lcom/huami/userproperty/service/UserPropertyRegistry;", "Lcom/huami/userproperty/service/UserProperty;", "", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getCcpaStatus", "()Lcom/huami/userproperty/service/UserProperty;", "ccpaStatus", "e", "getMinorConfirmedAge", "minorConfirmedAge", "f", "getEdmConfirmed", "edmConfirmed", "g", "Ljava/lang/Boolean;", "getEdmConfirmedByRegister", "()Ljava/lang/Boolean;", "setEdmConfirmedByRegister", "(Ljava/lang/Boolean;)V", "edmConfirmedByRegister", "", "a", "()Ljava/lang/String;", "ccpaKey", "c", "minorConfirmedAgeKey", "b", "edmConfirmedKey", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AccountProperties extends UserPropertyRegistry {

    @NotNull
    public static final AccountProperties INSTANCE = new AccountProperties();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy ccpaStatus = LazyKt__LazyJVMKt.lazy(new Function0<UserProperty<Boolean>>() { // from class: com.huami.account.AccountProperties$ccpaStatus$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserProperty<Boolean> invoke() {
            final AccountProperties accountProperties = AccountProperties.INSTANCE;
            final String strA = accountProperties.a();
            final Function0 function0 = null;
            return new UserProperty<Boolean>(strA, function0, accountProperties) { // from class: com.huami.account.AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1

                /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                @NotNull
                private final String key;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ UserPropertyRegistry d;

                /* JADX INFO: renamed from: com.huami.account.AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Boolean>>, Object> {
                    public int a;
                    public final /* synthetic */ AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1 b;
                    public final /* synthetic */ UserPropertyRegistry c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1 accountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1, Continuation continuation) {
                        super(1, continuation);
                        this.c = userPropertyRegistry;
                        this.b = accountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.c, this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Object invoke(@Nullable Continuation<? super FetchResult<Boolean>> continuation) {
                        return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                            AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1 accountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1 = this.b;
                            List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : registryInterceptors) {
                                if (obj2 instanceof FetchInterceptor) {
                                    arrayList.add(obj2);
                                }
                            }
                            Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                            this.a = 1;
                            obj = propertyRepo.fetch(accountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }

                /* JADX INFO: renamed from: com.huami.account.AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1$2, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                    public int a;
                    public final /* synthetic */ AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1 b;
                    public final /* synthetic */ UserPropertyRegistry c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1 accountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1, Continuation continuation) {
                        super(1, continuation);
                        this.c = userPropertyRegistry;
                        this.b = accountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                        return new AnonymousClass2(this.c, this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Object invoke(@Nullable Continuation<? super PushResult> continuation) {
                        return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                            AccountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1 accountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1 = this.b;
                            List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : registryInterceptors) {
                                if (obj2 instanceof PushInterceptor) {
                                    arrayList.add(obj2);
                                }
                            }
                            Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                            this.a = 1;
                            obj = propertyRepo.push(accountProperties$ccpaStatus$2$invoke$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }

                {
                    this.b = strA;
                    this.c = function0;
                    this.d = accountProperties;
                    this.key = strA;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @Nullable
                public Function0<String> customApi() {
                    Function0<String> function1 = this.c;
                    return function1 == null ? this.d.getRegistryUrlProvider() : function1;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public ResultFuture<FetchResult<Boolean>> fetch() {
                    return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // com.huami.userproperty.service.UserProperty
                @Nullable
                public Boolean get() {
                    UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                    Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                    String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                    List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : registryInterceptors) {
                        if (obj instanceof GetInterceptor) {
                            arrayList.add(obj);
                        }
                    }
                    return propertyRepo.get(this, strInvoke, arrayList);
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public String getKey() {
                    return this.key;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public ResultFuture<PushResult> push() {
                    return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass2(this.d, this, null));
                }

                @Override // com.huami.userproperty.service.UserProperty
                public void set(@Nullable Boolean value) {
                    UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                    Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                    String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                    List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : registryInterceptors) {
                        if (obj instanceof SetInterceptor) {
                            arrayList.add(obj);
                        }
                    }
                    propertyRepo.set(this, value, strInvoke, arrayList);
                }
            };
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy minorConfirmedAge = LazyKt__LazyJVMKt.lazy(new Function0<UserProperty<Boolean>>() { // from class: com.huami.account.AccountProperties$minorConfirmedAge$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserProperty<Boolean> invoke() {
            final AccountProperties accountProperties = AccountProperties.INSTANCE;
            final String strC = accountProperties.c();
            final Function0 function0 = null;
            return new UserProperty<Boolean>(strC, function0, accountProperties) { // from class: com.huami.account.AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1

                /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                @NotNull
                private final String key;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ UserPropertyRegistry d;

                /* JADX INFO: renamed from: com.huami.account.AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Boolean>>, Object> {
                    public int a;
                    public final /* synthetic */ AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1 b;
                    public final /* synthetic */ UserPropertyRegistry c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1 accountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1, Continuation continuation) {
                        super(1, continuation);
                        this.c = userPropertyRegistry;
                        this.b = accountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.c, this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Object invoke(@Nullable Continuation<? super FetchResult<Boolean>> continuation) {
                        return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                            AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1 accountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1 = this.b;
                            List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : registryInterceptors) {
                                if (obj2 instanceof FetchInterceptor) {
                                    arrayList.add(obj2);
                                }
                            }
                            Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                            this.a = 1;
                            obj = propertyRepo.fetch(accountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }

                /* JADX INFO: renamed from: com.huami.account.AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1$2, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                    public int a;
                    public final /* synthetic */ AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1 b;
                    public final /* synthetic */ UserPropertyRegistry c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1 accountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1, Continuation continuation) {
                        super(1, continuation);
                        this.c = userPropertyRegistry;
                        this.b = accountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                        return new AnonymousClass2(this.c, this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Object invoke(@Nullable Continuation<? super PushResult> continuation) {
                        return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                            AccountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1 accountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1 = this.b;
                            List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : registryInterceptors) {
                                if (obj2 instanceof PushInterceptor) {
                                    arrayList.add(obj2);
                                }
                            }
                            Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                            this.a = 1;
                            obj = propertyRepo.push(accountProperties$minorConfirmedAge$2$invoke$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }

                {
                    this.b = strC;
                    this.c = function0;
                    this.d = accountProperties;
                    this.key = strC;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @Nullable
                public Function0<String> customApi() {
                    Function0<String> function1 = this.c;
                    return function1 == null ? this.d.getRegistryUrlProvider() : function1;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public ResultFuture<FetchResult<Boolean>> fetch() {
                    return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // com.huami.userproperty.service.UserProperty
                @Nullable
                public Boolean get() {
                    UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                    Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                    String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                    List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : registryInterceptors) {
                        if (obj instanceof GetInterceptor) {
                            arrayList.add(obj);
                        }
                    }
                    return propertyRepo.get(this, strInvoke, arrayList);
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public String getKey() {
                    return this.key;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public ResultFuture<PushResult> push() {
                    return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass2(this.d, this, null));
                }

                @Override // com.huami.userproperty.service.UserProperty
                public void set(@Nullable Boolean value) {
                    UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                    Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                    String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                    List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : registryInterceptors) {
                        if (obj instanceof SetInterceptor) {
                            arrayList.add(obj);
                        }
                    }
                    propertyRepo.set(this, value, strInvoke, arrayList);
                }
            };
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy edmConfirmed = LazyKt__LazyJVMKt.lazy(new Function0<UserProperty<Boolean>>() { // from class: com.huami.account.AccountProperties$edmConfirmed$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserProperty<Boolean> invoke() {
            final AccountProperties accountProperties = AccountProperties.INSTANCE;
            final String strB = accountProperties.b();
            final Function0 function0 = null;
            return new UserProperty<Boolean>(strB, function0, accountProperties) { // from class: com.huami.account.AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1

                /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                @NotNull
                private final String key;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ UserPropertyRegistry d;

                /* JADX INFO: renamed from: com.huami.account.AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Boolean>>, Object> {
                    public int a;
                    public final /* synthetic */ AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1 b;
                    public final /* synthetic */ UserPropertyRegistry c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1 accountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1, Continuation continuation) {
                        super(1, continuation);
                        this.c = userPropertyRegistry;
                        this.b = accountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.c, this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Object invoke(@Nullable Continuation<? super FetchResult<Boolean>> continuation) {
                        return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                            AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1 accountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1 = this.b;
                            List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : registryInterceptors) {
                                if (obj2 instanceof FetchInterceptor) {
                                    arrayList.add(obj2);
                                }
                            }
                            Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                            this.a = 1;
                            obj = propertyRepo.fetch(accountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }

                /* JADX INFO: renamed from: com.huami.account.AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1$2, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
                public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                    public int a;
                    public final /* synthetic */ AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1 b;
                    public final /* synthetic */ UserPropertyRegistry c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1 accountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1, Continuation continuation) {
                        super(1, continuation);
                        this.c = userPropertyRegistry;
                        this.b = accountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                        return new AnonymousClass2(this.c, this.b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final Object invoke(@Nullable Continuation<? super PushResult> continuation) {
                        return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                            AccountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1 accountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1 = this.b;
                            List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : registryInterceptors) {
                                if (obj2 instanceof PushInterceptor) {
                                    arrayList.add(obj2);
                                }
                            }
                            Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                            this.a = 1;
                            obj = propertyRepo.push(accountProperties$edmConfirmed$2$invoke$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }

                {
                    this.b = strB;
                    this.c = function0;
                    this.d = accountProperties;
                    this.key = strB;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @Nullable
                public Function0<String> customApi() {
                    Function0<String> function1 = this.c;
                    return function1 == null ? this.d.getRegistryUrlProvider() : function1;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public ResultFuture<FetchResult<Boolean>> fetch() {
                    return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                @Override // com.huami.userproperty.service.UserProperty
                @Nullable
                public Boolean get() {
                    UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                    Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                    String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                    List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : registryInterceptors) {
                        if (obj instanceof GetInterceptor) {
                            arrayList.add(obj);
                        }
                    }
                    return propertyRepo.get(this, strInvoke, arrayList);
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public String getKey() {
                    return this.key;
                }

                @Override // com.huami.userproperty.service.UserProperty
                @NotNull
                public ResultFuture<PushResult> push() {
                    return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass2(this.d, this, null));
                }

                @Override // com.huami.userproperty.service.UserProperty
                public void set(@Nullable Boolean value) {
                    UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                    Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                    String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                    List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : registryInterceptors) {
                        if (obj instanceof SetInterceptor) {
                            arrayList.add(obj);
                        }
                    }
                    propertyRepo.set(this, value, strInvoke, arrayList);
                }
            };
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private static Boolean edmConfirmedByRegister;

    private AccountProperties() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        return AccountExternalsKt.getUserSettingsPrefix() + ".ccpa.agreement";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b() {
        return AccountExternalsKt.getUserSettingsPrefix() + ".edm.confirmed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return AccountExternalsKt.getUserSettingsPrefix() + ".minor.age.confirmed";
    }

    @NotNull
    public final UserProperty<Boolean> getCcpaStatus() {
        return (UserProperty) ccpaStatus.getValue();
    }

    @NotNull
    public final UserProperty<Boolean> getEdmConfirmed() {
        return (UserProperty) edmConfirmed.getValue();
    }

    @Nullable
    public final Boolean getEdmConfirmedByRegister() {
        return edmConfirmedByRegister;
    }

    @NotNull
    public final UserProperty<Boolean> getMinorConfirmedAge() {
        return (UserProperty) minorConfirmedAge.getValue();
    }

    public final void setEdmConfirmedByRegister(@Nullable Boolean bool) {
        edmConfirmedByRegister = bool;
    }
}
