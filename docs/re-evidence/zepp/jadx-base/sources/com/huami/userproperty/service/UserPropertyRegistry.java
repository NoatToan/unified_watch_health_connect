package com.huami.userproperty.service;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.message.utils.MessageRecorderEventHelper;
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
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\n\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0087\bø\u0001\u0000R*\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00100\u000f8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Lcom/huami/userproperty/service/UserPropertyRegistry;", "Lorg/koin/core/component/KoinComponent;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/Function0;", "Lcom/huami/userproperty/service/BaseUrlProvider;", "customApi", "Lcom/huami/userproperty/service/UserProperty;", "userProperty", "a", "Lkotlin/jvm/functions/Function0;", "getRegistryUrlProvider", "()Lkotlin/jvm/functions/Function0;", "registryUrlProvider", "", "Lcom/huami/userproperty/service/interceptor/Interceptor;", "b", "Ljava/util/List;", "getRegistryInterceptors", "()Ljava/util/List;", "registryInterceptors", "Lcom/huami/userproperty/service/repo/UserPropertyRepo;", "c", "Lkotlin/Lazy;", "getPropertyRepo", "()Lcom/huami/userproperty/service/repo/UserPropertyRepo;", "propertyRepo", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
public abstract class UserPropertyRegistry implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function0<String> registryUrlProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<Interceptor<?, ?>> registryInterceptors = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy propertyRepo;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.huami.userproperty.service.UserPropertyRegistry$userProperty$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\u0016J\u0011\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0016R\u001c\u0010\u0015\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"com/huami/userproperty/service/UserPropertyRegistry$userProperty$1", "Lcom/huami/userproperty/service/UserProperty;", "Lkotlin/Function0;", "", "Lcom/huami/userproperty/service/BaseUrlProvider;", "customApi", "get", "()Ljava/lang/Object;", "value", "", WatchFaceArrivingEvent.CMD_SET, "(Ljava/lang/Object;)V", "Lcom/huami/userproperty/service/entity/remote/ResultFuture;", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", RemoteConfigComponent.FETCH_FILE_NAME, "Lcom/huami/userproperty/service/entity/remote/PushResult;", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1<T> implements UserProperty<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String key;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function0<String> c;
        public final /* synthetic */ UserPropertyRegistry d;

        public AnonymousClass1(String str, Function0<String> function0, UserPropertyRegistry userPropertyRegistry) {
            this.b = str;
            this.c = function0;
            this.d = userPropertyRegistry;
            this.key = str;
        }

        @Override // com.huami.userproperty.service.UserProperty
        @Nullable
        public Function0<String> customApi() {
            Function0<String> function0 = this.c;
            return function0 == null ? this.d.getRegistryUrlProvider() : function0;
        }

        @Override // com.huami.userproperty.service.UserProperty
        @NotNull
        public ResultFuture<FetchResult<T>> fetch() {
            SimpleResultFuture.Companion companion = SimpleResultFuture.INSTANCE;
            Intrinsics.needClassReification();
            return companion.createFuture(new UserPropertyRegistry$userProperty$1$fetch$1(this.d, this, null));
        }

        @Override // com.huami.userproperty.service.UserProperty
        @Nullable
        public T get() {
            UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
            Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
            String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
            List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
            ArrayList arrayList = new ArrayList();
            for (T t : registryInterceptors) {
                if (t instanceof GetInterceptor) {
                    arrayList.add(t);
                }
            }
            return (T) propertyRepo.get(this, strInvoke, arrayList);
        }

        @Override // com.huami.userproperty.service.UserProperty
        @NotNull
        public String getKey() {
            return this.key;
        }

        @Override // com.huami.userproperty.service.UserProperty
        @NotNull
        public ResultFuture<PushResult> push() {
            return SimpleResultFuture.INSTANCE.createFuture(new UserPropertyRegistry$userProperty$1$push$1(this.d, this, null));
        }

        @Override // com.huami.userproperty.service.UserProperty
        public void set(@Nullable T value) {
            UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
            Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
            String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
            List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
            ArrayList arrayList = new ArrayList();
            for (T t : registryInterceptors) {
                if (t instanceof SetInterceptor) {
                    arrayList.add(t);
                }
            }
            propertyRepo.set(this, value, strInvoke, arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserPropertyRegistry() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.propertyRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<UserPropertyRepo>() { // from class: com.huami.userproperty.service.UserPropertyRegistry$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.service.repo.UserPropertyRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final UserPropertyRepo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(UserPropertyRepo.class), qualifier, objArr);
            }
        });
    }

    public static /* synthetic */ UserProperty userProperty$default(UserPropertyRegistry userPropertyRegistry, String str, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: userProperty");
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Intrinsics.needClassReification();
        return new AnonymousClass1(str, function0, userPropertyRegistry);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final UserPropertyRepo getPropertyRepo() {
        return (UserPropertyRepo) this.propertyRepo.getValue();
    }

    @NotNull
    public List<Interceptor<?, ?>> getRegistryInterceptors() {
        return this.registryInterceptors;
    }

    @Nullable
    public Function0<String> getRegistryUrlProvider() {
        return this.registryUrlProvider;
    }

    @JvmOverloads
    public final /* synthetic */ <T> UserProperty<T> userProperty(String key, Function0<String> customApi) {
        Intrinsics.needClassReification();
        return new AnonymousClass1(key, customApi, this);
    }

    @JvmOverloads
    public final /* synthetic */ <T> UserProperty<T> userProperty(final String str) {
        Intrinsics.needClassReification();
        final Function0 function0 = null;
        return new UserProperty<T>(str, function0, this) { // from class: com.huami.userproperty.service.UserPropertyRegistry$userProperty$$inlined$userProperty$default$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.huami.userproperty.service.UserPropertyRegistry$userProperty$$inlined$userProperty$default$1$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<T>>, Object> {
                public int a;
                public final /* synthetic */ UserPropertyRegistry$userProperty$$inlined$userProperty$default$1 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, UserPropertyRegistry$userProperty$$inlined$userProperty$default$1 userPropertyRegistry$userProperty$$inlined$userProperty$default$1, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = userPropertyRegistry$userProperty$$inlined$userProperty$default$1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<T>> continuation) {
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
                        UserPropertyRegistry$userProperty$$inlined$userProperty$default$1 userPropertyRegistry$userProperty$$inlined$userProperty$default$1 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (T t : registryInterceptors) {
                            if (t instanceof FetchInterceptor) {
                                arrayList.add(t);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(userPropertyRegistry$userProperty$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
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

            /* JADX INFO: renamed from: com.huami.userproperty.service.UserPropertyRegistry$userProperty$$inlined$userProperty$default$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ UserPropertyRegistry$userProperty$$inlined$userProperty$default$1 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, UserPropertyRegistry$userProperty$$inlined$userProperty$default$1 userPropertyRegistry$userProperty$$inlined$userProperty$default$1, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = userPropertyRegistry$userProperty$$inlined$userProperty$default$1;
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
                        UserPropertyRegistry$userProperty$$inlined$userProperty$default$1 userPropertyRegistry$userProperty$$inlined$userProperty$default$1 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (T t : registryInterceptors) {
                            if (t instanceof PushInterceptor) {
                                arrayList.add(t);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(userPropertyRegistry$userProperty$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
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
                this.d = this;
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
            public ResultFuture<FetchResult<T>> fetch() {
                SimpleResultFuture.Companion companion = SimpleResultFuture.INSTANCE;
                Intrinsics.needClassReification();
                return companion.createFuture(new AnonymousClass1(this.d, this, null));
            }

            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public T get() {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (T t : registryInterceptors) {
                    if (t instanceof GetInterceptor) {
                        arrayList.add(t);
                    }
                }
                return (T) propertyRepo.get(this, strInvoke, arrayList);
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
            public void set(@Nullable T value) {
                UserPropertyRepo propertyRepo = this.d.getPropertyRepo();
                Function0<String> registryUrlProvider = this.d.getRegistryUrlProvider();
                String strInvoke = registryUrlProvider == null ? null : registryUrlProvider.invoke();
                List<Interceptor<?, ?>> registryInterceptors = this.d.getRegistryInterceptors();
                ArrayList arrayList = new ArrayList();
                for (T t : registryInterceptors) {
                    if (t instanceof SetInterceptor) {
                        arrayList.add(t);
                    }
                }
                propertyRepo.set(this, value, strInvoke, arrayList);
            }
        };
    }
}
