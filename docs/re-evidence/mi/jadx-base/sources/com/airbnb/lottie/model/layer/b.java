package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.collection.LongSparseArray;
import defpackage.eb1;
import defpackage.emq;
import defpackage.f0e;
import defpackage.inq;
import defpackage.jte;
import defpackage.lse;
import defpackage.o82;
import defpackage.ste;
import defpackage.w1e;
import defpackage.yte;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.airbnb.lottie.model.layer.a {
    public o82<Float, Float> D;
    public final List<com.airbnb.lottie.model.layer.a> E;
    public final RectF F;
    public final RectF G;
    public final Paint H;
    public boolean I;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5702a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f5702a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5702a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(jte jteVar, Layer layer, List<Layer> list, lse lseVar) {
        int i;
        com.airbnb.lottie.model.layer.a aVar;
        super(jteVar, layer);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Paint();
        this.I = true;
        eb1 eb1VarU = layer.u();
        if (eb1VarU != null) {
            o82<Float, Float> o82VarA = eb1VarU.a();
            this.D = o82VarA;
            i(o82VarA);
            this.D.a(this);
        } else {
            this.D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lseVar.k().size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            com.airbnb.lottie.model.layer.a aVarU = com.airbnb.lottie.model.layer.a.u(this, layer2, jteVar, lseVar);
            if (aVarU != null) {
                longSparseArray.put(aVarU.y().d(), aVarU);
                if (aVar2 != null) {
                    aVar2.I(aVarU);
                    aVar2 = null;
                } else {
                    this.E.add(0, aVarU);
                    int i2 = a.f5702a[layer2.h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = aVarU;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            com.airbnb.lottie.model.layer.a aVar3 = (com.airbnb.lottie.model.layer.a) longSparseArray.get(longSparseArray.keyAt(i));
            if (aVar3 != null && (aVar = (com.airbnb.lottie.model.layer.a) longSparseArray.get(aVar3.y().j())) != null) {
                aVar3.K(aVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void H(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            this.E.get(i2).c(f0eVar, i, list, f0eVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void J(boolean z) {
        super.J(z);
        Iterator<com.airbnb.lottie.model.layer.a> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().J(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void L(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        super.L(f);
        if (this.D != null) {
            f = ((this.D.h().floatValue() * this.q.b().i()) - this.q.b().p()) / (this.p.G().e() + 0.01f);
        }
        if (this.D == null) {
            f -= this.q.r();
        }
        if (this.q.v() != 0.0f && !"__container".equals(this.q.i())) {
            f /= this.q.v();
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).L(f);
        }
    }

    public void O(boolean z) {
        this.I = z;
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.E.get(size).a(this.F, this.o, true);
            rectF.union(this.F);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        super.h(t, yteVar);
        if (t == ste.E) {
            if (yteVar == null) {
                o82<Float, Float> o82Var = this.D;
                if (o82Var != null) {
                    o82Var.n(null);
                    return;
                }
                return;
            }
            inq inqVar = new inq(yteVar);
            this.D = inqVar;
            inqVar.a(this);
            i(this.D);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
        w1e.a("CompositionLayer#draw");
        this.G.set(0.0f, 0.0f, this.q.l(), this.q.k());
        matrix.mapRect(this.G);
        boolean z = this.p.b0() && this.E.size() > 1 && i != 255;
        if (z) {
            this.H.setAlpha(i);
            emq.m(canvas, this.G, this.H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.E.size() - 1; size >= 0; size--) {
            if ((!this.I && "__container".equals(this.q.i())) || this.G.isEmpty() || canvas.clipRect(this.G)) {
                this.E.get(size).d(canvas, matrix, i);
            }
        }
        canvas.restore();
        w1e.b("CompositionLayer#draw");
    }
}
