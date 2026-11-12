package com.huami.watch.dataflow.chart.base;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes16.dex */
public class BitmapRenderer extends Renderer {
    public Bitmap a;
    public Shader b;

    public BitmapRenderer(Bitmap bitmap) {
        this.a = bitmap;
        this.paint = new Paint();
        BitmapShader bitmapShader = new BitmapShader(this.a, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        this.b = bitmapShader;
        this.paint.setShader(bitmapShader);
    }

    public int getHeight() {
        return this.a.getHeight();
    }

    public int getWidth() {
        return this.a.getWidth();
    }

    public void setBitmap(Bitmap bitmap) {
        this.paint.setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
    }

    public void setScale(float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2);
        this.b.setLocalMatrix(matrix);
    }
}
