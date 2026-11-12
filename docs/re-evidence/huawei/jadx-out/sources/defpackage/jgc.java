package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.projection.MediaProjection;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.glec.RecorderEglRender;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class jgc extends TrackRecorder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Surface f38568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38570c;
    private b d;
    private RecorderEglRender e;

    public jgc(MediaProjection mediaProjection, String str, long j) {
        super(mediaProjection, str);
        this.d = new b();
        this.e = null;
        this.f38570c = true;
        this.f38569b = j;
    }

    public jgc(MediaProjection mediaProjection, Uri uri, long j) {
        super(mediaProjection, uri);
        this.d = new b();
        this.e = null;
        this.f38570c = true;
        this.f38569b = j;
    }

    public jgc b(boolean z) {
        this.f38570c = z;
        return this;
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder
    public void startEncode() {
        RecorderEglRender recorderEglRender = this.e;
        if (recorderEglRender != null) {
            try {
                recorderEglRender.e();
            } catch (jgm unused) {
                this.mErrorManager.b("EGL runtime error");
                LogUtil.e("Track_SpecialVideoRecorder", "egl render error");
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder
    public void prepareEncoder() {
        try {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(MimeTypes.VIDEO_H264, this.mWidth, this.mHeight);
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", 24000000);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 60);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
            this.mEncoder = MediaCodec.createEncoderByType(MimeTypes.VIDEO_H264);
            this.mEncoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f38568a = this.mEncoder.createInputSurface();
            RecorderEglRender recorderEglRender = new RecorderEglRender(this.mWidth, this.mHeight, 60, this.f38568a, this.d.b());
            this.e = recorderEglRender;
            recorderEglRender.c(new RecorderEglRender.OnFrameCallBack() { // from class: jgc.4
                @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.glec.RecorderEglRender.OnFrameCallBack
                public void onUpdate() {
                    jgc.this.encodeCurrentFrame();
                }
            });
            this.mVirtualSurface = this.e.c();
            this.mEncoder.start();
        } catch (IOException unused) {
            this.mErrorManager.b("media codec create error");
            LogUtil.e("Track_SpecialVideoRecorder", "media codec cannot be created");
        } catch (IllegalArgumentException e) {
            e = e;
            this.mErrorManager.b("configure_create_error");
            int i = this.mWidth;
            int i2 = this.mHeight;
            LogUtil.e("Track_SpecialVideoRecorder", "prepareEncoder:  mWidth =", Integer.valueOf(i), " mHeight = ", Integer.valueOf(i2), LogAnonymous.b(e));
            e();
        } catch (IllegalStateException e2) {
            e = e2;
            this.mErrorManager.b("configure_create_error");
            int i3 = this.mWidth;
            int i4 = this.mHeight;
            LogUtil.e("Track_SpecialVideoRecorder", "prepareEncoder:  mWidth =", Integer.valueOf(i3), " mHeight = ", Integer.valueOf(i4), LogAnonymous.b(e));
            e();
        } catch (jgm unused2) {
            this.mErrorManager.b("EGL create error");
            LogUtil.e("Track_SpecialVideoRecorder", "prepareEncoder:egl render cannot be created mWidth =", Integer.valueOf(this.mWidth), " mHeight = ", Integer.valueOf(this.mHeight));
        }
    }

    private void e() {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        StringBuilder sb = new StringBuilder();
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                b(sb, mediaCodecInfo);
            }
        }
        LogUtil.e("Track_SpecialVideoRecorder", "getSupportTypes: ", sb.toString());
    }

    private void b(StringBuilder sb, MediaCodecInfo mediaCodecInfo) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (TextUtils.equals(MimeTypes.VIDEO_H264, str)) {
                sb.append(" -media Name : ");
                sb.append(mediaCodecInfo.getName());
                sb.append(" type ");
                sb.append(str);
                sb.append(" ");
                for (int i : mediaCodecInfo.getCapabilitiesForType(MimeTypes.VIDEO_H264).colorFormats) {
                    sb.append("colorFormat : ");
                    sb.append(i);
                    sb.append(System.lineSeparator());
                    sb.append(" |");
                }
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.trackanimation.recorder.TrackRecorder
    public void stopEncode() {
        RecorderEglRender recorderEglRender = this.e;
        if (recorderEglRender != null) {
            recorderEglRender.a();
        }
    }

    class b {
        private b() {
        }

        public long b() {
            if (!jgc.this.f38570c || jgc.this.f38569b < C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
                return 17L;
            }
            return (jgc.this.f38569b / 900) + 1;
        }
    }
}
