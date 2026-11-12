package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class jrk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f23062a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("sColorStateCacheLock")
    public static final WeakHashMap<d, SparseArray<c>> f23063b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    @RequiresApi(21)
    public static class a {
        public static Drawable a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    @RequiresApi(23)
    public static class b {
        public static int a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f23064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f23065b;
        public final int c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f23064a = colorStateList;
            this.f23065b = configuration;
            this.c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f23066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f23067b;

        public d(Resources resources, Resources.Theme theme) {
            this.f23066a = resources;
            this.f23067b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f23066a.equals(dVar.f23066a) && l4h.a(this.f23067b, dVar.f23067b);
        }

        public int hashCode() {
            return l4h.b(this.f23066a, this.f23067b);
        }
    }

    public static abstract class e {
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void c(final int i, Handler handler) {
            e(handler).post(new Runnable() { // from class: lrk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25381a.f(i);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: krk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24232a.g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i);

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    public static final class f {

        @RequiresApi(23)
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f23068a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f23069b;
            public static boolean c;

            @SuppressLint({"BanUncheckedReflection"})
            public static void a(Resources.Theme theme) {
                synchronized (f23068a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f23069b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        c = true;
                    }
                    Method method = f23069b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f23069b = null;
                        }
                    }
                }
            }
        }

        @RequiresApi(29)
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(d dVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (c) {
            try {
                WeakHashMap<d, SparseArray<c>> weakHashMap = f23063b;
                SparseArray<c> sparseArray = weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i, new c(colorStateList, dVar.f23066a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList b(jrk.d r5, int r6) {
        /*
            java.lang.Object r0 = defpackage.jrk.c
            monitor-enter(r0)
            java.util.WeakHashMap<jrk$d, android.util.SparseArray<jrk$c>> r1 = defpackage.jrk.f23063b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            jrk$c r2 = (jrk.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f23065b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f23066a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f23067b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f23064a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrk.b(jrk$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i, theme);
    }

    public static ColorStateList e(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i, theme);
        if (colorStateListL == null) {
            return b.b(resources, i, theme);
        }
        a(dVar, i, colorStateListL, theme);
        return colorStateListL;
    }

    public static Drawable f(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i, theme);
    }

    public static Drawable g(Resources resources, int i, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i, i2, theme);
    }

    public static Typeface h(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, new TypedValue(), 0, null, null, false, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface i(Context context, int i, TypedValue typedValue, int i2, e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i, typedValue, i2, eVar, null, true, false);
    }

    public static void j(Context context, int i, e eVar, Handler handler) throws Resources.NotFoundException {
        g6i.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            n(context, i, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    public static TypedValue k() {
        ThreadLocal<TypedValue> threadLocal = f23062a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList l(Resources resources, int i, Resources.Theme theme) {
        if (m(resources, i)) {
            return null;
        }
        try {
            return v44.a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean m(Resources resources, int i) {
        TypedValue typedValueK = k();
        resources.getValue(i, typedValueK, true);
        int i2 = typedValueK.type;
        return i2 >= 28 && i2 <= 31;
    }

    public static Typeface n(Context context, int i, TypedValue typedValue, int i2, e eVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i, i2, eVar, handler, z, z2);
        if (typefaceO != null || eVar != null || z2) {
            return typefaceO;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    public static Typeface o(Context context, Resources resources, TypedValue typedValue, int i, int i2, e eVar, Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceF = q5q.f(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceF != null) {
            if (eVar != null) {
                eVar.d(typefaceF, handler);
            }
            return typefaceF;
        }
        if (z2) {
            return null;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                h0a.b bVarB = h0a.b(resources.getXml(i), resources);
                if (bVarB != null) {
                    return q5q.c(context, bVarB, resources, i, string, typedValue.assetCookie, i2, eVar, handler, z);
                }
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            }
            Typeface typefaceD = q5q.d(context, resources, i, string, typedValue.assetCookie, i2);
            if (eVar != null) {
                if (typefaceD != null) {
                    eVar.d(typefaceD, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
            return typefaceD;
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read xml resource ");
            sb.append(string);
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        } catch (XmlPullParserException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to parse xml resource ");
            sb2.append(string);
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
    }
}
