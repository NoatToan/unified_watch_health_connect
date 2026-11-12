package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.inter.data.ILinkedSplashAd;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;

/* JADX INFO: loaded from: classes41.dex */
public class uu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.openalliance.ad.views.al f20694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaPlayerAgent f20695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20696c = false;

    public MediaPlayerAgent k() {
        return this.f20695b;
    }

    public boolean j() {
        return this.f20696c;
    }

    public void i() {
        com.huawei.openalliance.ad.views.al alVar = this.f20694a;
        if (alVar != null) {
            alVar.pause();
            this.f20694a.destroyView();
        }
        b(false);
    }

    public void h() {
        MediaPlayerAgent mediaPlayerAgent;
        if (this.f20694a == null || j() || (mediaPlayerAgent = this.f20695b) == null) {
            return;
        }
        mediaPlayerAgent.play();
        b(true);
    }

    public void g() {
        MediaPlayerAgent mediaPlayerAgent;
        if (this.f20694a == null || (mediaPlayerAgent = this.f20695b) == null) {
            return;
        }
        mediaPlayerAgent.pause();
        this.f20695b.b();
        b(false);
    }

    public com.huawei.openalliance.ad.views.al f() {
        return this.f20694a;
    }

    public void e(VideoInfo videoInfo) {
        if (this.f20694a == null || this.f20695b == null) {
            return;
        }
        hw.b("VideoPlayProxy", "onViewPartialHidden, start pause");
        this.f20695b.muteSound();
        if (videoInfo != null) {
            videoInfo.e("n");
        }
        this.f20695b.pause();
        this.f20695b.b();
        b(false);
    }

    public void e() {
        if (this.f20694a != null) {
            hw.b("VideoPlayProxy", "onViewPhysicalShowEnd, start pause. ");
            this.f20695b.pause();
            this.f20695b.b();
            b(false);
        }
    }

    public void d(VideoInfo videoInfo) {
        if (this.f20694a == null || this.f20695b == null) {
            return;
        }
        hw.b("VideoPlayProxy", "onViewShownBetweenFullAndPartial, start mute");
        this.f20695b.muteSound();
        this.f20695b.b();
        if (videoInfo != null) {
            videoInfo.e("n");
        }
    }

    public void d() {
        this.f20695b.unmuteSound();
    }

    public void c(VideoInfo videoInfo) {
        MediaPlayerAgent mediaPlayerAgent;
        if (this.f20694a == null || (mediaPlayerAgent = this.f20695b) == null) {
            return;
        }
        mediaPlayerAgent.unmuteSound();
        if (videoInfo != null) {
            videoInfo.e("y");
        }
    }

    public void c() {
        this.f20695b.muteSound();
    }

    public void b(boolean z) {
        this.f20696c = z;
    }

    public void b(VideoInfo videoInfo) {
        MediaPlayerAgent mediaPlayerAgent;
        if (this.f20694a == null || (mediaPlayerAgent = this.f20695b) == null) {
            return;
        }
        mediaPlayerAgent.muteSound();
        this.f20695b.b();
        if (videoInfo != null) {
            videoInfo.e("n");
        }
    }

    public void b() {
        this.f20695b.prepare();
    }

    public void a(boolean z) {
        this.f20695b.a(z);
        this.f20695b.play();
        b(true);
    }

    public void a(String str, VideoInfo videoInfo, int i) {
        if (TextUtils.isEmpty(str)) {
            this.f20695b.setMediaFile(videoInfo.getVideoDownloadUrl());
        } else {
            this.f20695b.setMediaFile(str);
        }
        this.f20695b.a(i);
        this.f20695b.muteSound();
        videoInfo.e("n");
    }

    public void a(com.huawei.openalliance.ad.views.al alVar) {
        this.f20694a = alVar;
    }

    public void a(MediaPlayerAgent mediaPlayerAgent) {
        this.f20695b = mediaPlayerAgent;
    }

    public void a(VideoInfo videoInfo, Integer num) {
        if (this.f20694a == null || videoInfo == null || this.f20695b == null) {
            return;
        }
        int iB = videoInfo.b();
        if (j()) {
            return;
        }
        hw.b("VideoPlayProxy", "onViewFullShown, start play, duration: %s, playProgress: %s", num, Integer.valueOf(iB));
        this.f20695b.setPreferStartPlayTime(iB);
        this.f20695b.play();
        b(true);
        if (num == null || Math.abs(num.intValue() - iB) >= 1000) {
            this.f20695b.seekToMillis(iB, 3);
        } else {
            hw.b("VideoPlayProxy", "onViewFullShown, seek to 0");
            this.f20695b.seekToMillis(0L, 3);
        }
    }

    public void a(VideoInfo videoInfo) {
        if (videoInfo != null) {
            int iB = videoInfo.b();
            hw.b("VideoPlayProxy", "on progress resume %s  soundSwitch %s", Integer.valueOf(iB), videoInfo.getSoundSwitch());
            if (this.f20694a == null || this.f20695b == null) {
                return;
            }
            if ("n".equals(videoInfo.getSoundSwitch())) {
                this.f20695b.muteSound();
            } else {
                this.f20695b.unmuteSound();
            }
        }
    }

    public void a(Context context, ILinkedSplashAd iLinkedSplashAd) {
        if (iLinkedSplashAd == null) {
            return;
        }
        a(new com.huawei.openalliance.ad.views.al(context));
        this.f20694a.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        this.f20694a.setVideoScaleMode(2);
        if (iLinkedSplashAd.getVideoInfo() != null) {
            this.f20694a.setVideoRatio(iLinkedSplashAd.getVideoInfo().getVideoRatio());
        }
    }

    public void a() {
        this.f20695b.play();
        b(true);
    }
}
