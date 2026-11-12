package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f5123b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i f5124c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f5125a;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f5126a = {2131230973, 2131230971, 2131230897};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f5127b = {2131230921, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f5128c = {2131230970, 2131230972, 2131230914, R.drawable.abc_text_cursor_material, 2131230967, 2131230968, 2131230969};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f5129d = {2131230946, R.drawable.abc_cab_background_internal_bg, 2131230945};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f5130e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f5131f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i14, int[] iArr) {
            for (int i15 : iArr) {
                if (i15 == i14) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(int i14, Context context) {
            int iC = r0.c(R.attr.colorControlHighlight, context);
            int iB = r0.b(R.attr.colorButtonNormal, context);
            int[] iArr = r0.f5233b;
            int[] iArr2 = r0.f5235d;
            int iC2 = c7.d.c(iC, i14);
            return new ColorStateList(new int[][]{iArr, iArr2, r0.f5234c, r0.f5237f}, new int[]{iB, iC2, c7.d.c(iC, i14), i14});
        }

        public static LayerDrawable c(l0 l0Var, Context context, int i14) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i14);
            Drawable drawableC = l0Var.c(context, R.drawable.abc_star_black_48dp);
            Drawable drawableC2 = l0Var.c(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableC;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableC2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableC2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i14, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = i.f5123b;
            }
            drawableMutate.setColorFilter(i.c(i14, mode));
        }

        public final ColorStateList d(int i14, Context context) {
            if (i14 == R.drawable.abc_edit_text_material) {
                return a7.b.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i14 == 2131230963) {
                return a7.b.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i14 != R.drawable.abc_switch_thumb_material) {
                if (i14 == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(r0.c(R.attr.colorButtonNormal, context), context);
                }
                if (i14 == R.drawable.abc_btn_borderless_material) {
                    return b(0, context);
                }
                if (i14 == R.drawable.abc_btn_colored_material) {
                    return b(r0.c(R.attr.colorAccent, context), context);
                }
                if (i14 == 2131230958 || i14 == R.drawable.abc_spinner_textfield_background_material) {
                    return a7.b.getColorStateList(context, R.color.abc_tint_spinner);
                }
                if (a(i14, this.f5127b)) {
                    return r0.d(R.attr.colorControlNormal, context);
                }
                if (a(i14, this.f5130e)) {
                    return a7.b.getColorStateList(context, R.color.abc_tint_default);
                }
                if (a(i14, this.f5131f)) {
                    return a7.b.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i14 == R.drawable.abc_seekbar_thumb_material) {
                    return a7.b.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListD = r0.d(R.attr.colorSwitchThumbNormal, context);
            if (colorStateListD == null || !colorStateListD.isStateful()) {
                iArr[0] = r0.f5233b;
                iArr2[0] = r0.b(R.attr.colorSwitchThumbNormal, context);
                iArr[1] = r0.f5236e;
                iArr2[1] = r0.c(R.attr.colorControlActivated, context);
                iArr[2] = r0.f5237f;
                iArr2[2] = r0.c(R.attr.colorSwitchThumbNormal, context);
            } else {
                int[] iArr3 = r0.f5233b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
                iArr[1] = r0.f5236e;
                iArr2[1] = r0.c(R.attr.colorControlActivated, context);
                iArr[2] = r0.f5237f;
                iArr2[2] = colorStateListD.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized i a() {
        try {
            if (f5124c == null) {
                d();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f5124c;
    }

    public static synchronized PorterDuffColorFilter c(int i14, PorterDuff.Mode mode) {
        return l0.e(i14, mode);
    }

    public static synchronized void d() {
        if (f5124c == null) {
            i iVar = new i();
            f5124c = iVar;
            iVar.f5125a = l0.b();
            l0 l0Var = f5124c.f5125a;
            a aVar = new a();
            synchronized (l0Var) {
                l0Var.f5176e = aVar;
            }
        }
    }

    public static void e(Drawable drawable, u0 u0Var, int[] iArr) {
        PorterDuff.Mode mode = l0.f5169f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z14 = u0Var.f5251d;
            if (!z14 && !u0Var.f5250c) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z14 ? u0Var.f5248a : null;
            PorterDuff.Mode mode2 = u0Var.f5250c ? u0Var.f5249b : l0.f5169f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterE = l0.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    public final synchronized Drawable b(Context context, int i14) {
        return this.f5125a.c(context, i14);
    }
}
