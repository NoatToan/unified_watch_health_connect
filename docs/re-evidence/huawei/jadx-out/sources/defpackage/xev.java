package defpackage;

import android.graphics.Canvas;
import android.util.Log;
import android.widget.ImageView;
import com.huawei.uikit.hwimageview.widget.HwParallaxStyle;

/* JADX INFO: loaded from: classes44.dex */
public class xev implements HwParallaxStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52808c;
    private int d;
    private int e;
    private boolean j = false;

    private boolean b(ImageView imageView) {
        if (!this.j) {
            c(imageView);
        }
        if (imageView.getScaleType() != ImageView.ScaleType.CENTER_CROP) {
            Log.e("HwVerticalOffsetStyle", "isSupportable: Unsupported ImageView Scale Type, parallax only support CENTER_CROP.");
        }
        if (this.d <= 0 || this.e <= 0) {
            Log.e("HwVerticalOffsetStyle", "isSupportable: Unsupported ImagView: ImageView's height and width should greater than 0.");
        }
        return this.d * this.f52807b < this.e * this.f52806a;
    }

    private void c(ImageView imageView) {
        this.d = imageView.getDrawable().getIntrinsicWidth();
        this.e = imageView.getDrawable().getIntrinsicHeight();
        this.f52806a = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        this.f52807b = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        this.j = true;
    }

    @Override // com.huawei.uikit.hwimageview.widget.HwParallaxStyle
    public void onAttachedToImageView(ImageView imageView) {
    }

    @Override // com.huawei.uikit.hwimageview.widget.HwParallaxStyle
    public void onDetachedFromImageView(ImageView imageView) {
    }

    @Override // com.huawei.uikit.hwimageview.widget.HwParallaxStyle
    public void transform(ImageView imageView, Canvas canvas, int[] iArr, int[] iArr2) {
        if (imageView == null || canvas == null || iArr == null || iArr2 == null) {
            Log.w("HwVerticalOffsetStyle", "transform: input params contains null");
            return;
        }
        if (iArr.length <= 1 || iArr2.length <= 1) {
            return;
        }
        int i = iArr[1];
        this.f52808c = iArr2[1];
        if (b(imageView)) {
            if (i < 0) {
                i = 0;
            } else {
                int i2 = this.f52808c - this.f52807b;
                if (i > i2) {
                    i = i2;
                } else {
                    Log.w("HwVerticalOffsetStyle", "transform: do not handle");
                }
            }
            int i3 = this.d;
            float fAbs = Math.abs(((this.e * (i3 == 0 ? 1.0f : this.f52806a / i3)) - this.f52807b) * 0.5f);
            int i4 = this.f52807b;
            int i5 = this.f52808c;
            int i6 = i4 - i5;
            if (i6 != 0) {
                canvas.translate(0.0f, (fAbs * ((i * 2) - (i5 - i4))) / i6);
            }
        }
    }
}
