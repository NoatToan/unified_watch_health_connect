package defpackage;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.m;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface p5d {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface a {
        void a(p5d p5dVar);
    }

    Surface a();

    int b();

    int c();

    void close();

    void d(a aVar, Executor executor);

    m e();

    m g();

    int getHeight();

    int getWidth();

    void h();
}
