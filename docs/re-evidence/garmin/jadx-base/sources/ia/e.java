package ia;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.C;
import ia.d;
import java.util.ArrayDeque;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<I extends DecoderInputBuffer, O extends d, E extends DecoderException> implements c<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f92387a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I[] f92391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O[] f92392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f92393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f92394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I f92395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public E f92396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f92397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f92398l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f92388b = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f92399m = C.TIME_UNSET;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f92389c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f92390d = new ArrayDeque<>();

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.getClass();
            do {
                try {
                } catch (InterruptedException e4) {
                    l2.p(e4);
                    return;
                }
            } while (eVar.h());
        }
    }

    public e(I[] iArr, O[] oArr) {
        this.f92391e = iArr;
        this.f92393g = iArr.length;
        for (int i14 = 0; i14 < this.f92393g; i14++) {
            ((I[]) this.f92391e)[i14] = d();
        }
        this.f92392f = oArr;
        this.f92394h = oArr.length;
        for (int i15 = 0; i15 < this.f92394h; i15++) {
            ((O[]) this.f92392f)[i15] = e();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f92387a = aVar;
        aVar.start();
    }

    @Override // ia.c
    public final void b(long j8) {
        synchronized (this.f92388b) {
            try {
                fa.a.d(this.f92393g == this.f92391e.length || this.f92397k);
                this.f92399m = j8;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ia.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(I i14) {
        synchronized (this.f92388b) {
            try {
                E e4 = this.f92396j;
                if (e4 != null) {
                    throw e4;
                }
                fa.a.a(i14 == this.f92395i);
                this.f92389c.addLast(i14);
                if (!this.f92389c.isEmpty() && this.f92394h > 0) {
                    this.f92388b.notify();
                }
                this.f92395i = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract I d();

    @Override // ia.c
    public final Object dequeueInputBuffer() {
        I i14;
        synchronized (this.f92388b) {
            try {
                E e4 = this.f92396j;
                if (e4 != null) {
                    throw e4;
                }
                fa.a.d(this.f92395i == null);
                int i15 = this.f92393g;
                if (i15 == 0) {
                    i14 = null;
                } else {
                    I[] iArr = this.f92391e;
                    int i16 = i15 - 1;
                    this.f92393g = i16;
                    i14 = iArr[i16];
                }
                this.f92395i = i14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i14;
    }

    public abstract O e();

    public abstract E f(Throwable th3);

    @Override // ia.c
    public final void flush() {
        synchronized (this.f92388b) {
            try {
                this.f92397k = true;
                I i14 = this.f92395i;
                if (i14 != null) {
                    i14.c();
                    I[] iArr = this.f92391e;
                    int i15 = this.f92393g;
                    this.f92393g = i15 + 1;
                    iArr[i15] = i14;
                    this.f92395i = null;
                }
                while (!this.f92389c.isEmpty()) {
                    I iRemoveFirst = this.f92389c.removeFirst();
                    iRemoveFirst.c();
                    I[] iArr2 = this.f92391e;
                    int i16 = this.f92393g;
                    this.f92393g = i16 + 1;
                    iArr2[i16] = iRemoveFirst;
                }
                while (!this.f92390d.isEmpty()) {
                    this.f92390d.removeFirst().d();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract E g(I i14, O o7, boolean z14);

    public final boolean h() {
        boolean z14;
        E e4;
        synchronized (this.f92388b) {
            while (!this.f92398l) {
                try {
                    if (!this.f92389c.isEmpty() && this.f92394h > 0) {
                        break;
                    }
                    this.f92388b.wait();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f92398l) {
                return false;
            }
            I iRemoveFirst = this.f92389c.removeFirst();
            O[] oArr = this.f92392f;
            int i14 = this.f92394h - 1;
            this.f92394h = i14;
            O o7 = oArr[i14];
            boolean z15 = this.f92397k;
            this.f92397k = false;
            if (iRemoveFirst.b(4)) {
                o7.a(4);
            } else {
                o7.f92385b = iRemoveFirst.f8633f;
                if (iRemoveFirst.b(134217728)) {
                    o7.a(134217728);
                }
                long j8 = iRemoveFirst.f8633f;
                synchronized (this.f92388b) {
                    long j14 = this.f92399m;
                    z14 = j14 == C.TIME_UNSET || j8 >= j14;
                }
                if (!z14) {
                    o7.f92386c = true;
                }
                try {
                    e4 = (E) g(iRemoveFirst, o7, z15);
                } catch (OutOfMemoryError e14) {
                    e4 = (E) f(e14);
                } catch (RuntimeException e15) {
                    e4 = (E) f(e15);
                }
                if (e4 != null) {
                    synchronized (this.f92388b) {
                        this.f92396j = e4;
                    }
                    return false;
                }
            }
            synchronized (this.f92388b) {
                try {
                    if (this.f92397k || o7.f92386c) {
                        o7.d();
                    } else {
                        this.f92390d.addLast(o7);
                    }
                    iRemoveFirst.c();
                    I[] iArr = this.f92391e;
                    int i15 = this.f92393g;
                    this.f92393g = i15 + 1;
                    iArr[i15] = iRemoveFirst;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return true;
        }
    }

    @Override // ia.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final O dequeueOutputBuffer() {
        synchronized (this.f92388b) {
            try {
                E e4 = this.f92396j;
                if (e4 != null) {
                    throw e4;
                }
                if (this.f92390d.isEmpty()) {
                    return null;
                }
                return this.f92390d.removeFirst();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void j(O o7) {
        synchronized (this.f92388b) {
            o7.c();
            O[] oArr = this.f92392f;
            int i14 = this.f92394h;
            this.f92394h = i14 + 1;
            oArr[i14] = o7;
            if (!this.f92389c.isEmpty() && this.f92394h > 0) {
                this.f92388b.notify();
            }
        }
    }

    @Override // ia.c
    public final void release() {
        synchronized (this.f92388b) {
            this.f92398l = true;
            this.f92388b.notify();
        }
        try {
            this.f92387a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
