package com.huawei.animationkit.computationalwallpaper.vectordrawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.util.Log;
import android.util.Xml;
import androidx.collection.ArrayMap;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.operation.ble.BleConstants;
import defpackage.bgg;
import defpackage.bgk;
import defpackage.bgl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes23.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {
    static final PorterDuff.Mode d = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PorterDuffColorFilter f5173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorFilter f5174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5175c;
    private boolean e;
    private final Matrix f;
    private c g;
    private final float[] h;
    private final Rect j;

    public static abstract class VObject {
        public boolean isStateful() {
            return false;
        }

        public boolean onStateChanged(int[] iArr) {
            return false;
        }
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    VectorDrawableCompat() {
        this.e = true;
        this.h = new float[9];
        this.f = new Matrix();
        this.j = new Rect();
        this.g = new c();
    }

    VectorDrawableCompat(c cVar) {
        this.e = true;
        this.h = new float[9];
        this.f = new Matrix();
        this.j = new Rect();
        this.g = cVar;
        this.f5173a = c(this.f5173a, cVar.i, cVar.o);
    }

    public void d(Matrix matrix) {
        this.g.k.f5185a = new Matrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.mutate();
            return this;
        }
        if (!this.f5175c && super.mutate() == this) {
            this.g = new c(this.g);
            this.f5175c = true;
        }
        return this;
    }

    public b a() {
        return this.g.k.g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new j(this.mDelegateDrawable.getConstantState());
        }
        this.g.g = getChangingConfigurations();
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() <= 0 || this.j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f5174b;
        if (colorFilter == null) {
            colorFilter = this.f5173a;
        }
        canvas.getMatrix(this.f);
        this.f.getValues(this.h);
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
        canvas.translate(this.j.left, this.j.top);
        if (b()) {
            canvas.translate(this.j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.j.offsetTo(0, 0);
        this.g.b(iMin, iMin2);
        if (!this.e) {
            this.g.c(iMin, iMin2);
        } else if (!this.g.d()) {
            this.g.c(iMin, iMin2);
            this.g.a();
        }
        this.g.a(canvas, colorFilter, this.j);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.mDelegateDrawable != null) {
            return DrawableCompat.getAlpha(this.mDelegateDrawable);
        }
        return this.g.k.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setAlpha(i);
        } else if (this.g.k.a() != i) {
            this.g.k.c(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setColorFilter(colorFilter);
        } else {
            this.f5174b = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        if (this.mDelegateDrawable != null) {
            return DrawableCompat.getColorFilter(this.mDelegateDrawable);
        }
        return this.f5174b;
    }

    PorterDuffColorFilter c(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, com.huawei.animationkit.computationalwallpaper.vectordrawable.TintAwareDrawable
    public void setTint(int i) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTint(this.mDelegateDrawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, com.huawei.animationkit.computationalwallpaper.vectordrawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTintList(this.mDelegateDrawable, colorStateList);
            return;
        }
        c cVar = this.g;
        if (cVar.i != colorStateList) {
            cVar.i = colorStateList;
            this.f5173a = c(this.f5173a, colorStateList, cVar.o);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.huawei.animationkit.computationalwallpaper.vectordrawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTintMode(this.mDelegateDrawable, mode);
            return;
        }
        c cVar = this.g;
        if (cVar.o != mode) {
            cVar.o = mode;
            this.f5173a = c(this.f5173a, cVar.i, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        c cVar = this.g;
        if (cVar == null) {
            return false;
        }
        if (cVar.b()) {
            return true;
        }
        return this.g.i != null && this.g.i.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setState(iArr);
        }
        c cVar = this.g;
        if (cVar.i == null || cVar.o == null) {
            z = false;
        } else {
            this.f5173a = c(this.f5173a, cVar.i, cVar.o);
            invalidateSelf();
            z = true;
        }
        if (!cVar.b() || !cVar.a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getIntrinsicWidth();
        }
        return (int) this.g.k.f5186b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getIntrinsicHeight();
        }
        return (int) this.g.k.f5187c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.mDelegateDrawable == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(this.mDelegateDrawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.mDelegateDrawable != null) {
            return DrawableCompat.isAutoMirrored(this.mDelegateDrawable);
        }
        return this.g.e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setAutoMirrored(this.mDelegateDrawable, z);
        } else {
            this.g.e = z;
        }
    }

    public static VectorDrawableCompat a(String str) throws XmlPullParserException, IOException {
        int next;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new InputStreamReader(new FileInputStream(new File(str))));
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParserNewPullParser);
            do {
                next = xmlPullParserNewPullParser.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return c(null, xmlPullParserNewPullParser, attributeSetAsAttributeSet, null);
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error");
            throw e2;
        }
    }

    public static VectorDrawableCompat c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    static int a(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.inflate(this.mDelegateDrawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        c cVar = this.g;
        cVar.k = new d();
        d(xmlPullParser);
        cVar.g = getChangingConfigurations();
        cVar.f5184c = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f5173a = c(this.f5173a, cVar.i, cVar.o);
    }

    private static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
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

    private void d(XmlPullParser xmlPullParser) throws XmlPullParserException {
        c cVar = this.g;
        d dVar = cVar.k;
        cVar.o = e(bgk.e(xmlPullParser, "android:tintMode", -1), PorterDuff.Mode.SRC_IN);
        cVar.e = bgk.c(xmlPullParser, "android:autoMirrored", cVar.e);
        dVar.m = bgk.e(xmlPullParser, "android:viewportWidth", dVar.m);
        dVar.n = bgk.e(xmlPullParser, "android:viewportHeight", dVar.n);
        if (dVar.m <= 0.0f) {
            throw new XmlPullParserException(bgk.e(xmlPullParser) + "<vector> tag requires viewportWidth > 0");
        }
        if (dVar.n <= 0.0f) {
            throw new XmlPullParserException(bgk.e(xmlPullParser) + "<vector> tag requires viewportHeight > 0");
        }
        dVar.f5186b = bgk.a(xmlPullParser, "android:width", dVar.f5186b);
        dVar.f5187c = bgk.a(xmlPullParser, "android:height", dVar.f5187c);
        if (dVar.f5186b <= 0.0f) {
            throw new XmlPullParserException(bgk.e(xmlPullParser) + "<vector> tag requires width > 0");
        }
        if (dVar.f5187c <= 0.0f) {
            throw new XmlPullParserException(bgk.e(xmlPullParser) + "<vector> tag requires height > 0");
        }
        dVar.c(bgk.e(xmlPullParser, "android:alpha", dVar.e()));
        String strD = bgk.d(xmlPullParser, "android:name");
        if (strD != null) {
            dVar.f = strD;
            dVar.j.put(strD, dVar);
        }
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = this.g;
        d dVar = cVar.k;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar.g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                b bVar = (b) arrayDeque.peek();
                if (BleConstants.KEY_PATH.equals(name)) {
                    a aVar = new a();
                    aVar.e(resources, attributeSet, theme, xmlPullParser);
                    bVar.f5180b.add(aVar);
                    if (aVar.getPathName() != null) {
                        dVar.j.put(aVar.getPathName(), aVar);
                    }
                    cVar.g = aVar.mChangingConfigurations | cVar.g;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    e eVar = new e();
                    eVar.a(resources, attributeSet, theme, xmlPullParser);
                    bVar.f5180b.add(eVar);
                    if (eVar.getPathName() != null) {
                        dVar.j.put(eVar.getPathName(), eVar);
                    }
                    cVar.g = eVar.mChangingConfigurations | cVar.g;
                } else if (MessageConstant.GROUP_MEDAL_TYPE.equals(name)) {
                    b bVar2 = new b();
                    bVar2.d(resources, attributeSet, theme, xmlPullParser);
                    bVar.f5180b.add(bVar2);
                    arrayDeque.push(bVar2);
                    if (bVar2.b() != null) {
                        dVar.j.put(bVar2.b(), bVar2);
                    }
                    cVar.g = bVar2.f5179a | cVar.g;
                }
            } else if (eventType == 3 && MessageConstant.GROUP_MEDAL_TYPE.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public void a(boolean z) {
        this.e = z;
    }

    private boolean b() {
        return isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    static class j extends Drawable.ConstantState {
        private final Drawable.ConstantState e;

        public j(Drawable.ConstantState constantState) {
            this.e = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.e.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.e.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.e.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.e.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.e.getChangingConfigurations();
        }
    }

    static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Bitmap f5182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f5183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f5184c;
        int d;
        boolean e;
        ColorStateList f;
        int g;
        Paint h;
        ColorStateList i;
        PorterDuff.Mode j;
        d k;
        PorterDuff.Mode o;

        public c(c cVar) {
            this.i = null;
            this.o = VectorDrawableCompat.d;
            if (cVar != null) {
                this.g = cVar.g;
                this.k = new d(cVar.k);
                if (cVar.k.e != null) {
                    this.k.e = new Paint(cVar.k.e);
                }
                if (cVar.k.i != null) {
                    this.k.i = new Paint(cVar.k.i);
                }
                this.i = cVar.i;
                this.o = cVar.o;
                this.e = cVar.e;
            }
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5182a, (Rect) null, rect, c(colorFilter));
        }

        public boolean c() {
            return this.k.a() < 255;
        }

        public Paint c(ColorFilter colorFilter) {
            if (!c() && colorFilter == null) {
                return null;
            }
            if (this.h == null) {
                Paint paint = new Paint();
                this.h = paint;
                paint.setFilterBitmap(true);
            }
            this.h.setAlpha(this.k.a());
            this.h.setColorFilter(colorFilter);
            return this.h;
        }

        public void c(int i, int i2) {
            this.f5182a.eraseColor(0);
            this.k.d(new Canvas(this.f5182a), i, i2, (ColorFilter) null);
        }

        public void b(int i, int i2) {
            if (this.f5182a == null || !a(i, i2)) {
                this.f5182a = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f5184c = true;
            }
        }

        public boolean a(int i, int i2) {
            return i == this.f5182a.getWidth() && i2 == this.f5182a.getHeight();
        }

        public boolean d() {
            return !this.f5184c && this.f == this.i && this.j == this.o && this.f5183b == this.e && this.d == this.k.a();
        }

        public void a() {
            this.f = this.i;
            this.j = this.o;
            this.d = this.k.a();
            this.f5183b = this.e;
            this.f5184c = false;
        }

        public c() {
            this.i = null;
            this.o = VectorDrawableCompat.d;
            this.k = new d();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.g;
        }

        public boolean b() {
            return this.k.b();
        }

        public boolean a(int[] iArr) {
            boolean zD = this.k.d(iArr);
            this.f5184c |= zD;
            return zD;
        }
    }

    static class d {
        private static final Matrix l = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Matrix f5185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f5186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f5187c;
        Boolean d;
        Paint e;
        String f;
        final b g;
        int h;
        Paint i;
        final ArrayMap<String, Object> j;
        private final Matrix k;
        float m;
        float n;
        private int o;
        private PathMeasure r;
        private final Path s;
        private final Path t;

        private static float d(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public d() {
            this.k = new Matrix();
            this.f5186b = 0.0f;
            this.f5187c = 0.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            this.h = 255;
            this.f = null;
            this.d = null;
            this.j = new ArrayMap<>();
            this.g = new b();
            this.s = new Path();
            this.t = new Path();
        }

        public void c(int i) {
            this.h = i;
        }

        public int a() {
            return this.h;
        }

        public void c(float f) {
            c((int) (f * 255.0f));
        }

        public float e() {
            return a() / 255.0f;
        }

        public d(d dVar) {
            this.k = new Matrix();
            this.f5186b = 0.0f;
            this.f5187c = 0.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            this.h = 255;
            this.f = null;
            this.d = null;
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.j = arrayMap;
            this.g = new b(dVar.g, arrayMap);
            this.s = new Path(dVar.s);
            this.t = new Path(dVar.t);
            this.f5186b = dVar.f5186b;
            this.f5187c = dVar.f5187c;
            this.m = dVar.m;
            this.n = dVar.n;
            this.o = dVar.o;
            this.h = dVar.h;
            this.f = dVar.f;
            String str = dVar.f;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.d = dVar.d;
            this.f5185a = new Matrix(dVar.f5185a);
        }

        private void a(b bVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            bVar.f5181c.set(matrix);
            bVar.f5181c.preConcat(bVar.e);
            canvas.save();
            for (int i3 = 0; i3 < bVar.f5180b.size(); i3++) {
                VObject vObject = bVar.f5180b.get(i3);
                if (vObject instanceof b) {
                    a((b) vObject, bVar.f5181c, canvas, i, i2, colorFilter);
                } else if (vObject instanceof VPath) {
                    e(bVar, (VPath) vObject, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void d(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            a(this.g, l, canvas, i, i2, colorFilter);
        }

        private void e(b bVar, VPath vPath, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f;
            float f2 = i / this.m;
            float f3 = i2 / this.n;
            Matrix matrix = bVar.f5181c;
            this.k.set(matrix);
            b(this.k, f2, f3);
            float fC = c(matrix);
            if (fC == 0.0f) {
                return;
            }
            vPath.toPath(this.s);
            Path path = this.s;
            this.t.reset();
            if (vPath.isClipPath()) {
                this.t.setFillType(vPath.mFillRule == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.t.addPath(path, this.k);
                canvas.clipPath(this.t);
                return;
            }
            a aVar = (a) vPath;
            if (aVar.m != 0.0f || aVar.f != 1.0f) {
                float f4 = aVar.m;
                float f5 = aVar.j;
                float f6 = aVar.f;
                float f7 = aVar.j;
                if (this.r == null) {
                    this.r = new PathMeasure();
                }
                this.r.setPath(this.s, false);
                float length = this.r.getLength();
                float f8 = ((f4 + f5) % 1.0f) * length;
                float f9 = ((f6 + f7) % 1.0f) * length;
                path.reset();
                if (f8 > f9) {
                    this.r.getSegment(f8, length, path, true);
                    f = 0.0f;
                    this.r.getSegment(0.0f, f9, path, true);
                } else {
                    f = 0.0f;
                    this.r.getSegment(f8, f9, path, true);
                }
                path.rLineTo(f, f);
            }
            this.t.addPath(path, this.k);
            if (aVar.e.d()) {
                bgg bggVar = aVar.e;
                if (this.e == null) {
                    Paint paint = new Paint(1);
                    this.e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.e;
                if (bggVar.e()) {
                    Shader shaderC = bggVar.c();
                    shaderC.setLocalMatrix(this.k);
                    paint2.setShader(shaderC);
                    paint2.setAlpha(Math.round(aVar.d * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(VectorDrawableCompat.a(bggVar.a(), aVar.d));
                }
                paint2.setColorFilter(colorFilter);
                this.t.setFillType(aVar.mFillRule == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.t, paint2);
            }
            if (aVar.f5177b.d()) {
                bgg bggVar2 = aVar.f5177b;
                if (this.i == null) {
                    Paint paint3 = new Paint(1);
                    this.i = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.i;
                if (aVar.h != null) {
                    paint4.setStrokeJoin(aVar.h);
                }
                if (aVar.f5178c != null) {
                    paint4.setStrokeCap(aVar.f5178c);
                }
                paint4.setStrokeMiter(aVar.g);
                if (bggVar2.e()) {
                    Shader shaderC2 = bggVar2.c();
                    shaderC2.setLocalMatrix(this.k);
                    paint4.setShader(shaderC2);
                    paint4.setAlpha(Math.round(aVar.f5176a * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(VectorDrawableCompat.a(bggVar2.a(), aVar.f5176a));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(aVar.i * Math.min(f2, f3) * fC);
                canvas.drawPath(this.t, paint4);
            }
        }

        private void b(Matrix matrix, float f, float f2) {
            matrix.postScale(f, f2);
            Matrix matrix2 = this.f5185a;
            if (matrix2 != null) {
                matrix.postConcat(matrix2);
            }
        }

        private float c(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fD = d(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fD) / fMax;
            }
            return 0.0f;
        }

        public boolean b() {
            if (this.d == null) {
                this.d = Boolean.valueOf(this.g.isStateful());
            }
            return this.d.booleanValue();
        }

        public boolean d(int[] iArr) {
            return this.g.onStateChanged(iArr);
        }
    }

    public static class b extends VObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<VObject> f5180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Matrix f5181c;
        float d;
        final Matrix e;
        private float f;
        private String g;
        private float h;
        private float i;
        private float j;
        private int[] k;
        private float m;
        private float n;

        public b(b bVar, ArrayMap<String, Object> arrayMap) {
            VPath eVar;
            this.f5181c = new Matrix();
            this.f5180b = new ArrayList<>();
            this.d = 0.0f;
            this.f = 0.0f;
            this.h = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            Matrix matrix = new Matrix();
            this.e = matrix;
            this.g = null;
            this.d = bVar.d;
            this.f = bVar.f;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.m = bVar.m;
            this.n = bVar.n;
            this.k = bVar.k;
            String str = bVar.g;
            this.g = str;
            this.f5179a = bVar.f5179a;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(bVar.e);
            ArrayList<VObject> arrayList = bVar.f5180b;
            for (int i = 0; i < arrayList.size(); i++) {
                VObject vObject = arrayList.get(i);
                if (vObject instanceof b) {
                    this.f5180b.add(new b((b) vObject, arrayMap));
                } else {
                    if (vObject instanceof a) {
                        eVar = new a((a) vObject);
                    } else if (vObject instanceof e) {
                        eVar = new e((e) vObject);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5180b.add(eVar);
                    if (eVar.mPathName != null) {
                        arrayMap.put(eVar.mPathName, eVar);
                    }
                }
            }
        }

        public b() {
            this.f5181c = new Matrix();
            this.f5180b = new ArrayList<>();
            this.d = 0.0f;
            this.f = 0.0f;
            this.h = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.m = 0.0f;
            this.n = 0.0f;
            this.e = new Matrix();
            this.g = null;
        }

        public String b() {
            return this.g;
        }

        public void d(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            d(xmlPullParser);
        }

        private void d(XmlPullParser xmlPullParser) {
            this.k = null;
            this.d = bgk.e(xmlPullParser, "android:rotation", this.d);
            this.f = bgk.e(xmlPullParser, "android:pivotX", this.f);
            this.h = bgk.e(xmlPullParser, "android:pivotY", this.h);
            this.i = bgk.e(xmlPullParser, "android:scaleX", this.i);
            this.j = bgk.e(xmlPullParser, "android:scaleY", this.j);
            this.m = bgk.e(xmlPullParser, "android:translateX", this.m);
            this.n = bgk.e(xmlPullParser, "android:translateY", this.n);
            String strD = bgk.d(xmlPullParser, "android:name");
            if (strD != null) {
                this.g = strD;
            }
            a();
        }

        private void a() {
            this.e.reset();
            this.e.postTranslate(-this.f, -this.h);
            this.e.postScale(this.i, this.j);
            this.e.postRotate(this.d, 0.0f, 0.0f);
            this.e.postTranslate(this.m + this.f, this.n + this.h);
        }

        public ArrayList<VObject> e() {
            return this.f5180b;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
            for (int i = 0; i < this.f5180b.size(); i++) {
                if (this.f5180b.get(i).isStateful()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] iArr) {
            boolean zOnStateChanged = false;
            for (int i = 0; i < this.f5180b.size(); i++) {
                zOnStateChanged |= this.f5180b.get(i).onStateChanged(iArr);
            }
            return zOnStateChanged;
        }
    }

    static abstract class VPath extends VObject {
        protected static final int FILL_TYPE_WINDING = 0;
        int mChangingConfigurations;
        int mFillRule;
        protected PathParser.PathDataNode[] mNodes;
        String mPathName;

        public void applyTheme(Resources.Theme theme) {
        }

        public boolean canApplyTheme() {
            return false;
        }

        public boolean isClipPath() {
            return false;
        }

        public VPath() {
            this.mNodes = null;
            this.mFillRule = 0;
        }

        public void printVPath(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "    ";
            }
            Log.v("VectorDrawableCompat", str + "current path is :" + this.mPathName + " pathData is " + nodesToString(this.mNodes));
        }

        public String nodesToString(PathParser.PathDataNode[] pathDataNodeArr) {
            String str = " ";
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                str = str + pathDataNodeArr[i].mType + ":";
                for (float f : pathDataNodeArr[i].mParams) {
                    str = str + f + ",";
                }
            }
            return str;
        }

        public VPath(VPath vPath) {
            this.mNodes = null;
            this.mFillRule = 0;
            this.mPathName = vPath.mPathName;
            this.mChangingConfigurations = vPath.mChangingConfigurations;
            this.mNodes = PathParser.deepCopyNodes(vPath.mNodes);
        }

        public void toPath(Path path) {
            path.reset();
            PathParser.PathDataNode[] pathDataNodeArr = this.mNodes;
            if (pathDataNodeArr != null) {
                PathParser.PathDataNode.nodesToPath(pathDataNodeArr, path);
            }
        }

        public String getPathName() {
            return this.mPathName;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.mNodes;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.canMorph(this.mNodes, pathDataNodeArr)) {
                this.mNodes = PathParser.deepCopyNodes(pathDataNodeArr);
            } else {
                PathParser.updateNodes(this.mNodes, pathDataNodeArr);
            }
        }
    }

    static class e extends VPath {
        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public boolean isClipPath() {
            return true;
        }

        e() {
        }

        e(e eVar) {
            super(eVar);
        }

        public void a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (bgk.c(xmlPullParser, "android:pathData")) {
                c(xmlPullParser);
            }
        }

        private void c(XmlPullParser xmlPullParser) {
            String strD = bgk.d(xmlPullParser, "android:name");
            if (strD != null) {
                this.mPathName = strD;
            }
            String strD2 = bgk.d(xmlPullParser, "android:pathData");
            if (strD2 != null) {
                this.mNodes = PathParser.createNodesFromPathData(strD2);
            }
            this.mFillRule = a(bgk.d(xmlPullParser, "android:fillType"), this.mFillRule);
        }

        private int a(String str, int i) {
            if (str != null) {
                str.hashCode();
                if (str.equals("evenOdd")) {
                    return 1;
                }
                if (str.equals("nonZero")) {
                    return 0;
                }
            }
            return i;
        }
    }

    public static class a extends VPath {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f5176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        bgg f5177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Paint.Cap f5178c;
        float d;
        bgg e;
        float f;
        float g;
        Paint.Join h;
        float i;
        float j;
        float m;
        private int[] n;

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public void applyTheme(Resources.Theme theme) {
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public /* bridge */ /* synthetic */ PathParser.PathDataNode[] getPathData() {
            return super.getPathData();
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public /* bridge */ /* synthetic */ String getPathName() {
            return super.getPathName();
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public /* bridge */ /* synthetic */ boolean isClipPath() {
            return super.isClipPath();
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public /* bridge */ /* synthetic */ String nodesToString(PathParser.PathDataNode[] pathDataNodeArr) {
            return super.nodesToString(pathDataNodeArr);
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public /* bridge */ /* synthetic */ void printVPath(int i) {
            super.printVPath(i);
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public /* bridge */ /* synthetic */ void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            super.setPathData(pathDataNodeArr);
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public /* bridge */ /* synthetic */ void toPath(Path path) {
            super.toPath(path);
        }

        a() {
            this.i = 0.0f;
            this.f5176a = 1.0f;
            this.d = 1.0f;
            this.m = 0.0f;
            this.f = 1.0f;
            this.j = 0.0f;
            this.f5178c = Paint.Cap.BUTT;
            this.h = Paint.Join.MITER;
            this.g = 4.0f;
        }

        a(a aVar) {
            super(aVar);
            this.i = 0.0f;
            this.f5176a = 1.0f;
            this.d = 1.0f;
            this.m = 0.0f;
            this.f = 1.0f;
            this.j = 0.0f;
            this.f5178c = Paint.Cap.BUTT;
            this.h = Paint.Join.MITER;
            this.g = 4.0f;
            this.n = aVar.n;
            this.f5177b = aVar.f5177b;
            this.i = aVar.i;
            this.f5176a = aVar.f5176a;
            this.e = aVar.e;
            this.mFillRule = aVar.mFillRule;
            this.d = aVar.d;
            this.m = aVar.m;
            this.f = aVar.f;
            this.j = aVar.j;
            this.f5178c = aVar.f5178c;
            this.h = aVar.h;
            this.g = aVar.g;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0037  */
        private Paint.Cap c(String str, Paint.Cap cap) {
            byte b2;
            str.hashCode();
            int iHashCode = str.hashCode();
            if (iHashCode != -894674659) {
                if (iHashCode != 3035667) {
                    if (iHashCode == 108704142 && str.equals("round")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("butt")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("square")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                return Paint.Cap.SQUARE;
            }
            if (b2 != 1) {
                return b2 != 2 ? cap : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0037  */
        private Paint.Join d(String str, Paint.Join join) {
            byte b2;
            str.hashCode();
            int iHashCode = str.hashCode();
            if (iHashCode != 93630586) {
                if (iHashCode != 103906565) {
                    if (iHashCode == 108704142 && str.equals("round")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("miter")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("bevel")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                return Paint.Join.BEVEL;
            }
            if (b2 != 1) {
                return b2 != 2 ? join : Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VPath
        public boolean canApplyTheme() {
            return this.n != null;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            b(xmlPullParser);
        }

        private void b(XmlPullParser xmlPullParser) {
            this.n = null;
            if (bgk.c(xmlPullParser, "android:pathData")) {
                String strD = bgk.d(xmlPullParser, "android:name");
                if (strD != null) {
                    this.mPathName = strD;
                }
                String strD2 = bgk.d(xmlPullParser, "android:pathData");
                if (strD2 != null) {
                    this.mNodes = PathParser.createNodesFromPathData(strD2);
                }
                this.e = bgk.a(xmlPullParser, "android:fillColor", 0);
                this.d = bgk.e(xmlPullParser, "android:fillAlpha", this.d);
                String strD3 = bgk.d(xmlPullParser, "android:strokeLineCap");
                if (strD3 != null) {
                    this.f5178c = c(strD3, Paint.Cap.BUTT);
                }
                String strD4 = bgk.d(xmlPullParser, "android:strokeLineJoin");
                if (strD4 != null) {
                    this.h = d(strD4, this.h);
                }
                this.g = bgk.e(xmlPullParser, "android:strokeMiterLimit", this.g);
                this.f5177b = bgk.a(xmlPullParser, "android:strokeColor", 0);
                this.f5176a = bgk.e(xmlPullParser, "android:strokeAlpha", this.f5176a);
                this.i = bgk.e(xmlPullParser, "android:strokeWidth", this.i);
                this.f = bgk.e(xmlPullParser, "android:trimPathEnd", this.f);
                this.j = bgk.e(xmlPullParser, "android:trimPathOffset", this.j);
                this.m = bgk.e(xmlPullParser, "android:trimPathStart", this.m);
                this.mFillRule = e(bgk.d(xmlPullParser, "android:fillType"), this.mFillRule);
            }
        }

        private int e(String str, int i) {
            if (str != null) {
                str.hashCode();
                if (str.equals("evenOdd")) {
                    return 1;
                }
                if (str.equals("nonZero")) {
                    return 0;
                }
            }
            return i;
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
            return this.e.b() || this.f5177b.b();
        }

        @Override // com.huawei.animationkit.computationalwallpaper.vectordrawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] iArr) {
            return this.f5177b.c(iArr) | this.e.c(iArr);
        }

        public int e() {
            return this.f5177b.a();
        }

        public void e(int i) {
            this.f5177b.c(i);
        }

        public int d() {
            return this.e.a();
        }

        public void b(int i) {
            this.e.c(i);
        }

        public boolean c() {
            return this.e.e();
        }

        public Shader a() {
            return this.e.c();
        }

        public void a(int[] iArr) {
            Shader shaderC = this.e.c();
            if (shaderC instanceof bgl) {
                d((bgl) shaderC, iArr);
            }
        }

        private void d(bgl bglVar, int[] iArr) {
            this.e.d(new bgl(bglVar.e(), bglVar.j(), bglVar.a(), bglVar.g(), iArr, bglVar.d(), bglVar.c()));
        }
    }
}
