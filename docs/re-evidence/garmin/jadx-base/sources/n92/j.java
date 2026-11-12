package n92;

import m92.p0;
import p005kotlin.Metadata;
import p13.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln92/j;", "Ln92/o;", "Lm92/p0;", "formatter", "", "minY", "maxY", "", "noOfAxes", "<init>", "(Lm92/p0;Ljava/lang/Float;Ljava/lang/Float;I)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends o {
    public /* synthetic */ j(p0 p0Var, Float f14, Float f15, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(p0Var, f14, f15, (i15 & 8) != 0 ? 5 : i14);
    }

    @Override // n92.o
    public final i53.f<o13.p<Float, String>> a() {
        Float f14;
        Float f15 = this.f125095c;
        if (f15 == null || (f14 = this.f125094b) == null) {
            return j53.l.b();
        }
        float fFloatValue = f15.floatValue() - f14.floatValue();
        int i14 = this.f125096d;
        float f16 = fFloatValue / (i14 - 1);
        q13.b bVarB = w.b();
        for (int i15 = 0; i15 < i14; i15++) {
            float f17 = i15 * f16;
            bVarB.add(new o13.p(Float.valueOf(f14.floatValue() + f17), this.f125093a.a(f14.floatValue() + f17)));
        }
        return i53.a.j(w.a(bVarB));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p0 p0Var, Float f14, Float f15, int i14) {
        super(p0Var, f14, f15, i14);
        p0Var.getClass();
    }
}
