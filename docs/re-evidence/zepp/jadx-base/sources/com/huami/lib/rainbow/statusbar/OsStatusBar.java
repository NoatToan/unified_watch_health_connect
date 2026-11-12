package com.huami.lib.rainbow.statusbar;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
interface OsStatusBar {

    public static class OsStatusBarDefault implements OsStatusBar {

        public static class a {
            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static void b(Window window, boolean z) {
                if (Build.VERSION.SDK_INT >= 23) {
                    View decorView = window.getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    if (z) {
                        decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                    } else {
                        decorView.setSystemUiVisibility(systemUiVisibility & (-8193));
                    }
                }
            }
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Activity activity, boolean z) {
            a.b(activity.getWindow(), z);
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Fragment fragment, boolean z) {
            if (fragment.getActivity() != null) {
                a.b(fragment.getActivity().getWindow(), z);
            }
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Window window, boolean z) {
            a.b(window, z);
        }
    }

    public static class OsStatusBarFlyme implements OsStatusBar {

        public static class a {
            private static Method a;
            private static Method b;
            private static Field c;
            private static int d;

            static {
                try {
                    a = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                try {
                    b = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                }
                try {
                    c = WindowManager.LayoutParams.class.getField("statusBarColor");
                } catch (NoSuchFieldException e3) {
                    e3.printStackTrace();
                }
                try {
                    d = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (NoSuchFieldException e5) {
                    e5.printStackTrace();
                }
            }

            private a() {
            }

            private static boolean c(WindowManager.LayoutParams layoutParams, String str, boolean z) {
                try {
                    Field declaredField = layoutParams.getClass().getDeclaredField(str);
                    declaredField.setAccessible(true);
                    int i = declaredField.getInt(layoutParams);
                    Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
                    declaredField2.setAccessible(true);
                    int i2 = declaredField2.getInt(layoutParams);
                    int i3 = z ? i | i2 : (~i) & i2;
                    if (i2 == i3) {
                        return false;
                    }
                    declaredField2.setInt(layoutParams, i3);
                    return true;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return false;
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                    return false;
                } catch (NoSuchFieldException e3) {
                    e3.printStackTrace();
                    return false;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return false;
                }
            }

            private static boolean d(int i, int i2) {
                return l(i) < i2;
            }

            private static void e(Window window, int i) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field field = c;
                if (field != null) {
                    try {
                        if (field.getInt(attributes) != i) {
                            c.set(attributes, Integer.valueOf(i));
                            window.setAttributes(attributes);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

            private static void f(Activity activity, int i) {
                Method method = a;
                if (method == null) {
                    boolean zD = d(i, 50);
                    if (c == null) {
                        g(activity, zD);
                        return;
                    } else {
                        h(activity, zD, zD);
                        j(activity.getWindow(), i);
                        return;
                    }
                }
                try {
                    method.invoke(activity, Integer.valueOf(i));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static void g(Activity activity, boolean z) {
                h(activity, z, true);
            }

            private static void h(Activity activity, boolean z, boolean z2) {
                Method method = b;
                if (method == null) {
                    if (z2) {
                        k(activity.getWindow(), z);
                        return;
                    }
                    return;
                }
                try {
                    method.invoke(activity, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }

            private static void i(View view, boolean z) {
                int systemUiVisibility = view.getSystemUiVisibility();
                int i = z ? d | systemUiVisibility : (~d) & systemUiVisibility;
                if (i != systemUiVisibility) {
                    view.setSystemUiVisibility(i);
                }
            }

            private static void j(Window window, int i) {
                try {
                    e(window, i);
                    if (Build.VERSION.SDK_INT > 22) {
                        i(window.getDecorView(), true);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static void k(Window window, boolean z) {
                if (Build.VERSION.SDK_INT < 23) {
                    c(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
                } else {
                    i(window.getDecorView(), z);
                    e(window, 0);
                }
            }

            private static int l(int i) {
                return (((((i & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16) * 38) + (((65280 & i) >> 8) * 75)) + ((i & 255) * 15)) >> 7;
            }
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Activity activity, boolean z) {
            a.g(activity, z);
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Fragment fragment, boolean z) {
            if (fragment.getActivity() != null) {
                a.g(fragment.getActivity(), z);
            }
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Window window, boolean z) {
            a.k(window, z);
        }
    }

    public static class OsStatusBarOppo implements OsStatusBar {

        public static class a {
            private static final int a = 16;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static void b(Window window, boolean z) {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    systemUiVisibility = z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
                } else if (i >= 21) {
                    systemUiVisibility = z ? systemUiVisibility | 16 : systemUiVisibility & (-17);
                }
                window.getDecorView().setSystemUiVisibility(systemUiVisibility);
            }
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Activity activity, boolean z) {
            a.b(activity.getWindow(), z);
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Fragment fragment, boolean z) {
            if (fragment.getActivity() != null) {
                setMode(fragment.getActivity(), z);
            }
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Window window, boolean z) {
            a.b(window, z);
        }
    }

    void setMode(@NonNull Activity activity, boolean z);

    void setMode(@NonNull Window window, boolean z);

    void setMode(@NonNull Fragment fragment, boolean z);

    public static class OsStatusBarMiui implements OsStatusBar {
        private OsStatusBarDefault a = new OsStatusBarDefault();

        public static class a {
            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static void b(Window window, boolean z) {
                Class<?> cls = window.getClass();
                try {
                    Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                    int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                    Class<?> cls3 = Integer.TYPE;
                    Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(z ? i : 0);
                    objArr[1] = Integer.valueOf(i);
                    method.invoke(window, objArr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Activity activity, boolean z) {
            a.b(activity.getWindow(), z);
            this.a.setMode(activity, z);
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Fragment fragment, boolean z) {
            if (fragment.getActivity() != null) {
                a.b(fragment.getActivity().getWindow(), z);
            }
            this.a.setMode(fragment, z);
        }

        @Override // com.huami.lib.rainbow.statusbar.OsStatusBar
        public void setMode(@NonNull Window window, boolean z) {
            a.b(window, z);
            this.a.setMode(window, z);
        }
    }
}
