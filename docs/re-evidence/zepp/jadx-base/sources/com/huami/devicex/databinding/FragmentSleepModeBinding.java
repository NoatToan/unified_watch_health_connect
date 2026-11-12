package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentSleepModeBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final View maskView;

    @NonNull
    public final FrameLayout sleepModeContainer;

    @NonNull
    public final ListTile sleepModeScreenLt;

    @NonNull
    public final ListTile sleepWatchScreenSmartEnableLt;

    private FragmentSleepModeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull FrameLayout frameLayout2, @NonNull ListTile listTile, @NonNull ListTile listTile2) {
        this.a = constraintLayout;
        this.container = frameLayout;
        this.maskView = view;
        this.sleepModeContainer = frameLayout2;
        this.sleepModeScreenLt = listTile;
        this.sleepWatchScreenSmartEnableLt = listTile2;
    }

    @NonNull
    public static FragmentSleepModeBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
            i = R.id.sleep_mode_container;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = R.id.sleep_mode_screen_lt;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.sleep_watch_screen_smart_enable_lt;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        return new FragmentSleepModeBinding((ConstraintLayout) view, frameLayout, viewFindChildViewById, frameLayout2, listTile, listTile2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSleepModeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSleepModeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sleep_mode, viewGroup, false);
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
