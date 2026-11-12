package org.koin.dsl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.KoinApplication;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u00012!\b\u0002\u0010\u0005\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003¢\u0006\u0002\b\u0004*,\u0010\u0007\"\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00042\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0004¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lorg/koin/core/KoinApplication;", "", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "appDeclaration", "koinApplication", "KoinAppDeclaration", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class KoinApplicationKt {
    @NotNull
    public static final KoinApplication koinApplication(@Nullable Function1<? super KoinApplication, Unit> function1) {
        KoinApplication koinApplicationInit = KoinApplication.INSTANCE.init();
        if (function1 != null) {
            function1.invoke(koinApplicationInit);
        }
        return koinApplicationInit;
    }

    public static /* synthetic */ KoinApplication koinApplication$default(Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return koinApplication(function1);
    }
}
