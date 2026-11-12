package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.byq;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f3088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f3089b;
    public static final boolean c;

    public static class a implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f3090a = new float[9];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f3091b = new float[9];
        public final Matrix c = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f3090a);
            matrix2.getValues(this.f3091b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f3091b;
                float f2 = fArr[i];
                float f3 = this.f3090a[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.c.setValues(this.f3091b);
            return this.c;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f3088a = true;
        f3089b = true;
        c = i >= 28;
    }

    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        byq.j(view, matrix);
        byq.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmapB = b(view, matrix, rectF, viewGroup);
        if (bitmapB != null) {
            imageView.setImageBitmap(bitmapB);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    public static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean zIsAttachedToWindow;
        int iIndexOfChild;
        ViewGroup viewGroup2;
        if (f3088a) {
            z = !view.isAttachedToWindow();
            zIsAttachedToWindow = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z = false;
            zIsAttachedToWindow = false;
        }
        boolean z2 = f3089b;
        Bitmap bitmapCreateBitmap = null;
        if (!z2 || !z) {
            iIndexOfChild = 0;
            viewGroup2 = null;
        } else {
            if (!zIsAttachedToWindow) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            iIndexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int iRound = Math.round(rectF.width());
        int iRound2 = Math.round(rectF.height());
        if (iRound > 0 && iRound2 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            int iRound3 = Math.round(iRound * fMin);
            int iRound4 = Math.round(iRound2 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (c) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = Bitmap.createBitmap(picture);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iRound3, iRound4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z2 && z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
