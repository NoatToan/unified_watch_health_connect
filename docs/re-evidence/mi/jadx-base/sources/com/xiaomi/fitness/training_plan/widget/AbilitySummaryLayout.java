package com.xiaomi.fitness.training_plan.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.util.TrainingDataUtils;
import defpackage.csi;
import defpackage.cyi;
import defpackage.jvi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import miuix.androidbasewidget.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilitySummaryLayout;", "Landroid/widget/FrameLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "percentTV", "Landroid/widget/TextView;", "dayCountTV", "progressBar", "Lmiuix/androidbasewidget/widget/ProgressBar;", FitnessReportKey.totalDuration, "totalDurationUnit", "totalDistance", "totalDistanceUnit", "totalCalorie", "totalCalorieUnit", "initView", "", "refreshData", "summary", "Lcom/xiaomi/fitness/training_plan/widget/AbilitySummaryLayout$AbilitySummary;", "AbilitySummary", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AbilitySummaryLayout extends FrameLayout {

    @Nullable
    private TextView dayCountTV;

    @Nullable
    private TextView percentTV;

    @Nullable
    private ProgressBar progressBar;

    @Nullable
    private TextView totalCalorie;

    @Nullable
    private TextView totalCalorieUnit;

    @Nullable
    private TextView totalDistance;

    @Nullable
    private TextView totalDistanceUnit;

    @Nullable
    private TextView totalDuration;

    @Nullable
    private TextView totalDurationUnit;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/AbilitySummaryLayout$AbilitySummary;", "", "percent", "", "curDayCount", "totalDayCount", FitnessReportKey.totalDuration, "totalDistance", "", "totalCalorie", "<init>", "(IIIIFF)V", "getPercent", "()I", "getCurDayCount", "getTotalDayCount", "getTotalDuration", "getTotalDistance", "()F", "getTotalCalorie", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AbilitySummary {
        private final int curDayCount;
        private final int percent;
        private final float totalCalorie;
        private final int totalDayCount;
        private final float totalDistance;
        private final int totalDuration;

        public AbilitySummary(int i, int i2, int i3, int i4, float f, float f2) {
            this.percent = i;
            this.curDayCount = i2;
            this.totalDayCount = i3;
            this.totalDuration = i4;
            this.totalDistance = f;
            this.totalCalorie = f2;
        }

        public static /* synthetic */ AbilitySummary copy$default(AbilitySummary abilitySummary, int i, int i2, int i3, int i4, float f, float f2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = abilitySummary.percent;
            }
            if ((i5 & 2) != 0) {
                i2 = abilitySummary.curDayCount;
            }
            int i6 = i2;
            if ((i5 & 4) != 0) {
                i3 = abilitySummary.totalDayCount;
            }
            int i7 = i3;
            if ((i5 & 8) != 0) {
                i4 = abilitySummary.totalDuration;
            }
            int i8 = i4;
            if ((i5 & 16) != 0) {
                f = abilitySummary.totalDistance;
            }
            float f3 = f;
            if ((i5 & 32) != 0) {
                f2 = abilitySummary.totalCalorie;
            }
            return abilitySummary.copy(i, i6, i7, i8, f3, f2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCurDayCount() {
            return this.curDayCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getTotalDayCount() {
            return this.totalDayCount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getTotalDuration() {
            return this.totalDuration;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getTotalDistance() {
            return this.totalDistance;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final float getTotalCalorie() {
            return this.totalCalorie;
        }

        @NotNull
        public final AbilitySummary copy(int percent, int curDayCount, int totalDayCount, int totalDuration, float totalDistance, float totalCalorie) {
            return new AbilitySummary(percent, curDayCount, totalDayCount, totalDuration, totalDistance, totalCalorie);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AbilitySummary)) {
                return false;
            }
            AbilitySummary abilitySummary = (AbilitySummary) other;
            return this.percent == abilitySummary.percent && this.curDayCount == abilitySummary.curDayCount && this.totalDayCount == abilitySummary.totalDayCount && this.totalDuration == abilitySummary.totalDuration && Float.compare(this.totalDistance, abilitySummary.totalDistance) == 0 && Float.compare(this.totalCalorie, abilitySummary.totalCalorie) == 0;
        }

        public final int getCurDayCount() {
            return this.curDayCount;
        }

        public final int getPercent() {
            return this.percent;
        }

        public final float getTotalCalorie() {
            return this.totalCalorie;
        }

        public final int getTotalDayCount() {
            return this.totalDayCount;
        }

        public final float getTotalDistance() {
            return this.totalDistance;
        }

        public final int getTotalDuration() {
            return this.totalDuration;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.percent) * 31) + Integer.hashCode(this.curDayCount)) * 31) + Integer.hashCode(this.totalDayCount)) * 31) + Integer.hashCode(this.totalDuration)) * 31) + Float.hashCode(this.totalDistance)) * 31) + Float.hashCode(this.totalCalorie);
        }

        @NotNull
        public String toString() {
            return "AbilitySummary(percent=" + this.percent + ", curDayCount=" + this.curDayCount + ", totalDayCount=" + this.totalDayCount + ", totalDuration=" + this.totalDuration + ", totalDistance=" + this.totalDistance + ", totalCalorie=" + this.totalCalorie + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbilitySummaryLayout(@NotNull Context ctx, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        initView();
    }

    private final void initView() {
        LayoutInflater.from(getContext()).inflate(jvi.h, this);
        this.percentTV = (TextView) findViewById(csi.c2);
        this.dayCountTV = (TextView) findViewById(csi.Q);
        this.progressBar = (ProgressBar) findViewById(csi.k2);
        this.totalDuration = (TextView) findViewById(csi.U3);
        this.totalDurationUnit = (TextView) findViewById(csi.V3);
        this.totalDistance = (TextView) findViewById(csi.S3);
        this.totalDistanceUnit = (TextView) findViewById(csi.a0);
        this.totalCalorie = (TextView) findViewById(csi.L3);
        this.totalCalorieUnit = (TextView) findViewById(csi.N3);
    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    public final void refreshData(@Nullable AbilitySummary summary) {
        if (summary != null) {
            TextView textView = this.percentTV;
            if (textView != null) {
                textView.setText(String.valueOf(summary.getPercent()));
            }
            TextView textView2 = this.dayCountTV;
            if (textView2 != null) {
                ViewExtKt.gone(textView2);
            }
            TrainingDataUtils trainingDataUtils = TrainingDataUtils.INSTANCE;
            Pair<String, String> pairHandleTotalDuration = trainingDataUtils.handleTotalDuration(summary.getTotalDuration());
            TextView textView3 = this.totalDurationUnit;
            if (textView3 != null) {
                textView3.setText(pairHandleTotalDuration.getSecond());
            }
            TextView textView4 = this.totalDuration;
            if (textView4 != null) {
                textView4.setText(pairHandleTotalDuration.getFirst());
            }
            Pair<String, String> pairHandleTotalDistance = trainingDataUtils.handleTotalDistance(summary.getTotalDistance());
            TextView textView5 = this.totalDistance;
            if (textView5 != null) {
                textView5.setText(pairHandleTotalDistance.getFirst());
            }
            TextView textView6 = this.totalDistanceUnit;
            if (textView6 != null) {
                textView6.setText(pairHandleTotalDistance.getSecond());
            }
            TextView textView7 = this.totalCalorie;
            if (textView7 != null) {
                textView7.setText(String.valueOf((int) summary.getTotalCalorie()));
            }
            ProgressBar progressBar = this.progressBar;
            if (progressBar != null) {
                progressBar.setProgress(summary.getPercent());
            }
            TextView textView8 = this.totalCalorieUnit;
            if (textView8 != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView8.setText(ResourceExtKt.getQuantityString(context, cyi.j, (int) summary.getTotalCalorie(), Float.valueOf(summary.getTotalCalorie())));
            }
        }
    }
}
