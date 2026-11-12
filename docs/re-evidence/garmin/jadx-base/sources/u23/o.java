package u23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f168238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<x33.c, Boolean> f168240c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(h hVar, boolean z14, e23.l<? super x33.c, Boolean> lVar) {
        hVar.getClass();
        lVar.getClass();
        this.f168238a = hVar;
        this.f168239b = z14;
        this.f168240c = lVar;
    }

    @Override // u23.h
    public final boolean I3(x33.c cVar) {
        cVar.getClass();
        if (this.f168240c.invoke(cVar).booleanValue()) {
            return this.f168238a.I3(cVar);
        }
        return false;
    }

    @Override // u23.h
    public final boolean isEmpty() {
        boolean z14;
        h hVar = this.f168238a;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            Iterator<c> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                }
                x33.c cVarC = it.next().c();
                if (cVarC != null && this.f168240c.invoke(cVarC).booleanValue()) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        if (this.f168239b) {
            return !z14;
        }
        return z14;
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f168238a) {
            x33.c cVarC = cVar.c();
            if (cVarC != null && this.f168240c.invoke(cVarC).booleanValue()) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // u23.h
    public final c z(x33.c cVar) {
        cVar.getClass();
        if (this.f168240c.invoke(cVar).booleanValue()) {
            return this.f168238a.z(cVar);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(h hVar, e23.l<? super x33.c, Boolean> lVar) {
        this(hVar, false, lVar);
        hVar.getClass();
        lVar.getClass();
    }
}
