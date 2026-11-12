package com.huami.bloodpressure_ui.ext;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\b\u001a\u0017\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"", "sbp", "getAvgSbpStatus", "(Ljava/lang/Integer;)I", "dbp", "getAvgDbpStatus", "getMaxSbpStatus", "getMaxDbpStatus", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureExKt {
    public static final int getAvgDbpStatus(@Nullable Integer num) {
        return 0;
    }

    public static final int getAvgSbpStatus(@Nullable Integer num) {
        return 0;
    }

    public static final int getMaxDbpStatus(@Nullable Integer num) {
        return getAvgDbpStatus(num);
    }

    public static final int getMaxSbpStatus(@Nullable Integer num) {
        return getAvgSbpStatus(num);
    }
}
