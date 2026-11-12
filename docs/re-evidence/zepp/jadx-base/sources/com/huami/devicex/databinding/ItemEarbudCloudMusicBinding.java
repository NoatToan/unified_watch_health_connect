package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemEarbudCloudMusicBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final ImageView bgView;

    @NonNull
    public final ImageView downloadBtn;

    @NonNull
    public final TextView downloadPercent;

    @NonNull
    public final ProgressBar downloadProgress;

    @NonNull
    public final TextView downloadStatus;

    @NonNull
    public final ImageView localStatus;

    @NonNull
    public final TextView musicName;

    @NonNull
    public final ImageView musicPlay;

    private ItemEarbudCloudMusicBinding(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull TextView textView3, @NonNull ImageView imageView4) {
        this.a = cardView;
        this.bgView = imageView;
        this.downloadBtn = imageView2;
        this.downloadPercent = textView;
        this.downloadProgress = progressBar;
        this.downloadStatus = textView2;
        this.localStatus = imageView3;
        this.musicName = textView3;
        this.musicPlay = imageView4;
    }

    @NonNull
    public static ItemEarbudCloudMusicBinding bind(@NonNull View view) {
        int i = R.id.bg_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.download_btn;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.download_percent;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.download_progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                    if (progressBar != null) {
                        i = R.id.download_status;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.local_status;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.music_name;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.music_play;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        return new ItemEarbudCloudMusicBinding((CardView) view, imageView, imageView2, textView, progressBar, textView2, imageView3, textView3, imageView4);
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
    public static ItemEarbudCloudMusicBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemEarbudCloudMusicBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_earbud_cloud_music, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.a;
    }
}
