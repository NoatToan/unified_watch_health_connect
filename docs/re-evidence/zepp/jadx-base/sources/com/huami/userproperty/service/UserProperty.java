package com.huami.userproperty.service;

import androidx.annotation.CheckResult;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.userproperty.service.entity.remote.FetchResult;
import com.huami.userproperty.service.entity.remote.PushResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tH'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH'J\u0016\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0016R\u0016\u0010\u0014\u001a\u00020\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/huami/userproperty/service/UserProperty;", SportAnalytics.ParamKey.DATA_TYPE, "", "get", "()Ljava/lang/Object;", "value", "", WatchFaceArrivingEvent.CMD_SET, "(Ljava/lang/Object;)V", "Lcom/huami/userproperty/service/entity/remote/ResultFuture;", "Lcom/huami/userproperty/service/entity/remote/FetchResult;", RemoteConfigComponent.FETCH_FILE_NAME, "Lcom/huami/userproperty/service/entity/remote/PushResult;", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "Lkotlin/Function0;", "", "Lcom/huami/userproperty/service/BaseUrlProvider;", "customApi", "getKey", "()Ljava/lang/String;", "key", "service_release"}, k = 1, mv = {1, 5, 1})
public interface UserProperty<DataType> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static <DataType> Function0<String> customApi(@NotNull UserProperty<DataType> userProperty) {
            return null;
        }
    }

    @Nullable
    Function0<String> customApi();

    @CheckResult
    @NotNull
    ResultFuture<FetchResult<DataType>> fetch();

    @Nullable
    DataType get();

    @NotNull
    String getKey();

    @CheckResult
    @NotNull
    ResultFuture<PushResult> push();

    void set(@Nullable DataType value);
}
