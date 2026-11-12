package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaPlayerReleaseListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.nv;
import com.huawei.openalliance.ad.ok;

/* JADX INFO: loaded from: classes12.dex */
public class aa extends PlacementMediaView implements com.huawei.openalliance.ad.views.interfaces.o {
    private ImageView g;
    private PlacementMediaFile h;
    private ok i;
    private MuteListener j;

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void a(int i) {
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void a(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void b() {
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    MediaState getMediaState() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.p
    public VideoView getVideoView() {
        return null;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void setMediaPlayerReleaseListener(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void setPlacementAd(IPlacementAd iPlacementAd) {
        super.setPlacementAd(iPlacementAd);
        hw.a("PlacementImageView", "setPlacementAd");
        if (this.f21069a != null) {
            PlacementMediaFile mediaFile = this.f21069a.getMediaFile();
            this.h = mediaFile;
            if (mediaFile.isVideo()) {
                return;
            }
            this.i.a(this.f21069a);
            this.f21070b = this.h.b();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    ImageView getLastFrame() {
        return this.g;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView, com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        this.g.setImageDrawable(null);
        super.destroyView();
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void d() {
        MuteListener muteListener = this.j;
        if (muteListener != null) {
            muteListener.onUnmute();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void c() {
        MuteListener muteListener = this.j;
        if (muteListener != null) {
            muteListener.onMute();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void b(MuteListener muteListener) {
        this.j = null;
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    public void a(MuteListener muteListener) {
        this.j = muteListener;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.o
    public void a(PlacementMediaFile placementMediaFile, Drawable drawable) {
        this.d = true;
        if (placementMediaFile == null || drawable == null) {
            this.e = false;
        } else if (this.h != null && TextUtils.equals(placementMediaFile.getUrl(), this.h.getUrl())) {
            this.e = true;
            this.g.setImageDrawable(drawable);
        }
        if (this.f) {
            a(true, true);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PlacementMediaView
    void a() {
        this.g.setImageDrawable(null);
    }

    private void a(Context context) {
        this.i = new nv(getContext(), this);
        this.g = new ImageView(context);
        addView(this.g, new RelativeLayout.LayoutParams(-1, -1));
        this.g.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public aa(Context context) {
        super(context);
        a(context);
    }
}
