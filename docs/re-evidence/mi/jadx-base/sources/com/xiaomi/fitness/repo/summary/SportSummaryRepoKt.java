package com.xiaomi.fitness.repo.summary;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TAG_L", "", "TRIGGERS", "", "getTRIGGERS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "SUMMARY_TEST", "", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportSummaryRepoKt {
    private static final boolean SUMMARY_TEST = false;

    @NotNull
    private static final String TAG_L = "SRecordSummaryRepo";

    @NotNull
    private static final String[] TRIGGERS = {"update", "delete", "insert"};

    @NotNull
    public static final String[] getTRIGGERS() {
        return TRIGGERS;
    }
}
