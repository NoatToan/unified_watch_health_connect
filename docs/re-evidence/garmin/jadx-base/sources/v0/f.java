package v0;

import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.x0;
import java.util.List;
import m0.n;

/* JADX INFO: loaded from: classes.dex */
public class f implements b3<d>, n1, n {
    public static final androidx.camera.core.impl.h O = x0.a.a(List.class, "camerax.core.streamSharing.captureTypes");
    public final a2 N;

    public f(a2 a2Var) {
        this.N = a2Var;
    }

    @Override // androidx.camera.core.impl.j2
    public final x0 getConfig() {
        return this.N;
    }
}
