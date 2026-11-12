package g81;

import am.x0;
import am.y0;
import java.util.Comparator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f76344a;

    public j(y0 y0Var) {
        this.f76344a = y0Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        int iR;
        String str = (String) ((Map.Entry) t7).getKey();
        y0 y0Var = this.f76344a;
        x0 x0VarJ = y0Var.j(y0Var.c(str));
        x0 x0Var = x0.f4304m;
        x0 x0VarD = y0Var.d(x0VarJ, x0Var);
        int iR2 = Integer.MAX_VALUE;
        if (x0VarD == x0Var) {
            iR = x0VarJ != null ? x0VarJ.r() : Integer.MAX_VALUE;
        } else {
            iR = x0VarD.r();
        }
        Integer numValueOf = Integer.valueOf(iR);
        x0 x0VarJ2 = y0Var.j(y0Var.c((String) ((Map.Entry) t14).getKey()));
        x0 x0VarD2 = y0Var.d(x0VarJ2, x0Var);
        if (x0VarD2 != x0Var) {
            iR2 = x0VarD2.r();
        } else if (x0VarJ2 != null) {
            iR2 = x0VarJ2.r();
        }
        return r13.a.b(numValueOf, Integer.valueOf(iR2));
    }
}
