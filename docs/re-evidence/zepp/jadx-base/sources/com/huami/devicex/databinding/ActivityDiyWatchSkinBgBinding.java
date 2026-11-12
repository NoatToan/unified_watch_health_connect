package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinProgressView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityDiyWatchSkinBgBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView changeBgBtn;

    @NonNull
    public final ImageView cincoBgImg;

    @NonNull
    public final FrameLayout cincoContainer;

    @NonNull
    public final ImageView cincoTransparentImg;

    @NonNull
    public final RelativeLayout container;

    @NonNull
    public final ImageView devicePreviewImg;

    @NonNull
    public final TextView errorTipsTv;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final WatchSkinProgressView syncApplyBtn;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivityDiyWatchSkinBgBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull WatchSkinProgressView watchSkinProgressView, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = linearLayout;
        this.changeBgBtn = textView;
        this.cincoBgImg = imageView;
        this.cincoContainer = frameLayout;
        this.cincoTransparentImg = imageView2;
        this.container = relativeLayout;
        this.devicePreviewImg = imageView3;
        this.errorTipsTv = textView2;
        this.recyclerView = recyclerView;
        this.syncApplyBtn = watchSkinProgressView;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityDiyWatchSkinBgBinding bind(@NonNull View view) {
        int i = R.id.change_bg_btn;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.cinco_bg_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.cinco_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.cinco_transparent_img;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.container;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.device_preview_img;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.error_tips_tv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = R.id.sync_apply_btn;
                                        WatchSkinProgressView watchSkinProgressView = (WatchSkinProgressView) ViewBindings.findChildViewById(view, i);
                                        if (watchSkinProgressView != null) {
                                            i = R.id.title_bar;
                                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                            if (rainbowTitleBar != null) {
                                                return new ActivityDiyWatchSkinBgBinding((LinearLayout) view, textView, imageView, frameLayout, imageView2, relativeLayout, imageView3, textView2, recyclerView, watchSkinProgressView, rainbowTitleBar);
                                            }
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
    public static ActivityDiyWatchSkinBgBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityDiyWatchSkinBgBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_diy_watch_skin_bg, viewGroup, false);
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
