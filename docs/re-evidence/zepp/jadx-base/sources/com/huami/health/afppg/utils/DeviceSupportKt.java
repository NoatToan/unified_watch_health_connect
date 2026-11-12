package com.huami.health.afppg.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\"\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"", "", "supportHLHR", "", "a", "Ljava/util/List;", "devicesSupportHLHR", "afppg-core_release"}, k = 2, mv = {1, 5, 1})
public final class DeviceSupportKt {

    @NotNull
    private static final List<Integer> a = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{11, 19, 33, 23, 32, 84, 85, 90, 96, 97, 72, 55, 205, 204, 202, 203});

    public static final boolean supportHLHR(int i) {
        return a.contains(Integer.valueOf(i));
    }
}
