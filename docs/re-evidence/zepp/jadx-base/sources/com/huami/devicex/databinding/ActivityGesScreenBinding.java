package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityGesScreenBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout animContainer;

    @NonNull
    public final ImageView brightScreenImg;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile endTimeItem;

    @NonNull
    public final ListTile gesScreenItem;

    @NonNull
    public final ImageView liftWristImg;

    @NonNull
    public final ListTile sensitivityItem;

    @NonNull
    public final ListTile startTimeItem;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivityGesScreenBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ImageView imageView2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.animContainer = frameLayout;
        this.brightScreenImg = imageView;
        this.container = frameLayout2;
        this.endTimeItem = listTile;
        this.gesScreenItem = listTile2;
        this.liftWristImg = imageView2;
        this.sensitivityItem = listTile3;
        this.startTimeItem = listTile4;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityGesScreenBinding bind(@NonNull View view) {
        int i = R.id.anim_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.bright_screen_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R.id.end_time_item;
                    ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile != null) {
                        i = R.id.ges_screen_item;
                        ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile2 != null) {
                            i = R.id.lift_wrist_img;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.sensitivity_item;
                                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile3 != null) {
                                    i = R.id.start_time_item;
                                    ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile4 != null) {
                                        i = R.id.titleBar;
                                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                        if (rainbowTitleBar != null) {
                                            return new ActivityGesScreenBinding((LinearLayout) view, frameLayout, imageView, frameLayout2, listTile, listTile2, imageView2, listTile3, listTile4, rainbowTitleBar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityGesScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityGesScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ges_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
