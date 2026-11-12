package com.huami.femalehealth.uilib.widget.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.uilib.helper.RTLHelper;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010!B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b \u0010$B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b \u0010'B-\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b \u0010)J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R:\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR:\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006+"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/CalendarStateView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "", TypedValues.CycleType.S_WAVE_PERIOD, "openPeriod", "show", "showEdit", "isPeriod", "Lcom/huami/femalehealth/uilib/widget/calendar/PeriodStateView;", "Lcom/huami/femalehealth/uilib/widget/calendar/PeriodStateView;", "periodStateView", "Lcom/huami/femalehealth/uilib/widget/calendar/PredictionView;", "b", "Lcom/huami/femalehealth/uilib/widget/calendar/PredictionView;", "predictionView", "Lkotlin/Function0;", "value", "c", "Lkotlin/jvm/functions/Function0;", "getPredictionClick", "()Lkotlin/jvm/functions/Function0;", "setPredictionClick", "(Lkotlin/jvm/functions/Function0;)V", "predictionClick", GoogleApiAvailabilityLight.a, "getEditClick", "setEditClick", "editClick", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class CalendarStateView extends LinearLayout {
    private static final int e;
    private static final int f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PeriodStateView periodStateView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private PredictionView predictionView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> predictionClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> editClick;

    static {
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        e = (int) resourceHelper.dp2px(15.0f);
        f = (int) resourceHelper.dp2px(18.0f);
    }

    public CalendarStateView(@NotNull Context context) {
        this(context, null);
    }

    private final void a(Context context) {
        if (context == null) {
            return;
        }
        setOrientation(1);
        this.periodStateView = new PeriodStateView(context);
        this.predictionView = new PredictionView(context);
        PeriodStateView periodStateView = this.periodStateView;
        Objects.requireNonNull(periodStateView);
        periodStateView.setRtl(RTLHelper.INSTANCE.isRTL(context));
        PeriodStateView periodStateView2 = this.periodStateView;
        Objects.requireNonNull(periodStateView2);
        addView(periodStateView2);
        PredictionView predictionView = this.predictionView;
        Objects.requireNonNull(predictionView);
        addView(predictionView);
        PredictionView predictionView2 = this.predictionView;
        Objects.requireNonNull(predictionView2);
        ViewGroup.LayoutParams layoutParams = predictionView2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = e;
        marginLayoutParams.topMargin = i;
        marginLayoutParams.bottomMargin = f;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Function0<Unit> getEditClick() {
        return this.editClick;
    }

    @Nullable
    public final Function0<Unit> getPredictionClick() {
        return this.predictionClick;
    }

    public final boolean isPeriod() {
        PeriodStateView periodStateView = this.periodStateView;
        Objects.requireNonNull(periodStateView);
        return periodStateView.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD java.lang.String();
    }

    public final void openPeriod(boolean period) {
        PeriodStateView periodStateView = this.periodStateView;
        Objects.requireNonNull(periodStateView);
        PeriodStateView.openPeriod$default(periodStateView, period, null, 2, null);
        PredictionView predictionView = this.predictionView;
        Objects.requireNonNull(predictionView);
        predictionView.openPeriod(period);
    }

    public final void setEditClick(@Nullable Function0<Unit> function0) {
        this.editClick = function0;
        PredictionView predictionView = this.predictionView;
        Objects.requireNonNull(predictionView);
        predictionView.setOnEditClick(function0);
    }

    public final void setPredictionClick(@Nullable Function0<Unit> function0) {
        this.predictionClick = function0;
        PredictionView predictionView = this.predictionView;
        Objects.requireNonNull(predictionView);
        predictionView.setOnPredictionClick(function0);
    }

    public final void showEdit(boolean show) {
        PredictionView predictionView = this.predictionView;
        Objects.requireNonNull(predictionView);
        predictionView.showEdit(show);
    }

    public CalendarStateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarStateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    @RequiresApi(21)
    public CalendarStateView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
    }
}
