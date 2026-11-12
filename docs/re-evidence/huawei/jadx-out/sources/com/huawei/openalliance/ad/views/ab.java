package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.iy;
import com.huawei.openalliance.ad.jo;
import com.huawei.openalliance.ad.lu;
import com.huawei.openalliance.ad.lw;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaPlayerReleaseListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener;
import com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener;
import com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.nw;
import com.huawei.openalliance.ad.ol;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.views.interfaces.IPlacementVideoView;
import com.huawei.operation.utils.Constants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class ab extends PlacementMediaView implements lu, IPlacementVideoView {
    private mh g;
    private ol h;
    private VideoView i;
    private boolean j;
    private PlacementMediaFile k;
    private boolean l;
    private boolean m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private boolean r;
    private int s;
    private jo t;
    private com.huawei.openalliance.ad.media.b u;
    private MediaBufferListener v;
    private MediaStateListener w;
    private MuteListener x;
    private MediaErrorListener y;

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setSoundVolume(float f) {
        this.i.setSoundVolume(f);
    }

    public void setPreferStartPlayTime(int i) {
        this.s = i;
        this.i.setPreferStartPlayTime(i);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setPlacementAd(IPlacementAd iPlacementAd) {
        MediaState currentState = this.i.getCurrentState();
        if (this.f21069a == iPlacementAd && currentState.isNotState(MediaState.State.IDLE) && currentState.isNotState(MediaState.State.ERROR)) {
            hw.b(getTAG(), "setPlacementVideoAd - has the same ad");
            return;
        }
        super.setPlacementAd(iPlacementAd);
        String tag = getTAG();
        StringBuilder sb = new StringBuilder("set placement ad:");
        sb.append(iPlacementAd == null ? Constants.NULL : iPlacementAd.getContentId());
        hw.b(tag, sb.toString());
        k();
        this.h.a(this.f21069a);
        if (this.f21069a != null) {
            j();
        } else {
            this.k = null;
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void setMediaPlayerReleaseListener(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
        VideoView videoView = this.i;
        if (videoView != null) {
            videoView.setMediaPlayerReleaseListener(mediaPlayerReleaseListener);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setAudioFocusType(int i) {
        this.i.setAudioFocusType(i);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        hw.b(getTAG(), RewardMethods.RESUME_VIEW);
        this.i.resumeView();
        this.i.setNeedPauseOnSurfaceDestory(true);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        hw.b(getTAG(), RewardMethods.PAUSE_VIEW);
        this.i.pauseView();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPlacementVideoView
    public void onCheckVideoHashResult(PlacementMediaFile placementMediaFile, boolean z) {
        hw.b(getTAG(), "onCheckVideoHashResult sucess: %s", Boolean.valueOf(z));
        if (!z || this.k == null || placementMediaFile == null) {
            return;
        }
        this.k = placementMediaFile;
        this.j = true;
        String strA = a(placementMediaFile);
        if (TextUtils.isEmpty(strA)) {
            strA = a(getContext(), placementMediaFile);
            if (TextUtils.isEmpty(strA)) {
                strA = placementMediaFile.getUrl();
            }
        }
        this.f21070b = strA;
        this.i.setVideoFileUrl(strA);
        this.i.setContentId(this.f21069a == null ? null : this.f21069a.getContentId());
        if (this.l) {
            hw.b(getTAG(), "play when hash check success");
            b(true, this.r);
        }
        if (this.m) {
            hw.b(getTAG(), "prefect when hash check success");
            this.i.prefetch();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public boolean i() {
        return this.i.isPlaying();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.p
    public VideoView getVideoView() {
        return this.i;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    MediaState getMediaState() {
        VideoView videoView = this.i;
        if (videoView != null) {
            return videoView.getMediaState();
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    ImageView getLastFrame() {
        if (this.i == null) {
            return null;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(this.i.getSurfaceBitmap());
        return imageView;
    }

    public MediaState getCurrentState() {
        return this.i.getCurrentState();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void g() {
        this.i.stop();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void f() {
        this.i.pause();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void e() {
        com.huawei.openalliance.ad.media.b bVar = this.u;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        hw.b(getTAG(), RewardMethods.DESTROY_VIEW);
        this.i.destroyView();
        this.g.b();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    protected void d(int i) {
        ol olVar = this.h;
        if (olVar != null) {
            olVar.a(this.p, i);
            this.h.a();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void d() {
        this.r = false;
        this.i.unmute();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void c(int i) {
        com.huawei.openalliance.ad.media.b bVar = this.u;
        if (bVar != null) {
            bVar.b(i);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void c() {
        this.r = true;
        this.i.mute();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void b(SegmentMediaStateListener segmentMediaStateListener) {
        this.i.addSegmentMediaStateListener(segmentMediaStateListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void b(MuteListener muteListener) {
        this.i.removeMuteListener(muteListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void b(MediaErrorListener mediaErrorListener) {
        this.i.removeMediaErrorListener(mediaErrorListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void b(MediaBufferListener mediaBufferListener) {
        this.i.removeMediaBufferListener(mediaBufferListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void b(long j) {
        com.huawei.openalliance.ad.media.b bVar = this.u;
        if (bVar != null) {
            bVar.a(j);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void b(int i) {
        com.huawei.openalliance.ad.media.b bVar = this.u;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void b() {
        if (this.i != null) {
            hw.b("PlacementVideoView", "release player");
            this.i.h();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(boolean z, boolean z2) {
        hw.b(getTAG(), "play, auto:" + z + ", isMute:" + z2);
        if (this.j) {
            b(z, z2);
        } else {
            this.l = true;
            this.r = z2;
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(String str) {
        this.h.a(str);
    }

    public void a(mh mhVar) {
        this.g = mhVar;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(SegmentMediaStateListener segmentMediaStateListener) {
        this.i.addOmSegmentMediaStateListener(segmentMediaStateListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(PPSVideoRenderListener pPSVideoRenderListener) {
        this.i.addPPSVideoRenderListener(pPSVideoRenderListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(MuteListener muteListener) {
        this.i.addMuteListener(muteListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void a(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
        VideoView videoView = this.i;
        if (videoView != null) {
            videoView.a(mediaPlayerReleaseListener);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(MediaErrorListener mediaErrorListener) {
        this.i.addMediaErrorListener(mediaErrorListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(MediaBufferListener mediaBufferListener) {
        this.i.addMediaBufferListener(mediaBufferListener);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(long j) {
        this.h.a(j);
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void a(int i) {
        a(i, true);
        a();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void a() {
        this.i.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        String str;
        if (!HiAd.getInstance(getContext().getApplicationContext()).isVideoCacheWhenPlay(60)) {
            return false;
        }
        if (!TextUtils.isEmpty(a(this.k))) {
            str = "local file exists.";
        } else {
            if (dg.l(a(getContext().getApplicationContext(), this.k))) {
                hw.b("PlacementVideoView", "enable video cache when play, checkAndDown mediaFile.");
                ol olVar = this.h;
                if (olVar == null) {
                    return true;
                }
                olVar.a();
                return true;
            }
            str = "local proxy file exists.";
        }
        hw.b("PlacementVideoView", str);
        return false;
    }

    private void k() {
        hw.b(getTAG(), "resetVideoView");
        setPreferStartPlayTime(0);
        this.j = false;
        this.l = false;
        this.m = true;
    }

    private void j() {
        if (this.f21069a == null) {
            return;
        }
        hw.b(getTAG(), "loadVideoInfo");
        PlacementMediaFile mediaFile = this.f21069a.getMediaFile();
        if (mediaFile == null || !mediaFile.isVideo()) {
            return;
        }
        this.k = mediaFile;
        Float fD = mediaFile.d();
        if (fD != null) {
            setRatio(fD);
            this.i.setRatio(fD);
        }
        this.i.setDefaultDuration((int) this.k.getDuration());
        this.h.a(this.k);
        this.l = false;
        this.m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getTAG() {
        return "PlacementVideoView_" + hashCode();
    }

    private void b(boolean z, boolean z2) {
        hw.b(getTAG(), "doRealPlay, auto:" + z + ", isMute:" + z2);
        this.t.a();
        if (z2) {
            this.i.mute();
        } else {
            this.i.unmute();
        }
        if (this.i.getCurrentState().isState(MediaState.State.PLAYBACK_COMPLETED)) {
            this.i.c(this.s, 1);
        } else {
            this.i.setPreferStartPlayTime(this.s);
        }
        this.i.play(z);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.hiad_placement_pure_video_view, this);
        this.h = new nw(context, this);
        this.t = new jo(getTAG());
        VideoView videoView = (VideoView) findViewById(R.id.hiad_id_video_view);
        this.i = videoView;
        videoView.setScreenOnWhilePlaying(true);
        this.i.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        this.i.addMediaBufferListener(this.v);
        this.i.addMediaStateListener(this.w);
        this.i.addMediaErrorListener(this.y);
        this.i.addMuteListener(this.x);
        this.i.setMuteOnlyOnLostAudioFocus(true);
        this.i.setRemediate(true);
        com.huawei.openalliance.ad.media.b bVar = new com.huawei.openalliance.ad.media.b(context);
        this.u = bVar;
        bVar.a(new ReportVideoTimeListener() { // from class: com.huawei.openalliance.ad.views.ab.1
            @Override // com.huawei.openalliance.ad.media.listener.ReportVideoTimeListener
            public void reportVideoTime(long j) {
                if (hw.a()) {
                    hw.a("PlacementVideoView", "reportVideoTime: %s", Long.valueOf(j));
                }
                if (ab.this.h != null) {
                    ab.this.h.b(j);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, boolean z) {
        this.t.c();
        long j = i;
        this.p = j;
        if (this.q) {
            this.q = false;
            setPreferStartPlayTime(i);
            ol olVar = this.h;
            long j2 = this.n;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j3 = this.o;
            if (z) {
                olVar.b(j2, jCurrentTimeMillis, j3, j);
            } else {
                olVar.c(j2, jCurrentTimeMillis, j3, j);
            }
        }
    }

    private String a(PlacementMediaFile placementMediaFile) {
        if (placementMediaFile == null) {
            return null;
        }
        String strB = placementMediaFile.b();
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        dn dnVarA = dk.a(getContext(), "normal");
        return dnVarA.c(dnVarA.e(placementMediaFile.getUrl()));
    }

    private String a(Context context, PlacementMediaFile placementMediaFile) {
        if (context == null || placementMediaFile == null || !HiAd.getInstance(context).isVideoCacheWhenPlay(60)) {
            return null;
        }
        return as.a(getContext(), new VideoInfo(placementMediaFile), new a(this), "placement");
    }

    static class a implements iy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ab> f21131a;

        @Override // com.huawei.openalliance.ad.iy
        public void a(int i) {
            ab abVar = this.f21131a.get();
            if (abVar == null) {
                return;
            }
            hw.b("PlacementVideoView", "placementStreamListener onError: %s", Integer.valueOf(i));
            abVar.h();
            abVar.d(i);
        }

        public a(ab abVar) {
            this.f21131a = new WeakReference<>(abVar);
        }
    }

    public ab(Context context) {
        super(context);
        this.g = new lw();
        this.m = true;
        this.p = 0L;
        this.v = new MediaBufferListener() { // from class: com.huawei.openalliance.ad.views.ab.2
            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferUpdate(int i) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingStart() {
                if (hw.a()) {
                    hw.a(ab.this.getTAG(), "contentId: %s onBufferingStart", ab.this.f21071c);
                }
                ab.this.t.b();
                ab.this.g.h();
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
            public void onBufferingEnd() {
                ab.this.g.i();
            }
        };
        this.w = new MediaStateListener() { // from class: com.huawei.openalliance.ad.views.ab.3
            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onProgress(int i, int i2) {
                ab.this.p = i2;
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i) {
                ab.this.a(i, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i) {
                if (hw.a()) {
                    hw.a(ab.this.getTAG(), "onMediaStart: %d", Integer.valueOf(i));
                }
                ab.this.q = true;
                long j = i;
                ab.this.o = j;
                ab.this.p = j;
                ab.this.n = System.currentTimeMillis();
                if (mediaPlayerAgent != null) {
                    ab.this.h.b(mediaPlayerAgent.a());
                }
                ol olVar = ab.this.h;
                if (i > 0) {
                    olVar.i();
                } else {
                    olVar.h();
                    ab.this.h.a(ab.this.t.e(), ab.this.t.d(), ab.this.n);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i) {
                ab.this.a(i, false);
            }

            @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
            public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i) {
                ab.this.a(i, true);
                ab.this.l();
            }
        };
        this.x = new MuteListener() { // from class: com.huawei.openalliance.ad.views.ab.4
            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onUnmute() {
                if (ab.this.k != null) {
                    ab.this.k.a("y");
                    ab.this.g.b(1.0f);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.MuteListener
            public void onMute() {
                if (ab.this.k != null) {
                    ab.this.k.a("n");
                    ab.this.g.b(0.0f);
                }
            }
        };
        this.y = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.views.ab.5
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
                ab.this.a(i, false);
            }
        };
        a(context);
    }
}
