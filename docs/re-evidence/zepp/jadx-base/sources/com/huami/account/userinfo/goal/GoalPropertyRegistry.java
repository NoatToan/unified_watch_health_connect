package com.huami.account.userinfo.goal;

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
import com.xiaomi.hm.health.running.calori.CalorieModuleKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/huami/account/userinfo/goal/GoalPropertyRegistry;", "Lcom/huami/userproperty/service/UserPropertyRegistry;", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "PREFIX", "e", "PROPERTY_GOAL_SLEEP", "f", "PROPERTY_GOAL_CALORIE", "Lcom/huami/userproperty/service/UserProperty;", "", "g", "Lcom/huami/userproperty/service/UserProperty;", "getSleepGoal", "()Lcom/huami/userproperty/service/UserProperty;", "sleepGoal", "h", "getCalorieGoal", CalorieModuleKt.QUALIFIER_CALORIE_GOAL, "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class GoalPropertyRegistry extends UserPropertyRegistry {

    @NotNull
    public static final GoalPropertyRegistry INSTANCE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String PREFIX = "huami.mifit.user.settings.goal";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_GOAL_SLEEP = "huami.mifit.user.settings.goal.sleep";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_GOAL_CALORIE = "huami.mifit.user.settings.goal.calorie";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final UserProperty<Integer> sleepGoal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final UserProperty<Integer> calorieGoal;

    static {
        final GoalPropertyRegistry goalPropertyRegistry = new GoalPropertyRegistry();
        INSTANCE = goalPropertyRegistry;
        final String str = PROPERTY_GOAL_SLEEP;
        final Function0 function0 = null;
        sleepGoal = new UserProperty<Integer>(str, function0, goalPropertyRegistry) { // from class: com.huami.account.userinfo.goal.GoalPropertyRegistry$special$$inlined$userProperty$default$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.huami.account.userinfo.goal.GoalPropertyRegistry$special$$inlined$userProperty$default$1$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Integer>>, Object> {
                public int a;
                public final /* synthetic */ GoalPropertyRegistry$special$$inlined$userProperty$default$1 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, GoalPropertyRegistry$special$$inlined$userProperty$default$1 goalPropertyRegistry$special$$inlined$userProperty$default$1, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = goalPropertyRegistry$special$$inlined$userProperty$default$1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<Integer>> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        GoalPropertyRegistry$special$$inlined$userProperty$default$1 goalPropertyRegistry$special$$inlined$userProperty$default$1 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof FetchInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(goalPropertyRegistry$special$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
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

            /* JADX INFO: renamed from: com.huami.account.userinfo.goal.GoalPropertyRegistry$special$$inlined$userProperty$default$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ GoalPropertyRegistry$special$$inlined$userProperty$default$1 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, GoalPropertyRegistry$special$$inlined$userProperty$default$1 goalPropertyRegistry$special$$inlined$userProperty$default$1, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = goalPropertyRegistry$special$$inlined$userProperty$default$1;
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
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        GoalPropertyRegistry$special$$inlined$userProperty$default$1 goalPropertyRegistry$special$$inlined$userProperty$default$1 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof PushInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(goalPropertyRegistry$special$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
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
                this.b = str;
                this.c = function0;
                this.d = goalPropertyRegistry;
                this.key = str;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Function0<String> customApi() {
                Function0<String> function1 = this.c;
                return function1 == null ? this.d.getRegistryUrlProvider() : function1;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<FetchResult<Integer>> fetch() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Integer, java.lang.Object] */
            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Integer get() {
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
            public void set(@Nullable Integer value) {
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
        final String str2 = PROPERTY_GOAL_CALORIE;
        calorieGoal = new UserProperty<Integer>(str2, function0, goalPropertyRegistry) { // from class: com.huami.account.userinfo.goal.GoalPropertyRegistry$special$$inlined$userProperty$default$2

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.huami.account.userinfo.goal.GoalPropertyRegistry$special$$inlined$userProperty$default$2$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Integer>>, Object> {
                public int a;
                public final /* synthetic */ GoalPropertyRegistry$special$$inlined$userProperty$default$2 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, GoalPropertyRegistry$special$$inlined$userProperty$default$2 goalPropertyRegistry$special$$inlined$userProperty$default$2, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = goalPropertyRegistry$special$$inlined$userProperty$default$2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<Integer>> continuation) {
                    return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        GoalPropertyRegistry$special$$inlined$userProperty$default$2 goalPropertyRegistry$special$$inlined$userProperty$default$2 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof FetchInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(goalPropertyRegistry$special$$inlined$userProperty$default$2, arrayList, registryUrlProvider, this);
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

            /* JADX INFO: renamed from: com.huami.account.userinfo.goal.GoalPropertyRegistry$special$$inlined$userProperty$default$2$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ GoalPropertyRegistry$special$$inlined$userProperty$default$2 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, GoalPropertyRegistry$special$$inlined$userProperty$default$2 goalPropertyRegistry$special$$inlined$userProperty$default$2, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = goalPropertyRegistry$special$$inlined$userProperty$default$2;
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
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyRepo propertyRepo = this.c.getPropertyRepo();
                        GoalPropertyRegistry$special$$inlined$userProperty$default$2 goalPropertyRegistry$special$$inlined$userProperty$default$2 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof PushInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(goalPropertyRegistry$special$$inlined$userProperty$default$2, arrayList, registryUrlProvider, this);
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
                this.b = str2;
                this.c = function0;
                this.d = goalPropertyRegistry;
                this.key = str2;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Function0<String> customApi() {
                Function0<String> function1 = this.c;
                return function1 == null ? this.d.getRegistryUrlProvider() : function1;
            }

            @Override // com.huami.userproperty.service.UserProperty
            @NotNull
            public ResultFuture<FetchResult<Integer>> fetch() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Integer, java.lang.Object] */
            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Integer get() {
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
            public void set(@Nullable Integer value) {
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

    private GoalPropertyRegistry() {
    }

    @NotNull
    public final UserProperty<Integer> getCalorieGoal() {
        return calorieGoal;
    }

    @NotNull
    public final UserProperty<Integer> getSleepGoal() {
        return sleepGoal;
    }
}
