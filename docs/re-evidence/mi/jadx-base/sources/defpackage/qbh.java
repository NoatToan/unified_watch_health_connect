package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class qbh<T> extends qe4<T> implements koo {
    public static final yta e = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4h<? extends T> f31326b;
    public final AtomicReference<i<T>> c;
    public final yta<? extends h<T>> d;

    public static class a implements yta {
        @Override // defpackage.yta, java.util.concurrent.Callable
        public Object call() {
            return new l(16);
        }
    }

    public static class b implements yta<h<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31327a;

        public b(int i) {
            this.f31327a = i;
        }

        @Override // defpackage.yta, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<T> call() {
            return new k(this.f31327a);
        }
    }

    public static class c implements yta<h<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f31329b;
        public final /* synthetic */ ifl c;

        public c(int i, long j, ifl iflVar) {
            this.f31328a = i;
            this.f31329b = j;
            this.c = iflVar;
        }

        @Override // defpackage.yta, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h<T> call() {
            return new j(this.f31328a, this.f31329b, this.c);
        }
    }

    public static class d implements p4h.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f31330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ yta f31331b;

        public d(AtomicReference atomicReference, yta ytaVar) {
            this.f31330a = atomicReference;
            this.f31331b = ytaVar;
        }

        @Override // defpackage.tc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(xno<? super T> xnoVar) {
            i iVar;
            i iVar2;
            do {
                iVar = (i) this.f31330a.get();
                if (iVar == null) {
                    iVar2 = new i((h) this.f31331b.call());
                    iVar2.c();
                }
                f<T> fVar = new f<>(iVar, xnoVar);
                iVar.a(fVar);
                xnoVar.add(fVar);
                iVar.c.f(fVar);
                xnoVar.setProducer(fVar);
            } while (!d8i.a(this.f31330a, iVar, iVar2));
            iVar = iVar2;
            f<T> fVar2 = new f<>(iVar, xnoVar);
            iVar.a(fVar2);
            xnoVar.add(fVar2);
            iVar.c.f(fVar2);
            xnoVar.setProducer(fVar2);
        }
    }

    public static class e<T> extends AtomicReference<g> implements h<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f31332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31333b;
        public long c;

        public e() {
            g gVar = new g(null, 0L);
            this.f31332a = gVar;
            set(gVar);
        }

        public final void a(g gVar) {
            this.f31332a.set(gVar);
            this.f31332a = gVar;
            this.f31333b++;
        }

        public Object b(Object obj) {
            return obj;
        }

        public g c() {
            return get();
        }

        @Override // qbh.h
        public final void complete() {
            Object objB = b(bxg.b());
            long j = this.c + 1;
            this.c = j;
            a(new g(objB, j));
            j();
        }

        public Object d(Object obj) {
            return obj;
        }

        @Override // qbh.h
        public final void e(T t) {
            Object objB = b(bxg.g(t));
            long j = this.c + 1;
            this.c = j;
            a(new g(objB, j));
            i();
        }

        @Override // qbh.h
        public final void error(Throwable th) {
            Object objB = b(bxg.c(th));
            long j = this.c + 1;
            this.c = j;
            a(new g(objB, j));
            j();
        }

        @Override // qbh.h
        public final void f(f<T> fVar) {
            xno<? super T> xnoVar;
            g gVar;
            synchronized (fVar) {
                try {
                    if (fVar.e) {
                        fVar.f = true;
                        return;
                    }
                    fVar.e = true;
                    while (!fVar.isUnsubscribed()) {
                        g gVarC = (g) fVar.b();
                        if (gVarC == null) {
                            gVarC = c();
                            fVar.c = gVarC;
                            fVar.a(gVarC.f31337b);
                        }
                        if (fVar.isUnsubscribed() || (xnoVar = fVar.f31335b) == null) {
                            return;
                        }
                        long j = fVar.get();
                        long j2 = 0;
                        while (j2 != j && (gVar = gVarC.get()) != null) {
                            Object objD = d(gVar.f31336a);
                            try {
                                if (bxg.a(xnoVar, objD)) {
                                    fVar.c = null;
                                    return;
                                }
                                j2++;
                                if (fVar.isUnsubscribed()) {
                                    return;
                                } else {
                                    gVarC = gVar;
                                }
                            } catch (Throwable th) {
                                fVar.c = null;
                                pf8.d(th);
                                fVar.unsubscribe();
                                if (bxg.f(objD) || bxg.e(objD)) {
                                    return;
                                }
                                xnoVar.onError(OnErrorThrowable.addValueAsLastCause(th, bxg.d(objD)));
                                return;
                            }
                        }
                        if (j2 != 0) {
                            fVar.c = gVarC;
                            if (j != Long.MAX_VALUE) {
                                fVar.c(j2);
                            }
                        }
                        synchronized (fVar) {
                            try {
                                if (!fVar.f) {
                                    fVar.e = false;
                                    return;
                                }
                                fVar.f = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final void g() {
            g gVar = get().get();
            if (gVar == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f31333b--;
            h(gVar);
        }

        public final void h(g gVar) {
            set(gVar);
        }

        public void i() {
            throw null;
        }

        public void j() {
        }
    }

    public static final class f<T> extends AtomicLong implements cbi, koo {
        private static final long serialVersionUID = -4453897557930727610L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i<T> f31334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public xno<? super T> f31335b;
        public Object c;
        public final AtomicLong d = new AtomicLong();
        public boolean e;
        public boolean f;

        public f(i<T> iVar, xno<? super T> xnoVar) {
            this.f31334a = iVar;
            this.f31335b = xnoVar;
        }

        public void a(long j) {
            long j2;
            long j3;
            do {
                j2 = this.d.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!this.d.compareAndSet(j2, j3));
        }

        public <U> U b() {
            return (U) this.c;
        }

        public long c(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j3 = j2 - j;
                if (j3 < 0) {
                    throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // defpackage.cbi
        public void request(long j) {
            long j2;
            long j3;
            if (j < 0) {
                return;
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
                if (j2 >= 0 && j == 0) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j2, j3));
            a(j);
            this.f31334a.e(this);
            this.f31334a.c.f(this);
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f31334a.f(this);
            this.f31334a.e(this);
            this.f31335b = null;
        }
    }

    public static final class g extends AtomicReference<g> {
        private static final long serialVersionUID = 245354315435971818L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f31336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f31337b;

        public g(Object obj, long j) {
            this.f31336a = obj;
            this.f31337b = j;
        }
    }

    public interface h<T> {
        void complete();

        void e(T t);

        void error(Throwable th);

        void f(f<T> fVar);
    }

    public static final class i<T> extends xno<T> implements koo {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final f[] f31338r = new f[0];
        public static final f[] s = new f[0];
        public final h<T> c;
        public boolean d;
        public volatile boolean e;
        public volatile long h;
        public long i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f31339k;
        public boolean l;
        public long m;
        public long n;
        public volatile cbi o;
        public List<f<T>> p;
        public boolean q;
        public final abh<f<T>> f = new abh<>();
        public f<T>[] g = f31338r;
        public final AtomicBoolean j = new AtomicBoolean();

        public class a implements sc0 {
            public a() {
            }

            @Override // defpackage.sc0
            public void call() {
                if (i.this.e) {
                    return;
                }
                synchronized (i.this.f) {
                    try {
                        if (!i.this.e) {
                            i.this.f.g();
                            i.this.h++;
                            i.this.e = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public i(h<T> hVar) {
            this.c = hVar;
            request(0L);
        }

        public boolean a(f<T> fVar) {
            fVar.getClass();
            if (this.e) {
                return false;
            }
            synchronized (this.f) {
                try {
                    if (this.e) {
                        return false;
                    }
                    this.f.a(fVar);
                    this.h++;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public f<T>[] b() {
            f<T>[] fVarArr;
            synchronized (this.f) {
                f<T>[] fVarArrH = this.f.h();
                int length = fVarArrH.length;
                fVarArr = new f[length];
                System.arraycopy(fVarArrH, 0, fVarArr, 0, length);
            }
            return fVarArr;
        }

        public void c() {
            add(noo.a(new a()));
        }

        public void d(long j, long j2) {
            long j3 = this.n;
            cbi cbiVar = this.o;
            long j4 = j - j2;
            if (j4 == 0) {
                if (j3 == 0 || cbiVar == null) {
                    return;
                }
                this.n = 0L;
                cbiVar.request(j3);
                return;
            }
            this.m = j;
            if (cbiVar == null) {
                long j5 = j3 + j4;
                if (j5 < 0) {
                    j5 = Long.MAX_VALUE;
                }
                this.n = j5;
                return;
            }
            if (j3 == 0) {
                cbiVar.request(j4);
            } else {
                this.n = 0L;
                cbiVar.request(j3 + j4);
            }
        }

        public void e(f<T> fVar) {
            long jMax;
            List<f<T>> list;
            boolean z;
            long jMax2;
            if (isUnsubscribed()) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f31339k) {
                        if (fVar != null) {
                            List arrayList = this.p;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                this.p = arrayList;
                            }
                            arrayList.add(fVar);
                        } else {
                            this.q = true;
                        }
                        this.l = true;
                        return;
                    }
                    this.f31339k = true;
                    long j = this.m;
                    if (fVar != null) {
                        jMax = Math.max(j, fVar.d.get());
                    } else {
                        long jMax3 = j;
                        for (f<T> fVar2 : b()) {
                            if (fVar2 != null) {
                                jMax3 = Math.max(jMax3, fVar2.d.get());
                            }
                        }
                        jMax = jMax3;
                    }
                    d(jMax, j);
                    while (!isUnsubscribed()) {
                        synchronized (this) {
                            try {
                                if (!this.l) {
                                    this.f31339k = false;
                                    return;
                                }
                                this.l = false;
                                list = this.p;
                                this.p = null;
                                z = this.q;
                                this.q = false;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        long j2 = this.m;
                        if (list != null) {
                            Iterator<f<T>> it = list.iterator();
                            jMax2 = j2;
                            while (it.hasNext()) {
                                jMax2 = Math.max(jMax2, it.next().d.get());
                            }
                        } else {
                            jMax2 = j2;
                        }
                        if (z) {
                            for (f<T> fVar3 : b()) {
                                if (fVar3 != null) {
                                    jMax2 = Math.max(jMax2, fVar3.d.get());
                                }
                            }
                        }
                        d(jMax2, j2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(f<T> fVar) {
            if (this.e) {
                return;
            }
            synchronized (this.f) {
                try {
                    if (this.e) {
                        return;
                    }
                    this.f.e(fVar);
                    if (this.f.b()) {
                        this.g = f31338r;
                    }
                    this.h++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g() {
            f<T>[] fVarArr = this.g;
            if (this.i != this.h) {
                synchronized (this.f) {
                    try {
                        fVarArr = this.g;
                        f<T>[] fVarArrH = this.f.h();
                        int length = fVarArrH.length;
                        if (fVarArr.length != length) {
                            fVarArr = new f[length];
                            this.g = fVarArr;
                        }
                        System.arraycopy(fVarArrH, 0, fVarArr, 0, length);
                        this.i = this.h;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            h<T> hVar = this.c;
            for (f<T> fVar : fVarArr) {
                if (fVar != null) {
                    hVar.f(fVar);
                }
            }
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            if (this.d) {
                return;
            }
            this.d = true;
            try {
                this.c.complete();
                g();
            } finally {
                unsubscribe();
            }
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            if (this.d) {
                return;
            }
            this.d = true;
            try {
                this.c.error(th);
                g();
            } finally {
                unsubscribe();
            }
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            if (this.d) {
                return;
            }
            this.c.e(t);
            g();
        }

        @Override // defpackage.xno
        public void setProducer(cbi cbiVar) {
            if (this.o != null) {
                throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
            }
            this.o = cbiVar;
            e(null);
            g();
        }
    }

    public static final class j<T> extends e<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final ifl d;
        public final long e;
        public final int f;

        public j(int i, long j, ifl iflVar) {
            this.d = iflVar;
            this.f = i;
            this.e = j;
        }

        @Override // qbh.e
        public Object b(Object obj) {
            return new tfp(this.d.b(), obj);
        }

        @Override // qbh.e
        public g c() {
            g gVar;
            long jB = this.d.b() - this.e;
            g gVar2 = get();
            g gVar3 = gVar2.get();
            while (true) {
                g gVar4 = gVar3;
                gVar = gVar2;
                gVar2 = gVar4;
                if (gVar2 == null) {
                    break;
                }
                Object obj = gVar2.f31336a;
                Object objD = d(obj);
                if (bxg.e(objD) || bxg.f(objD) || ((tfp) obj).a() > jB) {
                    break;
                }
                gVar3 = gVar2.get();
            }
            return gVar;
        }

        @Override // qbh.e
        public Object d(Object obj) {
            return ((tfp) obj).b();
        }

        @Override // qbh.e
        public void i() {
            g gVar;
            long jB = this.d.b() - this.e;
            g gVar2 = get();
            g gVar3 = gVar2.get();
            int i = 0;
            while (true) {
                g gVar4 = gVar3;
                gVar = gVar2;
                gVar2 = gVar4;
                if (gVar2 != null) {
                    int i2 = this.f31333b;
                    if (i2 <= this.f) {
                        if (((tfp) gVar2.f31336a).a() > jB) {
                            break;
                        }
                        i++;
                        this.f31333b--;
                        gVar3 = gVar2.get();
                    } else {
                        i++;
                        this.f31333b = i2 - 1;
                        gVar3 = gVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                h(gVar);
            }
        }

        @Override // qbh.e
        public void j() {
            g gVar;
            long jB = this.d.b() - this.e;
            g gVar2 = get();
            g gVar3 = gVar2.get();
            int i = 0;
            while (true) {
                g gVar4 = gVar3;
                gVar = gVar2;
                gVar2 = gVar4;
                if (gVar2 == null || this.f31333b <= 1 || ((tfp) gVar2.f31336a).a() > jB) {
                    break;
                }
                i++;
                this.f31333b--;
                gVar3 = gVar2.get();
            }
            if (i != 0) {
                h(gVar);
            }
        }
    }

    public static final class k<T> extends e<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int d;

        public k(int i) {
            this.d = i;
        }

        @Override // qbh.e
        public void i() {
            if (this.f31333b > this.d) {
                g();
            }
        }
    }

    public static final class l<T> extends ArrayList<Object> implements h<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile int f31341a;

        public l(int i) {
            super(i);
        }

        @Override // qbh.h
        public void complete() {
            add(bxg.b());
            this.f31341a++;
        }

        @Override // qbh.h
        public void e(T t) {
            add(bxg.g(t));
            this.f31341a++;
        }

        @Override // qbh.h
        public void error(Throwable th) {
            add(bxg.c(th));
            this.f31341a++;
        }

        @Override // qbh.h
        public void f(f<T> fVar) {
            synchronized (fVar) {
                try {
                    if (fVar.e) {
                        fVar.f = true;
                        return;
                    }
                    fVar.e = true;
                    while (!fVar.isUnsubscribed()) {
                        int i = this.f31341a;
                        Integer num = (Integer) fVar.b();
                        int iIntValue = num != null ? num.intValue() : 0;
                        xno<? super T> xnoVar = fVar.f31335b;
                        if (xnoVar == null) {
                            return;
                        }
                        long j = fVar.get();
                        long j2 = 0;
                        while (j2 != j && iIntValue < i) {
                            Object obj = get(iIntValue);
                            try {
                                if (bxg.a(xnoVar, obj) || fVar.isUnsubscribed()) {
                                    return;
                                }
                                iIntValue++;
                                j2++;
                            } catch (Throwable th) {
                                pf8.d(th);
                                fVar.unsubscribe();
                                if (bxg.f(obj) || bxg.e(obj)) {
                                    return;
                                }
                                xnoVar.onError(OnErrorThrowable.addValueAsLastCause(th, bxg.d(obj)));
                                return;
                            }
                        }
                        if (j2 != 0) {
                            fVar.c = Integer.valueOf(iIntValue);
                            if (j != Long.MAX_VALUE) {
                                fVar.c(j2);
                            }
                        }
                        synchronized (fVar) {
                            try {
                                if (!fVar.f) {
                                    fVar.e = false;
                                    return;
                                }
                                fVar.f = false;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public qbh(p4h.a<T> aVar, p4h<? extends T> p4hVar, AtomicReference<i<T>> atomicReference, yta<? extends h<T>> ytaVar) {
        super(aVar);
        this.f31326b = p4hVar;
        this.c = atomicReference;
        this.d = ytaVar;
    }

    public static <T> qe4<T> D(p4h<? extends T> p4hVar) {
        return H(p4hVar, e);
    }

    public static <T> qe4<T> E(p4h<? extends T> p4hVar, int i2) {
        return i2 == Integer.MAX_VALUE ? D(p4hVar) : H(p4hVar, new b(i2));
    }

    public static <T> qe4<T> F(p4h<? extends T> p4hVar, long j2, TimeUnit timeUnit, ifl iflVar) {
        return G(p4hVar, j2, timeUnit, iflVar, Integer.MAX_VALUE);
    }

    public static <T> qe4<T> G(p4h<? extends T> p4hVar, long j2, TimeUnit timeUnit, ifl iflVar, int i2) {
        return H(p4hVar, new c(i2, timeUnit.toMillis(j2), iflVar));
    }

    public static <T> qe4<T> H(p4h<? extends T> p4hVar, yta<? extends h<T>> ytaVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new qbh(new d(atomicReference, ytaVar), p4hVar, atomicReference, ytaVar);
    }

    @Override // defpackage.qe4
    public void C(tc0<? super koo> tc0Var) {
        i<T> iVar;
        while (true) {
            iVar = this.c.get();
            if (iVar != null && !iVar.isUnsubscribed()) {
                break;
            }
            i<T> iVar2 = new i<>(this.d.call());
            iVar2.c();
            if (d8i.a(this.c, iVar, iVar2)) {
                iVar = iVar2;
                break;
            }
        }
        boolean z = false;
        if (!iVar.j.get() && iVar.j.compareAndSet(false, true)) {
            z = true;
        }
        tc0Var.call(iVar);
        if (z) {
            this.f31326b.B(iVar);
        }
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        i<T> iVar = this.c.get();
        return iVar == null || iVar.isUnsubscribed();
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        this.c.lazySet(null);
    }
}
