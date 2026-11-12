package com.huami.userproperty.service.repo;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.datasource.LocalDataSource;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.userproperty.service.interceptor.FetchInterceptor;
import com.huami.userproperty.service.interceptor.PushInterceptor;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JQ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/userproperty/service/repo/UserPropertyRepo;", "Lcom/huami/userproperty/service/datasource/LocalDataSource;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/UserProperty;", "property", "", "Lcom/huami/userproperty/service/interceptor/FetchInterceptor;", "registryInterceptors", "Lkotlin/Function0;", "", "Lcom/huami/userproperty/service/BaseUrlProvider;", "registryUrlProvider", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lcom/huami/userproperty/service/UserProperty;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/userproperty/service/interceptor/PushInterceptor;", "Lcom/huami/userproperty/service/entity/remote/PushResult;", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "service_release"}, k = 1, mv = {1, 5, 1})
public interface UserPropertyRepo extends LocalDataSource {
    @Nullable
    <T> Object fetch(@NotNull UserProperty<T> userProperty, @NotNull List<? extends FetchInterceptor> list, @Nullable Function0<String> function0, @NotNull Continuation<? super FetchResult<T>> continuation);

    @Nullable
    <T> Object push(@NotNull UserProperty<T> userProperty, @NotNull List<? extends PushInterceptor> list, @Nullable Function0<String> function0, @NotNull Continuation<? super PushResult> continuation);
}
