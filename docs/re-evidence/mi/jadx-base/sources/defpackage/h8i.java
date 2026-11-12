package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.view.b;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class h8i extends vtf {
    public static final PointF d = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f19803b;

    @GuardedBy("this")
    public Matrix c;

    public h8i(b bVar) {
        this.f19803b = bVar;
    }

    public void a(Size size, int i) {
        adp.a();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0) {
                    this.c = this.f19803b.c(size, i);
                    return;
                }
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
