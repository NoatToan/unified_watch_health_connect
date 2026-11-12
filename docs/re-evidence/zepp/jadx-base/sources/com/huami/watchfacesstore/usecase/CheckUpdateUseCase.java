package com.huami.watchfacesstore.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0086\u0002¨\u0006\t"}, d2 = {"Lcom/huami/watchfacesstore/usecase/CheckUpdateUseCase;", "", "", "currentVersion", "localVersion", "", "invoke", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CheckUpdateUseCase {
    public final boolean invoke(@Nullable String currentVersion, @Nullable String localVersion) {
        if (localVersion == null) {
            return false;
        }
        if (currentVersion == null || currentVersion.length() == 0) {
            return false;
        }
        return !Intrinsics.areEqual(currentVersion, localVersion);
    }
}
