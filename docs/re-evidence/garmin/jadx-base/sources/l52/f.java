package l52;

import android.os.Parcelable;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.w2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Ll52/f;", "Landroid/os/Parcelable;", "T", "Ll52/s;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "d", JWKParameterNames.RSA_EXPONENT, "b", "a", "c", "Ll52/f$a;", "Ll52/f$b;", "Ll52/f$c;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f<T extends Parcelable> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f110247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f<T> f110248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f<T> f110249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a<T> f110250d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B%\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll52/f$a;", "Landroid/os/Parcelable;", "T", "Ll52/f;", "Ll52/e$a;", "data", "Ll52/f$c;", "down", "Ljava/util/UUID;", "uuid", "<init>", "(Landroid/os/Parcelable;Ll52/f$c;Ljava/util/UUID;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T extends Parcelable> extends f<T> implements l52.e.a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f110251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c<T> f110252f;

        /* JADX INFO: renamed from: l52.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2107a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f110253a;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.PRE_ORDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.POST_ORDER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f110253a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t7, c<T> cVar, UUID uuid) {
            super(uuid, null);
            t7.getClass();
            cVar.getClass();
            uuid.getClass();
            this.f110251e = t7;
            this.f110252f = cVar;
            do {
                cVar.getClass();
                cVar.f110250d = this;
                cVar = cVar.f110249c;
            } while (cVar != this.f110252f);
        }

        @Override // l52.f
        public final <R> void a(e<R> eVar, h hVar, t<T, R> tVar) {
            hVar.getClass();
            if (eVar.f110256a != null) {
                return;
            }
            int i14 = C2107a.f110253a[hVar.ordinal()];
            c<T> cVar = this.f110252f;
            if (i14 == 1) {
                tVar.b(eVar, this);
                cVar.a(eVar, hVar, tVar);
            } else if (i14 != 2) {
                lc.u0.r();
            } else {
                cVar.a(eVar, hVar, tVar);
                tVar.b(eVar, this);
            }
        }

        @Override // l52.f
        public final l52.e.b c() {
            return this;
        }

        @Override // l52.f
        public final f e(e23.l lVar) {
            lVar.getClass();
            return new a((Parcelable) lVar.invoke(this.f110251e), this.f110252f.e(lVar), this.f110247a);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f110251e, aVar.f110251e) && p005kotlin.jvm.internal.s.g(this.f110252f, aVar.f110252f);
        }

        @Override // l52.e.a
        public final void g(k kVar) {
            this.f110252f.j(kVar);
        }

        @Override // l52.i.a
        public final T getData() {
            return this.f110251e;
        }

        @Override // l52.i.a
        public final a getParent() {
            return this.f110250d;
        }

        @Override // l52.e.b
        public final void h(T t7) {
            t7.getClass();
            this.f110251e = t7;
        }

        @Override // l52.e.a
        public final void m(k kVar) {
            this.f110252f.i(kVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll52/f$b;", "Landroid/os/Parcelable;", "T", "Ll52/f;", "Ll52/e$b;", "data", "Ljava/util/UUID;", "uuid", "<init>", "(Landroid/os/Parcelable;Ljava/util/UUID;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b<T extends Parcelable> extends f<T> implements l52.e.b<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f110254e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(T t7, UUID uuid) {
            super(uuid, null);
            t7.getClass();
            uuid.getClass();
            this.f110254e = t7;
        }

        @Override // l52.f
        public final <R> void a(e<R> eVar, h hVar, t<T, R> tVar) {
            hVar.getClass();
            if (eVar.f110256a != null) {
                return;
            }
            tVar.b(eVar, this);
        }

        @Override // l52.f
        public final l52.e.b c() {
            return this;
        }

        @Override // l52.f
        public final f e(e23.l lVar) {
            lVar.getClass();
            return new b((Parcelable) lVar.invoke(this.f110254e), this.f110247a);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                return p005kotlin.jvm.internal.s.g(this.f110254e, ((b) obj).f110254e);
            }
            return false;
        }

        @Override // l52.i.a
        public final T getData() {
            return this.f110254e;
        }

        @Override // l52.i.a
        public final a getParent() {
            return this.f110250d;
        }

        @Override // l52.e.b
        public final void h(T t7) {
            t7.getClass();
            this.f110254e = t7;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll52/f$d;", "Landroid/os/Parcelable;", "T", "Ll52/j;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d<T extends Parcelable> implements j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f110255a = new ArrayList();

        @Override // l52.j
        public final void a(l52.e.b<T> bVar) {
            bVar.getClass();
            this.f110255a.add(n.a(bVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll52/f$e;", "R", "Ll52/r;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e<R> implements r<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o13.q<? extends R> f110256a;

        @Override // l52.r
        public final void a(Object obj) {
            if (this.f110256a == null) {
                this.f110256a = o13.q.a(obj);
            } else {
                int i14 = o13.q.f128596b;
                this.f110256a = o13.q.a(new o13.q.b(new RuntimeException("This visit has completed")));
            }
        }
    }

    private f(UUID uuid) {
        this.f110247a = uuid;
        this.f110249c = this;
        this.f110248b = this;
    }

    public abstract <R> void a(e<R> eVar, h hVar, t<T, R> tVar);

    @Override // l52.s
    public final <R> Object b(h hVar, t<T, R> tVar) {
        hVar.getClass();
        e<R> eVar = new e<>();
        a(eVar, hVar, tVar);
        tVar.a(eVar);
        o13.q<? extends R> qVar = eVar.f110256a;
        if (qVar != null) {
            return qVar.f128597a;
        }
        int i14 = o13.q.f128596b;
        return new o13.q.b(new RuntimeException("result is not set"));
    }

    public abstract l52.e.b<T> c();

    public final boolean d(i.a<T> aVar) {
        aVar.getClass();
        for (a<T> parent = aVar.getParent(); parent != null; parent = parent.f110250d) {
            if (parent == this) {
                return true;
            }
        }
        return false;
    }

    public final void delete() {
        f<T> fVar = this.f110248b;
        fVar.f110249c = this.f110249c;
        this.f110249c.f110248b = fVar;
        this.f110250d = null;
    }

    public abstract f<T> e(e23.l<? super T, ? extends T> lVar);

    public final boolean f() {
        return this instanceof a;
    }

    public final int getDepth() {
        int i14 = 0;
        for (a<T> aVar = this.f110250d; aVar != null; aVar = aVar.f110250d) {
            i14++;
        }
        return i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getHeight() {
        q qVar = new q(0);
        o.a(this, h.PRE_ORDER, new hy.d(qVar, 18));
        return ((Number) qVar.f110337a).intValue() - getDepth();
    }

    public final g getPath() {
        g.f110260b.getClass();
        p13.k kVar = new p13.k();
        f<T> fVar = this;
        while (true) {
            if (fVar instanceof c) {
                fVar = ((c) fVar).f110250d;
                if (fVar == null) {
                    return new g(kVar, null);
                }
                kVar.addFirst(new w2(16));
            } else {
                if (!(fVar instanceof a) && !(fVar instanceof b)) {
                    lc.u0.r();
                    return null;
                }
                kVar.addFirst(new w2(17));
                fVar = fVar.f110248b;
            }
        }
    }

    /* JADX INFO: renamed from: getUuid, reason: from getter */
    public final UUID getF110247a() {
        return this.f110247a;
    }

    public final void i(e23.l<? super j<T>, Unit> lVar) {
        d dVar = new d();
        lVar.invoke(dVar);
        for (f<T> fVar : dVar.f110255a) {
            fVar.getClass();
            f<T> fVar2 = this.f110248b;
            this.f110248b = fVar;
            fVar.f110249c = this;
            fVar.f110248b = fVar2;
            fVar2.f110249c = fVar;
            fVar.f110250d = this.f110250d;
        }
    }

    public final boolean isFirst() {
        return this.f110248b instanceof c;
    }

    public final void j(e23.l<? super j<T>, Unit> lVar) {
        d dVar = new d();
        lVar.invoke(dVar);
        ArrayList arrayList = dVar.f110255a;
        arrayList.getClass();
        Iterator it = new p13.x0(arrayList).iterator();
        while (true) {
            ListIterator<T> listIterator = ((p13.x0.a) it).f134964a;
            if (!listIterator.hasPrevious()) {
                return;
            } else {
                l((f) listIterator.previous());
            }
        }
    }

    public final boolean k() {
        return this instanceof b;
    }

    public final void l(f<T> fVar) {
        fVar.getClass();
        f<T> fVar2 = this.f110249c;
        this.f110249c = fVar;
        fVar.f110248b = this;
        fVar.f110249c = fVar2;
        fVar2.f110248b = fVar;
        fVar.f110250d = this.f110250d;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Ll52/f$c;", "Landroid/os/Parcelable;", "T", "Ll52/f;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c<T extends Parcelable> extends f<T> {
        /* JADX WARN: Illegal instructions before constructor call */
        public c() {
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this(uuidRandomUUID);
        }

        @Override // l52.f
        public final <R> void a(e<R> eVar, h hVar, t<T, R> tVar) {
            hVar.getClass();
            for (f<T> fVar = this.f110249c; fVar != this && eVar.f110256a == null; fVar = fVar.f110249c) {
                fVar.a(eVar, hVar, tVar);
            }
        }

        @Override // l52.f
        public final /* bridge */ /* synthetic */ l52.e.b c() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            f<T> fVar = (f) obj;
            f<T> fVar2 = this;
            do {
                fVar2 = fVar2.f110249c;
                fVar = fVar.f110249c;
                if (fVar2 == this && fVar == obj) {
                    return true;
                }
            } while (p005kotlin.jvm.internal.s.g(fVar2, fVar));
            return false;
        }

        @Override // l52.f
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final c<T> e(e23.l<? super T, ? extends T> lVar) {
            lVar.getClass();
            c<T> cVar = new c<>(this.f110247a);
            for (f<T> fVar = this.f110249c; fVar != this; fVar = fVar.f110249c) {
                f<T> fVarE = fVar.e(lVar);
                fVarE.getClass();
                f<T> fVar2 = cVar.f110248b;
                cVar.f110248b = fVarE;
                fVarE.f110249c = cVar;
                fVarE.f110248b = fVar2;
                fVar2.f110249c = fVarE;
                fVarE.f110250d = cVar.f110250d;
            }
            return cVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UUID uuid) {
            super(uuid, null);
            uuid.getClass();
        }
    }

    public /* synthetic */ f(UUID uuid, p005kotlin.jvm.internal.j jVar) {
        this(uuid);
    }
}
