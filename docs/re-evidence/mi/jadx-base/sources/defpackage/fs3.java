package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fs3 implements too {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f18142a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<woo> f18143b;
    public final PriorityQueue<b> c;
    public b d;
    public long e;
    public long f;

    public static final class b extends voo implements Comparable<b> {
        public long j;

        public b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (n() != bVar.n()) {
                return n() ? 1 : -1;
            }
            long j = this.e - bVar.e;
            if (j == 0) {
                j = this.j - bVar.j;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class c extends woo {
        public ieh.a<c> f;

        public c(ieh.a<c> aVar) {
            this.f = aVar;
        }

        @Override // defpackage.ieh
        public final void r() {
            this.f.a(this);
        }
    }

    public fs3() {
        for (int i = 0; i < 10; i++) {
            this.f18142a.add(new b());
        }
        this.f18143b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f18143b.add(new c(new ieh.a() { // from class: es3
                @Override // ieh.a
                public final void a(ieh iehVar) {
                    this.f17011a.n((fs3.c) iehVar);
                }
            }));
        }
        this.c = new PriorityQueue<>();
    }

    @Override // defpackage.too
    public void b(long j) {
        this.e = j;
    }

    public abstract soo e();

    public abstract void f(voo vooVar);

    @Override // defpackage.rs5
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            m((b) wlq.j(this.c.poll()));
        }
        b bVar = this.d;
        if (bVar != null) {
            m(bVar);
            this.d = null;
        }
    }

    @Override // defpackage.rs5
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public voo a() throws SubtitleDecoderException {
        rk1.g(this.d == null);
        if (this.f18142a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f18142a.pollFirst();
        this.d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // defpackage.rs5
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public woo c() throws SubtitleDecoderException {
        if (this.f18143b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b) wlq.j(this.c.peek())).e <= this.e) {
            b bVar = (b) wlq.j(this.c.poll());
            if (bVar.n()) {
                woo wooVar = (woo) wlq.j(this.f18143b.pollFirst());
                wooVar.e(4);
                m(bVar);
                return wooVar;
            }
            f(bVar);
            if (k()) {
                soo sooVarE = e();
                woo wooVar2 = (woo) wlq.j(this.f18143b.pollFirst());
                wooVar2.s(bVar.e, sooVarE, Long.MAX_VALUE);
                m(bVar);
                return wooVar2;
            }
            m(bVar);
        }
        return null;
    }

    public final woo i() {
        return this.f18143b.pollFirst();
    }

    public final long j() {
        return this.e;
    }

    public abstract boolean k();

    @Override // defpackage.rs5
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void d(voo vooVar) throws SubtitleDecoderException {
        rk1.a(vooVar == this.d);
        b bVar = (b) vooVar;
        if (bVar.m()) {
            m(bVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            bVar.j = j;
            this.c.add(bVar);
        }
        this.d = null;
    }

    public final void m(b bVar) {
        bVar.h();
        this.f18142a.add(bVar);
    }

    public void n(woo wooVar) {
        wooVar.h();
        this.f18143b.add(wooVar);
    }

    @Override // defpackage.rs5
    public void release() {
    }
}
