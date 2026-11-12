package com.xiaomi.hm.health.databinding;

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
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemHeartRateBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View divider;

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

    @NonNull
    public final ImageView rightArrow;

    private ItemHeartRateBinding(@NonNull RelativeLayout rootView, @NonNull View divider, @NonNull TextView hrDate, @NonNull ImageView hrIcon, @NonNull TextView hrMark, @NonNull TextView hrUnit, @NonNull TypefaceTextView hrValue, @NonNull ImageView rightArrow) {
        this.a = rootView;
        this.divider = divider;
        this.hrDate = hrDate;
        this.hrIcon = hrIcon;
        this.hrMark = hrMark;
        this.hrUnit = hrUnit;
        this.hrValue = hrValue;
        this.rightArrow = rightArrow;
    }

    @NonNull
    public static ItemHeartRateBinding bind(@NonNull View rootView) {
        int i = R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
        if (viewFindChildViewById != null) {
            i = R.id.hr_date;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.hr_date);
            if (textView != null) {
                i = R.id.hr_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.hr_icon);
                if (imageView != null) {
                    i = R.id.hr_mark;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hr_mark);
                    if (textView2 != null) {
                        i = R.id.hr_unit;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hr_unit);
                        if (textView3 != null) {
                            i = R.id.hr_value;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.hr_value);
                            if (typefaceTextView != null) {
                                i = R.id.right_arrow;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.right_arrow);
                                if (imageView2 != null) {
                                    return new ItemHeartRateBinding((RelativeLayout) rootView, viewFindChildViewById, textView, imageView, textView2, textView3, typefaceTextView, imageView2);
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
    public static ItemHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_heart_rate, parent, false);
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
