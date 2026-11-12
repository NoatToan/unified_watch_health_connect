package zb;

import com.google.android.exoplayer2.C;
import fa.z;
import java.util.ArrayDeque;
import yb.j;
import yb.l;
import yb.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<b> f203404a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<m> f203405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<b> f203406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f203407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f203408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f203409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f203410g;

    public static final class b extends l implements Comparable<b> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f203411k;

        private b() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            if (b(4) != bVar2.b(4)) {
                return b(4) ? 1 : -1;
            }
            long j8 = this.f8633f - bVar2.f8633f;
            if (j8 == 0) {
                j8 = this.f203411k - bVar2.f203411k;
                if (j8 == 0) {
                    return 0;
                }
            }
            return j8 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: zb.c$c, reason: collision with other inner class name */
    public static final class C3798c extends m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ia.d.a<C3798c> f203412f;

        public C3798c(ia.d.a<C3798c> aVar) {
            this.f203412f = aVar;
        }

        @Override // ia.d
        public final void d() {
            c cVar = (c) ((xw.b) this.f203412f).f192292b;
            c();
            cVar.f203405b.add(this);
        }
    }

    public c() {
        for (int i14 = 0; i14 < 10; i14++) {
            this.f203404a.add(new b());
        }
        this.f203405b = new ArrayDeque<>();
        for (int i15 = 0; i15 < 2; i15++) {
            this.f203405b.add(new C3798c(new xw.b(this, 5)));
        }
        this.f203406c = new ArrayDeque<>();
        this.f203410g = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // ia.c
    public final void a(l lVar) {
        fa.a.a(lVar == this.f203407d);
        b bVar = (b) lVar;
        long j8 = bVar.f8633f;
        if (j8 != Long.MIN_VALUE) {
            long j14 = this.f203410g;
            if (j14 == C.TIME_UNSET || j8 >= j14) {
                long j15 = this.f203409f;
                this.f203409f = 1 + j15;
                bVar.f203411k = j15;
                this.f203406c.add(bVar);
            } else {
                bVar.c();
                this.f203404a.add(bVar);
            }
        } else {
            long j16 = this.f203409f;
            this.f203409f = 1 + j16;
            bVar.f203411k = j16;
            this.f203406c.add(bVar);
        }
        this.f203407d = null;
    }

    @Override // ia.c
    public final void b(long j8) {
        this.f203410g = j8;
    }

    public abstract d d();

    @Override // ia.c
    public final l dequeueInputBuffer() {
        fa.a.d(this.f203407d == null);
        ArrayDeque<b> arrayDeque = this.f203404a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        b bVarPollFirst = arrayDeque.pollFirst();
        this.f203407d = bVarPollFirst;
        return bVarPollFirst;
    }

    public abstract void e(b bVar);

    @Override // ia.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public m dequeueOutputBuffer() {
        ArrayDeque<m> arrayDeque = this.f203405b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque<b> arrayDeque2 = this.f203406c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            b bVarPeek = arrayDeque2.peek();
            int i14 = z.f70071a;
            if (bVarPeek.f8633f > this.f203408e) {
                return null;
            }
            b bVarPoll = arrayDeque2.poll();
            boolean zB = bVarPoll.b(4);
            ArrayDeque<b> arrayDeque3 = this.f203404a;
            if (zB) {
                m mVarPollFirst = arrayDeque.pollFirst();
                mVarPollFirst.a(4);
                bVarPoll.c();
                arrayDeque3.add(bVarPoll);
                return mVarPollFirst;
            }
            e(bVarPoll);
            if (g()) {
                d dVarD = d();
                m mVarPollFirst2 = arrayDeque.pollFirst();
                long j8 = bVarPoll.f8633f;
                mVarPollFirst2.f92385b = j8;
                mVarPollFirst2.f195660d = dVarD;
                mVarPollFirst2.f195661e = j8;
                bVarPoll.c();
                arrayDeque3.add(bVarPoll);
                return mVarPollFirst2;
            }
            bVarPoll.c();
            arrayDeque3.add(bVarPoll);
        }
    }

    @Override // ia.c
    public void flush() {
        ArrayDeque<b> arrayDeque;
        this.f203409f = 0L;
        this.f203408e = 0L;
        while (true) {
            ArrayDeque<b> arrayDeque2 = this.f203406c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f203404a;
            if (zIsEmpty) {
                break;
            }
            b bVarPoll = arrayDeque2.poll();
            int i14 = z.f70071a;
            bVarPoll.c();
            arrayDeque.add(bVarPoll);
        }
        b bVar = this.f203407d;
        if (bVar != null) {
            bVar.c();
            arrayDeque.add(bVar);
            this.f203407d = null;
        }
    }

    public abstract boolean g();

    @Override // ia.c
    public void release() {
    }

    @Override // yb.j
    public final void setPositionUs(long j8) {
        this.f203408e = j8;
    }
}
