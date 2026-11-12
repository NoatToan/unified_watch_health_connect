package com.google.android.exoplayer2;

import defpackage.k9l;
import defpackage.rkk;
import defpackage.skk;
import defpackage.vif;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface s extends r.b {

    public interface a {
        void a();

        void b(long j);
    }

    boolean b();

    void disable();

    int e();

    boolean f();

    rkk getCapabilities();

    String getName();

    int getState();

    k9l getStream();

    void i(Format[] formatArr, k9l k9lVar, long j, long j2) throws ExoPlaybackException;

    boolean isReady();

    boolean j();

    void l(long j, long j2) throws ExoPlaybackException;

    long m();

    void n(long j) throws ExoPlaybackException;

    vif o();

    void q();

    void r(skk skkVar, Format[] formatArr, k9l k9lVar, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException;

    void reset();

    void setIndex(int i);

    void start() throws ExoPlaybackException;

    void stop();

    void u() throws IOException;

    default void w(float f, float f2) throws ExoPlaybackException {
    }
}
