package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p1.l1;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static l0 f5170g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, l1<ColorStateList>> f5172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap<Context, p1.z<WeakReference<Drawable.ConstantState>>> f5173b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f5174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i.a f5176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f5169f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f5171h = new a(6);

    public static class a extends p1.c0<Integer, PorterDuffColorFilter> {
        public a(int i14) {
            super(i14);
        }
    }

    public static synchronized l0 b() {
        try {
            if (f5170g == null) {
                f5170g = new l0();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f5170g;
    }

    public static synchronized PorterDuffColorFilter e(int i14, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        a aVar = f5171h;
        aVar.getClass();
        int i15 = (31 + i14) * 31;
        porterDuffColorFilter = aVar.get(Integer.valueOf(mode.hashCode() + i15));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i14, mode);
            aVar.put(Integer.valueOf(mode.hashCode() + i15), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(int i14, Context context) {
        LayerDrawable layerDrawableC;
        WeakReference<Drawable.ConstantState> weakReferenceB;
        Drawable drawableNewDrawable;
        if (this.f5174c == null) {
            this.f5174c = new TypedValue();
        }
        TypedValue typedValue = this.f5174c;
        context.getResources().getValue(i14, typedValue, true);
        long j8 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            p1.z<WeakReference<Drawable.ConstantState>> zVar = this.f5173b.get(context);
            layerDrawableC = null;
            if (zVar != null && (weakReferenceB = zVar.b(j8)) != null) {
                Drawable.ConstantState constantState = weakReferenceB.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    zVar.g(j8);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.f5176e != null) {
            if (i14 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, 2131230914)});
            } else if (i14 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = i.a.c(this, context, R.dimen.abc_star_big);
            } else if (i14 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = i.a.c(this, context, R.dimen.abc_star_medium);
            } else if (i14 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = i.a.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC == null) {
            return layerDrawableC;
        }
        layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableC;
                }
                p1.z<WeakReference<Drawable.ConstantState>> zVar2 = this.f5173b.get(context);
                if (zVar2 == null) {
                    zVar2 = new p1.z<>();
                    this.f5173b.put(context, zVar2);
                }
                zVar2.f(j8, new WeakReference<>(constantState2));
                return layerDrawableC;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized Drawable c(Context context, int i14) {
        return d(context, i14, false);
    }

    public final synchronized Drawable d(Context context, int i14, boolean z14) {
        Drawable drawableA;
        try {
            if (!this.f5175d) {
                this.f5175d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof androidx.vectordrawable.graphics.drawable.f) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f5175d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(i14, context);
            if (drawableA == null) {
                drawableA = a7.b.getDrawable(context, i14);
            }
            if (drawableA != null) {
                drawableA = g(context, i14, z14, drawableA);
            }
            if (drawableA != null) {
                c0.a(drawableA);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(int i14, Context context) {
        ColorStateList colorStateListC;
        l1<ColorStateList> l1Var;
        WeakHashMap<Context, l1<ColorStateList>> weakHashMap = this.f5172a;
        ColorStateList colorStateListD = null;
        colorStateListC = (weakHashMap == null || (l1Var = weakHashMap.get(context)) == null) ? null : l1Var.c(i14);
        if (colorStateListC == null) {
            i.a aVar = this.f5176e;
            if (aVar != null) {
                colorStateListD = aVar.d(i14, context);
            }
            if (colorStateListD != null) {
                if (this.f5172a == null) {
                    this.f5172a = new WeakHashMap<>();
                }
                l1<ColorStateList> l1Var2 = this.f5172a.get(context);
                if (l1Var2 == null) {
                    l1Var2 = new l1<>();
                    this.f5172a.put(context, l1Var2);
                }
                l1Var2.a(i14, colorStateListD);
            }
            colorStateListC = colorStateListD;
        }
        return colorStateListC;
    }

    public final Drawable g(Context context, int i14, boolean z14, Drawable drawable) {
        ColorStateList colorStateListF = f(i14, context);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListF);
            if (this.f5176e != null && i14 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        if (this.f5176e != null) {
            if (i14 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = r0.c(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode2 = i.f5123b;
                i.a.e(drawableFindDrawableByLayerId, iC, mode2);
                i.a.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), r0.c(R.attr.colorControlNormal, context), mode2);
                i.a.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), r0.c(R.attr.colorControlActivated, context), mode2);
                return drawable;
            }
            if (i14 == R.drawable.abc_ratingbar_material || i14 == R.drawable.abc_ratingbar_indicator_material || i14 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = r0.b(R.attr.colorControlNormal, context);
                PorterDuff.Mode mode3 = i.f5123b;
                i.a.e(drawableFindDrawableByLayerId2, iB, mode3);
                i.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), r0.c(R.attr.colorControlActivated, context), mode3);
                i.a.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), r0.c(R.attr.colorControlActivated, context), mode3);
                return drawable;
            }
        }
        if (h(i14, context, drawable) || !z14) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    public final boolean h(int i14, Context context, Drawable drawable) {
        int i15;
        boolean z14;
        int iRound;
        Drawable drawableMutate;
        i.a aVar = this.f5176e;
        if (aVar != null) {
            PorterDuff.Mode mode = i.f5123b;
            if (i.a.a(i14, aVar.f5126a)) {
                i15 = R.attr.colorControlNormal;
            } else if (i.a.a(i14, aVar.f5128c)) {
                i15 = R.attr.colorControlActivated;
            } else {
                if (i.a.a(i14, aVar.f5129d)) {
                    mode = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i14 == 2131230934) {
                        iRound = Math.round(40.8f);
                        i15 = 16842800;
                        z14 = true;
                    } else {
                        if (i14 != R.drawable.abc_dialog_material_background) {
                            i15 = 0;
                            z14 = false;
                        }
                        iRound = -1;
                    }
                    if (z14) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(i.c(r0.c(i15, context), mode));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        return true;
                    }
                }
                i15 = 16842801;
            }
            z14 = true;
            iRound = -1;
            if (z14) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(i.c(r0.c(i15, context), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
        }
        return false;
    }
}
