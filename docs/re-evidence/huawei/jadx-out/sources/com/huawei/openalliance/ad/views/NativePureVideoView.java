package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Scheme;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.iu;
import com.huawei.openalliance.ad.jo;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.nn;
import com.huawei.openalliance.ad.of;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dw;
import com.huawei.openalliance.ad.views.interfaces.INativeVideoView;
import com.huawei.openalliance.ad.views.interfaces.IPPSNativeView;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class NativePureVideoView extends NativeMediaView implements INativeVideoView, IViewLifeCycle {
    private static final String g = "NativePureVideoView";
    private of h;
    private VideoView i;
    private ImageView j;
    private boolean k;
    private VideoInfo l;
    private ImageInfo m;
    private boolean n;
    private long o;
    private long p;
    private boolean q;
    private IPPSNativeView r;
    private jo s;
    private Context t;
    private MediaBufferListener u;
    private final ReportVideoTimeListener v;
    private MediaStateListener w;
    private MediaErrorListener x;
    private MuteListener y;

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void showFullScreenSwitchButton(boolean z) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void updateStartShowTime(long j) {
        this.h.a(j);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void updateContent(String str) {
        this.h.a(str);
    }

    public void unmuteSound() {
        this.i.unmute();
    }

    public boolean switchToFullScreen() {
        b(4);
        VideoInfo videoInfo = this.l;
        if (videoInfo != null) {
            videoInfo.b(true);
        }
        this.i.setNeedPauseOnSurfaceDestory(false);
        return this.h.a(this.i.getMediaPlayerAgent(), this.f20786c);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void stop() {
        this.i.stop();
    }

    public void setStandalone(boolean z) {
        this.i.setStandalone(z);
    }

    public void setPreferStartPlayTime(int i) {
        this.i.setPreferStartPlayTime(i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void setPpsNativeView(IPPSNativeView iPPSNativeView) {
        this.r = iPPSNativeView;
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView, com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void setNativeAd(INativeAd iNativeAd) {
        MediaState currentState = this.i.getCurrentState();
        if (this.f20786c == iNativeAd && currentState.isNotState(MediaState.State.IDLE) && currentState.isNotState(MediaState.State.ERROR)) {
            hw.b(g, "setNativeAd - has the same ad");
            return;
        }
        super.setNativeAd(iNativeAd);
        i();
        this.h.a(this.f20786c);
        if (this.f20786c == null) {
            this.l = null;
        } else {
            g();
            h();
        }
    }

    public void setAudioFocusType(int i) {
        this.i.setAudioFocusType(i);
    }

    public void seekTo(int i, int i2) {
        this.i.c(i, i2);
    }

    public void seekTo(int i) {
        this.i.seekTo(i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        this.f20784a = false;
        this.i.resumeView();
        this.i.setNeedPauseOnSurfaceDestory(true);
        this.f.onGlobalLayout();
    }

    public void removeNetworkChangeListener(NetworkChangeListener networkChangeListener) {
        this.i.removeNetworkChangeListener(networkChangeListener);
    }

    public void removeMuteListener(MuteListener muteListener) {
        this.i.removeMuteListener(muteListener);
    }

    public void removeMediaStateListener(MediaStateListener mediaStateListener) {
        this.i.removeMediaStateListener(mediaStateListener);
    }

    public void removeMediaErrorListener(MediaErrorListener mediaErrorListener) {
        this.i.removeMediaErrorListener(mediaErrorListener);
    }

    public void removeMediaBufferListener(MediaBufferListener mediaBufferListener) {
        this.i.removeMediaBufferListener(mediaBufferListener);
    }

    public void play(boolean z) {
        if (this.k) {
            a(z);
        } else {
            this.n = true;
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        this.i.pauseView();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void pause() {
        this.i.pause();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void onPreviewImageLoaded(ImageInfo imageInfo, Drawable drawable) {
        ImageInfo imageInfo2 = this.m;
        if (imageInfo2 == null || imageInfo == null || !TextUtils.equals(imageInfo2.getUrl(), imageInfo.getUrl())) {
            return;
        }
        this.j.setImageDrawable(drawable);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void onCheckVideoHashResult(VideoInfo videoInfo, boolean z) {
        VideoInfo videoInfo2;
        hw.b(g, "onCheckVideoHashResult sucess: %s", Boolean.valueOf(z));
        if (!z || (videoInfo2 = this.l) == null || videoInfo == null || !TextUtils.equals(videoInfo2.getVideoDownloadUrl(), videoInfo.getVideoDownloadUrl())) {
            return;
        }
        this.k = true;
        a(videoInfo);
        if (this.n) {
            a(false);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void notifyStreamError(int i) {
        MediaErrorListener mediaErrorListener = this.x;
        if (mediaErrorListener != null) {
            mediaErrorListener.onError(null, this.e, i, -1);
        }
        of ofVar = this.h;
        if (ofVar != null) {
            ofVar.a(this.e, i);
        }
    }

    public void muteSound() {
        this.i.mute();
    }

    public boolean isPlaying() {
        return this.i.isPlaying();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public VideoView getVideoView() {
        return this.i;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public ImageView getPreviewImageView() {
        return this.j;
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    public int getPlayedTime() {
        return this.e;
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    public int getPlayedProgress() {
        VideoInfo videoInfo = this.l;
        if (videoInfo != null && videoInfo.getVideoDuration() > 0) {
            this.d = (int) ((getPlayedTime() / this.l.getVideoDuration()) * 100.0f);
        }
        return this.d;
    }

    public MediaState getCurrentState() {
        return this.i.getCurrentState();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        this.i.destroyView();
    }

    public void addNetworkChangeListener(NetworkChangeListener networkChangeListener) {
        this.i.addNetworkChangeListener(networkChangeListener);
    }

    public void addMuteListener(MuteListener muteListener) {
        this.i.addMuteListener(muteListener);
    }

    public void addMediaStateListener(MediaStateListener mediaStateListener) {
        this.i.addMediaStateListener(mediaStateListener);
    }

    public void addMediaErrorListener(MediaErrorListener mediaErrorListener) {
        this.i.addMediaErrorListener(mediaErrorListener);
    }

    public void addMediaBufferListener(MediaBufferListener mediaBufferListener) {
        this.i.addMediaBufferListener(mediaBufferListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (hw.a()) {
            hw.a(g, "hidePreviewView");
        }
        dw.a(this.j, 8, 300, 300);
        this.i.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (hw.a()) {
            hw.a(g, "showPreviewView");
        }
        Animation animation = this.j.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        dk.a((View) this.j, true);
        this.i.setAlpha(0.0f);
    }

    private void i() {
        j();
        this.k = false;
        this.n = false;
    }

    private void h() {
        if (this.f20786c == null) {
            return;
        }
        VideoInfo videoInfo = this.f20786c.getVideoInfo();
        this.l = videoInfo;
        if (videoInfo != null) {
            Float videoRatio = videoInfo.getVideoRatio();
            if (videoRatio == null) {
                videoRatio = Float.valueOf(1.7777778f);
            }
            setRatio(videoRatio);
            this.i.setDefaultDuration(this.l.getVideoDuration());
            this.h.a(this.l);
        }
    }

    private String getTAG() {
        return g + "_" + hashCode();
    }

    private void g() {
        List<ImageInfo> imageInfos;
        if (this.f20786c == null || (imageInfos = this.f20786c.getImageInfos()) == null || imageInfos.size() <= 0) {
            return;
        }
        ImageInfo imageInfo = imageInfos.get(0);
        this.m = imageInfo;
        if (imageInfo != null) {
            if (dg.l(imageInfo.getUrl())) {
                hw.b(g, "don't load preview image with http url");
                return;
            }
            if (this.m.getHeight() > 0) {
                setRatio(Float.valueOf((this.m.getWidth() * 1.0f) / this.m.getHeight()));
            }
            this.h.a(this.m);
        }
    }

    private void b(int i) {
        IPPSNativeView iPPSNativeView = this.r;
        if (iPPSNativeView != null) {
            iPPSNativeView.a(Integer.valueOf(i));
        }
    }

    private String b(VideoInfo videoInfo) {
        if (videoInfo != null && dg.l(videoInfo.g()) && as.a(videoInfo)) {
            return as.a(this.t, videoInfo, new iu(this));
        }
        return null;
    }

    private void a(boolean z) {
        hw.b(g, "doRealPlay, auto:" + z);
        this.s.a();
        this.i.play(z);
    }

    private void a(VideoInfo videoInfo) {
        String videoDownloadUrl = videoInfo.getVideoDownloadUrl();
        if (videoDownloadUrl.startsWith(Scheme.DISKCACHE.toString())) {
            hw.b(g, "video cached, play from local.");
            this.i.setVideoFileUrl(videoDownloadUrl);
            return;
        }
        String strC = com.huawei.openalliance.ad.dk.a(this.t, "normal").c(dn.d(videoDownloadUrl));
        if (!TextUtils.isEmpty(strC) && com.huawei.openalliance.ad.utils.ai.b(this.t, strC)) {
            hw.b(g, "video cached, play from local.");
            this.i.setVideoFileUrl(strC);
            return;
        }
        String str = g;
        hw.b(str, "video not cached, play from net.");
        String strB = b(videoInfo);
        if (!TextUtils.isEmpty(strB)) {
            hw.b(str, "play mode 3, cache while playing.");
            videoDownloadUrl = strB;
        }
        this.i.setVideoFileUrl(videoDownloadUrl);
    }

    private void a(Context context) {
        this.t = context;
        LayoutInflater.from(context).inflate(R.layout.hiad_native_pure_video_view, this);
        this.h = new nn(context, this);
        this.i = (VideoView) findViewById(R.id.hiad_id_video_view);
        this.j = (ImageView) findViewById(R.id.hiad_iv_preview_video);
        this.i.setScreenOnWhilePlaying(true);
        this.i.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        this.i.addMediaStateListener(this.w);
        this.i.addMediaBufferListener(this.u);
        this.i.addMediaErrorListener(this.x);
        this.i.addMuteListener(this.y);
        this.i.addReportVideoTimeListenersSet(this.v);
        this.s = new jo(getTAG());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        this.s.c();
        if (this.q) {
            this.q = false;
            of ofVar = this.h;
            long j = this.o;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.p;
            long j3 = i;
            if (!z) {
                ofVar.c(j, jCurrentTimeMillis, j2, j3);
            } else {
                ofVar.b(j, jCurrentTimeMillis, j2, j3);
                this.h.a(this.r, this.f20786c);
            }
        }
    }

    public NativePureVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.q = false;
        this.u = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "onBufferingStart");
                }
                NativePureVideoView.this.s.b();
            }
        };
        this.v = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "reportVideoTime: %s", Long.valueOf(j));
                }
                if (NativePureVideoView.this.h != null) {
                    NativePureVideoView.this.h.b(j);
                }
            }
        };
        this.w = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                if (NativePureVideoView.this.q) {
                    NativePureVideoView.this.h.a(i3, i4, NativePureVideoView.this.p, NativePureVideoView.this.r, NativePureVideoView.this.f20786c);
                    NativePureVideoView.this.h.a(i4, NativePureVideoView.this.l == null ? 0 : NativePureVideoView.this.l.getVideoDuration());
                }
                NativePureVideoView.this.e = i4;
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "onMediaStart: %s", Integer.valueOf(i3));
                }
                NativePureVideoView.this.k();
                if (NativePureVideoView.this.q) {
                    return;
                }
                NativePureVideoView.this.q = true;
                NativePureVideoView.this.p = i3;
                NativePureVideoView.this.o = System.currentTimeMillis();
                of ofVar = NativePureVideoView.this.h;
                if (i3 > 0) {
                    ofVar.i();
                } else {
                    ofVar.h();
                    NativePureVideoView.this.h.a(NativePureVideoView.this.s.e(), NativePureVideoView.this.s.d(), NativePureVideoView.this.o);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.a(i3, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, true);
                if (NativePureVideoView.this.h != null) {
                    long j = i3;
                    NativePureVideoView.this.h.a(j, j);
                }
            }
        };
        this.x = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, false);
            }
        };
        this.y = new MuteListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.5
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                if (NativePureVideoView.this.l != null) {
                    NativePureVideoView.this.l.e("y");
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                if (NativePureVideoView.this.l != null) {
                    NativePureVideoView.this.l.e("n");
                }
            }
        };
        a(context);
    }

    public NativePureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = false;
        this.u = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "onBufferingStart");
                }
                NativePureVideoView.this.s.b();
            }
        };
        this.v = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "reportVideoTime: %s", Long.valueOf(j));
                }
                if (NativePureVideoView.this.h != null) {
                    NativePureVideoView.this.h.b(j);
                }
            }
        };
        this.w = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                if (NativePureVideoView.this.q) {
                    NativePureVideoView.this.h.a(i3, i4, NativePureVideoView.this.p, NativePureVideoView.this.r, NativePureVideoView.this.f20786c);
                    NativePureVideoView.this.h.a(i4, NativePureVideoView.this.l == null ? 0 : NativePureVideoView.this.l.getVideoDuration());
                }
                NativePureVideoView.this.e = i4;
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "onMediaStart: %s", Integer.valueOf(i3));
                }
                NativePureVideoView.this.k();
                if (NativePureVideoView.this.q) {
                    return;
                }
                NativePureVideoView.this.q = true;
                NativePureVideoView.this.p = i3;
                NativePureVideoView.this.o = System.currentTimeMillis();
                of ofVar = NativePureVideoView.this.h;
                if (i3 > 0) {
                    ofVar.i();
                } else {
                    ofVar.h();
                    NativePureVideoView.this.h.a(NativePureVideoView.this.s.e(), NativePureVideoView.this.s.d(), NativePureVideoView.this.o);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.a(i3, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, true);
                if (NativePureVideoView.this.h != null) {
                    long j = i3;
                    NativePureVideoView.this.h.a(j, j);
                }
            }
        };
        this.x = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, false);
            }
        };
        this.y = new MuteListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.5
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                if (NativePureVideoView.this.l != null) {
                    NativePureVideoView.this.l.e("y");
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                if (NativePureVideoView.this.l != null) {
                    NativePureVideoView.this.l.e("n");
                }
            }
        };
        a(context);
    }

    public NativePureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = false;
        this.u = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "onBufferingStart");
                }
                NativePureVideoView.this.s.b();
            }
        };
        this.v = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "reportVideoTime: %s", Long.valueOf(j));
                }
                if (NativePureVideoView.this.h != null) {
                    NativePureVideoView.this.h.b(j);
                }
            }
        };
        this.w = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                if (NativePureVideoView.this.q) {
                    NativePureVideoView.this.h.a(i3, i4, NativePureVideoView.this.p, NativePureVideoView.this.r, NativePureVideoView.this.f20786c);
                    NativePureVideoView.this.h.a(i4, NativePureVideoView.this.l == null ? 0 : NativePureVideoView.this.l.getVideoDuration());
                }
                NativePureVideoView.this.e = i4;
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "onMediaStart: %s", Integer.valueOf(i3));
                }
                NativePureVideoView.this.k();
                if (NativePureVideoView.this.q) {
                    return;
                }
                NativePureVideoView.this.q = true;
                NativePureVideoView.this.p = i3;
                NativePureVideoView.this.o = System.currentTimeMillis();
                of ofVar = NativePureVideoView.this.h;
                if (i3 > 0) {
                    ofVar.i();
                } else {
                    ofVar.h();
                    NativePureVideoView.this.h.a(NativePureVideoView.this.s.e(), NativePureVideoView.this.s.d(), NativePureVideoView.this.o);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.a(i3, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, true);
                if (NativePureVideoView.this.h != null) {
                    long j = i3;
                    NativePureVideoView.this.h.a(j, j);
                }
            }
        };
        this.x = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, false);
            }
        };
        this.y = new MuteListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.5
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                if (NativePureVideoView.this.l != null) {
                    NativePureVideoView.this.l.e("y");
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                if (NativePureVideoView.this.l != null) {
                    NativePureVideoView.this.l.e("n");
                }
            }
        };
        a(context);
    }

    public NativePureVideoView(Context context) {
        super(context);
        this.q = false;
        this.u = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "onBufferingStart");
                }
                NativePureVideoView.this.s.b();
            }
        };
        this.v = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "reportVideoTime: %s", Long.valueOf(j));
                }
                if (NativePureVideoView.this.h != null) {
                    NativePureVideoView.this.h.b(j);
                }
            }
        };
        this.w = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                if (NativePureVideoView.this.q) {
                    NativePureVideoView.this.h.a(i3, i4, NativePureVideoView.this.p, NativePureVideoView.this.r, NativePureVideoView.this.f20786c);
                    NativePureVideoView.this.h.a(i4, NativePureVideoView.this.l == null ? 0 : NativePureVideoView.this.l.getVideoDuration());
                }
                NativePureVideoView.this.e = i4;
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (hw.a()) {
                    hw.a(NativePureVideoView.g, "onMediaStart: %s", Integer.valueOf(i3));
                }
                NativePureVideoView.this.k();
                if (NativePureVideoView.this.q) {
                    return;
                }
                NativePureVideoView.this.q = true;
                NativePureVideoView.this.p = i3;
                NativePureVideoView.this.o = System.currentTimeMillis();
                of ofVar = NativePureVideoView.this.h;
                if (i3 > 0) {
                    ofVar.i();
                } else {
                    ofVar.h();
                    NativePureVideoView.this.h.a(NativePureVideoView.this.s.e(), NativePureVideoView.this.s.d(), NativePureVideoView.this.o);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.a(i3, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, true);
                if (NativePureVideoView.this.h != null) {
                    long j = i3;
                    NativePureVideoView.this.h.a(j, j);
                }
            }
        };
        this.x = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                NativePureVideoView.this.j();
                NativePureVideoView.this.a(i3, false);
            }
        };
        this.y = new MuteListener() { // from class: com.huawei.openalliance.ad.views.NativePureVideoView.5
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                if (NativePureVideoView.this.l != null) {
                    NativePureVideoView.this.l.e("y");
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                if (NativePureVideoView.this.l != null) {
                    NativePureVideoView.this.l.e("n");
                }
            }
        };
        a(context);
    }
}
