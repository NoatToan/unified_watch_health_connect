package defpackage;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h54 extends a12<hpc<? extends Entry>> {
    public bge j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w02 f19699k;
    public cel l;
    public ui3 m;
    public o53 n;

    public o53 A() {
        return this.n;
    }

    public ui3 B() {
        return this.m;
    }

    public a12 C(int i) {
        return y().get(i);
    }

    public hpc<? extends Entry> D(r7c r7cVar) {
        if (r7cVar.c() >= y().size()) {
            return null;
        }
        a12 a12VarC = C(r7cVar.c());
        if (r7cVar.d() >= a12VarC.j()) {
            return null;
        }
        return (hpc) a12VarC.l().get(r7cVar.d());
    }

    public bge E() {
        return this.j;
    }

    public cel F() {
        return this.l;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.fu3
    public void d() {
        if (this.i == 0) {
            this.i = new ArrayList();
        }
        this.i.clear();
        this.f18242a = -3.4028235E38f;
        this.f18243b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        for (a12 a12Var : y()) {
            a12Var.d();
            List<T> listL = a12Var.l();
            this.i.addAll(listL);
            if (a12Var.t() > this.f18242a) {
                this.f18242a = a12Var.t();
            }
            if (a12Var.v() < this.f18243b) {
                this.f18243b = a12Var.v();
            }
            if (a12Var.r() > this.c) {
                this.c = a12Var.r();
            }
            if (a12Var.s() < this.d) {
                this.d = a12Var.s();
            }
            for (T t : listL) {
                if (t.m0() == YAxis.AxisDependency.LEFT) {
                    if (t.V() > this.e) {
                        this.e = t.V();
                    }
                    if (t.Z() < this.f) {
                        this.f = t.Z();
                    }
                } else {
                    if (t.V() > this.g) {
                        this.g = t.V();
                    }
                    if (t.Z() < this.h) {
                        this.h = t.Z();
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [erc] */
    @Override // defpackage.fu3
    public Entry n(r7c r7cVar) {
        if (r7cVar.c() >= y().size()) {
            return null;
        }
        a12 a12VarC = C(r7cVar.c());
        if (r7cVar.d() >= a12VarC.j()) {
            return null;
        }
        for (Entry entry : a12VarC.i(r7cVar.d()).r(r7cVar.h())) {
            if (entry.getY() == r7cVar.j() || Float.isNaN(r7cVar.j())) {
                return entry;
            }
        }
        return null;
    }

    @Override // defpackage.fu3
    public void x() {
        bge bgeVar = this.j;
        if (bgeVar != null) {
            bgeVar.x();
        }
        w02 w02Var = this.f19699k;
        if (w02Var != null) {
            w02Var.x();
        }
        ui3 ui3Var = this.m;
        if (ui3Var != null) {
            ui3Var.x();
        }
        cel celVar = this.l;
        if (celVar != null) {
            celVar.x();
        }
        o53 o53Var = this.n;
        if (o53Var != null) {
            o53Var.x();
        }
        d();
    }

    public List<a12> y() {
        ArrayList arrayList = new ArrayList();
        bge bgeVar = this.j;
        if (bgeVar != null) {
            arrayList.add(bgeVar);
        }
        w02 w02Var = this.f19699k;
        if (w02Var != null) {
            arrayList.add(w02Var);
        }
        cel celVar = this.l;
        if (celVar != null) {
            arrayList.add(celVar);
        }
        ui3 ui3Var = this.m;
        if (ui3Var != null) {
            arrayList.add(ui3Var);
        }
        o53 o53Var = this.n;
        if (o53Var != null) {
            arrayList.add(o53Var);
        }
        return arrayList;
    }

    public w02 z() {
        return this.f19699k;
    }
}
