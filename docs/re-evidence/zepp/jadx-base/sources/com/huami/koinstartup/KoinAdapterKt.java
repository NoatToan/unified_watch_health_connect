package com.huami.koinstartup;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"Lorg/koin/core/Koin;", "getKoinProxy", "Lorg/koin/core/KoinApplication;", "getKoinApplicationProxyOrNull", "koinstartup_release"}, k = 2, mv = {1, 5, 1})
public final class KoinAdapterKt {
    @Nullable
    public static final KoinApplication getKoinApplicationProxyOrNull() {
        return GlobalContext.INSTANCE.getKoinApplicationOrNull();
    }

    @NotNull
    public static final Koin getKoinProxy() {
        return GlobalContext.INSTANCE.get();
    }
}
