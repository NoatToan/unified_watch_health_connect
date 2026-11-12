package com.huami.step.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.step.R;
import com.huami.step.view.StepUnitTextView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes14.dex */
public final class StepItemTimelineBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout container;

    @NonNull
    public final StepUnitTextView stepCalorie;

    @NonNull
    public final StepUnitTextView stepDistance;

    @NonNull
    public final TypefaceTextView stepTime;

    @NonNull
    public final ImageView stepTimeLine;

    @NonNull
    public final TypefaceTextView stepTitle;

    @NonNull
    public final StepUnitTextView stepValue;

    private StepItemTimelineBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull StepUnitTextView stepUnitTextView, @NonNull StepUnitTextView stepUnitTextView2, @NonNull TypefaceTextView typefaceTextView, @NonNull ImageView imageView, @NonNull TypefaceTextView typefaceTextView2, @NonNull StepUnitTextView stepUnitTextView3) {
        this.a = relativeLayout;
        this.container = relativeLayout2;
        this.stepCalorie = stepUnitTextView;
        this.stepDistance = stepUnitTextView2;
        this.stepTime = typefaceTextView;
        this.stepTimeLine = imageView;
        this.stepTitle = typefaceTextView2;
        this.stepValue = stepUnitTextView3;
    }

    @NonNull
    public static StepItemTimelineBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.step_calorie;
        StepUnitTextView stepUnitTextView = (StepUnitTextView) ViewBindings.findChildViewById(view, i);
        if (stepUnitTextView != null) {
            i = R.id.step_distance;
            StepUnitTextView stepUnitTextView2 = (StepUnitTextView) ViewBindings.findChildViewById(view, i);
            if (stepUnitTextView2 != null) {
                i = R.id.step_time;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView != null) {
                    i = R.id.step_time_line;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.step_title;
                        TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView2 != null) {
                            i = R.id.step_value;
                            StepUnitTextView stepUnitTextView3 = (StepUnitTextView) ViewBindings.findChildViewById(view, i);
                            if (stepUnitTextView3 != null) {
                                return new StepItemTimelineBinding(relativeLayout, relativeLayout, stepUnitTextView, stepUnitTextView2, typefaceTextView, imageView, typefaceTextView2, stepUnitTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static StepItemTimelineBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static StepItemTimelineBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.step_item_timeline, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
