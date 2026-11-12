package defpackage;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import defpackage.ieh;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rcm<I extends DecoderInputBuffer, O extends ieh, E extends DecoderException> implements rs5<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f32414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32415b = new Object();
    public final ArrayDeque<I> c = new ArrayDeque<>();
    public final ArrayDeque<O> d = new ArrayDeque<>();
    public final I[] e;
    public final O[] f;
    public int g;
    public int h;
    public I i;
    public E j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32416k;
    public boolean l;
    public int m;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            rcm.this.t();
        }
    }

    public rcm(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            ((I[]) this.e)[i] = g();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            ((O[]) this.f)[i2] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f32414a = aVar;
        aVar.start();
    }

    public final boolean f() {
        return !this.c.isEmpty() && this.h > 0;
    }

    @Override // defpackage.rs5
    public final void flush() {
        synchronized (this.f32415b) {
            try {
                this.f32416k = true;
                this.m = 0;
                I i = this.i;
                if (i != null) {
                    q(i);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    q(this.c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    this.d.removeFirst().r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract I g();

    public abstract O h();

    public abstract E i(Throwable th);

    public abstract E j(I i, O o, boolean z);

    public final boolean k() throws InterruptedException {
        E e;
        synchronized (this.f32415b) {
            while (!this.l && !f()) {
                try {
                    this.f32415b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            I iRemoveFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o = oArr[i];
            boolean z = this.f32416k;
            this.f32416k = false;
            if (iRemoveFirst.n()) {
                o.e(4);
            } else {
                if (iRemoveFirst.m()) {
                    o.e(Integer.MIN_VALUE);
                }
                try {
                    e = (E) j(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = (E) i(e2);
                } catch (RuntimeException e3) {
                    e = (E) i(e3);
                }
                if (e != null) {
                    synchronized (this.f32415b) {
                        this.j = e;
                    }
                    return false;
                }
            }
            synchronized (this.f32415b) {
                try {
                    if (this.f32416k) {
                        o.r();
                    } else if (o.m()) {
                        this.m++;
                        o.r();
                    } else {
                        o.c = this.m;
                        this.m = 0;
                        this.d.addLast(o);
                    }
                    q(iRemoveFirst);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // defpackage.rs5
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I a() throws DecoderException {
        I i;
        synchronized (this.f32415b) {
            o();
            rk1.g(this.i == null);
            int i2 = this.g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.e;
                int i3 = i2 - 1;
                this.g = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    @Override // defpackage.rs5
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O c() throws DecoderException {
        synchronized (this.f32415b) {
            try {
                o();
                if (this.d.isEmpty()) {
                    return null;
                }
                return this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        if (f()) {
            this.f32415b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    public final void o() throws E, DecoderException {
        E e = this.j;
        if (e != null) {
            throw e;
        }
    }

    @Override // defpackage.rs5
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void d(I i) throws DecoderException {
        synchronized (this.f32415b) {
            o();
            rk1.a(i == this.i);
            this.c.addLast(i);
            n();
            this.i = null;
        }
    }

    public final void q(I i) {
        i.h();
        I[] iArr = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = i;
    }

    public void r(O o) {
        synchronized (this.f32415b) {
            s(o);
            n();
        }
    }

    @Override // defpackage.rs5
    public void release() {
        synchronized (this.f32415b) {
            this.l = true;
            this.f32415b.notify();
        }
        try {
            this.f32414a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void s(O o) {
        o.h();
        O[] oArr = this.f;
        int i = this.h;
        this.h = i + 1;
        oArr[i] = o;
    }

    public final void t() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (k());
    }

    public final void u(int i) {
        rk1.g(this.g == this.e.length);
        for (I i2 : this.e) {
            i2.s(i);
        }
    }
}
