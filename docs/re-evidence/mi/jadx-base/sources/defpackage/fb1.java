package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fb1 extends h22<f3b, f3b> {
    public fb1(List<e1e<f3b>> list) {
        super(d(list));
    }

    public static e1e<f3b> c(e1e<f3b> e1eVar) {
        f3b f3bVar = e1eVar.f16153b;
        f3b f3bVar2 = e1eVar.c;
        if (f3bVar == null || f3bVar2 == null || f3bVar.d().length == f3bVar2.d().length) {
            return e1eVar;
        }
        float[] fArrE = e(f3bVar.d(), f3bVar2.d());
        return e1eVar.b(f3bVar.a(fArrE), f3bVar2.a(fArrE));
    }

    public static List<e1e<f3b>> d(List<e1e<f3b>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, c(list.get(i)));
        }
        return list;
    }

    public static float[] e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // defpackage.sb1
    public o82<f3b, f3b> a() {
        return new h3b(this.f19598a);
    }

    @Override // defpackage.h22, defpackage.sb1
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // defpackage.h22, defpackage.sb1
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // defpackage.h22
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
