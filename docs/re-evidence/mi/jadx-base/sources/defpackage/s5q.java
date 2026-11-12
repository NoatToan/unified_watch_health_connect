package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class s5q extends r5q {
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f33331k;
    public final Method l;
    public final Method m;

    public s5q() {
        Class<?> clsT;
        Constructor<?> constructorU;
        Method methodQ;
        Method methodR;
        Method methodV;
        Method methodP;
        Method methodS;
        try {
            clsT = t();
            constructorU = u(clsT);
            methodQ = q(clsT);
            methodR = r(clsT);
            methodV = v(clsT);
            methodP = p(clsT);
            methodS = s(clsT);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            clsT = null;
            constructorU = null;
            methodQ = null;
            methodR = null;
            methodV = null;
            methodP = null;
            methodS = null;
        }
        this.g = clsT;
        this.h = constructorU;
        this.i = methodQ;
        this.j = methodR;
        this.f33331k = methodV;
        this.l = methodP;
        this.m = methodS;
    }

    @Override // defpackage.r5q, defpackage.v5q
    public Typeface a(Context context, h0a.c cVar, Resources resources, int i) {
        if (!o()) {
            return super.a(context, cVar, resources, i);
        }
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        for (h0a.d dVar : cVar.a()) {
            if (!l(context, objJ, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                k(objJ);
                return null;
            }
        }
        if (n(objJ)) {
            return h(objJ);
        }
        return null;
    }

    @Override // defpackage.v5q
    public Typeface b(Context context, CancellationSignal cancellationSignal, j0a.b[] bVarArr, int i) {
        Typeface typefaceH;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!o()) {
            j0a.b bVarF = f(bVarArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarF.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarF.e()).setItalic(bVarF.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapF = w5q.f(context, bVarArr, cancellationSignal);
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        boolean z = false;
        for (j0a.b bVar : bVarArr) {
            ByteBuffer byteBuffer = mapF.get(bVar.d());
            if (byteBuffer != null) {
                if (!m(objJ, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    k(objJ);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            k(objJ);
            return null;
        }
        if (n(objJ) && (typefaceH = h(objJ)) != null) {
            return Typeface.create(typefaceH, i);
        }
        return null;
    }

    @Override // defpackage.v5q
    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        if (!o()) {
            return super.c(context, resources, i, str, i2);
        }
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        if (!l(context, objJ, str, 0, -1, -1, null)) {
            k(objJ);
            return null;
        }
        if (n(objJ)) {
            return h(objJ);
        }
        return null;
    }

    public Typeface h(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object j() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void k(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean l(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n(Object obj) {
        try {
            return ((Boolean) this.f33331k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o() {
        return this.i != null;
    }

    public Method p(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method q(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method r(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method s(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class<?> t() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor<?> u(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    public Method v(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }
}
