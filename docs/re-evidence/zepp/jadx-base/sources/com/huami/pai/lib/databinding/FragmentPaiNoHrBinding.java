package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPaiNoHrBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LinearLayout paiHintContainer;

    @NonNull
    public final LinearLayout paiProgressContainer;

    @NonNull
    public final ProgressBar paiProgressH;

    @NonNull
    public final ProgressBar paiProgressL;

    @NonNull
    public final ProgressBar paiProgressM;

    @NonNull
    public final TypefaceTextView paiProgressValueH;

    @NonNull
    public final TypefaceTextView paiProgressValueL;

    @NonNull
    public final TypefaceTextView paiProgressValueM;

    @NonNull
    public final LinearLayout paiTimeContainer;

    @NonNull
    public final TypefaceTextView paiTimeH;

    @NonNull
    public final TypefaceTextView paiTimeL;

    @NonNull
    public final TypefaceTextView paiTimeM;

    @NonNull
    public final LinearLayout paiValueContainer;

    private FragmentPaiNoHrBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout paiHintContainer, @NonNull LinearLayout paiProgressContainer, @NonNull ProgressBar paiProgressH, @NonNull ProgressBar paiProgressL, @NonNull ProgressBar paiProgressM, @NonNull TypefaceTextView paiProgressValueH, @NonNull TypefaceTextView paiProgressValueL, @NonNull TypefaceTextView paiProgressValueM, @NonNull LinearLayout paiTimeContainer, @NonNull TypefaceTextView paiTimeH, @NonNull TypefaceTextView paiTimeL, @NonNull TypefaceTextView paiTimeM, @NonNull LinearLayout paiValueContainer) {
        this.a = rootView;
        this.paiHintContainer = paiHintContainer;
        this.paiProgressContainer = paiProgressContainer;
        this.paiProgressH = paiProgressH;
        this.paiProgressL = paiProgressL;
        this.paiProgressM = paiProgressM;
        this.paiProgressValueH = paiProgressValueH;
        this.paiProgressValueL = paiProgressValueL;
        this.paiProgressValueM = paiProgressValueM;
        this.paiTimeContainer = paiTimeContainer;
        this.paiTimeH = paiTimeH;
        this.paiTimeL = paiTimeL;
        this.paiTimeM = paiTimeM;
        this.paiValueContainer = paiValueContainer;
    }

    @NonNull
    public static FragmentPaiNoHrBinding bind(@NonNull View rootView) {
        int i = R.id.pai_hint_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.pai_progress_container;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
            if (linearLayout2 != null) {
                i = R.id.pai_progress_h;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                if (progressBar != null) {
                    i = R.id.pai_progress_l;
                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                    if (progressBar2 != null) {
                        i = R.id.pai_progress_m;
                        ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(rootView, i);
                        if (progressBar3 != null) {
                            i = R.id.pai_progress_value_h;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                            if (typefaceTextView != null) {
                                i = R.id.pai_progress_value_l;
                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                if (typefaceTextView2 != null) {
                                    i = R.id.pai_progress_value_m;
                                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                    if (typefaceTextView3 != null) {
                                        i = R.id.pai_time_container;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                        if (linearLayout3 != null) {
                                            i = R.id.pai_time_h;
                                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                            if (typefaceTextView4 != null) {
                                                i = R.id.pai_time_l;
                                                TypefaceTextView typefaceTextView5 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                if (typefaceTextView5 != null) {
                                                    i = R.id.pai_time_m;
                                                    TypefaceTextView typefaceTextView6 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (typefaceTextView6 != null) {
                                                        i = R.id.pai_value_container;
                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                        if (linearLayout4 != null) {
                                                            return new FragmentPaiNoHrBinding((ConstraintLayout) rootView, linearLayout, linearLayout2, progressBar, progressBar2, progressBar3, typefaceTextView, typefaceTextView2, typefaceTextView3, linearLayout3, typefaceTextView4, typefaceTextView5, typefaceTextView6, linearLayout4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPaiNoHrBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPaiNoHrBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_pai_no_hr, parent, false);
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
