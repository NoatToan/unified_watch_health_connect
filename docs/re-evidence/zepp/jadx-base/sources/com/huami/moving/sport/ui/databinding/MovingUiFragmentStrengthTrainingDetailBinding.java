package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.bar.BodyPositionView;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiFragmentStrengthTrainingDetailBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final BodyPositionView movingUiStrengthBody;

    @NonNull
    public final BodyPositionView movingUiStrengthBodyBack;

    @NonNull
    public final TextView movingUiStrengthTipsFirst;

    @NonNull
    public final TextView movingUiStrengthTipsSecond;

    @NonNull
    public final TextView movingUiStrengthTipsThird;

    @NonNull
    public final TextView movingUiStrengthTitle;

    private MovingUiFragmentStrengthTrainingDetailBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BodyPositionView bodyPositionView, @NonNull BodyPositionView bodyPositionView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = constraintLayout;
        this.movingUiStrengthBody = bodyPositionView;
        this.movingUiStrengthBodyBack = bodyPositionView2;
        this.movingUiStrengthTipsFirst = textView;
        this.movingUiStrengthTipsSecond = textView2;
        this.movingUiStrengthTipsThird = textView3;
        this.movingUiStrengthTitle = textView4;
    }

    @NonNull
    public static MovingUiFragmentStrengthTrainingDetailBinding bind(@NonNull View view) {
        int i = R.id.moving_ui_strength_body;
        BodyPositionView bodyPositionView = (BodyPositionView) ViewBindings.findChildViewById(view, i);
        if (bodyPositionView != null) {
            i = R.id.moving_ui_strength_body_back;
            BodyPositionView bodyPositionView2 = (BodyPositionView) ViewBindings.findChildViewById(view, i);
            if (bodyPositionView2 != null) {
                i = R.id.moving_ui_strength_tips_first;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.moving_ui_strength_tips_second;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.moving_ui_strength_tips_third;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.moving_ui_strength_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new MovingUiFragmentStrengthTrainingDetailBinding((ConstraintLayout) view, bodyPositionView, bodyPositionView2, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MovingUiFragmentStrengthTrainingDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiFragmentStrengthTrainingDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_fragment_strength_training_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
