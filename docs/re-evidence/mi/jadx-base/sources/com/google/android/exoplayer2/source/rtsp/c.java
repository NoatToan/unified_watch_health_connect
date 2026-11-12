package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import defpackage.c0l;
import defpackage.f0l;
import defpackage.g83;
import defpackage.ijf;
import defpackage.l0l;
import defpackage.m0l;
import defpackage.n0l;
import defpackage.o0l;
import defpackage.p0l;
import defpackage.q0l;
import defpackage.qlo;
import defpackage.qyl;
import defpackage.rk1;
import defpackage.ryl;
import defpackage.wlq;
import defpackage.zzk;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f8217b;
    public final String c;
    public final d f;
    public com.google.android.exoplayer2.source.rtsp.f h;
    public e i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f8218k;
    public boolean l;
    public final ArrayDeque<com.google.android.exoplayer2.source.rtsp.e.c> d = new ArrayDeque<>();
    public final SparseArray<n0l> e = new SparseArray<>();
    public final SparseArray<com.google.android.exoplayer2.source.rtsp.a> g = new SparseArray<>();
    public long m = -9223372036854775807L;

    public final class b implements Runnable, Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f8219a = wlq.x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8220b;
        public boolean c;

        public b(long j) {
            this.f8220b = j;
        }

        public void a() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.f8219a.postDelayed(this, this.f8220b);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.c = false;
            this.f8219a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f.c(c.this.f8217b, c.this.j);
            this.f8219a.postDelayed(this, this.f8220b);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.c$c, reason: collision with other inner class name */
    public final class C0197c implements com.google.android.exoplayer2.source.rtsp.f.c {
        public C0197c() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.f.c
        public void b(List<String> list) {
            o0l o0lVarG = g.g(list);
            int i = Integer.parseInt((String) rk1.e(o0lVarG.f28620b.b("CSeq")));
            n0l n0lVar = (n0l) c.this.e.get(i);
            if (n0lVar == null) {
                return;
            }
            c.this.e.remove(i);
            int i2 = n0lVar.f27411b;
            int i3 = o0lVarG.f28619a;
            if (i3 != 200) {
                String strK = g.k(i2);
                int i4 = o0lVarG.f28619a;
                StringBuilder sb = new StringBuilder(String.valueOf(strK).length() + 12);
                sb.append(strK);
                sb.append(" ");
                sb.append(i4);
                e(new RtspMediaSource.RtspPlaybackException(sb.toString()));
                return;
            }
            try {
                switch (i2) {
                    case 1:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                        m(o0lVarG);
                        return;
                    case 2:
                        f(new c0l(i3, ryl.b(o0lVarG.c)));
                        return;
                    case 3:
                        g(o0lVarG);
                        return;
                    case 4:
                        h(new l0l(i3, g.f(o0lVarG.f28620b.b("Public"))));
                        return;
                    case 5:
                        i(o0lVarG);
                        return;
                    case 6:
                        String strB = o0lVarG.f28620b.b("Range");
                        p0l p0lVarD = strB == null ? p0l.c : p0l.d(strB);
                        String strB2 = o0lVarG.f28620b.b("RTP-Info");
                        j(new m0l(o0lVarG.f28619a, p0lVarD, strB2 == null ? ImmutableList.of() : q0l.a(strB2)));
                        return;
                    case 10:
                        String strB3 = o0lVarG.f28620b.b("Session");
                        String strB4 = o0lVarG.f28620b.b("Transport");
                        if (strB3 == null || strB4 == null) {
                            throw new ParserException();
                        }
                        k(new h(o0lVarG.f28619a, g.h(strB3), strB4));
                        return;
                    case 12:
                        l(o0lVarG);
                        return;
                    default:
                        throw new IllegalStateException();
                }
            } catch (ParserException e) {
                e(new RtspMediaSource.RtspPlaybackException(e));
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.f.c
        public void c(byte[] bArr, int i) {
            com.google.android.exoplayer2.source.rtsp.a aVar = (com.google.android.exoplayer2.source.rtsp.a) c.this.g.get(i);
            if (aVar != null) {
                aVar.write(bArr);
            }
        }

        public final void e(Throwable th) {
            RtspMediaSource.RtspPlaybackException rtspPlaybackException = th instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th : new RtspMediaSource.RtspPlaybackException(th);
            if (c.this.l) {
                ((e) rk1.e(c.this.i)).e(rtspPlaybackException);
            } else {
                c.this.f8216a.a(qlo.e(th.getMessage()), th);
            }
        }

        public void f(c0l c0lVar) {
            String str = c0lVar.f4803b.f31977a.get("range");
            try {
                c.this.f8216a.b(str != null ? p0l.d(str) : p0l.c, c.Q(c0lVar.f4803b, c.this.f8217b));
                c.this.l = true;
            } catch (ParserException e) {
                c.this.f8216a.a("SDP format error.", e);
            }
        }

        public void g(o0l o0lVar) {
        }

        public void h(l0l l0lVar) {
            if (c.this.f8218k != null) {
                return;
            }
            if (c.b0(l0lVar.f24485b)) {
                c.this.f.b(c.this.f8217b, c.this.j);
            } else {
                c.this.f8216a.a("DESCRIBE not supported.", null);
            }
        }

        public void i(o0l o0lVar) {
            if (c.this.m != -9223372036854775807L) {
                c cVar = c.this;
                cVar.g0(g83.d(cVar.m));
            }
        }

        public void j(m0l m0lVar) {
            if (c.this.f8218k == null) {
                c cVar = c.this;
                cVar.f8218k = cVar.new b(30000L);
                c.this.f8218k.a();
            }
            ((e) rk1.e(c.this.i)).c(g83.c(m0lVar.f25627b.f29874a), m0lVar.c);
            c.this.m = -9223372036854775807L;
        }

        public void k(h hVar) {
            c.this.j = hVar.f8250b.f8247a;
            c.this.R();
        }

        public void l(o0l o0lVar) {
        }

        public void m(o0l o0lVar) {
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8222a;

        public d() {
        }

        public final n0l a(int i, String str, Map<String, String> map, Uri uri) {
            com.google.android.exoplayer2.source.rtsp.d.b bVar = new com.google.android.exoplayer2.source.rtsp.d.b();
            int i2 = this.f8222a;
            this.f8222a = i2 + 1;
            bVar.b("CSeq", String.valueOf(i2));
            if (c.this.c != null) {
                bVar.b("User-Agent", c.this.c);
            }
            if (str != null) {
                bVar.b("Session", str);
            }
            bVar.d(map);
            return new n0l(uri, i, bVar.e(), "");
        }

        public void b(Uri uri, String str) {
            f(a(2, str, ImmutableMap.of(), uri));
        }

        public void c(Uri uri, String str) {
            f(a(4, str, ImmutableMap.of(), uri));
        }

        public void d(Uri uri, String str) {
            f(a(5, str, ImmutableMap.of(), uri));
        }

        public void e(Uri uri, long j, String str) {
            f(a(6, str, ImmutableMap.of("Range", p0l.b(j)), uri));
        }

        public final void f(n0l n0lVar) {
            int i = Integer.parseInt((String) rk1.e(n0lVar.c.b("CSeq")));
            rk1.g(c.this.e.get(i) == null);
            c.this.e.append(i, n0lVar);
            c.this.h.l(g.j(n0lVar));
        }

        public void g(Uri uri, String str, String str2) {
            f(a(10, str2, ImmutableMap.of("Transport", str), uri));
        }

        public void h(Uri uri, String str) {
            f(a(12, str, ImmutableMap.of(), uri));
        }
    }

    public interface e {
        void b();

        void c(long j, ImmutableList<q0l> immutableList);

        void e(RtspMediaSource.RtspPlaybackException rtspPlaybackException);
    }

    public interface f {
        void a(String str, Throwable th);

        void b(p0l p0lVar, ImmutableList<f0l> immutableList);
    }

    public c(f fVar, String str, Uri uri) {
        this.f8216a = fVar;
        this.f8217b = g.i(uri);
        this.c = str;
        this.f = new d();
        this.h = new com.google.android.exoplayer2.source.rtsp.f(new C0197c());
    }

    public static ImmutableList<f0l> Q(qyl qylVar, Uri uri) {
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i = 0; i < qylVar.f31978b.size(); i++) {
            ijf ijfVar = qylVar.f31978b.get(i);
            if (zzk.b(ijfVar)) {
                aVar.a(new f0l(ijfVar, uri));
            }
        }
        return aVar.k();
    }

    public static boolean b0(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    public final void R() {
        com.google.android.exoplayer2.source.rtsp.e.c cVarPollFirst = this.d.pollFirst();
        if (cVarPollFirst == null) {
            ((e) rk1.e(this.i)).b();
        } else {
            this.f.g(cVarPollFirst.c(), cVarPollFirst.d(), this.j);
        }
    }

    public final Socket S() throws IOException {
        rk1.a(this.f8217b.getHost() != null);
        return SocketFactory.getDefault().createSocket((String) rk1.e(this.f8217b.getHost()), this.f8217b.getPort() > 0 ? this.f8217b.getPort() : 554);
    }

    public void T(com.google.android.exoplayer2.source.rtsp.a aVar) {
        this.g.put(aVar.c(), aVar);
    }

    public void U() {
        try {
            close();
            com.google.android.exoplayer2.source.rtsp.f fVar = new com.google.android.exoplayer2.source.rtsp.f(new C0197c());
            this.h = fVar;
            fVar.d(S());
            this.j = null;
        } catch (IOException e2) {
            ((e) rk1.e(this.i)).e(new RtspMediaSource.RtspPlaybackException(e2));
        }
    }

    public void Z(long j) {
        this.f.d(this.f8217b, (String) rk1.e(this.j));
        this.m = j;
    }

    public void c0(e eVar) {
        this.i = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b bVar = this.f8218k;
        if (bVar != null) {
            bVar.close();
            this.f8218k = null;
            this.f.h(this.f8217b, (String) rk1.e(this.j));
        }
        this.h.close();
    }

    public void d0(List<com.google.android.exoplayer2.source.rtsp.e.c> list) {
        this.d.addAll(list);
        R();
    }

    public void f0() throws IOException {
        try {
            this.h.d(S());
            this.f.c(this.f8217b, this.j);
        } catch (IOException e2) {
            wlq.o(this.h);
            throw e2;
        }
    }

    public void g0(long j) {
        this.f.e(this.f8217b, j, (String) rk1.e(this.j));
    }
}
