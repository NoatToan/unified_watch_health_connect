package s3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ov1.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p1.a1;
import p1.g1;
import p1.i0;
import p1.j0;
import p1.q0;
import p1.t0;
import p13.c0;
import p3.h3;
import p3.j1;
import p3.j2;
import p3.x1;
import qw0.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls3/i;", "Lp3/h3;", "Lg4/g;", "", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends h3 implements g4.g, Iterable<Object>, f23.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156349b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f156352e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f156354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156355h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap<b, c> f156357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0<j0> f156358k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f156348a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f156350c = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f156353f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<b> f156356i = new ArrayList<>();

    public static final void e(l lVar, int i14) {
        while (lVar.f156384v >= 0 && lVar.f156383u <= i14) {
            lVar.O();
            lVar.j();
        }
    }

    @Override // p3.h3
    public final void a(z3.l lVar) {
        l lVarH = h();
        try {
            x1 x1Var = p3.n.f135158a;
            lVarH.n(lVarH.f156382t, new q(lVar, 4));
            lVarH.J();
            Unit unit = Unit.INSTANCE;
            boolean z14 = true;
        } finally {
            lVarH.e(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.h3
    public final t0 b(p3.c cVar, a1 a1Var) {
        int i14;
        int i15;
        int i16;
        int i17;
        Object[] objArr = a1Var.f134667a;
        int i18 = a1Var.f134668b;
        Object[] objArr2 = 0;
        int i19 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z14 = false;
        int i27 = 0;
        while (true) {
            i14 = 1;
            char c14 = 1;
            i17 = 1;
            i16 = 1;
            boolean z15 = true;
            if (i27 >= i18) {
                break;
            }
            if (!i(oc.b.f(((j1) objArr[i27]).f135127e))) {
                q0 q0Var = new q0(objArr2 == true ? 1 : 0, c14 == true ? 1 : 0, null);
                Object[] objArr3 = a1Var.f134667a;
                int i28 = a1Var.f134668b;
                for (int i29 = i19; i29 < i28; i29++) {
                    Object obj = objArr3[i29];
                    if (i(oc.b.f(((j1) obj).f135127e))) {
                        q0Var.g(obj);
                    }
                }
                a1Var = q0Var;
                break;
            }
            i27++;
        }
        y yVar = new y(this, 28);
        if (a1Var.f134668b > i14) {
            Comparable comparable = (Comparable) yVar.invoke(a1Var.b(i25));
            int i30 = a1Var.f134668b;
            int i34 = i16;
            while (i34 < i30) {
                Comparable comparable2 = (Comparable) yVar.invoke(a1Var.b(i34));
                if (comparable.compareTo(comparable2) > 0) {
                    q0 q0Var2 = new q0(a1Var.f134668b);
                    Object[] objArr4 = a1Var.f134667a;
                    int i35 = a1Var.f134668b;
                    for (int i36 = i24; i36 < i35; i36++) {
                        q0Var2.g(objArr4[i36]);
                    }
                    q0.b bVar = q0Var2.f134799c;
                    if (bVar == null) {
                        bVar = new q0.b(q0Var2);
                        q0Var2.f134799c = bVar;
                    }
                    if (bVar.f134802a.f134668b > i17) {
                        c0.u(bVar, new q3.a(yVar));
                    }
                    a1Var = q0Var2;
                    break;
                }
                i34++;
                comparable = comparable2;
            }
        }
        if (a1Var.d()) {
            t0 t0Var = g1.f134728b;
            t0Var.getClass();
            return t0Var;
        }
        t0 t0VarB = g1.b();
        l lVarH = h();
        try {
            Object[] objArr5 = a1Var.f134667a;
            int i37 = a1Var.f134668b;
            for (int i38 = i26; i38 < i37; i38++) {
                j1 j1Var = (j1) objArr5[i38];
                int iC = lVarH.c(oc.b.f(j1Var.f135127e));
                int iG = lVarH.G(iC, lVarH.f156364b);
                e(lVarH, iG);
                e(lVarH, iG);
                while (true) {
                    i15 = lVarH.f156382t;
                    if (i15 == iG || i15 == lVarH.f156383u) {
                        break;
                        break;
                    }
                    if (iG < lVarH.u(i15) + i15) {
                        lVarH.R();
                    } else {
                        lVarH.N();
                    }
                }
                if (i15 != iG) {
                    p3.n.a("Unexpected slot table structure");
                }
                lVarH.R();
                lVarH.a(iC - lVarH.f156382t);
                t0VarB.m(j1Var, p3.n.c(j1Var.f135125c, j1Var, lVarH, cVar));
            }
            e(lVarH, Integer.MAX_VALUE);
            Unit unit = Unit.INSTANCE;
            return t0VarB;
        } finally {
            lVarH.e(z14);
        }
    }

    public final int c(b bVar) {
        if (this.f156354g) {
            p3.n.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!bVar.getValid()) {
            j2.a("Anchor refers to a group that was removed");
        }
        return bVar.f156318a;
    }

    public final void d() {
        this.f156357j = new HashMap<>();
    }

    public final h g() {
        if (this.f156354g) {
            vb.h.z("Cannot read while a writer is pending");
            return null;
        }
        this.f156352e++;
        return new h(this);
    }

    public final l h() {
        if (this.f156354g) {
            p3.n.a("Cannot start a writer when another writer is pending");
        }
        if (this.f156352e > 0) {
            p3.n.a("Cannot start a writer when a reader is pending");
        }
        this.f156354g = true;
        this.f156355h++;
        return new l(this);
    }

    public final boolean i(b bVar) {
        int iF;
        return bVar.getValid() && (iF = k.f(this.f156356i, bVar.f156318a, this.f156349b)) >= 0 && s.g(this.f156356i.get(iF), bVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new d(this, 0, this.f156349b);
    }

    public final c j(int i14) {
        int i15;
        ArrayList<b> arrayList;
        int iF;
        HashMap<b, c> map = this.f156357j;
        if (map != null) {
            if (this.f156354g) {
                p3.n.a("use active SlotWriter to crate an anchor for location instead");
            }
            b bVar = (i14 < 0 || i14 >= (i15 = this.f156349b) || (iF = k.f((arrayList = this.f156356i), i14, i15)) < 0) ? null : arrayList.get(iF);
            if (bVar != null) {
                return map.get(bVar);
            }
        }
        return null;
    }
}
