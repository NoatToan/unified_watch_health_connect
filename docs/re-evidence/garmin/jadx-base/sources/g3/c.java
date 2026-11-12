package g3;

import e23.p;
import p005kotlin.Metadata;
import p3.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class c extends p005kotlin.jvm.internal.a implements p<Float, t13.d<? super Float>, Object> {
    public c(Object obj) {
        super(2, obj, f.class, "onRelease", "onRelease$material(F)F", 4);
    }

    @Override // e23.p
    public final Object invoke(Float f14, t13.d<? super Float> dVar) {
        float fFloatValue = f14.floatValue();
        f fVar = (f) this.receiver;
        boolean zB = fVar.b();
        z1 z1Var = fVar.f75600f;
        float f15 = 0.0f;
        if (!zB) {
            if (fVar.a() > fVar.f75601g.getFloatValue()) {
                fVar.f75596b.getF182175a().invoke();
            }
            ge1.b.T(fVar.f75595a, null, null, new e(fVar, 0.0f, null), 3);
            if (z1Var.getFloatValue() == 0.0f || fFloatValue < 0.0f) {
                fFloatValue = 0.0f;
            }
            z1Var.i(0.0f);
            f15 = fFloatValue;
        }
        return new Float(f15);
    }
}
