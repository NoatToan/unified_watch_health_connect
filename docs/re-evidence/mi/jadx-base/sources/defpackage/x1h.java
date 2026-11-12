package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;

/* JADX INFO: loaded from: classes.dex */
public class x1h extends a {
    public x1h(jte jteVar, Layer layer) {
        super(jteVar, layer);
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i) {
    }
}
