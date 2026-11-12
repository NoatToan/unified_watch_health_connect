package com.xiaomi.fitness.net.response;

import com.xiaomi.onetrack.api.b;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J!\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u00072\u0006\u0010\t\u001a\u0002H\bH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/net/response/HttpResultHandler;", "", "handleError", "Lcom/xiaomi/fitness/net/response/ApiException;", "error", "", "handleResponse", "R", "T", b.I, "(Ljava/lang/Object;)Ljava/lang/Object;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HttpResultHandler {
    @NotNull
    ApiException handleError(@NotNull Throwable error);

    <T, R> R handleResponse(T response) throws IOException;
}
