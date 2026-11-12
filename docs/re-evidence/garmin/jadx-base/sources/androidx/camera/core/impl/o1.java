package androidx.camera.core.impl;

import android.view.Surface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface o1 {

    public interface a {
        void a(o1 o1Var);
    }

    androidx.camera.core.e a();

    androidx.camera.core.e b();

    void c();

    void close();

    void d(a aVar, Executor executor);

    int f();

    int g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
