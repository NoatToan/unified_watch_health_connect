package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5210c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f5211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f5212b;

    public q(ProgressBar progressBar) {
        this.f5211a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i14) {
        ProgressBar progressBar = this.f5211a;
        w0 w0VarG = w0.g(progressBar.getContext(), attributeSet, f5210c, i14, 0);
        Drawable drawableC = w0VarG.c(0);
        if (drawableC != null) {
            if (drawableC instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableC;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i15 = 0; i15 < numberOfFrames; i15++) {
                    Drawable drawableB = b(animationDrawable.getFrame(i15), true);
                    drawableB.setLevel(10000);
                    animationDrawable2.addFrame(drawableB, animationDrawable.getDuration(i15));
                }
                animationDrawable2.setLevel(10000);
                drawableC = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableC);
        }
        Drawable drawableC2 = w0VarG.c(1);
        if (drawableC2 != null) {
            progressBar.setProgressDrawable(b(drawableC2, false));
        }
        w0VarG.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z14) {
        if (drawable instanceof d7.c) {
            d7.c cVar = (d7.c) drawable;
            Drawable drawableB = cVar.b();
            if (drawableB != null) {
                b(drawableB, z14);
                cVar.a();
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i14 = 0; i14 < numberOfLayers; i14++) {
                    int id3 = layerDrawable.getId(i14);
                    drawableArr[i14] = b(layerDrawable.getDrawable(i14), id3 == 16908301 || id3 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i15 = 0; i15 < numberOfLayers; i15++) {
                    layerDrawable2.setId(i15, layerDrawable.getId(i15));
                    layerDrawable2.setLayerGravity(i15, layerDrawable.getLayerGravity(i15));
                    layerDrawable2.setLayerWidth(i15, layerDrawable.getLayerWidth(i15));
                    layerDrawable2.setLayerHeight(i15, layerDrawable.getLayerHeight(i15));
                    layerDrawable2.setLayerInsetLeft(i15, layerDrawable.getLayerInsetLeft(i15));
                    layerDrawable2.setLayerInsetRight(i15, layerDrawable.getLayerInsetRight(i15));
                    layerDrawable2.setLayerInsetTop(i15, layerDrawable.getLayerInsetTop(i15));
                    layerDrawable2.setLayerInsetBottom(i15, layerDrawable.getLayerInsetBottom(i15));
                    layerDrawable2.setLayerInsetStart(i15, layerDrawable.getLayerInsetStart(i15));
                    layerDrawable2.setLayerInsetEnd(i15, layerDrawable.getLayerInsetEnd(i15));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f5212b == null) {
                    this.f5212b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z14 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
