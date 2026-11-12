package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.scroll.HMScrollView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySideListenBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile headsetVocalEnhancementItem;

    @NonNull
    public final SeekBar headsetVocalEnhancementVolumeBar;

    @NonNull
    public final View sideListenVolumeDivider;

    @NonNull
    public final TextView tvSideListenVolume;

    private ActivitySideListenBinding(@NonNull HMScrollView hMScrollView, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull SeekBar seekBar, @NonNull View view, @NonNull TextView textView) {
        this.a = hMScrollView;
        this.container = frameLayout;
        this.headsetVocalEnhancementItem = listTile;
        this.headsetVocalEnhancementVolumeBar = seekBar;
        this.sideListenVolumeDivider = view;
        this.tvSideListenVolume = textView;
    }

    @NonNull
    public static ActivitySideListenBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.headset_vocal_enhancement_item;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                i = R.id.headset_vocal_enhancement_volume_bar;
                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, i);
                if (seekBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.side_listen_volume_divider))) != null) {
                    i = R.id.tv_side_listen_volume;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new ActivitySideListenBinding((HMScrollView) view, frameLayout, listTile, seekBar, viewFindChildViewById, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySideListenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySideListenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_side_listen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public HMScrollView getRoot() {
        return this.a;
    }
}
