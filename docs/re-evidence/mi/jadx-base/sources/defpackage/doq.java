package defpackage;

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
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class doq extends coq {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f15750k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f15751b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public Drawable.ConstantState g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    public static class b extends f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f15757b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f15756a = xlh.d(string2);
            }
            this.c = p5q.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // doq.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (p5q.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = p5q.s(resources, theme, attributeSet, sa1.d);
                f(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f15762b;
        public ColorStateList c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f15763k;
        public Paint l;

        public h(h hVar) {
            this.c = null;
            this.d = doq.f15750k;
            if (hVar != null) {
                this.f15761a = hVar.f15761a;
                g gVar = new g(hVar.f15762b);
                this.f15762b = gVar;
                if (hVar.f15762b.e != null) {
                    gVar.e = new Paint(hVar.f15762b.e);
                }
                if (hVar.f15762b.d != null) {
                    this.f15762b.d = new Paint(hVar.f15762b.d);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f.getWidth() && i2 == this.f.getHeight();
        }

        public boolean b() {
            return !this.f15763k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.f15762b.getRootAlpha();
        }

        public void c(int i, int i2) {
            if (this.f == null || !a(i, i2)) {
                this.f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f15763k = true;
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
            this.l.setAlpha(this.f15762b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.f15762b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f15762b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15761a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f15762b.g(iArr);
            this.f15763k |= zG;
            return zG;
        }

        public void i() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.f15762b.getRootAlpha();
            this.j = this.e;
            this.f15763k = false;
        }

        public void j(int i, int i2) {
            this.f.eraseColor(0);
            this.f15762b.b(new Canvas(this.f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new doq(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new doq(this);
        }

        public h() {
            this.c = null;
            this.d = doq.f15750k;
            this.f15762b = new g();
        }
    }

    public doq() {
        this.f = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f15751b = new h();
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static doq b(Resources resources, int i2, Resources.Theme theme) {
        doq doqVar = new doq();
        doqVar.f14572a = jrk.f(resources, i2, theme);
        doqVar.g = new i(doqVar.f14572a.getConstantState());
        return doqVar;
    }

    public static PorterDuff.Mode e(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
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

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f15751b;
        g gVar = hVar.f15762b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f15754b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f15761a = cVar.d | hVar.f15761a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f15754b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f15761a = bVar.d | hVar.f15761a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f15754b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f15761a = dVar2.f15755k | hVar.f15761a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f14572a;
        if (drawable == null) {
            return false;
        }
        k47.b(drawable);
        return false;
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final boolean d() {
        return isAutoMirrored() && k47.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        canvas.getMatrix(this.i);
        this.i.getValues(this.h);
        float fAbs = Math.abs(this.h[0]);
        float fAbs2 = Math.abs(this.h[4]);
        float fAbs3 = Math.abs(this.h[1]);
        float fAbs4 = Math.abs(this.h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.j.width() * fAbs);
        int iHeight = (int) (this.j.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.j;
        canvas.translate(rect.left, rect.top);
        if (d()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.f15751b.c(iMin, iMin2);
        if (!this.f) {
            this.f15751b.j(iMin, iMin2);
        } else if (!this.f15751b.b()) {
            this.f15751b.j(iMin, iMin2);
            this.f15751b.i();
        }
        this.f15751b.d(canvas, colorFilter, this.j);
        canvas.restoreToCount(iSave);
    }

    public final void f(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f15751b;
        g gVar = hVar.f15762b;
        hVar.d = e(p5q.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = p5q.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.c = colorStateListG;
        }
        hVar.e = p5q.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.e);
        gVar.f15760k = p5q.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f15760k);
        float fJ = p5q.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = fJ;
        if (gVar.f15760k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.i = typedArray.getDimension(3, gVar.i);
        float dimension = typedArray.getDimension(2, gVar.j);
        gVar.j = dimension;
        if (gVar.i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(p5q.j(typedArray, xmlPullParser, SleepAnalyzerAlpha.NAME_ALPHA, 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.n = string;
            gVar.p.put(string, gVar);
        }
    }

    public PorterDuffColorFilter g(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f14572a;
        return drawable != null ? k47.d(drawable) : this.f15751b.f15762b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f14572a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f15751b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f14572a;
        return drawable != null ? k47.e(drawable) : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f14572a != null) {
            return new i(this.f14572a.getConstantState());
        }
        this.f15751b.f15761a = getChangingConfigurations();
        return this.f15751b;
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f14572a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f15751b.f15762b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f14572a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f15751b.f15762b.i;
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f14572a;
        return drawable != null ? k47.h(drawable) : this.f15751b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f15751b) != null && (hVar.g() || ((colorStateList = this.f15751b.c) != null && colorStateList.isStateful())));
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            this.f15751b = new h(this.f15751b);
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f15751b;
        ColorStateList colorStateList = hVar.c;
        if (colorStateList == null || (mode = hVar.d) == null) {
            z = false;
        } else {
            this.c = g(this.c, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f15751b.f15762b.getRootAlpha() != i2) {
            this.f15751b.f15762b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            k47.j(drawable, z);
        } else {
            this.f15751b.e = z;
        }
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // defpackage.coq, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            k47.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            k47.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f15751b;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.c = g(this.c, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            k47.p(drawable, mode);
            return;
        }
        h hVar = this.f15751b;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.c = g(this.c, hVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f14572a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi(24)
    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f15764a;

        public i(Drawable.ConstantState constantState) {
            this.f15764a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f15764a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15764a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            doq doqVar = new doq();
            doqVar.f14572a = (VectorDrawable) this.f15764a.newDrawable();
            return doqVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            doq doqVar = new doq();
            doqVar.f14572a = (VectorDrawable) this.f15764a.newDrawable(resources);
            return doqVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            doq doqVar = new doq();
            doqVar.f14572a = (VectorDrawable) this.f15764a.newDrawable(resources, theme);
            return doqVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    public static abstract class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public xlh.b[] f15756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15757b;
        public int c;
        public int d;

        public f() {
            super();
            this.f15756a = null;
            this.c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            xlh.b[] bVarArr = this.f15756a;
            if (bVarArr != null) {
                xlh.b.h(bVarArr, path);
            }
        }

        public xlh.b[] getPathData() {
            return this.f15756a;
        }

        public String getPathName() {
            return this.f15757b;
        }

        public void setPathData(xlh.b[] bVarArr) {
            if (xlh.b(this.f15756a, bVarArr)) {
                xlh.k(this.f15756a, bVarArr);
            } else {
                this.f15756a = xlh.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f15756a = null;
            this.c = 0;
            this.f15757b = fVar.f15757b;
            this.d = fVar.d;
            this.f15756a = xlh.f(fVar.f15756a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14572a;
        if (drawable != null) {
            k47.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f15751b;
        hVar.f15762b = new g();
        TypedArray typedArrayS = p5q.s(resources, theme, attributeSet, sa1.f33443a);
        f(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        hVar.f15761a = getChangingConfigurations();
        hVar.f15763k = true;
        c(resources, xmlPullParser, attributeSet, theme);
        this.c = g(this.c, hVar.c, hVar.d);
    }

    public doq(h hVar) {
        this.f = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f15751b = hVar;
        this.c = g(this.c, hVar.c, hVar.d);
    }

    public static class c extends f {
        public int[] e;
        public ga4 f;
        public float g;
        public ga4 h;
        public float i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f15752k;
        public float l;
        public float m;
        public Paint.Cap n;
        public Paint.Join o;
        public float p;

        public c() {
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.f15752k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        @Override // doq.e
        public boolean a() {
            return this.h.i() || this.f.i();
        }

        @Override // doq.e
        public boolean b(int[] iArr) {
            return this.f.j(iArr) | this.h.j(iArr);
        }

        public final Paint.Cap e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        public final Paint.Join f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = p5q.s(resources, theme, attributeSet, sa1.c);
            h(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        public float getFillAlpha() {
            return this.j;
        }

        public int getFillColor() {
            return this.h.e();
        }

        public float getStrokeAlpha() {
            return this.i;
        }

        public int getStrokeColor() {
            return this.f.e();
        }

        public float getStrokeWidth() {
            return this.g;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public float getTrimPathStart() {
            return this.f15752k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (p5q.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f15757b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f15756a = xlh.d(string2);
                }
                this.h = p5q.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.j = p5q.j(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = e(p5q.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = f(p5q.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = p5q.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f = p5q.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.i = p5q.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
                this.g = p5q.j(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
                this.l = p5q.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = p5q.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.f15752k = p5q.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f15752k);
                this.c = p5q.k(typedArray, xmlPullParser, "fillType", 13, this.c);
            }
        }

        public void setFillAlpha(float f) {
            this.j = f;
        }

        public void setFillColor(int i) {
            this.h.k(i);
        }

        public void setStrokeAlpha(float f) {
            this.i = f;
        }

        public void setStrokeColor(int i) {
            this.f.k(i);
        }

        public void setStrokeWidth(float f) {
            this.g = f;
        }

        public void setTrimPathEnd(float f) {
            this.l = f;
        }

        public void setTrimPathOffset(float f) {
            this.m = f;
        }

        public void setTrimPathStart(float f) {
            this.f15752k = f;
        }

        public c(c cVar) {
            super(cVar);
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.f15752k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.c = cVar.c;
            this.j = cVar.j;
            this.f15752k = cVar.f15752k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f15753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<e> f15754b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f15755k;
        public int[] l;
        public String m;

        public d() {
            super();
            this.f15753a = new Matrix();
            this.f15754b = new ArrayList<>();
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

        @Override // doq.e
        public boolean a() {
            for (int i = 0; i < this.f15754b.size(); i++) {
                if (this.f15754b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // doq.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i = 0; i < this.f15754b.size(); i++) {
                zB |= this.f15754b.get(i).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = p5q.s(resources, theme, attributeSet, sa1.f33444b);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public final void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = p5q.j(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = p5q.j(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = p5q.j(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = p5q.j(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = p5q.j(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                d();
            }
        }

        public void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                d();
            }
        }

        public d(d dVar, ArrayMap<String, Object> arrayMap) {
            f bVar;
            super();
            this.f15753a = new Matrix();
            this.f15754b = new ArrayList<>();
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
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.f15755k = dVar.f15755k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(dVar.j);
            ArrayList<e> arrayList = dVar.f15754b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f15754b.add(new d((d) eVar, arrayMap));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f15754b.add(bVar);
                    String str2 = bVar.f15757b;
                    if (str2 != null) {
                        arrayMap.put(str2, bVar);
                    }
                }
            }
        }
    }

    public static class g {
        public static final Matrix q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f15758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f15759b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final d h;
        public float i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f15760k;
        public float l;
        public int m;
        public String n;
        public Boolean o;
        public final ArrayMap<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.f15760k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new ArrayMap<>();
            this.h = new d();
            this.f15758a = new Path();
            this.f15759b = new Path();
        }

        public static float a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public void b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c(this.h, q, canvas, i, i2, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f15753a.set(matrix);
            dVar.f15753a.preConcat(dVar.j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f15754b.size(); i3++) {
                e eVar = dVar.f15754b.get(i3);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f15753a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f15760k;
            float f2 = i2 / this.l;
            float fMin = Math.min(f, f2);
            Matrix matrix = dVar.f15753a;
            this.c.set(matrix);
            this.c.postScale(f, f2);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f15758a);
            Path path = this.f15758a;
            this.f15759b.reset();
            if (fVar.c()) {
                this.f15759b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f15759b.addPath(path, this.c);
                canvas.clipPath(this.f15759b);
                return;
            }
            c cVar = (c) fVar;
            float f3 = cVar.f15752k;
            if (f3 != 0.0f || cVar.l != 1.0f) {
                float f4 = cVar.m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (cVar.l + f4) % 1.0f;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.f15758a, false);
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
            this.f15759b.addPath(path, this.c);
            if (cVar.h.l()) {
                ga4 ga4Var = cVar.h;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (ga4Var.h()) {
                    Shader shaderF = ga4Var.f();
                    shaderF.setLocalMatrix(this.c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(doq.a(ga4Var.e(), cVar.j));
                }
                paint2.setColorFilter(colorFilter);
                this.f15759b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f15759b, paint2);
            }
            if (cVar.f.l()) {
                ga4 ga4Var2 = cVar.f;
                if (this.d == null) {
                    Paint paint3 = new Paint(1);
                    this.d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.d;
                Paint.Join join = cVar.o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.p);
                if (ga4Var2.h()) {
                    Shader shaderF2 = ga4Var2.f();
                    shaderF2.setLocalMatrix(this.c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(doq.a(ga4Var2.e(), cVar.i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.g * fMin * fE);
                canvas.drawPath(this.f15759b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.f15760k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.p = arrayMap;
            this.h = new d(gVar.h, arrayMap);
            this.f15758a = new Path(gVar.f15758a);
            this.f15759b = new Path(gVar.f15759b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.f15760k = gVar.f15760k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.o = gVar.o;
        }
    }
}
