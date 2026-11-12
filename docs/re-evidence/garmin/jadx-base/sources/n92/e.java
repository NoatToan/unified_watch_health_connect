package n92;

import m92.p0;
import p005kotlin.Metadata;
import p13.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ln92/e;", "Ln92/o;", "Lm92/p0;", "formatter", "", "minY", "maxY", "floor", "", "noOfAxes", "<init>", "(Lm92/p0;Ljava/lang/Float;Ljava/lang/Float;FI)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f125076e;

    public /* synthetic */ e(p0 p0Var, Float f14, Float f15, float f16, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(p0Var, f14, f15, (i15 & 8) != 0 ? 0.0f : f16, (i15 & 16) != 0 ? 5 : i14);
    }

    @Override // n92.o
    public final i53.f<o13.p<Float, String>> a() {
        Float fValueOf;
        Float fValueOf2 = this.f125095c;
        if (fValueOf2 == null || (fValueOf = this.f125094b) == null) {
            return j53.l.b();
        }
        int i14 = this.f125096d;
        float f14 = i14 - 1;
        float fFloatValue = f14 - ((fValueOf2.floatValue() - fValueOf.floatValue()) % f14);
        if (fFloatValue == f14) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 0.0f) {
            float fCeil = (float) Math.ceil(fFloatValue / 2);
            float fFloatValue2 = fValueOf.floatValue() - fCeil;
            Float fValueOf3 = Float.valueOf(fFloatValue2);
            float f15 = this.f125076e;
            if (fFloatValue2 < f15) {
                fCeil -= f15 - fFloatValue2;
                fValueOf = Float.valueOf(f15);
            } else {
                fValueOf = fValueOf3;
            }
            fValueOf2 = Float.valueOf((fFloatValue - fCeil) + fValueOf2.floatValue());
        }
        float fFloatValue3 = (fValueOf2.floatValue() - fValueOf.floatValue()) / f14;
        q13.b bVarB = w.b();
        for (int i15 = 0; i15 < i14; i15++) {
            float f16 = i15 * fFloatValue3;
            bVarB.add(new o13.p(Float.valueOf(fValueOf.floatValue() + f16), this.f125093a.a(fValueOf.floatValue() + f16)));
        }
        return i53.a.j(w.a(bVarB));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p0 p0Var, Float f14, Float f15, float f16, int i14) {
        super(p0Var, f14, f15, i14);
        p0Var.getClass();
        this.f125076e = f16;
    }
}
