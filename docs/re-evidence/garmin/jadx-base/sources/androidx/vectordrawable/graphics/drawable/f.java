package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b7.j;
import com.google.android.flexbox.FlexItem;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f11201j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f11202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f11203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f11204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f11207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f11208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f11209i;

    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public f(h hVar) {
        this.f11206f = true;
        this.f11207g = new float[9];
        this.f11208h = new Matrix();
        this.f11209i = new Rect();
        this.f11202b = hVar;
        this.f11203c = b(hVar.f11253c, hVar.f11254d);
    }

    public static f a(int i14, Resources.Theme theme, Resources resources) {
        f fVar = new f();
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        fVar.f11200a = resources.getDrawable(i14, theme);
        new i(fVar.f11200a.getConstantState());
        return fVar;
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f11200a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f11209i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f11204d;
        if (colorFilter == null) {
            colorFilter = this.f11203c;
        }
        Matrix matrix = this.f11208h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f11207g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        h hVar = this.f11202b;
        Bitmap bitmap = hVar.f11256f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != hVar.f11256f.getHeight()) {
            hVar.f11256f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            hVar.f11261k = true;
        }
        boolean z14 = this.f11206f;
        h hVar2 = this.f11202b;
        if (!z14) {
            hVar2.f11256f.eraseColor(0);
            Canvas canvas2 = new Canvas(hVar2.f11256f);
            g gVar = hVar2.f11252b;
            gVar.a(gVar.f11242g, g.f11235p, canvas2, iMin, iMin2);
        } else if (hVar2.f11261k || hVar2.f11257g != hVar2.f11253c || hVar2.f11258h != hVar2.f11254d || hVar2.f11260j != hVar2.f11255e || hVar2.f11259i != hVar2.f11252b.getRootAlpha()) {
            h hVar3 = this.f11202b;
            hVar3.f11256f.eraseColor(0);
            Canvas canvas3 = new Canvas(hVar3.f11256f);
            g gVar2 = hVar3.f11252b;
            gVar2.a(gVar2.f11242g, g.f11235p, canvas3, iMin, iMin2);
            h hVar4 = this.f11202b;
            hVar4.f11257g = hVar4.f11253c;
            hVar4.f11258h = hVar4.f11254d;
            hVar4.f11259i = hVar4.f11252b.getRootAlpha();
            hVar4.f11260j = hVar4.f11255e;
            hVar4.f11261k = false;
        }
        h hVar5 = this.f11202b;
        if (hVar5.f11252b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (hVar5.f11262l == null) {
                Paint paint2 = new Paint();
                hVar5.f11262l = paint2;
                paint2.setFilterBitmap(true);
            }
            hVar5.f11262l.setAlpha(hVar5.f11252b.getRootAlpha());
            hVar5.f11262l.setColorFilter(colorFilter);
            paint = hVar5.f11262l;
        }
        canvas.drawBitmap(hVar5.f11256f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getAlpha() : this.f11202b.f11252b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f11202b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getColorFilter() : this.f11204d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f11200a != null) {
            return new i(this.f11200a.getConstantState());
        }
        this.f11202b.f11251a = getChangingConfigurations();
        return this.f11202b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f11202b.f11252b.f11244i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f11202b.f11252b.f11243h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i14;
        int i15;
        boolean z14;
        int i16;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f11202b;
        hVar.f11252b = new g();
        TypedArray typedArrayF = j.f(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11181a);
        h hVar2 = this.f11202b;
        g gVar = hVar2.f11252b;
        int iD = j.d(typedArrayF, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i17 = 3;
        if (iD == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iD != 5) {
            if (iD != 9) {
                switch (iD) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        hVar2.f11254d = mode;
        int i18 = 1;
        ColorStateList colorStateListB = j.b(typedArrayF, xmlPullParser, theme, 1);
        if (colorStateListB != null) {
            hVar2.f11253c = colorStateListB;
        }
        boolean z15 = hVar2.f11255e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z15 = typedArrayF.getBoolean(5, z15);
        }
        hVar2.f11255e = z15;
        float f14 = gVar.f11245j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f14 = typedArrayF.getFloat(7, f14);
        }
        gVar.f11245j = f14;
        float f15 = gVar.f11246k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f15 = typedArrayF.getFloat(8, f15);
        }
        gVar.f11246k = f15;
        if (gVar.f11245j <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f15 <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f11243h = typedArrayF.getDimension(3, gVar.f11243h);
        int i19 = 2;
        float dimension = typedArrayF.getDimension(2, gVar.f11244i);
        gVar.f11244i = dimension;
        if (gVar.f11243h <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = gVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayF.getFloat(4, alpha);
        }
        gVar.setAlpha(alpha);
        boolean z16 = false;
        String string = typedArrayF.getString(0);
        if (string != null) {
            gVar.f11248m = string;
            gVar.f11250o.put(string, gVar);
        }
        typedArrayF.recycle();
        hVar.f11251a = getChangingConfigurations();
        hVar.f11261k = true;
        h hVar3 = this.f11202b;
        g gVar2 = hVar3.f11252b;
        ArrayDeque arrayDeque = new ArrayDeque();
        d dVar = gVar2.f11242g;
        p1.a<String, Object> aVar = gVar2.f11250o;
        arrayDeque.push(dVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z17 = true;
        while (eventType != i18 && (xmlPullParser.getDepth() >= depth || eventType != i17)) {
            if (eventType == i19) {
                String name = xmlPullParser.getName();
                d dVar2 = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    TypedArray typedArrayF2 = j.f(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11183c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayF2.getString(0);
                        if (string2 != null) {
                            cVar.f11233b = string2;
                        }
                        String string3 = typedArrayF2.getString(2);
                        if (string3 != null) {
                            cVar.f11232a = c7.g.b(string3);
                        }
                        cVar.f11212f = j.c(typedArrayF2, xmlPullParser, theme, "fillColor", 1);
                        float f16 = cVar.f11214h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f16 = typedArrayF2.getFloat(12, f16);
                        }
                        cVar.f11214h = f16;
                        int i24 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayF2.getInt(8, -1) : -1;
                        Paint.Cap cap2 = cVar.f11218l;
                        if (i24 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i24 != 1) {
                            cap = i24 != 2 ? cap2 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        cVar.f11218l = cap;
                        int i25 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayF2.getInt(9, -1) : -1;
                        Paint.Join join2 = cVar.f11219m;
                        if (i25 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i25 != 1) {
                            join = i25 != 2 ? join2 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        cVar.f11219m = join;
                        float f17 = cVar.f11220n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f17 = typedArrayF2.getFloat(10, f17);
                        }
                        cVar.f11220n = f17;
                        cVar.f11210d = j.c(typedArrayF2, xmlPullParser, theme, "strokeColor", 3);
                        float f18 = cVar.f11213g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f18 = typedArrayF2.getFloat(11, f18);
                        }
                        cVar.f11213g = f18;
                        float f19 = cVar.f11211e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f19 = typedArrayF2.getFloat(4, f19);
                        }
                        cVar.f11211e = f19;
                        float f22 = cVar.f11216j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f22 = typedArrayF2.getFloat(6, f22);
                        }
                        cVar.f11216j = f22;
                        float f24 = cVar.f11217k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f24 = typedArrayF2.getFloat(7, f24);
                        }
                        cVar.f11217k = f24;
                        float f25 = cVar.f11215i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f25 = typedArrayF2.getFloat(5, f25);
                        }
                        cVar.f11215i = f25;
                        int i26 = cVar.f11234c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i26 = typedArrayF2.getInt(13, i26);
                        }
                        cVar.f11234c = i26;
                    }
                    typedArrayF2.recycle();
                    dVar2.f11222b.add(cVar);
                    if (cVar.getPathName() != null) {
                        aVar.put(cVar.getPathName(), cVar);
                    }
                    hVar3.f11251a = hVar3.f11251a;
                    z14 = false;
                    i15 = 2;
                    z17 = false;
                } else {
                    depth = depth;
                    if ("clip-path".equals(name)) {
                        b bVar = new b();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayF3 = j.f(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11184d);
                            String string4 = typedArrayF3.getString(0);
                            if (string4 != null) {
                                bVar.f11233b = string4;
                            }
                            String string5 = typedArrayF3.getString(1);
                            if (string5 != null) {
                                bVar.f11232a = c7.g.b(string5);
                            }
                            bVar.f11234c = !j.e(xmlPullParser, "fillType") ? 0 : typedArrayF3.getInt(2, 0);
                            typedArrayF3.recycle();
                        }
                        dVar2.f11222b.add(bVar);
                        if (bVar.getPathName() != null) {
                            aVar.put(bVar.getPathName(), bVar);
                        }
                        hVar3.f11251a = hVar3.f11251a;
                    } else if ("group".equals(name)) {
                        d dVar3 = new d();
                        TypedArray typedArrayF4 = j.f(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f11182b);
                        float f26 = dVar3.f11223c;
                        if (j.e(xmlPullParser, "rotation")) {
                            f26 = typedArrayF4.getFloat(5, f26);
                        }
                        dVar3.f11223c = f26;
                        dVar3.f11224d = typedArrayF4.getFloat(1, dVar3.f11224d);
                        i15 = 2;
                        dVar3.f11225e = typedArrayF4.getFloat(2, dVar3.f11225e);
                        float f27 = dVar3.f11226f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f27 = typedArrayF4.getFloat(3, f27);
                        }
                        dVar3.f11226f = f27;
                        float f28 = dVar3.f11227g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f28 = typedArrayF4.getFloat(4, f28);
                        }
                        dVar3.f11227g = f28;
                        float f29 = dVar3.f11228h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f29 = typedArrayF4.getFloat(6, f29);
                        }
                        dVar3.f11228h = f29;
                        float f34 = dVar3.f11229i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f34 = typedArrayF4.getFloat(7, f34);
                        }
                        dVar3.f11229i = f34;
                        z14 = false;
                        String string6 = typedArrayF4.getString(0);
                        if (string6 != null) {
                            dVar3.f11231k = string6;
                        }
                        dVar3.c();
                        typedArrayF4.recycle();
                        dVar2.f11222b.add(dVar3);
                        arrayDeque.push(dVar3);
                        if (dVar3.getGroupName() != null) {
                            aVar.put(dVar3.getGroupName(), dVar3);
                        }
                        hVar3.f11251a = hVar3.f11251a;
                    }
                    z14 = false;
                    i15 = 2;
                }
                i16 = 3;
                i14 = 1;
            } else {
                depth = depth;
                i14 = 1;
                i15 = i19;
                z14 = z16;
                i16 = i17;
                if (eventType == i16 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i17 = i16;
            z16 = z14;
            i19 = i15;
            i18 = i14;
            depth = depth;
        }
        if (z17) {
            throw new XmlPullParserException("no path defined");
        }
        this.f11203c = b(hVar.f11253c, hVar.f11254d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.isAutoMirrored() : this.f11202b.f11255e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f11202b;
        if (hVar == null) {
            return false;
        }
        g gVar = hVar.f11252b;
        if (gVar.f11249n == null) {
            gVar.f11249n = Boolean.valueOf(gVar.f11242g.a());
        }
        if (gVar.f11249n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f11202b.f11253c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11205e && super.mutate() == this) {
            this.f11202b = new h(this.f11202b);
            this.f11205e = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z14;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f11202b;
        ColorStateList colorStateList = hVar.f11253c;
        if (colorStateList == null || (mode = hVar.f11254d) == null) {
            z14 = false;
        } else {
            this.f11203c = b(colorStateList, mode);
            invalidateSelf();
            z14 = true;
        }
        g gVar = hVar.f11252b;
        if (gVar.f11249n == null) {
            gVar.f11249n = Boolean.valueOf(gVar.f11242g.a());
        }
        if (gVar.f11249n.booleanValue()) {
            boolean zB = hVar.f11252b.f11242g.b(iArr);
            hVar.f11261k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z14;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j8) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j8);
        } else {
            super.scheduleSelf(runnable, j8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i14) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setAlpha(i14);
        } else if (this.f11202b.f11252b.getRootAlpha() != i14) {
            this.f11202b.f11252b.setRootAlpha(i14);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z14) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setAutoMirrored(z14);
        } else {
            this.f11202b.f11255e = z14;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f11204d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i14) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setTint(i14);
        } else {
            setTintList(ColorStateList.valueOf(i14));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        h hVar = this.f11202b;
        if (hVar.f11253c != colorStateList) {
            hVar.f11253c = colorStateList;
            this.f11203c = b(colorStateList, hVar.f11254d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        h hVar = this.f11202b;
        if (hVar.f11254d != mode) {
            hVar.f11254d = mode;
            this.f11203c = b(hVar.f11253c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z14, boolean z15) {
        Drawable drawable = this.f11200a;
        return drawable != null ? drawable.setVisible(z14, z15) : super.setVisible(z14, z15);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class b extends AbstractC0159f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f11252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f11253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f11254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f11255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f11256f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f11257g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f11258h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f11259i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f11260j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f11261k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f11262l;

        public h(h hVar) {
            this.f11253c = null;
            this.f11254d = f.f11201j;
            if (hVar != null) {
                this.f11251a = hVar.f11251a;
                g gVar = new g(hVar.f11252b);
                this.f11252b = gVar;
                if (hVar.f11252b.f11240e != null) {
                    gVar.f11240e = new Paint(hVar.f11252b.f11240e);
                }
                if (hVar.f11252b.f11239d != null) {
                    this.f11252b.f11239d = new Paint(hVar.f11252b.f11239d);
                }
                this.f11253c = hVar.f11253c;
                this.f11254d = hVar.f11254d;
                this.f11255e = hVar.f11255e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11251a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f11253c = null;
            this.f11254d = f.f11201j;
            this.f11252b = new g();
        }
    }

    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f11263a;

        public i(Drawable.ConstantState constantState) {
            this.f11263a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f11263a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f11263a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f();
            fVar.f11200a = (VectorDrawable) this.f11263a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f11200a = (VectorDrawable) this.f11263a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f11200a = (VectorDrawable) this.f11263a.newDrawable(resources, theme);
            return fVar;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0159f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c7.g.b[] f11232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11234c;

        public AbstractC0159f(AbstractC0159f abstractC0159f) {
            super();
            this.f11232a = null;
            this.f11234c = 0;
            this.f11233b = abstractC0159f.f11233b;
            c7.g.b[] bVarArr = abstractC0159f.f11232a;
            c7.g.b[] bVarArr2 = new c7.g.b[bVarArr.length];
            for (int i14 = 0; i14 < bVarArr.length; i14++) {
                bVarArr2[i14] = new c7.g.b(bVarArr[i14]);
            }
            this.f11232a = bVarArr2;
        }

        public c7.g.b[] getPathData() {
            return this.f11232a;
        }

        public String getPathName() {
            return this.f11233b;
        }

        public void setPathData(c7.g.b[] bVarArr) {
            c7.g.b[] bVarArr2 = this.f11232a;
            if (bVarArr2 != null && bVarArr != null && bVarArr2.length == bVarArr.length) {
                int i14 = 0;
                while (true) {
                    if (i14 >= bVarArr2.length) {
                        c7.g.b[] bVarArr3 = this.f11232a;
                        for (int i15 = 0; i15 < bVarArr.length; i15++) {
                            bVarArr3[i15].f25195a = bVarArr[i15].f25195a;
                            int i16 = 0;
                            while (true) {
                                float[] fArr = bVarArr[i15].f25196b;
                                if (i16 < fArr.length) {
                                    bVarArr3[i15].f25196b[i16] = fArr[i16];
                                    i16++;
                                }
                            }
                        }
                        return;
                    }
                    c7.g.b bVar = bVarArr2[i14];
                    char c14 = bVar.f25195a;
                    c7.g.b bVar2 = bVarArr[i14];
                    if (c14 != bVar2.f25195a || bVar.f25196b.length != bVar2.f25196b.length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            c7.g.b[] bVarArr4 = new c7.g.b[bVarArr.length];
            for (int i17 = 0; i17 < bVarArr.length; i17++) {
                bVarArr4[i17] = new c7.g.b(bVarArr[i17]);
            }
            this.f11232a = bVarArr4;
        }

        public AbstractC0159f() {
            super();
            this.f11232a = null;
            this.f11234c = 0;
        }
    }

    public f() {
        this.f11206f = true;
        this.f11207g = new float[9];
        this.f11208h = new Matrix();
        this.f11209i = new Rect();
        this.f11202b = new h();
    }

    public static class c extends AbstractC0159f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b7.d f11210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f11211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b7.d f11212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f11213g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f11214h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f11215i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f11216j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f11217k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint.Cap f11218l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Paint.Join f11219m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f11220n;

        public c(c cVar) {
            super(cVar);
            this.f11211e = 0.0f;
            this.f11213g = 1.0f;
            this.f11214h = 1.0f;
            this.f11215i = 0.0f;
            this.f11216j = 1.0f;
            this.f11217k = 0.0f;
            this.f11218l = Paint.Cap.BUTT;
            this.f11219m = Paint.Join.MITER;
            this.f11220n = 4.0f;
            cVar.getClass();
            this.f11210d = cVar.f11210d;
            this.f11211e = cVar.f11211e;
            this.f11213g = cVar.f11213g;
            this.f11212f = cVar.f11212f;
            this.f11234c = cVar.f11234c;
            this.f11214h = cVar.f11214h;
            this.f11215i = cVar.f11215i;
            this.f11216j = cVar.f11216j;
            this.f11217k = cVar.f11217k;
            this.f11218l = cVar.f11218l;
            this.f11219m = cVar.f11219m;
            this.f11220n = cVar.f11220n;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public final boolean a() {
            return this.f11212f.c() || this.f11210d.c();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public final boolean b(int[] iArr) {
            boolean z14;
            b7.d dVar = this.f11212f;
            boolean z15 = true;
            if (dVar.c()) {
                ColorStateList colorStateList = dVar.f16240b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != dVar.f16241c) {
                    dVar.f16241c = colorForState;
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            b7.d dVar2 = this.f11210d;
            if (dVar2.c()) {
                ColorStateList colorStateList2 = dVar2.f16240b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != dVar2.f16241c) {
                    dVar2.f16241c = colorForState2;
                } else {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
            return z14 | z15;
        }

        public float getFillAlpha() {
            return this.f11214h;
        }

        public int getFillColor() {
            return this.f11212f.f16241c;
        }

        public float getStrokeAlpha() {
            return this.f11213g;
        }

        public int getStrokeColor() {
            return this.f11210d.f16241c;
        }

        public float getStrokeWidth() {
            return this.f11211e;
        }

        public float getTrimPathEnd() {
            return this.f11216j;
        }

        public float getTrimPathOffset() {
            return this.f11217k;
        }

        public float getTrimPathStart() {
            return this.f11215i;
        }

        public void setFillAlpha(float f14) {
            this.f11214h = f14;
        }

        public void setFillColor(int i14) {
            this.f11212f.f16241c = i14;
        }

        public void setStrokeAlpha(float f14) {
            this.f11213g = f14;
        }

        public void setStrokeColor(int i14) {
            this.f11210d.f16241c = i14;
        }

        public void setStrokeWidth(float f14) {
            this.f11211e = f14;
        }

        public void setTrimPathEnd(float f14) {
            this.f11216j = f14;
        }

        public void setTrimPathOffset(float f14) {
            this.f11217k = f14;
        }

        public void setTrimPathStart(float f14) {
            this.f11215i = f14;
        }

        public c() {
            this.f11211e = 0.0f;
            this.f11213g = 1.0f;
            this.f11214h = 1.0f;
            this.f11215i = 0.0f;
            this.f11216j = 1.0f;
            this.f11217k = 0.0f;
            this.f11218l = Paint.Cap.BUTT;
            this.f11219m = Paint.Join.MITER;
            this.f11220n = 4.0f;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Matrix f11235p = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f11236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f11237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f11238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f11239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f11240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PathMeasure f11241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f11242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f11243h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f11244i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f11245j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f11246k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f11247l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f11248m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Boolean f11249n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final p1.a<String, Object> f11250o;

        public g(g gVar) {
            this.f11238c = new Matrix();
            this.f11243h = 0.0f;
            this.f11244i = 0.0f;
            this.f11245j = 0.0f;
            this.f11246k = 0.0f;
            this.f11247l = 255;
            this.f11248m = null;
            this.f11249n = null;
            p1.a<String, Object> aVar = new p1.a<>();
            this.f11250o = aVar;
            this.f11242g = new d(gVar.f11242g, aVar);
            this.f11236a = new Path(gVar.f11236a);
            this.f11237b = new Path(gVar.f11237b);
            this.f11243h = gVar.f11243h;
            this.f11244i = gVar.f11244i;
            this.f11245j = gVar.f11245j;
            this.f11246k = gVar.f11246k;
            this.f11247l = gVar.f11247l;
            this.f11248m = gVar.f11248m;
            String str = gVar.f11248m;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f11249n = gVar.f11249n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i14, int i15) {
            int i16;
            float f14;
            int i17;
            Matrix matrix2 = dVar.f11221a;
            ArrayList<e> arrayList = dVar.f11222b;
            matrix2.set(matrix);
            Matrix matrix3 = dVar.f11221a;
            matrix3.preConcat(dVar.f11230j);
            canvas.save();
            char c14 = 0;
            int i18 = 0;
            while (i18 < arrayList.size()) {
                e eVar = arrayList.get(i18);
                if (eVar instanceof d) {
                    a((d) eVar, matrix3, canvas, i14, i15);
                } else {
                    if (eVar instanceof AbstractC0159f) {
                        AbstractC0159f abstractC0159f = (AbstractC0159f) eVar;
                        float f15 = i14 / this.f11245j;
                        float f16 = i15 / this.f11246k;
                        float fMin = Math.min(f15, f16);
                        Matrix matrix4 = this.f11238c;
                        matrix4.set(matrix3);
                        matrix4.postScale(f15, f16);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix3.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[c14], fArr[1]);
                        boolean z14 = c14;
                        i16 = i18;
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f17 = (fArr[z14 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f17) / fMax : 0.0f;
                        if (fAbs != 0.0f) {
                            Path path = this.f11236a;
                            path.reset();
                            c7.g.b[] bVarArr = abstractC0159f.f11232a;
                            if (bVarArr != null) {
                                c7.g.b.b(bVarArr, path);
                            }
                            Path path2 = this.f11237b;
                            path2.reset();
                            if (abstractC0159f instanceof b) {
                                path2.setFillType(abstractC0159f.f11234c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix4);
                                canvas.clipPath(path2);
                            } else {
                                c cVar = (c) abstractC0159f;
                                float f18 = cVar.f11215i;
                                if (f18 != 0.0f || cVar.f11216j != 1.0f) {
                                    float f19 = cVar.f11217k;
                                    float f22 = (f18 + f19) % 1.0f;
                                    float f24 = (cVar.f11216j + f19) % 1.0f;
                                    if (this.f11241f == null) {
                                        this.f11241f = new PathMeasure();
                                    }
                                    this.f11241f.setPath(path, z14);
                                    float length = this.f11241f.getLength();
                                    float f25 = f22 * length;
                                    float f26 = f24 * length;
                                    path.reset();
                                    PathMeasure pathMeasure = this.f11241f;
                                    if (f25 > f26) {
                                        pathMeasure.getSegment(f25, length, path, true);
                                        f14 = 0.0f;
                                        this.f11241f.getSegment(0.0f, f26, path, true);
                                    } else {
                                        f14 = 0.0f;
                                        pathMeasure.getSegment(f25, f26, path, true);
                                    }
                                    path.rLineTo(f14, f14);
                                }
                                path2.addPath(path, matrix4);
                                b7.d dVar2 = cVar.f11212f;
                                float f27 = 255.0f;
                                if (dVar2.f16239a == null && dVar2.f16241c == 0) {
                                    f27 = 255.0f;
                                    i17 = FlexItem.MAX_SIZE;
                                } else {
                                    if (this.f11240e == null) {
                                        i17 = FlexItem.MAX_SIZE;
                                        Paint paint = new Paint(1);
                                        this.f11240e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    } else {
                                        i17 = FlexItem.MAX_SIZE;
                                    }
                                    Paint paint2 = this.f11240e;
                                    Shader shader = dVar2.f16239a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(cVar.f11214h * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i19 = dVar2.f16241c;
                                        float f28 = cVar.f11214h;
                                        PorterDuff.Mode mode = f.f11201j;
                                        paint2.setColor((i19 & i17) | (((int) (Color.alpha(i19) * f28)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(cVar.f11234c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                }
                                b7.d dVar3 = cVar.f11210d;
                                if (dVar3.f16239a != null || dVar3.f16241c != 0) {
                                    if (this.f11239d == null) {
                                        Paint paint3 = new Paint(1);
                                        this.f11239d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = this.f11239d;
                                    Paint.Join join = cVar.f11219m;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = cVar.f11218l;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(cVar.f11220n);
                                    Shader shader2 = dVar3.f16239a;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(cVar.f11213g * f27));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i24 = dVar3.f16241c;
                                        float f29 = cVar.f11213g;
                                        PorterDuff.Mode mode2 = f.f11201j;
                                        paint4.setColor((i24 & i17) | (((int) (Color.alpha(i24) * f29)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(cVar.f11211e * fMin * fAbs);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                    }
                    i18 = i16 + 1;
                    c14 = 0;
                }
                i16 = i18;
                i18 = i16 + 1;
                c14 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f11247l;
        }

        public void setAlpha(float f14) {
            setRootAlpha((int) (f14 * 255.0f));
        }

        public void setRootAlpha(int i14) {
            this.f11247l = i14;
        }

        public g() {
            this.f11238c = new Matrix();
            this.f11243h = 0.0f;
            this.f11244i = 0.0f;
            this.f11245j = 0.0f;
            this.f11246k = 0.0f;
            this.f11247l = 255;
            this.f11248m = null;
            this.f11249n = null;
            this.f11250o = new p1.a<>();
            this.f11242g = new d();
            this.f11236a = new Path();
            this.f11237b = new Path();
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f11221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<e> f11222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f11223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f11224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f11225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f11226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f11227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f11228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f11229i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Matrix f11230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f11231k;

        public d(d dVar, p1.a<String, Object> aVar) {
            AbstractC0159f bVar;
            super();
            this.f11221a = new Matrix();
            this.f11222b = new ArrayList<>();
            this.f11223c = 0.0f;
            this.f11224d = 0.0f;
            this.f11225e = 0.0f;
            this.f11226f = 1.0f;
            this.f11227g = 1.0f;
            this.f11228h = 0.0f;
            this.f11229i = 0.0f;
            Matrix matrix = new Matrix();
            this.f11230j = matrix;
            this.f11231k = null;
            this.f11223c = dVar.f11223c;
            this.f11224d = dVar.f11224d;
            this.f11225e = dVar.f11225e;
            this.f11226f = dVar.f11226f;
            this.f11227g = dVar.f11227g;
            this.f11228h = dVar.f11228h;
            this.f11229i = dVar.f11229i;
            String str = dVar.f11231k;
            this.f11231k = str;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f11230j);
            ArrayList<e> arrayList = dVar.f11222b;
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                e eVar = arrayList.get(i14);
                if (eVar instanceof d) {
                    this.f11222b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            vb.h.z("Unknown object in the tree!");
                            throw null;
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f11222b.add(bVar);
                    String str2 = bVar.f11233b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public final boolean a() {
            int i14 = 0;
            while (true) {
                ArrayList<e> arrayList = this.f11222b;
                if (i14 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i14).a()) {
                    return true;
                }
                i14++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public final boolean b(int[] iArr) {
            int i14 = 0;
            boolean zB = false;
            while (true) {
                ArrayList<e> arrayList = this.f11222b;
                if (i14 >= arrayList.size()) {
                    return zB;
                }
                zB |= arrayList.get(i14).b(iArr);
                i14++;
            }
        }

        public final void c() {
            Matrix matrix = this.f11230j;
            matrix.reset();
            matrix.postTranslate(-this.f11224d, -this.f11225e);
            matrix.postScale(this.f11226f, this.f11227g);
            matrix.postRotate(this.f11223c, 0.0f, 0.0f);
            matrix.postTranslate(this.f11228h + this.f11224d, this.f11229i + this.f11225e);
        }

        public String getGroupName() {
            return this.f11231k;
        }

        public Matrix getLocalMatrix() {
            return this.f11230j;
        }

        public float getPivotX() {
            return this.f11224d;
        }

        public float getPivotY() {
            return this.f11225e;
        }

        public float getRotation() {
            return this.f11223c;
        }

        public float getScaleX() {
            return this.f11226f;
        }

        public float getScaleY() {
            return this.f11227g;
        }

        public float getTranslateX() {
            return this.f11228h;
        }

        public float getTranslateY() {
            return this.f11229i;
        }

        public void setPivotX(float f14) {
            if (f14 != this.f11224d) {
                this.f11224d = f14;
                c();
            }
        }

        public void setPivotY(float f14) {
            if (f14 != this.f11225e) {
                this.f11225e = f14;
                c();
            }
        }

        public void setRotation(float f14) {
            if (f14 != this.f11223c) {
                this.f11223c = f14;
                c();
            }
        }

        public void setScaleX(float f14) {
            if (f14 != this.f11226f) {
                this.f11226f = f14;
                c();
            }
        }

        public void setScaleY(float f14) {
            if (f14 != this.f11227g) {
                this.f11227g = f14;
                c();
            }
        }

        public void setTranslateX(float f14) {
            if (f14 != this.f11228h) {
                this.f11228h = f14;
                c();
            }
        }

        public void setTranslateY(float f14) {
            if (f14 != this.f11229i) {
                this.f11229i = f14;
                c();
            }
        }

        public d() {
            super();
            this.f11221a = new Matrix();
            this.f11222b = new ArrayList<>();
            this.f11223c = 0.0f;
            this.f11224d = 0.0f;
            this.f11225e = 0.0f;
            this.f11226f = 1.0f;
            this.f11227g = 1.0f;
            this.f11228h = 0.0f;
            this.f11229i = 0.0f;
            this.f11230j = new Matrix();
            this.f11231k = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f11200a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
