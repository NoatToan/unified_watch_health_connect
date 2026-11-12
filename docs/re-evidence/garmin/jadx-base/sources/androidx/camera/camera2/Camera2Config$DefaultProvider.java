package androidx.camera.camera2;

import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.h;
import androidx.camera.core.impl.w1;
import b0.y;
import t.a;
import t.b;
import t.c;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements y.b {
    @Override // b0.y.b
    public y getCameraXConfig() {
        a aVar = new a();
        b bVar = new b();
        c cVar = new c();
        y.a aVar2 = new y.a();
        h hVar = y.O;
        w1 w1Var = aVar2.f14121a;
        w1Var.X(hVar, aVar);
        w1Var.X(y.P, bVar);
        w1Var.X(y.Q, cVar);
        w1Var.X(y.Y, 0);
        w1Var.X(y.Z, Boolean.TRUE);
        return new y(a2.T(w1Var));
    }
}
