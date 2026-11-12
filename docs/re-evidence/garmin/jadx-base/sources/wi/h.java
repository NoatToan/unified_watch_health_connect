package wi;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.room.a0;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes7.dex */
public class h<R> implements wi.f.a, Runnable, Comparable<h<?>>, rj.a.d {
    public static final ui.g<Supplier<Integer>> T = ui.g.c("glide_thread_priority_override");
    public ui.e A;
    public Object B;
    public ui.a C;
    public com.bumptech.glide.load.data.d<?> D;
    public volatile wi.f E;
    public volatile boolean F;
    public volatile boolean I;
    public boolean P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f185316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7.e<h<?>> f185317e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.d f185320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ui.e f185321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.g f185322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f185323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f185324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f185325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f185326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ui.h f185327o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f185328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f185329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f185330r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f f185331t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f185332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.e f185333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Supplier<Integer> f185334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Thread f185335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ui.e f185336z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi.g<R> f185313a = new wi.g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f185314b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rj.d.b f185315c = new rj.d.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c<?> f185318f = new c<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f185319g = new e();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f185337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f185338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f185339c;

        static {
            int[] iArr = new int[ui.c.values().length];
            f185339c = iArr;
            try {
                iArr[ui.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f185339c[ui.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[g.values().length];
            f185338b = iArr2;
            try {
                iArr2[g.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f185338b[g.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f185338b[g.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f185338b[g.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f185338b[g.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[f.values().length];
            f185337a = iArr3;
            try {
                iArr3[f.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f185337a[f.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f185337a[f.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public final class b<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ui.a f185340a;

        public b(ui.a aVar) {
            this.f185340a = aVar;
        }
    }

    public static class c<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ui.e f185342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ui.k<Z> f185343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t<Z> f185344c;
    }

    public interface d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f185345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f185346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f185347c;

        public final boolean a() {
            return (this.f185347c || this.f185346b) && this.f185345a;
        }
    }

    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public h(d dVar, k7.e<h<?>> eVar) {
        this.f185316d = dVar;
        this.f185317e = eVar;
    }

    public final <Data> u<R> a(com.bumptech.glide.load.data.d<?> dVar, Data data, ui.a aVar) {
        if (data == null) {
            dVar.cleanup();
            return null;
        }
        try {
            int i14 = qj.h.f144972a;
            SystemClock.elapsedRealtimeNanos();
            u<R> uVarF = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                uVarF.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f185323k);
                Thread.currentThread().getName();
            }
            return uVarF;
        } finally {
            dVar.cleanup();
        }
    }

    @Override // wi.f.a
    public final void b() {
        l(f.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // wi.f.a
    public final void c(ui.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, ui.a aVar) {
        dVar.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.setLoggingDetails(eVar, aVar, dVar.a());
        this.f185314b.add(glideException);
        if (Thread.currentThread() != this.f185335y) {
            l(f.SWITCH_TO_SOURCE_SERVICE);
        } else {
            n();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(h<?> hVar) {
        h<?> hVar2 = hVar;
        int iOrdinal = this.f185322j.ordinal() - hVar2.f185322j.ordinal();
        return iOrdinal == 0 ? this.f185329q - hVar2.f185329q : iOrdinal;
    }

    @Override // wi.f.a
    public final void d(ui.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, ui.a aVar, ui.e eVar2) {
        this.f185336z = eVar;
        this.B = obj;
        this.D = dVar;
        this.C = aVar;
        this.A = eVar2;
        this.P = eVar != this.f185313a.a().get(0);
        if (Thread.currentThread() != this.f185335y) {
            l(f.DECODE_DATA);
        } else {
            g();
        }
    }

    @Override // rj.a.d
    public final rj.d.b e() {
        return this.f185315c;
    }

    public final <Data> u<R> f(Data data, ui.a aVar) {
        Class<?> cls = data.getClass();
        wi.g<R> gVar = this.f185313a;
        s<Data, ?, R> sVarC = gVar.c(cls);
        ui.h hVar = this.f185327o;
        boolean z14 = aVar == ui.a.RESOURCE_DISK_CACHE || gVar.f185312r;
        ui.g<Boolean> gVar2 = dj.m.f59850i;
        Boolean bool = (Boolean) hVar.c(gVar2);
        if (bool == null || (bool.booleanValue() && !z14)) {
            hVar = new ui.h();
            qj.b bVar = this.f185327o.f171173b;
            qj.b bVar2 = hVar.f171173b;
            bVar2.h(bVar);
            bVar2.put(gVar2, Boolean.valueOf(z14));
        }
        ui.h hVar2 = hVar;
        com.bumptech.glide.load.data.e eVarG = this.f185320h.a().g(data);
        try {
            return sVarC.a(this.f185324l, this.f185325m, eVarG, hVar2, new b(aVar));
        } finally {
            eVarG.cleanup();
        }
    }

    public final void g() {
        t tVarA;
        boolean zA;
        Supplier<Integer> supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.B + ", cache key: " + this.f185336z + ", fetcher: " + this.D;
            int i14 = qj.h.f144972a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f185323k);
            ", ".concat(str);
            Thread.currentThread().getName();
        }
        t tVar = null;
        if (this.f185333w.f28487a.containsKey(com.bumptech.glide.c.d.class) && (supplier = this.f185334x) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), this.f185334x.get().intValue());
            } catch (IllegalArgumentException | SecurityException unused) {
                this.f185334x = null;
            }
        }
        try {
            tVarA = a(this.D, this.B, this.C);
        } catch (GlideException e4) {
            e4.setLoggingDetails(this.A, this.C);
            this.f185314b.add(e4);
            tVarA = null;
        }
        if (tVarA == null) {
            n();
            return;
        }
        ui.a aVar = this.C;
        boolean z14 = this.P;
        if (tVarA instanceof q) {
            ((q) tVarA).initialize();
        }
        if (this.f185318f.f185344c != null) {
            tVar = (t) t.f185444e.acquire();
            tVar.f185448d = false;
            tVar.f185447c = true;
            tVar.f185446b = tVarA;
            tVarA = tVar;
        }
        if (this.f185333w.f28487a.containsKey(com.bumptech.glide.c.d.class)) {
            m();
        }
        p();
        l<?> lVar = this.f185328p;
        synchronized (lVar) {
            lVar.f185408n = tVarA;
            lVar.f185409o = aVar;
            lVar.f185416x = z14;
        }
        synchronized (lVar) {
            try {
                lVar.f185396b.a();
                if (lVar.f185415w) {
                    lVar.f185408n.b();
                    lVar.g();
                } else {
                    if (lVar.f185395a.f185423a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (lVar.f185410p) {
                        throw new IllegalStateException("Already have resource");
                    }
                    l.c cVar = lVar.f185399e;
                    u<?> uVar = lVar.f185408n;
                    boolean z15 = lVar.f185406l;
                    n nVar = lVar.f185405k;
                    p.a aVar2 = lVar.f185397c;
                    cVar.getClass();
                    lVar.f185413t = new p<>(uVar, z15, true, nVar, aVar2);
                    lVar.f185410p = true;
                    l.e eVar = lVar.f185395a;
                    eVar.getClass();
                    l.e eVar2 = new l.e(new ArrayList(eVar.f185423a));
                    lVar.d(eVar2.f185423a.size() + 1);
                    ((k) lVar.f185400f).d(lVar, lVar.f185405k, lVar.f185413t);
                    for (l.d dVar : eVar2.f185423a) {
                        dVar.f185422b.execute(new l.b(dVar.f185421a));
                    }
                    lVar.c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f185330r = g.ENCODE;
        try {
            c<?> cVar2 = this.f185318f;
            if (cVar2.f185344c != null) {
                d dVar2 = this.f185316d;
                ui.h hVar = this.f185327o;
                cVar2.getClass();
                try {
                    ((k.c) dVar2).a().b(cVar2.f185342a, new wi.e(cVar2.f185343b, cVar2.f185344c, hVar));
                    cVar2.f185344c.c();
                } catch (Throwable th4) {
                    cVar2.f185344c.c();
                    throw th4;
                }
            }
            if (tVar != null) {
                tVar.c();
            }
            e eVar3 = this.f185319g;
            synchronized (eVar3) {
                eVar3.f185346b = true;
                zA = eVar3.a();
            }
            if (zA) {
                k();
            }
        } catch (Throwable th5) {
            if (tVar != null) {
                tVar.c();
            }
            throw th5;
        }
    }

    public final wi.f h() {
        int i14 = a.f185338b[this.f185330r.ordinal()];
        wi.g<R> gVar = this.f185313a;
        if (i14 == 1) {
            return new v(gVar, this);
        }
        if (i14 == 2) {
            return new wi.c(gVar, this);
        }
        if (i14 == 3) {
            return new z(gVar, this);
        }
        if (i14 == 4) {
            return null;
        }
        a0.s(this.f185330r, "Unrecognized stage: ");
        return null;
    }

    public final g i(g gVar) {
        int i14 = a.f185338b[gVar.ordinal()];
        if (i14 == 1) {
            return this.f185326n.a() ? g.DATA_CACHE : i(g.DATA_CACHE);
        }
        if (i14 == 2) {
            return g.SOURCE;
        }
        if (i14 == 3 || i14 == 4) {
            return g.FINISHED;
        }
        if (i14 == 5) {
            return this.f185326n.b() ? g.RESOURCE_CACHE : i(g.RESOURCE_CACHE);
        }
        com.google.firebase.messaging.l.j(gVar, "Unrecognized stage: ");
        return null;
    }

    public final void j() {
        boolean zA;
        if (this.f185333w.f28487a.containsKey(com.bumptech.glide.c.d.class)) {
            m();
        }
        p();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f185314b));
        l<?> lVar = this.f185328p;
        synchronized (lVar) {
            lVar.f185411q = glideException;
        }
        synchronized (lVar) {
            try {
                lVar.f185396b.a();
                if (lVar.f185415w) {
                    lVar.g();
                } else {
                    if (lVar.f185395a.f185423a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (lVar.f185412r) {
                        throw new IllegalStateException("Already failed once");
                    }
                    lVar.f185412r = true;
                    n nVar = lVar.f185405k;
                    l.e eVar = lVar.f185395a;
                    eVar.getClass();
                    l.e eVar2 = new l.e(new ArrayList(eVar.f185423a));
                    lVar.d(eVar2.f185423a.size() + 1);
                    ((k) lVar.f185400f).d(lVar, nVar, null);
                    for (l.d dVar : eVar2.f185423a) {
                        dVar.f185422b.execute(new l.a(dVar.f185421a));
                    }
                    lVar.c();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        e eVar3 = this.f185319g;
        synchronized (eVar3) {
            eVar3.f185347c = true;
            zA = eVar3.a();
        }
        if (zA) {
            k();
        }
    }

    public final void k() {
        e eVar = this.f185319g;
        synchronized (eVar) {
            eVar.f185346b = false;
            eVar.f185345a = false;
            eVar.f185347c = false;
        }
        c<?> cVar = this.f185318f;
        cVar.f185342a = null;
        cVar.f185343b = null;
        cVar.f185344c = null;
        wi.g<R> gVar = this.f185313a;
        gVar.f185297c = null;
        gVar.f185298d = null;
        gVar.f185308n = null;
        gVar.f185301g = null;
        gVar.f185305k = null;
        gVar.f185303i = null;
        gVar.f185309o = null;
        gVar.f185304j = null;
        gVar.f185310p = null;
        gVar.f185295a.clear();
        gVar.f185306l = false;
        gVar.f185296b.clear();
        gVar.f185307m = false;
        this.F = false;
        this.f185320h = null;
        this.f185321i = null;
        this.f185327o = null;
        this.f185322j = null;
        this.f185323k = null;
        this.f185328p = null;
        this.f185330r = null;
        this.E = null;
        this.f185335y = null;
        this.f185336z = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.I = false;
        this.f185332v = null;
        this.f185314b.clear();
        this.f185317e.a(this);
    }

    public final void l(f fVar) {
        this.f185331t = fVar;
        l lVar = this.f185328p;
        (lVar.f185407m ? lVar.f185403i : lVar.f185402h).execute(this);
    }

    public final void m() {
        if (!this.f185333w.f28487a.containsKey(com.bumptech.glide.c.d.class)) {
            vb.h.z("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier<Integer> supplier = this.f185334x;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.f185334x = null;
        }
    }

    public final void n() {
        this.f185335y = Thread.currentThread();
        int i14 = qj.h.f144972a;
        SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.I && this.E != null && !(zA = this.E.a())) {
            this.f185330r = i(this.f185330r);
            this.E = h();
            if (this.f185330r == g.SOURCE) {
                l(f.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f185330r == g.FINISHED || this.I) && !zA) {
            j();
        }
    }

    public final void o() {
        int i14 = a.f185337a[this.f185331t.ordinal()];
        if (i14 == 1) {
            this.f185330r = i(g.INITIALIZE);
            this.E = h();
            n();
        } else if (i14 == 2) {
            n();
        } else if (i14 == 3) {
            g();
        } else {
            a0.s(this.f185331t, "Unrecognized run reason: ");
        }
    }

    public final void p() {
        this.f185315c.a();
        if (this.F) {
            com.airbnb.lottie.animation.keyframe.a.x("Already notified", this.f185314b.isEmpty() ? null : (Throwable) am.j.f(1, this.f185314b));
        } else {
            this.F = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.D;
        try {
            try {
                if (this.I) {
                    j();
                    if (dVar != null) {
                        dVar.cleanup();
                        return;
                    }
                    return;
                }
                o();
                if (dVar != null) {
                    dVar.cleanup();
                }
            } catch (Throwable th3) {
                if (dVar != null) {
                    dVar.cleanup();
                }
                throw th3;
            }
        } catch (wi.b e4) {
            throw e4;
        } catch (Throwable th4) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.f185330r);
            }
            if (this.f185330r != g.ENCODE) {
                this.f185314b.add(th4);
                j();
            }
            if (!this.I) {
                throw th4;
            }
            throw th4;
        }
    }
}
