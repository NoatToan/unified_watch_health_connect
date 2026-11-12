package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vxk implements c3m, o82.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jte f37335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37336b;
    public final o82<Float, Float> c;
    public u2m d;

    public vxk(jte jteVar, a aVar, uxk uxkVar) {
        this.f37335a = jteVar;
        this.f37336b = uxkVar.c();
        o82<Float, Float> o82VarA = uxkVar.b().a();
        this.c = o82VarA;
        aVar.i(o82VarA);
        o82VarA.a(this);
    }

    public static int b(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    public static int c(int i, int i2) {
        return i - (b(i, i2) * i2);
    }

    @Override // o82.b
    public void e() {
        this.f37335a.invalidateSelf();
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    @Override // defpackage.c3m
    public u2m g(u2m u2mVar) {
        boolean z;
        List<d55> listA = u2mVar.a();
        if (listA.size() <= 2) {
            return u2mVar;
        }
        float fFloatValue = this.c.h().floatValue();
        if (fFloatValue == 0.0f) {
            return u2mVar;
        }
        u2m u2mVarI = i(u2mVar);
        u2mVarI.f(u2mVar.b().x, u2mVar.b().y);
        List<d55> listA2 = u2mVarI.a();
        boolean zD = u2mVar.d();
        int i = 0;
        int i2 = 0;
        while (i < listA.size()) {
            d55 d55Var = listA.get(i);
            d55 d55Var2 = listA.get(c(i - 1, listA.size()));
            d55 d55Var3 = listA.get(c(i - 2, listA.size()));
            PointF pointFC = (i != 0 || zD) ? d55Var2.c() : u2mVar.b();
            PointF pointFB = (i != 0 || zD) ? d55Var2.b() : pointFC;
            PointF pointFA = d55Var.a();
            PointF pointFC2 = d55Var3.c();
            PointF pointFC3 = d55Var.c();
            if (!u2mVar.d() && i == 0) {
                z = i == listA.size() + (-1);
            }
            if (pointFB.equals(pointFC) && pointFA.equals(pointFC) && !z) {
                float f = pointFC.x;
                float f2 = f - pointFC2.x;
                float f3 = pointFC.y;
                float f4 = f3 - pointFC2.y;
                float f5 = pointFC3.x - f;
                float f6 = pointFC3.y - f3;
                float fHypot = (float) Math.hypot(f2, f4);
                float fHypot2 = (float) Math.hypot(f5, f6);
                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                float f7 = pointFC.x;
                float f8 = ((pointFC2.x - f7) * fMin) + f7;
                float f9 = pointFC.y;
                float f10 = ((pointFC2.y - f9) * fMin) + f9;
                float f11 = ((pointFC3.x - f7) * fMin2) + f7;
                float f12 = ((pointFC3.y - f9) * fMin2) + f9;
                float f13 = f8 - ((f8 - f7) * 0.5519f);
                float f14 = f10 - ((f10 - f9) * 0.5519f);
                float f15 = f11 - ((f11 - f7) * 0.5519f);
                float f16 = f12 - ((f12 - f9) * 0.5519f);
                d55 d55Var4 = listA2.get(c(i2 - 1, listA2.size()));
                d55 d55Var5 = listA2.get(i2);
                d55Var4.e(f8, f10);
                d55Var4.f(f8, f10);
                if (i == 0) {
                    u2mVarI.f(f8, f10);
                }
                d55Var5.d(f13, f14);
                d55 d55Var6 = listA2.get(i2 + 1);
                d55Var5.e(f15, f16);
                d55Var5.f(f11, f12);
                d55Var6.d(f11, f12);
                i2 += 2;
            } else {
                d55 d55Var7 = listA2.get(c(i2 - 1, listA2.size()));
                d55 d55Var8 = listA2.get(i2);
                d55Var7.e(d55Var2.b().x, d55Var2.b().y);
                d55Var7.f(d55Var2.c().x, d55Var2.c().y);
                d55Var8.d(d55Var.a().x, d55Var.a().y);
                i2++;
            }
            i++;
            listA = listA;
        }
        return u2mVarI;
    }

    public o82<Float, Float> h() {
        return this.c;
    }

    public final u2m i(u2m u2mVar) {
        List<d55> listA = u2mVar.a();
        boolean zD = u2mVar.d();
        int size = listA.size() - 1;
        int i = 0;
        while (size >= 0) {
            d55 d55Var = listA.get(size);
            d55 d55Var2 = listA.get(c(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? d55Var2.c() : u2mVar.b();
            i = (((size != 0 || zD) ? d55Var2.b() : pointFC).equals(pointFC) && d55Var.a().equals(pointFC) && !(!u2mVar.d() && size == 0 && size == listA.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        u2m u2mVar2 = this.d;
        if (u2mVar2 == null || u2mVar2.a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new d55());
            }
            this.d = new u2m(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.d.e(zD);
        return this.d;
    }
}
