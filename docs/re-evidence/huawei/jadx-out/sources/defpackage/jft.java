package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.auxiliary.FrameControlCallBack;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class jft extends TrackRecorder implements FrameControlCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38556c;
    private e d;
    private long e;
    private AtomicBoolean h;
    private int j;

    public jft(MediaProjection mediaProjection, String str) {
        super(mediaProjection, str);
        this.h = new AtomicBoolean(false);
        this.d = new e();
        this.f38556c = false;
        this.e = 0L;
        this.f38554a = 0;
        this.j = -1;
        this.f38555b = 0;
    }

    public jft(MediaProjection mediaProjection, Uri uri) {
        super(mediaProjection, uri);
        this.h = new AtomicBoolean(false);
        this.d = new e();
        this.f38556c = false;
        this.e = 0L;
        this.f38554a = 0;
        this.j = -1;
        this.f38555b = 0;
    }

    public jft c(boolean z) {
        this.f38556c = z;
        return this;
    }

    public jft b(long j) {
        this.e = j;
        return this;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder
    public void startEncode() {
        while (!this.h.get()) {
            encodeCurrentFrame(this);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.auxiliary.FrameControlCallBack
    public boolean isSaveCurrentFrame(long j) {
        int i = this.j + 1;
        this.j = i;
        if (i == 0) {
            this.f38555b = 0;
            return true;
        }
        int i2 = this.f38554a;
        if (i2 == 0) {
            this.f38555b++;
            return true;
        }
        if (i % i2 == 0) {
            return false;
        }
        this.f38555b++;
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.auxiliary.FrameControlCallBack
    public long getFrameTimeStamp() {
        return (((long) this.f38555b) * 1000000) / 60;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder
    public void prepareEncoder() {
        try {
            this.f38554a = this.d.b();
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(MimeTypes.VIDEO_H264, this.mWidth, this.mHeight);
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", 24000000);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 60);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 0);
            this.mEncoder = MediaCodec.createEncoderByType(MimeTypes.VIDEO_H264);
            this.mEncoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mVirtualSurface = this.mEncoder.createInputSurface();
            this.mEncoder.start();
        } catch (IOException unused) {
            this.mErrorManager.b("media codec create error");
            LogUtil.e("Track_CommonVideoRecorder", "media codec cannot be created");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder
    public void stopEncode() {
        this.h.set(true);
    }

    class e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int b() {
            if (!jft.this.f38556c || jft.this.e <= C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
                return 0;
            }
            return (int) (jft.this.e / (jft.this.e - C.DEFAULT_SEEK_FORWARD_INCREMENT_MS));
        }
    }
}
