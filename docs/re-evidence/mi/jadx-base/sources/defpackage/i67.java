package defpackage;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class i67 implements o82.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o82.b f20828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o82<Integer, Integer> f20829b;
    public final o82<Float, Float> c;
    public final o82<Float, Float> d;
    public final o82<Float, Float> e;
    public final o82<Float, Float> f;
    public boolean g = true;

    public class a extends yte<Float> {
        public final /* synthetic */ yte d;

        public a(yte yteVar) {
            this.d = yteVar;
        }

        @Override // defpackage.yte
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(lte<Float> lteVar) {
            Float f = (Float) this.d.a(lteVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public i67(o82.b bVar, com.airbnb.lottie.model.layer.a aVar, f67 f67Var) {
        this.f20828a = bVar;
        o82<Integer, Integer> o82VarA = f67Var.a().a();
        this.f20829b = o82VarA;
        o82VarA.a(this);
        aVar.i(o82VarA);
        o82<Float, Float> o82VarA2 = f67Var.d().a();
        this.c = o82VarA2;
        o82VarA2.a(this);
        aVar.i(o82VarA2);
        o82<Float, Float> o82VarA3 = f67Var.b().a();
        this.d = o82VarA3;
        o82VarA3.a(this);
        aVar.i(o82VarA3);
        o82<Float, Float> o82VarA4 = f67Var.c().a();
        this.e = o82VarA4;
        o82VarA4.a(this);
        aVar.i(o82VarA4);
        o82<Float, Float> o82VarA5 = f67Var.e().a();
        this.f = o82VarA5;
        o82VarA5.a(this);
        aVar.i(o82VarA5);
    }

    public void a(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((double) this.d.h().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.e.h().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f20829b.h().intValue();
            paint.setShadowLayer(this.f.h().floatValue(), fSin, fCos, Color.argb(Math.round(this.c.h().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void b(yte<Integer> yteVar) {
        this.f20829b.n(yteVar);
    }

    public void c(yte<Float> yteVar) {
        this.d.n(yteVar);
    }

    public void d(yte<Float> yteVar) {
        this.e.n(yteVar);
    }

    @Override // o82.b
    public void e() {
        this.g = true;
        this.f20828a.e();
    }

    public void f(yte<Float> yteVar) {
        if (yteVar == null) {
            this.c.n(null);
        } else {
            this.c.n(new a(yteVar));
        }
    }

    public void g(yte<Float> yteVar) {
        this.f.n(yteVar);
    }
}
