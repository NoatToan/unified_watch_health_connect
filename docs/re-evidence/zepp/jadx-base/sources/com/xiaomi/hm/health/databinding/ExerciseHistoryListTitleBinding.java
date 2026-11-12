package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ExerciseHistoryListTitleBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View titleBottomDivider;

    @NonNull
    public final TypefaceTextView titleDate;

    private ExerciseHistoryListTitleBinding(@NonNull RelativeLayout rootView, @NonNull View titleBottomDivider, @NonNull TypefaceTextView titleDate) {
        this.a = rootView;
        this.titleBottomDivider = titleBottomDivider;
        this.titleDate = titleDate;
    }

    @NonNull
    public static ExerciseHistoryListTitleBinding bind(@NonNull View rootView) {
        int i = R.id.title_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.title_bottom_divider);
        if (viewFindChildViewById != null) {
            i = R.id.titleDate;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.titleDate);
            if (typefaceTextView != null) {
                return new ExerciseHistoryListTitleBinding((RelativeLayout) rootView, viewFindChildViewById, typefaceTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ExerciseHistoryListTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ExerciseHistoryListTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.exercise_history_list_title, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
