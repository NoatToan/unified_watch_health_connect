package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class ActivitySkyMusicListBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final RecyclerView recyclerMusic;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivitySkyMusicListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.recyclerMusic = recyclerView;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivitySkyMusicListBinding bind(@NonNull View view) {
        int i = R.id.recycler_music;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.title_bar;
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
            if (rainbowTitleBar != null) {
                return new ActivitySkyMusicListBinding((ConstraintLayout) view, recyclerView, rainbowTitleBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySkyMusicListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySkyMusicListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_sky_music_list, viewGroup, false);
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
