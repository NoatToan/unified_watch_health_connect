package com.huami.watchfacesstore.api;

import com.huami.http.HttpKitContext;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/huami/http/HttpKitContext;", "", "key", "Lokhttp3/OkHttpClient;", "getClientOrNull", "a", "Ljava/lang/String;", "KEY", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class WatchFaceHttpKitKt {

    @NotNull
    private static final String a = "_￥_WatchFace";

    @Nullable
    public static final OkHttpClient getClientOrNull(@NotNull HttpKitContext httpKitContext, @NotNull String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(httpKitContext.getClientOrThrow(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (OkHttpClient) objM3845constructorimpl;
    }
}
