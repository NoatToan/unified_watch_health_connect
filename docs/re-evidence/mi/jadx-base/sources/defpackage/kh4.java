package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kh4 implements p57, slh, o82.b, g0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f23841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f23842b;
    public final Matrix c;
    public final Path d;
    public final RectF e;
    public final String f;
    public final boolean g;
    public final List<hh4> h;
    public final jte i;
    public List<slh> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public eyp f23843k;

    public kh4(jte jteVar, a aVar, y2m y2mVar, lse lseVar) {
        this(jteVar, aVar, y2mVar.c(), y2mVar.d(), b(jteVar, lseVar, aVar, y2mVar.b()), i(y2mVar.b()));
    }

    public static List<hh4> b(jte jteVar, lse lseVar, a aVar, List<fi4> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            hh4 hh4VarA = list.get(i).a(jteVar, lseVar, aVar);
            if (hh4VarA != null) {
                arrayList.add(hh4VarA);
            }
        }
        return arrayList;
    }

    public static qb1 i(List<fi4> list) {
        for (int i = 0; i < list.size(); i++) {
            fi4 fi4Var = list.get(i);
            if (fi4Var instanceof qb1) {
                return (qb1) fi4Var;
            }
        }
        return null;
    }

    @Override // defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        eyp eypVar = this.f23843k;
        if (eypVar != null) {
            this.c.preConcat(eypVar.f());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            hh4 hh4Var = this.h.get(size);
            if (hh4Var instanceof p57) {
                ((p57) hh4Var).a(this.e, this.c, z);
                rectF.union(this.e);
            }
        }
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        if (f0eVar.g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                f0eVar2 = f0eVar2.a(getName());
                if (f0eVar.c(getName(), i)) {
                    list.add(f0eVar2.i(this));
                }
            }
            if (f0eVar.h(getName(), i)) {
                int iE = i + f0eVar.e(getName(), i);
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    hh4 hh4Var = this.h.get(i2);
                    if (hh4Var instanceof g0e) {
                        ((g0e) hh4Var).c(f0eVar, iE, list, f0eVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.p57
    public void d(Canvas canvas, Matrix matrix, int i) {
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        eyp eypVar = this.f23843k;
        if (eypVar != null) {
            this.c.preConcat(eypVar.f());
            i = (int) (((((this.f23843k.h() == null ? 100 : this.f23843k.h().h().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.i.b0() && m() && i != 255;
        if (z) {
            this.f23842b.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.f23842b, this.c, true);
            this.f23841a.setAlpha(i);
            emq.m(canvas, this.f23842b, this.f23841a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            hh4 hh4Var = this.h.get(size);
            if (hh4Var instanceof p57) {
                ((p57) hh4Var).d(canvas, this.c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // o82.b
    public void e() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            hh4 hh4Var = this.h.get(size);
            hh4Var.f(arrayList, this.h.subList(0, size));
            arrayList.add(hh4Var);
        }
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.f;
    }

    @Override // defpackage.slh
    public Path getPath() {
        this.c.reset();
        eyp eypVar = this.f23843k;
        if (eypVar != null) {
            this.c.set(eypVar.f());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        for (int size = this.h.size() - 1; size >= 0; size--) {
            hh4 hh4Var = this.h.get(size);
            if (hh4Var instanceof slh) {
                this.d.addPath(((slh) hh4Var).getPath(), this.c);
            }
        }
        return this.d;
    }

    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        eyp eypVar = this.f23843k;
        if (eypVar != null) {
            eypVar.c(t, yteVar);
        }
    }

    public List<hh4> j() {
        return this.h;
    }

    public List<slh> k() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                hh4 hh4Var = this.h.get(i);
                if (hh4Var instanceof slh) {
                    this.j.add((slh) hh4Var);
                }
            }
        }
        return this.j;
    }

    public Matrix l() {
        eyp eypVar = this.f23843k;
        if (eypVar != null) {
            return eypVar.f();
        }
        this.c.reset();
        return this.c;
    }

    public final boolean m() {
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if ((this.h.get(i2) instanceof p57) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public kh4(jte jteVar, a aVar, String str, boolean z, List<hh4> list, qb1 qb1Var) {
        this.f23841a = new x1e();
        this.f23842b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = jteVar;
        this.g = z;
        this.h = list;
        if (qb1Var != null) {
            eyp eypVarB = qb1Var.b();
            this.f23843k = eypVarB;
            eypVarB.a(aVar);
            this.f23843k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            hh4 hh4Var = list.get(size);
            if (hh4Var instanceof r3b) {
                arrayList.add((r3b) hh4Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((r3b) arrayList.get(size2)).b(list.listIterator(list.size()));
        }
    }
}
