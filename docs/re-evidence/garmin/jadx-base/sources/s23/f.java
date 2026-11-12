package s23;

import java.util.ArrayList;
import java.util.List;
import t23.c0;
import t23.h0;

/* JADX INFO: loaded from: classes3.dex */
public class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f156254a = new f();

    @Override // e23.l
    public final Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        g.a aVar = g.f156255d;
        c0Var.getClass();
        List<h0> listX = c0Var.d0(g.f156257f).x();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listX) {
            if (obj2 instanceof q23.b) {
                arrayList.add(obj2);
            }
        }
        return (t23.l) p13.h0.b0(arrayList);
    }
}
