package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Placeholder;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huami.devicex.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.xiaomi.hm.health.device.earbud.view.ViewEarbudMusicTab;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityEarbudMusicBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final FrameLayout deviceNotConnectContent;

    @NonNull
    public final FrameLayout modeContent;

    @NonNull
    public final ViewPager musicPager;

    @NonNull
    public final ViewEarbudMusicTab musicTab;

    @NonNull
    public final SlidingUpPanelLayout slidingContent;

    @NonNull
    public final Placeholder spaceView;

    private ActivityEarbudMusicBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ViewPager viewPager, @NonNull ViewEarbudMusicTab viewEarbudMusicTab, @NonNull SlidingUpPanelLayout slidingUpPanelLayout, @NonNull Placeholder placeholder) {
        this.a = relativeLayout;
        this.deviceNotConnectContent = frameLayout;
        this.modeContent = frameLayout2;
        this.musicPager = viewPager;
        this.musicTab = viewEarbudMusicTab;
        this.slidingContent = slidingUpPanelLayout;
        this.spaceView = placeholder;
    }

    @NonNull
    public static ActivityEarbudMusicBinding bind(@NonNull View view) {
        int i = R.id.device_not_connect_content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.mode_content;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout2 != null) {
                i = R.id.music_pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
                if (viewPager != null) {
                    i = R.id.music_tab;
                    ViewEarbudMusicTab viewEarbudMusicTab = (ViewEarbudMusicTab) ViewBindings.findChildViewById(view, i);
                    if (viewEarbudMusicTab != null) {
                        i = R.id.sliding_content;
                        SlidingUpPanelLayout slidingUpPanelLayout = (SlidingUpPanelLayout) ViewBindings.findChildViewById(view, i);
                        if (slidingUpPanelLayout != null) {
                            i = R.id.space_view;
                            Placeholder placeholder = (Placeholder) ViewBindings.findChildViewById(view, i);
                            if (placeholder != null) {
                                return new ActivityEarbudMusicBinding((RelativeLayout) view, frameLayout, frameLayout2, viewPager, viewEarbudMusicTab, slidingUpPanelLayout, placeholder);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityEarbudMusicBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityEarbudMusicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_earbud_music, viewGroup, false);
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
