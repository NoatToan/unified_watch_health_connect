package v;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    private y0() {
    }

    public static void a(androidx.camera.core.impl.s sVar, ArrayList arrayList) {
        if (sVar instanceof androidx.camera.core.impl.t.a) {
            Iterator it = ((androidx.camera.core.impl.t.a) sVar).f5752a.iterator();
            while (it.hasNext()) {
                a((androidx.camera.core.impl.s) it.next(), arrayList);
            }
        } else if (sVar instanceof x0) {
            arrayList.add(((x0) sVar).f174115a);
        } else {
            arrayList.add(new w0(sVar));
        }
    }
}
