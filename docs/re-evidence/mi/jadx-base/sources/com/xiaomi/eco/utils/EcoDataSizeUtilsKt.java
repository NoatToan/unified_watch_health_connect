package com.xiaomi.eco.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"MEMORY_SIZE_100KB", "", "memorySize", "", "eco-common-connect_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDataSizeUtilsKt {
    public static final int MEMORY_SIZE_100KB = 100000;

    public static final int memorySize(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }
}
