package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.b;
import defpackage.ag4;
import defpackage.g83;
import defpackage.hl4;
import defpackage.ljf;
import defpackage.mie;
import defpackage.oh8;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import defpackage.yhr;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(18)
public class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DrmInitData.SchemeData> f7868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7869b;
    public final a c;
    public final b d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap<String, String> h;
    public final hl4<com.google.android.exoplayer2.drm.b.a> i;
    public final com.google.android.exoplayer2.upstream.h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f7870k;
    public final UUID l;
    public final e m;
    public int n;
    public int o;
    public HandlerThread p;
    public c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public oh8 f7871r;
    public DrmSession.DrmSessionException s;
    public byte[] t;
    public byte[] u;
    public f.a v;
    public f.g w;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    public interface a {
        void a(DefaultDrmSession defaultDrmSession);

        void b();

        void c(Exception exc);
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i);

        void b(DefaultDrmSession defaultDrmSession, int i);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f7872a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f7875b) {
                return false;
            }
            int i = dVar.e + 1;
            dVar.e = i;
            if (i > DefaultDrmSession.this.j.e(3)) {
                return false;
            }
            long jA = DefaultDrmSession.this.j.a(new com.google.android.exoplayer2.upstream.h.a(new mie(dVar.f7874a, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.c, mediaDrmCallbackException.bytesLoaded), new ljf(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f7872a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jA);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(int i, Object obj, boolean z) {
            obtainMessage(i, new d(mie.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f7872a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objB = defaultDrmSession.f7870k.b(defaultDrmSession.l, (f.g) dVar.d);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    objB = defaultDrmSession2.f7870k.a(defaultDrmSession2.l, (f.a) dVar.d);
                }
            } catch (MediaDrmCallbackException e) {
                boolean zA = a(message, e);
                objB = e;
                if (zA) {
                    return;
                }
            } catch (Exception e2) {
                toe.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objB = e2;
            }
            DefaultDrmSession.this.j.d(dVar.f7874a);
            synchronized (this) {
                try {
                    if (!this.f7872a) {
                        DefaultDrmSession.this.m.obtainMessage(message.what, Pair.create(dVar.d, objB)).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7875b;
        public final long c;
        public final Object d;
        public int e;

        public d(long j, boolean z, long j2, Object obj) {
            this.f7874a = j;
            this.f7875b = z;
            this.c = j2;
            this.d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.B(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                DefaultDrmSession.this.v(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, f fVar, a aVar, b bVar, List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> map, i iVar, Looper looper, com.google.android.exoplayer2.upstream.h hVar) {
        if (i == 1 || i == 3) {
            rk1.e(bArr);
        }
        this.l = uuid;
        this.c = aVar;
        this.d = bVar;
        this.f7869b = fVar;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.u = bArr;
            this.f7868a = null;
        } else {
            this.f7868a = Collections.unmodifiableList((List) rk1.e(list));
        }
        this.h = map;
        this.f7870k = iVar;
        this.i = new hl4<>();
        this.j = hVar;
        this.n = 2;
        this.m = new e(looper);
    }

    public void A(Exception exc) {
        u(exc);
    }

    public final void B(Object obj, Object obj2) {
        if (obj == this.w) {
            if (this.n == 2 || r()) {
                this.w = null;
                if (obj2 instanceof Exception) {
                    this.c.c((Exception) obj2);
                    return;
                }
                try {
                    this.f7869b.h((byte[]) obj2);
                    this.c.b();
                } catch (Exception e2) {
                    this.c.c(e2);
                }
            }
        }
    }

    public final boolean C(boolean z) {
        if (r()) {
            return true;
        }
        try {
            byte[] bArrD = this.f7869b.d();
            this.t = bArrD;
            this.f7871r = this.f7869b.g(bArrD);
            final int i = 3;
            this.n = 3;
            n(new ag4() { // from class: ju5
                @Override // defpackage.ag4
                public final void accept(Object obj) {
                    ((b.a) obj).k(i);
                }
            });
            rk1.e(this.t);
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                this.c.a(this);
                return false;
            }
            u(e2);
            return false;
        } catch (Exception e3) {
            u(e3);
            return false;
        }
    }

    public final void D(byte[] bArr, int i, boolean z) {
        try {
            this.v = this.f7869b.j(bArr, this.f7868a, i, this.h);
            ((c) wlq.j(this.q)).b(1, rk1.e(this.v), z);
        } catch (Exception e2) {
            w(e2);
        }
    }

    public void E() {
        this.w = this.f7869b.c();
        ((c) wlq.j(this.q)).b(0, rk1.e(this.w), true);
    }

    public final boolean F() {
        try {
            this.f7869b.e(this.t, this.u);
            return true;
        } catch (Exception e2) {
            u(e2);
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a(com.google.android.exoplayer2.drm.b.a aVar) {
        rk1.g(this.o > 0);
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.n = 0;
            ((e) wlq.j(this.m)).removeCallbacksAndMessages(null);
            ((c) wlq.j(this.q)).c();
            this.q = null;
            ((HandlerThread) wlq.j(this.p)).quit();
            this.p = null;
            this.f7871r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.f7869b.i(bArr);
                this.t = null;
            }
        }
        if (aVar != null) {
            this.i.f(aVar);
            if (this.i.count(aVar) == 0) {
                aVar.m();
            }
        }
        this.d.a(this, this.o);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean b() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException c() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> e() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.f7869b.b(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void f(com.google.android.exoplayer2.drm.b.a aVar) {
        rk1.g(this.o >= 0);
        if (aVar != null) {
            this.i.e(aVar);
        }
        int i = this.o + 1;
        this.o = i;
        if (i == 1) {
            rk1.g(this.n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new c(this.p.getLooper());
            if (C(true)) {
                o(true);
            }
        } else if (aVar != null && r() && this.i.count(aVar) == 1) {
            aVar.k(this.n);
        }
        this.d.b(this, this.o);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID g() {
        return this.l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final oh8 h() {
        return this.f7871r;
    }

    public final void n(ag4<com.google.android.exoplayer2.drm.b.a> ag4Var) {
        Iterator<com.google.android.exoplayer2.drm.b.a> it = this.i.elementSet().iterator();
        while (it.hasNext()) {
            ag4Var.accept(it.next());
        }
    }

    public final void o(boolean z) {
        if (this.g) {
            return;
        }
        byte[] bArr = (byte[]) wlq.j(this.t);
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.u == null || F()) {
                    D(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            rk1.e(this.u);
            rk1.e(this.t);
            if (F()) {
                D(this.u, 3, z);
                return;
            }
            return;
        }
        if (this.u == null) {
            D(bArr, 1, z);
            return;
        }
        if (this.n == 4 || F()) {
            long jP = p();
            if (this.e != 0 || jP > 60) {
                if (jP <= 0) {
                    u(new KeysExpiredException());
                    return;
                } else {
                    this.n = 4;
                    n(new ag4() { // from class: lu5
                        @Override // defpackage.ag4
                        public final void accept(Object obj) {
                            ((b.a) obj).j();
                        }
                    });
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(88);
            sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
            sb.append(jP);
            toe.b("DefaultDrmSession", sb.toString());
            D(bArr, 2, z);
        }
    }

    public final long p() {
        if (!g83.d.equals(this.l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) rk1.e(yhr.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean q(byte[] bArr) {
        return Arrays.equals(this.t, bArr);
    }

    public final boolean r() {
        int i = this.n;
        return i == 3 || i == 4;
    }

    public final void u(final Exception exc) {
        this.s = new DrmSession.DrmSessionException(exc);
        toe.d("DefaultDrmSession", "DRM session error", exc);
        n(new ag4() { // from class: ku5
            @Override // defpackage.ag4
            public final void accept(Object obj) {
                ((b.a) obj).l(exc);
            }
        });
        if (this.n != 4) {
            this.n = 1;
        }
    }

    public final void v(Object obj, Object obj2) {
        if (obj == this.v && r()) {
            this.v = null;
            if (obj2 instanceof Exception) {
                w((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    this.f7869b.f((byte[]) wlq.j(this.u), bArr);
                    n(new ag4() { // from class: mu5
                        @Override // defpackage.ag4
                        public final void accept(Object obj3) {
                            ((b.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrF = this.f7869b.f(this.t, bArr);
                int i = this.e;
                if ((i == 2 || (i == 0 && this.u != null)) && bArrF != null && bArrF.length != 0) {
                    this.u = bArrF;
                }
                this.n = 4;
                n(new ag4() { // from class: nu5
                    @Override // defpackage.ag4
                    public final void accept(Object obj3) {
                        ((b.a) obj3).h();
                    }
                });
            } catch (Exception e2) {
                w(e2);
            }
        }
    }

    public final void w(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.c.a(this);
        } else {
            u(exc);
        }
    }

    public final void x() {
        if (this.e == 0 && this.n == 4) {
            wlq.j(this.t);
            o(false);
        }
    }

    public void y(int i) {
        if (i != 2) {
            return;
        }
        x();
    }

    public void z() {
        if (C(false)) {
            o(true);
        }
    }
}
