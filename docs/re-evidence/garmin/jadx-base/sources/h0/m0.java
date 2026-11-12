package h0;

import android.graphics.Matrix;
import androidx.camera.core.impl.w2;

/* JADX INFO: loaded from: classes.dex */
public class m0 implements b0.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f80534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Matrix f80536c;

    public m0(long j8, int i14, Matrix matrix) {
        this.f80534a = j8;
        this.f80535b = i14;
        this.f80536c = matrix;
    }

    @Override // b0.m0
    public final w2 a() {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
    }

    @Override // b0.m0
    public final void c(j0.j.b bVar) {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
    }

    @Override // b0.m0
    public final Matrix d() {
        return new Matrix(this.f80536c);
    }

    @Override // b0.m0
    public final int e() {
        return this.f80535b;
    }

    @Override // b0.m0
    public final long getTimestamp() {
        return this.f80534a;
    }
}
