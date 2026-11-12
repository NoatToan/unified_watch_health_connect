package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.android.design.dialog.choice.ChoiceView;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySleepEditedBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final LinearLayout container;

    @NonNull
    public final ChoiceView select;

    @NonNull
    public final TextView timeTip;

    private ActivitySleepEditedBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout container, @NonNull ChoiceView select, @NonNull TextView timeTip) {
        this.a = rootView;
        this.container = container;
        this.select = select;
        this.timeTip = timeTip;
    }

    @NonNull
    public static ActivitySleepEditedBinding bind(@NonNull View rootView) {
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.select;
            ChoiceView choiceView = (ChoiceView) ViewBindings.findChildViewById(rootView, i);
            if (choiceView != null) {
                i = R.id.time_tip;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    return new ActivitySleepEditedBinding((FrameLayout) rootView, linearLayout, choiceView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySleepEditedBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySleepEditedBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sleep_edited, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
