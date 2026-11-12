package com.huami.respiratoryrate.core.synctime;

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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/respiratoryrate/core/synctime/RespRateSyncTime;", "Lcom/huami/userproperty/service/UserPropertyRegistry;", "", "KEY", "Ljava/lang/String;", "Lcom/huami/userproperty/service/UserProperty;", "", GoogleApiAvailabilityLight.a, "Lcom/huami/userproperty/service/UserProperty;", "getRespSyncTime", "()Lcom/huami/userproperty/service/UserProperty;", "respSyncTime", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class RespRateSyncTime extends UserPropertyRegistry {

    @NotNull
    public static final RespRateSyncTime INSTANCE;

    @NotNull
    public static final String KEY = "huami.mifit.user.respiratoryrate.synctime";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final UserProperty<Long> respSyncTime;

    static {
        final RespRateSyncTime respRateSyncTime = new RespRateSyncTime();
        INSTANCE = respRateSyncTime;
        final String str = KEY;
        final Function0 function0 = null;
        respSyncTime = new UserProperty<Long>(str, function0, respRateSyncTime) { // from class: com.huami.respiratoryrate.core.synctime.RespRateSyncTime$special$$inlined$userProperty$default$1

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            private final String key;
            public final /* synthetic */ String b;
            public final /* synthetic */ Function0 c;
            public final /* synthetic */ UserPropertyRegistry d;

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.synctime.RespRateSyncTime$special$$inlined$userProperty$default$1$1, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$fetch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$fetch$1", f = "UserPropertyRegistry.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super FetchResult<Long>>, Object> {
                public int a;
                public final /* synthetic */ RespRateSyncTime$special$$inlined$userProperty$default$1 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserPropertyRegistry userPropertyRegistry, RespRateSyncTime$special$$inlined$userProperty$default$1 respRateSyncTime$special$$inlined$userProperty$default$1, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = respRateSyncTime$special$$inlined$userProperty$default$1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                    return new AnonymousClass1(this.c, this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@Nullable Continuation<? super FetchResult<Long>> continuation) {
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
                        RespRateSyncTime$special$$inlined$userProperty$default$1 respRateSyncTime$special$$inlined$userProperty$default$1 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof FetchInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.fetch(respRateSyncTime$special$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
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

            /* JADX INFO: renamed from: com.huami.respiratoryrate.core.synctime.RespRateSyncTime$special$$inlined$userProperty$default$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u008a@¨\u0006\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/PushResult;", "com/huami/userproperty/service/UserPropertyRegistry$userProperty$1$push$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.service.UserPropertyRegistry$userProperty$1$push$1", f = "UserPropertyRegistry.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super PushResult>, Object> {
                public int a;
                public final /* synthetic */ RespRateSyncTime$special$$inlined$userProperty$default$1 b;
                public final /* synthetic */ UserPropertyRegistry c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(UserPropertyRegistry userPropertyRegistry, RespRateSyncTime$special$$inlined$userProperty$default$1 respRateSyncTime$special$$inlined$userProperty$default$1, Continuation continuation) {
                    super(1, continuation);
                    this.c = userPropertyRegistry;
                    this.b = respRateSyncTime$special$$inlined$userProperty$default$1;
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
                        RespRateSyncTime$special$$inlined$userProperty$default$1 respRateSyncTime$special$$inlined$userProperty$default$1 = this.b;
                        List<Interceptor<?, ?>> registryInterceptors = this.c.getRegistryInterceptors();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : registryInterceptors) {
                            if (obj2 instanceof PushInterceptor) {
                                arrayList.add(obj2);
                            }
                        }
                        Function0<String> registryUrlProvider = this.c.getRegistryUrlProvider();
                        this.a = 1;
                        obj = propertyRepo.push(respRateSyncTime$special$$inlined$userProperty$default$1, arrayList, registryUrlProvider, this);
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
                this.d = respRateSyncTime;
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
            public ResultFuture<FetchResult<Long>> fetch() {
                return SimpleResultFuture.INSTANCE.createFuture(new AnonymousClass1(this.d, this, null));
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Long, java.lang.Object] */
            @Override // com.huami.userproperty.service.UserProperty
            @Nullable
            public Long get() {
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
            public void set(@Nullable Long value) {
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

    private RespRateSyncTime() {
    }

    @NotNull
    public final UserProperty<Long> getRespSyncTime() {
        return respSyncTime;
    }
}
