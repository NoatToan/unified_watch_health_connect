package com.huami.account.service.proxy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/huami/account/service/proxy/KoinComponentAdapter;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "service_release"}, k = 1, mv = {1, 5, 1})
public interface KoinComponentAdapter extends com.huami.koinstartup.KoinComponentAdapter {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static Koin getKoin(@NotNull KoinComponentAdapter koinComponentAdapter) {
            return com.huami.koinstartup.KoinComponentAdapter.DefaultImpls.getKoin(koinComponentAdapter);
        }
    }
}
