package com.huawei.hms.mlsdk.asr.engine;

import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.hms.mlsdk.asr.energy.NativeVadDetector;
import com.huawei.hms.mlsdk.asr.energy.vo.DetectResult;
import com.huawei.hms.mlsdk.asr.energy.vo.SampleBuffer;
import com.huawei.hms.mlsdk.asr.energy.vo.VoiceDetectParams;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.hms.mlsdk.asr.o.d;
import com.huawei.hms.mlsdk.asr.o.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AsrEngine f14381a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f14383c;
    private NativeVadDetector h;
    private C0157c i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f14382b = new ArrayList();
    private int d = 1;
    private boolean e = false;
    private Long f = null;
    private Long g = null;

    /* JADX INFO: loaded from: classes34.dex */
    public interface a {
        void a();

        void a(long j);

        void a(AsrError asrError);

        void a(b bVar);

        void b();

        void c();

        void d();
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f14384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f14385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f14386c;

        public final double b() {
            return this.f14385b;
        }

        public final boolean c() {
            return this.f14384a;
        }

        public final void a(boolean z) {
            this.f14384a = z;
        }

        public final void a(double d) {
            this.f14385b = d;
        }

        public final byte[] a() {
            byte[] bArr = this.f14386c;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }

        public final void a(byte[] bArr) {
            this.f14386c = (byte[]) bArr.clone();
        }
    }

    public c(AsrEngine asrEngine) {
        this.f14383c = null;
        this.f14381a = asrEngine;
        asrEngine.getEngineConfig().setVadDetectDuration(AsrConstants.bufferSize / 64);
        this.f14383c = new j(asrEngine.getEngineConfig().getVadDetectDuration() * 64);
        VoiceDetectParams voiceDetectParamsA = new VoiceDetectParams.b().b().a();
        NativeVadDetector nativeVadDetector = new NativeVadDetector();
        this.h = nativeVadDetector;
        nativeVadDetector.init(voiceDetectParamsA);
        this.i = new C0157c(asrEngine.getEngineConfig().getVadEndMuteDuration());
    }

    public final void a(a aVar) {
        this.f14382b.add(aVar);
    }

    public final void b(byte[] bArr) throws d {
        this.f14383c.a(bArr);
        byte[] bArrB = this.f14383c.b();
        if (bArrB == null || bArrB.length == 0) {
            return;
        }
        try {
            b bVarA = a(bArrB);
            Iterator it = this.f14382b.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(bVarA);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (!bVarA.c() && !this.e) {
                this.e = true;
                this.g = Long.valueOf(jElapsedRealtime);
                SmartLogger.i("AsrVadDetector", "start send to cloud, energy===>" + bVarA.b());
                Iterator it2 = this.f14382b.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).a(this.g.longValue());
                }
                return;
            }
            this.i.a(bVarA.f14385b);
            if (this.f14381a.hasResult()) {
                this.i.a();
                if (this.i.b()) {
                    Iterator it3 = this.f14382b.iterator();
                    while (it3.hasNext()) {
                        ((a) it3.next()).b();
                    }
                    return;
                } else {
                    if (jElapsedRealtime - this.g.longValue() > this.f14381a.getEngineConfig().getMaxAudioDuration()) {
                        Iterator it4 = this.f14382b.iterator();
                        while (it4.hasNext()) {
                            ((a) it4.next()).d();
                        }
                        return;
                    }
                    return;
                }
            }
            if (this.f == null) {
                this.f = this.f14381a.getRecordStartTime();
            }
            if (this.f == null) {
                this.f = Long.valueOf(jElapsedRealtime);
            }
            long jLongValue = jElapsedRealtime - this.f.longValue();
            int vadStartMuteDuration = this.f14381a.getEngineConfig().getVadStartMuteDuration();
            int i = this.d;
            if (jLongValue >= vadStartMuteDuration * i) {
                if (i != this.f14381a.getEngineConfig().getVadStartMuteDetectTimes()) {
                    SmartLogger.i("AsrProcessor", "onNoSound duration===>" + jLongValue);
                    Iterator it5 = this.f14382b.iterator();
                    while (it5.hasNext()) {
                        ((a) it5.next()).a();
                    }
                } else {
                    SmartLogger.i("AsrProcessor", "onNoSoundTimesExceed duration===>" + jLongValue);
                    Iterator it6 = this.f14382b.iterator();
                    while (it6.hasNext()) {
                        ((a) it6.next()).c();
                    }
                }
                this.d++;
            }
        } catch (RuntimeException e) {
            SmartLogger.e("AsrVadDetector", "RuntimeException e = " + e.getMessage());
            Bundle bundle = new Bundle();
            bundle.putInt("subErrorCode", 1002);
            Iterator it7 = this.f14382b.iterator();
            while (it7.hasNext()) {
                ((a) it7.next()).a(new AsrError(40, "Service unavailable", bundle));
            }
        }
    }

    private b a(byte[] bArr) throws d {
        DetectResult detectResultDetect = this.h.detect(new SampleBuffer.b().a(bArr).a(bArr.length).a());
        if (detectResultDetect == null) {
            detectResultDetect = new DetectResult(1, 0.0f);
        }
        b bVar = new b();
        bVar.a(bArr);
        bVar.a(detectResultDetect.getEnergy());
        bVar.a(detectResultDetect.getVoiceType() == 1);
        return bVar;
    }

    public final void a() {
        synchronized (this) {
            j jVar = this.f14383c;
            if (jVar != null) {
                jVar.a();
            }
            NativeVadDetector nativeVadDetector = this.h;
            if (nativeVadDetector != null) {
                nativeVadDetector.release();
                this.h = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.mlsdk.asr.engine.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes34.dex */
    static final class C0157c {
        private static final double f = Math.log10(1000.0d) * 10.0d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f14387a = -1.0d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private double f14388b = -1.0d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f14389c = -1;
        private long d;
        private ArrayList e;

        public C0157c(long j) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            this.d = j;
            Double dValueOf = Double.valueOf(40.0d);
            arrayList.add(new Double[]{Double.valueOf(0.0d), dValueOf, Double.valueOf(0.15d)});
            ArrayList arrayList2 = this.e;
            Double dValueOf2 = Double.valueOf(60.0d);
            arrayList2.add(new Double[]{dValueOf, dValueOf2, Double.valueOf(0.1d)});
            ArrayList arrayList3 = this.e;
            Double dValueOf3 = Double.valueOf(70.0d);
            arrayList3.add(new Double[]{dValueOf2, dValueOf3, Double.valueOf(0.075d)});
            this.e.add(new Double[]{dValueOf3, Double.valueOf(Double.MAX_VALUE), Double.valueOf(0.05d)});
        }

        public final void a(double d) {
            double dLog10 = Double.compare(d, 0.0d) > 0 ? Math.log10(d) * 10.0d : 0.0d;
            if (Double.compare(dLog10, f) <= 0) {
                return;
            }
            if (Double.compare(this.f14387a, 0.0d) <= 0) {
                SmartLogger.i("AsrVadDetector", String.format(Locale.ENGLISH, "first energy = %.2f", Double.valueOf(dLog10)));
                this.f14387a = dLog10;
                return;
            }
            if (Double.compare(this.f14388b, 0.0d) <= 0) {
                this.f14389c = -1L;
                if (Double.compare(this.f14387a, dLog10) > 0) {
                    this.f14387a = dLog10;
                    return;
                }
                return;
            }
            double dAbs = Math.abs(dLog10 - this.f14388b) / this.f14388b;
            for (Double[] dArr : this.e) {
                if (Double.compare(this.f14388b, dArr[0].doubleValue()) > 0 && Double.compare(this.f14388b, dArr[1].doubleValue()) <= 0) {
                    if (Double.compare(dAbs, dArr[2].doubleValue()) <= 0) {
                        if (this.f14389c > 0) {
                            break;
                        }
                        this.f14389c = SystemClock.elapsedRealtime();
                        break;
                    }
                    this.f14389c = -1L;
                    break;
                }
            }
            SmartLogger.i("AsrVadDetector", String.format(Locale.ENGLISH, "lowerEnergy = %.2f, energy = %.2f, diff = %.2f", Double.valueOf(this.f14388b), Double.valueOf(dLog10), Double.valueOf(dAbs)));
        }

        public final boolean b() {
            if (this.f14389c <= 0) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f14389c;
            SmartLogger.i("AsrVadDetector", String.format(Locale.ENGLISH, "duration = %d, timingDuration = %d, lowerEnergy = %.2f", Long.valueOf(jElapsedRealtime), Long.valueOf(this.d), Double.valueOf(this.f14388b)));
            return jElapsedRealtime >= this.d;
        }

        public final void a() {
            if (Double.compare(this.f14388b, 0.0d) > 0) {
                return;
            }
            double d = this.f14387a;
            this.f14388b = d;
            SmartLogger.i("AsrVadDetector", String.format(Locale.ENGLISH, "stop calc lower energy, lowerEnergy = %.2f", Double.valueOf(d)));
        }
    }
}
