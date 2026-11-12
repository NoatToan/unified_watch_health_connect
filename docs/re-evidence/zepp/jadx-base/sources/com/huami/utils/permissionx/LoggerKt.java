package com.huami.utils.permissionx;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/huami/utils/permissionx/Logger;", "a", "Lcom/huami/utils/permissionx/Logger;", "getLogger", "()Lcom/huami/utils/permissionx/Logger;", "logger", "permissionx_release"}, k = 2, mv = {1, 5, 1})
public final class LoggerKt {

    @Nullable
    private static final Logger a = PermissionX.INSTANCE.getLogger();

    @Nullable
    public static final Logger getLogger() {
        return a;
    }
}
