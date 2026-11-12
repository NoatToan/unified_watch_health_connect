package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentSleepAnalysisLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView bestScoreTv;

    @NonNull
    public final View lineV;

    @NonNull
    public final TextView mainTitleTv;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView worstScoreTv;

    private FragmentSleepAnalysisLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView bestScoreTv, @NonNull View lineV, @NonNull TextView mainTitleTv, @NonNull TextView subTitleTv, @NonNull TextView worstScoreTv) {
        this.a = rootView;
        this.bestScoreTv = bestScoreTv;
        this.lineV = lineV;
        this.mainTitleTv = mainTitleTv;
        this.subTitleTv = subTitleTv;
        this.worstScoreTv = worstScoreTv;
    }

    @NonNull
    public static FragmentSleepAnalysisLayoutBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.bestScoreTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.lineV))) != null) {
            i = R.id.mainTitleTv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.subTitleTv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = R.id.worstScoreTv;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView4 != null) {
                        return new FragmentSleepAnalysisLayoutBinding((ConstraintLayout) rootView, textView, viewFindChildViewById, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSleepAnalysisLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSleepAnalysisLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_analysis_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
