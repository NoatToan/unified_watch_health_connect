package defpackage;

import android.annotation.SuppressLint;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 21)
public class wgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nqq f37950b;
    public cxf c;
    public ByteBuffer e;
    public MediaCodec.BufferInfo f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediaMuxer f37951k;
    public VirtualDisplay o;
    public HandlerThread p;
    public d q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f37952r;
    public long w;
    public long x;
    public MediaFormat g = null;
    public MediaFormat h = null;
    public int i = -1;
    public int j = -1;
    public boolean l = false;
    public AtomicBoolean m = new AtomicBoolean(false);
    public AtomicBoolean n = new AtomicBoolean(false);
    public LinkedList<Integer> s = new LinkedList<>();
    public LinkedList<Integer> t = new LinkedList<>();
    public LinkedList<MediaCodec.BufferInfo> u = new LinkedList<>();
    public LinkedList<MediaCodec.BufferInfo> v = new LinkedList<>();
    public MediaExtractor d = new MediaExtractor();

    public class a extends i72.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37953a = false;

        public a() {
        }

        @Override // u98.a
        public void a(u98 u98Var, Exception exc) {
            this.f37953a = true;
            Message.obtain(wgl.this.q, 2, exc).sendToTarget();
        }

        @Override // i72.b
        public void c(i72 i72Var, int i, MediaCodec.BufferInfo bufferInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("VideoEncoder output buffer available: index=");
            sb.append(i);
            try {
                wgl.this.o(i, bufferInfo);
            } catch (Exception e) {
                Message.obtain(wgl.this.q, 2, e).sendToTarget();
            }
        }

        @Override // i72.b
        public void d(i72 i72Var, MediaFormat mediaFormat) {
            wgl.this.w(mediaFormat);
            wgl.this.C();
        }
    }

    public class b extends i72.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37955a = false;

        public b() {
        }

        @Override // u98.a
        public void a(u98 u98Var, Exception exc) {
            this.f37955a = true;
            Message.obtain(wgl.this.q, 2, exc).sendToTarget();
        }

        @Override // i72.b
        public void c(i72 i72Var, int i, MediaCodec.BufferInfo bufferInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(Thread.currentThread().getId());
            sb.append("] AudioEncoder output buffer available: index=");
            sb.append(i);
            try {
                wgl.this.m(i, bufferInfo);
            } catch (Exception e) {
                Message.obtain(wgl.this.q, 2, e).sendToTarget();
            }
        }

        @Override // i72.b
        public void d(i72 i72Var, MediaFormat mediaFormat) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(Thread.currentThread().getId());
            sb.append("] AudioEncoder returned new format ");
            sb.append(mediaFormat);
            wgl.this.u(mediaFormat);
            wgl.this.C();
        }
    }

    public interface c {
        void a(Throwable th);

        void b(long j);

        void onStart();
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Logger.i(AIApiConstants.ScreenRecorder.NAME, "ScreenRecorder handleMessage code:" + message.what);
            int i = message.what;
            if (i == 0) {
                try {
                    wgl.this.s();
                    if (wgl.this.f37952r != null) {
                        wgl.this.f37952r.onStart();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    message.obj = e;
                }
            } else if (i != 1 && i != 2) {
                return;
            }
            wgl.this.D();
            if (message.arg1 != 1) {
                wgl.this.z();
            }
            if (wgl.this.f37952r != null) {
                wgl.this.f37952r.a((Throwable) message.obj);
            }
            wgl.this.t();
        }
    }

    public wgl(mqq mqqVar, um1 um1Var, VirtualDisplay virtualDisplay, String str, String str2) {
        this.o = virtualDisplay;
        this.f37949a = str;
        this.f37950b = new nqq(mqqVar);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.d.setDataSource(str2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void A(boolean z) {
        this.q.sendMessageAtFrontOfQueue(Message.obtain(this.q, 1, z ? 1 : 0, 0));
    }

    public void B() {
        HandlerThread handlerThread = new HandlerThread(AIApiConstants.ScreenRecorder.NAME);
        this.p = handlerThread;
        handlerThread.start();
        d dVar = new d(this.p.getLooper());
        this.q = dVar;
        dVar.sendEmptyMessage(0);
    }

    public final void C() {
        if (this.l || this.g == null) {
            return;
        }
        if (this.h != null) {
            Logger.i(AIApiConstants.ScreenRecorder.NAME, "videoFormat" + this.g.toString());
            Logger.i(AIApiConstants.ScreenRecorder.NAME, "audioFormat" + this.h.toString());
        }
        this.i = this.f37951k.addTrack(this.g);
        MediaFormat mediaFormat = this.h;
        this.j = mediaFormat == null ? -1 : this.f37951k.addTrack(mediaFormat);
        this.f37951k.start();
        this.e = ByteBuffer.allocate(EventRecurrence.TH);
        this.f = new MediaCodec.BufferInfo();
        this.l = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Started media muxer, videoTrack=");
        sb.append(this.i);
        sb.append(",audioTrack=");
        sb.append(this.j);
        if (this.s.isEmpty() && this.t.isEmpty()) {
            return;
        }
        while (true) {
            MediaCodec.BufferInfo bufferInfoPoll = this.v.poll();
            if (bufferInfoPoll == null) {
                return;
            } else {
                o(this.s.poll().intValue(), bufferInfoPoll);
            }
        }
    }

    public final void D() {
        this.n.set(false);
        this.u.clear();
        this.t.clear();
        this.v.clear();
        this.s.clear();
        try {
            nqq nqqVar = this.f37950b;
            if (nqqVar != null) {
                nqqVar.k();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void E(int i, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        c cVar;
        if ((bufferInfo.flags & 2) != 0) {
            bufferInfo.size = 0;
        }
        boolean z = (bufferInfo.flags & 4) != 0;
        if (bufferInfo.size != 0 || z) {
            if (bufferInfo.presentationTimeUs != 0) {
                if (i == this.i) {
                    x(bufferInfo);
                } else if (i == this.j) {
                    v(bufferInfo);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(Thread.currentThread().getId());
            sb.append("] Got buffer, track=");
            sb.append(i);
            sb.append(", info: size=");
            sb.append(bufferInfo.size);
            sb.append(", presentationTimeUs=");
            sb.append(bufferInfo.presentationTimeUs);
            if (!z && (cVar = this.f37952r) != null) {
                cVar.b(bufferInfo.presentationTimeUs);
            }
        } else {
            byteBuffer = null;
        }
        if (byteBuffer != null) {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f37951k.writeSampleData(i, byteBuffer, bufferInfo);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Sent ");
            sb2.append(bufferInfo.size);
            sb2.append(" bytes to MediaMuxer on track ");
            sb2.append(i);
        }
    }

    public void finalize() throws Throwable {
        if (this.o != null) {
            t();
        }
    }

    public String l() {
        return this.f37949a;
    }

    public final void m(int i, MediaCodec.BufferInfo bufferInfo) {
        if (this.n.get()) {
            if (!this.l || this.j == -1) {
                this.t.add(Integer.valueOf(i));
                this.u.add(bufferInfo);
                return;
            }
            E(this.j, bufferInfo, this.c.a(i));
            this.c.d(i);
            if ((bufferInfo.flags & 4) != 0) {
                this.j = -1;
                A(true);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    public final void n(long j) {
        if (this.j == -1) {
            return;
        }
        int sampleData = this.d.readSampleData(this.e, 0);
        Logger.d(AIApiConstants.ScreenRecorder.NAME, "new muxAudio chunkSize = " + sampleData);
        if (sampleData > 0) {
            MediaCodec.BufferInfo bufferInfo = this.f;
            bufferInfo.presentationTimeUs = j;
            bufferInfo.flags = this.d.getSampleFlags();
            MediaCodec.BufferInfo bufferInfo2 = this.f;
            bufferInfo2.size = sampleData;
            E(this.j, bufferInfo2, this.e);
            this.d.advance();
        }
    }

    public final void o(int i, MediaCodec.BufferInfo bufferInfo) {
        if (this.n.get()) {
            if (!this.l || this.i == -1) {
                this.s.add(Integer.valueOf(i));
                this.v.add(bufferInfo);
                return;
            }
            ByteBuffer byteBufferE = this.f37950b.e(i);
            long j = bufferInfo.presentationTimeUs;
            E(this.i, bufferInfo, byteBufferE);
            this.f37950b.i(i);
            n(j);
            if ((bufferInfo.flags & 4) != 0) {
                this.i = -1;
                this.j = -1;
                A(true);
            }
        }
    }

    public final void p() throws IOException {
    }

    public final void q() throws IOException {
        this.f37950b.j(new a());
        this.f37950b.g();
    }

    public final void r() {
        this.m.set(true);
        if (this.n.get()) {
            A(false);
        } else {
            t();
        }
    }

    public final void s() {
        if (this.n.get() || this.m.get()) {
            throw new IllegalStateException();
        }
        if (this.o == null) {
            throw new IllegalStateException("maybe release");
        }
        this.n.set(true);
        try {
            this.f37951k = new MediaMuxer(this.f37949a, 0);
            q();
            p();
            this.o.setSurface(this.f37950b.l());
            StringBuilder sb = new StringBuilder();
            sb.append("set surface to display: ");
            sb.append(this.o.getDisplay());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void t() {
        VirtualDisplay virtualDisplay = this.o;
        if (virtualDisplay != null) {
            virtualDisplay.setSurface(null);
            this.o = null;
        }
        this.h = null;
        this.g = null;
        this.j = -1;
        this.i = -1;
        this.l = false;
        HandlerThread handlerThread = this.p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.p = null;
        }
        nqq nqqVar = this.f37950b;
        if (nqqVar != null) {
            nqqVar.h();
            this.f37950b = null;
        }
        MediaMuxer mediaMuxer = this.f37951k;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                this.f37951k.release();
            } catch (Exception unused) {
            }
            this.f37951k = null;
        }
        MediaExtractor mediaExtractor = this.d;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
        this.q = null;
    }

    public final void u(MediaFormat mediaFormat) {
        if (this.j >= 0 || this.l) {
            throw new IllegalStateException("output format already changed!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Audio output format changed.\n New format: ");
        sb.append(mediaFormat.toString());
        this.h = mediaFormat;
    }

    public final void v(MediaCodec.BufferInfo bufferInfo) {
        long j = this.x;
        if (j != 0) {
            bufferInfo.presentationTimeUs -= j;
        } else {
            this.x = bufferInfo.presentationTimeUs;
            bufferInfo.presentationTimeUs = 0L;
        }
    }

    public final void w(MediaFormat mediaFormat) {
        if (this.i >= 0 || this.l) {
            throw new IllegalStateException("output format already changed!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Video output format changed.\n New format: ");
        sb.append(mediaFormat.toString());
        this.g = mediaFormat;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("audio track count = ");
        sb2.append(this.d.getTrackCount());
        if (this.d.getTrackCount() > 0) {
            String string = this.d.getTrackFormat(0).getString("mime");
            Objects.requireNonNull(string);
            if (string.startsWith("audio/")) {
                this.d.selectTrack(0);
                this.h = this.d.getTrackFormat(0);
            }
        }
    }

    public final void x(MediaCodec.BufferInfo bufferInfo) {
        long j = this.w;
        if (j != 0) {
            bufferInfo.presentationTimeUs -= j;
        } else {
            this.w = bufferInfo.presentationTimeUs;
            bufferInfo.presentationTimeUs = 0L;
        }
    }

    public void y(c cVar) {
        this.f37952r = cVar;
    }

    public final void z() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        bufferInfo.set(0, 0, 0L, 4);
        int i = this.i;
        if (i != -1) {
            E(i, bufferInfo, byteBufferAllocate);
        }
        int i2 = this.j;
        if (i2 != -1) {
            E(i2, bufferInfo, byteBufferAllocate);
        }
        this.i = -1;
        this.j = -1;
    }
}
