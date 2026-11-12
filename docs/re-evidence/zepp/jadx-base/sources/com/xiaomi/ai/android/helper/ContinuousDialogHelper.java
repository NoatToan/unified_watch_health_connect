package com.xiaomi.ai.android.helper;

import com.huami.passport.Configs;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.d;
import com.xiaomi.ai.android.vad.Vad2;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ContinuousDialogHelper {
    private boolean a;
    private long b;
    private long c;
    private d d;
    private AivsConfig e;
    private String f;
    private Vad2 g;
    private List<Context> h;
    private Settings.AsrConfig i;
    private Settings.TtsConfig j;
    private ContinuousDialogListener k;
    private boolean l;
    private long m;
    private long n;
    private int r;
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

        private String a;

        VadState(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public ContinuousDialogHelper(Engine engine, AivsConfig aivsConfig, ContinuousDialogListener continuousDialogListener) {
        this.d = (d) engine;
        this.e = aivsConfig;
        this.k = continuousDialogListener;
        this.b = a(this.e.getInt(AivsConfig.ContinuousDialog.HEAD_TIMEOUT));
        this.c = a(this.e.getInt(AivsConfig.ContinuousDialog.PAUSE_TIMEOUT));
        this.a = this.e.getBoolean(AivsConfig.ContinuousDialog.ENABLE_TIMEOUT);
        Logger.a("ContinuousDialogHelper", "ContinuousDialogHelper: mMaxHeadLength:" + this.b + ",mMaxPauseLength:" + this.c + ",mEnableTimeout:" + this.a);
    }

    private float a(long j) {
        return (j * 1.0f) / 32000.0f;
    }

    private long a(int i) {
        return i * 32000;
    }

    private void a() {
        if (this.d != null) {
            for (byte[] bArr : this.o) {
                this.d.postData(bArr, 0, bArr.length, false);
                Logger.a("ContinuousDialogHelper", "postCachedData");
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
        Logger.a("ContinuousDialogHelper", "add new buffer: " + i2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.p);
        if (this.p > this.e.getInt(AivsConfig.ContinuousDialog.MAX_CACHE_SIZE)) {
            byte[] bArrPoll = this.o.poll();
            if (bArrPoll != null) {
                this.p -= bArrPoll.length;
            }
            Logger.a("ContinuousDialogHelper", "remove old buffer");
        }
    }

    private void b() {
        Logger.a("ContinuousDialogHelper", Configs.Params.RESET);
        this.m = 0L;
        this.n = 0L;
        this.l = false;
        this.o.clear();
        this.p = 0;
        this.r = 0;
        this.f = null;
        Vad2 vad2 = this.g;
        if (vad2 != null) {
            vad2.release();
            this.g = null;
        }
        Vad2 vad3 = new Vad2(this.e.getInt(AivsConfig.Asr.MIN_VOICE), this.e.getInt(AivsConfig.Asr.MIN_SIL));
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
            Logger.d("ContinuousDialogHelper", "postData:invoke start first");
            return false;
        }
        VadState vadState = this.q;
        VadState vadState2 = VadState.STOP_CAPTURE;
        if (vadState == vadState2) {
            Logger.c("ContinuousDialogHelper", "postData:already stop capture");
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
                    Logger.a("ContinuousDialogHelper", "onStartCapture");
                    this.k.onStartCapture(this.f);
                }
                Logger.a("ContinuousDialogHelper", "onVadStart: at " + a(this.n));
                this.k.onVadStart(this.f);
                d dVar = this.d;
                if (dVar != null) {
                    dVar.postEvent(eventBuildEvent);
                }
                a();
            }
            d dVar2 = this.d;
            if (dVar2 != null) {
                dVar2.postData(bArr, i, i2, false);
            }
            this.m = 0L;
            this.q = VadState.VAD_START;
        } else {
            this.m += j;
            Logger.a("ContinuousDialogHelper", "mSilentLength:" + this.m + "," + a(this.m) + "," + a(this.n));
            if (this.a && this.q == VadState.START_CAPTURE && this.m > this.b) {
                Logger.c("ContinuousDialogHelper", "postData, HEAD_TIMEOUT at " + a(this.n) + ", silent for " + a(this.m) + ", mSegmentCount=" + this.r);
                this.q = vadState2;
                this.k.onStopCapture(this.r, this.f);
            }
            if (this.a && this.q == VadState.VAD_END && this.m > this.c) {
                Logger.c("ContinuousDialogHelper", "postData, PAUSE_TIMEOUT at " + a(this.n) + ", silent for " + a(this.m) + ", mSegmentCount=" + this.r);
                this.q = vadState2;
                this.k.onStopCapture(this.r, this.f);
            }
            if (this.l) {
                Logger.a("ContinuousDialogHelper", "onVadEnd at: " + a(this.n));
                this.k.onVadEnd(this.f);
                this.r = this.r + 1;
                this.q = VadState.VAD_END;
                if (this.d != null) {
                    this.d.postEvent(APIUtils.buildEvent(new SpeechRecognizer.RecognizeStreamFinished(), null, this.f));
                }
                if (this.a && this.r >= this.e.getInt(AivsConfig.ContinuousDialog.MAX_SEGMENT_NUM)) {
                    Logger.a("ContinuousDialogHelper", "onStopCapture at: " + a(this.n) + ", mSegmentCount=" + this.r);
                    this.q = vadState2;
                    this.k.onStopCapture(this.r, this.f);
                }
            }
            a(bArr, i, i2);
        }
        this.l = zIsSpeak;
        return true;
    }

    public boolean start(List<Context> list) {
        Logger.a("ContinuousDialogHelper", "start");
        this.h = list;
        b();
        return true;
    }

    public boolean start(List<Context> list, Settings.AsrConfig asrConfig, Settings.TtsConfig ttsConfig, int i, int i2) {
        Logger.a("ContinuousDialogHelper", "start");
        this.h = list;
        this.b = a(i);
        this.c = a(i2);
        this.i = asrConfig;
        this.j = ttsConfig;
        Logger.a("ContinuousDialogHelper", "start: mMaxHeadLength:" + this.b + ",mMaxPauseLength:" + this.c);
        b();
        return true;
    }

    public void updateContext(List<Context> list) {
        Logger.a("ContinuousDialogHelper", "updateContext");
        this.h = list;
    }
}
