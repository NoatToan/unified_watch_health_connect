package com.huami.femalehealth.uilib.widget.calendar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.calendar.PredictionView;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010!B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b \u0010$B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b \u0010&B-\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0006¢\u0006\u0004\b \u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006*"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/PredictionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "c", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "show", "showEdit", TypedValues.CycleType.S_WAVE_PERIOD, "openPeriod", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnPredictionClick", "()Lkotlin/jvm/functions/Function0;", "setOnPredictionClick", "(Lkotlin/jvm/functions/Function0;)V", "onPredictionClick", "b", "getOnEditClick", "setOnEditClick", "onEditClick", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "editTextView", GoogleApiAvailabilityLight.a, "forecastingTextView", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class PredictionView extends LinearLayout {
    private static final int e;
    private static final int f;

    @NotNull
    private static final String g = "   ";
    private static final float h = 0.55f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onPredictionClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onEditClick;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private TextView editTextView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TextView forecastingTextView;

    static {
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        e = (int) resourceHelper.dp2px(14.0f);
        f = (int) resourceHelper.dp2px(15.0f);
    }

    public PredictionView(@NotNull Context context) {
        this(context, null);
    }

    private final void c(Context context) {
        setOrientation(0);
        setGravity(16);
        setBackground(ExtKt.getResDrawable(this, R.drawable.fh_prediction_view_bg));
        int i = f;
        setPadding(i, 0, i, 0);
        TextView textView = new TextView(context);
        textView.setTextColor(ExtKt.getResColor(context, R.color.s2));
        textView.setTextSize(2, 12.0f);
        ResourceHelper resourceHelper = ResourceHelper.INSTANCE;
        textView.setText(resourceHelper.getString(R.string.fh_forecasting));
        textView.setIncludeFontPadding(false);
        addView(textView);
        textView.setMaxWidth((int) (ExtKt.findScreenWH(textView).x * h));
        ExtKt.increaseClickRange(textView, 10);
        textView.setOnClickListener(new View.OnClickListener() { // from class: e36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PredictionView.d(this.a, view);
            }
        });
        this.forecastingTextView = textView;
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setTextColor(ExtKt.getResColor(context, R.color.fh_history_tab_color));
        textView2.setTextSize(2, 13.0f);
        textView2.setText(resourceHelper.getString(R.string.fh_edit));
        textView2.setIncludeFontPadding(false);
        addView(textView2);
        ExtKt.increaseClickRange(textView2, 10);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: d36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PredictionView.e(this.a, view2);
            }
        });
        this.editTextView = textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(PredictionView predictionView, View view) {
        Function0<Unit> onPredictionClick = predictionView.getOnPredictionClick();
        if (onPredictionClick == null) {
            return;
        }
        onPredictionClick.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(PredictionView predictionView, View view) {
        Function0<Unit> onEditClick = predictionView.getOnEditClick();
        if (onEditClick == null) {
            return;
        }
        onEditClick.invoke();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Function0<Unit> getOnEditClick() {
        return this.onEditClick;
    }

    @Nullable
    public final Function0<Unit> getOnPredictionClick() {
        return this.onPredictionClick;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) ExtKt.dpToPx(this, 44.0f), 1073741824));
    }

    public final void openPeriod(boolean period) {
        SpannableString spannableString = new SpannableString(Intrinsics.stringPlus(ResourceHelper.INSTANCE.getString(period ? R.string.fh_forecasting : R.string.fh_not_forecasting), g));
        Drawable resDrawable = ExtKt.getResDrawable(this, R.drawable.fh_help);
        if (resDrawable != null) {
            int i = e;
            resDrawable.setBounds(0, 0, i, i);
            spannableString.setSpan(new ImageSpan(resDrawable, 0), spannableString.length() - 1, spannableString.length(), 33);
        }
        TextView textView = this.forecastingTextView;
        if (textView == null) {
            return;
        }
        textView.setText(spannableString);
    }

    public final void setOnEditClick(@Nullable Function0<Unit> function0) {
        this.onEditClick = function0;
    }

    public final void setOnPredictionClick(@Nullable Function0<Unit> function0) {
        this.onPredictionClick = function0;
    }

    public final void showEdit(boolean show) {
        TextView textView = this.editTextView;
        if (textView == null) {
            return;
        }
        ExtKt.setVisible$default(textView, show, false, 2, null);
    }

    public PredictionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PredictionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    @RequiresApi(21)
    public PredictionView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context);
    }
}
