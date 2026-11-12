package com.huawei.animationkit.computationalwallpaper.pattern.arranger;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.pattern.shape.Shape;
import com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat;
import defpackage.bdo;
import defpackage.bgh;
import defpackage.bgi;
import defpackage.bgj;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractArranger implements Arranger {
    private final Rect mBound = new Rect();
    private ColorResult mColor;
    private String mResource;
    private Shape mShape;

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void setBounds(Rect rect) {
        this.mBound.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void setShape(Shape shape) {
        this.mShape = shape;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void setColor(ColorResult colorResult) {
        this.mColor = colorResult;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public void setResource(String str) {
        this.mResource = str;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.pattern.arranger.Arranger
    public List<Integer> getFinalColors() throws bdo {
        ColorResult colorResult = this.mColor;
        if (colorResult == null) {
            return Collections.EMPTY_LIST;
        }
        if (this.mResource != null) {
            return getResourceColors();
        }
        return colorResult.getAllColors();
    }

    protected Rect getBound() {
        return this.mBound;
    }

    protected Shape getShape() {
        return this.mShape;
    }

    protected ColorResult getColor() {
        return this.mColor;
    }

    protected String getResource() {
        return this.mResource;
    }

    protected Bitmap getResourceBitmap(bgi bgiVar) throws bdo {
        VectorDrawableCompat vectorDrawableCompatD = bgj.d(this.mResource, bgiVar);
        bgh.e(vectorDrawableCompatD, this.mColor);
        return bgj.b(vectorDrawableCompatD);
    }

    protected List<Integer> getResourceColors() throws bdo {
        String str = this.mResource;
        if (str == null) {
            throw new bdo("resource is not set");
        }
        return bgh.e(bgj.d(str, null), this.mColor);
    }
}
