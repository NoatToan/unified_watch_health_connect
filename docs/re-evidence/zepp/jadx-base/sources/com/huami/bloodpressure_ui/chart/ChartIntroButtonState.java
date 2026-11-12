package com.huami.bloodpressure_ui.chart;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState;", "", "<init>", "()V", "ChartIntroButtonChecked", "ChartIntroButtonUnChecked", "ChartIntroButtonUnable", "Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState$ChartIntroButtonUnable;", "Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState$ChartIntroButtonChecked;", "Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState$ChartIntroButtonUnChecked;", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class ChartIntroButtonState {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState$ChartIntroButtonChecked;", "Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ChartIntroButtonChecked extends ChartIntroButtonState {

        @NotNull
        public static final ChartIntroButtonChecked INSTANCE = new ChartIntroButtonChecked();

        private ChartIntroButtonChecked() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState$ChartIntroButtonUnChecked;", "Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ChartIntroButtonUnChecked extends ChartIntroButtonState {

        @NotNull
        public static final ChartIntroButtonUnChecked INSTANCE = new ChartIntroButtonUnChecked();

        private ChartIntroButtonUnChecked() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState$ChartIntroButtonUnable;", "Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState;", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ChartIntroButtonUnable extends ChartIntroButtonState {

        @NotNull
        public static final ChartIntroButtonUnable INSTANCE = new ChartIntroButtonUnable();

        private ChartIntroButtonUnable() {
            super(null);
        }
    }

    private ChartIntroButtonState() {
    }

    public /* synthetic */ ChartIntroButtonState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
