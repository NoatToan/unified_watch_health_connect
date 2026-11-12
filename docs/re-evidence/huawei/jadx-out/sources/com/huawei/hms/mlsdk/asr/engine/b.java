package com.huawei.hms.mlsdk.asr.engine;

import android.media.AudioRecord;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.extractor.AacUtil;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReentrantLock f14377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Condition f14378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f14379c;
    private byte[] d;
    private final AtomicBoolean e;
    private final AtomicBoolean f;
    private final AtomicBoolean g;
    private AudioRecord h;
    private Thread i;

    /* JADX INFO: loaded from: classes34.dex */
    final class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar;
            while (b.this.e.get()) {
                b.this.f14377a.lock();
                try {
                    try {
                        if (b.this.h != null) {
                            int i = b.this.h.read(b.this.d, 0, b.this.d.length);
                            SmartLogger.d("AsrRecorder", "audioRecord read buffer");
                            if (i != -3 && i != -1 && i != -2) {
                                if (!b.this.f.get()) {
                                    try {
                                        try {
                                            b.this.g.set(true);
                                            SmartLogger.d("AsrRecorder", "InnerRecordRunnable waiting");
                                            b.this.f14378b.await();
                                            SmartLogger.d("AsrRecorder", "InnerRecordRunnable awake");
                                            bVar = b.this;
                                        } catch (InterruptedException e) {
                                            SmartLogger.e("AsrRecorder", "await failed" + e.getMessage());
                                            bVar = b.this;
                                        }
                                        bVar.g.set(false);
                                    } catch (Throwable th) {
                                        b.this.g.set(false);
                                        throw th;
                                    }
                                }
                                Iterator it = b.this.f14379c.iterator();
                                while (it.hasNext()) {
                                    ((InterfaceC0156b) it.next()).a(b.this.d);
                                }
                            }
                        } else {
                            SmartLogger.e("AsrRecorder", "AudioRecord is null.");
                        }
                    } catch (Exception e2) {
                        SmartLogger.e("AsrRecorder", "InnerRecordRunnable Exception: " + e2.getMessage());
                    }
                    b.this.f14377a.unlock();
                } catch (Throwable th2) {
                    b.this.f14377a.unlock();
                    throw th2;
                }
            }
            SmartLogger.i("AsrRecorder", "InnerRecordRunnable is over");
        }

        /* synthetic */ a(b bVar, int i) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.mlsdk.asr.engine.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes34.dex */
    public interface InterfaceC0156b {
        void a(long j);

        void a(AsrError asrError);

        void a(byte[] bArr);
    }

    public b() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f14377a = reentrantLock;
        this.f14378b = reentrantLock.newCondition();
        this.f14379c = new ArrayList();
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        b();
    }

    private void b() {
        this.f14377a.lock();
        try {
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 16, 2);
                AsrConstants.bufferSize = minBufferSize;
                this.d = new byte[minBufferSize];
                AudioRecord audioRecord = new AudioRecord(1, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 16, 2, minBufferSize);
                this.h = audioRecord;
                if (audioRecord.getState() == 1) {
                    this.h.startRecording();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("subErrorCode", 1001);
                Iterator it = this.f14379c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0156b) it.next()).a(new AsrError(40, "Failed to init audio recorder", bundle));
                }
            } catch (Exception e) {
                SmartLogger.e("AsrRecorder", "initAudioRecorder Exception: " + e.getMessage());
            }
        } finally {
            this.f14377a.unlock();
        }
    }

    public final void a(InterfaceC0156b interfaceC0156b) {
        this.f14379c.add(interfaceC0156b);
    }

    public final void c() {
        if (this.i == null) {
            this.f14377a.lock();
            try {
                this.f.set(true);
                if (this.g.get()) {
                    this.f14377a.lock();
                    try {
                        this.f14378b.signal();
                        this.f14377a.unlock();
                    } catch (Throwable th) {
                        this.f14377a.unlock();
                        throw th;
                    }
                }
                this.f14377a.unlock();
                this.e.set(true);
                Thread thread = new Thread(new a(this, 0), "InnerRecordRunnable");
                this.i = thread;
                thread.start();
            } catch (Throwable th2) {
                this.f14377a.unlock();
                throw th2;
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f14379c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0156b) it.next()).a(jElapsedRealtime);
        }
    }

    public final void a() {
        this.e.set(false);
        this.f14377a.lock();
        try {
            this.f.set(false);
            if (this.g.get()) {
                this.f14377a.lock();
                try {
                    this.f14378b.signal();
                    this.f14377a.unlock();
                } catch (Throwable th) {
                    this.f14377a.unlock();
                    throw th;
                }
            }
            this.f14377a.unlock();
            this.f14377a.lock();
            try {
                this.f14378b.signal();
                this.f14377a.unlock();
                try {
                    AudioRecord audioRecord = this.h;
                    if (audioRecord != null) {
                        audioRecord.stop();
                    }
                    AudioRecord audioRecord2 = this.h;
                    if (audioRecord2 != null) {
                        audioRecord2.release();
                    }
                    this.h = null;
                } catch (IllegalStateException e) {
                    SmartLogger.e("AsrRecorder", "IllegalStateException:" + e.getMessage());
                }
            } catch (Throwable th2) {
                this.f14377a.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f14377a.unlock();
            throw th3;
        }
    }
}
