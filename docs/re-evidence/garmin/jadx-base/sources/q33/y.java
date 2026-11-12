package q33;

import java.util.Map;
import t23.y0;
import t23.z0;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l33.e0 f142540b;

    public y(l33.e0 e0Var) {
        e0Var.getClass();
        this.f142540b = e0Var;
    }

    @Override // t23.y0
    public final z0.a a() {
        z0.a aVar = z0.f162077a;
        aVar.getClass();
        return aVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        l33.e0 e0Var = this.f142540b;
        sb3.append(e0Var);
        sb3.append(": ");
        sb3.append(((Map) gl1.d.B(e0Var.f109729i, l33.e0.f109726m[0])).keySet());
        return sb3.toString();
    }
}
