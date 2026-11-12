package com.huami.userproperty.repo.impl;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.datasource.InternalLocalDataSource;
import com.huami.userproperty.datasource.impl.SerializeHelper;
import com.huami.userproperty.datasource.impl.SerializeHelperKt;
import com.huami.userproperty.entity.ParseResult;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.datasource.LocalDataSource;
import com.huami.userproperty.service.datasource.RemoteDataSource;
import com.huami.userproperty.service.entity.local.LastSyncProperty;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.userproperty.service.interceptor.FetchInterceptor;
import com.huami.userproperty.service.interceptor.GetInterceptor;
import com.huami.userproperty.service.interceptor.PushInterceptor;
import com.huami.userproperty.service.interceptor.SetInterceptor;
import com.huami.userproperty.service.repo.UserPropertyRepo;
import com.huami.userproperty.usecase.SaveFetchResultUseCase;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\b1\u00102J4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J>\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0004\b\u0000\u0010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001fR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/huami/userproperty/repo/impl/UserPropertyRepoImpl;", "Lcom/huami/userproperty/service/repo/UserPropertyRepo;", "Lcom/huami/userproperty/service/datasource/LocalDataSource;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/entity/ParseResult;", "parsed", "", "propertyKey", "rawValue", "Lcom/huami/userproperty/service/entity/remote/FetchResult$Success;", "a", "Lcom/huami/userproperty/service/UserProperty;", "property", "registryApi", "", "Lcom/huami/userproperty/service/interceptor/GetInterceptor;", "interceptors", "get", "(Lcom/huami/userproperty/service/UserProperty;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "value", "Lcom/huami/userproperty/service/interceptor/SetInterceptor;", "", WatchFaceArrivingEvent.CMD_SET, "(Lcom/huami/userproperty/service/UserProperty;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V", "Lcom/huami/userproperty/service/interceptor/FetchInterceptor;", "registryInterceptors", "Lkotlin/Function0;", "Lcom/huami/userproperty/service/BaseUrlProvider;", "registryUrlProvider", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lcom/huami/userproperty/service/UserProperty;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/userproperty/service/interceptor/PushInterceptor;", "Lcom/huami/userproperty/service/entity/remote/PushResult;", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "Lcom/huami/userproperty/service/datasource/LocalDataSource;", "localDataSource", "Lcom/huami/userproperty/service/datasource/RemoteDataSource;", "b", "Lcom/huami/userproperty/service/datasource/RemoteDataSource;", "remoteDataSource", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "c", "Lcom/huami/userproperty/datasource/InternalLocalDataSource;", "internalLocalDataSource", "Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;", GoogleApiAvailabilityLight.a, "Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;", "saveFetchResultUseCase", "<init>", "(Lcom/huami/userproperty/service/datasource/LocalDataSource;Lcom/huami/userproperty/service/datasource/RemoteDataSource;Lcom/huami/userproperty/datasource/InternalLocalDataSource;Lcom/huami/userproperty/usecase/SaveFetchResultUseCase;)V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class UserPropertyRepoImpl implements UserPropertyRepo, LocalDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource localDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RemoteDataSource remoteDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final InternalLocalDataSource internalLocalDataSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SaveFetchResultUseCase saveFetchResultUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.repo.impl.UserPropertyRepoImpl", f = "UserPropertyRepoImpl.kt", i = {0, 0, 0}, l = {39}, m = RemoteConfigComponent.FETCH_FILE_NAME, n = {"this", "property", "registryUrlProvider"}, s = {"L$0", "L$1", "L$2"})
    public static final class a<T> extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return UserPropertyRepoImpl.this.fetch(null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "key: " + this.a + " -> 拉取成功解析失败： " + ((Object) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "key: " + this.a + " -> 拉取成功 json 为空";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.userproperty.repo.impl.UserPropertyRepoImpl", f = "UserPropertyRepoImpl.kt", i = {}, l = {99}, m = MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, n = {}, s = {})
    public static final class d<T> extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return UserPropertyRepoImpl.this.push(null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ UserProperty<T> b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, UserProperty<T> userProperty, String str2) {
            super(0);
            this.a = str;
            this.b = userProperty;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("Push 无效上传跳过: key=");
            sb.append(this.a);
            sb.append(", api=");
            Function0<String> function0CustomApi = this.b.customApi();
            sb.append((Object) (function0CustomApi == null ? null : function0CustomApi.invoke()));
            sb.append(", value=");
            sb.append((Object) this.c);
            return sb.toString();
        }
    }

    public UserPropertyRepoImpl(@NotNull LocalDataSource localDataSource, @NotNull RemoteDataSource remoteDataSource, @NotNull InternalLocalDataSource internalLocalDataSource, @NotNull SaveFetchResultUseCase saveFetchResultUseCase) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
        this.internalLocalDataSource = internalLocalDataSource;
        this.saveFetchResultUseCase = saveFetchResultUseCase;
    }

    private final <T> FetchResult.Success<T> a(ParseResult<T> parsed, String propertyKey, String rawValue) {
        if (parsed instanceof ParseResult.Success) {
            return new FetchResult.Success<>(((ParseResult.Success) parsed).getValue());
        }
        if (parsed instanceof ParseResult.Failed.ParseFailed) {
            HMLog.info(UserPropertyModuleKt.MODULE_TAG, new b(propertyKey, rawValue));
            return new FetchResult.Success<>(null);
        }
        if (!(parsed instanceof ParseResult.Failed.JsonEmpty)) {
            throw new NoWhenBranchMatchedException();
        }
        HMLog.info(UserPropertyModuleKt.MODULE_TAG, new c(propertyKey));
        return new FetchResult.Success<>(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.userproperty.service.repo.UserPropertyRepo
    @Nullable
    public <T> Object fetch(@NotNull UserProperty<T> userProperty, @NotNull List<? extends FetchInterceptor> list, @Nullable Function0<String> function0, @NotNull Continuation<? super FetchResult<T>> continuation) {
        a aVar;
        UserPropertyRepoImpl userPropertyRepoImpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objFetch = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFetch);
            RemoteDataSource remoteDataSource = this.remoteDataSource;
            String key = userProperty.getKey();
            aVar.a = this;
            aVar.b = userProperty;
            aVar.c = function0;
            aVar.f = 1;
            objFetch = remoteDataSource.fetch(key, list, function0, aVar);
            if (objFetch == coroutine_suspended) {
                return coroutine_suspended;
            }
            userPropertyRepoImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) aVar.c;
            userProperty = (UserProperty) aVar.b;
            userPropertyRepoImpl = (UserPropertyRepoImpl) aVar.a;
            ResultKt.throwOnFailure(objFetch);
        }
        FetchResult fetchResult = (FetchResult) objFetch;
        String strInvoke = function0 == null ? null : function0.invoke();
        if (!(fetchResult instanceof FetchResult.Success)) {
            if (fetchResult instanceof FetchResult.Failed) {
                return new FetchResult.Failed(((FetchResult.Failed) fetchResult).getErrorCode());
            }
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) ((FetchResult.Success) fetchResult).getValue();
        String str = map != null ? (String) map.get(userProperty.getKey()) : null;
        ParseResult<T> parseResult = SerializeHelper.INSTANCE.parse(SerializeHelperKt.getFirstTypeParam(userProperty), str);
        userPropertyRepoImpl.saveFetchResultUseCase.execute(userProperty.getKey(), strInvoke, str);
        return userPropertyRepoImpl.a(parseResult, userProperty.getKey(), str);
    }

    @Override // com.huami.userproperty.service.datasource.LocalDataSource
    @Nullable
    public <T> T get(@NotNull UserProperty<T> property, @Nullable String registryApi, @NotNull List<? extends GetInterceptor> interceptors) {
        return (T) this.localDataSource.get(property, registryApi, interceptors);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.userproperty.service.repo.UserPropertyRepo
    @Nullable
    public <T> Object push(@NotNull UserProperty<T> userProperty, @NotNull List<? extends PushInterceptor> list, @Nullable Function0<String> function0, @NotNull Continuation<? super PushResult> continuation) {
        d dVar;
        UserPropertyRepoImpl userPropertyRepoImpl;
        String str;
        String str2;
        String str3;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.g = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object obj = dVar2.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar2.g;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String key = userProperty.getKey();
            String strInvoke = function0 == null ? null : function0.invoke();
            LastSyncProperty lastSync = this.internalLocalDataSource.readLastSync(key, strInvoke);
            String stringOrJson = SerializeHelper.INSTANCE.toStringOrJson(userProperty.get());
            if (lastSync != null && Intrinsics.areEqual(lastSync.getValue(), stringOrJson)) {
                HMLog.verbose(UserPropertyModuleKt.MODULE_TAG, new e(key, userProperty, stringOrJson));
                return PushResult.Success.INSTANCE;
            }
            RemoteDataSource remoteDataSource = this.remoteDataSource;
            dVar2.a = this;
            dVar2.b = key;
            dVar2.c = strInvoke;
            dVar2.d = stringOrJson;
            dVar2.g = 1;
            Object objPush = remoteDataSource.push(key, stringOrJson, list, function0, dVar2);
            if (objPush == coroutine_suspended) {
                return coroutine_suspended;
            }
            userPropertyRepoImpl = this;
            str = key;
            str2 = strInvoke;
            obj = objPush;
            str3 = stringOrJson;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) dVar2.d;
            str2 = (String) dVar2.c;
            str = (String) dVar2.b;
            userPropertyRepoImpl = (UserPropertyRepoImpl) dVar2.a;
            ResultKt.throwOnFailure(obj);
        }
        PushResult pushResult = (PushResult) obj;
        if (pushResult instanceof PushResult.Success) {
            userPropertyRepoImpl.saveFetchResultUseCase.execute(str, str2, str3);
        }
        return pushResult;
    }

    @Override // com.huami.userproperty.service.datasource.LocalDataSource
    public <T> void set(@NotNull UserProperty<T> property, @Nullable T value, @Nullable String registryApi, @NotNull List<? extends SetInterceptor> interceptors) {
        this.localDataSource.set(property, value, registryApi, interceptors);
    }
}
