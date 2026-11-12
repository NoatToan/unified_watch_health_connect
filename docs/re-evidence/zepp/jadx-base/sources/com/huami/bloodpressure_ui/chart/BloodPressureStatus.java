package com.huami.bloodpressure_ui.chart;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0015\b\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureStatus;", "", "", "a", "Ljava/lang/Long;", "getTimeStamp", "()Ljava/lang/Long;", "setTimeStamp", "(Ljava/lang/Long;)V", "timeStamp", "<init>", "Lcom/huami/bloodpressure_ui/chart/BloodPressureEmptyStyleStatus;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureDataStyleStatus;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureAvgDataStyleStatus;", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class BloodPressureStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Long timeStamp;

    private BloodPressureStatus(Long l) {
        this.timeStamp = l;
    }

    public /* synthetic */ BloodPressureStatus(Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(l);
    }

    @Nullable
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setTimeStamp(@Nullable Long l) {
        this.timeStamp = l;
    }

    public /* synthetic */ BloodPressureStatus(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, null);
    }
}
