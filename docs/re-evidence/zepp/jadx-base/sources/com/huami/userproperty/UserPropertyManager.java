package com.huami.userproperty;

import androidx.annotation.CheckResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.datasource.InternalLocalDataSource;
import com.huami.userproperty.entity.AbsFetchParams;
import com.huami.userproperty.entity.BatchFetchParams;
import com.huami.userproperty.entity.BatchFetchResult;
import com.huami.userproperty.entity.FetchParams;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.entity.local.LastSyncProperty;
import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.userproperty.service.entity.remote.BatchPushItem;
import com.huami.userproperty.service.entity.remote.BatchPushResult;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import com.huami.userproperty.service.entity.remote.SimpleResultFuture;
import com.huami.userproperty.service.entity.remote.SkipEmptyPushResult;
import com.huami.userproperty.service.interceptor.BatchPushInterceptor;
import com.huami.userproperty.service.interceptor.GetInterceptor;
import com.huami.userproperty.service.interceptor.Interceptor;
import com.huami.userproperty.service.interceptor.InterceptorKt;
import com.huami.userproperty.service.interceptor.SetInterceptor;
import com.huami.userproperty.throttle.PushThrottleManager;
import com.huami.userproperty.usecase.BatchPushUseCase;
import com.huami.userproperty.usecase.DumpAllLocalDataUseCase;
import com.huami.userproperty.usecase.FetchPropertyUseCase;
import com.huami.userproperty.usecase.FetchRegisteredPropsUseCase;
import com.huami.userproperty.usecase.GetAllLocalPropertiesUseCase;
import com.huami.userproperty.usecase.SaveFetchResultUseCase;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bW\u0010XJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J%\u0010\f\u001a\u00060\nj\u0002`\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000eJ\u0006\u0010\u0011\u001a\u00020\bJ&\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007J&\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0007J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0007J\"\u0010\u001b\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u001a2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0007J,\u0010\u001d\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0007J$\u0010\u001d\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u001a2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u0006H\u0007J*\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120!0\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012H\u0007J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001a2\u0006\u0010#\u001a\u00020\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012H\u0007J(\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012H\u0007J\u0018\u0010*\u001a\u00020\b2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020\u00120'j\u0002`(J\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020\u00120'j\u0002`(J\u0014\u0010-\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020,0\u0006J\f\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u0006J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020$0\u001aH\u0007J\u0006\u00100\u001a\u00020\bJ\u0006\u00101\u001a\u00020\bR*\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u001d\u0010<\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001d\u0010A\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R\u001d\u0010E\u001a\u00020B8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\b8\u0010DR\u001d\u0010H\u001a\u00020F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b>\u0010GR\u001d\u0010L\u001a\u00020I8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bC\u0010KR\u001d\u0010O\u001a\u00020M8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00109\u001a\u0004\bJ\u0010NR\u001d\u0010S\u001a\u00020P8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00109\u001a\u0004\bQ\u0010RR\"\u0010-\u001a\b\u0012\u0004\u0012\u00020,028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\bT\u00105R$\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010'j\u0004\u0018\u0001`(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Y"}, d2 = {"Lcom/huami/userproperty/UserPropertyManager;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "property", "", "i", "", Configs.Params.PROPERTIES, "", z.j, "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "Lcom/huami/userproperty/entity/BatchPushResult;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/userproperty/service/interceptor/Interceptor;", "interceptor", "registerInterceptor", "schedulePushAll", "", "key", "customApi", "value", "saveLocal", "saveLocalExcludeSync", "readLocal", "localProperties", "Lcom/huami/userproperty/service/entity/remote/ResultFuture;", "pushAll", "keys", "batchPush", "Lcom/huami/userproperty/service/UserProperty;", "userProperties", "api", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "singleFetch", "keyPrefix", "Lcom/huami/userproperty/entity/BatchFetchResult;", "rangeFetch", "batchFetch", "Lkotlin/Function0;", "Lcom/huami/userproperty/service/BaseUrlProvider;", "baseUrlProvider", "setDefaultApi", "getDefaultApi", "Lcom/huami/userproperty/entity/AbsFetchParams;", "registerFetchProperties", "getRegisteredFetchProperties", "fetchAllRegistered", "dumpAllData", "clearData", "", "Ljava/util/List;", "getGlobalInterceptors$userproperty_release", "()Ljava/util/List;", "globalInterceptors", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "b", "Lkotlin/Lazy;", "g", "()Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "internalLocalDataSource", "Lcom/huami/userproperty/usecase/FetchRegisteredPropsUseCase;", "c", "e", "()Lcom/huami/userproperty/usecase/FetchRegisteredPropsUseCase;", "fetchRegisteredPropsUseCase", "Lcom/huami/userproperty/usecase/FetchPropertyUseCase;", GoogleApiAvailabilityLight.a, "()Lcom/huami/userproperty/usecase/FetchPropertyUseCase;", "batchFetchUseCase", "Lcom/huami/userproperty/usecase/BatchPushUseCase;", "()Lcom/huami/userproperty/usecase/BatchPushUseCase;", "batchPushUseCase", "Lcom/huami/userproperty/usecase/DumpAllLocalDataUseCase;", "f", "()Lcom/huami/userproperty/usecase/DumpAllLocalDataUseCase;", "dumpAllLocalDataUseCase", "Lcom/huami/userproperty/usecase/GetAllLocalPropertiesUseCase;", "()Lcom/huami/userproperty/usecase/GetAllLocalPropertiesUseCase;", "getAllLocalPropertiesUseCase", "Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;", "h", "()Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;", "saveFetchResultUseCase", "getRegisterFetchProperties$userproperty_release", "Lkotlin/jvm/functions/Function0;", "defaultBaseUrlProvider", "<init>", "()V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class UserPropertyManager implements KoinComponent {

    @NotNull
    public static final UserPropertyManager INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<Interceptor<?, ?>> globalInterceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy internalLocalDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy fetchRegisteredPropsUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy batchFetchUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy batchPushUseCase;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dumpAllLocalDataUseCase;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Lazy getAllLocalPropertiesUseCase;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final Lazy saveFetchResultUseCase;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final List<AbsFetchParams> registerFetchProperties;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private static Function0<String> defaultBaseUrlProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/userproperty/entity/BatchFetchResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.UserPropertyManager$batchFetch$1", f = "UserPropertyManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super BatchFetchResult>, Object> {
        public int a;
        public final /* synthetic */ List<String> b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, String str, Continuation<? super a> continuation) {
            super(1, continuation);
            this.b = list;
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super BatchFetchResult> continuation) {
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
            return new BatchFetchResult(q.mapOf(TuplesKt.to(new BatchFetchParams(this.b, this.c), UserPropertyManager.INSTANCE.b().execute(new BatchFetchParams(this.b, this.c)))));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/userproperty/entity/BatchFetchResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.UserPropertyManager$fetchAllRegistered$1", f = "UserPropertyManager.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super BatchFetchResult>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super BatchFetchResult> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FetchRegisteredPropsUseCase fetchRegisteredPropsUseCaseE = UserPropertyManager.INSTANCE.e();
                this.a = 1;
                obj = fetchRegisteredPropsUseCaseE.execute(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", Configs.Params.PROPERTIES, "Lcom/huami/userproperty/service/entity/remote/ResultFuture;", "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<List<? extends LocalProperty>, ResultFuture<BatchPushResult>> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.userproperty.UserPropertyManager$pushAll$1$1", f = "UserPropertyManager.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function1<Continuation<? super BatchPushResult>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ List<LocalProperty> c;

            /* JADX INFO: renamed from: com.huami.userproperty.UserPropertyManager$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "Lcom/huami/userproperty/entity/BatchPushResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.userproperty.UserPropertyManager$pushAll$1$1$pushResult$1", f = "UserPropertyManager.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0634a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BatchPushResult>, Object> {
                public int a;
                public final /* synthetic */ List<LocalProperty> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0634a(List<LocalProperty> list, Continuation<? super C0634a> continuation) {
                    super(2, continuation);
                    this.b = list;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0634a(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super BatchPushResult> continuation) {
                    return ((C0634a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        UserPropertyManager userPropertyManager = UserPropertyManager.INSTANCE;
                        List<LocalProperty> list = this.b;
                        this.a = 1;
                        obj = userPropertyManager.a(list, this);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<LocalProperty> list, Continuation<? super a> continuation) {
                super(1, continuation);
                this.c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super BatchPushResult> continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                List list;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List<LocalProperty> list2 = this.c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (Boxing.boxBoolean(UserPropertyManager.INSTANCE.i((LocalProperty) obj2)).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return SkipEmptyPushResult.INSTANCE;
                    }
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0634a c0634a = new C0634a(arrayList, null);
                    this.a = arrayList;
                    this.b = 1;
                    obj = BuildersKt.withContext(io2, c0634a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = arrayList;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                BatchPushResult batchPushResult = (BatchPushResult) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    LocalProperty localProperty = (LocalProperty) obj3;
                    if (Boxing.boxBoolean(batchPushResult.getSuccessKeys().contains(new BatchPushItem(localProperty.getKey(), localProperty.getApi()))).booleanValue()) {
                        arrayList2.add(obj3);
                    }
                }
                UserPropertyManager.INSTANCE.j(arrayList2);
                return batchPushResult;
            }
        }

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ResultFuture<BatchPushResult> invoke(@NotNull List<LocalProperty> list) {
            return SimpleResultFuture.INSTANCE.createFuture(new a(list, null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/huami/userproperty/entity/BatchFetchResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.UserPropertyManager$rangeFetch$1", f = "UserPropertyManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super BatchFetchResult>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, Continuation<? super d> continuation) {
            super(1, continuation);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super BatchFetchResult> continuation) {
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
            return new BatchFetchResult(q.mapOf(TuplesKt.to(new FetchParams(this.b, "RANGE", this.c), UserPropertyManager.INSTANCE.b().execute(new FetchParams(this.b, "RANGE", this.c)))));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/userproperty/service/interceptor/GetInterceptor$Param;", "it", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<GetInterceptor.Param, LocalProperty> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocalProperty invoke(@NotNull GetInterceptor.Param param) {
            return UserPropertyManager.INSTANCE.g().readLocal(param.getKey(), param.getRegistryApi());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/userproperty/service/interceptor/SetInterceptor$Params;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<SetInterceptor.Params, Unit> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final void a(@NotNull SetInterceptor.Params params) {
            UserPropertyManager.INSTANCE.g().saveLocal(params.getKey(), params.getRegistryApi(), params.getValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SetInterceptor.Params params) {
            a(params);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public static final g a = new g();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "Lcom/huami/userproperty/entity/BatchPushResult;", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<BatchPushResult, Unit> {
            public static final a a = new a();

            /* JADX INFO: renamed from: com.huami.userproperty.UserPropertyManager$g$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0635a extends Lambda implements Function0<String> {
                public final /* synthetic */ BatchPushResult a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0635a(BatchPushResult batchPushResult) {
                    super(0);
                    this.a = batchPushResult;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    String str;
                    if (this.a.isSkip()) {
                        str = "跳过（无变动）";
                    } else if (this.a.isMissed()) {
                        str = "跳过（API 失效）";
                    } else {
                        str = this.a.isSuccess() ? "成功" : "失败";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("调度上传");
                    sb.append(str);
                    sb.append(": \n成功的 key：");
                    List<BatchPushItem> successKeys = this.a.getSuccessKeys();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(successKeys, 10));
                    Iterator<T> it2 = successKeys.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((BatchPushItem) it2.next()).getKey());
                    }
                    sb.append(CollectionsKt___CollectionsKt.toList(arrayList));
                    sb.append("\n失败的 key：");
                    List<BatchPushItem> failedKeys = this.a.getFailedKeys();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(failedKeys, 10));
                    Iterator<T> it3 = failedKeys.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((BatchPushItem) it3.next()).getKey());
                    }
                    sb.append(CollectionsKt___CollectionsKt.toList(arrayList2));
                    return sb.toString();
                }
            }

            public a() {
                super(1);
            }

            public final void a(@NotNull BatchPushResult batchPushResult) {
                HMLog.info(UserPropertyModuleKt.MODULE_TAG, new C0635a(batchPushResult));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BatchPushResult batchPushResult) {
                a(batchPushResult);
                return Unit.INSTANCE;
            }
        }

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            UserPropertyManager.pushAll$default(UserPropertyManager.INSTANCE, null, 1, null).get(a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.UserPropertyManager$singleFetch$1", f = "UserPropertyManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function1<Continuation<? super FetchResult<String>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, Continuation<? super h> continuation) {
            super(1, continuation);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new h(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super FetchResult<String>> continuation) {
            return ((h) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FetchResult<Map<String, String>> fetchResultExecute = UserPropertyManager.INSTANCE.b().execute(new FetchParams(this.b, "SINGLE", this.c));
            if (fetchResultExecute instanceof FetchResult.Failed) {
                return new FetchResult.Failed(((FetchResult.Failed) fetchResultExecute).getErrorCode());
            }
            if (!(fetchResultExecute instanceof FetchResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Map map = (Map) ((FetchResult.Success) fetchResultExecute).getValue();
            return new FetchResult.Success(map == null ? null : (String) map.get(this.b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final UserPropertyManager userPropertyManager = new UserPropertyManager();
        INSTANCE = userPropertyManager;
        globalInterceptors = new ArrayList();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        internalLocalDataSource = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<InternalLocalDataSource>() { // from class: com.huami.userproperty.UserPropertyManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.datasource.InternalLocalDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InternalLocalDataSource invoke() {
                KoinComponent koinComponent = userPropertyManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(InternalLocalDataSource.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        fetchRegisteredPropsUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<FetchRegisteredPropsUseCase>() { // from class: com.huami.userproperty.UserPropertyManager$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.usecase.FetchRegisteredPropsUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FetchRegisteredPropsUseCase invoke() {
                KoinComponent koinComponent = userPropertyManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FetchRegisteredPropsUseCase.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        batchFetchUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<FetchPropertyUseCase>() { // from class: com.huami.userproperty.UserPropertyManager$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.usecase.FetchPropertyUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FetchPropertyUseCase invoke() {
                KoinComponent koinComponent = userPropertyManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FetchPropertyUseCase.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        batchPushUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<BatchPushUseCase>() { // from class: com.huami.userproperty.UserPropertyManager$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.usecase.BatchPushUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BatchPushUseCase invoke() {
                KoinComponent koinComponent = userPropertyManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(BatchPushUseCase.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        dumpAllLocalDataUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<DumpAllLocalDataUseCase>() { // from class: com.huami.userproperty.UserPropertyManager$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.usecase.DumpAllLocalDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DumpAllLocalDataUseCase invoke() {
                KoinComponent koinComponent = userPropertyManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DumpAllLocalDataUseCase.class), objArr8, objArr9);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode6 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr10 = 0 == true ? 1 : 0;
        final Object[] objArr11 = 0 == true ? 1 : 0;
        getAllLocalPropertiesUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode6, (Function0) new Function0<GetAllLocalPropertiesUseCase>() { // from class: com.huami.userproperty.UserPropertyManager$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.usecase.GetAllLocalPropertiesUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GetAllLocalPropertiesUseCase invoke() {
                KoinComponent koinComponent = userPropertyManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(GetAllLocalPropertiesUseCase.class), objArr10, objArr11);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode7 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr12 = 0 == true ? 1 : 0;
        final Object[] objArr13 = 0 == true ? 1 : 0;
        saveFetchResultUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode7, (Function0) new Function0<SaveFetchResultUseCase>() { // from class: com.huami.userproperty.UserPropertyManager$special$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.userproperty.usecase.SaveFetchResultUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SaveFetchResultUseCase invoke() {
                KoinComponent koinComponent = userPropertyManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SaveFetchResultUseCase.class), objArr12, objArr13);
            }
        });
        registerFetchProperties = new ArrayList();
    }

    private UserPropertyManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(List<LocalProperty> list, Continuation<? super BatchPushResult> continuation) {
        return c().execute(list, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FetchPropertyUseCase b() {
        return (FetchPropertyUseCase) batchFetchUseCase.getValue();
    }

    public static /* synthetic */ ResultFuture batchFetch$default(UserPropertyManager userPropertyManager, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return userPropertyManager.batchFetch(list, str);
    }

    public static /* synthetic */ ResultFuture batchPush$default(UserPropertyManager userPropertyManager, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return userPropertyManager.batchPush(list, str);
    }

    private final BatchPushUseCase c() {
        return (BatchPushUseCase) batchPushUseCase.getValue();
    }

    private final DumpAllLocalDataUseCase d() {
        return (DumpAllLocalDataUseCase) dumpAllLocalDataUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FetchRegisteredPropsUseCase e() {
        return (FetchRegisteredPropsUseCase) fetchRegisteredPropsUseCase.getValue();
    }

    private final GetAllLocalPropertiesUseCase f() {
        return (GetAllLocalPropertiesUseCase) getAllLocalPropertiesUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalLocalDataSource g() {
        return (InternalLocalDataSource) internalLocalDataSource.getValue();
    }

    private final SaveFetchResultUseCase h() {
        return (SaveFetchResultUseCase) saveFetchResultUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(LocalProperty property) {
        LastSyncProperty lastSync = g().readLastSync(property.getKey(), property.getApi());
        return !Intrinsics.areEqual(property.getValue(), lastSync == null ? null : lastSync.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(List<LocalProperty> properties) {
        for (LocalProperty localProperty : properties) {
            INSTANCE.g().saveLastSync(localProperty.getKey(), localProperty.getApi(), localProperty.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResultFuture pushAll$default(UserPropertyManager userPropertyManager, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userPropertyManager.f().execute();
        }
        return userPropertyManager.pushAll(list);
    }

    public static /* synthetic */ ResultFuture rangeFetch$default(UserPropertyManager userPropertyManager, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return userPropertyManager.rangeFetch(str, str2);
    }

    public static /* synthetic */ String readLocal$default(UserPropertyManager userPropertyManager, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return userPropertyManager.readLocal(str, str2);
    }

    public static /* synthetic */ void saveLocal$default(UserPropertyManager userPropertyManager, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        userPropertyManager.saveLocal(str, str2, str3);
    }

    public static /* synthetic */ void saveLocalExcludeSync$default(UserPropertyManager userPropertyManager, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        userPropertyManager.saveLocalExcludeSync(str, str2, str3);
    }

    public static /* synthetic */ ResultFuture singleFetch$default(UserPropertyManager userPropertyManager, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return userPropertyManager.singleFetch(str, str2);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public final ResultFuture<BatchFetchResult> batchFetch(@NotNull List<String> list) {
        return batchFetch$default(this, list, null, 2, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public final ResultFuture<BatchFetchResult> batchFetch(@NotNull List<String> keys, @Nullable String api) {
        return SimpleResultFuture.INSTANCE.createFuture(new a(keys, api, null));
    }

    @CheckResult
    @NotNull
    public final ResultFuture<BatchPushResult> batchPush(@NotNull List<String> keys, @Nullable String customApi) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = keys.iterator();
        while (it2.hasNext()) {
            LocalProperty local = INSTANCE.g().readLocal((String) it2.next(), customApi);
            if (local != null) {
                arrayList.add(local);
            }
        }
        return pushAll(arrayList);
    }

    public final void clearData() {
        g().removeAll();
    }

    public final void dumpAllData() {
        d().execute();
    }

    @CheckResult
    @NotNull
    public final ResultFuture<BatchFetchResult> fetchAllRegistered() {
        return new SimpleResultFuture(new b(null));
    }

    @NotNull
    public final Function0<String> getDefaultApi() {
        Function0<String> function0 = defaultBaseUrlProvider;
        if (function0 != null) {
            return function0;
        }
        throw new IllegalStateException("请通过com.huami.userproperty.UserPropertyManager.setDefaultApi 配置默认 API");
    }

    @NotNull
    public final List<Interceptor<?, ?>> getGlobalInterceptors$userproperty_release() {
        return globalInterceptors;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final List<AbsFetchParams> getRegisterFetchProperties$userproperty_release() {
        return registerFetchProperties;
    }

    @NotNull
    public final List<AbsFetchParams> getRegisteredFetchProperties() {
        return registerFetchProperties;
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public final ResultFuture<BatchPushResult> pushAll() {
        return pushAll$default(this, null, 1, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public final ResultFuture<BatchPushResult> pushAll(@NotNull List<LocalProperty> localProperties) {
        List<Interceptor<?, ?>> list = globalInterceptors;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof BatchPushInterceptor) {
                arrayList.add(obj);
            }
        }
        return (ResultFuture) InterceptorKt.call(arrayList, localProperties, c.a);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public final ResultFuture<BatchFetchResult> rangeFetch(@NotNull String str) {
        return rangeFetch$default(this, str, null, 2, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public final ResultFuture<BatchFetchResult> rangeFetch(@NotNull String keyPrefix, @Nullable String api) {
        return SimpleResultFuture.INSTANCE.createFuture(new d(keyPrefix, api, null));
    }

    @JvmOverloads
    @Nullable
    public final String readLocal(@NotNull String str) {
        return readLocal$default(this, str, null, 2, null);
    }

    @JvmOverloads
    @Nullable
    public final String readLocal(@NotNull String key, @Nullable String customApi) {
        List<Interceptor<?, ?>> list = globalInterceptors;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof GetInterceptor) {
                arrayList.add(obj);
            }
        }
        LocalProperty localProperty = (LocalProperty) InterceptorKt.call(arrayList, new GetInterceptor.Param(key, customApi), e.a);
        if (localProperty == null) {
            return null;
        }
        return localProperty.getValue();
    }

    public final void registerFetchProperties(@NotNull List<? extends AbsFetchParams> properties) {
        List<AbsFetchParams> list = registerFetchProperties;
        list.clear();
        list.addAll(properties);
    }

    public final void registerInterceptor(@NotNull Interceptor<?, ?> interceptor) {
        globalInterceptors.add(interceptor);
    }

    @JvmOverloads
    public final void saveLocal(@NotNull String str, @Nullable String str2) {
        saveLocal$default(this, str, null, str2, 2, null);
    }

    @JvmOverloads
    public final void saveLocal(@NotNull String key, @Nullable String customApi, @Nullable String value) {
        List<Interceptor<?, ?>> list = globalInterceptors;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SetInterceptor) {
                arrayList.add(obj);
            }
        }
        InterceptorKt.call(arrayList, new SetInterceptor.Params(key, value, customApi), f.a);
    }

    @Deprecated(message = "针对于保存在本地 property 但不使用同步的场景。建议该场景直接使用 KvKit")
    @JvmOverloads
    public final void saveLocalExcludeSync(@NotNull String str, @Nullable String str2) {
        saveLocalExcludeSync$default(this, str, null, str2, 2, null);
    }

    @Deprecated(message = "针对于保存在本地 property 但不使用同步的场景。建议该场景直接使用 KvKit")
    @JvmOverloads
    public final void saveLocalExcludeSync(@NotNull String key, @Nullable String customApi, @Nullable String value) {
        g().saveLocal(key, customApi, value);
        h().execute(key, customApi, value);
    }

    public final void schedulePushAll() {
        PushThrottleManager.INSTANCE.scheduleNextPush(g.a);
    }

    public final void setDefaultApi(@NotNull Function0<String> baseUrlProvider) {
        defaultBaseUrlProvider = baseUrlProvider;
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public final ResultFuture<FetchResult<String>> singleFetch(@NotNull String str) {
        return singleFetch$default(this, str, null, 2, null);
    }

    @CheckResult
    @JvmOverloads
    @NotNull
    public final ResultFuture<FetchResult<String>> singleFetch(@NotNull String key, @Nullable String api) {
        return SimpleResultFuture.INSTANCE.createFuture(new h(key, api, null));
    }

    @CheckResult
    @NotNull
    public final ResultFuture<BatchPushResult> batchPush(@NotNull List<? extends UserProperty<?>> userProperties) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = userProperties.iterator();
        while (it2.hasNext()) {
            UserProperty userProperty = (UserProperty) it2.next();
            InternalLocalDataSource internalLocalDataSourceG = INSTANCE.g();
            String key = userProperty.getKey();
            Function0<String> function0CustomApi = userProperty.customApi();
            LocalProperty local = internalLocalDataSourceG.readLocal(key, function0CustomApi == null ? null : function0CustomApi.invoke());
            if (local != null) {
                arrayList.add(local);
            }
        }
        return pushAll(arrayList);
    }
}
