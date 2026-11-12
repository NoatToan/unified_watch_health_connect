package com.xiaomi.fitness.milink;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/milink/MilinkConstants;", "", "<init>", "()V", "localOnlyProtocolTypes", "", "", "getLocalOnlyProtocolTypes", "()Ljava/util/List;", "fullProtocolTypes", "getFullProtocolTypes", "fullPadProtocolTypes", "getFullPadProtocolTypes", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MilinkConstants {

    @NotNull
    public static final MilinkConstants INSTANCE = new MilinkConstants();

    @NotNull
    private static final List<Integer> localOnlyProtocolTypes = CollectionsKt__CollectionsKt.mutableListOf(393216, 65536);

    @NotNull
    private static final List<Integer> fullProtocolTypes = CollectionsKt__CollectionsKt.mutableListOf(393216, 65536, 327680);

    @NotNull
    private static final List<Integer> fullPadProtocolTypes = CollectionsKt__CollectionsKt.mutableListOf(65536, 327680);

    private MilinkConstants() {
    }

    @NotNull
    public final List<Integer> getFullPadProtocolTypes() {
        return fullPadProtocolTypes;
    }

    @NotNull
    public final List<Integer> getFullProtocolTypes() {
        return fullProtocolTypes;
    }

    @NotNull
    public final List<Integer> getLocalOnlyProtocolTypes() {
        return localOnlyProtocolTypes;
    }
}
