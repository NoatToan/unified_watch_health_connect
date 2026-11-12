package hj;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.util.ArrayList;
import qj.m;
import ui.l;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final si.a f83935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f83936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f83937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f83938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xi.d f83939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f83940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f83941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.j<Bitmap> f83942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f83943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f83944j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f83945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f83946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l<Bitmap> f83947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f83948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f83949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f83950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f83951q;

    public static class a extends nj.c<Bitmap> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f83952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f83953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f83954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bitmap f83955g;

        public a(Handler handler, int i14, long j8) {
            this.f83952d = handler;
            this.f83953e = i14;
            this.f83954f = j8;
        }

        @Override // nj.h
        public final void a(Drawable drawable) {
            this.f83955g = null;
        }

        @Override // nj.h
        public final void f(Object obj) {
            this.f83955g = (Bitmap) obj;
            Handler handler = this.f83952d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f83954f);
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i14 = message.what;
            g gVar = g.this;
            if (i14 == 1) {
                gVar.b((a) message.obj);
                return true;
            }
            if (i14 != 2) {
                return false;
            }
            gVar.f83938d.j((a) message.obj);
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(com.bumptech.glide.b bVar, si.a aVar, int i14, int i15, l<Bitmap> lVar, Bitmap bitmap) {
        xi.d dVar = bVar.f28454b;
        com.bumptech.glide.d dVar2 = bVar.f28456d;
        this(dVar, com.bumptech.glide.b.e(dVar2.getBaseContext()), aVar, null, com.bumptech.glide.b.e(dVar2.getBaseContext()).g().a(((mj.h) new mj.h().d(wi.j.f185365b).x()).s(true).j(i14, i15)), lVar, bitmap);
    }

    public final void a() {
        if (!this.f83940f || this.f83941g) {
            return;
        }
        a aVar = this.f83948n;
        if (aVar != null) {
            this.f83948n = null;
            b(aVar);
            return;
        }
        this.f83941g = true;
        si.a aVar2 = this.f83935a;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) aVar2.d());
        aVar2.f();
        this.f83945k = new a(this.f83936b, aVar2.e(), jUptimeMillis);
        com.bumptech.glide.j<Bitmap> jVarJ = this.f83942h.a(new mj.h().q(new pj.d(Double.valueOf(Math.random())))).J(aVar2);
        a aVar3 = this.f83945k;
        jVarJ.getClass();
        jVarJ.F(aVar3, null, jVarJ, qj.e.f144968a);
    }

    public final void b(a aVar) {
        this.f83941g = false;
        boolean z14 = this.f83944j;
        Handler handler = this.f83936b;
        if (z14) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f83940f) {
            this.f83948n = aVar;
            return;
        }
        if (aVar.f83955g != null) {
            Bitmap bitmap = this.f83946l;
            if (bitmap != null) {
                this.f83939e.c(bitmap);
                this.f83946l = null;
            }
            a aVar2 = this.f83943i;
            this.f83943i = aVar;
            ArrayList arrayList = this.f83937c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(l<Bitmap> lVar, Bitmap bitmap) {
        qj.l.c(lVar, "Argument must not be null");
        this.f83947m = lVar;
        qj.l.c(bitmap, "Argument must not be null");
        this.f83946l = bitmap;
        this.f83942h = this.f83942h.a(new mj.h().w(lVar, true));
        this.f83949o = m.c(bitmap);
        this.f83950p = bitmap.getWidth();
        this.f83951q = bitmap.getHeight();
    }

    public g(xi.d dVar, k kVar, si.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, l<Bitmap> lVar, Bitmap bitmap) {
        this.f83937c = new ArrayList();
        this.f83938d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f83939e = dVar;
        this.f83936b = handler;
        this.f83942h = jVar;
        this.f83935a = aVar;
        c(lVar, bitmap);
    }
}
