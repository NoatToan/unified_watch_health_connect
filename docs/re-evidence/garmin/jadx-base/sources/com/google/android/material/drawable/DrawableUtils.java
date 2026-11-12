package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.exoplayer2.source.mediaparser.a;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes14.dex */
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    public static class OutlineCompatL {
        private OutlineCompatL() {
        }

        public static void setConvexPath(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    public static class OutlineCompatR {
        private OutlineCompatR() {
        }

        public static void setPath(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    private DrawableUtils() {
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable, Drawable drawable2, int i14, int i15) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i14 == -1) {
            i14 = getTopLayerIntrinsicWidth(drawable, drawable2);
        }
        if (i15 == -1) {
            i15 = getTopLayerIntrinsicHeight(drawable, drawable2);
        }
        if (i14 > drawable.getIntrinsicWidth() || i15 > drawable.getIntrinsicHeight()) {
            float f14 = i14 / i15;
            if (f14 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i15 = (int) (intrinsicWidth / f14);
                i14 = intrinsicWidth;
            } else {
                i15 = drawable.getIntrinsicHeight();
                i14 = (int) (f14 * i15);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i14, i15);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable createTintableDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    private static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z14) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z14) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = drawable.mutate();
        if (mode != null) {
            drawableMutate.setTintMode(mode);
        }
        return drawableMutate;
    }

    public static int[] getCheckedState(int[] iArr) {
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 == 16842912) {
                return iArr;
            }
            if (i15 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i14] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static ColorStateList getColorStateListOrNull(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !a.r(drawable)) {
            return null;
        }
        return a.i(drawable).getColorStateList();
    }

    private static int getTopLayerIntrinsicHeight(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int getTopLayerIntrinsicWidth(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    public static int[] getUncheckedState(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i14 = 0;
        for (int i15 : iArr) {
            if (i15 != 16842912) {
                iArr2[i14] = i15;
                i14++;
            }
        }
        return iArr2;
    }

    public static AttributeSet parseDrawableXml(Context context, int i14, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i14);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e4) {
            e = e4;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i14));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e14) {
            e = e14;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i14));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void setOutlineToPath(Outline outline, Path path) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            OutlineCompatR.setPath(outline, path);
            return;
        }
        if (i14 >= 29) {
            try {
                OutlineCompatL.setConvexPath(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            OutlineCompatL.setConvexPath(outline, path);
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(RippleDrawable rippleDrawable, int i14) {
        rippleDrawable.setRadius(i14);
    }

    public static void setTint(Drawable drawable, int i14) {
        if (i14 != 0) {
            drawable.setTint(i14);
        } else {
            drawable.setTintList(null);
        }
    }

    public static PorterDuffColorFilter updateTintFilter(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable, Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }
}
