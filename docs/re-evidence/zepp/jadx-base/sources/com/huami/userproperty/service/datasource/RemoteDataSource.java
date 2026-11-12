package com.huami.userproperty.service.datasource;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.userproperty.service.interceptor.FetchInterceptor;
import com.huami.userproperty.service.interceptor.PushInterceptor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JS\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007j\u0004\u0018\u0001`\bH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJI\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007j\u0004\u0018\u0001`\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/userproperty/service/datasource/RemoteDataSource;", "", "", "propertyKey", "", "Lcom/huami/userproperty/service/interceptor/FetchInterceptor;", "interceptors", "Lkotlin/Function0;", "Lcom/huami/userproperty/service/BaseUrlProvider;", "registryUrlProvider", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", RemoteConfigComponent.FETCH_FILE_NAME, "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "Lcom/huami/userproperty/service/interceptor/PushInterceptor;", "Lcom/huami/userproperty/service/entity/remote/PushResult;", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {1, 5, 1})
public interface RemoteDataSource {
    @Nullable
    Object fetch(@NotNull String str, @NotNull List<? extends FetchInterceptor> list, @Nullable Function0<String> function0, @NotNull Continuation<? super FetchResult<Map<String, String>>> continuation);

    @Nullable
    Object push(@NotNull String str, @Nullable String str2, @NotNull List<? extends PushInterceptor> list, @Nullable Function0<String> function0, @NotNull Continuation<? super PushResult> continuation);
}
