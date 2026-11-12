package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f5062a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5063b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f5064c = new Rect();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f5065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f5066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f5067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Field f5068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Field f5069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Field f5070f;

        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z14;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField(TtmlNode.LEFT);
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField(TtmlNode.RIGHT);
                            try {
                                field4 = cls.getField("bottom");
                                z14 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z14 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z14 = false;
                        if (z14) {
                            f5066b = method;
                            f5067c = field;
                            f5068d = field2;
                            f5069e = field3;
                            f5070f = field4;
                            f5065a = true;
                            return;
                        }
                        f5066b = null;
                        f5067c = null;
                        f5068d = null;
                        f5069e = null;
                        f5070f = null;
                        f5065a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z14 = false;
                        if (z14) {
                            f5066b = method;
                            f5067c = field;
                            f5068d = field2;
                            f5069e = field3;
                            f5070f = field4;
                            f5065a = true;
                            return;
                        }
                        f5066b = null;
                        f5067c = null;
                        f5068d = null;
                        f5069e = null;
                        f5070f = null;
                        f5065a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z14 = false;
                        if (z14) {
                            f5066b = method;
                            f5067c = field;
                            f5068d = field2;
                            f5069e = field3;
                            f5070f = field4;
                            f5065a = true;
                            return;
                        }
                        f5066b = null;
                        f5067c = null;
                        f5068d = null;
                        f5069e = null;
                        f5070f = null;
                        f5065a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z14 = false;
                    if (z14) {
                        f5066b = method;
                        f5067c = field;
                        f5068d = field2;
                        f5069e = field3;
                        f5070f = field4;
                        f5065a = true;
                        return;
                    }
                    f5066b = null;
                    f5067c = null;
                    f5068d = null;
                    f5069e = null;
                    f5070f = null;
                    f5065a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z14 = false;
                    if (z14) {
                        f5066b = method;
                        f5067c = field;
                        f5068d = field2;
                        f5069e = field3;
                        f5070f = field4;
                        f5065a = true;
                        return;
                    }
                    f5066b = null;
                    f5067c = null;
                    f5068d = null;
                    f5069e = null;
                    f5070f = null;
                    f5065a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z14 = false;
                    if (z14) {
                        f5066b = method;
                        f5067c = field;
                        f5068d = field2;
                        f5069e = field3;
                        f5070f = field4;
                        f5065a = true;
                        return;
                    }
                    f5066b = null;
                    f5067c = null;
                    f5068d = null;
                    f5069e = null;
                    f5070f = null;
                    f5065a = false;
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
            if (z14) {
                f5066b = method;
                f5067c = field;
                f5068d = field2;
                f5069e = field3;
                f5070f = field4;
                f5065a = true;
                return;
            }
            f5066b = null;
            f5067c = null;
            f5068d = null;
            f5069e = null;
            f5070f = null;
            f5065a = false;
        }

        private a() {
        }
    }

    public static class b {
        private b() {
        }

        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    private c0() {
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 29 || i14 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f5062a);
        } else {
            drawable.setState(f5063b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            Insets insetsA = b.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        Drawable drawableA = d7.a.a(drawable);
        if (i14 >= 29) {
            boolean z14 = a.f5065a;
        } else if (a.f5065a) {
            try {
                Object objInvoke = a.f5066b.invoke(drawableA, null);
                if (objInvoke != null) {
                    return new Rect(a.f5067c.getInt(objInvoke), a.f5068d.getInt(objInvoke), a.f5069e.getInt(objInvoke), a.f5070f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f5064c;
    }

    public static PorterDuff.Mode c(int i14, PorterDuff.Mode mode) {
        if (i14 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i14 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i14 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i14) {
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
