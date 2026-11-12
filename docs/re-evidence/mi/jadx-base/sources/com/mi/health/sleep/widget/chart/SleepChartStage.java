package com.mi.health.sleep.widget.chart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/mi/health/sleep/widget/chart/SleepChartStage;", "", "h", "", "<init>", "(Ljava/lang/String;II)V", "getH", "()I", "NOT_SLEEP", "DEEP_SLEEP", "LIGHT_SLEEP", "RAPID_EYE_MOVEMENT", "AWAKE", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum SleepChartStage {
    NOT_SLEEP(-1),
    DEEP_SLEEP(1),
    LIGHT_SLEEP(2),
    RAPID_EYE_MOVEMENT(3),
    AWAKE(4);

    private final int h;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/mi/health/sleep/widget/chart/SleepChartStage$Companion;", "", "<init>", "()V", "fromState", "Lcom/mi/health/sleep/widget/chart/SleepChartStage;", "state", "", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepChartStage fromState(int state) {
            if (state == 2) {
                return SleepChartStage.DEEP_SLEEP;
            }
            if (state == 3) {
                return SleepChartStage.LIGHT_SLEEP;
            }
            if (state != 4) {
                return state != 5 ? SleepChartStage.NOT_SLEEP : SleepChartStage.AWAKE;
            }
            return SleepChartStage.RAPID_EYE_MOVEMENT;
        }
    }

    SleepChartStage(int i) {
        this.h = i;
    }

    @NotNull
    public static EnumEntries<SleepChartStage> getEntries() {
        return $ENTRIES;
    }

    public final int getH() {
        return this.h;
    }
}
