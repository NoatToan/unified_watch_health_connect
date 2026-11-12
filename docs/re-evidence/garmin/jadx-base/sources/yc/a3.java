package yc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\tB#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lyc/a3;", "", "T", "Lt13/g;", "mainContext", "Lyc/v2;", "cachedPagingData", "<init>", "(Lt13/g;Lyc/v2;)V", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f195736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n0 f195737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q4 f195738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k2<T> f195739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j1 f195740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList<e23.a<Unit>> f195741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i4 f195742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f195743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f195744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r53.p2 f195745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r53.b2 f195746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r53.e2 f195747l;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a3<T> f195748a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a3<T> a3Var) {
            super(0);
            this.f195748a = a3Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            r53.e2 e2Var = this.f195748a.f195747l;
            Unit unit = Unit.INSTANCE;
            e2Var.d(unit);
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/a3$b;", "Lyc/q4;", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements q4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f195749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f195750b;

        @Override // yc.q4
        public final void a() {
            this.f195750b = true;
        }

        @Override // yc.q4
        public final void retry() {
            this.f195749a = true;
        }
    }

    public a3(t13.g gVar, v2<T> v2Var) {
        k2<T> k2Var;
        m1.b<T> bVarInvoke;
        gVar.getClass();
        this.f195736a = gVar;
        this.f195738c = new b();
        k2.a aVar = k2.f196117e;
        p005kotlin.jvm.internal.j jVar = null;
        m1.b<T> bVarInvoke2 = v2Var != null ? v2Var.f196541d.invoke() : null;
        aVar.getClass();
        if (bVarInvoke2 != null) {
            k2Var = new k2<>(bVarInvoke2);
        } else {
            k2Var = (k2<T>) k2.f196118f;
            k2Var.getClass();
        }
        this.f195739d = k2Var;
        j1 j1Var = new j1();
        if (v2Var != null && (bVarInvoke = v2Var.f196541d.invoke()) != null) {
            b1 b1Var = bVarInvoke.f196166e;
            b1 b1Var2 = bVarInvoke.f196167f;
            b1Var.getClass();
            j1Var.c(new h1(j1Var, b1Var, b1Var2));
        }
        this.f195740e = j1Var;
        CopyOnWriteArrayList<e23.a<Unit>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f195741f = copyOnWriteArrayList;
        this.f195742g = new i4(false, 1, jVar);
        this.f195745j = r53.q2.a(Boolean.FALSE);
        this.f195746k = j1Var.f196091c;
        this.f195747l = r53.g2.a(0, 64, q53.a.DROP_OLDEST);
        copyOnWriteArrayList.add(new a(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(a3 a3Var, List list, int i14, int i15, boolean z14, b1 b1Var, b1 b1Var2, n0 n0Var, v13.c cVar) throws IOException {
        d3 d3Var;
        k2<T> k2Var;
        n0 n0Var2;
        List<T> list2;
        List<T> list3;
        a3Var.getClass();
        if (cVar instanceof d3) {
            d3Var = (d3) cVar;
            int i16 = d3Var.f195843l;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                d3Var.f195843l = i16 - Integer.MIN_VALUE;
            } else {
                d3Var = new d3(a3Var, cVar);
            }
        } else {
            d3Var = new d3(a3Var, cVar);
        }
        Object obj = d3Var.f195841j;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = d3Var.f195843l;
        if (i17 == 0) {
            o13.r.b(obj);
            if (z14 && b1Var == null) {
                vb.h.s("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                return null;
            }
            a3Var.f195743h = false;
            k2Var = new k2<>(list, i14, i15);
            k2<T> k2Var2 = a3Var.f195739d;
            k2Var2.getClass();
            a3Var.f195739d = k2Var;
            a3Var.f195737b = n0Var;
            z2.e eVar = new z2.e(k2Var, k2Var2);
            d3Var.f195832a = a3Var;
            d3Var.f195833b = list;
            d3Var.f195834c = b1Var;
            d3Var.f195835d = b1Var2;
            d3Var.f195836e = n0Var;
            d3Var.f195837f = k2Var;
            d3Var.f195838g = i14;
            d3Var.f195839h = i15;
            d3Var.f195840i = z14;
            d3Var.f195843l = 1;
            if (a3Var.c(eVar, d3Var) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = d3Var.f195840i;
            i15 = d3Var.f195839h;
            i14 = d3Var.f195838g;
            k2<T> k2Var3 = d3Var.f195837f;
            n0Var = d3Var.f195836e;
            b1Var2 = d3Var.f195835d;
            b1Var = d3Var.f195834c;
            list = d3Var.f195833b;
            a3 a3Var2 = d3Var.f195832a;
            o13.r.b(obj);
            k2Var = k2Var3;
            a3Var = a3Var2;
        }
        g3.f195987a.getClass();
        if (g3.a(3)) {
            StringBuilder sb3 = new StringBuilder("Presenting data (\n                            |   first item: ");
            p4 p4Var = (p4) p13.h0.d0(list);
            Object objN0 = null;
            sb3.append((p4Var == null || (list3 = p4Var.f196319b) == null) ? null : p13.h0.d0(list3));
            sb3.append("\n                            |   last item: ");
            p4 p4Var2 = (p4) p13.h0.n0(list);
            if (p4Var2 != null && (list2 = p4Var2.f196319b) != null) {
                objN0 = p13.h0.n0(list2);
            }
            sb3.append(objN0);
            sb3.append("\n                            |   placeholdersBefore: ");
            sb3.append(i14);
            sb3.append("\n                            |   placeholdersAfter: ");
            sb3.append(i15);
            sb3.append("\n                            |   hintReceiver: ");
            sb3.append(n0Var);
            sb3.append("\n                            |   sourceLoadStates: ");
            sb3.append(b1Var);
            sb3.append("\n                        ");
            String string = sb3.toString();
            if (b1Var2 != null) {
                string = string + "|   mediatorLoadStates: " + b1Var2 + '\n';
            }
            d53.n.d(string.concat("|)"));
        }
        if (z14) {
            j1 j1Var = a3Var.f195740e;
            b1Var.getClass();
            j1Var.getClass();
            j1Var.c(new h1(j1Var, b1Var, b1Var2));
        }
        if (k2Var.getSize() == 0 && (n0Var2 = a3Var.f195737b) != null) {
            int i18 = k2Var.f196120b / 2;
            n0Var2.a(new t4.b(i18, i18, k2Var.d(), k2Var.f()));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T b(int i14) {
        Object value;
        Object value2;
        r53.p2 p2Var = this.f195745j;
        do {
            value = p2Var.getValue();
            ((Boolean) value).getClass();
        } while (!p2Var.b(value, Boolean.TRUE));
        this.f195743h = true;
        this.f195744i = i14;
        g3.f195987a.getClass();
        g3.a(2);
        n0 n0Var = this.f195737b;
        if (n0Var != null) {
            n0Var.a(this.f195739d.c(i14));
        }
        k2<T> k2Var = this.f195739d;
        if (i14 < 0) {
            k2Var.getClass();
        } else if (i14 < k2Var.getSize()) {
            int i15 = i14 - k2Var.f196121c;
            T item = (i15 < 0 || i15 >= k2Var.f196120b) ? null : k2Var.getItem(i15);
            r53.p2 p2Var2 = this.f195745j;
            do {
                value2 = p2Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!p2Var2.b(value2, Boolean.FALSE));
            return item;
        }
        l2.j(k2Var.getSize(), b71.i.i(i14, "Index: ", ", Size: "));
        return null;
    }

    public abstract Object c(z2 z2Var, v13.c cVar);

    public final r0<T> d() {
        k2<T> k2Var = this.f195739d;
        int i14 = k2Var.f196121c;
        int i15 = k2Var.f196122d;
        ArrayList arrayList = k2Var.f196119a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.d0.v(arrayList2, ((p4) it.next()).f196319b);
        }
        return new r0<>(i14, i15, arrayList2);
    }

    public a3() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a3(t13.g gVar, v2 v2Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            x53.c cVar = o53.s0.f129406a;
            gVar = u53.o.f168762a;
        }
        this(gVar, (i14 & 2) != 0 ? null : v2Var);
    }
}
