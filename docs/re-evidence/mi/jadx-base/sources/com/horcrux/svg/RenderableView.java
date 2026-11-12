package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import defpackage.iej;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RenderableView extends VirtualView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    private ArrayList<String> mAttributeList;
    private ArrayList<String> mLastMergedList;
    private ArrayList<Object> mOriginProperties;
    private ArrayList<String> mPropList;
    public ReadableArray stroke;
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.ROUND;
        this.strokeLinejoin = Paint.Join.ROUND;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private static double saturate(double d) {
        double d2 = 0.0d;
        if (d > 0.0d) {
            d2 = 1.0d;
            if (d < 1.0d) {
                return d;
            }
        }
        return d2;
    }

    private boolean setupFillPaint(Paint paint, float f) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f, this.fill);
        return true;
    }

    private void setupPaint(Paint paint, float f, ReadableArray readableArray) {
        int i = readableArray.getInt(0);
        if (i == 0) {
            if (readableArray.size() != 2) {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f) * 255.0d : f * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                return;
            } else {
                int i2 = readableArray.getInt(1);
                paint.setColor((Math.round((i2 >>> 24) * f) << 24) | (i2 & 16777215));
                return;
            }
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            paint.setColor(getSvgView().mTintColor);
        } else {
            Brush definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
            if (definedBrush != null) {
                definedBrush.setupPaint(paint, this.mBox, this.mScale, f);
            }
        }
    }

    private boolean setupStrokePaint(Paint paint, float f) {
        ReadableArray readableArray;
        paint.reset();
        double dRelativeOnOther = relativeOnOther(this.strokeWidth);
        if (dRelativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) dRelativeOnOther);
        setupPaint(paint, f, this.stroke);
        SVGLength[] sVGLengthArr = this.strokeDasharray;
        if (sVGLengthArr == null) {
            return true;
        }
        int length = sVGLengthArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) relativeOnOther(this.strokeDasharray[i]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }

    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.mOpacity;
        if (f2 > 0.01f) {
            boolean z = ((VirtualView) this).mPath == null;
            if (z) {
                Path path = getPath(canvas, paint);
                ((VirtualView) this).mPath = path;
                path.setFillType(this.fillRule);
            }
            boolean z2 = this.vectorEffect == 1;
            Path path2 = ((VirtualView) this).mPath;
            if (z2) {
                path2 = new Path();
                ((VirtualView) this).mPath.transform(canvas.getMatrix(), path2);
                canvas.setMatrix(null);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.mBox = new RectF(rectF);
            new Matrix(canvas.getMatrix()).mapRect(rectF);
            setClientRect(rectF);
            clip(canvas, paint);
            if (setupFillPaint(paint, this.fillOpacity * f2)) {
                if (z) {
                    Path path3 = new Path();
                    this.mFillPath = path3;
                    paint.getFillPath(path2, path3);
                }
                canvas.drawPath(path2, paint);
            }
            if (setupStrokePaint(paint, f2 * this.strokeOpacity)) {
                if (z) {
                    Path path4 = new Path();
                    this.mStrokePath = path4;
                    paint.getFillPath(path2, path4);
                }
                canvas.drawPath(path2, paint);
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    public Region getRegion(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Path path;
        Path path2;
        Path path3;
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            if (this.mRegion == null && (path3 = this.mFillPath) != null) {
                this.mRegion = getRegion(path3);
            }
            if (this.mRegion == null && (path2 = ((VirtualView) this).mPath) != null) {
                this.mRegion = getRegion(path2);
            }
            if (this.mStrokeRegion == null && (path = this.mStrokePath) != null) {
                this.mStrokeRegion = getRegion(path);
            }
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                Path clipPath = getClipPath();
                if (clipPath != null) {
                    if (this.mClipRegionPath != clipPath) {
                        this.mClipRegionPath = clipPath;
                        this.mClipRegion = getRegion(clipPath);
                    }
                    if (!this.mClipRegion.contains(iRound, iRound2)) {
                        return -1;
                    }
                }
                return getId();
            }
        }
        return -1;
    }

    public void mergeProperties(RenderableView renderableView) {
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i = 0; i < size; i++) {
            try {
                String str = attributeList.get(i);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        this.mLastMergedList = attributeList;
    }

    @Override // com.horcrux.svg.VirtualView
    public void render(Canvas canvas, Paint paint, float f) {
        MaskView maskView = this.mMask != null ? (MaskView) getSvgView().getDefinedMask(this.mMask) : null;
        if (maskView == null) {
            draw(canvas, paint, f);
            return;
        }
        Rect clipBounds = canvas.getClipBounds();
        int iHeight = clipBounds.height();
        int iWidth = clipBounds.width();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, config);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iWidth, iHeight, config);
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(iWidth, iHeight, config);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Canvas canvas3 = new Canvas(bitmapCreateBitmap);
        Canvas canvas4 = new Canvas(bitmapCreateBitmap3);
        canvas3.clipRect((float) relativeOnWidth(maskView.mX), (float) relativeOnWidth(maskView.mY), (float) relativeOnWidth(maskView.mW), (float) relativeOnWidth(maskView.mH));
        Paint paint2 = new Paint(1);
        maskView.draw(canvas3, paint2, 1.0f);
        int i = iWidth * iHeight;
        int[] iArr = new int[i];
        bitmapCreateBitmap.getPixels(iArr, 0, iWidth, 0, 0, iWidth, iHeight);
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2];
            iArr[i2] = ((int) (((double) (i3 >>> 24)) * saturate((((((double) ((i3 >> 16) & 255)) * 0.299d) + (((double) ((i3 >> 8) & 255)) * 0.587d)) + (((double) (i3 & 255)) * 0.144d)) / 255.0d))) << 24;
            i2++;
            i = i;
            paint2 = paint2;
        }
        Paint paint3 = paint2;
        bitmapCreateBitmap.setPixels(iArr, 0, iWidth, 0, 0, iWidth, iHeight);
        draw(canvas2, paint, f);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas4.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
        canvas4.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint3);
        canvas.drawBitmap(bitmapCreateBitmap3, 0.0f, 0.0f, paint);
    }

    public void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @iej(name = "fill")
    public void setFill(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Array)) {
            this.fill = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            int i = 0;
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    d /= 255.0d;
                }
                javaOnlyArray.pushDouble(d);
                i = i2;
            }
            this.fill = javaOnlyArray;
        }
        invalidate();
    }

    @iej(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(float f) {
        this.fillOpacity = f;
        invalidate();
    }

    @iej(defaultInt = 1, name = "fillRule")
    public void setFillRule(int i) {
        if (i == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i != 1) {
            throw new JSApplicationIllegalArgumentException("fillRule " + this.fillRule + " unrecognized");
        }
        invalidate();
    }

    @iej(name = "propList")
    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.mPropList.add(readableArray.getString(i));
            }
        }
        invalidate();
    }

    @iej(name = "stroke")
    public void setStroke(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Array)) {
            this.stroke = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                javaOnlyArray.pushDouble(Double.parseDouble(matcher.group()));
            }
            this.stroke = javaOnlyArray;
        }
        invalidate();
    }

    @iej(name = "strokeDasharray")
    public void setStrokeDasharray(ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            this.strokeDasharray = new SVGLength[size];
            for (int i = 0; i < size; i++) {
                this.strokeDasharray[i] = SVGLength.from(readableArray.getDynamic(i));
            }
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    @iej(name = "strokeDashoffset")
    public void setStrokeDashoffset(float f) {
        this.strokeDashoffset = f * this.mScale;
        invalidate();
    }

    @iej(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(int i) {
        if (i == 0) {
            this.strokeLinecap = Paint.Cap.BUTT;
        } else if (i == 1) {
            this.strokeLinecap = Paint.Cap.ROUND;
        } else {
            if (i != 2) {
                throw new JSApplicationIllegalArgumentException("strokeLinecap " + this.strokeLinecap + " unrecognized");
            }
            this.strokeLinecap = Paint.Cap.SQUARE;
        }
        invalidate();
    }

    @iej(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(int i) {
        if (i == 0) {
            this.strokeLinejoin = Paint.Join.MITER;
        } else if (i == 1) {
            this.strokeLinejoin = Paint.Join.ROUND;
        } else {
            if (i != 2) {
                throw new JSApplicationIllegalArgumentException("strokeLinejoin " + this.strokeLinejoin + " unrecognized");
            }
            this.strokeLinejoin = Paint.Join.BEVEL;
        }
        invalidate();
    }

    @iej(defaultFloat = BaseMapView.TRACE_WIDTH, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(float f) {
        this.strokeMiterlimit = f;
        invalidate();
    }

    @iej(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(float f) {
        this.strokeOpacity = f;
        invalidate();
    }

    @iej(name = "strokeWidth")
    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = SVGLength.from(dynamic);
        invalidate();
    }

    @iej(name = "vectorEffect")
    public void setVectorEffect(int i) {
        this.vectorEffect = i;
        invalidate();
    }
}
