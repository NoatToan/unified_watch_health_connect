package g81;

import am.x0;
import am.z0;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class r<T> implements Comparator {
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iR;
        g gVar = (g) t7;
        x0 x0Var = gVar.f76330f;
        x0 x0VarM = z0.m(x0Var != null ? x0Var.f4358a : null);
        x0 x0VarG = x0VarM != null ? z0.g(x0VarM) : null;
        x0 x0Var2 = x0.f4304m;
        int iR2 = Integer.MAX_VALUE;
        if (x0VarG == x0Var2) {
            x0 x0Var3 = gVar.f76330f;
            if (x0Var3 != null) {
                iR = x0Var3.r();
            } else {
                iR = Integer.MAX_VALUE;
            }
        } else if (x0VarG != null) {
            iR = x0VarG.r();
        } else {
            iR = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iR);
        g gVar2 = (g) t14;
        x0 x0Var4 = gVar2.f76330f;
        x0 x0VarM2 = z0.m(x0Var4 != null ? x0Var4.f4358a : null);
        x0 x0VarG2 = x0VarM2 != null ? z0.g(x0VarM2) : null;
        if (x0VarG2 == x0Var2) {
            x0 x0Var5 = gVar2.f76330f;
            if (x0Var5 != null) {
                iR2 = x0Var5.r();
            }
        } else if (x0VarG2 != null) {
            iR2 = x0VarG2.r();
        }
        return r13.a.b(numValueOf, Integer.valueOf(iR2));
    }
}
