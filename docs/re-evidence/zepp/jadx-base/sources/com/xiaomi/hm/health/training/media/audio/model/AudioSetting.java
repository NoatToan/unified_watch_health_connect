package com.xiaomi.hm.health.training.media.audio.model;

/* JADX INFO: loaded from: classes21.dex */
public class AudioSetting {
    private boolean a = false;
    private int b = 3;
    private float c = 1.0f;
    private float d = 1.0f;

    public float getLeftVolume() {
        return this.c;
    }

    public float getRightVolume() {
        return this.d;
    }

    public int getStreamType() {
        return this.b;
    }

    public boolean isLooping() {
        return this.a;
    }

    public void setLeftVolume(float f) {
        this.c = f;
    }

    public void setLooping(boolean z) {
        this.a = z;
    }

    public void setRightVolume(float f) {
        this.d = f;
    }

    public void setStreamType(int i) {
        this.b = i;
    }
}
