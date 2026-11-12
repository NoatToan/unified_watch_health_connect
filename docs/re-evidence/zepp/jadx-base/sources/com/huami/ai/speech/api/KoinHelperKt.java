package com.huami.ai.speech.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lorg/koin/core/KoinApplication;", "a", "Lorg/koin/core/KoinApplication;", "getKoinApp", "()Lorg/koin/core/KoinApplication;", "koinApp", "Lorg/koin/core/Koin;", "b", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "koin", "speech-api_release"}, k = 2, mv = {1, 5, 1})
public final class KoinHelperKt {

    @NotNull
    private static final KoinApplication a;

    @NotNull
    private static final Koin b;

    static {
        GlobalContext globalContext = GlobalContext.INSTANCE;
        KoinApplication koinApplicationOrNull = globalContext.getKoinApplicationOrNull();
        if (koinApplicationOrNull == null) {
            throw new IllegalStateException("KoinApplication has not been started".toString());
        }
        a = koinApplicationOrNull;
        b = globalContext.get();
    }

    @NotNull
    public static final Koin getKoin() {
        return b;
    }

    @NotNull
    public static final KoinApplication getKoinApp() {
        return a;
    }
}
