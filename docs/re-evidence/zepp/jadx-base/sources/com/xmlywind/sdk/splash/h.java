package com.xmlywind.sdk.splash;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.BaseBroadcastReceiver;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.base.views.AdVideoPlayer;

/* JADX INFO: loaded from: classes22.dex */
class h extends e {
    private final AdVideoPlayer b;
    private final BaseAdUnit c;

    public h(Context context, BaseAdUnit baseAdUnit) {
        super(context);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        AdVideoPlayer adVideoPlayer = new AdVideoPlayer(context);
        this.b = adVideoPlayer;
        setBackgroundColor(-16777216);
        this.c = baseAdUnit;
        addView(adVideoPlayer, layoutParams);
    }

    @Override // com.xmlywind.sdk.splash.e
    public void a() {
        super.setVisibility(0);
        SigmobLog.i("video showAd");
        this.b.setVisibility(0);
        this.b.d();
    }

    @Override // com.xmlywind.sdk.splash.e
    public boolean a(BaseAdUnit baseAdUnit) {
        SigmobLog.i("video start");
        String splashFilePath = baseAdUnit.getSplashFilePath();
        this.b.a(0, 0);
        this.b.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.xmlywind.sdk.splash.h.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                h.this.a = mediaPlayer.getDuration() / 1000;
                mediaPlayer.setVolume(0.0f, 0.0f);
                mediaPlayer.start();
                BaseBroadcastReceiver.a(h.this.getContext(), h.this.c.getUuid(), IntentActions.ACTION_INTERSTITIAL_SHOW);
                SigmobLog.i("video onPrepared");
            }
        });
        this.b.setVideoPath(splashFilePath);
        return true;
    }

    @Override // com.xmlywind.sdk.splash.e
    public void b() {
        this.b.a();
    }

    @Override // com.xmlywind.sdk.splash.e
    public void c() {
        this.b.b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 8) {
            try {
                if (this.b != null) {
                    SigmobLog.i("video GONE");
                    this.b.c();
                    removeAllViews();
                }
            } catch (Throwable th) {
                SigmobLog.e("set splash ad video content error: " + th.getMessage());
            }
        }
        super.setVisibility(i);
    }
}
