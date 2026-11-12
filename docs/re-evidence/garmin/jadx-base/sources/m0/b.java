package m0;

import android.graphics.Matrix;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.w2;
import b0.m0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f115491a;

    public b(c0 c0Var) {
        this.f115491a = c0Var;
    }

    @Override // b0.m0
    public final w2 a() {
        return this.f115491a.a();
    }

    @Override // b0.m0
    public final int b() {
        int iOrdinal = this.f115491a.b().ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // b0.m0
    public final void c(j0.j.b bVar) {
        this.f115491a.c(bVar);
    }

    @Override // b0.m0
    public final Matrix d() {
        return new Matrix();
    }

    @Override // b0.m0
    public final int e() {
        return 0;
    }

    @Override // b0.m0
    public final long getTimestamp() {
        return this.f115491a.getTimestamp();
    }
}
