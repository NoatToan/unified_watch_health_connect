package defpackage;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
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
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public class eoq extends aoq {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f16893b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public static class a extends d {
        public a() {
        }

        @Override // eoq.d
        public boolean b() {
            return true;
        }

        public void d(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n5q.e(xmlPullParser, "pathData")) {
                TypedArray typedArrayA = aoq.a(resources, theme, attributeSet, ioq.d);
                e(typedArrayA);
                typedArrayA.recycle();
            }
        }

        public final void e(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f16899b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f16898a = zlh.c(string2);
            }
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    public static class f extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f16904b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f16905k;
        public Paint l;

        public f(f fVar) {
            this.c = null;
            this.d = eoq.j;
            if (fVar != null) {
                this.f16903a = fVar.f16903a;
                this.f16904b = new e(fVar.f16904b);
                if (fVar.f16904b.e != null) {
                    this.f16904b.e = new Paint(fVar.f16904b.e);
                }
                if (fVar.f16904b.d != null) {
                    this.f16904b.d = new Paint(fVar.f16904b.d);
                }
                this.c = fVar.c;
                this.d = fVar.d;
                this.e = fVar.e;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean b() {
            return !this.f16905k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.f16904b.k();
        }

        public void c(int i, int i2) {
            if (this.f == null || !a(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f16905k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.f16904b.k());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.f16904b.k() < 255;
        }

        public void g() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.f16904b.k();
            this.j = this.e;
            this.f16905k = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f16903a;
        }

        public void h(int i, int i2) {
            this.f.eraseColor(0);
            this.f16904b.f(new Canvas(this.f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new eoq(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new eoq(this);
        }

        public f() {
            this.c = null;
            this.d = eoq.j;
            this.f16904b = new e();
        }
    }

    public eoq() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f16893b = new f();
    }

    public static int b(int i, float f2) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    public static eoq c(Resources resources, int i, Resources.Theme theme) {
        int next;
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return d(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public static eoq d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        eoq eoqVar = new eoq();
        eoqVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return eoqVar;
    }

    private void f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        f fVar = this.f16893b;
        e eVar = fVar.f16904b;
        Stack stack = new Stack();
        stack.push(eVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) stack.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.f(resources, attributeSet, theme, xmlPullParser);
                    cVar.f16896b.add(bVar);
                    if (bVar.a() != null) {
                        eVar.o.put(bVar.a(), bVar);
                    }
                    fVar.f16903a = bVar.c | fVar.f16903a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    aVar.d(resources, attributeSet, theme, xmlPullParser);
                    cVar.f16896b.add(aVar);
                    if (aVar.a() != null) {
                        eVar.o.put(aVar.a(), aVar);
                    }
                    fVar.f16903a = aVar.c | fVar.f16903a;
                } else if ("group".equals(name)) {
                    c cVar2 = new c();
                    cVar2.d(resources, attributeSet, theme, xmlPullParser);
                    cVar.f16896b.add(cVar2);
                    stack.push(cVar2);
                    if (cVar2.c() != null) {
                        eVar.o.put(cVar2.c(), cVar2);
                    }
                    fVar.f16903a = cVar2.f16897k | fVar.f16903a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + ((Object) stringBuffer) + " defined");
        }
    }

    @SuppressLint({"NewApi", "WrongConstant"})
    private boolean g() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    private static PorterDuff.Mode h(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3308a;
        if (drawable == null) {
            return false;
        }
        k47.b(drawable);
        return false;
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.i);
        if (this.i.width() <= 0 || this.i.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        canvas.getMatrix(this.h);
        this.h.getValues(this.g);
        float fAbs = Math.abs(this.g[0]);
        float fAbs2 = Math.abs(this.g[4]);
        float fAbs3 = Math.abs(this.g[1]);
        float fAbs4 = Math.abs(this.g[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.i.width() * fAbs);
        int iHeight = (int) (this.i.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.i;
        canvas.translate(rect.left, rect.top);
        if (g()) {
            canvas.translate(this.i.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.i.offsetTo(0, 0);
        this.f16893b.c(iMin, iMin2);
        if (!this.f) {
            this.f16893b.h(iMin, iMin2);
        } else if (!this.f16893b.b()) {
            this.f16893b.h(iMin, iMin2);
            this.f16893b.g();
        }
        this.f16893b.d(canvas, colorFilter, this.i);
        canvas.restoreToCount(iSave);
    }

    public Object e(String str) {
        return this.f16893b.f16904b.o.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3308a;
        return drawable != null ? k47.d(drawable) : this.f16893b.f16904b.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3308a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f16893b.getChangingConfigurations();
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3308a != null) {
            return new g(this.f3308a.getConstantState());
        }
        this.f16893b.f16903a = getChangingConfigurations();
        return this.f16893b;
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3308a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f16893b.f16904b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3308a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f16893b.f16904b.i;
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void i(boolean z) {
        this.f = z;
    }

    @Override // android.graphics.drawable.Drawable
    @SuppressLint({"NewApi"})
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3308a;
        return drawable != null ? k47.h(drawable) : this.f16893b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || !((fVar = this.f16893b) == null || (colorStateList = fVar.c) == null || !colorStateList.isStateful());
    }

    public final void j(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        f fVar = this.f16893b;
        e eVar = fVar.f16904b;
        fVar.d = h(n5q.d(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.c = colorStateList;
        }
        fVar.e = n5q.a(typedArray, xmlPullParser, "autoMirrored", 5, fVar.e);
        eVar.f16902k = n5q.c(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f16902k);
        float fC = n5q.c(typedArray, xmlPullParser, "viewportHeight", 8, eVar.l);
        eVar.l = fC;
        if (eVar.f16902k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fC <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        eVar.i = typedArray.getDimension(3, eVar.i);
        float dimension = typedArray.getDimension(2, eVar.j);
        eVar.j = dimension;
        if (eVar.i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        eVar.l(n5q.c(typedArray, xmlPullParser, SleepAnalyzerAlpha.NAME_ALPHA, 4, eVar.i()));
        String string = typedArray.getString(0);
        if (string != null) {
            eVar.n = string;
            eVar.o.put(string, eVar);
        }
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public PorterDuffColorFilter k(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            this.f16893b = new f(this.f16893b);
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        f fVar = this.f16893b;
        ColorStateList colorStateList = fVar.c;
        if (colorStateList == null || (mode = fVar.d) == null) {
            return false;
        }
        this.c = k(this.c, colorStateList, mode);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f16893b.f16904b.k() != i) {
            this.f16893b.f16904b.m(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            k47.j(drawable, z);
        } else {
            this.f16893b.e = z;
        }
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // defpackage.aoq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    @SuppressLint({"NewApi"})
    public void setTint(int i) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            k47.n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            k47.o(drawable, colorStateList);
            return;
        }
        f fVar = this.f16893b;
        if (fVar.c != colorStateList) {
            fVar.c = colorStateList;
            this.c = k(this.c, colorStateList, fVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            k47.p(drawable, mode);
            return;
        }
        f fVar = this.f16893b;
        if (fVar.d != mode) {
            fVar.d = mode;
            this.c = k(this.c, fVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3308a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zlh.b[] f16898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16899b;
        public int c;

        public d() {
            this.f16898a = null;
        }

        public String a() {
            return this.f16899b;
        }

        public boolean b() {
            return false;
        }

        public void c(Path path) {
            path.reset();
            zlh.b[] bVarArr = this.f16898a;
            if (bVarArr != null) {
                zlh.b.d(bVarArr, path);
            }
        }

        public d(d dVar) {
            this.f16898a = null;
            this.f16899b = dVar.f16899b;
            this.c = dVar.c;
            this.f16898a = zlh.d(dVar.f16898a);
        }
    }

    public static class g extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f16906a;

        public g(Drawable.ConstantState constantState) {
            this.f16906a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(api = 21)
        public boolean canApplyTheme() {
            return this.f16906a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f16906a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(api = 21)
        public Drawable newDrawable() {
            eoq eoqVar = new eoq();
            eoqVar.f3308a = (VectorDrawable) this.f16906a.newDrawable();
            return eoqVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(api = 21)
        public Drawable newDrawable(Resources resources) {
            eoq eoqVar = new eoq();
            eoqVar.f3308a = (VectorDrawable) this.f16906a.newDrawable(resources);
            return eoqVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(api = 21)
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            eoq eoqVar = new eoq();
            eoqVar.f3308a = (VectorDrawable) this.f16906a.newDrawable(resources, theme);
            return eoqVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3308a;
        if (drawable != null) {
            k47.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        f fVar = this.f16893b;
        fVar.f16904b = new e();
        TypedArray typedArrayA = aoq.a(resources, theme, attributeSet, ioq.f21956a);
        j(typedArrayA, xmlPullParser);
        typedArrayA.recycle();
        fVar.f16903a = getChangingConfigurations();
        fVar.f16905k = true;
        f(resources, xmlPullParser, attributeSet, theme);
        this.c = k(this.c, fVar.c, fVar.d);
    }

    public eoq(f fVar) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.f16893b = fVar;
        this.c = k(this.c, fVar.c, fVar.d);
    }

    public static class b extends d {
        public int[] d;
        public int e;
        public float f;
        public int g;
        public float h;
        public int i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f16894k;
        public float l;
        public float m;
        public Paint.Cap n;
        public Paint.Join o;
        public float p;

        public b() {
            this.e = 0;
            this.f = 0.0f;
            this.g = 0;
            this.h = 1.0f;
            this.j = 1.0f;
            this.f16894k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        @Override // eoq.d
        public /* bridge */ /* synthetic */ String a() {
            return super.a();
        }

        @Override // eoq.d
        public /* bridge */ /* synthetic */ boolean b() {
            return super.b();
        }

        @Override // eoq.d
        public /* bridge */ /* synthetic */ void c(Path path) {
            super.c(path);
        }

        public final Paint.Cap d(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        public final Paint.Join e(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void f(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayA = aoq.a(resources, theme, attributeSet, ioq.c);
            h(typedArrayA, xmlPullParser);
            typedArrayA.recycle();
        }

        public void g(int i) {
            this.g = i;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.d = null;
            if (n5q.e(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f16899b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f16898a = zlh.c(string2);
                }
                this.g = n5q.b(typedArray, xmlPullParser, "fillColor", 1, this.g);
                this.j = n5q.c(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = d(n5q.d(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = e(n5q.d(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = n5q.c(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.e = n5q.b(typedArray, xmlPullParser, "strokeColor", 3, this.e);
                this.h = n5q.c(typedArray, xmlPullParser, "strokeAlpha", 11, this.h);
                this.f = n5q.c(typedArray, xmlPullParser, "strokeWidth", 4, this.f);
                this.l = n5q.c(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = n5q.c(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.f16894k = n5q.c(typedArray, xmlPullParser, "trimPathStart", 5, this.f16894k);
            }
        }

        public b(b bVar) {
            super(bVar);
            this.e = 0;
            this.f = 0.0f;
            this.g = 0;
            this.h = 1.0f;
            this.j = 1.0f;
            this.f16894k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.h = bVar.h;
            this.g = bVar.g;
            this.i = bVar.i;
            this.j = bVar.j;
            this.f16894k = bVar.f16894k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
        }
    }

    public static class e {
        public static final Matrix p = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f16900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f16901b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final c h;
        public float i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f16902k;
        public float l;
        public int m;
        public String n;
        public final ArrayMap<String, Object> o;

        public e() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.f16902k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = new ArrayMap<>();
            this.h = new c();
            this.f16900a = new Path();
            this.f16901b = new Path();
        }

        public static float e(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public void f(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            g(this.h, p, canvas, i, i2, colorFilter);
        }

        public final void g(c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f16895a.set(matrix);
            cVar.f16895a.preConcat(cVar.j);
            canvas.save();
            for (int i3 = 0; i3 < cVar.f16896b.size(); i3++) {
                Object obj = cVar.f16896b.get(i3);
                if (obj instanceof c) {
                    g((c) obj, cVar.f16895a, canvas, i, i2, colorFilter);
                } else if (obj instanceof d) {
                    h(cVar, (d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void h(c cVar, d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f16902k;
            float f2 = i2 / this.l;
            float fMin = Math.min(f, f2);
            Matrix matrix = cVar.f16895a;
            this.c.set(matrix);
            this.c.postScale(f, f2);
            float fJ = j(matrix);
            if (fJ == 0.0f) {
                return;
            }
            dVar.c(this.f16900a);
            Path path = this.f16900a;
            this.f16901b.reset();
            if (dVar.b()) {
                this.f16901b.addPath(path, this.c);
                canvas.clipPath(this.f16901b);
                return;
            }
            b bVar = (b) dVar;
            float f3 = bVar.f16894k;
            if (f3 != 0.0f || bVar.l != 1.0f) {
                float f4 = bVar.m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (bVar.l + f4) % 1.0f;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.f16900a, false);
                float length = this.f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f.getSegment(f7, length, path, true);
                    this.f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f16901b.addPath(path, this.c);
            if (bVar.g != 0) {
                if (this.e == null) {
                    Paint paint = new Paint();
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                    this.e.setAntiAlias(true);
                }
                Paint paint2 = this.e;
                paint2.setColor(eoq.b(bVar.g, bVar.j));
                paint2.setColorFilter(colorFilter);
                canvas.drawPath(this.f16901b, paint2);
            }
            if (bVar.e != 0) {
                if (this.d == null) {
                    Paint paint3 = new Paint();
                    this.d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                    this.d.setAntiAlias(true);
                }
                Paint paint4 = this.d;
                Paint.Join join = bVar.o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = bVar.n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(bVar.p);
                paint4.setColor(eoq.b(bVar.e, bVar.h));
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(bVar.f * fMin * fJ);
                canvas.drawPath(this.f16901b, paint4);
            }
        }

        public float i() {
            return k() / 255.0f;
        }

        public final float j(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fE = e(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fE) / fMax;
            }
            return 0.0f;
        }

        public int k() {
            return this.m;
        }

        public void l(float f) {
            m((int) (f * 255.0f));
        }

        public void m(int i) {
            this.m = i;
        }

        public e(e eVar) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.f16902k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.o = arrayMap;
            this.h = new c(eVar.h, arrayMap);
            this.f16900a = new Path(eVar.f16900a);
            this.f16901b = new Path(eVar.f16901b);
            this.i = eVar.i;
            this.j = eVar.j;
            this.f16902k = eVar.f16902k;
            this.l = eVar.l;
            this.g = eVar.g;
            this.m = eVar.m;
            this.n = eVar.n;
            String str = eVar.n;
            if (str != null) {
                arrayMap.put(str, this);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f16895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<Object> f16896b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f16897k;
        public int[] l;
        public String m;

        public c(c cVar, ArrayMap<String, Object> arrayMap) {
            d aVar;
            this.f16895a = new Matrix();
            this.f16896b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.m = null;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.l = cVar.l;
            String str = cVar.m;
            this.m = str;
            this.f16897k = cVar.f16897k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(cVar.j);
            ArrayList<Object> arrayList = cVar.f16896b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof c) {
                    this.f16896b.add(new c((c) obj, arrayMap));
                } else {
                    if (obj instanceof b) {
                        aVar = new b((b) obj);
                    } else {
                        if (!(obj instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        aVar = new a((a) obj);
                    }
                    this.f16896b.add(aVar);
                    String str2 = aVar.f16899b;
                    if (str2 != null) {
                        arrayMap.put(str2, aVar);
                    }
                }
            }
        }

        public String c() {
            return this.m;
        }

        public void d(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayA = aoq.a(resources, theme, attributeSet, ioq.f21957b);
            f(typedArrayA, xmlPullParser);
            typedArrayA.recycle();
        }

        public final void e() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public final void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = n5q.c(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = n5q.c(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = n5q.c(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = n5q.c(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = n5q.c(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            e();
        }

        public c() {
            this.f16895a = new Matrix();
            this.f16896b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }
    }
}
