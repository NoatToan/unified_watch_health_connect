package com.huami.heartrate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.heartrate.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes9.dex */
public final class HeartRateItemMeasureBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView hrDate;

    @NonNull
    public final ImageView hrIcon;

    @NonNull
    public final TextView hrUnit;

    @NonNull
    public final TypefaceTextView hrValue;

    @NonNull
    public final ImageView rightArrow;

    private HeartRateItemMeasureBinding(@NonNull RelativeLayout rootView, @NonNull TextView hrDate, @NonNull ImageView hrIcon, @NonNull TextView hrUnit, @NonNull TypefaceTextView hrValue, @NonNull ImageView rightArrow) {
        this.a = rootView;
        this.hrDate = hrDate;
        this.hrIcon = hrIcon;
        this.hrUnit = hrUnit;
        this.hrValue = hrValue;
        this.rightArrow = rightArrow;
    }

    @NonNull
    public static HeartRateItemMeasureBinding bind(@NonNull View rootView) {
        int i = R.id.hr_date;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.hr_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.hr_unit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.hr_value;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                    if (typefaceTextView != null) {
                        i = R.id.right_arrow;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                        if (imageView2 != null) {
                            return new HeartRateItemMeasureBinding((RelativeLayout) rootView, textView, imageView, textView2, typefaceTextView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateItemMeasureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateItemMeasureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_item_measure, parent, false);
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
