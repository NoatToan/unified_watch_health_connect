package com.liulishuo.engzo.lingorecorder.utils;

/* JADX INFO: loaded from: classes18.dex */
public class RecorderProperty {
    private int a;
    private int b;
    private int c;

    public RecorderProperty() {
        setSampleRate(16000);
        setChannels(1);
        setBitsPerSample(16);
    }

    public int getBitsPerSample() {
        return this.c;
    }

    public int getChannels() {
        return this.b;
    }

    public int getSampleRate() {
        return this.a;
    }

    public RecorderProperty setBitsPerSample(int i) {
        this.c = i;
        return this;
    }

    public RecorderProperty setChannels(int i) {
        this.b = i;
        return this;
    }

    public RecorderProperty setSampleRate(int i) {
        this.a = i;
        return this;
    }
}
