package com.xiaomi.ai.android.helper;

import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.e;
import com.xiaomi.ai.android.vad.Vad2;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.e01;
import defpackage.wpe;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ContinuousDialogHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10920b;
    private long c;
    private e d;
    private e01 e;
    private String f;
    private Vad2 g;
    private List<Context> h;
    private Settings.AsrConfig i;
    private Settings.TtsConfig j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ContinuousDialogListener f10921k;
    private boolean l;
    private long m;
    private long n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10922r;
    private VadState q = VadState.INIT;
    private LinkedList<byte[]> o = new LinkedList<>();
    private int p = 0;

    public interface ContinuousDialogListener {
        void onStartCapture(String str);

        void onStopCapture(int i, String str);

        void onVadEnd(String str);

        void onVadStart(String str);
    }

    public enum VadState {
        INIT("INIT"),
        START_CAPTURE("START_CAPTURE"),
        VAD_START("VAD_START"),
        VAD_END("VAD_END"),
        STOP_CAPTURE("STOP_CAPTURE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10924a;

        VadState(String str) {
            this.f10924a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f10924a;
        }
    }

    public ContinuousDialogHelper(Engine engine, e01 e01Var, ContinuousDialogListener continuousDialogListener) {
        this.d = (e) engine;
        this.e = e01Var;
        this.f10921k = continuousDialogListener;
        this.f10920b = a(this.e.e("continuousdialog.head_timeout"));
        this.c = a(this.e.e("continuousdialog.pause_timeout"));
        this.f10919a = this.e.b("continuousdialog.enable_timeout");
        wpe.b("ContinuousDialogHelper", "ContinuousDialogHelper: mMaxHeadLength:" + this.f10920b + ",mMaxPauseLength:" + this.c + ",mEnableTimeout:" + this.f10919a);
    }

    private float a(long j) {
        return (j * 1.0f) / 32000.0f;
    }

    private void b() {
        wpe.b("ContinuousDialogHelper", "reset");
        this.m = 0L;
        this.n = 0L;
        this.l = false;
        this.o.clear();
        this.p = 0;
        this.f10922r = 0;
        this.f = null;
        Vad2 vad2 = this.g;
        if (vad2 != null) {
            vad2.release();
            this.g = null;
        }
        Vad2 vad3 = new Vad2(this.e.e("asr.minvoice"), this.e.e("asr.minsil"));
        this.g = vad3;
        vad3.init();
        this.q = VadState.START_CAPTURE;
    }

    public void finalize() throws Throwable {
        super.finalize();
        Vad2 vad2 = this.g;
        if (vad2 != null) {
            vad2.release();
            this.g = null;
        }
    }

    public boolean postData(byte[] bArr, int i, int i2) {
        Vad2 vad2 = this.g;
        if (vad2 == null) {
            wpe.e("ContinuousDialogHelper", "postData:invoke start first");
            return false;
        }
        VadState vadState = this.q;
        VadState vadState2 = VadState.STOP_CAPTURE;
        if (vadState == vadState2) {
            wpe.k("ContinuousDialogHelper", "postData:already stop capture");
            return false;
        }
        long j = i2;
        this.n += j;
        boolean zIsSpeak = vad2.isSpeak(bArr, i, i2);
        if (zIsSpeak) {
            if (!this.l) {
                SpeechRecognizer.Recognize recognize = new SpeechRecognizer.Recognize();
                recognize.setTts(this.j);
                recognize.setAsr(this.i);
                Event eventBuildEvent = APIUtils.buildEvent(recognize, this.h);
                this.f = eventBuildEvent.getId();
                if (this.q == VadState.START_CAPTURE) {
                    wpe.b("ContinuousDialogHelper", "onStartCapture");
                    this.f10921k.onStartCapture(this.f);
                }
                wpe.b("ContinuousDialogHelper", "onVadStart: at " + a(this.n));
                this.f10921k.onVadStart(this.f);
                e eVar = this.d;
                if (eVar != null) {
                    eVar.postEvent(eventBuildEvent);
                }
                a();
            }
            e eVar2 = this.d;
            if (eVar2 != null) {
                eVar2.postData(bArr, i, i2, false);
            }
            this.m = 0L;
            this.q = VadState.VAD_START;
        } else {
            this.m += j;
            wpe.b("ContinuousDialogHelper", "mSilentLength:" + this.m + "," + a(this.m) + "," + a(this.n));
            if (this.f10919a && this.q == VadState.START_CAPTURE && this.m > this.f10920b) {
                wpe.k("ContinuousDialogHelper", "postData, HEAD_TIMEOUT at " + a(this.n) + ", silent for " + a(this.m) + ", mSegmentCount=" + this.f10922r);
                this.q = vadState2;
                this.f10921k.onStopCapture(this.f10922r, this.f);
            }
            if (this.f10919a && this.q == VadState.VAD_END && this.m > this.c) {
                wpe.k("ContinuousDialogHelper", "postData, PAUSE_TIMEOUT at " + a(this.n) + ", silent for " + a(this.m) + ", mSegmentCount=" + this.f10922r);
                this.q = vadState2;
                this.f10921k.onStopCapture(this.f10922r, this.f);
            }
            if (this.l) {
                wpe.b("ContinuousDialogHelper", "onVadEnd at: " + a(this.n));
                this.f10921k.onVadEnd(this.f);
                this.f10922r = this.f10922r + 1;
                this.q = VadState.VAD_END;
                if (this.d != null) {
                    this.d.postEvent(APIUtils.buildEvent(new SpeechRecognizer.RecognizeStreamFinished(), null, this.f));
                }
                if (this.f10919a && this.f10922r >= this.e.e("continuousdialog.max_segment_num")) {
                    wpe.b("ContinuousDialogHelper", "onStopCapture at: " + a(this.n) + ", SegmentCount=" + this.f10922r);
                    this.q = vadState2;
                    this.f10921k.onStopCapture(this.f10922r, this.f);
                }
            }
            a(bArr, i, i2);
        }
        this.l = zIsSpeak;
        return true;
    }

    public boolean start(List<Context> list) {
        wpe.b("ContinuousDialogHelper", StatConstants.PARAM_START);
        this.h = list;
        b();
        return true;
    }

    public void updateContext(List<Context> list) {
        wpe.b("ContinuousDialogHelper", "updateContext");
        this.h = list;
    }

    private long a(int i) {
        return i * 32000;
    }

    public boolean start(List<Context> list, Settings.AsrConfig asrConfig, Settings.TtsConfig ttsConfig, int i, int i2) {
        wpe.b("ContinuousDialogHelper", StatConstants.PARAM_START);
        this.h = list;
        this.f10920b = a(i);
        this.c = a(i2);
        this.i = asrConfig;
        this.j = ttsConfig;
        wpe.b("ContinuousDialogHelper", "start: mMaxHeadLength:" + this.f10920b + ",mMaxPauseLength:" + this.c);
        b();
        return true;
    }

    private void a() {
        if (this.d != null) {
            for (byte[] bArr : this.o) {
                this.d.postData(bArr, 0, bArr.length, false);
                wpe.b("ContinuousDialogHelper", "postCachedData");
            }
        }
        this.o.clear();
        this.p = 0;
    }

    private void a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.o.add(bArr2);
        this.p += i2;
        wpe.b("ContinuousDialogHelper", "add new buffer: " + i2 + "/" + this.p);
        if (this.p > this.e.e("continuousdialog.max_cache_size")) {
            byte[] bArrPoll = this.o.poll();
            if (bArrPoll != null) {
                this.p -= bArrPoll.length;
            }
            wpe.b("ContinuousDialogHelper", "remove old buffer");
        }
    }
}
