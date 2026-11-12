package defpackage;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class auk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f3462a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3463b = {R.attr.state_pressed};
    public static final int[] c = {R.attr.state_hovered, R.attr.state_focused};
    public static final int[] d = {R.attr.state_focused};
    public static final int[] e = {R.attr.state_hovered};
    public static final int[] f = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    public static final int[] h = {R.attr.state_selected, R.attr.state_focused};
    public static final int[] i = {R.attr.state_selected, R.attr.state_hovered};
    public static final int[] j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f3464k = {R.attr.state_enabled, R.attr.state_pressed};

    @VisibleForTesting
    public static final String l = auk.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f3462a) {
            return new ColorStateList(new int[][]{j, StateSet.NOTHING}, new int[]{c(colorStateList, f), c(colorStateList, f3463b)});
        }
        int[] iArr = f;
        int[] iArr2 = g;
        int[] iArr3 = h;
        int[] iArr4 = i;
        int[] iArr5 = f3463b;
        int[] iArr6 = c;
        int[] iArr7 = d;
        int[] iArr8 = e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    public static int b(int i2) {
        return z44.p(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    public static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f3462a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f3464k, 0));
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
