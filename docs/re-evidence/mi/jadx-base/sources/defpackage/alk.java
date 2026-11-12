package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class alk implements p57, slh, r3b, o82.b, h0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f1178a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f1179b = new Path();
    public final jte c;
    public final a d;
    public final String e;
    public final boolean f;
    public final o82<Float, Float> g;
    public final o82<Float, Float> h;
    public final eyp i;
    public kh4 j;

    public alk(jte jteVar, a aVar, zkk zkkVar) {
        this.c = jteVar;
        this.d = aVar;
        this.e = zkkVar.c();
        this.f = zkkVar.f();
        o82<Float, Float> o82VarA = zkkVar.b().a();
        this.g = o82VarA;
        aVar.i(o82VarA);
        o82VarA.a(this);
        o82<Float, Float> o82VarA2 = zkkVar.d().a();
        this.h = o82VarA2;
        aVar.i(o82VarA2);
        o82VarA2.a(this);
        eyp eypVarB = zkkVar.e().b();
        this.i = eypVarB;
        eypVarB.a(aVar);
        eypVarB.b(this);
    }

    @Override // defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.j.a(rectF, matrix, z);
    }

    @Override // defpackage.r3b
    public void b(ListIterator<hh4> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new kh4(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        d5g.k(f0eVar, i, list, f0eVar2, this);
        for (int i2 = 0; i2 < this.j.j().size(); i2++) {
            hh4 hh4Var = this.j.j().get(i2);
            if (hh4Var instanceof h0e) {
                d5g.k(f0eVar, i, list, f0eVar2, (h0e) hh4Var);
            }
        }
    }

    @Override // defpackage.p57
    public void d(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.g.h().floatValue();
        float fFloatValue2 = this.h.h().floatValue();
        float fFloatValue3 = this.i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.i.e().h().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f1178a.set(matrix);
            float f = i2;
            this.f1178a.preConcat(this.i.g(f + fFloatValue2));
            this.j.d(canvas, this.f1178a, (int) (i * d5g.i(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // o82.b
    public void e() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.e;
    }

    @Override // defpackage.slh
    public Path getPath() {
        Path path = this.j.getPath();
        this.f1179b.reset();
        float fFloatValue = this.g.h().floatValue();
        float fFloatValue2 = this.h.h().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.f1178a.set(this.i.g(i + fFloatValue2));
            this.f1179b.addPath(path, this.f1178a);
        }
        return this.f1179b;
    }

    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        if (this.i.c(t, yteVar)) {
            return;
        }
        if (t == ste.u) {
            this.g.n(yteVar);
        } else if (t == ste.v) {
            this.h.n(yteVar);
        }
    }
}
