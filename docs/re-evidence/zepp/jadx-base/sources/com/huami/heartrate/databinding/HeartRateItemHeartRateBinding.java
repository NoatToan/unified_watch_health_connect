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
public final class HeartRateItemHeartRateBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView hrDate;

    @NonNull
    public final ImageView hrIcon;

    @NonNull
    public final TextView hrMark;

    @NonNull
    public final TextView hrUnit;

    @NonNull
    public final TypefaceTextView hrValue;

    private HeartRateItemHeartRateBinding(@NonNull RelativeLayout rootView, @NonNull TextView hrDate, @NonNull ImageView hrIcon, @NonNull TextView hrMark, @NonNull TextView hrUnit, @NonNull TypefaceTextView hrValue) {
        this.a = rootView;
        this.hrDate = hrDate;
        this.hrIcon = hrIcon;
        this.hrMark = hrMark;
        this.hrUnit = hrUnit;
        this.hrValue = hrValue;
    }

    @NonNull
    public static HeartRateItemHeartRateBinding bind(@NonNull View rootView) {
        int i = R.id.hr_date;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.hr_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                i = R.id.hr_mark;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.hr_unit;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView3 != null) {
                        i = R.id.hr_value;
                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                        if (typefaceTextView != null) {
                            return new HeartRateItemHeartRateBinding((RelativeLayout) rootView, textView, imageView, textView2, textView3, typefaceTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HeartRateItemHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HeartRateItemHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.heart_rate_item_heart_rate, parent, false);
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
