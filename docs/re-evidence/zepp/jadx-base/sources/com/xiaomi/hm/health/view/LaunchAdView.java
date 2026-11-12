package com.xiaomi.hm.health.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Movie;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.LifecycleObserver;
import com.huami.ad.entity.LaunchViewEntity;
import com.huami.ad.utils.AdHelper;
import com.huami.tools.log.HMLog;
import com.huami.view.videoview.FrameVideoView;
import com.huami.view.videoview.FrameVideoViewListener;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.GifMovieView;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes22.dex */
public class LaunchAdView extends BaseAdView implements LifecycleObserver {
    private static final String s = "LaunchAdView";
    private static final int t = 1;
    private ImageView e;
    private GifMovieView f;
    private FrameVideoView g;
    private RelativeLayout h;
    private TextView i;
    private LaunchOnClickedListener j;
    private AdViewLoadListener k;
    private final c l;
    private float m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private int r;

    public interface AdViewLoadListener {
        void onFinish();
    }

    public interface LaunchOnClickedListener {
        void onAdImageClicked(LaunchAdView view);

        void onGifClicked(LaunchAdView view);

        void onVideoClicked(LaunchAdView view);

        void onVideoFinished(LaunchAdView view);
    }

    public class a extends HMLoadTarget<Bitmap> {
        public a() {
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFailed(Exception e) {
            HMLog.i(LaunchAdView.s, "onLoadFailed:" + e.toString(), new Object[0]);
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap resource) {
            try {
                HMLog.d(LaunchAdView.s, "imageWidth " + resource.getWidth() + " height: " + resource.getHeight(), new Object[0]);
                HMLog.d(LaunchAdView.s, "infoLayoutWidht " + LaunchAdView.this.infoLayout.getMeasuredWidth() + " height " + LaunchAdView.this.infoLayout.getMeasuredHeight(), new Object[0]);
                LaunchAdView.this.e.setVisibility(0);
                LaunchAdView.this.e.setImageBitmap(resource);
                LaunchAdView.this.f.setVisibility(8);
                LaunchAdView.this.h.setVisibility(8);
                LaunchAdView.this.setVisibility(0);
            } catch (Exception e) {
                HMLog.i(LaunchAdView.s, "onResourceReady Exception:" + e, new Object[0]);
            }
            if (LaunchAdView.this.k != null) {
                LaunchAdView.this.k.onFinish();
            }
        }
    }

    public class b implements FrameVideoViewListener {
        public b() {
        }

        @Override // com.huami.view.videoview.FrameVideoViewListener
        public void mediaPlayerPrepareFailed(MediaPlayer mediaPlayer, String error) {
        }

        @Override // com.huami.view.videoview.FrameVideoViewListener
        public void mediaPlayerPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.setLooping(false);
            mediaPlayer.start();
            LaunchAdView.this.l.sendEmptyMessage(1);
            LaunchAdView.this.g.requestFocus();
            LaunchAdView.this.p = false;
        }
    }

    public static class c extends Handler {
        private final WeakReference<LaunchAdView> a;

