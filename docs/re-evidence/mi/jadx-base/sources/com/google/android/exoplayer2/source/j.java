package com.google.android.exoplayer2.source;

import defpackage.brl;
import defpackage.k9l;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface j extends s {

    public interface a extends s.a<j> {
        void o(j jVar);
    }

    long b(long j, brl brlVar);

    @Override // com.google.android.exoplayer2.source.s
    boolean c(long j);

    @Override // com.google.android.exoplayer2.source.s
    long e();

    @Override // com.google.android.exoplayer2.source.s
    void f(long j);

    @Override // com.google.android.exoplayer2.source.s
    long g();

    @Override // com.google.android.exoplayer2.source.s
    boolean h();

    long i(long j);

    long j();

    TrackGroupArray n();

    long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j);

    void r(a aVar, long j);

    void t() throws IOException;

    void u(long j, boolean z);
}
