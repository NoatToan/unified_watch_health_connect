package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.ShowLayout;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.qpx;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessNewDetailVideoViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ShowLayout f9491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoPlayer f9492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthProgressBar f9493c;
    private FrameLayout d;
    private ImageView e;

    public FitnessNewDetailVideoViewHolder(ViewGroup viewGroup, VideoPlayer videoPlayer) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.new_view_detail_info_video, viewGroup, false));
        this.f9492b = videoPlayer;
        videoPlayer.b(true);
        this.d = (FrameLayout) this.itemView.findViewById(R.id.surface_view);
        this.f9493c = (HealthProgressBar) this.itemView.findViewById(R.id.state_progressBar);
        this.e = (ImageView) this.itemView.findViewById(R.id.item_iv);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: hni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: hnj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        VideoPlayer videoPlayer = this.f9492b;
        if (videoPlayer == null) {
            return;
        }
        videoPlayer.g();
        this.e.setVisibility(0);
        this.f9493c.setVisibility(4);
    }

    public /* synthetic */ void d(View view) {
        if (this.f9491a == null || this.f9492b == null) {
            return;
        }
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("Suggestion_VideoViewHolder", "Network is not Connected!");
            qpx.b(BaseApplication.b(), R.string.CS_network_connect_error);
            return;
        }
        if (CommonUtil.o(BaseApplication.b()) != 1) {
            qpx.e(BaseApplication.b(), R.string.IDS_app_help_3gnet_diag_conent);
        }
        this.f9492b.c(new VideoPlayer.VideoPlayStateListener() { // from class: hno
            @Override // com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer.VideoPlayStateListener
            public final void onPlayStateChange(int i) {
                this.d.c(i);
            }
        });
        this.f9492b.a(this.d);
        this.f9492b.a(this.f9491a.getVideoUrl(), getAdapterPosition());
        this.e.setVisibility(8);
        this.f9493c.setVisibility(0);
        LogUtil.a("Suggestion_VideoViewHolder", "mVideoCover.setOnClickListener ok");
    }

    public /* synthetic */ void c(int i) {
        if (i == 1) {
            LogUtil.a("Suggestion_VideoViewHolder", "state VideoPlayer gone");
            this.f9493c.setVisibility(8);
        }
    }

    public void d(ShowLayout showLayout, int i) {
        if (showLayout == null || TextUtils.isEmpty(showLayout.getVideoCoverUrl())) {
            return;
        }
        this.f9491a = showLayout;
        a();
        if (i == getAdapterPosition()) {
            this.e.setVisibility(8);
            LogUtil.a("Suggestion_VideoViewHolder", "mVideoCover = INVISIBLE");
        } else {
            this.e.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2) {
        if (this.f9492b == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            layoutParams.width = i;
            layoutParams.height = i2;
            this.d.setLayoutParams(layoutParams);
        }
    }

    private void a() {
        Glide.with(BaseApplication.b()).load(this.f9491a.getVideoCoverUrl()).apply((BaseRequestOptions<?>) new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.ALL)).into(new CustomTarget<Drawable>() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessNewDetailVideoViewHolder.3
            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                if (drawable.getIntrinsicWidth() == 0) {
                    return;
                }
                FitnessNewDetailVideoViewHolder.this.e(FitnessNewDetailVideoViewHolder.this.e.getWidth(), (int) (((double) (FitnessNewDetailVideoViewHolder.this.e.getWidth() * drawable.getIntrinsicHeight())) / ((double) drawable.getIntrinsicWidth())));
                Glide.with(BaseApplication.b()).load(drawable).diskCacheStrategy(DiskCacheStrategy.NONE).into(FitnessNewDetailVideoViewHolder.this.e);
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            public void onLoadFailed(Drawable drawable) {
                LogUtil.j("Suggestion_VideoViewHolder", "loadRoundRectangle onLoadFailed,coverUrl():", FitnessNewDetailVideoViewHolder.this.f9491a.getVideoCoverUrl());
                super.onLoadFailed(drawable);
            }
        });
    }
}
