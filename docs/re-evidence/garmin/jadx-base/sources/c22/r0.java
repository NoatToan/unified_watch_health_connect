package c22;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc22/r0;", "", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f23226a = new r0();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/r0$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        LARGE,
        MEDIUM,
        DEFAULT,
        SMALL
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23232a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23232a = iArr;
        }
    }

    private r0() {
    }

    public static final LayerDrawable a(Context context, int i14, int i15, int i16, int i17, int i18, a aVar) {
        LayerDrawable layerDrawable;
        context.getClass();
        aVar.getClass();
        if (i14 == 0) {
            return null;
        }
        int i19 = b.f23232a[aVar.ordinal()];
        if (i19 == 1) {
            layerDrawable = (LayerDrawable) a7.b.getDrawable(context, R.drawable.gcm_rounded_icon_custom_shape_medium);
        } else if (i19 == 2) {
            layerDrawable = (LayerDrawable) a7.b.getDrawable(context, R.drawable.gcm_rounded_icon_custom_shape_default);
        } else if (i19 == 3) {
            layerDrawable = (LayerDrawable) a7.b.getDrawable(context, R.drawable.gcm_rounded_icon_custom_shape_small);
        } else {
            if (i19 != 4) {
                lc.u0.r();
                return null;
            }
            layerDrawable = (LayerDrawable) a7.b.getDrawable(context, R.drawable.gcm_rounded_icon_custom_shape_large);
        }
        Drawable drawable = context.getDrawable(i14);
        if (drawable == null || layerDrawable == null) {
            return null;
        }
        Drawable drawableMutate = layerDrawable.mutate();
        drawableMutate.getClass();
        LayerDrawable layerDrawable2 = (LayerDrawable) drawableMutate;
        Drawable drawableMutate2 = drawable.mutate();
        drawableMutate2.setTint(context.getColor(i16));
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate2.setTintMode(mode);
        layerDrawable2.findDrawableByLayerId(R.id.icon_background).mutate().setTint(context.getColor(i15));
        drawableMutate2.setTintMode(mode);
        layerDrawable2.setDrawableByLayerId(R.id.icon_drawable, drawableMutate2);
        Drawable drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.icon_stroke);
        drawableFindDrawableByLayerId.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawableFindDrawableByLayerId;
        if (i17 == 0 || i18 == 0) {
            gradientDrawable.setVisible(false, true);
            return layerDrawable2;
        }
        gradientDrawable.setVisible(true, true);
        Drawable drawableMutate3 = gradientDrawable.mutate();
        drawableMutate3.getClass();
        ((GradientDrawable) drawableMutate3).setStroke(i17, context.getColor(i18));
        return layerDrawable2;
    }

    public static /* synthetic */ LayerDrawable b(Context context, int i14, int i15, int i16, a aVar, int i17) {
        if ((i17 & 64) != 0) {
            aVar = a.MEDIUM;
        }
        return a(context, i14, i15, i16, 0, 0, aVar);
    }

    public static BitmapDrawable c(r0 r0Var, Context context, int i14, int i15) {
        r0Var.getClass();
        Drawable drawable = a7.b.getDrawable(context, i14);
        if (drawable == null) {
            return null;
        }
        f23226a.getClass();
        return new BitmapDrawable(context.getResources(), d7.b.b(drawable, i15, i15, 4));
    }
}
