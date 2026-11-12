package defpackage;

import android.graphics.Matrix;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ze3 implements q4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye3 f41183a;

    public ze3(ye3 ye3Var) {
        this.f41183a = ye3Var;
    }

    @Override // defpackage.q4d
    public uzo a() {
        return this.f41183a.a();
    }

    @Override // defpackage.q4d
    public void b(ExifData.b bVar) {
        this.f41183a.b(bVar);
    }

    @Override // defpackage.q4d
    public Matrix c() {
        return new Matrix();
    }

    @Override // defpackage.q4d
    public int d() {
        return 0;
    }

    public ye3 e() {
        return this.f41183a;
    }

    @Override // defpackage.q4d
    public long getTimestamp() {
        return this.f41183a.getTimestamp();
    }
}
