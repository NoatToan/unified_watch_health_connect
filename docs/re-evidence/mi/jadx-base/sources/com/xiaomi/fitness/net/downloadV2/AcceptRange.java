package com.xiaomi.fitness.net.downloadV2;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/AcceptRange;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "none", "BYTE", "PAGE", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum AcceptRange {
    none("none"),
    BYTE("bytes"),
    PAGE("pages");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    AcceptRange(String str) {
    }

    @NotNull
    public static EnumEntries<AcceptRange> getEntries() {
        return $ENTRIES;
    }
}
