package com.huami.http;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Lcom/huami/http/HttpBuildScope;", "", "Lkotlin/ExtensionFunctionType;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setupHttpKit", "httpkit_release"}, k = 2, mv = {1, 5, 1})
public final class HttpKitKt {
    public static final void setupHttpKit(@NotNull Function1<? super HttpBuildScope, Unit> function1) {
        HttpKitContext httpKitContext = HttpKitContext.INSTANCE;
        HttpBuildScope httpBuildScope = new HttpBuildScope();
        function1.invoke(httpBuildScope);
        httpKitContext.setup(httpBuildScope);
    }
}
