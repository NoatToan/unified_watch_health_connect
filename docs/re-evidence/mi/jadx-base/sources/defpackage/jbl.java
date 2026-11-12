package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes4.dex */
public class jbl extends rbl.a {
    public static final rbl.b j = new jbl();

    @Override // rbl.a
    public void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(Math.min(f3, f4), 1.0f);
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
    }

    public String toString() {
        return "start_inside";
    }
}
