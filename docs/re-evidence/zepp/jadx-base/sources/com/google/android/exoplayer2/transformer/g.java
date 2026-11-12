package com.google.android.exoplayer2.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class g {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public g(boolean removeAudio, boolean removeVideo, boolean flattenForSlowMotion, String outputMimeType) {
        this.a = removeAudio;
        this.b = removeVideo;
        this.c = flattenForSlowMotion;
        this.d = outputMimeType;
    }
}
