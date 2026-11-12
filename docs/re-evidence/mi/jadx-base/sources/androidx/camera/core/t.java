package androidx.camera.core;

import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.t;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.lhe;
import defpackage.li3;
import defpackage.n6d;
import defpackage.w0p;
import defpackage.zpe;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class t extends s {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final d J = new d();
    public static final int[] K = {8, 6, 5, 4};
    public volatile int A;
    public volatile boolean B;
    public int C;
    public int D;
    public int E;
    public DeferrableSurface F;
    public final AtomicBoolean G;
    public e H;
    public Throwable I;
    public final Object l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public HandlerThread o;
    public Handler p;
    public HandlerThread q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f1819r;
    public MediaCodec s;
    public MediaCodec t;
    public lhe<Void> u;
    public SessionConfig.b v;

    @GuardedBy("mMuxerLock")
    public int w;

    @GuardedBy("mMuxerLock")
    public int x;
    public Surface y;
    public volatile AudioRecord z;

    public class a implements SessionConfig.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Size f1821b;

        public a(String str, Size size) {
            this.f1820a = str;
            this.f1821b = size;
        }

        @Override // androidx.camera.core.impl.SessionConfig.c
        @RequiresPermission("android.permission.RECORD_AUDIO")
        public void a(SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
            if (t.this.p(this.f1820a)) {
                t.this.X(this.f1820a, this.f1821b);
                t.this.t();
            }
        }
    }

    @RequiresApi(23)
    public static class b {
        public static int a(MediaCodec.CodecException codecException) {
            return codecException.getErrorCode();
        }
    }

    public static final class c implements androidx.camera.core.impl.r.a<t, androidx.camera.core.impl.s, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.camera.core.impl.m f1822a;

        public c() {
            this(androidx.camera.core.impl.m.O());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static c c(Config config) {
            return new c(androidx.camera.core.impl.m.P(config));
        }

        @Override // defpackage.zj8
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public androidx.camera.core.impl.l a() {
            return this.f1822a;
        }

        @Override // androidx.camera.core.impl.r.a
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public androidx.camera.core.impl.s b() {
            return new androidx.camera.core.impl.s(androidx.camera.core.impl.n.M(this.f1822a));
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c e(int i) {
            a().z(androidx.camera.core.impl.s.D, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c f(int i) {
            a().z(androidx.camera.core.impl.s.F, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c g(int i) {
            a().z(androidx.camera.core.impl.s.G, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c h(int i) {
            a().z(androidx.camera.core.impl.s.E, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c i(int i) {
            a().z(androidx.camera.core.impl.s.B, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c j(int i) {
            a().z(androidx.camera.core.impl.s.C, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c k(Size size) {
            a().z(androidx.camera.core.impl.k.q, size);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c l(int i) {
            a().z(androidx.camera.core.impl.r.w, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c m(int i) {
            a().z(androidx.camera.core.impl.k.l, Integer.valueOf(i));
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c n(Class<t> cls) {
            a().z(w0p.c, cls);
            if (a().d(w0p.f37423b, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c o(String str) {
            a().z(w0p.f37423b, str);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public c p(int i) {
            a().z(androidx.camera.core.impl.s.A, Integer.valueOf(i));
            return this;
        }

        public c(androidx.camera.core.impl.m mVar) {
            this.f1822a = mVar;
            Class cls = (Class) mVar.d(w0p.c, null);
            if (cls == null || cls.equals(t.class)) {
                n(t.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Size f1823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final androidx.camera.core.impl.s f1824b;

        static {
            Size size = new Size(1920, Constants.FHD_WIDTH);
            f1823a = size;
            f1824b = new c().p(30).i(NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY).j(1).e(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_BIT_RATE).h(8000).f(1).g(1024).k(size).l(3).m(1).b();
        }

        public androidx.camera.core.impl.s a() {
            return f1824b;
        }
    }

    public enum e {
        VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED,
        VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED,
        VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE,
        VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED
    }

    public static MediaFormat P(androidx.camera.core.impl.s sVar, Size size) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", sVar.O());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", sVar.Q());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", sVar.P());
        return mediaFormatCreateVideoFormat;
    }

    public static /* synthetic */ void R(boolean z, MediaCodec mediaCodec) {
        if (!z || mediaCodec == null) {
            return;
        }
        mediaCodec.release();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void A() {
        S();
        lhe<Void> lheVar = this.u;
        if (lheVar != null) {
            lheVar.addListener(new Runnable() { // from class: fqq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18096a.Q();
                }
            }, li3.d());
        } else {
            Q();
        }
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void D() {
        S();
    }

    @Override // androidx.camera.core.s
    @RequiresPermission("android.permission.RECORD_AUDIO")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size E(Size size) {
        if (this.y != null) {
            this.s.stop();
            this.s.release();
            this.t.stop();
            this.t.release();
            U(false);
        }
        try {
            this.s = MediaCodec.createEncoderByType("video/avc");
            this.t = MediaCodec.createEncoderByType(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE);
            X(f(), size);
            r();
            return size;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e2.getCause());
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public final AudioRecord N(androidx.camera.core.impl.s sVar) {
        int i = this.C == 1 ? 16 : 12;
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(this.D, i, 2);
            if (minBufferSize <= 0) {
                minBufferSize = sVar.M();
            }
            int i2 = minBufferSize;
            AudioRecord audioRecord = new AudioRecord(5, this.D, i, 2, i2 * 2);
            if (audioRecord.getState() != 1) {
                return null;
            }
            this.A = i2;
            zpe.e("VideoCapture", "source: 5 audioSampleRate: " + this.D + " channelConfig: " + i + " audioFormat: 2 bufferSize: " + i2);
            return audioRecord;
        } catch (Exception e2) {
            zpe.d("VideoCapture", "Exception, keep trying.", e2);
            return null;
        }
    }

    public final MediaFormat O() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE, this.D, this.C);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.E);
        return mediaFormatCreateAudioFormat;
    }

    public final void T() {
        this.q.quitSafely();
        MediaCodec mediaCodec = this.t;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.t = null;
        }
        if (this.z != null) {
            this.z.release();
            this.z = null;
        }
    }

    public final void U(final boolean z) {
        DeferrableSurface deferrableSurface = this.F;
        if (deferrableSurface == null) {
            return;
        }
        final MediaCodec mediaCodec = this.s;
        deferrableSurface.c();
        this.F.i().addListener(new Runnable() { // from class: gqq
            @Override // java.lang.Runnable
            public final void run() {
                t.R(z, mediaCodec);
            }
        }, li3.d());
        if (z) {
            this.s = null;
        }
        this.y = null;
        this.F = null;
    }

    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void Q() {
        this.o.quitSafely();
        T();
        if (this.y != null) {
            U(true);
        }
    }

    public final void W(Size size, String str) {
        try {
            for (int i : K) {
                if (CamcorderProfile.hasProfile(Integer.parseInt(str), i)) {
                    CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(str), i);
                    if (size.getWidth() == camcorderProfile.videoFrameWidth && size.getHeight() == camcorderProfile.videoFrameHeight) {
                        this.C = camcorderProfile.audioChannels;
                        this.D = camcorderProfile.audioSampleRate;
                        this.E = camcorderProfile.audioBitRate;
                        return;
                    }
                }
            }
        } catch (NumberFormatException unused) {
            zpe.e("VideoCapture", "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings.");
        }
        androidx.camera.core.impl.s sVar = (androidx.camera.core.impl.s) g();
        this.C = sVar.L();
        this.D = sVar.N();
        this.E = sVar.K();
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public void X(String str, Size size) {
        androidx.camera.core.impl.s sVar = (androidx.camera.core.impl.s) g();
        this.s.reset();
        this.H = e.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        try {
            this.s.configure(P(sVar, size), (Surface) null, (MediaCrypto) null, 1);
            if (this.y != null) {
                U(false);
            }
            final Surface surfaceCreateInputSurface = this.s.createInputSurface();
            this.y = surfaceCreateInputSurface;
            this.v = SessionConfig.b.o(sVar);
            DeferrableSurface deferrableSurface = this.F;
            if (deferrableSurface != null) {
                deferrableSurface.c();
            }
            n6d n6dVar = new n6d(this.y, size, i());
            this.F = n6dVar;
            lhe<Void> lheVarI = n6dVar.i();
            Objects.requireNonNull(surfaceCreateInputSurface);
            lheVarI.addListener(new Runnable() { // from class: hqq
                @Override // java.lang.Runnable
                public final void run() {
                    surfaceCreateInputSurface.release();
                }
            }, li3.d());
            this.v.h(this.F);
            this.v.f(new a(str, size));
            I(this.v.m());
            this.G.set(true);
            W(size, str);
            this.t.reset();
            this.t.configure(O(), (Surface) null, (MediaCrypto) null, 1);
            if (this.z != null) {
                this.z.release();
            }
            this.z = N(sVar);
            if (this.z == null) {
                zpe.c("VideoCapture", "AudioRecord object cannot initialized correctly!");
                this.G.set(false);
            }
            synchronized (this.l) {
                this.w = -1;
                this.x = -1;
            }
            this.B = false;
        } catch (MediaCodec.CodecException e2) {
            int iA = b.a(e2);
            String diagnosticInfo = e2.getDiagnosticInfo();
            if (iA == 1100) {
                zpe.e("VideoCapture", "CodecException: code: " + iA + " diagnostic: " + diagnosticInfo);
                this.H = e.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE;
            } else if (iA == 1101) {
                zpe.e("VideoCapture", "CodecException: code: " + iA + " diagnostic: " + diagnosticInfo);
                this.H = e.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED;
            }
            this.I = e2;
        } catch (IllegalArgumentException e3) {
            e = e3;
            this.H = e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.I = e;
        } catch (IllegalStateException e4) {
            e = e4;
            this.H = e.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.I = e;
        }
    }

    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void S() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            li3.d().execute(new Runnable() { // from class: eqq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16974a.S();
                }
            });
            return;
        }
        zpe.e("VideoCapture", "stopRecording");
        this.v.n();
        this.v.h(this.F);
        I(this.v.m());
        v();
        if (this.B) {
            if (this.G.get()) {
                this.n.set(true);
            } else {
                this.m.set(true);
            }
        }
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r<?> h(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config configA = useCaseConfigFactory.a(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE, 1);
        if (z) {
            configA = Config.G(configA, J.a());
        }
        if (configA == null) {
            return null;
        }
        return n(configA).b();
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.r.a<?, ?, ?> n(Config config) {
        return c.c(config);
    }

    @Override // androidx.camera.core.s
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void x() {
        this.o = new HandlerThread("CameraX-video encoding thread");
        this.q = new HandlerThread("CameraX-audio encoding thread");
        this.o.start();
        this.p = new Handler(this.o.getLooper());
        this.q.start();
        this.f1819r = new Handler(this.q.getLooper());
    }
}
