package p43;

import ch.qos.logback.classic.spi.CallerData;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v0 extends f2 implements t43.j, t43.k {
    public v0() {
        super(null);
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public abstract v0 J0(boolean z14);

    @Override // p43.f2
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public abstract v0 L0(k1 k1Var);

    public String toString() throws IOException {
        StringBuilder sb3 = new StringBuilder();
        Iterator<u23.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", a43.n.f1166d.n(it.next(), null), "] "};
            for (int i14 = 0; i14 < 3; i14++) {
                sb3.append(strArr[i14]);
            }
        }
        sb3.append(F0());
        if (!D0().isEmpty()) {
            p13.h0.j0(D0(), sb3, ", ", "<", ">", null, 112);
        }
        if (G0()) {
            sb3.append(CallerData.NA);
        }
        return sb3.toString();
    }
}
