package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardSportRecordInnerBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView distance;

    @NonNull
    public final TextView name;

    @NonNull
    public final AppCompatTextView sportDuration;

    @NonNull
    public final ImageView sportIcon;

    @NonNull
    public final TextView subData;

    @NonNull
    public final TextView time;

    private HomepageItemCardSportRecordInnerBinding(@NonNull ConstraintLayout rootView, @NonNull TextView distance, @NonNull TextView name, @NonNull AppCompatTextView sportDuration, @NonNull ImageView sportIcon, @NonNull TextView subData, @NonNull TextView time) {
        this.a = rootView;
        this.distance = distance;
        this.name = name;
        this.sportDuration = sportDuration;
        this.sportIcon = sportIcon;
        this.subData = subData;
        this.time = time;
    }

    @NonNull
    public static HomepageItemCardSportRecordInnerBinding bind(@NonNull View rootView) {
        int i = R.id.distance;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.sport_duration;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatTextView != null) {
                    i = R.id.sport_icon;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = R.id.sub_data;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.time;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                return new HomepageItemCardSportRecordInnerBinding((ConstraintLayout) rootView, textView, textView2, appCompatTextView, imageView, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageItemCardSportRecordInnerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardSportRecordInnerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_sport_record_inner, parent, false);
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
