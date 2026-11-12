package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hg;
import com.huawei.openalliance.ad.hh;
import com.huawei.openalliance.ad.hi;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.iu;
import com.huawei.openalliance.ad.jo;
import com.huawei.openalliance.ad.lu;
import com.huawei.openalliance.ad.lw;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.mx;
import com.huawei.openalliance.ad.my;
import com.huawei.openalliance.ad.nn;
import com.huawei.openalliance.ad.of;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.views.interfaces.INativeVideoView;
import com.huawei.openalliance.ad.views.interfaces.IPPSNativeView;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import com.huawei.operation.utils.Constants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class NativeVideoView extends NativeMediaView implements lu, INativeVideoView, IViewLifeCycle {
    private final ReportVideoTimeListener A;
    private MediaStateListener B;
    private MediaErrorListener C;
    private com.huawei.openalliance.ad.media.listener.a D;
    private MuteListener E;
    private am.a F;
    private mh g;
    private VideoEventListener h;
    private boolean i;
    private am j;
    private of k;
    private VideoInfo l;
    private ImageInfo m;
    private boolean n;
    private long o;
    private NativeVideoControlPanel p;
    private VideoView q;
    private IPPSNativeView r;
    private long s;
    private long t;
    private boolean u;
    private jo v;
    private iu w;
    private boolean x;
    private boolean y;
    private MediaBufferListener z;

    /* JADX INFO: loaded from: classes41.dex */
    public interface VideoEventListener {
        void onControlPanelHide(boolean z, int i);

        void onControlPanelShow(boolean z, int i);

        void onVideoComplete();

        void onVideoPause();

        void onVideoStart();

        void onVideoStop();
    }

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    @Deprecated
    public void setNotShowDataUsageAlert(boolean z) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    @Deprecated
    public void showFullScreenSwitchButton(boolean z) {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void updateStartShowTime(long j) {
        this.k.a(j);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void updateContent(String str) {
        this.k.a(str);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void stop() {
        this.j.b();
    }

    public void setVideoEventListener(VideoEventListener videoEventListener) {
        this.h = videoEventListener;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void setPpsNativeView(IPPSNativeView iPPSNativeView) {
        this.r = iPPSNativeView;
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView, com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void setNativeAd(INativeAd iNativeAd) {
        StringBuilder sb = new StringBuilder("setNativeAd ");
        sb.append(iNativeAd != null ? iNativeAd.getContentId() : Constants.NULL);
        hw.b("NativeVideoView", sb.toString());
        MediaState currentState = this.q.getCurrentState();
        if (this.f20786c == iNativeAd && currentState.isNotState(MediaState.State.IDLE) && currentState.isNotState(MediaState.State.ERROR)) {
            hw.b("NativeVideoView", "setNativeAd - has the same ad");
            return;
        }
        super.setNativeAd(iNativeAd);
        k();
        this.k.a(this.f20786c);
        if (this.f20786c != null) {
            j();
            g();
        } else {
            this.j.d(true);
            this.l = null;
        }
        if (!n() || l()) {
            return;
        }
        hw.b("NativeVideoView", "video auto play without sound.");
        this.u = true;
    }

    public void setCoverClickListener(View.OnClickListener onClickListener) {
        this.j.a(onClickListener);
    }

    public void setAutoPlayOnFirstShow(boolean z) {
        this.j.a(z);
    }

    public void setAudioFocusType(int i) {
        this.q.setAudioFocusType(i);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        this.j.f();
        f();
        this.f20784a = false;
        this.f.onGlobalLayout();
        this.q.setNeedPauseOnSurfaceDestory(true);
    }

    public void play() {
        this.j.b(false);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        this.j.e();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void pause() {
        this.j.g();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void onPreviewImageLoaded(ImageInfo imageInfo, Drawable drawable) {
        ImageInfo imageInfo2 = this.m;
        if (imageInfo2 == null || imageInfo == null || !TextUtils.equals(imageInfo2.getUrl(), imageInfo.getUrl())) {
            return;
        }
        this.j.a(drawable);
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.b();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void onCheckVideoHashResult(VideoInfo videoInfo, boolean z) {
        VideoInfo videoInfo2;
        hw.b("NativeVideoView", "onCheckVideoHashResult sucess: %s", Boolean.valueOf(z));
        if (!z || (videoInfo2 = this.l) == null || videoInfo == null || !TextUtils.equals(videoInfo2.getVideoDownloadUrl(), videoInfo.getVideoDownloadUrl())) {
            return;
        }
        this.n = true;
        String strA = as.a(getContext().getApplicationContext(), videoInfo);
        if (TextUtils.isEmpty(strA)) {
            strA = videoInfo.getVideoDownloadUrl();
        }
        if (dg.l(strA) && as.a(videoInfo)) {
            String strA2 = as.a(getContext(), videoInfo, this.w);
            hw.a("NativeVideoView", "proxyUrl: %s", strA2);
            if (!TextUtils.isEmpty(strA2)) {
                strA = strA2;
            }
        }
        this.j.a(strA);
        if (this.f20784a) {
            this.j.a(getContinuePlayTime());
            boolean zN = n();
            hw.b("NativeVideoView", "onCheckVideoHashResult - has full shown, autoPlay: %s", Boolean.valueOf(zN));
            this.j.c(zN);
            if (this.l.isBackFromFullScreen()) {
                u();
            } else if (v()) {
                long timeBeforeVideoAutoPlay = ((long) videoInfo.getTimeBeforeVideoAutoPlay()) - (System.currentTimeMillis() - this.o);
                if (timeBeforeVideoAutoPlay < 0) {
                    timeBeforeVideoAutoPlay = 0;
                }
                this.j.a(timeBeforeVideoAutoPlay);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public void notifyStreamError(int i) {
        MediaErrorListener mediaErrorListener = this.C;
        if (mediaErrorListener != null && i != -3) {
            mediaErrorListener.onError(null, this.e, i, -1);
        }
        of ofVar = this.k;
        if (ofVar != null) {
            ofVar.a(this.e, i);
        }
        if (this.f20786c == null || this.x) {
            return;
        }
        this.x = true;
        hw.b("NativeVideoView", "reInject videoInfo.");
        VideoInfo videoInfo = this.f20786c.getVideoInfo();
        this.l = videoInfo;
        videoInfo.d(2);
        i();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public VideoView getVideoView() {
        return this.q;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.INativeVideoView
    public ImageView getPreviewImageView() {
        return this.p.e();
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

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    protected int getHiddenAreaPercentageThreshhold() {
        VideoInfo videoInfo = this.l;
        return videoInfo != null ? Math.max(100 - videoInfo.getAutoStopPlayAreaRatio(), 0) : super.getHiddenAreaPercentageThreshhold();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    protected int getAutoPlayAreaPercentageThresshold() {
        VideoInfo videoInfo = this.l;
        return videoInfo != null ? videoInfo.getAutoPlayAreaRatio() : super.getAutoPlayAreaPercentageThresshold();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    protected void e() {
        hw.b("NativeVideoView", "onViewShownBetweenFullAndPartial");
        this.j.f(true);
        f();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        this.q.destroyView();
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    protected void d() {
        this.q.removeMediaErrorListener(this.C);
        this.q.removeMuteListener(this.E);
        hw.b("NativeVideoView", "onViewPartialHidden");
        this.j.f(false);
        this.j.c(false);
        this.y = true;
        this.j.a();
        this.j.b();
        VideoInfo videoInfo = this.l;
        if (videoInfo != null) {
            videoInfo.b(true);
            this.l.c(false);
        }
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    protected void c() {
        this.o = System.currentTimeMillis();
        this.j.f(true);
        a(this.l);
        f();
        hw.b("NativeVideoView", "onViewFullShown hashCheckSuccess: %s", Boolean.valueOf(this.n));
        if (this.n) {
            boolean zN = n();
            this.y = false;
            hw.b("NativeVideoView", "onViewFullShown autoplay: %s", Boolean.valueOf(zN));
            this.j.c(zN);
            this.j.a(getContinuePlayTime());
            VideoInfo videoInfo = this.l;
            if (videoInfo != null && videoInfo.isBackFromFullScreen()) {
                u();
            } else if (v()) {
                this.j.a(this.l.getTimeBeforeVideoAutoPlay());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.NativeMediaView
    protected void b() {
        super.b();
        this.q.setNeedPauseOnSurfaceDestory(true);
    }

    public void autoPlay() {
        if (this.l == null) {
            return;
        }
        this.j.a(true);
        this.j.a(this.l.getTimeBeforeVideoAutoPlay());
    }

    public void a(mh mhVar, com.huawei.openalliance.ad.inter.data.e eVar) {
        this.g = mhVar;
        a(eVar);
    }

    private void w() {
        hh.a((hg) null);
        hi.a(getContext()).b();
    }

    private boolean v() {
        if (this.l == null || !cb.e(getContext()) || !n()) {
            return false;
        }
        if (o() && !pa.G(this.f20786c.getCtrlSwitchs())) {
            int autoPlayNetwork = this.f20786c.getVideoConfiguration().getAutoPlayNetwork();
            if (autoPlayNetwork == 2) {
                return false;
            }
            if (autoPlayNetwork == 1 || (autoPlayNetwork == 0 && cb.c(getContext()))) {
                return true;
            }
            if (autoPlayNetwork == 0 && !cb.c(getContext())) {
                return false;
            }
        }
        if (this.l.getAutoPlayNetwork() == 1) {
            return true;
        }
        return this.l.getAutoPlayNetwork() == 0 && cb.c(getContext());
    }

    private void u() {
        this.l.c(false);
        if (this.l.c()) {
            this.j.c();
        } else {
            this.j.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        VideoEventListener videoEventListener = this.h;
        if (videoEventListener != null) {
            videoEventListener.onVideoComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        VideoEventListener videoEventListener = this.h;
        if (videoEventListener != null) {
            videoEventListener.onVideoPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        VideoEventListener videoEventListener = this.h;
        if (videoEventListener != null) {
            videoEventListener.onVideoStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        VideoEventListener videoEventListener = this.h;
        if (videoEventListener != null) {
            videoEventListener.onVideoStart();
        }
    }

    private boolean o() {
        return (this.f20786c == null || this.f20786c.getVideoConfiguration() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        VideoInfo videoInfo = this.l;
        if (videoInfo == null) {
            return false;
        }
        if (videoInfo.b() >= this.l.getVideoDuration()) {
            this.l.e(0);
            hw.b("NativeVideoView", "play progress bigger than video duration, skip autoPlay.");
            return false;
        }
        if (o() && !pa.G(this.f20786c.getCtrlSwitchs())) {
            int autoPlayNetwork = this.f20786c.getVideoConfiguration().getAutoPlayNetwork();
            hw.b("NativeVideoView", "videoCfg, auto play net: %s.", Integer.valueOf(autoPlayNetwork));
            if (autoPlayNetwork == 2) {
                return false;
            }
            if (autoPlayNetwork == 1 || (autoPlayNetwork == 0 && cb.c(getContext()))) {
                return true;
            }
            if (autoPlayNetwork == 0 && !cb.c(getContext())) {
                return false;
            }
        }
        return TextUtils.equals(this.l.getVideoAutoPlay(), "y") || TextUtils.equals(this.l.getVideoAutoPlay(), "a");
    }

    private boolean m() {
        am amVar = this.j;
        return amVar != null && amVar.h();
    }

    private boolean l() {
        if (!o() || pa.H(this.f20786c.getCtrlSwitchs()) || m()) {
            VideoInfo videoInfo = this.l;
            return videoInfo != null && TextUtils.equals(videoInfo.getSoundSwitch(), "y");
        }
        boolean zIsMute = this.f20786c.getVideoConfiguration().isMute();
        hw.b("NativeVideoView", "videoCfg, isMute: %s", Boolean.valueOf(zIsMute));
        return !zIsMute;
    }

    private void k() {
        this.n = false;
        this.j.g(true);
    }

    private void j() {
        List<ImageInfo> imageInfos;
        if (this.f20786c == null || (imageInfos = this.f20786c.getImageInfos()) == null || imageInfos.size() <= 0) {
            return;
        }
        ImageInfo imageInfo = imageInfos.get(0);
        this.m = imageInfo;
        if (imageInfo != null) {
            if (dg.l(imageInfo.getUrl())) {
                hw.b("NativeVideoView", "don't load preview image with http url");
                return;
            }
            if (this.m.getHeight() > 0) {
                setRatio(Float.valueOf((this.m.getWidth() * 1.0f) / this.m.getHeight()));
            }
            this.k.a(this.m);
        }
    }

    private void i() {
        if (this.l == null) {
            return;
        }
        h();
        this.j.a(this.l);
        Float videoRatio = this.l.getVideoRatio();
        if (videoRatio == null) {
            videoRatio = Float.valueOf(1.7777778f);
        }
        setRatio(videoRatio);
        this.j.d(!l());
        this.j.a(getContinuePlayTime());
        this.j.b(this.l.getVideoDuration());
        this.j.c(getAutoPlayNetForVideoCtrlBridge());
        this.k.a(this.l);
        this.p.setNonWifiAlertMsg(this.l.getVideoFileSize() > 0 ? getResources().getString(R.string.hiad_consume_data_to_play_video, com.huawei.openalliance.ad.utils.ai.a(getContext(), this.l.getVideoFileSize())) : getResources().getString(R.string.hiad_consume_data_to_play_video_no_data_size));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void h() {
        String str;
        String str2;
        hw.b("NativeVideoView", "reset video info");
        if (this.f20786c == null || this.l == null) {
            hw.b("NativeVideoView", "nativeAd : %s, videoInfo : %s", Boolean.valueOf(this.f20786c == null), Boolean.valueOf(this.l == null));
            return;
        }
        Map map = (Map) bk.b(this.f20786c.E(), Map.class, new Class[0]);
        hw.b("NativeVideoView", "configMap : %s", this.f20786c.E());
        if (map != null) {
            str = (String) map.get(com.huawei.openalliance.ad.constant.Constants.VIDEO_AUTO_PLAY);
            str2 = (String) map.get(com.huawei.openalliance.ad.constant.Constants.VIDEO_PLAY_SOUND);
        } else {
            str = null;
            str2 = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "y";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "n";
        }
        this.l.b(str);
        this.l.c(str2);
        this.l.e(str2);
        this.l.i(TextUtils.equals(str, "a") ? 1 : 0);
    }

    private String getTAG() {
        return "NativeVideoView_" + hashCode();
    }

    private int getContinuePlayTime() {
        VideoInfo videoInfo = this.l;
        if (videoInfo == null) {
            hw.a("NativeVideoView", "getContinuePlayTime other");
            return 0;
        }
        int iB = videoInfo.b();
        if (iB >= 5000) {
            return iB;
        }
        return 0;
    }

    private int getAutoPlayNetForVideoCtrlBridge() {
        if (this.f20786c == null) {
            return 0;
        }
        return (this.f20786c.getVideoConfiguration() == null || (pa.G(this.f20786c.getCtrlSwitchs()) && this.l != null)) ? this.l.getAutoPlayNetwork() : this.f20786c.getVideoConfiguration().getAutoPlayNetwork();
    }

    private void g() {
        if (this.f20786c == null) {
            return;
        }
        this.l = this.f20786c.getVideoInfo();
        i();
    }

    private void f() {
        this.q.addMediaErrorListener(this.C);
        this.q.addMuteListener(this.E);
        this.j.d(!l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, int i) {
        VideoEventListener videoEventListener = this.h;
        if (videoEventListener != null) {
            videoEventListener.onControlPanelHide(z, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i) {
        VideoEventListener videoEventListener = this.h;
        if (videoEventListener != null) {
            videoEventListener.onControlPanelShow(z, i);
        }
    }

    private void a(com.huawei.openalliance.ad.inter.data.e eVar) {
        if (eVar.getVideoInfo() != null) {
            this.g.a(my.a(0.0f, v(), mx.STANDALONE));
        }
    }

    private void a(VideoInfo videoInfo) {
        hg hgVarA = hh.a();
        if (hgVarA == null || videoInfo == null) {
            return;
        }
        int iC = hgVarA.c();
        videoInfo.e(iC);
        hw.b("NativeVideoView", "obtain progress from linked view " + iC);
        w();
    }

    private void a(Context context) {
        this.k = new nn(context, this);
        LayoutInflater.from(context).inflate(R.layout.hiad_native_video_view, this);
        this.q = (VideoView) findViewById(R.id.hiad_id_video_view);
        this.p = (NativeVideoControlPanel) findViewById(R.id.hiad_native_video_ctrl_panel);
        this.q.setStandalone(false);
        this.q.setScreenOnWhilePlaying(true);
        this.q.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        am amVar = new am(this.q, this.p);
        this.j = amVar;
        amVar.a(this.F);
        this.q.addMediaStateListener(this.B);
        this.q.addMediaBufferListener(this.z);
        this.q.addMediaErrorListener(this.C);
        this.q.addMuteListener(this.E);
        this.q.addMediaInfoListener(this.D);
        this.q.addReportVideoTimeListenersSet(this.A);
        this.w = new iu(this);
        this.v = new jo(getTAG());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        VideoInfo videoInfo = this.l;
        if (videoInfo != null) {
            videoInfo.e(z ? 0 : i);
        }
        this.v.c();
        if (this.i) {
            this.i = false;
            if (!z) {
                this.k.c(this.s, System.currentTimeMillis(), this.t, i);
                this.g.k();
            } else {
                this.k.b(this.s, System.currentTimeMillis(), this.t, i);
                this.k.a(this.r, this.f20786c);
                this.g.g();
            }
        }
    }

    public NativeVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = new lw();
        this.i = false;
        this.n = false;
        this.x = false;
        this.y = false;
        this.z = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a("NativeVideoView", "onBufferingStart");
                }
                NativeVideoView.this.v.b();
                NativeVideoView.this.g.h();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                NativeVideoView.this.g.i();
            }
        };
        this.A = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("NativeVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (NativeVideoView.this.k != null) {
                    NativeVideoView.this.k.b(j);
                }
            }
        };
        this.B = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                NativeVideoView.this.e = i4;
                if (NativeVideoView.this.i) {
                    NativeVideoView.this.g.a(i3);
                    NativeVideoView.this.k.a(i3, i4, NativeVideoView.this.t, NativeVideoView.this.r, NativeVideoView.this.f20786c);
                    NativeVideoView.this.k.a(i4, NativeVideoView.this.l == null ? 0 : NativeVideoView.this.l.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativeVideoView.this.a(i3, false);
                NativeVideoView.this.r();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (hw.a()) {
                    hw.a("NativeVideoView", "onMediaStart: %s", Integer.valueOf(i3));
                }
                if (NativeVideoView.this.i) {
                    return;
                }
                NativeVideoView.this.i = true;
                NativeVideoView.this.t = i3;
                NativeVideoView.this.s = System.currentTimeMillis();
                NativeVideoView.this.q();
                mh mhVar = NativeVideoView.this.g;
                if (i3 <= 0) {
                    if (mhVar != null && NativeVideoView.this.l != null) {
                        NativeVideoView.this.g.a(NativeVideoView.this.l.getVideoDuration(), !"y".equals(NativeVideoView.this.l.getSoundSwitch()));
                    }
                    NativeVideoView.this.k.h();
                    NativeVideoView.this.k.a(NativeVideoView.this.v.e(), NativeVideoView.this.v.d(), NativeVideoView.this.s);
                    return;
                }
                mhVar.l();
                NativeVideoView.this.k.i();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativeVideoView.this.a(i3, false);
                NativeVideoView.this.s();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.b(true);
                }
                NativeVideoView.this.a(i3, true);
                NativeVideoView.this.t();
                if (NativeVideoView.this.k != null) {
                    long j = i3;
                    NativeVideoView.this.k.a(j, j);
                }
            }
        };
        this.C = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                NativeVideoView.this.a(i3, false);
                if (NativeVideoView.this.f20785b || cb.e(NativeVideoView.this.getContext())) {
                    return;
                }
                Toast toastMakeText = Toast.makeText(NativeVideoView.this.getContext(), R.string.hiad_network_error, 0);
                toastMakeText.setGravity(17, 0, 0);
                toastMakeText.show();
            }
        };
        this.D = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.5
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i3) {
                NativeVideoView.this.j.b(i3);
            }
        };
        this.E = new MuteListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.6
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("NativeVideoView", "onUnmute");
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.u = false;
                    NativeVideoView.this.l.e("y");
                    NativeVideoView.this.k.a(false);
                    NativeVideoView.this.g.b(1.0f);
                }
                NativeVideoView.this.j.e(false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("NativeVideoView", "onMute");
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.e("n");
                    if (!NativeVideoView.this.u && NativeVideoView.this.i) {
                        NativeVideoView.this.k.a(true);
                    } else {
                        NativeVideoView.this.u = false;
                    }
                    NativeVideoView.this.g.b(0.0f);
                }
                NativeVideoView.this.j.e(true);
            }
        };
        this.F = new am.a() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.7
            @Override // com.huawei.openalliance.ad.views.am.a
            public boolean b() {
                return NativeVideoView.this.n() && !NativeVideoView.this.y;
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void b(boolean z, int i3) {
                NativeVideoView.this.b(z, i3);
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void b(boolean z) {
                hw.b("NativeVideoView", "doRealPlay, auto:" + z);
                NativeVideoView.this.v.a();
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a(boolean z, int i3) {
                NativeVideoView.this.a(z, i3);
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a(boolean z) {
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.b(!z);
                }
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a() {
                if (NativeVideoView.this.r != null) {
                    NativeVideoView.this.r.a(5);
                }
            }
        };
        a(context);
    }

    public NativeVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new lw();
        this.i = false;
        this.n = false;
        this.x = false;
        this.y = false;
        this.z = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a("NativeVideoView", "onBufferingStart");
                }
                NativeVideoView.this.v.b();
                NativeVideoView.this.g.h();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                NativeVideoView.this.g.i();
            }
        };
        this.A = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("NativeVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (NativeVideoView.this.k != null) {
                    NativeVideoView.this.k.b(j);
                }
            }
        };
        this.B = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                NativeVideoView.this.e = i4;
                if (NativeVideoView.this.i) {
                    NativeVideoView.this.g.a(i3);
                    NativeVideoView.this.k.a(i3, i4, NativeVideoView.this.t, NativeVideoView.this.r, NativeVideoView.this.f20786c);
                    NativeVideoView.this.k.a(i4, NativeVideoView.this.l == null ? 0 : NativeVideoView.this.l.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativeVideoView.this.a(i3, false);
                NativeVideoView.this.r();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (hw.a()) {
                    hw.a("NativeVideoView", "onMediaStart: %s", Integer.valueOf(i3));
                }
                if (NativeVideoView.this.i) {
                    return;
                }
                NativeVideoView.this.i = true;
                NativeVideoView.this.t = i3;
                NativeVideoView.this.s = System.currentTimeMillis();
                NativeVideoView.this.q();
                mh mhVar = NativeVideoView.this.g;
                if (i3 <= 0) {
                    if (mhVar != null && NativeVideoView.this.l != null) {
                        NativeVideoView.this.g.a(NativeVideoView.this.l.getVideoDuration(), !"y".equals(NativeVideoView.this.l.getSoundSwitch()));
                    }
                    NativeVideoView.this.k.h();
                    NativeVideoView.this.k.a(NativeVideoView.this.v.e(), NativeVideoView.this.v.d(), NativeVideoView.this.s);
                    return;
                }
                mhVar.l();
                NativeVideoView.this.k.i();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativeVideoView.this.a(i3, false);
                NativeVideoView.this.s();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.b(true);
                }
                NativeVideoView.this.a(i3, true);
                NativeVideoView.this.t();
                if (NativeVideoView.this.k != null) {
                    long j = i3;
                    NativeVideoView.this.k.a(j, j);
                }
            }
        };
        this.C = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                NativeVideoView.this.a(i3, false);
                if (NativeVideoView.this.f20785b || cb.e(NativeVideoView.this.getContext())) {
                    return;
                }
                Toast toastMakeText = Toast.makeText(NativeVideoView.this.getContext(), R.string.hiad_network_error, 0);
                toastMakeText.setGravity(17, 0, 0);
                toastMakeText.show();
            }
        };
        this.D = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.5
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i3) {
                NativeVideoView.this.j.b(i3);
            }
        };
        this.E = new MuteListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.6
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("NativeVideoView", "onUnmute");
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.u = false;
                    NativeVideoView.this.l.e("y");
                    NativeVideoView.this.k.a(false);
                    NativeVideoView.this.g.b(1.0f);
                }
                NativeVideoView.this.j.e(false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("NativeVideoView", "onMute");
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.e("n");
                    if (!NativeVideoView.this.u && NativeVideoView.this.i) {
                        NativeVideoView.this.k.a(true);
                    } else {
                        NativeVideoView.this.u = false;
                    }
                    NativeVideoView.this.g.b(0.0f);
                }
                NativeVideoView.this.j.e(true);
            }
        };
        this.F = new am.a() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.7
            @Override // com.huawei.openalliance.ad.views.am.a
            public boolean b() {
                return NativeVideoView.this.n() && !NativeVideoView.this.y;
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void b(boolean z, int i3) {
                NativeVideoView.this.b(z, i3);
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void b(boolean z) {
                hw.b("NativeVideoView", "doRealPlay, auto:" + z);
                NativeVideoView.this.v.a();
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a(boolean z, int i3) {
                NativeVideoView.this.a(z, i3);
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a(boolean z) {
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.b(!z);
                }
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a() {
                if (NativeVideoView.this.r != null) {
                    NativeVideoView.this.r.a(5);
                }
            }
        };
        a(context);
    }

    public NativeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new lw();
        this.i = false;
        this.n = false;
        this.x = false;
        this.y = false;
        this.z = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a("NativeVideoView", "onBufferingStart");
                }
                NativeVideoView.this.v.b();
                NativeVideoView.this.g.h();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                NativeVideoView.this.g.i();
            }
        };
        this.A = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("NativeVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (NativeVideoView.this.k != null) {
                    NativeVideoView.this.k.b(j);
                }
            }
        };
        this.B = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                NativeVideoView.this.e = i4;
                if (NativeVideoView.this.i) {
                    NativeVideoView.this.g.a(i3);
                    NativeVideoView.this.k.a(i3, i4, NativeVideoView.this.t, NativeVideoView.this.r, NativeVideoView.this.f20786c);
                    NativeVideoView.this.k.a(i4, NativeVideoView.this.l == null ? 0 : NativeVideoView.this.l.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativeVideoView.this.a(i3, false);
                NativeVideoView.this.r();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (hw.a()) {
                    hw.a("NativeVideoView", "onMediaStart: %s", Integer.valueOf(i3));
                }
                if (NativeVideoView.this.i) {
                    return;
                }
                NativeVideoView.this.i = true;
                NativeVideoView.this.t = i3;
                NativeVideoView.this.s = System.currentTimeMillis();
                NativeVideoView.this.q();
                mh mhVar = NativeVideoView.this.g;
                if (i3 <= 0) {
                    if (mhVar != null && NativeVideoView.this.l != null) {
                        NativeVideoView.this.g.a(NativeVideoView.this.l.getVideoDuration(), !"y".equals(NativeVideoView.this.l.getSoundSwitch()));
                    }
                    NativeVideoView.this.k.h();
                    NativeVideoView.this.k.a(NativeVideoView.this.v.e(), NativeVideoView.this.v.d(), NativeVideoView.this.s);
                    return;
                }
                mhVar.l();
                NativeVideoView.this.k.i();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativeVideoView.this.a(i3, false);
                NativeVideoView.this.s();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.b(true);
                }
                NativeVideoView.this.a(i3, true);
                NativeVideoView.this.t();
                if (NativeVideoView.this.k != null) {
                    long j = i3;
                    NativeVideoView.this.k.a(j, j);
                }
            }
        };
        this.C = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                NativeVideoView.this.a(i3, false);
                if (NativeVideoView.this.f20785b || cb.e(NativeVideoView.this.getContext())) {
                    return;
                }
                Toast toastMakeText = Toast.makeText(NativeVideoView.this.getContext(), R.string.hiad_network_error, 0);
                toastMakeText.setGravity(17, 0, 0);
                toastMakeText.show();
            }
        };
        this.D = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.5
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i3) {
                NativeVideoView.this.j.b(i3);
            }
        };
        this.E = new MuteListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.6
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("NativeVideoView", "onUnmute");
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.u = false;
                    NativeVideoView.this.l.e("y");
                    NativeVideoView.this.k.a(false);
                    NativeVideoView.this.g.b(1.0f);
                }
                NativeVideoView.this.j.e(false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("NativeVideoView", "onMute");
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.e("n");
                    if (!NativeVideoView.this.u && NativeVideoView.this.i) {
                        NativeVideoView.this.k.a(true);
                    } else {
                        NativeVideoView.this.u = false;
                    }
                    NativeVideoView.this.g.b(0.0f);
                }
                NativeVideoView.this.j.e(true);
            }
        };
        this.F = new am.a() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.7
            @Override // com.huawei.openalliance.ad.views.am.a
            public boolean b() {
                return NativeVideoView.this.n() && !NativeVideoView.this.y;
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void b(boolean z, int i3) {
                NativeVideoView.this.b(z, i3);
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void b(boolean z) {
                hw.b("NativeVideoView", "doRealPlay, auto:" + z);
                NativeVideoView.this.v.a();
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a(boolean z, int i3) {
                NativeVideoView.this.a(z, i3);
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a(boolean z) {
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.b(!z);
                }
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a() {
                if (NativeVideoView.this.r != null) {
                    NativeVideoView.this.r.a(5);
                }
            }
        };
        a(context);
    }

    public NativeVideoView(Context context) {
        super(context);
        this.g = new lw();
        this.i = false;
        this.n = false;
        this.x = false;
        this.y = false;
        this.z = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.1
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a("NativeVideoView", "onBufferingStart");
                }
                NativeVideoView.this.v.b();
                NativeVideoView.this.g.h();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                NativeVideoView.this.g.i();
            }
        };
        this.A = new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.2
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("NativeVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (NativeVideoView.this.k != null) {
                    NativeVideoView.this.k.b(j);
                }
            }
        };
        this.B = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i3, int i4) {
                NativeVideoView.this.e = i4;
                if (NativeVideoView.this.i) {
                    NativeVideoView.this.g.a(i3);
                    NativeVideoView.this.k.a(i3, i4, NativeVideoView.this.t, NativeVideoView.this.r, NativeVideoView.this.f20786c);
                    NativeVideoView.this.k.a(i4, NativeVideoView.this.l == null ? 0 : NativeVideoView.this.l.getVideoDuration());
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativeVideoView.this.a(i3, false);
                NativeVideoView.this.r();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (hw.a()) {
                    hw.a("NativeVideoView", "onMediaStart: %s", Integer.valueOf(i3));
                }
                if (NativeVideoView.this.i) {
                    return;
                }
                NativeVideoView.this.i = true;
                NativeVideoView.this.t = i3;
                NativeVideoView.this.s = System.currentTimeMillis();
                NativeVideoView.this.q();
                mh mhVar = NativeVideoView.this.g;
                if (i3 <= 0) {
                    if (mhVar != null && NativeVideoView.this.l != null) {
                        NativeVideoView.this.g.a(NativeVideoView.this.l.getVideoDuration(), !"y".equals(NativeVideoView.this.l.getSoundSwitch()));
                    }
                    NativeVideoView.this.k.h();
                    NativeVideoView.this.k.a(NativeVideoView.this.v.e(), NativeVideoView.this.v.d(), NativeVideoView.this.s);
                    return;
                }
                mhVar.l();
                NativeVideoView.this.k.i();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i3) {
                NativeVideoView.this.a(i3, false);
                NativeVideoView.this.s();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i3) {
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.b(true);
                }
                NativeVideoView.this.a(i3, true);
                NativeVideoView.this.t();
                if (NativeVideoView.this.k != null) {
                    long j = i3;
                    NativeVideoView.this.k.a(j, j);
                }
            }
        };
        this.C = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.4
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i3, int i4, int i5) {
                NativeVideoView.this.a(i3, false);
                if (NativeVideoView.this.f20785b || cb.e(NativeVideoView.this.getContext())) {
                    return;
                }
                Toast toastMakeText = Toast.makeText(NativeVideoView.this.getContext(), R.string.hiad_network_error, 0);
                toastMakeText.setGravity(17, 0, 0);
                toastMakeText.show();
            }
        };
        this.D = new com.huawei.openalliance.ad.media.listener.a() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.5
            @Override // com.huawei.openalliance.ad.media.listener.a
            public void b(int i3) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.a
            public void a(int i3) {
                NativeVideoView.this.j.b(i3);
            }
        };
        this.E = new MuteListener() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.6
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                hw.b("NativeVideoView", "onUnmute");
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.u = false;
                    NativeVideoView.this.l.e("y");
                    NativeVideoView.this.k.a(false);
                    NativeVideoView.this.g.b(1.0f);
                }
                NativeVideoView.this.j.e(false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                hw.b("NativeVideoView", "onMute");
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.e("n");
                    if (!NativeVideoView.this.u && NativeVideoView.this.i) {
                        NativeVideoView.this.k.a(true);
                    } else {
                        NativeVideoView.this.u = false;
                    }
                    NativeVideoView.this.g.b(0.0f);
                }
                NativeVideoView.this.j.e(true);
            }
        };
        this.F = new am.a() { // from class: com.huawei.openalliance.ad.views.NativeVideoView.7
            @Override // com.huawei.openalliance.ad.views.am.a
            public boolean b() {
                return NativeVideoView.this.n() && !NativeVideoView.this.y;
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void b(boolean z, int i3) {
                NativeVideoView.this.b(z, i3);
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void b(boolean z) {
                hw.b("NativeVideoView", "doRealPlay, auto:" + z);
                NativeVideoView.this.v.a();
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a(boolean z, int i3) {
                NativeVideoView.this.a(z, i3);
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a(boolean z) {
                if (NativeVideoView.this.l != null) {
                    NativeVideoView.this.l.b(!z);
                }
            }

            @Override // com.huawei.openalliance.ad.views.am.a
            public void a() {
                if (NativeVideoView.this.r != null) {
                    NativeVideoView.this.r.a(5);
                }
            }
        };
        a(context);
    }
}
