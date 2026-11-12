package p006l2;

import b2.e;
import i3.e5;
import s5.c;
import x5.c0;
import x5.q0;
import x5.r0;

/* JADX INFO: loaded from: classes.dex */
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t3 f108807a;

    static {
        c0.f188826a.getClass();
        f108807a = new t3(c0.a.f188828b, 0, 0);
    }

    public static final q0 a(r0 r0Var, c cVar) {
        q0 q0VarA = r0Var.a(cVar);
        int length = cVar.f157138b.length();
        c cVar2 = q0VarA.f188939a;
        c0 c0Var = q0VarA.f188940b;
        int length2 = cVar2.f157138b.length();
        int iMin = Math.min(length, 100);
        for (int i14 = 0; i14 < iMin; i14++) {
            b(c0Var.b(i14), length2, i14);
        }
        b(c0Var.b(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i15 = 0; i15 < iMin2; i15++) {
            c(c0Var.a(i15), length, i15);
        }
        c(c0Var.a(length2), length, length2);
        return new q0(cVar2, new t3(c0Var, cVar.f157138b.length(), cVar2.f157138b.length()));
    }

    public static final void b(int i14, int i15, int i16) {
        boolean z14 = false;
        if (i14 >= 0 && i14 <= i15) {
            z14 = true;
        }
        if (z14) {
            return;
        }
        StringBuilder sbJ = e5.j(i16, i14, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbJ.append(i15);
        sbJ.append(']');
        e.c(sbJ.toString());
    }

    public static final void c(int i14, int i15, int i16) {
        boolean z14 = false;
        if (i14 >= 0 && i14 <= i15) {
            z14 = true;
        }
        if (z14) {
            return;
        }
        StringBuilder sbJ = e5.j(i16, i14, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbJ.append(i15);
        sbJ.append(']');
        e.c(sbJ.toString());
    }
}
