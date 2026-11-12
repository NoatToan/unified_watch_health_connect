package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.r;
import defpackage.a1a;
import defpackage.bk5;
import defpackage.cw3;
import defpackage.mtf;
import defpackage.okh;
import defpackage.r61;
import defpackage.snp;
import defpackage.td8;
import defpackage.wlq;
import defpackage.zm5;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r61 f8123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8124b;
    public bk5 f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final TreeMap<Long, Long> e = new TreeMap<>();
    public final Handler d = wlq.y(this);
    public final td8 c = new td8();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8126b;

        public a(long j, long j2) {
            this.f8125a = j;
            this.f8126b = j2;
        }
    }

    public interface b {
        void a(long j);

        void b();
    }

    public final class c implements snp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f8127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a1a f8128b = new a1a();
        public final mtf c = new mtf();
        public long d = -9223372036854775807L;

        public c(r61 r61Var) {
            this.f8127a = r.l(r61Var);
        }

        @Override // defpackage.snp
        public void a(okh okhVar, int i, int i2) {
            this.f8127a.d(okhVar, i);
        }

        @Override // defpackage.snp
        public void b(Format format) {
            this.f8127a.b(format);
        }

        @Override // defpackage.snp
        public void e(long j, int i, int i2, int i3, snp.a aVar) {
            this.f8127a.e(j, i, i2, i3, aVar);
            l();
        }

        @Override // defpackage.snp
        public int f(zm5 zm5Var, int i, boolean z, int i2) throws IOException {
            return this.f8127a.c(zm5Var, i, z);
        }

        public final mtf g() {
            this.c.h();
            if (this.f8127a.S(this.f8128b, this.c, 0, false) != -4) {
                return null;
            }
            this.c.u();
            return this.c;
        }

        public boolean h(long j) {
            return d.this.j(j);
        }

        public void i(cw3 cw3Var) {
            long j = this.d;
            if (j == -9223372036854775807L || cw3Var.h > j) {
                this.d = cw3Var.h;
            }
            d.this.m(cw3Var);
        }

        public boolean j(cw3 cw3Var) {
            long j = this.d;
            return d.this.n(j != -9223372036854775807L && j < cw3Var.g);
        }

        public final void k(long j, long j2) {
            d.this.d.sendMessage(d.this.d.obtainMessage(1, new a(j, j2)));
        }

        public final void l() {
            while (this.f8127a.K(false)) {
                mtf mtfVarG = g();
                if (mtfVarG != null) {
                    long j = mtfVarG.e;
                    Metadata metadataA = d.this.c.a(mtfVarG);
                    if (metadataA != null) {
                        EventMessage eventMessage = (EventMessage) metadataA.d(0);
                        if (d.h(eventMessage.f7989a, eventMessage.f7990b)) {
                            m(j, eventMessage);
                        }
                    }
                }
            }
            this.f8127a.s();
        }

        public final void m(long j, EventMessage eventMessage) {
            long jF = d.f(eventMessage);
            if (jF == -9223372036854775807L) {
                return;
            }
            k(j, jF);
        }

        public void n() {
            this.f8127a.T();
        }
    }

    public d(bk5 bk5Var, b bVar, r61 r61Var) {
        this.f = bk5Var;
        this.f8124b = bVar;
        this.f8123a = r61Var;
    }

    public static long f(EventMessage eventMessage) {
        try {
            return wlq.C0(wlq.E(eventMessage.e));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    public final Map.Entry<Long, Long> e(long j) {
        return this.e.ceilingEntry(Long.valueOf(j));
    }

    public final void g(long j, long j2) {
        Long l = this.e.get(Long.valueOf(j2));
        if (l == null) {
            this.e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f8125a, aVar.f8126b);
        return true;
    }

    public final void i() {
        if (this.h) {
            this.i = true;
            this.h = false;
            this.f8124b.b();
        }
    }

    public boolean j(long j) {
        bk5 bk5Var = this.f;
        boolean z = false;
        if (!bk5Var.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Map.Entry<Long, Long> entryE = e(bk5Var.h);
        if (entryE != null && entryE.getValue().longValue() < j) {
            this.g = entryE.getKey().longValue();
            l();
            z = true;
        }
        if (z) {
            i();
        }
        return z;
    }

    public c k() {
        return new c(this.f8123a);
    }

    public final void l() {
        this.f8124b.a(this.g);
    }

    public void m(cw3 cw3Var) {
        this.h = true;
    }

    public boolean n(boolean z) {
        if (!this.f.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        if (!z) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.j = true;
        this.d.removeCallbacksAndMessages(null);
    }

    public final void p() {
        Iterator<Map.Entry<Long, Long>> it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f.h) {
                it.remove();
            }
        }
    }

    public void q(bk5 bk5Var) {
        this.i = false;
        this.g = -9223372036854775807L;
        this.f = bk5Var;
        p();
    }
}
