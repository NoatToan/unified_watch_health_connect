package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ItemSleepBehFeelLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView iconFeeling;

    @NonNull
    public final FrameLayout iconFrame;

    @NonNull
    public final ImageView iconState;

    @NonNull
    public final ImageView selectIv;

    @NonNull
    public final Space space;

    @NonNull
    public final TextView titleTv;

    private ItemSleepBehFeelLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView iconFeeling, @NonNull FrameLayout iconFrame, @NonNull ImageView iconState, @NonNull ImageView selectIv, @NonNull Space space, @NonNull TextView titleTv) {
        this.a = rootView;
        this.iconFeeling = iconFeeling;
        this.iconFrame = iconFrame;
        this.iconState = iconState;
        this.selectIv = selectIv;
        this.space = space;
        this.titleTv = titleTv;
    }

    @NonNull
    public static ItemSleepBehFeelLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.iconFeeling;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.iconFrame;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout != null) {
                i = R.id.iconState;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                if (imageView2 != null) {
                    i = R.id.selectIv;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView3 != null) {
                        i = R.id.space;
                        Space space = (Space) ViewBindings.findChildViewById(rootView, i);
                        if (space != null) {
                            i = R.id.titleTv;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView != null) {
                                return new ItemSleepBehFeelLayoutBinding((ConstraintLayout) rootView, imageView, frameLayout, imageView2, imageView3, space, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSleepBehFeelLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSleepBehFeelLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sleep_beh_feel_layout, parent, false);
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
