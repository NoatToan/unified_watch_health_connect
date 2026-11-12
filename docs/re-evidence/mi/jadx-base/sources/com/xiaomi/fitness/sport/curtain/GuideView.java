package com.xiaomi.fitness.sport.curtain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.SparseArray;
import android.view.View;
import androidx.collection.ArrayMap;
import defpackage.fac;
import defpackage.qad;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class GuideView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fac[] f12944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<fac, fac> f12945b;
    public int c;
    public Paint d;

    public GuideView(Context context) {
        super(context, null);
        this.c = -2013265920;
        f();
    }

    private void setHollowOffset(fac facVar) {
        if (facVar.a(1610612736) > 0) {
            int iA = facVar.a(1610612736);
            Rect rect = facVar.d;
            rect.left += iA;
            rect.top += iA;
            rect.bottom += iA;
            rect.right += iA;
            return;
        }
        if (facVar.a(536870912) > 0) {
            facVar.d.top += facVar.a(536870912);
            facVar.d.bottom += facVar.a(536870912);
        }
        if (facVar.a(1073741824) > 0) {
            facVar.d.right += facVar.a(1073741824);
            facVar.d.left += facVar.a(1073741824);
        }
    }

    private void setTheBoundPadding(fac facVar) {
        facVar.getClass();
    }

    public final void a(Canvas canvas) {
        this.d.setXfermode(null);
        this.d.setColor(this.c);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void b(fac facVar, Canvas canvas, Drawable drawable) {
        int iIntValue;
        try {
            Field declaredField = Class.forName("android.graphics.drawable.GradientDrawable").getDeclaredField("mGradientState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(drawable);
            Field declaredField2 = obj.getClass().getDeclaredField("mShape");
            declaredField2.setAccessible(true);
            iIntValue = ((Integer) declaredField2.get(obj)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            iIntValue = 0;
        }
        float cornerRadius = ((GradientDrawable) drawable).getCornerRadius();
        if (iIntValue == 1) {
            Rect rect = facVar.d;
            canvas.drawOval(new RectF(rect.left, rect.top, rect.right, rect.bottom), this.d);
        } else {
            float fMin = Math.min(cornerRadius, Math.min(facVar.d.width(), facVar.d.height()) * 0.5f);
            Rect rect2 = facVar.d;
            canvas.drawRoundRect(new RectF(rect2.left, rect2.top, rect2.right, rect2.bottom), fMin, fMin, this.d);
        }
    }

    public final void c(Canvas canvas) {
        this.d.setColor(-1);
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        for (fac facVar : this.f12944a) {
            e(facVar, canvas);
        }
    }

    public final boolean d(fac facVar, Canvas canvas) {
        facVar.getClass();
        if (!facVar.b()) {
            return false;
        }
        Drawable background = facVar.c.getBackground();
        if (background instanceof GradientDrawable) {
            b(facVar, canvas, background);
            return true;
        }
        if (!(background instanceof StateListDrawable) || !(background.getCurrent() instanceof GradientDrawable)) {
            return false;
        }
        b(facVar, canvas, background.getCurrent());
        return true;
    }

    public final void e(fac facVar, Canvas canvas) {
        if (this.f12944a.length <= 0) {
            return;
        }
        fac facVar2 = this.f12945b.get(facVar);
        if (facVar2 != null) {
            g(facVar2, canvas);
            return;
        }
        Rect rect = new Rect();
        facVar.d = rect;
        facVar.c.getDrawingRect(rect);
        int[] iArr = new int[2];
        facVar.c.getLocationOnScreen(iArr);
        Rect rect2 = facVar.d;
        int i = iArr[0];
        rect2.left = i;
        int i2 = iArr[1];
        rect2.top = i2;
        rect2.right += i;
        rect2.bottom += i2;
        setTheBoundPadding(facVar);
        setHollowOffset(facVar);
        g(facVar, canvas);
        this.f12945b.put(facVar, facVar);
    }

    public final void f() {
        this.d = new Paint(1);
        this.f12945b = new ArrayMap();
    }

    public final void g(fac facVar, Canvas canvas) {
        if (d(facVar, canvas)) {
            return;
        }
        canvas.drawRect(facVar.d, this.d);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        a(canvas);
        c(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(qad.b(getContext()), qad.a(getContext()) * 2);
    }

    public void setCurtainColor(int i) {
        this.c = i;
        postInvalidate();
    }

    public void setHollowInfo(SparseArray<fac> sparseArray) {
        fac[] facVarArr = new fac[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            facVarArr[i] = sparseArray.valueAt(i);
        }
        setHollowInfo(facVarArr);
    }

    public void setHollowInfo(fac... facVarArr) {
        this.f12944a = facVarArr;
        postInvalidate();
    }
}
