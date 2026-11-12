package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.model.layer.Layer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class gy extends BaseLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gs f36213a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final em f36214c;

    public gy(LottieDrawable lottieDrawable, Layer layer, gs gsVar, cx cxVar) {
        super(lottieDrawable, layer);
        this.f36213a = gsVar;
        em emVar = new em(lottieDrawable, this, new go("__container", layer.l(), false), cxVar);
        this.f36214c = emVar;
        emVar.setContents(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        this.f36214c.draw(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.f36214c.getBounds(rectF, this.boundsMatrix, z);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public ge getBlurEffect() {
        ge blurEffect = super.getBlurEffect();
        return blurEffect != null ? blurEffect : this.f36213a.getBlurEffect();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public ho getDropShadowEffect() {
        ho dropShadowEffect = super.getDropShadowEffect();
        return dropShadowEffect != null ? dropShadowEffect : this.f36213a.getDropShadowEffect();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void resolveChildKeyPath(fo foVar, int i, List<fo> list, fo foVar2) {
        this.f36214c.resolveKeyPath(foVar, i, list, foVar2);
    }
}
