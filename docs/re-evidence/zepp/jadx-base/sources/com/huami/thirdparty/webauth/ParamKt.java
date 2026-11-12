package com.huami.thirdparty.webauth;

import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/huami/thirdparty/webauth/Param$Builder;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "Lcom/huami/thirdparty/webauth/Param;", "param", "webauth_release"}, k = 2, mv = {1, 4, 1})
public final class ParamKt {
    @NotNull
    public static final Param param(@NotNull Function1<? super Param.Builder, Unit> function1) {
        Param.Builder builder = new Param.Builder();
        function1.invoke(builder);
        return builder.build();
    }
}
