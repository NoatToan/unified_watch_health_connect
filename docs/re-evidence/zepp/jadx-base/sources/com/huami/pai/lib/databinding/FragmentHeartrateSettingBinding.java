package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentHeartrateSettingBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View iconHrDivide;

    @NonNull
    public final TypefaceTextView iconHrOpen;

    @NonNull
    public final ImageView iconHrWarning;

    @NonNull
    public final ConstraintLayout paiHrWarning;

    @NonNull
    public final TypefaceTextView paiHrWarningInfo2;

    private FragmentHeartrateSettingBinding(@NonNull ConstraintLayout rootView, @NonNull View iconHrDivide, @NonNull TypefaceTextView iconHrOpen, @NonNull ImageView iconHrWarning, @NonNull ConstraintLayout paiHrWarning, @NonNull TypefaceTextView paiHrWarningInfo2) {
        this.a = rootView;
        this.iconHrDivide = iconHrDivide;
        this.iconHrOpen = iconHrOpen;
        this.iconHrWarning = iconHrWarning;
        this.paiHrWarning = paiHrWarning;
        this.paiHrWarningInfo2 = paiHrWarningInfo2;
    }

    @NonNull
    public static FragmentHeartrateSettingBinding bind(@NonNull View rootView) {
        int i = R.id.icon_hr_divide;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, i);
        if (viewFindChildViewById != null) {
            i = R.id.icon_hr_open;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
            if (typefaceTextView != null) {
                i = R.id.icon_hr_warning;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                    i = R.id.pai_hr_warning_info_2;
                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                    if (typefaceTextView2 != null) {
                        return new FragmentHeartrateSettingBinding(constraintLayout, viewFindChildViewById, typefaceTextView, imageView, constraintLayout, typefaceTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentHeartrateSettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentHeartrateSettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_heartrate_setting, parent, false);
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
