package com.huami.nfc.web.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/http/HttpComponent;", "", "Lcom/huami/nfc/web/http/HttpEngine;", "getEngine", "web_release"}, k = 1, mv = {1, 5, 1})
public interface HttpComponent {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static HttpEngine getEngine(@NotNull HttpComponent httpComponent) {
            return (HttpEngine) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HttpEngine.class), null, null);
        }
    }

    @NotNull
    HttpEngine getEngine();
}
