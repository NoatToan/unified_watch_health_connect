package defpackage;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes4.dex */
public interface rkk {
    @SuppressLint({"WrongConstant"})
    static int g(int i) {
        return i & 24;
    }

    @SuppressLint({"WrongConstant"})
    static int k(int i, int i2, int i3) {
        return i | i2 | i3;
    }

    @SuppressLint({"WrongConstant"})
    static int p(int i) {
        return i & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int s(int i) {
        return i & 32;
    }

    static int t(int i) {
        return k(i, 0, 0);
    }

    int a(Format format) throws ExoPlaybackException;

    int e();

    String getName();

    int x() throws ExoPlaybackException;
}
