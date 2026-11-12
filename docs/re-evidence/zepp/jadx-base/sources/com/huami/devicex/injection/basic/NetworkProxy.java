package com.huami.devicex.injection.basic;

import androidx.annotation.WorkerThread;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H'J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'J \u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'J(\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H'¨\u0006\u000e"}, d2 = {"Lcom/huami/devicex/injection/basic/NetworkProxy;", "", "", "url", "", "queryParams", "Lcom/huami/network/base/model/HMHttpResponseData;", "get", "body", "Lcom/huami/devicex/injection/basic/ContentType;", CameraActivity.KEY_CONTENT_TYPE, DataItem.HTTP_METHOD_POST, DataItem.HTTP_METHOD_PUT, "delete", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface NetworkProxy {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMHttpResponseData delete$default(NetworkProxy networkProxy, String str, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return networkProxy.delete(str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HMHttpResponseData get$default(NetworkProxy networkProxy, String str, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return networkProxy.get(str, map);
        }
    }

    @WorkerThread
    @NotNull
    HMHttpResponseData delete(@NotNull String url, @Nullable Map<String, ? extends Object> queryParams);

    @WorkerThread
    @NotNull
    HMHttpResponseData get(@NotNull String url, @Nullable Map<String, ? extends Object> queryParams);

    @WorkerThread
    @NotNull
    HMHttpResponseData post(@NotNull String url, @NotNull String body, @NotNull ContentType contentType);

    @WorkerThread
    @NotNull
    HMHttpResponseData put(@NotNull String url, @NotNull String body, @NotNull ContentType contentType);
}
