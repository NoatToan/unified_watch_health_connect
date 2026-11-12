package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface k0 extends b0.r {
    Set<b0.b0> a();

    void c(s sVar);

    List<Size> d(Range<Integer> range);

    boolean e();

    e1 f();

    default k0 getImplementation() {
        return this;
    }

    List<Size> getSupportedResolutions(int i14);

    Object i();

    i2 j();

    default Set<Integer> k() {
        return Collections.EMPTY_SET;
    }

    void l(Executor executor, j1.h hVar);

    x2 n();

    List<Size> p();

    String q();

    Set<Integer> s();

    Rect t();

    default void u(b0.v vVar) {
        b0.v vVar2 = z2.f5882a;
        vVar.getClass();
        z2.f5882a = vVar;
    }

    List<Size> v(int i14);

    default boolean w(e0.c cVar, b0.s0 s0Var) {
        for (d0.a aVar : cVar.f61821a) {
            if (!aVar.b(this, s0Var)) {
                aVar.toString();
                return false;
            }
        }
        try {
            z2.a(this, s0Var, cVar);
            return true;
        } catch (CameraUseCaseAdapter.CameraException | IllegalArgumentException unused) {
            return false;
        }
    }

    boolean x();
}
