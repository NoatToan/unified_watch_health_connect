package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.view.videoview.FrameVideoView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.GifMovieView;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class ViewLaunchBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final ImageView centerIv;

    @NonNull
    public final TextView countDownView;

    @NonNull
    public final GifMovieView gifView;

    @NonNull
    public final RelativeLayout videoContainerView;

    @NonNull
    public final FrameVideoView videoView;

    private ViewLaunchBinding(@NonNull View rootView, @NonNull ImageView centerIv, @NonNull TextView countDownView, @NonNull GifMovieView gifView, @NonNull RelativeLayout videoContainerView, @NonNull FrameVideoView videoView) {
        this.a = rootView;
        this.centerIv = centerIv;
        this.countDownView = countDownView;
        this.gifView = gifView;
        this.videoContainerView = videoContainerView;
        this.videoView = videoView;
    }

    @NonNull
    public static ViewLaunchBinding bind(@NonNull View rootView) {
        int i = R.id.center_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.center_iv);
        if (imageView != null) {
            i = R.id.count_down_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.count_down_view);
            if (textView != null) {
                i = R.id.gif_view;
                GifMovieView gifMovieView = (GifMovieView) ViewBindings.findChildViewById(rootView, R.id.gif_view);
                if (gifMovieView != null) {
                    i = R.id.video_container_view;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.video_container_view);
                    if (relativeLayout != null) {
                        i = R.id.video_view;
                        FrameVideoView frameVideoView = (FrameVideoView) ViewBindings.findChildViewById(rootView, R.id.video_view);
                        if (frameVideoView != null) {
                            return new ViewLaunchBinding(rootView, imageView, textView, gifMovieView, relativeLayout, frameVideoView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewLaunchBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.view_launch, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
