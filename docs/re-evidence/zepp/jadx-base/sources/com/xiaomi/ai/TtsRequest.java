package com.xiaomi.ai;

/* JADX INFO: loaded from: classes18.dex */
public class TtsRequest {
    public String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f = false;
    public String g;
    public NlpRequest h;
    public String vendorStr;

    public String a() {
        return this.vendorStr;
    }

    public String getTextToSpeak() {
        return this.a;
    }

    public void setExtraNlp(NlpRequest nlpRequest) {
        this.h = nlpRequest;
    }

    public void setTextToSpeak(String str) {
        this.a = str;
    }

    public void setTimeout(int i) {
        this.b = i;
    }

    public void setTtsAsFileUrl(boolean z) {
        this.f = z;
    }

    public void setTtsLang(String str) {
        this.g = str;
    }

    public void setTtsSpeed(int i) {
        this.c = i;
    }

    public void setTtsTone(int i) {
        this.e = i;
    }

    public void setTtsVolume(int i) {
        this.d = i;
    }
}
