package com.huami.watchfacesstore.api;

import com.huami.http.HttpError;
import kotlin.Metadata;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lokhttp3/Response;", "", "checkSuccessfulOrThrow", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class ResponseExtKt {
    public static final boolean checkSuccessfulOrThrow(@NotNull Response response) throws HttpError {
        if (response.isSuccessful()) {
            return true;
        }
        throw new HttpError(response);
    }
}
