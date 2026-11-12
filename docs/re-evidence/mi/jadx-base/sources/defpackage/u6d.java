package defpackage;

import android.graphics.Matrix;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class u6d implements q4d {
    public static q4d e(uzo uzoVar, long j, int i, Matrix matrix) {
        return new ys1(uzoVar, j, i, matrix);
    }

    @Override // defpackage.q4d
    public abstract uzo a();

    @Override // defpackage.q4d
    public void b(ExifData.b bVar) {
        bVar.m(d());
    }

    @Override // defpackage.q4d
    public abstract Matrix c();

    @Override // defpackage.q4d
    public abstract int d();

    @Override // defpackage.q4d
    public abstract long getTimestamp();
}
