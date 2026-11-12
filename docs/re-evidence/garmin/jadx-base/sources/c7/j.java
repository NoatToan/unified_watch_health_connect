package c7;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f25206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Constructor<?> f25207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f25208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f25209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f25210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f25211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f25212m;

    public j() throws NoSuchMethodException {
        Method methodN;
        Constructor<?> constructor;
        Method methodM;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM = m(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodN = n(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodN = null;
            constructor = null;
            methodM = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f25206g = cls;
        this.f25207h = constructor;
        this.f25208i = methodM;
        this.f25209j = method;
        this.f25210k = method2;
        this.f25211l = method3;
        this.f25212m = methodN;
    }

    public static Method m(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // c7.i, c7.n
    public final Typeface a(Context context, b7.e.b bVar, Resources resources, int i14) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.f25208i == null) {
            return super.a(context, bVar, resources, i14);
        }
        try {
            objNewInstance = this.f25207h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            b7.e.c[] cVarArr = bVar.f16242a;
            int length = cVarArr.length;
            int i15 = 0;
            while (i15 < length) {
                b7.e.c cVar = cVarArr[i15];
                Context context2 = context;
                if (j(context2, objNewInstance, cVar.f16243a, cVar.f16247e, cVar.f16244b, cVar.f16245c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f16246d))) {
                    i15++;
                    context = context2;
                } else {
                    try {
                        this.f25211l.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            if (l(objNewInstance)) {
                return k(objNewInstance);
            }
        }
        return null;
    }

    @Override // c7.i, c7.n
    public final Typeface b(Context context, i7.l[] lVarArr, int i14) throws IOException {
        Object objNewInstance;
        Typeface typefaceK;
        boolean zBooleanValue;
        if (lVarArr.length >= 1) {
            try {
                if (this.f25208i != null) {
                    HashMap map = new HashMap();
                    for (i7.l lVar : lVarArr) {
                        if (lVar.f91942f == 0) {
                            Uri uri = lVar.f91937a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, p.d(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f25207h.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = lVarArr.length;
                        int i15 = 0;
                        boolean z14 = false;
                        while (true) {
                            Method method = this.f25211l;
                            if (i15 >= length) {
                                if (!z14) {
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!l(objNewInstance) || (typefaceK = k(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceK, i14);
                            }
                            i7.l lVar2 = lVarArr[i15];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(lVar2.f91937a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f25209j.invoke(objNewInstance, byteBuffer, Integer.valueOf(lVar2.f91938b), null, Integer.valueOf(lVar2.f91939c), Integer.valueOf(lVar2.f91940d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                z14 = true;
                            }
                            i15++;
                            z14 = z14;
                        }
                    }
                } else {
                    i7.l lVarG = g(i14, lVarArr);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(lVarG.f91937a, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(lVarG.f91939c).setItalic(lVarG.f91940d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th3) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // c7.n
    public final Typeface e(Context context, Resources resources, int i14, String str, int i15) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.f25208i == null) {
            return super.e(context, resources, i14, str, i15);
        }
        try {
            objNewInstance = this.f25207h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!j(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f25211l.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (l(objNewInstance)) {
                return k(objNewInstance);
            }
        }
        return null;
    }

    public final boolean j(Context context, Object obj, String str, int i14, int i15, int i16, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f25208i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface k(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f25206g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f25212m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean l(Object obj) {
        try {
            return ((Boolean) this.f25210k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method n(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
