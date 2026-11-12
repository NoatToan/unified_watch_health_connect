package com.xmlywind.sdk.videoAd;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.VideoView;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.utils.m;
import com.xmlywind.sdk.common.utils.r;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes22.dex */
public class BaseVideoView extends VideoView {
    public final MediaMetadataRetriever a;
    private int b;
    private int c;

    public BaseVideoView(Context context) {
        super(context);
        m.a.a(context, "context cannot be null");
        this.a = new MediaMetadataRetriever();
    }

    private void b() {
        try {
            setOnClickListener(null);
            setOnCompletionListener(null);
            setOnErrorListener(null);
            setOnPreparedListener(null);
            Field declaredField = View.class.getDeclaredField("mContext");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.set(this, null);
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }

    public void a() {
        SigmobLog.d("BaseVideoView onDestroy() called");
        suspend();
        stopPlayback();
        r.a(this);
        b();
        super.destroyDrawingCache();
    }

    public void a(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = VideoView.getDefaultSize(0, i);
        int defaultSize2 = VideoView.getDefaultSize(0, i2);
        int i3 = this.c;
        int i4 = this.b;
        if (defaultSize2 > defaultSize) {
            if (i3 <= i4) {
                defaultSize2 = (int) ((i3 / i4) * defaultSize);
            }
        } else if (i3 > i4) {
            defaultSize = (int) ((i4 / i3) * defaultSize2);
        }
        int i5 = this.c;
        if (i5 != this.b) {
            setMeasuredDimension(defaultSize, defaultSize2);
        } else if (i5 == -1) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setVolume(float f) {
        try {
            Field declaredField = Class.forName("android.widget.VideoView").getDeclaredField("mMediaPlayer");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                ((MediaPlayer) declaredField.get(this)).setVolume(f, f);
            }
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
    }
}
