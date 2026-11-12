package defpackage;

import android.app.Activity;
import android.app.ResourcesManager;
import android.content.Context;
import android.content.res.CompatibilityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.ResourcesImpl;
import android.content.res.ResourcesKey;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Bitmap;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Display;
import com.miui.circulate.device.api.Constant;
import java.lang.ref.WeakReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import miuix.autodensity.AutoDensityConfig;

/* JADX INFO: loaded from: classes3.dex */
public class dz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ResourcesManager f16088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayMap<ResourcesKey, WeakReference<ResourcesImpl>> f16089b;
    public static Object c;
    public static boolean d;

    static {
        try {
            f16088a = (ResourcesManager) ebk.e(ResourcesManager.class, new Class[0], new Object[0]);
            ResourcesManager resourcesManager = ResourcesManager.getInstance();
            f16088a = resourcesManager;
            f16089b = (ArrayMap) ebk.j(ResourcesManager.class, resourcesManager, "mResourceImpls");
            c = f16088a;
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                c = ebk.j(ResourcesManager.class, f16088a, "mLock");
            } catch (Exception unused2) {
                c = null;
            }
        }
        if (f16088a != null && f16089b != null) {
            Object obj = c;
        }
        try {
            int[] iArr = (int[]) ebk.o(Class.forName("miui.util.FeatureParser"), null, "getIntArray", new Class[]{String.class}, "screen_resolution_supported");
            if (iArr == null || iArr.length <= 1) {
                return;
            }
            d = true;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("DensityUtil init screen_resolution_supported Exception: ");
            sb.append(th);
        }
    }

    public static void a(Resources resources, int i) {
        az5 az5VarJ = cz5.h().j();
        if (az5VarJ != null) {
            if (i > 0 || resources.getDisplayMetrics().densityDpi != az5VarJ.d) {
                b(az5VarJ, resources, i);
                if (AutoDensityConfig.shouldUpdateSystemResource()) {
                    n(az5VarJ);
                }
            }
        }
    }

    public static void b(ez6 ez6Var, Resources resources, int i) {
        q(resources, ez6Var);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        int i2 = displayMetrics.widthPixels;
        float f = 1.0f;
        float f2 = ez6Var.e;
        float f3 = (i2 * 1.0f) / f2;
        if (i > 0) {
            float f4 = i;
            if (f3 < f4) {
                f = i2 / (f4 * f2);
            }
        }
        int i3 = (int) (ez6Var.d * f);
        configuration.densityDpi = i3;
        displayMetrics.densityDpi = i3;
        displayMetrics.density = f2 * f;
        displayMetrics.scaledDensity = ez6Var.f * f;
        configuration.fontScale = ez6Var.g;
        qr5.d("after doChangeDensity baseWidthDp:" + i + " ratio:" + f + " " + displayMetrics + " " + configuration);
    }

    public static rr1 c(Context context) {
        if (!(context instanceof ContextThemeWrapper)) {
            return null;
        }
        while (true) {
            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) context;
            if (!(contextThemeWrapper.getBaseContext() instanceof ContextThemeWrapper)) {
                return null;
            }
            if (contextThemeWrapper.getBaseContext() instanceof rr1) {
                return (rr1) contextThemeWrapper.getBaseContext();
            }
            context = contextThemeWrapper.getBaseContext();
        }
    }

    public static ResourcesImpl d(ResourcesKey resourcesKey, ez6 ez6Var) {
        ResourcesKey resourcesKey2;
        try {
            Configuration configuration = new Configuration();
            Configuration configuration2 = (Configuration) ebk.j(ResourcesKey.class, resourcesKey, "mOverrideConfiguration");
            int i = Build.VERSION.SDK_INT;
            if (i >= 35 && configuration.equals(configuration2)) {
                return null;
            }
            configuration.setTo(configuration2);
            configuration.densityDpi = ez6Var.d;
            Integer num = (Integer) ebk.j(ResourcesKey.class, resourcesKey, "mDisplayId");
            num.intValue();
            String[] strArr = (String[]) ebk.j(ResourcesKey.class, resourcesKey, "mLibDirs");
            CompatibilityInfo compatibilityInfo = (CompatibilityInfo) ebk.j(ResourcesKey.class, resourcesKey, "mCompatInfo");
            String[] strArr2 = i <= 30 ? (String[]) ebk.j(ResourcesKey.class, resourcesKey, "mOverlayDirs") : (String[]) ebk.j(ResourcesKey.class, resourcesKey, "mOverlayPaths");
            if (i <= 29) {
                resourcesKey2 = (ResourcesKey) ebk.e(ResourcesKey.class, new Class[]{String.class, String[].class, String[].class, String[].class, Integer.TYPE, Configuration.class, CompatibilityInfo.class}, resourcesKey.mResDir, resourcesKey.mSplitResDirs, strArr2, strArr, num, configuration, compatibilityInfo);
            } else {
                resourcesKey2 = (ResourcesKey) ebk.e(ResourcesKey.class, new Class[]{String.class, String[].class, String[].class, String[].class, Integer.TYPE, Configuration.class, CompatibilityInfo.class, ResourcesLoader[].class}, resourcesKey.mResDir, resourcesKey.mSplitResDirs, strArr2, strArr, num, configuration, compatibilityInfo, (ResourcesLoader[]) ebk.j(ResourcesKey.class, resourcesKey, "mLoaders"));
            }
            qr5.d("newKey " + resourcesKey2);
            return (ResourcesImpl) ebk.o(ResourcesManager.class, f16088a, "findOrCreateResourcesImplForKeyLocked", new Class[]{ResourcesKey.class}, resourcesKey2);
        } catch (Error e) {
            qr5.d("findOrCreateResourcesImplForKeyLocked failed " + e.toString());
            return null;
        } catch (Exception e2) {
            qr5.d("findOrCreateResourcesImplForKeyLocked failed " + e2.toString());
            return null;
        }
    }

    public static ResourcesKey e(ResourcesImpl resourcesImpl) {
        int size = f16089b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                return null;
            }
            WeakReference<ResourcesImpl> weakReferenceValueAt = f16089b.valueAt(i);
            if (resourcesImpl == (weakReferenceValueAt != null ? weakReferenceValueAt.get() : null)) {
                return f16089b.keyAt(i);
            }
            i++;
        }
    }

    public static Display f(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return context.getDisplay();
            } catch (Exception unused) {
            }
        }
        return g(context);
    }

    public static Display g(Context context) {
        return ((DisplayManager) context.getSystemService("display")).getDisplay(0);
    }

    public static Configuration h(Context context) {
        Configuration configurationA;
        rr1 rr1VarC = c(context);
        if (rr1VarC == null || (configurationA = rr1VarC.a()) == null) {
            return null;
        }
        return configurationA;
    }

    public static String i(Display display) {
        int iIndexOf;
        String name = display.getName();
        return (name == null || (iIndexOf = name.indexOf(":")) == -1) ? "" : name.substring(iIndexOf + 1);
    }

    public static boolean j() {
        return d;
    }

    public static boolean k(Context context) {
        if (context != null && cz5.h().l()) {
            return l(context.getResources());
        }
        return false;
    }

    public static boolean l(Resources resources) {
        az5 az5VarI = cz5.h().i();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (az5VarI == null || az5VarI.e == displayMetrics.density) {
            return false;
        }
        qr5.d("restoreDensity success");
        b(az5VarI, resources, 0);
        return true;
    }

    public static void m(int i) {
        try {
            ebk.m(Bitmap.class, null, "setDefaultDensity", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            qr5.d("setDefaultBitmapDensity " + i);
        } catch (Exception e) {
            qr5.d("reflect exception: " + e.toString());
        }
    }

    public static void n(ez6 ez6Var) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = ez6Var.d;
        configuration.densityDpi = i;
        displayMetrics.densityDpi = i;
        displayMetrics.scaledDensity = ez6Var.f;
        displayMetrics.density = ez6Var.e;
        configuration.fontScale = ez6Var.g;
        m(ez6Var.c);
        qr5.d("setSystemResources " + displayMetrics + " " + configuration + " defaultBitmapDensity:" + ez6Var.c);
    }

    public static boolean o(Context context, Display display) {
        if (p56.b(context, display)) {
            qr5.d("shouldProcessDensity isCarWithScreen");
            return false;
        }
        boolean zE = p56.e(context);
        qr5.d("shouldProcessDensity isSynergy " + zE);
        if (zE) {
            String strI = i(display);
            if (Constant.DeviceType.WINDOWS_PC.contentEquals(strI)) {
                return false;
            }
            if (Constant.DeviceType.ANDROID_PAD.contentEquals(strI)) {
                if (pwk.a() > 1) {
                    return false;
                }
            } else if ("AndroidPadCar".contentEquals(strI) && display.getDisplayId() != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(Configuration configuration) {
        az5 az5VarJ = cz5.h().j();
        return (az5VarJ == null || configuration.densityDpi == az5VarJ.d) ? false : true;
    }

    public static void q(Resources resources, ez6 ez6Var) {
        Object obj;
        ResourcesImpl resourcesImplD;
        if (f16088a == null || f16089b == null || (obj = c) == null) {
            return;
        }
        try {
            synchronized (obj) {
                try {
                    ResourcesKey resourcesKeyE = e((ResourcesImpl) ebk.j(Resources.class, resources, "mResourcesImpl"));
                    qr5.d("oldKey " + resourcesKeyE);
                    if (resourcesKeyE != null && (resourcesImplD = d(resourcesKeyE, ez6Var)) != null) {
                        ebk.m(Resources.class, resources, "setImpl", new Class[]{ResourcesImpl.class}, resourcesImplD);
                        qr5.d("set impl success " + resourcesImplD);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            qr5.d("tryToCreateAndSetResourcesImpl failed " + e.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(Context context) {
        if (context == 0) {
            return;
        }
        qr5.d("updateCustomDensity context is " + context);
        if (cz5.h().l()) {
            int iA = context instanceof irc ? ((irc) context).a() : 0;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Configuration configuration = activity.getResources().getConfiguration();
                Display displayF = f(activity);
                boolean zO = o(activity, displayF);
                StringBuilder sb = new StringBuilder();
                sb.append("updateCustomDensity -> display is ");
                String name = AbstractJsonLexerKt.NULL;
                sb.append(displayF != null ? displayF.getName() : AbstractJsonLexerKt.NULL);
                sb.append(" shouldProcessDensity=");
                sb.append(zO);
                sb.append(" activity is ");
                sb.append(activity);
                sb.append(" config is ");
                sb.append(configuration);
                qr5.d(sb.toString());
                if (!zO && configuration.densityDpi == cz5.h().e()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("updateCustomDensity -> will not changeDensity cause display is ");
                    if (displayF != null) {
                        name = displayF.getName();
                    }
                    sb2.append(name);
                    sb2.append(", try restore density, activity is ");
                    sb2.append(activity);
                    sb2.append(" config is ");
                    sb2.append(configuration);
                    qr5.d(sb2.toString());
                    k(activity);
                }
                if (!zO) {
                    return;
                }
            }
            a(context.getResources(), iA);
        }
    }

    public static void s(Context context, int i) {
        if (context != null && cz5.h().l()) {
            a(context.getResources(), i);
        }
    }

    public static boolean t(Context context, Configuration configuration) {
        az5 az5VarJ = cz5.h().j();
        if (az5VarJ == null) {
            return false;
        }
        Resources resources = context.getResources();
        resources.getConfiguration().setTo(configuration);
        b(az5VarJ, resources, 0);
        return true;
    }
}
