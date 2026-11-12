package n92;

import m92.p0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.w;
import v.e0;
import w5.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln92/h;", "Ln92/o;", "Lm92/p0;", "formatter", "", "maxY", "", "noOfAxes", "<init>", "(Lm92/p0;Ljava/lang/Float;I)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends o {
    public /* synthetic */ h(p0 p0Var, Float f14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(p0Var, (i15 & 2) != 0 ? null : f14, (i15 & 4) != 0 ? 5 : i14);
    }

    @Override // n92.o
    public final i53.f<o13.p<Float, String>> a() {
        Float f14 = this.f125095c;
        if (f14 == null || s.e(f14, 0.0f) || this.f125094b == null) {
            return j53.l.b();
        }
        int iFloatValue = ((int) f14.floatValue()) / (this.f125096d - 1);
        q13.b bVarB = w.b();
        int iFloatValue2 = (int) f14.floatValue();
        if (iFloatValue <= 0) {
            vb.h.s(e0.f(iFloatValue, "Step must be positive, was: ", "."));
            return null;
        }
        int i14 = 0;
        int iN = r.n(0, iFloatValue2, iFloatValue);
        if (iN >= 0) {
            while (true) {
                bVarB.add(new o13.p(Float.valueOf(i14), this.f125093a.a(i14)));
                if (i14 == iN) {
                    break;
                }
                i14 += iFloatValue;
            }
        }
        return i53.a.j(w.a(bVarB));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p0 p0Var, Float f14, int i14) {
        super(p0Var, Float.valueOf(0.0f), f14, i14);
        p0Var.getClass();
    }
}
