package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import net.lucode.hackware.magicindicator.MagicIndicator;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityWatchSkinStoreBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View divider;

    @NonNull
    public final FrameLayout layoutIndicator;

    @NonNull
    public final MagicIndicator magicIndicator;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final ViewPager viewPager;

    private ActivityWatchSkinStoreBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull MagicIndicator magicIndicator, @NonNull RainbowTitleBar rainbowTitleBar, @NonNull ViewPager viewPager) {
        this.a = relativeLayout;
        this.divider = view;
        this.layoutIndicator = frameLayout;
        this.magicIndicator = magicIndicator;
        this.titleBar = rainbowTitleBar;
        this.viewPager = viewPager;
    }

    @NonNull
    public static ActivityWatchSkinStoreBinding bind(@NonNull View view) {
        int i = R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = R.id.layout_indicator;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.magic_indicator;
                MagicIndicator magicIndicator = (MagicIndicator) ViewBindings.findChildViewById(view, i);
                if (magicIndicator != null) {
                    i = R.id.title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                    if (rainbowTitleBar != null) {
                        i = R.id.view_pager;
                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                        if (viewPager != null) {
                            return new ActivityWatchSkinStoreBinding((RelativeLayout) view, viewFindChildViewById, frameLayout, magicIndicator, rainbowTitleBar, viewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWatchSkinStoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWatchSkinStoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_watch_skin_store, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
