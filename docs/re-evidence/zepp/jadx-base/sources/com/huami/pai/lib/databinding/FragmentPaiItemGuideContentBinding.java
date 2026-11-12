package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPaiItemGuideContentBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView guideDesc;

    @NonNull
    public final AppCompatImageView guideIllustration;

    @NonNull
    public final TextView guideTitle;

    private FragmentPaiItemGuideContentBinding(@NonNull LinearLayout rootView, @NonNull TextView guideDesc, @NonNull AppCompatImageView guideIllustration, @NonNull TextView guideTitle) {
        this.a = rootView;
        this.guideDesc = guideDesc;
        this.guideIllustration = guideIllustration;
        this.guideTitle = guideTitle;
    }

    @NonNull
    public static FragmentPaiItemGuideContentBinding bind(@NonNull View rootView) {
        int i = R.id.guide_desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.guide_illustration;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
            if (appCompatImageView != null) {
                i = R.id.guide_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    return new FragmentPaiItemGuideContentBinding((LinearLayout) rootView, textView, appCompatImageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPaiItemGuideContentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPaiItemGuideContentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_pai_item_guide_content, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
