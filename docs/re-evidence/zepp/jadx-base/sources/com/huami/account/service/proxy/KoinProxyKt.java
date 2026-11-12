package com.huami.account.service.proxy;

import com.huami.koinstartup.KoinAdapterKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0002"}, d2 = {"Lorg/koin/core/Koin;", "getKoinProxy", "service_release"}, k = 2, mv = {1, 5, 1})
public final class KoinProxyKt {
    @NotNull
    public static final Koin getKoinProxy() {
        return KoinAdapterKt.getKoinProxy();
    }
}