        public c(LaunchAdView view) {
            this.a = new WeakReference<>(view);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what != 1 || this.a.get() == null) {
                return;
            }
            this.a.get().z();
        }
    }

    public LaunchAdView(@NonNull Context context) {
        this(context, null);
    }

    private int getNavigationBarHeight() {
        Resources resources = getContext().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @NonNull
    private Bitmap q(Bitmap rawBmp) {
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = getResources().getDisplayMetrics().heightPixels;
        int width = (int) ((i / rawBmp.getWidth()) * rawBmp.getHeight());
        if (width > i2) {
            width = i2;
        }
        this.m = i2 - width;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, width, rawBmp.getConfig());
        HMLog.d(s, "destBmp " + bitmapCreateBitmap.getWidth() + " " + bitmapCreateBitmap.getHeight(), new Object[0]);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("onImg Click ");
        sb.append(this.j == null);
        HMLog.d(s, sb.toString(), new Object[0]);
        LaunchOnClickedListener launchOnClickedListener = this.j;
        if (launchOnClickedListener != null) {
            launchOnClickedListener.onAdImageClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        LaunchOnClickedListener launchOnClickedListener = this.j;
        if (launchOnClickedListener != null) {
            launchOnClickedListener.onGifClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view) {
        HMLog.d(s, "video view click ", new Object[0]);
        LaunchOnClickedListener launchOnClickedListener = this.j;
        if (launchOnClickedListener != null) {
            launchOnClickedListener.onVideoClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(View view) {
        HMLog.d(s, "video view click ", new Object[0]);
        LaunchOnClickedListener launchOnClickedListener = this.j;
        if (launchOnClickedListener != null) {
            launchOnClickedListener.onGifClicked(this);
        }
    }

    private void v(long id) {
        Movie movieDecodeFile = Movie.decodeFile(AdHelper.getGifFile(id).getAbsolutePath());
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.f.setVisibility(0);
        this.f.setMovie(movieDecodeFile);
        setVisibility(0);
    }

    private void w(String url) {
        HMImageLoader.with(this).load(url).asBitmap().into(new a());
    }

    private void x(long id) {
        HMLog.d(s, "showVideo " + id, new Object[0]);
        File videoFile = AdHelper.getVideoFile(id);
        String absolutePath = videoFile.getAbsolutePath();
        HMLog.d(s, "path " + absolutePath, new Object[0]);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(absolutePath);
            setVisibility(0);
            this.f.setVisibility(8);
            this.e.setVisibility(8);
            this.h.setVisibility(0);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            HMLog.d(s, "path " + absolutePath + " duration " + strExtractMetadata, new Object[0]);
            int i = Integer.parseInt(strExtractMetadata) / 1000;
            this.o = i;
            int iMin = Math.min(i, 5);
            this.o = iMin;
            this.i.setText(String.valueOf(iMin));
            this.g.setup(Uri.fromFile(videoFile), 0);
            this.g.setFrameVideoViewListener(new b());
        } catch (Exception unused) {
            this.j.onVideoFinished(this);
            this.l.removeCallbacksAndMessages(null);
        }
    }

    private void y() {
        this.g.stop();
        LaunchOnClickedListener launchOnClickedListener = this.j;
        if (launchOnClickedListener != null) {
            launchOnClickedListener.onVideoFinished(this);
        }
        this.l.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        int currentPosition = this.g.getCurrentPosition();
        this.r = currentPosition;
        int i = currentPosition / 1000;
        if (i > 0) {
            this.p = true;
        }
        if (this.q == currentPosition) {
            y();
            return;
        }
        int i2 = this.o - i;
        this.n = i2;
        if (i2 <= 0 || (this.p && i == 0)) {
            y();
            this.p = false;
            return;
        }
        this.i.setText(String.format("%ds", Integer.valueOf(i2)));
        int i3 = this.r;
        if (i3 > 0) {
            this.q = i3;
        }
        this.l.sendEmptyMessageDelayed(1, 400L);
    }

    @Override // com.xiaomi.hm.health.view.BaseAdView
    public void d(ViewGroup viewGroup) {
        View.inflate(getContext(), R.layout.view_launch, viewGroup);
        ImageView imageView = (ImageView) findViewById(R.id.center_iv);
        this.e = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: bm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        GifMovieView gifMovieView = (GifMovieView) findViewById(R.id.gif_view);
        this.f = gifMovieView;
        gifMovieView.setOnClickListener(new View.OnClickListener() { // from class: cm4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
        int i = getResources().getDisplayMetrics().widthPixels;
        int navigationBarHeight = getResources().getDisplayMetrics().heightPixels - getNavigationBarHeight();
        this.f.setLayoutParams(new FrameLayout.LayoutParams(i, navigationBarHeight));
        FrameVideoView frameVideoView = (FrameVideoView) findViewById(R.id.video_view);
        this.g = frameVideoView;
        frameVideoView.setOnClickListener(new View.OnClickListener() { // from class: zl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.t(view);
            }
        });
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.video_container_view);
        this.h = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: am4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.u(view);
            }
        });
        this.h.setLayoutParams(new FrameLayout.LayoutParams(i, navigationBarHeight));
        this.i = (TextView) findViewById(R.id.count_down_view);
    }

    public void destroy() {
        c cVar = this.l;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
    }

    public void setAdViewLoadListener(AdViewLoadListener listener) {
        this.k = listener;
    }

    public void setLaunchOnClickedListener(LaunchOnClickedListener listener) {
        this.j = listener;
    }

    public void updateView(LaunchViewEntity entity) {
        if (entity == null) {
            return;
        }
        if (entity.isGif()) {
            v(entity.id);
            return;
        }
        if (entity.isPic()) {
            HMLog.d(s, "pic " + entity.imageUrl, new Object[0]);
            w(entity.imageUrl);
            return;
        }
        if (entity.isVideo()) {
            if (AdHelper.isDownCompleteOfVideo(entity.id)) {
                x(entity.id);
            } else {
                if (TextUtils.isEmpty(entity.imageUrl)) {
                    return;
                }
                w(entity.imageUrl);
            }
        }
    }

    public LaunchAdView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LaunchAdView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = false;
        this.q = -1;
        this.r = 0;
        this.l = new c(this);
    }
}
