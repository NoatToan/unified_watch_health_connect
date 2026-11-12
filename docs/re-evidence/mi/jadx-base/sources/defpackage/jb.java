package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jb extends pej {
    public static final float[] d = new float[9];
    public static final float[] e = new float[9];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22602a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f22603b = new Matrix();
    public final float c = iz6.f().density;

    public abstract void a(Canvas canvas, Paint paint, float f);

    public void b(Canvas canvas) {
        canvas.restore();
    }

    public final void c(Canvas canvas) {
        canvas.save();
        Matrix matrix = this.f22603b;
        if (matrix != null) {
            canvas.concat(matrix);
        }
    }

    public void d() {
        float[] fArr = e;
        float[] fArr2 = d;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[2];
        float f = fArr2[4];
        float f2 = this.c;
        fArr[2] = f * f2;
        fArr[3] = fArr2[1];
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[5] * f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        if (this.f22603b == null) {
            this.f22603b = new Matrix();
        }
        this.f22603b.setValues(fArr);
    }

    @Override // defpackage.pej, defpackage.oej
    public boolean isVirtual() {
        return true;
    }

    @iej(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.f22602a = f;
        markUpdated();
    }

    @iej(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int iA = gdi.a(readableArray, d);
            if (iA == 6) {
                d();
            } else if (iA != -1) {
                throw new JSApplicationIllegalArgumentException("Transform matrices must be of size 6");
            }
        } else {
            this.f22603b = null;
        }
        markUpdated();
    }
}
