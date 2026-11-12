package com.huami.userproperty.datasource.impl;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.userproperty.UserPropertyModuleKt;
import com.huami.userproperty.api.UserPropertyApi;
import com.huami.userproperty.service.datasource.RemoteDataSource;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.userproperty.service.interceptor.FetchInterceptor;
import com.huami.userproperty.service.interceptor.InterceptorKt;
import com.huami.userproperty.service.interceptor.PushInterceptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J0\u0010\u0007\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002JS\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u0006\u0010\b\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/userproperty/datasource/impl/RemoteDataSourceImpl;", "Lcom/huami/userproperty/service/datasource/RemoteDataSource;", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "", "key", "a", "b", "propertyKey", "", "Lcom/huami/userproperty/service/interceptor/FetchInterceptor;", "interceptors", "Lkotlin/Function0;", "Lcom/huami/userproperty/service/BaseUrlProvider;", "registryUrlProvider", RemoteConfigComponent.FETCH_FILE_NAME, "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "Lcom/huami/userproperty/service/interceptor/PushInterceptor;", "Lcom/huami/userproperty/service/entity/remote/PushResult;", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "userproperty_release"}, k = 1, mv = {1, 5, 1})
public final class RemoteDataSourceImpl implements RemoteDataSource {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ FetchResult<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FetchResult<String> fetchResult) {
            super(0);
            this.a = str;
            this.b = fetchResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetch -> [key = " + this.a + ", result = " + this.b + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/userproperty/service/interceptor/FetchInterceptor$Params;", "it", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<FetchInterceptor.Params, FetchResult<String>> {
        public final /* synthetic */ FetchInterceptor.Params b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FetchInterceptor.Params params) {
            super(1);
            this.b = params;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FetchResult<String> invoke(@NotNull FetchInterceptor.Params params) {
            return RemoteDataSourceImpl.this.a(UserPropertyApi.INSTANCE.fetch(this.b.getKey(), this.b.getMode(), this.b.getApi()), this.b.getKey());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/userproperty/service/interceptor/PushInterceptor$Params;", "it", "Lcom/huami/userproperty/service/entity/remote/PushResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<PushInterceptor.Params, PushResult> {
        public final /* synthetic */ PushInterceptor.Params a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PushInterceptor.Params params) {
            super(1);
            this.a = params;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PushResult invoke(@NotNull PushInterceptor.Params params) {
            return UserPropertyApi.INSTANCE.push(this.a.getKey(), this.a.getValue(), this.a.getApi());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FetchResult<String> a(FetchResult<Map<String, String>> fetchResult, String str) {
        if (fetchResult instanceof FetchResult.Failed) {
            return new FetchResult.Failed(((FetchResult.Failed) fetchResult).getErrorCode());
        }
        if (!(fetchResult instanceof FetchResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Map map = (Map) ((FetchResult.Success) fetchResult).getValue();
        return new FetchResult.Success(map == null ? null : (String) map.get(str));
    }

    private final FetchResult<Map<String, String>> b(FetchResult<String> fetchResult, String str) {
        if (fetchResult instanceof FetchResult.Failed) {
            return new FetchResult.Failed(((FetchResult.Failed) fetchResult).getErrorCode());
        }
        if (fetchResult instanceof FetchResult.Success) {
            return new FetchResult.Success(q.mapOf(TuplesKt.to(str, ((FetchResult.Success) fetchResult).getValue())));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.huami.userproperty.service.datasource.RemoteDataSource
    @Nullable
    public Object fetch(@NotNull String str, @NotNull List<? extends FetchInterceptor> list, @Nullable Function0<String> function0, @NotNull Continuation<? super FetchResult<Map<String, String>>> continuation) {
        UserPropertyManager userPropertyManager = UserPropertyManager.INSTANCE;
        Function0<String> defaultApi = userPropertyManager.getDefaultApi();
        if (function0 == null) {
            function0 = defaultApi;
        }
        String strInvoke = function0.invoke();
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) userPropertyManager.getGlobalInterceptors$userproperty_release(), (Iterable) list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPlus) {
            if (obj instanceof FetchInterceptor) {
                arrayList.add(obj);
            }
        }
        List list2 = CollectionsKt___CollectionsKt.toList(arrayList);
        FetchInterceptor.Params params = new FetchInterceptor.Params(str, "SINGLE", strInvoke);
        FetchResult<String> fetchResult = (FetchResult) InterceptorKt.call(list2, params, new b(params));
        HMLog.debug(UserPropertyModuleKt.MODULE_TAG, new a(str, fetchResult));
        return b(fetchResult, str);
    }

    @Override // com.huami.userproperty.service.datasource.RemoteDataSource
    @Nullable
    public Object push(@NotNull String str, @Nullable String str2, @NotNull List<? extends PushInterceptor> list, @Nullable Function0<String> function0, @NotNull Continuation<? super PushResult> continuation) {
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) UserPropertyManager.INSTANCE.getGlobalInterceptors$userproperty_release(), (Iterable) list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPlus) {
            if (obj instanceof PushInterceptor) {
                arrayList.add(obj);
            }
        }
        List list2 = CollectionsKt___CollectionsKt.toList(arrayList);
        if (function0 == null) {
            function0 = UserPropertyManager.INSTANCE.getDefaultApi();
        }
        PushInterceptor.Params params = new PushInterceptor.Params(str, "SINGLE", str2, function0.invoke());
        return InterceptorKt.call(list2, params, new c(params));
    }
}
