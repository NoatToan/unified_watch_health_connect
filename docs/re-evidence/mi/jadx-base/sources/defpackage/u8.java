package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes4.dex */
public class u8 extends jb {
    public RectF f;

    public static RectF e(float[] fArr) {
        if (fArr.length != 4) {
            throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
        }
        float f = fArr[0];
        float f2 = fArr[1];
        return new RectF(f, f2, fArr[2] + f, fArr[3] + f2);
    }

    @Override // defpackage.jb
    public void a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f22602a;
        if (f2 > 0.01f) {
            c(canvas);
            RectF rectF = this.f;
            if (rectF != null) {
                float f3 = rectF.left;
                float f4 = this.c;
                canvas.clipRect(f3 * f4, rectF.top * f4, rectF.right * f4, rectF.bottom * f4);
            }
            for (int i = 0; i < getChildCount(); i++) {
                jb jbVar = (jb) getChildAt(i);
                jbVar.a(canvas, paint, f2);
                jbVar.markUpdateSeen();
            }
            b(canvas);
        }
    }

    @Override // defpackage.jb, defpackage.pej, defpackage.oej
    public boolean isVirtual() {
        return true;
    }

    @iej(name = "clipping")
    public void setClipping(ReadableArray readableArray) {
        float[] fArrB = gdi.b(readableArray);
        if (fArrB != null) {
            this.f = e(fArrB);
            markUpdated();
        }
    }
}
