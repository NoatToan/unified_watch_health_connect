package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentSportHeadBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final LinearLayout sportDetailsContent;

    @NonNull
    public final TextView sportHeadMainUnit;

    @NonNull
    public final TypefaceTextView sportHeadMainValue;

    @NonNull
    public final TextView sportHeadMileageVerify;

    @NonNull
    public final TextView sportHeadNoMap;

    private FragmentSportHeadBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.sportDetailsContent = linearLayout;
        this.sportHeadMainUnit = textView;
        this.sportHeadMainValue = typefaceTextView;
        this.sportHeadMileageVerify = textView2;
        this.sportHeadNoMap = textView3;
    }

    @NonNull
    public static FragmentSportHeadBinding bind(@NonNull View view) {
        int i = R.id.sport_details_content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.sport_head_main_unit;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.sport_head_main_value;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView != null) {
                    i = R.id.sport_head_mileage_verify;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.sport_head_no_map;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new FragmentSportHeadBinding((ConstraintLayout) view, linearLayout, textView, typefaceTextView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSportHeadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSportHeadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sport_head, viewGroup, false);
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
