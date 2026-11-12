package com.huawei.hms.mlsdk.asr.energy.vo;

/* JADX INFO: loaded from: classes34.dex */
public class VoiceDetectParams {
    private int artiSpeechThd;
    private int beta;
    private int blockVadEnable;
    private int chopNumThd;
    private int currAveAmpThd;
    private int currFrmAlpha;
    private int smoothAmpThd;
    private int smoothFrmAlpha;
    private int smoothUpdateThd;
    private int voiceVarianceThres;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14340a = 300;

        public final VoiceDetectParams a() {
            return new VoiceDetectParams(0, 300, 200, 300, 22937, 9830, 12, this.f14340a, 8, 0);
        }

        public final b b() {
            this.f14340a = 13500;
            return this;
        }
    }

    public int getArtiSpeechThd() {
        return this.artiSpeechThd;
    }

    public int getBeta() {
        return this.beta;
    }

    public int getBlockVadEnable() {
        return this.blockVadEnable;
    }

    public int getChopNumThd() {
        return this.chopNumThd;
    }

    public int getCurrAveAmpThd() {
        return this.currAveAmpThd;
    }

    public int getCurrFrmAlpha() {
        return this.currFrmAlpha;
    }

    public int getSmoothAmpThd() {
        return this.smoothAmpThd;
    }

    public int getSmoothFrmAlpha() {
        return this.smoothFrmAlpha;
    }

    public int getSmoothUpdateThd() {
        return this.smoothUpdateThd;
    }

    public int getVoiceVarianceThres() {
        return this.voiceVarianceThres;
    }

    private VoiceDetectParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.voiceVarianceThres = i;
        this.currAveAmpThd = i2;
        this.smoothAmpThd = i3;
        this.smoothUpdateThd = i4;
        this.smoothFrmAlpha = i5;
        this.currFrmAlpha = i6;
        this.beta = i7;
        this.artiSpeechThd = i8;
        this.chopNumThd = i9;
        this.blockVadEnable = i10;
    }
}
