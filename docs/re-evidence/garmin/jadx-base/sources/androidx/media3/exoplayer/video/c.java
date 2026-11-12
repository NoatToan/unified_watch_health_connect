package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.a0;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.k0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.common.x;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.o;
import c22.t;
import com.google.android.exoplayer2.C;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import fa.i;
import fa.m;
import fa.s;
import fa.u;
import fa.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import ka.l;
import vb.h;
import z0.g0;
import za.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements k, j0.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final bv2.g f9802p = new bv2.g(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.d f9805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.e f9806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f9807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImmutableList f9808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.a f9809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fa.c f9810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<e> f9811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f9812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public za.f f9813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f9814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Pair<Surface, s> f9815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9817o;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f9818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.video.d f9819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f9820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g f9821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImmutableList f9822e = ImmutableList.of();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public fa.c f9823f = fa.c.f70004a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f9824g;

        public b(Context context, androidx.media3.exoplayer.video.d dVar) {
            this.f9818a = context.getApplicationContext();
            this.f9819b = dVar;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.c$c, reason: collision with other inner class name */
    public final class C0132c implements androidx.media3.exoplayer.video.e.a {
        private C0132c() {
        }
    }

    public final class d implements VideoSink, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<Object> f9827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.exoplayer.video.d.a f9828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public q f9829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f9830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f9832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f9833h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f9834i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f9835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f9836k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f9837l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f9838m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f9839n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public VideoSink.a f9840o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Executor f9841p;

        public d(Context context) {
            this.f9826a = z.J(context) ? 1 : 5;
            this.f9827b = new ArrayList<>();
            this.f9828c = new androidx.media3.exoplayer.video.d.a();
            this.f9835j = C.TIME_UNSET;
            this.f9836k = C.TIME_UNSET;
            this.f9840o = VideoSink.a.f9776a;
            this.f9841p = c.f9802p;
        }

        @Override // androidx.media3.exoplayer.video.c.e
        public final void a() {
            this.f9841p.execute(new za.c(this, this.f9840o, 1));
        }

        @Override // androidx.media3.exoplayer.video.c.e
        public final void b() {
            this.f9841p.execute(new za.c(this, this.f9840o, 2));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void c() {
            c.this.f9809g.c();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final Surface d() {
            fa.a.d(isInitialized());
            fa.a.f(null);
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void e(Surface surface, s sVar) {
            c cVar = c.this;
            Pair<Surface, s> pair = cVar.f9815m;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((s) cVar.f9815m.second).equals(sVar)) {
                return;
            }
            cVar.f9815m = Pair.create(surface, sVar);
            cVar.b(surface, sVar.f70058a, sVar.f70059b);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void f(long j8, long j14, long j15, long j16) {
            this.f9834i |= (this.f9831f == j14 && this.f9832g == j15) ? false : true;
            this.f9830e = j8;
            this.f9831f = j14;
            this.f9832g = j15;
            this.f9833h = j16;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void g() {
            c.this.f9809g.g();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void h(q qVar) throws VideoSink.VideoSinkException {
            fa.a.d(!isInitialized());
            c cVar = c.this;
            fa.a.d(cVar.f9817o == 0);
            androidx.media3.common.i iVarA = qVar.B;
            if (iVarA == null || !iVarA.e()) {
                iVarA = androidx.media3.common.i.f8308h;
            }
            if (iVarA.f8317c == 7 && z.f70071a < 34) {
                androidx.media3.common.i.b bVar = new androidx.media3.common.i.b();
                bVar.f8324c = 6;
                iVarA = bVar.a();
            }
            androidx.media3.common.i iVar = iVarA;
            fa.c cVar2 = cVar.f9810h;
            Looper looperMyLooper = Looper.myLooper();
            fa.a.f(looperMyLooper);
            u uVarCreateHandler = cVar2.createHandler(looperMyLooper, null);
            cVar.f9814l = uVarCreateHandler;
            try {
                cVar.f9807e.a(cVar.f9803a, iVar, cVar, new l(uVarCreateHandler, 2), ImmutableList.of());
                Pair<Surface, s> pair = cVar.f9815m;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    s sVar = (s) pair.second;
                    cVar.b(surface, sVar.f70058a, sVar.f70059b);
                }
                throw null;
            } catch (VideoFrameProcessingException e4) {
                throw new VideoSink.VideoSinkException(e4, qVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void i(boolean z14) {
            c.this.f9809g.f9777a.f9849e = z14 ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isEnded() {
            if (!isInitialized()) {
                return false;
            }
            long j8 = this.f9835j;
            if (j8 == C.TIME_UNSET) {
                return false;
            }
            c cVar = c.this;
            if (cVar.f9816n != 0) {
                return false;
            }
            long j14 = cVar.f9806d.f9868j;
            return j14 != C.TIME_UNSET && j14 >= j8;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean isInitialized() {
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void j(za.f fVar) {
            c.this.f9813k = fVar;
        }

        @Override // androidx.media3.exoplayer.video.c.e
        public final void k(k0 k0Var) {
            this.f9841p.execute(new za.c(this, this.f9840o, k0Var));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void l(q qVar) {
            fa.a.d(isInitialized());
            c.this.f9805c.g(qVar.f8395w);
            this.f9829d = qVar;
            if (this.f9837l) {
                fa.a.d(this.f9836k != C.TIME_UNSET);
                this.f9838m = true;
                this.f9839n = this.f9836k;
            } else {
                w();
                this.f9837l = true;
                this.f9838m = false;
                this.f9839n = C.TIME_UNSET;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void m(int i14) {
            c.this.f9809g.m(i14);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void n(boolean z14) {
            c.this.f9809g.n(z14);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            if (r4 >= r2) goto L23;
         */
        @Override // androidx.media3.exoplayer.video.VideoSink
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean o(long j8, boolean z14, long j14, long j15, androidx.media3.exoplayer.video.b.C0131b c0131b) throws VideoSink.VideoSinkException {
            int i14 = c0131b.f9795b;
            androidx.media3.exoplayer.mediacodec.c cVar = c0131b.f9794a;
            androidx.media3.exoplayer.video.b bVar = androidx.media3.exoplayer.video.b.this;
            c cVar2 = c.this;
            fa.a.d(isInitialized());
            long j16 = j8 - this.f9832g;
            try {
                androidx.media3.exoplayer.video.d dVar = cVar2.f9805c;
                androidx.media3.exoplayer.video.e eVar = cVar2.f9806d;
                if (dVar.a(j16, j14, j15, this.f9830e, z14, this.f9828c) == 4) {
                    return false;
                }
                if (j16 < this.f9833h && !z14) {
                    bVar.z0(cVar, i14);
                    return true;
                }
                render(j14, j15);
                if (this.f9838m) {
                    long j17 = this.f9839n;
                    if (j17 != C.TIME_UNSET) {
                        if (cVar2.f9816n == 0) {
                            long j18 = eVar.f9868j;
                            if (j18 != C.TIME_UNSET) {
                            }
                        }
                        return false;
                    }
                    w();
                    this.f9838m = false;
                    this.f9839n = C.TIME_UNSET;
                }
                fa.a.f(null);
                throw null;
            } catch (ExoPlaybackException e4) {
                q qVar = this.f9829d;
                fa.a.f(qVar);
                throw new VideoSink.VideoSinkException(e4, qVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void p(androidx.media3.exoplayer.video.b.a aVar, Executor executor) {
            this.f9840o = aVar;
            this.f9841p = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void q(List<Object> list) {
            ArrayList<Object> arrayList = this.f9827b;
            if (arrayList.equals(list)) {
                return;
            }
            arrayList.clear();
            arrayList.addAll(list);
            arrayList.addAll(c.this.f9808f);
            w();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final boolean r(boolean z14) {
            boolean z15 = false;
            boolean z16 = z14 && isInitialized();
            c cVar = c.this;
            androidx.media3.exoplayer.video.a aVar = cVar.f9809g;
            if (z16 && cVar.f9816n == 0) {
                z15 = true;
            }
            return aVar.f9777a.b(z15);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void release() {
            c cVar = c.this;
            if (cVar.f9817o == 2) {
                return;
            }
            i iVar = cVar.f9814l;
            if (iVar != null) {
                iVar.a();
            }
            cVar.f9815m = null;
            cVar.f9817o = 2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void render(long j8, long j14) throws VideoSink.VideoSinkException {
            try {
                c.a(c.this, j8, j14);
            } catch (ExoPlaybackException e4) {
                q qVarA = this.f9829d;
                if (qVarA == null) {
                    qVarA = new q.b().a();
                }
                throw new VideoSink.VideoSinkException(e4, qVarA);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void s() {
            c.this.f9809g.s();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void setPlaybackSpeed(float f14) {
            c.this.f9809g.setPlaybackSpeed(f14);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void t() {
            c.this.f9809g.t();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void u() {
            c cVar = c.this;
            cVar.getClass();
            s sVar = s.f70057c;
            cVar.b(null, sVar.f70058a, sVar.f70059b);
            cVar.f9815m = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void v(boolean z14) {
            if (isInitialized()) {
                throw null;
            }
            this.f9837l = false;
            this.f9835j = C.TIME_UNSET;
            this.f9836k = C.TIME_UNSET;
            c cVar = c.this;
            if (cVar.f9817o == 1) {
                cVar.f9816n++;
                cVar.f9809g.v(z14);
                i iVar = cVar.f9814l;
                fa.a.f(iVar);
                iVar.post(new g0(cVar, 3));
            }
            this.f9839n = C.TIME_UNSET;
        }

        public final void w() {
            if (this.f9829d == null) {
                return;
            }
            new ArrayList(this.f9827b);
            q qVar = this.f9829d;
            qVar.getClass();
            fa.a.f(null);
            androidx.media3.common.i iVar = qVar.B;
            if (iVar == null || !iVar.e()) {
                iVar = androidx.media3.common.i.f8308h;
            }
            r.b bVar = new r.b(iVar, qVar.f8393u, qVar.f8394v);
            new r(bVar.f8429a, bVar.f8430b, bVar.f8431c, qVar.f8397y, bVar.f8432d);
            throw null;
        }
    }

    public interface e {
        void a();

        void b();

        void k(k0 k0Var);
    }

    public static final class f implements i0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Supplier<i0.a> f9843a = Suppliers.memoize(new o(3));

        private f() {
        }
    }

    public static final class g implements a0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0.a f9844a;

        public g(i0.a aVar) {
            this.f9844a = aVar;
        }

        @Override // androidx.media3.common.a0.a
        public final a0 a(Context context, androidx.media3.common.i iVar, j0.a aVar, l lVar, List list) throws VideoFrameProcessingException {
            try {
                return ((a0.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(i0.a.class).newInstance(this.f9844a)).a(context, iVar, aVar, lVar, list);
            } catch (Exception e4) {
                throw VideoFrameProcessingException.from(e4);
            }
        }
    }

    private c(b bVar) {
        Context context = bVar.f9818a;
        this.f9803a = context;
        d dVar = new d(context);
        this.f9804b = dVar;
        fa.c cVar = bVar.f9823f;
        this.f9810h = cVar;
        androidx.media3.exoplayer.video.d dVar2 = bVar.f9819b;
        this.f9805c = dVar2;
        dVar2.f9856l = cVar;
        androidx.media3.exoplayer.video.e eVar = new androidx.media3.exoplayer.video.e(new C0132c(), dVar2);
        this.f9806d = eVar;
        g gVar = bVar.f9821d;
        fa.a.f(gVar);
        this.f9807e = gVar;
        this.f9808f = bVar.f9822e;
        this.f9809g = new androidx.media3.exoplayer.video.a(dVar2, eVar);
        CopyOnWriteArraySet<e> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f9811i = copyOnWriteArraySet;
        this.f9817o = 0;
        copyOnWriteArraySet.add(dVar);
    }

    public static void a(c cVar, long j8, long j14) {
        androidx.media3.exoplayer.video.e eVar = cVar.f9806d;
        androidx.media3.exoplayer.video.e.a aVar = eVar.f9859a;
        androidx.media3.exoplayer.video.d dVar = eVar.f9860b;
        m mVar = eVar.f9864f;
        int i14 = mVar.f70037b;
        if (i14 == 0) {
            return;
        }
        if (i14 == 0) {
            t.g();
            return;
        }
        long j15 = mVar.f70038c[mVar.f70036a];
        Long lF = eVar.f9863e.f(j15);
        if (lF != null && lF.longValue() != eVar.f9867i) {
            eVar.f9867i = lF.longValue();
            dVar.d(2);
        }
        int iA = eVar.f9860b.a(j15, j8, j14, eVar.f9867i, false, eVar.f9861c);
        if (iA != 0 && iA != 1) {
            if (iA != 2 && iA != 3 && iA != 4) {
                if (iA == 5) {
                    return;
                }
                h.z(String.valueOf(iA));
                return;
            } else {
                eVar.f9868j = j15;
                mVar.a();
                Iterator<e> it = c.this.f9811i.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
                fa.a.f(null);
                throw null;
            }
        }
        eVar.f9868j = j15;
        boolean z14 = iA == 0;
        long jA = mVar.a();
        k0 k0VarF = eVar.f9862d.f(jA);
        if (k0VarF != null && !k0VarF.equals(k0.f8334d) && !k0VarF.equals(eVar.f9866h)) {
            eVar.f9866h = k0VarF;
            c cVar2 = c.this;
            q.b bVar = new q.b();
            bVar.f8418t = k0VarF.f8335a;
            bVar.f8419u = k0VarF.f8336b;
            bVar.f8411m = x.n("video/raw");
            cVar2.f9812j = bVar.a();
            Iterator<e> it3 = cVar2.f9811i.iterator();
            while (it3.hasNext()) {
                it3.next().k(k0VarF);
            }
        }
        if (!z14) {
            long j16 = eVar.f9861c.f9858b;
        }
        boolean z15 = dVar.f9849e != 3;
        dVar.f9849e = 3;
        dVar.f9851g = z.O(dVar.f9856l.elapsedRealtime());
        c cVar3 = c.this;
        if (z15 && cVar3.f9815m != null) {
            Iterator<e> it4 = cVar3.f9811i.iterator();
            while (it4.hasNext()) {
                it4.next().a();
            }
        }
        if (cVar3.f9813k != null) {
            q qVarA = cVar3.f9812j;
            if (qVarA == null) {
                qVarA = new q.b().a();
            }
            cVar3.f9813k.a(jA, cVar3.f9810h.nanoTime(), qVarA, null);
        }
        fa.a.f(null);
        throw null;
    }

    public final void b(Surface surface, int i14, int i15) {
    }
}
