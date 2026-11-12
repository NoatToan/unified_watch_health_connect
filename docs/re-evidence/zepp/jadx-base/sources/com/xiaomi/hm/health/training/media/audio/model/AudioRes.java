package com.xiaomi.hm.health.training.media.audio.model;

import android.net.Uri;

/* JADX INFO: loaded from: classes21.dex */
public class AudioRes {
    private Uri a;
    private int b;
    private AudioSetting c;

    public AudioRes(Uri uri) {
        this.b = -1;
        this.a = uri;
        this.c = new AudioSetting();
    }

    public int getAudioRawId() {
        return this.b;
    }

    public AudioSetting getAudioSetting() {
        return this.c;
    }

    public Uri getAudioUri() {
        return this.a;
    }

    public void setAudioRawId(int i) {
        this.b = i;
    }

    public void setAudioSetting(AudioSetting audioSetting) {
        this.c = audioSetting;
    }

    public void setAudioUri(Uri uri) {
        this.a = uri;
    }

    public AudioRes(int i) {
        this.b = -1;
        this.b = i;
        this.c = new AudioSetting();
    }

    public AudioRes(Uri uri, AudioSetting audioSetting) {
        this.b = -1;
        this.a = uri;
        this.c = audioSetting;
    }
}
