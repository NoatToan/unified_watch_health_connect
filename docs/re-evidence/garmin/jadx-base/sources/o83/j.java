package o83;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.CompositeException;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes11.dex */
public final class j<T> implements j83.e.b<T, j83.e<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f130887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f130888b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j<Object> f130889a = new j<>(false, Integer.MAX_VALUE);
    }

    public static final class b<T> extends j83.n<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f130890j = s83.c.f157956b / 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d<T> f130891e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f130892f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f130893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile s83.c f130894h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f130895i;

        public b(d<T> dVar, long j8) {
            this.f130891e = dVar;
            this.f130892f = j8;
        }

        @Override // j83.f
        public final void a() throws Throwable {
            this.f130893g = true;
            this.f130891e.k();
        }

        /* JADX WARN: Code duplicated, block: B:65:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:80:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // j83.f
        public final void c(T t7) throws Throwable {
            boolean z14;
            Queue<Object> queue;
            d<T> dVar = this.f130891e;
            long j8 = dVar.f130901h.get();
            boolean z15 = true;
            if (j8 != 0) {
                synchronized (dVar) {
                    try {
                        j8 = dVar.f130901h.get();
                        if (dVar.f130906m || j8 == 0) {
                            z14 = false;
                        } else {
                            dVar.f130906m = true;
                            z14 = true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                z14 = false;
            }
            if (!z14) {
                d.o(this, t7);
                dVar.k();
                return;
            }
            s83.c cVar = this.f130894h;
            if (cVar != null && (queue = cVar.f157957a) != null && !queue.isEmpty()) {
                d.o(this, t7);
                dVar.l();
                return;
            }
            try {
                try {
                    dVar.f130898e.c(t7);
                } catch (Throwable th4) {
                    try {
                        if (!dVar.f130899f) {
                            m83.a.b(th4);
                            f();
                            onError(th4);
                            return;
                        }
                        dVar.m().offer(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        z15 = false;
                        if (!z15) {
                            synchronized (dVar) {
                                dVar.f130906m = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j8 != Long.MAX_VALUE) {
                    dVar.f130901h.addAndGet(-1);
                }
                int i14 = this.f130895i - ((int) 1);
                if (i14 > f130890j) {
                    this.f130895i = i14;
                } else {
                    int i15 = s83.c.f157956b;
                    this.f130895i = i15;
                    int i16 = i15 - i14;
                    if (i16 > 0) {
                        h(i16);
                    }
                }
                synchronized (dVar) {
                    try {
                        if (dVar.f130907n) {
                            dVar.f130907n = false;
                            dVar.l();
                        } else {
                            dVar.f130906m = false;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                if (!z15) {
                    synchronized (dVar) {
                        dVar.f130906m = false;
                    }
                }
                throw th;
            }
        }

        @Override // j83.n
        public final void g() {
            int i14 = s83.c.f157956b;
            this.f130895i = i14;
            h(i14);
        }

        @Override // j83.f
        public final void onError(Throwable th3) throws Throwable {
            this.f130893g = true;
            this.f130891e.m().offer(th3);
            this.f130891e.k();
        }
    }

    public static final class c<T> extends AtomicLong implements j83.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<T> f130896a;

        public c(d<T> dVar) {
            this.f130896a = dVar;
        }

        @Override // j83.g
        public final void b(long j8) throws Throwable {
            long j14;
            long j15;
            if (j8 <= 0) {
                if (j8 >= 0) {
                    return;
                }
                vb.h.s("n >= 0 required");
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                do {
                    j14 = get();
                    j15 = j14 + j8;
                    if (j15 < 0) {
                        j15 = Long.MAX_VALUE;
                    }
                } while (!compareAndSet(j14, j15));
                this.f130896a.k();
            }
        }
    }

    public static final class d<T> extends j83.n<j83.e<? extends T>> {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b<?>[] f130897x = new b[0];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j83.n<? super T> f130898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f130899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f130900g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c<T> f130901h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile Queue<Object> f130902i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile y83.b f130903j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile ConcurrentLinkedQueue<Throwable> f130904k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile boolean f130905l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f130906m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f130907n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Object f130908o = new Object();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public volatile b<?>[] f130909p = f130897x;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f130910q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f130911r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f130912t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f130913v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f130914w;

        public d(j83.n<? super T> nVar, boolean z14, int i14) {
            this.f130898e = nVar;
            this.f130899f = z14;
            this.f130900g = i14;
            if (i14 == Integer.MAX_VALUE) {
                this.f130913v = Integer.MAX_VALUE;
                h(Long.MAX_VALUE);
            } else {
                this.f130913v = Math.max(1, i14 >> 1);
                h(i14);
            }
        }

        public static void o(b bVar, Object obj) throws Throwable {
            s83.c cVarA = bVar.f130894h;
            if (cVarA == null) {
                cVarA = s83.c.a();
                bVar.b(cVarA);
                bVar.f130894h = cVarA;
            }
            try {
                if (obj == null) {
                    obj = e.f130874b;
                } else {
                    e.a aVar = e.f130873a;
                }
                cVarA.b(obj);
            } catch (IllegalStateException e4) {
                if (bVar.f97758a.f157986b) {
                    return;
                }
                bVar.f();
                bVar.onError(e4);
            } catch (MissingBackpressureException e14) {
                bVar.f();
                bVar.onError(e14);
            }
        }

        @Override // j83.f
        public final void a() throws Throwable {
            this.f130905l = true;
            k();
        }

        /* JADX WARN: Code duplicated, block: B:118:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x00b7  */
        @Override // j83.f
        public final void c(Object obj) throws Throwable {
            boolean z14;
            j83.e<Object> eVar = (j83.e) obj;
            if (eVar == null) {
                return;
            }
            boolean z15 = true;
            if (eVar == o83.d.f130871a) {
                int i14 = this.f130914w + 1;
                if (i14 != this.f130913v) {
                    this.f130914w = i14;
                    return;
                } else {
                    this.f130914w = 0;
                    h(i14);
                    return;
                }
            }
            if (!(eVar instanceof s83.i)) {
                long j8 = this.f130910q;
                this.f130910q = 1 + j8;
                b<?> bVar = new b<>(this, j8);
                y83.b bVar2 = this.f130903j;
                if (bVar2 == null) {
                    synchronized (this) {
                        try {
                            bVar2 = this.f130903j;
                            if (bVar2 == null) {
                                bVar2 = new y83.b();
                                this.f130903j = bVar2;
                            } else {
                                z15 = false;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (z15) {
                        b(bVar2);
                    }
                }
                bVar2.a(bVar);
                synchronized (this.f130908o) {
                    b<?>[] bVarArr = this.f130909p;
                    int length = bVarArr.length;
                    b<?>[] bVarArr2 = new b[length + 1];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr2[length] = bVar;
                    this.f130909p = bVarArr2;
                }
                eVar.f(bVar);
                k();
                return;
            }
            T t7 = ((s83.i) eVar).f157967b;
            long j14 = this.f130901h.get();
            if (j14 != 0) {
                synchronized (this) {
                    try {
                        j14 = this.f130901h.get();
                        if (this.f130906m || j14 == 0) {
                            z14 = false;
                        } else {
                            this.f130906m = true;
                            z14 = true;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } else {
                z14 = false;
            }
            if (!z14) {
                n(t7);
                k();
                return;
            }
            Queue<Object> queue = this.f130902i;
            if (queue != null && !queue.isEmpty()) {
                n(t7);
                l();
                return;
            }
            try {
                try {
                    this.f130898e.c(t7);
                } catch (Throwable th5) {
                    try {
                        if (!this.f130899f) {
                            m83.a.b(th5);
                            f();
                            onError(th5);
                            return;
                        }
                        m().offer(th5);
                    } catch (Throwable th6) {
                        th = th6;
                        z15 = false;
                        if (!z15) {
                            synchronized (this) {
                                this.f130906m = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j14 != Long.MAX_VALUE) {
                    this.f130901h.addAndGet(-1);
                }
                int i15 = this.f130914w + 1;
                if (i15 == this.f130913v) {
                    this.f130914w = 0;
                    h(i15);
                } else {
                    this.f130914w = i15;
                }
                synchronized (this) {
                    try {
                        if (this.f130907n) {
                            this.f130907n = false;
                            l();
                        } else {
                            this.f130906m = false;
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                if (!z15) {
                    synchronized (this) {
                        this.f130906m = false;
                    }
                }
                throw th;
            }
        }

        public final boolean j() {
            if (this.f130898e.f97758a.f157986b) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f130904k;
            if (this.f130899f || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                q();
                return true;
            } finally {
                f();
            }
        }

        public final void k() throws Throwable {
            synchronized (this) {
                try {
                    if (this.f130906m) {
                        this.f130907n = true;
                    } else {
                        this.f130906m = true;
                        l();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0200 */
        /* JADX WARN: Code duplicated, block: B:101:0x0126 A[Catch: all -> 0x0129, DONT_GENERATE, TryCatch #3 {all -> 0x0129, blocks: (B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:207:0x0122, outer: #10 }] */
        /* JADX WARN: Code duplicated, block: B:105:0x012b A[Catch: all -> 0x0129, TryCatch #3 {all -> 0x0129, blocks: (B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:207:0x0122, outer: #10 }] */
        /* JADX WARN: Code duplicated, block: B:109:0x0133 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:111:0x0137  */
        /* JADX WARN: Code duplicated, block: B:112:0x0139  */
        /* JADX WARN: Code duplicated, block: B:125:0x0157 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:126:0x0159 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:128:0x0166  */
        /* JADX WARN: Code duplicated, block: B:131:0x0177 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:132:0x017a A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:134:0x0181 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:136:0x0188  */
        /* JADX WARN: Code duplicated, block: B:144:0x019f  */
        /* JADX WARN: Code duplicated, block: B:145:0x01a1 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:151:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:153:0x01b1 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:156:0x01bb A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:159:0x01c1 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:161:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:192:0x0204  */
        /* JADX WARN: Code duplicated, block: B:193:0x0205  */
        /* JADX WARN: Code duplicated, block: B:207:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:224:0x010a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:225:0x011a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:226:0x01ba A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:240:0x01c0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:241:0x01ce A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:243:0x01c6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:246:0x0120 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:247:0x0155 A[EDGE_INSN: B:247:0x0155->B:124:0x0155 BREAK  A[LOOP:6: B:90:0x0110->B:114:0x013d], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0104 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x010c A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0114 A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x011c A[Catch: all -> 0x005f, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x0121 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #10 {all -> 0x005f, blocks: (B:3:0x0002, B:4:0x0004, B:7:0x000c, B:17:0x0030, B:22:0x0040, B:39:0x006a, B:29:0x004c, B:31:0x0050, B:38:0x0063, B:51:0x00a4, B:54:0x00af, B:57:0x00b7, B:59:0x00bb, B:62:0x00c2, B:63:0x00c7, B:65:0x00ce, B:67:0x00d4, B:75:0x00e7, B:78:0x00f0, B:81:0x00f5, B:82:0x00f8, B:85:0x0104, B:88:0x010c, B:92:0x0114, B:95:0x011c, B:98:0x0121, B:109:0x0133, B:123:0x0154, B:126:0x0159, B:129:0x016e, B:131:0x0177, B:142:0x0199, B:145:0x01a1, B:147:0x01a5, B:153:0x01b1, B:156:0x01bb, B:164:0x01d0, B:167:0x01de, B:170:0x01e8, B:159:0x01c1, B:162:0x01c6, B:132:0x017a, B:134:0x0181, B:43:0x0082, B:99:0x0122, B:101:0x0126, B:105:0x012b, B:106:0x012f), top: B:219:0x0002, inners: #3 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void l() throws Throwable {
            boolean z14;
            long jAddAndGet;
            int i14;
            boolean z15;
            long j8;
            int i15;
            b<?> bVar;
            Object objPoll;
            int i16;
            boolean z16;
            s83.c cVar;
            Queue<Object> queue;
            boolean z17;
            long jAddAndGet2;
            int i17;
            int i18;
            s83.c cVar2;
            Queue<Object> queue2;
            Object obj;
            try {
                j83.n<? super T> nVar = this.f130898e;
                while (!j()) {
                    Queue<Object> queue3 = this.f130902i;
                    long j14 = this.f130901h.get();
                    boolean z18 = j14 == Long.MAX_VALUE;
                    long j15 = 0;
                    if (queue3 != null) {
                        int i19 = 0;
                        while (true) {
                            jAddAndGet = j14;
                            int i24 = 0;
                            i14 = i19;
                            Object obj2 = null;
                            while (jAddAndGet > 0) {
                                Object objPoll2 = queue3.poll();
                                if (j()) {
                                    return;
                                }
                                if (objPoll2 == null) {
                                    obj2 = objPoll2;
                                    break;
                                }
                                try {
                                    nVar.c(objPoll2 == e.f130874b ? null : objPoll2);
                                } catch (Throwable th3) {
                                    if (!this.f130899f) {
                                        m83.a.b(th3);
                                        f();
                                        nVar.onError(th3);
                                        return;
                                    }
                                    m().offer(th3);
                                }
                                i14++;
                                i24++;
                                jAddAndGet--;
                                obj2 = objPoll2;
                                th = th;
                                z14 = true;
                                if (!z14) {
                                    synchronized (this) {
                                        this.f130906m = false;
                                    }
                                }
                                throw th;
                            }
                            if (i24 > 0) {
                                jAddAndGet = z18 ? Long.MAX_VALUE : this.f130901h.addAndGet(-i24);
                            }
                            if (jAddAndGet == 0 || obj2 == null) {
                                break;
                                break;
                            } else {
                                i19 = i14;
                                z18 = z18;
                                j14 = jAddAndGet;
                            }
                        }
                    } else {
                        z18 = z18;
                        jAddAndGet = j14;
                        i14 = 0;
                    }
                    boolean z19 = this.f130905l;
                    Queue<Object> queue4 = this.f130902i;
                    b<?>[] bVarArr = this.f130909p;
                    int length = bVarArr.length;
                    if (z19 && ((queue4 == null || queue4.isEmpty()) && length == 0)) {
                        ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f130904k;
                        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                            q();
                            return;
                        }
                        nVar.a();
                        return;
                    }
                    if (length > 0) {
                        long j16 = this.f130911r;
                        int i25 = this.f130912t;
                        if (length > i25) {
                            j8 = 1;
                            if (bVarArr[i25].f130892f != j16) {
                            }
                            i15 = 0;
                            z15 = false;
                            while (true) {
                                if (i15 < length) {
                                    nVar = nVar;
                                    break;
                                }
                                if (j()) {
                                    return;
                                }
                                bVar = bVarArr[i25];
                                objPoll = null;
                                while (true) {
                                    i16 = 0;
                                    while (jAddAndGet > j15) {
                                        if (j()) {
                                            return;
                                        }
                                        cVar2 = bVar.f130894h;
                                        if (cVar2 == null) {
                                            break;
                                        }
                                        synchronized (cVar2) {
                                            try {
                                                queue2 = cVar2.f157957a;
                                                if (queue2 == null) {
                                                    objPoll = null;
                                                } else {
                                                    objPoll = queue2.poll();
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        if (objPoll == null) {
                                            break;
                                        }
                                        if (objPoll == e.f130874b) {
                                            obj = null;
                                        } else {
                                            obj = objPoll;
                                        }
                                        try {
                                            try {
                                                nVar.c(obj);
                                                jAddAndGet -= j8;
                                                i16++;
                                            } catch (Throwable th5) {
                                                m83.a.b(th5);
                                                try {
                                                    nVar.onError(th5);
                                                    return;
                                                } finally {
                                                    f();
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            z14 = true;
                                        }
                                    }
                                    if (i16 > 0) {
                                        if (z18) {
                                            jAddAndGet2 = Long.MAX_VALUE;
                                        } else {
                                            jAddAndGet2 = this.f130901h.addAndGet(-i16);
                                        }
                                        i17 = bVar.f130895i - i16;
                                        if (i17 > b.f130890j) {
                                            bVar.f130895i = i17;
                                        } else {
                                            int i26 = s83.c.f157956b;
                                            bVar.f130895i = i26;
                                            i18 = i26 - i17;
                                            if (i18 > 0) {
                                                bVar.h(i18);
                                            }
                                        }
                                        jAddAndGet = jAddAndGet2;
                                    } else {
                                        j15 = j15;
                                    }
                                    if (jAddAndGet != j15 || objPoll == null) {
                                        break;
                                        break;
                                    } else {
                                        j15 = j15;
                                        nVar = nVar;
                                    }
                                }
                                z16 = bVar.f130893g;
                                cVar = bVar.f130894h;
                                if (z16) {
                                    if (cVar == null) {
                                        p(bVar);
                                        if (j()) {
                                            return;
                                        }
                                        i14++;
                                        z15 = true;
                                    } else {
                                        queue = cVar.f157957a;
                                        if (queue != null || queue.isEmpty()) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (z17) {
                                            p(bVar);
                                            if (j()) {
                                                return;
                                            }
                                            i14++;
                                            z15 = true;
                                        }
                                    }
                                }
                                if (jAddAndGet == j15) {
                                    break;
                                }
                                i25++;
                                if (i25 == length) {
                                    i25 = 0;
                                }
                                i15++;
                                j15 = j15;
                                nVar = nVar;
                            }
                            this.f130912t = i25;
                            this.f130911r = bVarArr[i25].f130892f;
                        } else {
                            j8 = 1;
                        }
                        if (length <= i25) {
                            i25 = 0;
                        }
                        for (int i27 = 0; i27 < length && bVarArr[i25].f130892f != j16; i27++) {
                            i25++;
                            if (i25 == length) {
                                i25 = 0;
                            }
                        }
                        this.f130912t = i25;
                        this.f130911r = bVarArr[i25].f130892f;
                        i15 = 0;
                        z15 = false;
                        while (true) {
                            if (i15 < length) {
                                nVar = nVar;
                                break;
                            }
                            if (j()) {
                                return;
                            }
                            bVar = bVarArr[i25];
                            objPoll = null;
                            while (true) {
                                i16 = 0;
                                while (jAddAndGet > j15) {
                                    if (j()) {
                                        return;
                                    }
                                    cVar2 = bVar.f130894h;
                                    if (cVar2 == null) {
                                        break;
                                        break;
                                    }
                                    synchronized (cVar2) {
                                        queue2 = cVar2.f157957a;
                                        if (queue2 == null) {
                                            objPoll = null;
                                        } else {
                                            objPoll = queue2.poll();
                                        }
                                        if (objPoll == null) {
                                            break;
                                            break;
                                        }
                                        if (objPoll == e.f130874b) {
                                            obj = null;
                                        } else {
                                            obj = objPoll;
                                        }
                                        nVar.c(obj);
                                        jAddAndGet -= j8;
                                        i16++;
                                    }
                                }
                                if (i16 > 0) {
                                    if (z18) {
                                        jAddAndGet2 = this.f130901h.addAndGet(-i16);
                                    } else {
                                        jAddAndGet2 = Long.MAX_VALUE;
                                    }
                                    i17 = bVar.f130895i - i16;
                                    if (i17 > b.f130890j) {
                                        bVar.f130895i = i17;
                                    } else {
                                        int i28 = s83.c.f157956b;
                                        bVar.f130895i = i28;
                                        i18 = i28 - i17;
                                        if (i18 > 0) {
                                            bVar.h(i18);
                                        }
                                    }
                                    jAddAndGet = jAddAndGet2;
                                } else {
                                    j15 = j15;
                                }
                                if (jAddAndGet != j15) {
                                    break;
                                }
                                j15 = j15;
                                nVar = nVar;
                            }
                            z16 = bVar.f130893g;
                            cVar = bVar.f130894h;
                            if (z16) {
                                if (cVar == null) {
                                    p(bVar);
                                    if (j()) {
                                        return;
                                    }
                                    i14++;
                                    z15 = true;
                                } else {
                                    queue = cVar.f157957a;
                                    if (queue != null) {
                                        z17 = true;
                                    } else {
                                        z17 = true;
                                    }
                                    if (z17) {
                                        p(bVar);
                                        if (j()) {
                                            return;
                                        }
                                        i14++;
                                        z15 = true;
                                    }
                                }
                            }
                            if (jAddAndGet == j15) {
                                break;
                                break;
                            }
                            i25++;
                            if (i25 == length) {
                                i25 = 0;
                            }
                            i15++;
                            j15 = j15;
                            nVar = nVar;
                        }
                        this.f130912t = i25;
                        this.f130911r = bVarArr[i25].f130892f;
                    } else {
                        nVar = nVar;
                        z15 = false;
                    }
                    if (i14 > 0) {
                        h(i14);
                    }
                    if (!z15) {
                        try {
                            synchronized (this) {
                                try {
                                    if (this.f130907n) {
                                        this.f130907n = false;
                                    } else {
                                        try {
                                            this.f130906m = false;
                                            return;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z14 = true;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    z14 = false;
                                }
                                while (true) {
                                }
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    }
                    nVar = nVar;
                    if (!z14) {
                        synchronized (this) {
                            this.f130906m = false;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                z14 = false;
            }
        }

        public final ConcurrentLinkedQueue m() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue;
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue2 = this.f130904k;
            if (concurrentLinkedQueue2 != null) {
                return concurrentLinkedQueue2;
            }
            synchronized (this) {
                try {
                    concurrentLinkedQueue = this.f130904k;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.f130904k = concurrentLinkedQueue;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return concurrentLinkedQueue;
        }

        public final void n(T t7) throws Throwable {
            Object obj;
            Queue<Object> cVar;
            Queue<Object> dVar = this.f130902i;
            if (dVar == null) {
                int i14 = this.f130900g;
                if (i14 == Integer.MAX_VALUE) {
                    dVar = new t83.d<>(s83.c.f157956b);
                } else {
                    if (((i14 - 1) & i14) == 0) {
                        cVar = (rx.internal.util.unsafe.s.f154926a == null || rx.internal.util.unsafe.s.f154927b) ? new t83.b<>(i14) : new rx.internal.util.unsafe.l<>(i14);
                    } else {
                        cVar = new t83.c<>(i14);
                    }
                    dVar = cVar;
                }
                this.f130902i = dVar;
            }
            if (t7 == null) {
                obj = e.f130874b;
            } else {
                e.a aVar = e.f130873a;
                obj = t7;
            }
            if (dVar.offer(obj)) {
                return;
            }
            f();
            onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t7));
        }

        @Override // j83.f
        public final void onError(Throwable th3) throws Throwable {
            m().offer(th3);
            this.f130905l = true;
            k();
        }

        public final void p(b<T> bVar) {
            s83.c cVar = bVar.f130894h;
            if (cVar != null) {
                synchronized (cVar) {
                }
            }
            this.f130903j.b(bVar);
            synchronized (this.f130908o) {
                try {
                    b<?>[] bVarArr = this.f130909p;
                    int length = bVarArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            i14 = -1;
                            break;
                        } else if (bVar.equals(bVarArr[i14])) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (i14 < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f130909p = f130897x;
                        return;
                    }
                    b<?>[] bVarArr2 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, i14);
                    System.arraycopy(bVarArr, i14 + 1, bVarArr2, i14, (length - i14) - 1);
                    this.f130909p = bVarArr2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void q() {
            ArrayList arrayList = new ArrayList(this.f130904k);
            int size = arrayList.size();
            j83.n<? super T> nVar = this.f130898e;
            if (size == 1) {
                nVar.onError((Throwable) arrayList.get(0));
            } else {
                nVar.onError(new CompositeException(arrayList));
            }
        }
    }

    public j(boolean z14, int i14) {
        this.f130887a = z14;
        this.f130888b = i14;
    }

    @Override // n83.d
    public final Object call(Object obj) {
        j83.n nVar = (j83.n) obj;
        d dVar = new d(nVar, this.f130887a, this.f130888b);
        c<T> cVar = new c<>(dVar);
        dVar.f130901h = cVar;
        nVar.b(dVar);
        nVar.i(cVar);
        return dVar;
    }
}
