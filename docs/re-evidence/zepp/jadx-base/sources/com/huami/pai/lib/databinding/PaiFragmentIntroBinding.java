package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes12.dex */
public final class PaiFragmentIntroBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout llPaiQuestion;

    @NonNull
    public final TypefaceTextView tvPaiinfoInfo1;

    @NonNull
    public final TypefaceTextView tvPaiinfoInfo2;

    @NonNull
    public final TypefaceTextView tvPaiinfoInfo3;

    private PaiFragmentIntroBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llPaiQuestion, @NonNull TypefaceTextView tvPaiinfoInfo1, @NonNull TypefaceTextView tvPaiinfoInfo2, @NonNull TypefaceTextView tvPaiinfoInfo3) {
        this.a = rootView;
        this.llPaiQuestion = llPaiQuestion;
        this.tvPaiinfoInfo1 = tvPaiinfoInfo1;
        this.tvPaiinfoInfo2 = tvPaiinfoInfo2;
        this.tvPaiinfoInfo3 = tvPaiinfoInfo3;
    }

    @NonNull
    public static PaiFragmentIntroBinding bind(@NonNull View rootView) {
        int i = R.id.ll_pai_question;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
        if (linearLayout != null) {
            i = R.id.tv_paiinfo_info1;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
            if (typefaceTextView != null) {
                i = R.id.tv_paiinfo_info2;
                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                if (typefaceTextView2 != null) {
                    i = R.id.tv_paiinfo_info3;
                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                    if (typefaceTextView3 != null) {
                        return new PaiFragmentIntroBinding((LinearLayout) rootView, linearLayout, typefaceTextView, typefaceTextView2, typefaceTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PaiFragmentIntroBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PaiFragmentIntroBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pai_fragment_intro, parent, false);
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
