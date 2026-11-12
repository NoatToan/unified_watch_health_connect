package com.xiaomi.fitness.health.curse.view;

import com.xiaomi.fitness.health.curse.data.CurseFactor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TAG_L", "", "bgColor", "", "factor", "Lcom/xiaomi/fitness/health/curse/data/CurseFactor;", "SOURCE_RECORD", "SOURCE_INFO", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SymRangeViewKt {
    public static final int SOURCE_INFO = 2;
    public static final int SOURCE_RECORD = 1;

    @NotNull
    private static final String TAG_L = "SymptomPeriodView";

    public static final int bgColor(@NotNull CurseFactor factor) {
        Intrinsics.checkNotNullParameter(factor, "factor");
        if (factor instanceof CurseFactor.Hurt) {
            return 444630271;
        }
        if (factor instanceof CurseFactor.Blood) {
            return 452940428;
        }
        if (factor instanceof CurseFactor.Motion) {
            return 436263871;
        }
        throw new NoWhenBranchMatchedException();
    }
}
