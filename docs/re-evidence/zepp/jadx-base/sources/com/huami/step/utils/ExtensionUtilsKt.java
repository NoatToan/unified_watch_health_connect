package com.huami.step.utils;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.model.UserOfStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¨\u0006\u0007"}, d2 = {"", "", "isReverse", "millsToSecond", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "", "identifiedEvent", "step_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionUtilsKt {
    public static final void identifiedEvent(@NotNull CountEventBuilder countEventBuilder) {
        UserOfStep userOfStep = KoinExtKt.getUserOfStep();
        if (Intrinsics.areEqual(userOfStep == null ? null : Boolean.valueOf(userOfStep.isOversea()), Boolean.FALSE)) {
            countEventBuilder.setAnonymous(false);
            countEventBuilder.setIdentified(true);
        }
        Analytics.recordEvent(countEventBuilder);
    }

    public static final long millsToSecond(long j, boolean z) {
        if (z) {
            return String.valueOf(j).length() == 10 ? j * ((long) 1000) : j;
        }
        return String.valueOf(j).length() == 13 ? j / ((long) 1000) : j;
    }

    public static /* synthetic */ long millsToSecond$default(long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return millsToSecond(j, z);
    }
}
