package y53;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ds.e0;
import e23.l;
import e23.p;
import e23.q;
import i3.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o13.r;
import o53.k;
import o53.n2;
import o53.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import u53.u;
import u53.x;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Ly53/f;", "R", "Lo53/i;", "", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lt13/g;)V", "Lh53/b;", RemoteConfigConstants.ResponseFieldKey.STATE, "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f<R> implements o53.i, h, n2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f194556f = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f194557a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f194559c;
    private volatile /* synthetic */ Object state$volatile = i.f194576b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f194558b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f194560d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f194561e = i.f194579e;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012(\u0010\u0007\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012H\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003\u0018\u00010\u0003j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ly53/f$a;", "", "clauseObject", "Lkotlin/Function3;", "Ly53/h;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "param", "block", "", "Lt13/g;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ly53/f;Ljava/lang/Object;Le23/q;Le23/q;Ljava/lang/Object;Ljava/lang/Object;Le23/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f194562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<Object, h<?>, Object, Unit> f194563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<Object, Object, Object, Object> f194564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f194565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f194566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q<h<?>, Object, Object, q<Throwable, Object, t13.g, Unit>> f194567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f194568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f194569h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, q<Object, ? super h<?>, Object, Unit> qVar, q<Object, Object, Object, ? extends Object> qVar2, Object obj2, Object obj3, q<? super h<?>, Object, Object, ? extends q<? super Throwable, Object, ? super t13.g, Unit>> qVar3) {
            this.f194562a = obj;
            this.f194563b = qVar;
            this.f194564c = qVar2;
            this.f194565d = obj2;
            this.f194566e = obj3;
            this.f194567f = qVar3;
        }

        public final void a() {
            Object obj = this.f194568g;
            if (obj instanceof u) {
                ((u) obj).h(f.this.f194557a, this.f194569h);
                return;
            }
            u0 u0Var = obj instanceof u0 ? (u0) obj : null;
            if (u0Var != null) {
                u0Var.dispose();
            }
        }
    }

    public f(t13.g gVar) {
        this.f194557a = gVar;
    }

    @Override // o53.i
    public final void a(Throwable th3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f194556f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == i.f194577c) {
                return;
            }
            x xVar = i.f194578d;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, xVar)) {
                    ArrayList arrayList = this.f194558b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                    this.f194561e = i.f194579e;
                    this.f194558b = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // o53.n2
    public final void b(u<?> uVar, int i14) {
        this.f194559c = uVar;
        this.f194560d = i14;
    }

    @Override // y53.h
    public final void c(Object obj) {
        this.f194561e = obj;
    }

    @Override // y53.h
    public final boolean d(Object obj, Object obj2) {
        return i(obj, obj2) == 0;
    }

    public final Object e(v13.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f194556f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        obj.getClass();
        a aVar = (a) obj;
        Object obj2 = aVar.f194565d;
        Object obj3 = this.f194561e;
        ArrayList<a> arrayList = this.f194558b;
        if (arrayList != null) {
            for (a aVar2 : arrayList) {
                if (aVar2 != aVar) {
                    aVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, i.f194577c);
            this.f194561e = i.f194579e;
            this.f194558b = null;
        }
        Object objInvoke = aVar.f194564c.invoke(aVar.f194562a, obj2, obj3);
        Object obj4 = aVar.f194566e;
        if (obj2 == i.f194580f) {
            obj4.getClass();
            return ((l) obj4).invoke(cVar);
        }
        obj4.getClass();
        return ((p) obj4).invoke(objInvoke, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(v13.c cVar) throws Throwable {
        g gVar;
        f<R> fVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f194574d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f194574d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f194572b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f194574d;
        if (i15 == 0) {
            r.b(obj);
            gVar.f194571a = this;
            gVar.f194574d = 1;
            k kVar = new k(u13.f.b(gVar), 1);
            kVar.q();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f194556f;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                x xVar = i.f194576b;
                if (obj2 == xVar) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, kVar)) {
                            kVar.t(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj2);
                } else {
                    if (!(obj2 instanceof List)) {
                        if (!(obj2 instanceof a)) {
                            e0.t(obj2, "unexpected state: ");
                            return null;
                        }
                        Unit unit = Unit.INSTANCE;
                        a aVar2 = (a) obj2;
                        Object obj3 = this.f194561e;
                        q<h<?>, Object, Object, q<Throwable, Object, t13.g, Unit>> qVar = aVar2.f194567f;
                        kVar.y(unit, qVar != null ? qVar.invoke(this, aVar2.f194565d, obj3) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, xVar)) {
                            Iterator it = ((Iterable) obj2).iterator();
                            while (it.hasNext()) {
                                f<R>.a aVarG = g(it.next());
                                aVarG.getClass();
                                aVarG.f194568g = null;
                                aVarG.f194569h = -1;
                                h(aVarG, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj2);
                }
            }
            Object objP = kVar.p();
            if (objP != u13.a.COROUTINE_SUSPENDED) {
                objP = Unit.INSTANCE;
            }
            if (objP != aVar) {
                fVar = this;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fVar = gVar.f194571a;
        r.b(obj);
        gVar.f194571a = null;
        gVar.f194574d = 2;
        Object objE = fVar.e(gVar);
        return objE == aVar ? aVar : objE;
    }

    public final f<R>.a g(Object obj) {
        ArrayList arrayList = this.f194558b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((a) obj3).f194562a == obj) {
                obj2 = obj3;
                break;
            }
        }
        f<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        l2.m("Clause with object ", obj, " is not found");
        return null;
    }

    @Override // y53.h
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final t13.g getF194557a() {
        return this.f194557a;
    }

    public final void h(f<R>.a aVar, boolean z14) {
        Object obj = aVar.f194562a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f194556f;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z14) {
            ArrayList arrayList = this.f194558b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).f194562a == obj) {
                        v.e0.n(e5.f(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        aVar.f194563b.invoke(obj, this, aVar.f194565d);
        if (this.f194561e != i.f194579e) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z14) {
            ArrayList arrayList2 = this.f194558b;
            arrayList2.getClass();
            arrayList2.add(aVar);
        }
        aVar.f194568g = this.f194559c;
        aVar.f194569h = this.f194560d;
        this.f194559c = null;
        this.f194560d = -1;
    }

    public final int i(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f194556f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof o53.j)) {
                if (s.g(obj3, i.f194577c) || (obj3 instanceof a)) {
                    return 3;
                }
                if (s.g(obj3, i.f194578d)) {
                    return 2;
                }
                if (s.g(obj3, i.f194576b)) {
                    List listC = w.c(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listC)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    e0.t(obj3, "Unexpected state: ");
                    return 0;
                }
                ArrayList arrayListD0 = h0.D0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListD0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            f<R>.a aVarG = g(obj);
            if (aVarG != null) {
                q<h<?>, Object, Object, q<Throwable, Object, t13.g, Unit>> qVar = aVarG.f194567f;
                q<Throwable, Object, t13.g, Unit> qVarInvoke = qVar != null ? qVar.invoke(this, aVarG.f194565d, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, aVarG)) {
                        o53.j jVar = (o53.j) obj3;
                        this.f194561e = obj2;
                        i.a aVar = i.f194575a;
                        x xVarO = jVar.o(Unit.INSTANCE, qVarInvoke);
                        if (xVarO == null) {
                            this.f194561e = i.f194579e;
                            return 2;
                        }
                        jVar.B(xVarO);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }
}
