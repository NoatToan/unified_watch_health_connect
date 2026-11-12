package com.swmansion.gesturehandler.react;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.ViewGroupManager;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iej;

/* JADX INFO: loaded from: classes6.dex */
public class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> {

    public static class a extends ViewGroup {
        public static TypedValue h = new TypedValue();
        public static a i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f10624b;
        public Integer c;
        public boolean d;
        public boolean e;
        public float f;
        public boolean g;

        public a(Context context) {
            super(context);
            this.f10623a = 0;
            this.d = false;
            this.e = false;
            this.f = 0.0f;
            this.g = false;
            setClickable(true);
            setFocusable(true);
            this.g = true;
        }

        @TargetApi(21)
        public static int d(Context context, String str) {
            SoftAssertions.assertNotNull(str);
            if ("selectableItemBackground".equals(str)) {
                return R.attr.selectableItemBackground;
            }
            return "selectableItemBackgroundBorderless".equals(str) ? R.attr.selectableItemBackgroundBorderless : context.getResources().getIdentifier(str, "attr", PluginPackageConstant.RN_DIR_A);
        }

        public final Drawable b(Drawable drawable) {
            Integer num = this.f10624b;
            if (num != null && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}}, new int[]{num.intValue()}));
            }
            Integer num2 = this.c;
            if (num2 != null && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) exh.c(num2.intValue()));
            }
            return drawable;
        }

        public final Drawable c() {
            getContext().getTheme().resolveAttribute(d(getContext(), this.e ? "selectableItemBackgroundBorderless" : "selectableItemBackground"), h, true);
            return getResources().getDrawable(h.resourceId, getContext().getTheme());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f, float f2) {
            a aVar = i;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        public void e(float f) {
            this.f = f * getResources().getDisplayMetrics().density;
            this.g = true;
        }

        public void f(Integer num) {
            this.f10624b = num;
            this.g = true;
        }

        public void g(Integer num) {
            this.c = num;
            this.g = true;
        }

        public void h(boolean z) {
            this.e = z;
        }

        public void i(boolean z) {
            this.d = z;
            this.g = true;
        }

        public final void j() {
            if (this.g) {
                this.g = false;
                if (this.f10623a == 0) {
                    setBackground(null);
                }
                setForeground(null);
                if (this.d) {
                    setForeground(b(c()));
                    int i2 = this.f10623a;
                    if (i2 != 0) {
                        setBackgroundColor(i2);
                        return;
                    }
                    return;
                }
                if (this.f10623a == 0 && this.f10624b == null) {
                    setBackground(c());
                    return;
                }
                PaintDrawable paintDrawable = new PaintDrawable(this.f10623a);
                Drawable drawableC = c();
                float f = this.f;
                if (f != 0.0f) {
                    paintDrawable.setCornerRadius(f);
                    if (drawableC instanceof RippleDrawable) {
                        PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                        paintDrawable2.setCornerRadius(this.f);
                        ((RippleDrawable) drawableC).setDrawableByLayerId(R.id.mask, paintDrawable2);
                    }
                }
                b(drawableC);
                setBackground(new LayerDrawable(new Drawable[]{paintDrawable, drawableC}));
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        public void setBackgroundColor(int i2) {
            this.f10623a = i2;
            this.g = true;
        }

        @Override // android.view.View
        public void setPressed(boolean z) {
            if (z && i == null) {
                i = this;
            }
            if (!z || i == this) {
                super.setPressed(z);
            }
            if (z || i != this) {
                return;
            }
            i = null;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerButton";
    }

    @iej(name = "borderless")
    public void setBorderless(a aVar, boolean z) {
        aVar.h(z);
    }

    @iej(name = "enabled")
    public void setEnabled(a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @iej(name = "foreground")
    @TargetApi(23)
    public void setForeground(a aVar, boolean z) {
        aVar.i(z);
    }

    @iej(name = "rippleColor")
    public void setRippleColor(a aVar, Integer num) {
        aVar.f(num);
    }

    @iej(name = "rippleRadius")
    public void setRippleRadius(a aVar, Integer num) {
        aVar.g(num);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(g9p g9pVar) {
        return new a(g9pVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        aVar.j();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @iej(name = "borderRadius")
    public void setBorderRadius(a aVar, float f) {
        aVar.e(f);
    }
}
