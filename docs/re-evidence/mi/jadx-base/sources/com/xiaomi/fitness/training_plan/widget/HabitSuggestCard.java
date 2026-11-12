package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.training_plan.habit_plan.HabitSuggestData;
import defpackage.csi;
import defpackage.jvi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/HabitSuggestCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "habitSuggestTitle", "Landroid/widget/TextView;", "getHabitSuggestTitle", "()Landroid/widget/TextView;", "setHabitSuggestTitle", "(Landroid/widget/TextView;)V", "habitSuggestDesc", "getHabitSuggestDesc", "setHabitSuggestDesc", "habitSuggestValue", "getHabitSuggestValue", "setHabitSuggestValue", "habitSuggestUnit", "getHabitSuggestUnit", "setHabitSuggestUnit", "onFinishInflate", "", "render", "data", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitSuggestData;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitSuggestCard extends ConstraintLayout {

    @Nullable
    private TextView habitSuggestDesc;

    @Nullable
    private TextView habitSuggestTitle;

    @Nullable
    private TextView habitSuggestUnit;

    @Nullable
    private TextView habitSuggestValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitSuggestCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jvi.M, this);
    }

    @Nullable
    public final TextView getHabitSuggestDesc() {
        return this.habitSuggestDesc;
    }

    @Nullable
    public final TextView getHabitSuggestTitle() {
        return this.habitSuggestTitle;
    }

    @Nullable
    public final TextView getHabitSuggestUnit() {
        return this.habitSuggestUnit;
    }

    @Nullable
    public final TextView getHabitSuggestValue() {
        return this.habitSuggestValue;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.habitSuggestTitle = (TextView) findViewById(csi.s3);
        this.habitSuggestDesc = (TextView) findViewById(csi.r3);
        this.habitSuggestValue = (TextView) findViewById(csi.u3);
        this.habitSuggestUnit = (TextView) findViewById(csi.t3);
    }

    public final void render(@Nullable HabitSuggestData data) {
        if (data != null) {
            TextView textView = this.habitSuggestTitle;
            if (textView != null) {
                textView.setText(data.getSuggestTitle());
            }
            TextView textView2 = this.habitSuggestDesc;
            if (textView2 != null) {
                textView2.setText(data.getSuggestDesc());
            }
            TextView textView3 = this.habitSuggestValue;
            if (textView3 != null) {
                textView3.setText(data.getSuggestValue());
            }
            TextView textView4 = this.habitSuggestUnit;
            if (textView4 != null) {
                textView4.setText(data.getSuggestUnit());
            }
        }
    }

    public final void setHabitSuggestDesc(@Nullable TextView textView) {
        this.habitSuggestDesc = textView;
    }

    public final void setHabitSuggestTitle(@Nullable TextView textView) {
        this.habitSuggestTitle = textView;
    }

    public final void setHabitSuggestUnit(@Nullable TextView textView) {
        this.habitSuggestUnit = textView;
    }

    public final void setHabitSuggestValue(@Nullable TextView textView) {
        this.habitSuggestValue = textView;
    }
}
