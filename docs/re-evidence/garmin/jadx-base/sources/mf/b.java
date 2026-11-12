package mf;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d53.k;
import d53.u;
import d53.w;
import dg.g;
import dg.t;
import e23.p;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;
import w63.a0;
import w63.f0;
import w63.l;
import w63.m;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0010\u0011\u0012\u0013B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lmf/b;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lw63/l;", "fileSystem", "Lw63/y;", "directory", "Lt13/g;", "cleanupCoroutineContext", "", "maxSize", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "valueCount", "<init>", "(Lw63/l;Lw63/y;Lt13/g;JII)V", "d", "b", "c", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements AutoCloseable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f118245v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f118246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f118247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f118249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f118250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f118251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f118252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f118253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u53.d f118254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f118255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f118256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f118257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a0 f118258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f118259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f118260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f118261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f118262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f118263r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f118264t;

    /* JADX INFO: renamed from: mf.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmf/b$b;", "", "Lmf/b$c;", "Lmf/b;", "entry", "<init>", "(Lmf/b;Lmf/b$c;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C2245b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f118265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f118266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f118267c;

        public C2245b(c cVar) {
            this.f118265a = cVar;
            this.f118267c = new boolean[b.this.f118249d];
        }

        public final void a(boolean z14) {
            b bVar = b.this;
            synchronized (bVar.f118255j) {
                try {
                    if (this.f118266b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (s.g(this.f118265a.f118275g, this)) {
                        b.a(bVar, this, z14);
                    }
                    this.f118266b = true;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final y b(int i14) {
            y yVar;
            b bVar = b.this;
            synchronized (bVar.f118255j) {
                if (this.f118266b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f118267c[i14] = true;
                y yVar2 = this.f118265a.f118272d.get(i14);
                g.a(bVar.f118264t, yVar2);
                yVar = yVar2;
            }
            return yVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmf/b$c;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Lmf/b;Ljava/lang/String;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f118269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f118270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList<y> f118271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList<y> f118272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f118273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f118274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C2245b f118275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f118276h;

        public c(String str) {
            this.f118269a = str;
            this.f118270b = new long[b.this.f118249d];
            this.f118271c = new ArrayList<>(b.this.f118249d);
            this.f118272d = new ArrayList<>(b.this.f118249d);
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append('.');
            int length = sb3.length();
            int i14 = b.this.f118249d;
            for (int i15 = 0; i15 < i14; i15++) {
                sb3.append(i15);
                this.f118271c.add(b.this.f118246a.e(sb3.toString()));
                sb3.append(".tmp");
                this.f118272d.add(b.this.f118246a.e(sb3.toString()));
                sb3.setLength(length);
            }
        }

        public final d a() {
            if (!this.f118273e || this.f118275g != null || this.f118274f) {
                return null;
            }
            ArrayList<y> arrayList = this.f118271c;
            int size = arrayList.size();
            int i14 = 0;
            while (true) {
                b bVar = b.this;
                if (i14 >= size) {
                    this.f118276h++;
                    return bVar.new d(this);
                }
                if (!bVar.f118264t.k(arrayList.get(i14))) {
                    try {
                        bVar.s(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i14++;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmf/b$d;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lmf/b$c;", "Lmf/b;", "entry", "<init>", "(Lmf/b;Lmf/b$c;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class d implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f118278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f118279b;

        public d(c cVar) {
            this.f118278a = cVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.f118279b) {
                return;
            }
            this.f118279b = true;
            b bVar = b.this;
            synchronized (bVar.f118255j) {
                try {
                    c cVar = this.f118278a;
                    int i14 = cVar.f118276h - 1;
                    cVar.f118276h = i14;
                    if (i14 == 0 && cVar.f118274f) {
                        bVar.s(cVar);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"mf/b$e", "Lw63/m;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends m {
        public e(l lVar) {
            super(lVar);
        }

        @Override // w63.m, w63.l
        public final f0 v(y yVar, boolean z14) {
            y yVarC = yVar.c();
            if (yVarC != null) {
                p13.k kVar = new p13.k();
                while (yVarC != null && !k(yVarC)) {
                    kVar.addFirst(yVarC);
                    yVarC = yVarC.c();
                }
                Iterator<E> it = kVar.iterator();
                while (it.hasNext()) {
                    e((y) it.next());
                }
            }
            return this.f183389c.v(yVar, z14);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    public static final class f extends i implements p<b0, t13.d<? super Unit>, Object> {
        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b bVar = b.this;
            synchronized (bVar.f118255j) {
                if (!bVar.f118260o || bVar.f118261p) {
                    return Unit.INSTANCE;
                }
                try {
                    bVar.v();
                } catch (IOException unused) {
                    bVar.f118262q = true;
                }
                try {
                    if (bVar.f118257l >= 2000) {
                        bVar.x();
                    }
                } catch (IOException unused2) {
                    bVar.f118263r = true;
                    bVar.f118258m = new a0(new w63.d());
                }
                return Unit.INSTANCE;
            }
        }
    }

    static {
        new a(null);
        f118245v = new k("[a-z0-9_-]{1,120}");
    }

    public b(l lVar, y yVar, t13.g gVar, long j8, int i14, int i15) {
        this.f118246a = yVar;
        this.f118247b = j8;
        this.f118248c = i14;
        this.f118249d = i15;
        if (j8 <= 0) {
            h.s("maxSize <= 0");
            throw null;
        }
        if (i15 <= 0) {
            h.s("valueCount <= 0");
            throw null;
        }
        this.f118250e = yVar.e("journal");
        this.f118251f = yVar.e("journal.tmp");
        this.f118252g = yVar.e("journal.bkp");
        this.f118253h = new LinkedHashMap(0, 0.75f, true);
        t13.g gVarPlus = gVar.plus(ge1.b.h());
        t.a aVar = t.f59501a;
        z zVar = (z) gVar.get(z.INSTANCE);
        if (zVar == null) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this.f118254i = c0.a(gVarPlus.plus(z.limitedParallelism$default(zVar, 1, null, 2, null)));
        this.f118255j = new Object();
        this.f118264t = new e(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0110 A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0010, B:10:0x0014, B:12:0x0019, B:14:0x001f, B:16:0x002f, B:22:0x003a, B:24:0x003f, B:27:0x0059, B:29:0x0068, B:31:0x0076, B:33:0x007d, B:28:0x005d, B:37:0x009f, B:39:0x00a6, B:42:0x00ab, B:44:0x00bc, B:47:0x00c1, B:52:0x00fc, B:54:0x0107, B:59:0x0113, B:58:0x0110, B:48:0x00d9, B:50:0x00ee, B:51:0x00f9, B:34:0x008a, B:36:0x008f, B:62:0x0117, B:63:0x011e), top: B:66:0x0003 }] */
    public static final void a(b bVar, C2245b c2245b, boolean z14) {
        synchronized (bVar.f118255j) {
            c cVar = c2245b.f118265a;
            if (!s.g(cVar.f118275g, c2245b)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z14 || cVar.f118274f) {
                int i14 = bVar.f118249d;
                for (int i15 = 0; i15 < i14; i15++) {
                    bVar.f118264t.j(cVar.f118272d.get(i15));
                }
            } else {
                int i16 = bVar.f118249d;
                for (int i17 = 0; i17 < i16; i17++) {
                    if (c2245b.f118267c[i17] && !bVar.f118264t.k(cVar.f118272d.get(i17))) {
                        c2245b.a(false);
                        return;
                    }
                }
                int i18 = bVar.f118249d;
                for (int i19 = 0; i19 < i18; i19++) {
                    y yVar = cVar.f118272d.get(i19);
                    y yVar2 = cVar.f118271c.get(i19);
                    boolean zK = bVar.f118264t.k(yVar);
                    e eVar = bVar.f118264t;
                    if (zK) {
                        eVar.c(yVar, yVar2);
                    } else {
                        g.a(eVar, cVar.f118271c.get(i19));
                    }
                    long j8 = cVar.f118270b[i19];
                    Long l14 = bVar.f118264t.n(yVar2).f183382d;
                    long jLongValue = l14 != null ? l14.longValue() : 0L;
                    cVar.f118270b[i19] = jLongValue;
                    bVar.f118256k = (bVar.f118256k - j8) + jLongValue;
                }
            }
            cVar.f118275g = null;
            if (cVar.f118274f) {
                bVar.s(cVar);
                return;
            }
            bVar.f118257l++;
            a0 a0Var = bVar.f118258m;
            a0Var.getClass();
            if (z14 || cVar.f118273e) {
                cVar.f118273e = true;
                a0Var.h1("CLEAN");
                a0Var.writeByte(32);
                a0Var.h1(cVar.f118269a);
                for (long j14 : cVar.f118270b) {
                    a0Var.writeByte(32);
                    a0Var.e0(j14);
                }
                a0Var.writeByte(10);
            } else {
                bVar.f118253h.remove(cVar.f118269a);
                a0Var.h1("REMOVE");
                a0Var.writeByte(32);
                a0Var.h1(cVar.f118269a);
                a0Var.writeByte(10);
            }
            a0Var.flush();
            if (bVar.f118256k > bVar.f118247b) {
                bVar.j();
            } else if (bVar.f118257l >= 2000) {
                bVar.j();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void w(String str) {
        if (f118245v.d(str)) {
            return;
        }
        h.x(o2.c.c(CoreConstants.DOUBLE_QUOTE_CHAR, "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final C2245b c(String str) {
        synchronized (this.f118255j) {
            if (this.f118261p) {
                throw new IllegalStateException("cache is closed");
            }
            w(str);
            f();
            c cVar = (c) this.f118253h.get(str);
            if ((cVar != null ? cVar.f118275g : null) != null) {
                return null;
            }
            if (cVar != null && cVar.f118276h != 0) {
                return null;
            }
            if (!this.f118262q && !this.f118263r) {
                a0 a0Var = this.f118258m;
                a0Var.getClass();
                a0Var.h1("DIRTY");
                a0Var.writeByte(32);
                a0Var.h1(str);
                a0Var.writeByte(10);
                a0Var.flush();
                if (this.f118259n) {
                    return null;
                }
                if (cVar == null) {
                    cVar = new c(str);
                    this.f118253h.put(str, cVar);
                }
                C2245b c2245b = new C2245b(cVar);
                cVar.f118275g = c2245b;
                return c2245b;
            }
            j();
            return null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f118255j) {
            try {
                if (this.f118260o && !this.f118261p) {
                    for (c cVar : (c[]) this.f118253h.values().toArray(new c[0])) {
                        C2245b c2245b = cVar.f118275g;
                        if (c2245b != null) {
                            c cVar2 = c2245b.f118265a;
                            if (s.g(cVar2.f118275g, c2245b)) {
                                cVar2.f118274f = true;
                            }
                        }
                    }
                    v();
                    c0.c(this.f118254i, null);
                    a0 a0Var = this.f118258m;
                    a0Var.getClass();
                    a0Var.close();
                    this.f118258m = null;
                    this.f118261p = true;
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                this.f118261p = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final d e(String str) {
        d dVarA;
        synchronized (this.f118255j) {
            if (this.f118261p) {
                throw new IllegalStateException("cache is closed");
            }
            w(str);
            f();
            c cVar = (c) this.f118253h.get(str);
            if (cVar != null && (dVarA = cVar.a()) != null) {
                boolean z14 = true;
                this.f118257l++;
                a0 a0Var = this.f118258m;
                a0Var.getClass();
                a0Var.h1("READ");
                a0Var.writeByte(32);
                a0Var.h1(str);
                a0Var.writeByte(10);
                a0Var.flush();
                if (this.f118257l < 2000) {
                    z14 = false;
                }
                if (z14) {
                    j();
                }
                return dVarA;
            }
            return null;
        }
    }

    public final void f() {
        synchronized (this.f118255j) {
            try {
                if (this.f118260o) {
                    return;
                }
                this.f118264t.j(this.f118251f);
                if (this.f118264t.k(this.f118252g)) {
                    boolean zK = this.f118264t.k(this.f118250e);
                    e eVar = this.f118264t;
                    y yVar = this.f118252g;
                    if (zK) {
                        eVar.j(yVar);
                    } else {
                        eVar.c(yVar, this.f118250e);
                    }
                }
                if (this.f118264t.k(this.f118250e)) {
                    try {
                        n();
                        l();
                        this.f118260o = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            g.b(this.f118264t, this.f118246a);
                            this.f118261p = false;
                            x();
                            this.f118260o = true;
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            this.f118261p = false;
                            throw th3;
                        }
                    }
                }
                x();
                this.f118260o = true;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void j() {
        ge1.b.T(this.f118254i, null, null, new f(null), 3);
    }

    public final a0 k() {
        e eVar = this.f118264t;
        eVar.getClass();
        y yVar = this.f118250e;
        yVar.getClass();
        return new a0(new mf.c(eVar.f183389c.a(yVar), new kp2.a(this, 28)));
    }

    public final void l() {
        Iterator it = this.f118253h.values().iterator();
        long j8 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            C2245b c2245b = cVar.f118275g;
            int i14 = this.f118249d;
            int i15 = 0;
            if (c2245b == null) {
                while (i15 < i14) {
                    j8 += cVar.f118270b[i15];
                    i15++;
                }
            } else {
                cVar.f118275g = null;
                while (i15 < i14) {
                    y yVar = cVar.f118271c.get(i15);
                    e eVar = this.f118264t;
                    eVar.j(yVar);
                    eVar.j(cVar.f118272d.get(i15));
                    i15++;
                }
                it.remove();
            }
        }
        this.f118256k = j8;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    public final void n() throws Throwable {
        w63.b0 b0VarD = w5.r.d(this.f118264t.w(this.f118250e));
        try {
            String strC1 = b0VarD.c1(Long.MAX_VALUE);
            String strC2 = b0VarD.c1(Long.MAX_VALUE);
            String strC3 = b0VarD.c1(Long.MAX_VALUE);
            String strC4 = b0VarD.c1(Long.MAX_VALUE);
            String strC5 = b0VarD.c1(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strC1) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strC2) || !s.g(String.valueOf(this.f118248c), strC3) || !s.g(String.valueOf(this.f118249d), strC4) || strC5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strC1 + ", " + strC2 + ", " + strC3 + ", " + strC4 + ", " + strC5 + ']');
            }
            int i14 = 0;
            while (true) {
                try {
                    p(b0VarD.c1(Long.MAX_VALUE));
                    i14++;
                } catch (EOFException unused) {
                    this.f118257l = i14 - this.f118253h.size();
                    if (b0VarD.F1()) {
                        this.f118258m = k();
                    } else {
                        x();
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        b0VarD.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                b0VarD.close();
            } catch (Throwable th5) {
                o13.g.a(th, th5);
            }
            if (th == null) {
                throw th;
            }
        }
    }

    public final void p(String str) throws IOException {
        String strSubstring;
        int iG = w.G(' ', 0, 6, str);
        if (iG == -1) {
            h.C("unexpected journal line: ".concat(str));
            return;
        }
        int i14 = iG + 1;
        int iG2 = w.G(' ', i14, 4, str);
        LinkedHashMap linkedHashMap = this.f118253h;
        if (iG2 == -1) {
            strSubstring = str.substring(i14);
            if (iG == 6 && u.y(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i14, iG2);
        }
        Object cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        c cVar2 = (c) cVar;
        if (iG2 == -1 || iG != 5 || !u.y(str, "CLEAN", false)) {
            if (iG2 == -1 && iG == 5 && u.y(str, "DIRTY", false)) {
                cVar2.f118275g = new C2245b(cVar2);
                return;
            } else {
                if (iG2 == -1 && iG == 4 && u.y(str, "READ", false)) {
                    return;
                }
                h.C("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listX = w.X(str.substring(iG2 + 1), new char[]{' '});
        cVar2.f118273e = true;
        cVar2.f118275g = null;
        if (listX.size() != b.this.f118249d) {
            h.B(listX, "unexpected journal line: ");
            return;
        }
        try {
            int size = listX.size();
            for (int i15 = 0; i15 < size; i15++) {
                cVar2.f118270b[i15] = Long.parseLong((String) listX.get(i15));
            }
        } catch (NumberFormatException unused) {
            h.B(listX, "unexpected journal line: ");
        }
    }

    public final void s(c cVar) {
        a0 a0Var;
        int i14 = cVar.f118276h;
        String str = cVar.f118269a;
        if (i14 > 0 && (a0Var = this.f118258m) != null) {
            a0Var.h1("DIRTY");
            a0Var.writeByte(32);
            a0Var.h1(str);
            a0Var.writeByte(10);
            a0Var.flush();
        }
        if (cVar.f118276h > 0 || cVar.f118275g != null) {
            cVar.f118274f = true;
            return;
        }
        for (int i15 = 0; i15 < this.f118249d; i15++) {
            this.f118264t.j(cVar.f118271c.get(i15));
            long j8 = this.f118256k;
            long[] jArr = cVar.f118270b;
            this.f118256k = j8 - jArr[i15];
            jArr[i15] = 0;
        }
        this.f118257l++;
        a0 a0Var2 = this.f118258m;
        if (a0Var2 != null) {
            a0Var2.h1("REMOVE");
            a0Var2.writeByte(32);
            a0Var2.h1(str);
            a0Var2.writeByte(10);
            a0Var2.flush();
        }
        this.f118253h.remove(str);
        if (this.f118257l >= 2000) {
            j();
        }
    }

    public final void v() {
        while (this.f118256k > this.f118247b) {
            for (c cVar : this.f118253h.values()) {
                if (!cVar.f118274f) {
                    s(cVar);
                }
            }
            return;
        }
        this.f118262q = false;
    }

    public final void x() {
        Throwable th3;
        synchronized (this.f118255j) {
            try {
                a0 a0Var = this.f118258m;
                if (a0Var != null) {
                    a0Var.close();
                }
                a0 a0VarC = w5.r.c(this.f118264t.v(this.f118251f, false));
                try {
                    a0VarC.h1("libcore.io.DiskLruCache");
                    a0VarC.writeByte(10);
                    a0VarC.h1(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    a0VarC.writeByte(10);
                    a0VarC.e0(this.f118248c);
                    a0VarC.writeByte(10);
                    a0VarC.e0(this.f118249d);
                    a0VarC.writeByte(10);
                    a0VarC.writeByte(10);
                    for (c cVar : this.f118253h.values()) {
                        if (cVar.f118275g != null) {
                            a0VarC.h1("DIRTY");
                            a0VarC.writeByte(32);
                            a0VarC.h1(cVar.f118269a);
                            a0VarC.writeByte(10);
                        } else {
                            a0VarC.h1("CLEAN");
                            a0VarC.writeByte(32);
                            a0VarC.h1(cVar.f118269a);
                            for (long j8 : cVar.f118270b) {
                                a0VarC.writeByte(32);
                                a0VarC.e0(j8);
                            }
                            a0VarC.writeByte(10);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    try {
                        a0VarC.close();
                        th3 = null;
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        a0VarC.close();
                    } catch (Throwable th6) {
                        o13.g.a(th5, th6);
                    }
                    th3 = th5;
                }
                if (th3 != null) {
                    throw th3;
                }
                boolean zK = this.f118264t.k(this.f118250e);
                e eVar = this.f118264t;
                if (zK) {
                    eVar.c(this.f118250e, this.f118252g);
                    this.f118264t.c(this.f118251f, this.f118250e);
                    this.f118264t.j(this.f118252g);
                } else {
                    eVar.c(this.f118251f, this.f118250e);
                }
                this.f118258m = k();
                this.f118257l = 0;
                this.f118259n = false;
                this.f118263r = false;
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmf/b$a;", "", "<init>", "()V", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "REMOVE", "READ", "Ld53/k;", "LEGAL_KEY_PATTERN", "Ld53/k;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
