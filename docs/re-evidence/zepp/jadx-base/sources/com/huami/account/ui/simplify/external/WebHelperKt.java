package com.huami.account.ui.simplify.external;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001c\u0010\u0005\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/Koin;", "a", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "koin", "accountui-simplify_release"}, k = 2, mv = {1, 4, 1})
public final class WebHelperKt {

    @NotNull
    private static final Koin a = GlobalContext.get().getKoin();

    @NotNull
    public static final Koin getKoin() {
        return a;
    }
}
