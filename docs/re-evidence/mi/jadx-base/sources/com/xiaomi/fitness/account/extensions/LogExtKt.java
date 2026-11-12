package com.xiaomi.fitness.account.extensions;

import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ACCOUNT_TAG", "", "logi", "", "msg", "safePrintI", "account_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LogExtKt {

    @NotNull
    public static final String ACCOUNT_TAG = "Account";

    public static final void logi(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(ACCOUNT_TAG, msg);
    }

    public static final void safePrintI(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
