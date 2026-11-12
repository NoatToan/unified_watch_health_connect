package com.huawei.haf.mediaprocess;

import android.media.MediaExtractor;
import android.media.MediaMuxer;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class AudioProcessThread extends Thread implements VideoProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoProcessException f5985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaExtractor f5986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthVideoProcessor.MediaSource f5987c;
    private int d;
    private MediaMuxer e;
    private VideoProgress g;
    private CountDownLatch j;

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        try {
            try {
                a();
            } finally {
                this.f5986b.release();
            }
        } catch (IOException | InterruptedException | TimeoutException e) {
            this.f5985a = new VideoProcessException(e);
        }
    }

    private void a() throws InterruptedException, TimeoutException, IOException {
        this.f5987c.c(this.f5986b);
        if (VideoUtil.b(this.f5986b, true) >= 0) {
            if (!this.j.await(3L, TimeUnit.SECONDS)) {
                throw new TimeoutException("wait muxerStartLatch timeout!");
            }
            AudioUtil.c(this.f5986b, this.e, this.d, this);
        }
        VideoProgress videoProgress = this.g;
        if (videoProgress != null) {
            videoProgress.b(1.0f);
        }
        LogUtil.b("AudioProcessThread", "Audio Process Done!");
    }

    @Override // com.huawei.haf.mediaprocess.VideoProgressListener
    public void onProgress(float f) {
        VideoProgress videoProgress = this.g;
        if (videoProgress != null) {
            videoProgress.b(f);
        }
    }
}
