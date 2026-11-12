package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class crk {
    public static crk i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, SparseArrayCompat<ColorStateList>> f14646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SimpleArrayMap<String, b> f14647b;
    public SparseArrayCompat<String> c;
    public final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public c g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final a j = new a(6);

    public static class a extends LruCache<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(i);
        }

        public static int a(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i, mode)));
        }

        public PorterDuffColorFilter c(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i, mode)), porterDuffColorFilter);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface c {
        Drawable a(crk crkVar, Context context, int i);

        ColorStateList b(Context context, int i);

        PorterDuff.Mode c(int i);

        boolean d(Context context, int i, Drawable drawable);

        boolean e(Context context, int i, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized crk g() {
        try {
            if (i == null) {
                crk crkVar = new crk();
                i = crkVar;
                o(crkVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter k(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterB;
        a aVar = j;
        porterDuffColorFilterB = aVar.b(i2, mode);
        if (porterDuffColorFilterB == null) {
            porterDuffColorFilterB = new PorterDuffColorFilter(i2, mode);
            aVar.c(i2, mode, porterDuffColorFilterB);
        }
        return porterDuffColorFilterB;
    }

    public static void o(crk crkVar) {
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof doq) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, vfp vfpVar, int[] iArr) {
        int[] state = drawable.getState();
        if (!x47.a(drawable) || drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = vfpVar.d;
            if (z || vfpVar.c) {
                drawable.setColorFilter(f(z ? vfpVar.f36854a : null, vfpVar.c ? vfpVar.f36855b : h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.d.get(context);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray<>();
                this.d.put(context, longSparseArray);
            }
            longSparseArray.put(j2, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, int i2, ColorStateList colorStateList) {
        if (this.f14646a == null) {
            this.f14646a = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> sparseArrayCompat = this.f14646a.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat<>();
            this.f14646a.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i2, colorStateList);
    }

    public final void c(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable drawableI = i(context, dni.f15720a);
        if (drawableI == null || !p(drawableI)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.g;
        Drawable drawableA = cVar == null ? null : cVar.a(this, context, i2);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableA);
        }
        return drawableA;
    }

    public final synchronized Drawable h(Context context, long j2) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.d.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReference = longSparseArray.get(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.remove(j2);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i2) {
        return j(context, i2, false);
    }

    public synchronized Drawable j(Context context, int i2, boolean z) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i2);
            if (drawableQ == null) {
                drawableQ = e(context, i2);
            }
            if (drawableQ == null) {
                drawableQ = ni4.e(context, i2);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i2, z, drawableQ);
            }
            if (drawableQ != null) {
                x47.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    public synchronized ColorStateList l(Context context, int i2) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i2);
        if (colorStateListM == null) {
            c cVar = this.g;
            colorStateListM = cVar == null ? null : cVar.b(context, i2);
            if (colorStateListM != null) {
                b(context, i2, colorStateListM);
            }
        }
        return colorStateListM;
    }

    public final ColorStateList m(Context context, int i2) {
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.f14646a;
        if (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) {
            return null;
        }
        return sparseArrayCompat.get(i2);
    }

    public PorterDuff.Mode n(int i2) {
        c cVar = this.g;
        if (cVar == null) {
            return null;
        }
        return cVar.c(i2);
    }

    public final Drawable q(Context context, int i2) {
        int next;
        SimpleArrayMap<String, b> simpleArrayMap = this.f14647b;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.c;
        if (sparseArrayCompat != null) {
            String str = sparseArrayCompat.get(i2);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f14647b.get(str) == null)) {
                return null;
            }
        } else {
            this.c = new SparseArrayCompat<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.append(i2, name);
                b bVar = this.f14647b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableH == null) {
            this.c.append(i2, "appcompat_skip_skip");
        }
        return drawableH;
    }

    public synchronized void r(Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.d.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public synchronized Drawable s(Context context, goq goqVar, int i2) {
        try {
            Drawable drawableQ = q(context, i2);
            if (drawableQ == null) {
                drawableQ = goqVar.a(i2);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i2, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.g = cVar;
    }

    public final Drawable u(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i2);
        if (colorStateListL == null) {
            c cVar = this.g;
            if ((cVar == null || !cVar.d(context, i2, drawable)) && !w(context, i2, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (x47.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = k47.r(drawable);
        k47.o(drawableR, colorStateListL);
        PorterDuff.Mode modeN = n(i2);
        if (modeN == null) {
            return drawableR;
        }
        k47.p(drawableR, modeN);
        return drawableR;
    }

    public boolean w(Context context, int i2, Drawable drawable) {
        c cVar = this.g;
        return cVar != null && cVar.e(context, i2, drawable);
    }
}
