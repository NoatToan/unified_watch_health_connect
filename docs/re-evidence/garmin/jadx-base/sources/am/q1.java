package am;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f4166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f4167b;

    public /* synthetic */ q1(y0 y0Var, HashMap map) {
        this.f4166a = y0Var;
        this.f4167b = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        x0 x0Var = (x0) obj2;
        y0 y0Var = this.f4166a;
        to.o oVarF = y0Var.f((x0) obj);
        HashMap map = this.f4167b;
        Integer num = oVarF != null ? (Integer) map.get(oVarF.j()) : null;
        int size = (oVarF == null || num == null) ? map.size() : num.intValue();
        to.o oVarF2 = y0Var.f(x0Var);
        Integer num2 = oVarF2 != null ? (Integer) map.get(oVarF2.j()) : null;
        return size - ((oVarF2 == null || num2 == null) ? map.size() : num2.intValue());
    }
}
