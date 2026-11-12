package com.huami.userproperty.service.datasource;

import androidx.exifinterface.media.ExifInterface;
import com.huami.userproperty.service.UserProperty;
import com.huami.userproperty.service.interceptor.GetInterceptor;
import com.huami.userproperty.service.interceptor.SetInterceptor;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\f\u0010\rJ=\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/userproperty/service/datasource/LocalDataSource;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/UserProperty;", "property", "value", "", "registryApi", "", "Lcom/huami/userproperty/service/interceptor/SetInterceptor;", "interceptors", "", WatchFaceArrivingEvent.CMD_SET, "(Lcom/huami/userproperty/service/UserProperty;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V", "Lcom/huami/userproperty/service/interceptor/GetInterceptor;", "get", "(Lcom/huami/userproperty/service/UserProperty;Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {1, 5, 1})
public interface LocalDataSource {
    @Nullable
    <T> T get(@NotNull UserProperty<T> property, @Nullable String registryApi, @NotNull List<? extends GetInterceptor> interceptors);

    <T> void set(@NotNull UserProperty<T> property, @Nullable T value, @Nullable String registryApi, @NotNull List<? extends SetInterceptor> interceptors);
}
