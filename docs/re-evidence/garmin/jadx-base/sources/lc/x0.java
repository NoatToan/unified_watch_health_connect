package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/x0;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc.m f111896a = new qc.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f111897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f111898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f111899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f111900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f111901f;

    public x0() {
        p2 p2VarA = q2.a(p13.j0.f134944a);
        this.f111897b = p2VarA;
        p2 p2VarA2 = q2.a(p13.l0.f134950a);
        this.f111898c = p2VarA2;
        this.f111900e = r53.s.d(p2VarA);
        this.f111901f = r53.s.d(p2VarA2);
    }

    public abstract v a(h0 h0Var, Bundle bundle);

    public void b(v vVar) {
        vVar.getClass();
        p2 p2Var = this.f111898c;
        p2Var.k(null, p13.c1.f((Set) p2Var.getValue(), vVar));
    }

    public final void c(v vVar) {
        int iNextIndex;
        synchronized (this.f111896a) {
            try {
                ArrayList arrayListD1 = p13.h0.d1((Collection) this.f111900e.f150540a.getValue());
                ListIterator listIterator = arrayListD1.listIterator(arrayListD1.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (p005kotlin.jvm.internal.s.g(((v) listIterator.previous()).f111886f, vVar.f111886f)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListD1.set(iNextIndex, vVar);
                this.f111897b.k(null, arrayListD1);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void d(v vVar, boolean z14) {
        synchronized (this.f111896a) {
            try {
                p2 p2Var = this.f111897b;
                Iterable iterable = (Iterable) p2Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (p005kotlin.jvm.internal.s.g((v) obj, vVar)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                p2Var.k(null, arrayList);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void e(v vVar, boolean z14) {
        Object objPrevious;
        p2 p2Var = this.f111898c;
        Iterable iterable = (Iterable) p2Var.getValue();
        boolean z15 = iterable instanceof Collection;
        b2 b2Var = this.f111900e;
        if (!z15 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((v) it.next()) == vVar) {
                    Iterable iterable2 = (Iterable) b2Var.f150540a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it3 = iterable2.iterator();
                    while (it3.hasNext()) {
                        if (((v) it3.next()) == vVar) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        p2Var.k(null, p13.c1.i((Set) p2Var.getValue(), vVar));
        List list = (List) b2Var.f150540a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            v vVar2 = (v) objPrevious;
            if (!p005kotlin.jvm.internal.s.g(vVar2, vVar) && ((List) b2Var.f150540a.getValue()).lastIndexOf(vVar2) < ((List) b2Var.f150540a.getValue()).lastIndexOf(vVar)) {
                break;
            }
        }
        v vVar3 = (v) objPrevious;
        if (vVar3 != null) {
            p2Var.k(null, p13.c1.i((Set) p2Var.getValue(), vVar3));
        }
        d(vVar, z14);
    }

    public void f(v vVar) {
        vVar.getClass();
        p2 p2Var = this.f111898c;
        p2Var.k(null, p13.c1.i((Set) p2Var.getValue(), vVar));
    }

    public void g(v vVar) {
        vVar.getClass();
        synchronized (this.f111896a) {
            p2 p2Var = this.f111897b;
            p2Var.k(null, p13.h0.D0((Collection) p2Var.getValue(), vVar));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void h(v vVar) {
        vVar.getClass();
        p2 p2Var = this.f111898c;
        Iterable iterable = (Iterable) p2Var.getValue();
        boolean z14 = iterable instanceof Collection;
        b2 b2Var = this.f111900e;
        if (!z14 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((v) it.next()) == vVar) {
                    Iterable iterable2 = (Iterable) b2Var.f150540a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it3 = iterable2.iterator();
                        while (it3.hasNext()) {
                            if (((v) it3.next()) == vVar) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        v vVar2 = (v) p13.h0.n0((List) b2Var.f150540a.getValue());
        if (vVar2 != null) {
            p2Var.k(null, p13.c1.i((Set) p2Var.getValue(), vVar2));
        }
        p2Var.k(null, p13.c1.i((Set) p2Var.getValue(), vVar));
        g(vVar);
    }
}
