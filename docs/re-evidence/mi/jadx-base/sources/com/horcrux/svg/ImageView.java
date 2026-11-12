package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.apa;
import defpackage.cm8;
import defpackage.cp5;
import defpackage.iej;
import defpackage.j5d;
import defpackage.k22;
import defpackage.t14;
import defpackage.u14;
import defpackage.v5d;
import defpackage.v8q;
import defpackage.w14;
import defpackage.wqk;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"ViewConstructor"})
class ImageView extends RenderableView {
    private String mAlign;
    private SVGLength mH;
    private int mImageHeight;
    private int mImageWidth;
    private final AtomicBoolean mLoading;
    private int mMeetOrSlice;
    private SVGLength mW;
    private SVGLength mX;
    private SVGLength mY;
    private String uriString;

    public ImageView(ReactContext reactContext) {
        super(reactContext);
        this.mLoading = new AtomicBoolean(false);
    }

    private void doRender(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.mImageWidth == 0 || this.mImageHeight == 0) {
            this.mImageWidth = bitmap.getWidth();
            this.mImageHeight = bitmap.getHeight();
        }
        RectF rect = getRect();
        RectF rectF = new RectF(0.0f, 0.0f, this.mImageWidth, this.mImageHeight);
        ViewBox.getTransform(rectF, rect, this.mAlign, this.mMeetOrSlice).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        canvas.getMatrix().mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF getRect() {
        double dRelativeOnWidth = relativeOnWidth(this.mX);
        double dRelativeOnHeight = relativeOnHeight(this.mY);
        double dRelativeOnWidth2 = relativeOnWidth(this.mW);
        double dRelativeOnHeight2 = relativeOnHeight(this.mH);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.mImageWidth * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.mImageHeight * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    private void loadBitmap(j5d j5dVar, ImageRequest imageRequest) {
        this.mLoading.set(true);
        j5dVar.d(imageRequest, this.mContext).c(new k22() { // from class: com.horcrux.svg.ImageView.1
            @Override // defpackage.n62
            public void onFailureImpl(cp5<w14<u14>> cp5Var) {
                ImageView.this.mLoading.set(false);
                cm8.F("ReactNative", cp5Var.b(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
            }

            @Override // defpackage.k22
            public void onNewResultImpl(Bitmap bitmap) {
                ImageView.this.mLoading.set(false);
                SvgView svgView = ImageView.this.getSvgView();
                if (svgView != null) {
                    svgView.invalidate();
                }
            }
        }, v8q.g());
    }

    private void tryRenderFromBitmapCache(j5d j5dVar, ImageRequest imageRequest, Canvas canvas, Paint paint, float f) {
        cp5<w14<u14>> cp5VarG = j5dVar.g(imageRequest, this.mContext);
        try {
            try {
                w14<u14> result = cp5VarG.getResult();
                try {
                    if (result == null) {
                        cp5VarG.close();
                        return;
                    }
                    try {
                        u14 u14VarN = result.n();
                        if (!(u14VarN instanceof t14)) {
                            w14.l(result);
                            cp5VarG.close();
                            return;
                        }
                        Bitmap bitmapD = ((t14) u14VarN).d();
                        if (bitmapD == null) {
                            w14.l(result);
                            cp5VarG.close();
                        } else {
                            doRender(canvas, paint, bitmapD, f);
                            w14.l(result);
                            cp5VarG.close();
                        }
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                } catch (Throwable th) {
                    w14.l(result);
                    throw th;
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } catch (Throwable th2) {
            cp5VarG.close();
            throw th2;
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        if (this.mLoading.get()) {
            return;
        }
        j5d j5dVarA = apa.a();
        ImageRequest imageRequestA = ImageRequest.a(new v5d(this.mContext, this.uriString).e());
        if (j5dVarA.m(imageRequestA)) {
            tryRenderFromBitmapCache(j5dVarA, imageRequestA, canvas, paint, f * this.mOpacity);
        } else {
            loadBitmap(j5dVarA, imageRequestA);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addRect(getRect(), Path.Direction.CW);
        return path;
    }

    @iej(name = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
    }

    @iej(name = "height")
    public void setHeight(Dynamic dynamic) {
        this.mH = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.mMeetOrSlice = i;
        invalidate();
    }

    @iej(name = "src")
    public void setSrc(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
            this.uriString = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                this.mImageWidth = readableMap.getInt("width");
                this.mImageHeight = readableMap.getInt("height");
            } else {
                this.mImageWidth = 0;
                this.mImageHeight = 0;
            }
            if (Uri.parse(this.uriString).getScheme() == null) {
                wqk.b().e(this.mContext, this.uriString);
            }
        }
    }

    @iej(name = "width")
    public void setWidth(Dynamic dynamic) {
        this.mW = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "x")
    public void setX(Dynamic dynamic) {
        this.mX = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "y")
    public void setY(Dynamic dynamic) {
        this.mY = SVGLength.from(dynamic);
        invalidate();
    }
}
