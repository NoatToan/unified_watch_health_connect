package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class x47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f38675a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f38676b = new int[0];
    public static final Rect c = new Rect();

    @RequiresApi(18)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f38677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f38678b;
        public static final Field c;
        public static final Field d;
        public static final Field e;
        public static final Field f;

        /* JADX WARN: Code duplicated, block: B:25:0x004c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField(TSMAuthContants.PARAM_KEY_RIGHT);
                            try {
                                field4 = cls.getField("bottom");
                                z = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f38678b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            f38677a = true;
                            return;
                        }
                        f38678b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        f38677a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f38678b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            f38677a = true;
                            return;
                        }
                        f38678b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        f38677a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f38678b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            f38677a = true;
                            return;
                        }
                        f38678b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        f38677a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f38678b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        f38677a = true;
                        return;
                    }
                    f38678b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    f38677a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f38678b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        f38677a = true;
                        return;
                    }
                    f38678b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    f38677a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f38678b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        f38677a = true;
                        return;
                    }
                    f38678b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    f38677a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z) {
                f38678b = method;
                c = field;
                d = field2;
                e = field3;
                f = field4;
                f38677a = true;
                return;
            }
            f38678b = null;
            c = null;
            d = null;
            e = null;
            f = null;
            f38677a = false;
        }

        public static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f38677a) {
                try {
                    Object objInvoke = f38678b.invoke(drawable, new Object[0]);
                    if (objInvoke != null) {
                        return new Rect(c.getInt(objInvoke), d.getInt(objInvoke), e.getInt(objInvoke), f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return x47.c;
        }
    }

    @RequiresApi(29)
    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f38675a);
        } else {
            drawable.setState(f38676b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(k47.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
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
}
