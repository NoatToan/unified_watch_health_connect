package defpackage;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.f;
import androidx.camera.core.m;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class m0m extends f {
    public final q4d c;
    public Rect d;
    public final int e;
    public final int f;

    public m0m(m mVar, q4d q4dVar) {
        this(mVar, null, q4dVar);
    }

    @Override // androidx.camera.core.f, androidx.camera.core.m
    public q4d H() {
        return this.c;
    }

    @Override // androidx.camera.core.f, androidx.camera.core.m
    public synchronized void a0(Rect rect) {
        if (rect != null) {
            try {
                Rect rect2 = new Rect(rect);
                if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                    rect2.setEmpty();
                }
                rect = rect2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = rect;
    }

    @Override // androidx.camera.core.f, androidx.camera.core.m
    public synchronized int getHeight() {
        return this.f;
    }

    @Override // androidx.camera.core.f, androidx.camera.core.m
    public synchronized int getWidth() {
        return this.e;
    }

    @Override // androidx.camera.core.f, androidx.camera.core.m
    public synchronized Rect k0() {
        if (this.d == null) {
            return new Rect(0, 0, getWidth(), getHeight());
        }
        return new Rect(this.d);
    }

    public m0m(m mVar, Size size, q4d q4dVar) {
        super(mVar);
        if (size == null) {
            this.e = super.getWidth();
            this.f = super.getHeight();
        } else {
            this.e = size.getWidth();
            this.f = size.getHeight();
        }
        this.c = q4dVar;
    }
}
