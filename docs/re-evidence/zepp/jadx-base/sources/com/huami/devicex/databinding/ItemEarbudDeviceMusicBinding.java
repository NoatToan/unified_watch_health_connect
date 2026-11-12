package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemEarbudDeviceMusicBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView bgView;

    @NonNull
    public final TextView downloadPercent;

    @NonNull
    public final ProgressBar downloadProgress;

    @NonNull
    public final TextView downloadStatus;

    @NonNull
    public final ImageView musicDelete;

    @NonNull
    public final TextView musicName;

    @NonNull
    public final ImageView musicPlay;

    @NonNull
    public final TextView musicSize;

    private ItemEarbudDeviceMusicBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull ImageView imageView3, @NonNull TextView textView4) {
        this.a = constraintLayout;
        this.bgView = imageView;
        this.downloadPercent = textView;
        this.downloadProgress = progressBar;
        this.downloadStatus = textView2;
        this.musicDelete = imageView2;
        this.musicName = textView3;
        this.musicPlay = imageView3;
        this.musicSize = textView4;
    }

    @NonNull
    public static ItemEarbudDeviceMusicBinding bind(@NonNull View view) {
        int i = R.id.bg_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.download_percent;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.download_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null) {
                    i = R.id.download_status;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.music_delete;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.music_name;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = R.id.music_play;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.music_size;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        return new ItemEarbudDeviceMusicBinding((ConstraintLayout) view, imageView, textView, progressBar, textView2, imageView2, textView3, imageView3, textView4);
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
    public static ItemEarbudDeviceMusicBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemEarbudDeviceMusicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_earbud_device_music, viewGroup, false);
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
