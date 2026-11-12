package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jza f32016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f32017b;
    public final List<b> c;
    public final rok d;
    public final cq2 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public cnk<Bitmap> i;
    public a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32018k;
    public a l;
    public Bitmap m;
    public lyp<Bitmap> n;
    public a o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32019r;

    @VisibleForTesting
    public static class a extends le5<Bitmap> {
        public final Handler d;
        public final int e;
        public final long f;
        public Bitmap g;

        public a(Handler handler, int i, long j) {
            this.d = handler;
            this.e = i;
            this.f = j;
        }

        @Override // defpackage.e0p
        public void b(Drawable drawable) {
            this.g = null;
        }

        public Bitmap h() {
            return this.g;
        }

        @Override // defpackage.e0p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap, lzp<? super Bitmap> lzpVar) {
            this.g = bitmap;
            this.d.sendMessageAtTime(this.d.obtainMessage(1, this), this.f);
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                qza.this.m((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            qza.this.d.k((a) message.obj);
            return false;
        }
    }

    @VisibleForTesting
    public interface d {
    }

    public qza(com.bumptech.glide.a aVar, jza jzaVar, int i, int i2, lyp<Bitmap> lypVar, Bitmap bitmap) {
        this(aVar.g(), com.bumptech.glide.a.u(aVar.i()), jzaVar, null, i(com.bumptech.glide.a.u(aVar.i()), i, i2), lypVar, bitmap);
    }

    public static pzd g() {
        return new b4h(Double.valueOf(Math.random()));
    }

    public static cnk<Bitmap> i(rok rokVar, int i, int i2) {
        return rokVar.i().a(vok.m0(jy6.f23239b).k0(true).f0(true).W(i, i2));
    }

    public void a() {
        this.c.clear();
        n();
        q();
        a aVar = this.j;
        if (aVar != null) {
            this.d.k(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.k(aVar2);
            this.l = null;
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            this.d.k(aVar3);
            this.o = null;
        }
        this.f32016a.clear();
        this.f32018k = true;
    }

    public ByteBuffer b() {
        return this.f32016a.getData().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.h() : this.m;
    }

    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.e;
        }
        return -1;
    }

    public Bitmap e() {
        return this.m;
    }

    public int f() {
        return this.f32016a.g();
    }

    public int h() {
        return this.f32019r;
    }

    public int j() {
        return this.f32016a.d() + this.p;
    }

    public int k() {
        return this.q;
    }

    public final void l() {
        if (!this.f || this.g) {
            return;
        }
        if (this.h) {
            a6i.a(this.o == null, "Pending target must be null when starting from the first frame");
            this.f32016a.b();
            this.h = false;
        }
        a aVar = this.o;
        if (aVar != null) {
            this.o = null;
            m(aVar);
            return;
        }
        this.g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f32016a.h());
        this.f32016a.f();
        this.l = new a(this.f32017b, this.f32016a.c(), jUptimeMillis);
        this.i.a(vok.n0(g())).A0(this.f32016a).u0(this.l);
    }

    @VisibleForTesting
    public void m(a aVar) {
        this.g = false;
        if (this.f32018k) {
            this.f32017b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f) {
            if (this.h) {
                this.f32017b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.o = aVar;
                return;
            }
        }
        if (aVar.h() != null) {
            n();
            a aVar2 = this.j;
            this.j = aVar;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                this.c.get(size).a();
            }
            if (aVar2 != null) {
                this.f32017b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    public final void n() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.a(bitmap);
            this.m = null;
        }
    }

    public void o(lyp<Bitmap> lypVar, Bitmap bitmap) {
        this.n = (lyp) a6i.d(lypVar);
        this.m = (Bitmap) a6i.d(bitmap);
        this.i = this.i.a(new vok().g0(lypVar));
        this.p = ulq.i(bitmap);
        this.q = bitmap.getWidth();
        this.f32019r = bitmap.getHeight();
    }

    public final void p() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f32018k = false;
        l();
    }

    public final void q() {
        this.f = false;
    }

    public void r(b bVar) {
        if (this.f32018k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.c.isEmpty();
        this.c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    public void s(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            q();
        }
    }

    @VisibleForTesting
    public void setOnEveryFrameReadyListener(d dVar) {
    }

    public qza(cq2 cq2Var, rok rokVar, jza jzaVar, Handler handler, cnk<Bitmap> cnkVar, lyp<Bitmap> lypVar, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = rokVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = cq2Var;
        this.f32017b = handler;
        this.i = cnkVar;
        this.f32016a = jzaVar;
        o(lypVar, bitmap);
    }
}
