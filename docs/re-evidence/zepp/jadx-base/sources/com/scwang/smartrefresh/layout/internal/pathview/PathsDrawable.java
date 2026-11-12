package com.scwang.smartrefresh.layout.internal.pathview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class PathsDrawable extends Drawable {
    private Bitmap a;
    private boolean b;
    public List<Integer> mColors;
    public int mOrginHeight;
    public List<Path> mOrginPaths;
    public List<String> mOrginSvgs;
    public int mOrginWidth;
    public Paint mPaint;
    public List<Path> mPaths;
    public static final Region REGION = new Region();
    public static final Region MAX_CLIP = new Region(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    public int mWidth = 1;
    public int mHeight = 1;
    public int mStartX = 0;
    public int mStartY = 0;

    public PathsDrawable() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(-15614977);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
    }

    private void a(Canvas canvas) {
        canvas.translate(-this.mStartX, -this.mStartY);
        if (this.mPaths != null) {
            for (int i = 0; i < this.mPaths.size(); i++) {
                List<Integer> list = this.mColors;
                if (list != null && i < list.size()) {
                    this.mPaint.setColor(this.mColors.get(i).intValue());
                }
                canvas.drawPath(this.mPaths.get(i), this.mPaint);
            }
        }
    }

    public boolean canReuseBitmap(int i, int i2) {
        return i == this.a.getWidth() && i2 == this.a.getHeight();
    }

    public boolean canReuseCache() {
        return !this.b;
    }

    public void createCachedBitmapIfNeeded(int i, int i2) {
        if (this.a == null || !canReuseBitmap(i, i2)) {
            this.a = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.b = true;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.mPaint.getAlpha() != 255) {
            createCachedBitmapIfNeeded(iWidth, iHeight);
            if (!canReuseCache()) {
                updateCachedBitmap(iWidth, iHeight);
                updateCacheStates();
            }
            canvas.drawBitmap(this.a, bounds.left, bounds.top, this.mPaint);
            return;
        }
        canvas.save();
        canvas.translate(bounds.left - this.mStartX, bounds.top - this.mStartY);
        if (this.mPaths != null) {
            for (int i = 0; i < this.mPaths.size(); i++) {
                List<Integer> list = this.mColors;
                if (list != null && i < list.size()) {
                    this.mPaint.setColor(this.mColors.get(i).intValue());
                }
                canvas.drawPath(this.mPaths.get(i), this.mPaint);
            }
            this.mPaint.setAlpha(255);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Paint getPaint() {
        return this.mPaint;
    }

    public int height() {
        return getBounds().height();
    }

    public void onMeasure() {
        Integer num;
        Integer numValueOf;
        Integer numValueOf2;
        List<Path> list = this.mPaths;
        Integer numValueOf3 = null;
        if (list != null) {
            Integer numValueOf4 = null;
            numValueOf = null;
            numValueOf2 = null;
            for (Path path : list) {
                Region region = REGION;
                region.setPath(path, MAX_CLIP);
                Rect bounds = region.getBounds();
                numValueOf3 = Integer.valueOf(Math.min(numValueOf3 == null ? bounds.top : numValueOf3.intValue(), bounds.top));
                numValueOf4 = Integer.valueOf(Math.min(numValueOf4 == null ? bounds.left : numValueOf4.intValue(), bounds.left));
                numValueOf = Integer.valueOf(Math.max(numValueOf == null ? bounds.right : numValueOf.intValue(), bounds.right));
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2 == null ? bounds.bottom : numValueOf2.intValue(), bounds.bottom));
            }
            num = numValueOf3;
            numValueOf3 = numValueOf4;
        } else {
            num = null;
            numValueOf = null;
            numValueOf2 = null;
        }
        this.mStartX = numValueOf3 == null ? 0 : numValueOf3.intValue();
        this.mStartY = num == null ? 0 : num.intValue();
        this.mWidth = numValueOf == null ? 0 : numValueOf.intValue() - this.mStartX;
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() - this.mStartY : 0;
        this.mHeight = iIntValue;
        if (this.mOrginWidth == 0) {
            this.mOrginWidth = this.mWidth;
        }
        if (this.mOrginHeight == 0) {
            this.mOrginHeight = iIntValue;
        }
        Rect bounds2 = getBounds();
        int i = bounds2.left;
        int i2 = bounds2.top;
        super.setBounds(i, i2, this.mWidth + i, this.mHeight + i2);
    }

    public void parserColors(int... iArr) {
        this.mColors = new ArrayList();
        for (int i : iArr) {
            this.mColors.add(Integer.valueOf(i));
        }
    }

    public void parserPaths(String... strArr) {
        this.mOrginHeight = 0;
        this.mOrginWidth = 0;
        this.mOrginSvgs = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.mOrginPaths = arrayList;
        this.mPaths = arrayList;
        for (String str : strArr) {
            this.mOrginSvgs.add(str);
            this.mOrginPaths.add(PathParser.e(str));
        }
        onMeasure();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        List<Path> list = this.mOrginPaths;
        if (list == null || list.size() <= 0 || (i5 == this.mWidth && i6 == this.mHeight)) {
            super.setBounds(i, i2, i3, i4);
        } else {
            this.mPaths = PathParser.j((i5 * 1.0f) / this.mOrginWidth, (i6 * 1.0f) / this.mOrginHeight, this.mOrginPaths, this.mOrginSvgs);
            onMeasure();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public void setGeometricHeight(int i) {
        Rect bounds = getBounds();
        float fHeight = (i * 1.0f) / bounds.height();
        setBounds((int) (bounds.left * fHeight), (int) (bounds.top * fHeight), (int) (bounds.right * fHeight), (int) (bounds.bottom * fHeight));
    }

    public void setGeometricWidth(int i) {
        Rect bounds = getBounds();
        float fWidth = (i * 1.0f) / bounds.width();
        setBounds((int) (bounds.left * fWidth), (int) (bounds.top * fWidth), (int) (bounds.right * fWidth), (int) (bounds.bottom * fWidth));
    }

    public void updateCacheStates() {
        this.b = false;
    }

    public void updateCachedBitmap(int i, int i2) {
        this.a.eraseColor(0);
        a(new Canvas(this.a));
    }

    public int width() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
        setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
