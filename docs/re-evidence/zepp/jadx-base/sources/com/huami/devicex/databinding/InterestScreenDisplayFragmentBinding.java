package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class InterestScreenDisplayFragmentBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final AppCompatImageView btnBack;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile interestDial;

    @NonNull
    public final ListTile interestEnable;

    @NonNull
    public final View maskView;

    @NonNull
    public final ListTile scheduleStartLayout;

    @NonNull
    public final ListTile scheduleStopLayout;

    @NonNull
    public final Toolbar toolbar;

    private InterestScreenDisplayFragmentBinding(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull FrameLayout frameLayout2, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull View view, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull Toolbar toolbar) {
        this.a = frameLayout;
        this.btnBack = appCompatImageView;
        this.container = frameLayout2;
        this.interestDial = listTile;
        this.interestEnable = listTile2;
        this.maskView = view;
        this.scheduleStartLayout = listTile3;
        this.scheduleStopLayout = listTile4;
        this.toolbar = toolbar;
    }

    @NonNull
    public static InterestScreenDisplayFragmentBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.btn_back;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.interest_dial;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.interest_enable;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                        i = R.id.schedule_start_layout;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            i = R.id.schedule_stop_layout;
                            ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile4 != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i);
                                if (toolbar != null) {
                                    return new InterestScreenDisplayFragmentBinding((FrameLayout) view, appCompatImageView, frameLayout, listTile, listTile2, viewFindChildViewById, listTile3, listTile4, toolbar);
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
    public static InterestScreenDisplayFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static InterestScreenDisplayFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.interest_screen_display_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
