package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentGesScreenBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile endTimeItem;

    @NonNull
    public final ImageView gesScreenImg;

    @NonNull
    public final ListTile gesScreenItem;

    @NonNull
    public final ListTile sensitivityItem;

    @NonNull
    public final ListTile startTimeItem;

    @NonNull
    public final Toolbar toolbar;

    private FragmentGesScreenBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull ImageView imageView, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull Toolbar toolbar) {
        this.a = linearLayout;
        this.btnBack = appCompatImageView;
        this.container = frameLayout;
        this.endTimeItem = listTile;
        this.gesScreenImg = imageView;
        this.gesScreenItem = listTile2;
        this.sensitivityItem = listTile3;
        this.startTimeItem = listTile4;
        this.toolbar = toolbar;
    }

    @NonNull
    public static FragmentGesScreenBinding bind(@NonNull View view) {
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.end_time_item;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.ges_screen_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ges_screen_item;
                        ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile2 != null) {
                            i = R.id.sensitivity_item;
                            ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile3 != null) {
                                i = R.id.start_time_item;
                                ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile4 != null) {
                                    i = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                                    if (toolbar != null) {
                                        return new FragmentGesScreenBinding((LinearLayout) view, appCompatImageView, frameLayout, listTile, imageView, listTile2, listTile3, listTile4, toolbar);
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
    public static FragmentGesScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentGesScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ges_screen, viewGroup, false);
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
