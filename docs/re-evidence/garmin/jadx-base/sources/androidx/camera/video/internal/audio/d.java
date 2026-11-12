package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k0.h;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public class d implements AudioStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioRecord f5955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1.a f5956b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b.C0078b f5962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f5963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f5965k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5957c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5958d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<Boolean> f5959e = new AtomicReference<>(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5966l = false;

    public class a extends AudioManager.AudioRecordingCallback {
        public a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
                d dVar = d.this;
                if (clientAudioSessionId == dVar.f5955a.getAudioSessionId()) {
                    dVar.d(d1.a.b(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    public d(c1.a aVar, Context context) throws AudioStream.AudioStreamException {
        int iD = aVar.d();
        int iE = aVar.e();
        int iA = aVar.a();
        if (iD > 0 && iE > 0) {
            if (AudioRecord.getMinBufferSize(iD, iE == 1 ? 16 : 12, iA) > 0) {
                try {
                    new AudioFormat.Builder().setSampleRate(iD).setChannelMask(iE == 1 ? 16 : 12).setEncoding(iA).build();
                    this.f5956b = aVar;
                    this.f5961g = aVar.c();
                    int minBufferSize = AudioRecord.getMinBufferSize(aVar.d(), aVar.e() == 1 ? 16 : 12, aVar.a());
                    k7.h.f(minBufferSize > 0, null);
                    int i14 = minBufferSize * 2;
                    this.f5960f = i14;
                    AudioRecord audioRecordC = c(i14, aVar, context);
                    this.f5955a = audioRecordC;
                    if (audioRecordC.getState() == 1) {
                        return;
                    }
                    audioRecordC.release();
                    throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(aVar.d()), Integer.valueOf(aVar.e()), Integer.valueOf(aVar.a())));
    }

    public static AudioRecord c(int i14, c1.a aVar, Context context) {
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(aVar.d()).setChannelMask(aVar.e() == 1 ? 16 : 12).setEncoding(aVar.a()).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            d1.b.a(builder, context);
        }
        builder.setAudioSource(aVar.b());
        builder.setAudioFormat(audioFormatBuild);
        builder.setBufferSizeInBytes(i14);
        try {
            return builder.build();
        } catch (UnsupportedOperationException e4) {
            l2.t(e4);
            return null;
        }
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void a(b.C0078b c0078b, h hVar) {
        k7.h.f(!this.f5958d.get(), "AudioStream can not be started when setCallback.");
        b();
        this.f5962h = c0078b;
        this.f5963i = hVar;
        if (Build.VERSION.SDK_INT >= 29) {
            a aVar = this.f5965k;
            if (aVar != null) {
                d1.a.d(this.f5955a, aVar);
            }
            if (this.f5965k == null) {
                this.f5965k = new a();
            }
            d1.a.c(this.f5955a, hVar, this.f5965k);
        }
    }

    public final void b() {
        k7.h.f(!this.f5957c.get(), "AudioStream has been released.");
    }

    public final void d(boolean z14) {
        h hVar = this.f5963i;
        b.C0078b c0078b = this.f5962h;
        if (hVar == null || c0078b == null || Objects.equals(this.f5959e.getAndSet(Boolean.valueOf(z14)), Boolean.valueOf(z14))) {
            return;
        }
        hVar.execute(new a0.a(c0078b, z14, 2));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    @Override // androidx.camera.video.internal.audio.AudioStream
    public final e read(ByteBuffer byteBuffer) {
        b();
        k7.h.f(this.f5958d.get(), "AudioStream has not been started.");
        int i14 = this.f5955a.read(byteBuffer, this.f5960f);
        long jNanoTime = 0;
        if (i14 > 0) {
            byteBuffer.limit(i14);
            if (this.f5966l) {
                jNanoTime = -1;
            } else {
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                if (this.f5955a.getTimestamp(audioTimestamp, 0) == 0) {
                    int iD = this.f5956b.d();
                    long j8 = this.f5964j;
                    k7.h.b(((long) iD) > 0, "sampleRate must be greater than 0.");
                    k7.h.b(j8 >= 0, "framePosition must be no less than 0.");
                    long jA = audioTimestamp.nanoTime + c1.c.a(iD, j8 - audioTimestamp.framePosition);
                    jNanoTime = jA >= 0 ? jA : 0L;
                    if (Math.abs(jNanoTime - System.nanoTime()) > 500000000) {
                        this.f5966l = true;
                        jNanoTime = -1;
                    }
                } else {
                    jNanoTime = -1;
                }
            }
            if (jNanoTime == -1) {
                jNanoTime = System.nanoTime();
            }
            this.f5964j = c1.c.b(this.f5961g, i14) + this.f5964j;
        }
        return new e(i14, jNanoTime);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        a aVar;
        if (this.f5957c.getAndSet(true)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (aVar = this.f5965k) != null) {
            d1.a.d(this.f5955a, aVar);
        }
        this.f5955a.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() throws AudioStream.AudioStreamException {
        b();
        AtomicBoolean atomicBoolean = this.f5958d;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        if (e1.a.f61851a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
            AudioRecord audioRecord = this.f5955a;
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
            }
        }
        this.f5955a.startRecording();
        boolean z14 = false;
        if (this.f5955a.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.f5955a.getRecordingState());
        }
        this.f5964j = 0L;
        this.f5966l = false;
        this.f5959e.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationA = d1.a.a(this.f5955a);
            z14 = audioRecordingConfigurationA != null && d1.a.b(audioRecordingConfigurationA);
        }
        d(z14);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"MissingPermission"})
    public final void stop() {
        b();
        if (this.f5958d.getAndSet(false)) {
            this.f5955a.stop();
            if (this.f5955a.getRecordingState() != 1) {
                this.f5955a.getRecordingState();
            }
            if (e1.a.f61851a.b(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                this.f5955a.release();
                this.f5955a = c(this.f5960f, this.f5956b, null);
            }
        }
    }
}
