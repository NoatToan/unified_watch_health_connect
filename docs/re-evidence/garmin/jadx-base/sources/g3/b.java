package g3;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;
import p3.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class b extends q implements l<Float, Float> {
    public b(Object obj) {
        super(1, obj, f.class, "onPull", "onPull$material(F)F", 0);
    }

    @Override // e23.l
    public final Float invoke(Float f14) {
        float floatValue;
        float fFloatValue = f14.floatValue();
        f fVar = (f) this.receiver;
        z1 z1Var = fVar.f75600f;
        z1 z1Var2 = fVar.f75601g;
        float f15 = 0.0f;
        if (!fVar.b()) {
            float floatValue2 = z1Var.getFloatValue() + fFloatValue;
            if (floatValue2 < 0.0f) {
                floatValue2 = 0.0f;
            }
            float floatValue3 = floatValue2 - z1Var.getFloatValue();
            fVar.f75600f.i(floatValue2);
            if (fVar.a() <= z1Var2.getFloatValue()) {
                floatValue = fVar.a();
            } else {
                float fAbs = Math.abs(fVar.a() / z1Var2.getFloatValue()) - 1.0f;
                f15 = fAbs >= 0.0f ? fAbs : 0.0f;
                if (f15 > 2.0f) {
                    f15 = 2.0f;
                }
                floatValue = (z1Var2.getFloatValue() * (f15 - (((float) Math.pow(f15, 2)) / 4))) + z1Var2.getFloatValue();
            }
            fVar.f75599e.i(floatValue);
            f15 = floatValue3;
        }
        return Float.valueOf(f15);
    }
}
