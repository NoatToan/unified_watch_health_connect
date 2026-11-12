package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.source.k;
import com.google.common.collect.ImmutableList;
import defpackage.f0l;
import defpackage.fxp;
import defpackage.g83;
import defpackage.mem;
import defpackage.p0l;
import defpackage.r61;
import defpackage.rk1;
import defpackage.wlf;
import defpackage.wlq;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class RtspMediaSource extends com.google.android.exoplayer2.source.a {
    public final m g;
    public final com.google.android.exoplayer2.source.rtsp.a.InterfaceC0196a h;
    public c i;
    public ImmutableList<f0l> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IOException f8212k;

    public static final class Factory implements wlf {
        @Override // defpackage.wlf
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RtspMediaSource a(m mVar) {
            rk1.e(mVar.f7949b);
            return new RtspMediaSource(mVar);
        }
    }

    public static final class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String str) {
            super(str);
        }

        public RtspPlaybackException(Throwable th) {
            super(th);
        }

        public RtspPlaybackException(String str, Throwable th) {
            super(str, th);
        }
    }

    public final class b implements c.f {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.c.f
        public void a(String str, Throwable th) {
            if (th == null) {
                RtspMediaSource.this.f8212k = new RtspPlaybackException(str);
            } else {
                RtspMediaSource.this.f8212k = new RtspPlaybackException(str, (Throwable) wlq.j(th));
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.c.f
        public void b(p0l p0lVar, ImmutableList<f0l> immutableList) {
            RtspMediaSource.this.j = immutableList;
            RtspMediaSource.this.C(new mem(g83.c(p0lVar.a()), !p0lVar.c(), false, p0lVar.c(), null, RtspMediaSource.this.g));
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        rk1.e(this.g.f7949b);
        try {
            c cVar = new c(new b(), "ExoPlayerLib/2.14.0", this.g.f7949b.f7962a);
            this.i = cVar;
            cVar.f0();
        } catch (IOException e) {
            this.f8212k = new RtspPlaybackException("RtspClient not opened.", e);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void D() {
        wlq.o(this.i);
    }

    @Override // com.google.android.exoplayer2.source.k
    public m c() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.source.j d(k.a aVar, r61 r61Var, long j) {
        return new e(r61Var, (List) rk1.e(this.j), (c) rk1.e(this.i), this.h);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void f() throws IOException {
        IOException iOException = this.f8212k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(com.google.android.exoplayer2.source.j jVar) {
        ((e) jVar).O();
    }

    public RtspMediaSource(m mVar) {
        this.g = mVar;
        this.h = new j();
    }
}
