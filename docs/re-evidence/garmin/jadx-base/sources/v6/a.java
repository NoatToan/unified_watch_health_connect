package v6;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: v6.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C3279a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175777a;

        static {
            int[] iArr = new int[androidx.constraintlayout.widget.a.EnumC0083a.values().length];
            f175777a = iArr;
            try {
                iArr[androidx.constraintlayout.widget.a.EnumC0083a.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f175777a[androidx.constraintlayout.widget.a.EnumC0083a.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f175777a[androidx.constraintlayout.widget.a.EnumC0083a.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f175777a[androidx.constraintlayout.widget.a.EnumC0083a.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f175777a[androidx.constraintlayout.widget.a.EnumC0083a.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f175777a[androidx.constraintlayout.widget.a.EnumC0083a.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f175777a[androidx.constraintlayout.widget.a.EnumC0083a.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static int a(int i14) {
        int i15 = (i14 & (~(i14 >> 31))) - 255;
        return (i15 & (i15 >> 31)) + 255;
    }

    public static void b(androidx.constraintlayout.widget.a aVar, View view2, float[] fArr) {
        Class<?> cls = view2.getClass();
        String str = "set" + aVar.f6150b;
        try {
            int i14 = C3279a.f175777a[aVar.f6151c.ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z14 = true;
            switch (i14) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view2, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view2, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iA = (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view2, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view2, Integer.valueOf((a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + aVar.f6150b);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z14 = false;
                    }
                    method2.invoke(view2, Boolean.valueOf(z14));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view2, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException unused) {
            w6.a.c(view2);
        } catch (NoSuchMethodException unused2) {
            w6.a.c(view2);
        } catch (InvocationTargetException unused3) {
            w6.a.c(view2);
        }
    }
}
