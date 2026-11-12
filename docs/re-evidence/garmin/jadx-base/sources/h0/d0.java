package h0;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.w2;
import b0.a1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class d0 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f80462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f80463b;

    public d0(o1 o1Var) {
        this.f80462a = o1Var;
    }

    @Override // androidx.camera.core.impl.o1
    public final androidx.camera.core.e a() {
        return e(this.f80462a.a());
    }

    @Override // androidx.camera.core.impl.o1
    public final androidx.camera.core.e b() {
        return e(this.f80462a.b());
    }

    @Override // androidx.camera.core.impl.o1
    public final void c() {
        this.f80462a.c();
    }

    @Override // androidx.camera.core.impl.o1
    public final void close() {
        this.f80462a.close();
    }

    @Override // androidx.camera.core.impl.o1
    public final void d(o1.a aVar, Executor executor) {
        this.f80462a.d(new com.google.android.exoplayer2.analytics.q(29, this, aVar), executor);
    }

    public final a1 e(androidx.camera.core.e eVar) {
        w2 w2Var;
        if (eVar == null) {
            return null;
        }
        if (this.f80463b == null) {
            w2Var = w2.f5840b;
        } else {
            j0 j0Var = this.f80463b;
            Pair pair = new Pair(j0Var.f80517j, j0Var.f80518k.get(0));
            w2 w2Var2 = w2.f5840b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            w2Var = new w2(arrayMap);
        }
        this.f80463b = null;
        return new a1(eVar, new Size(eVar.getWidth(), eVar.getHeight()), new m0.b(new v0.i(w2Var, eVar.A0().getTimestamp())));
    }

    @Override // androidx.camera.core.impl.o1
    public final int f() {
        return this.f80462a.f();
    }

    @Override // androidx.camera.core.impl.o1
    public final int g() {
        return this.f80462a.g();
    }

    @Override // androidx.camera.core.impl.o1
    public final int getHeight() {
        return this.f80462a.getHeight();
    }

    @Override // androidx.camera.core.impl.o1
    public final Surface getSurface() {
        return this.f80462a.getSurface();
    }

    @Override // androidx.camera.core.impl.o1
    public final int getWidth() {
        return this.f80462a.getWidth();
    }
}
