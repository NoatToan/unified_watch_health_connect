package l92;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.yalantis.ucrop.util.FastBitmapDrawable;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.TransformImageView;
import p005kotlin.Metadata;
import tn.k;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll92/c;", "Lcom/yalantis/ucrop/view/TransformImageView$TransformImageListener;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements TransformImageView.TransformImageListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureCropImageView f111596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f111597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f111598c;

    public c(GestureCropImageView gestureCropImageView, Rect rect, float f14) {
        this.f111596a = gestureCropImageView;
        this.f111597b = rect;
        this.f111598c = f14;
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onLoadComplete() {
        d.f111599a.getClass();
        final GestureCropImageView gestureCropImageView = this.f111596a;
        gestureCropImageView.getClass();
        if (gestureCropImageView.getMeasuredWidth() == 0 || gestureCropImageView.getMeasuredHeight() == 0) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "CropImageViewUtil", "uCropView is not laid out yet, can not setup scalability properly");
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "CropImageViewUtil", "setupCropViewScalability");
        final float width = gestureCropImageView.getWidth();
        final float targetAspectRatio = width / gestureCropImageView.getTargetAspectRatio();
        i2.a.b(a2Var2, "CropImageViewUtil", "width: " + width + ", height: " + targetAspectRatio);
        Drawable drawable = gestureCropImageView.getDrawable();
        FastBitmapDrawable fastBitmapDrawable = drawable instanceof FastBitmapDrawable ? (FastBitmapDrawable) drawable : null;
        Bitmap bitmap = fastBitmapDrawable != null ? fastBitmapDrawable.getBitmap() : null;
        boolean z14 = false;
        i2.a.b(a2Var2, "CropImageViewUtil", "bitmap is null: " + (bitmap == null));
        if (bitmap == null) {
            gestureCropImageView.post(new Runnable() { // from class: l92.b
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = d.f111599a;
                    GestureCropImageView gestureCropImageView2 = gestureCropImageView;
                    gestureCropImageView2.zoomInImage(gestureCropImageView2.getMinScale());
                    boolean z15 = false;
                    gestureCropImageView2.setImageToWrapCropBounds(false);
                    int iRound = Math.round(width / gestureCropImageView2.getMaxScale());
                    int iRound2 = Math.round(targetAspectRatio / gestureCropImageView2.getMaxScale());
                    String strE = k.e(iRound, iRound2, "minBitmapWidth=", ", minBitmapHeight=");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var3, "CropImageViewUtil", strE);
                    if (iRound > 0 && iRound2 > 0) {
                        z15 = true;
                    }
                    gestureCropImageView2.setScaleEnabled(z15);
                }
            });
            return;
        }
        final int width2 = bitmap.getWidth();
        final int height = bitmap.getHeight();
        i2.a.b(a2Var2, "CropImageViewUtil", k.e(width2, height, "bitmapWidth=", ", bitmapHeight="));
        float f14 = width2;
        float f15 = height;
        final float fMin = Math.min(Math.min(width / f14, width / f15), Math.min(targetAspectRatio / f15, targetAspectRatio / f14));
        float f16 = 10.0f * fMin;
        i2.a.b(a2Var2, "CropImageViewUtil", "maxScale:" + f16);
        int iRound = Math.round(width / f16);
        int iRound2 = Math.round(targetAspectRatio / f16);
        i2.a.b(a2Var2, "CropImageViewUtil", k.e(iRound, iRound2, "croppedWidth:", ", croppedHeight:"));
        if (iRound > 0 && iRound2 > 0) {
            z14 = true;
        }
        gestureCropImageView.setScaleEnabled(z14);
        final float f17 = this.f111598c;
        final Rect rect = this.f111597b;
        gestureCropImageView.post(new Runnable() { // from class: l92.a
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.f111599a;
                GestureCropImageView gestureCropImageView2 = gestureCropImageView;
                gestureCropImageView2.zoomInImage(fMin);
                float f18 = f17;
                gestureCropImageView2.postRotate(f18);
                gestureCropImageView2.setImageToWrapCropBounds(false);
                Rect rect2 = rect;
                if (rect2 != null) {
                    RectF rectF = new RectF(rect2);
                    float f19 = rectF.left;
                    float f22 = rectF.top;
                    int iWidth = rect2.width();
                    int iHeight = rect2.height();
                    StringBuilder sbI = e0.i("CropRect: left=", f19, ", top=", f22, ", width=");
                    sbI.append(iWidth);
                    sbI.append(", height=");
                    sbI.append(iHeight);
                    String string = sbI.toString();
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var3, "CropImageViewUtil", string);
                    float f24 = f18 % 180;
                    int i14 = width2;
                    int i15 = height;
                    int i16 = f24 == 0.0f ? i14 : i15;
                    if (f24 == 0.0f) {
                        i14 = i15;
                    }
                    i2.a.b(a2Var3, "CropImageViewUtil", k.e(i16, i14, "After rotation, bitmapWidth=", ", bitmapHeight="));
                    float fMin2 = Math.min(i16 / rectF.width(), i14 / rectF.height());
                    float currentScale = gestureCropImageView2.getCurrentScale() * fMin2;
                    gestureCropImageView2.zoomInImage(currentScale);
                    float currentScale2 = gestureCropImageView2.getCurrentScale();
                    StringBuilder sbI2 = e0.i("cropRect is ", fMin2, " times zoomed in than bitmap, so we need to zoom in ", currentScale, " in total here. Current scale after zoom in is ");
                    sbI2.append(currentScale2);
                    i2.a.b(a2Var3, "CropImageViewUtil", sbI2.toString());
                    float currentScale3 = gestureCropImageView2.getCurrentScale() * ((i16 / 2) - rectF.centerX());
                    float currentScale4 = gestureCropImageView2.getCurrentScale() * ((i14 / 2) - rectF.centerY());
                    gestureCropImageView2.postTranslate(currentScale3, currentScale4);
                    i2.a.b(a2Var3, "CropImageViewUtil", "Translate image with x: " + currentScale3 + ", y: " + currentScale4);
                    gestureCropImageView2.setImageToWrapCropBounds(false);
                }
            }
        });
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onLoadFailure(Exception exc) {
        exc.getClass();
        String strN = fb1.c.n("Load image failed with exception: ", exc.getMessage());
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "CropImageViewUtil", strN);
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onRotate(float f14) {
    }

    @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
    public final void onScale(float f14) {
    }
}
