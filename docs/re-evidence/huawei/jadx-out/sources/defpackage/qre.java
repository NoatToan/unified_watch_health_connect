package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.IllegalFormatConversionException;
import java.util.Locale;
import java.util.MissingFormatArgumentException;

/* JADX INFO: loaded from: classes.dex */
public class qre {
    private static Context d(Context context) {
        return context == null ? BaseApplication.b() : context;
    }

    public static int e(String str, String str2, Class cls) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("ResourcesUtils", "getStringResourcesId name ", str, " resourceType ", str2);
            return -1;
        }
        Context contextB = BaseApplication.b();
        int identifier = contextB.getResources().getIdentifier(str, str2, contextB.getPackageName());
        if (identifier > 0) {
            return identifier;
        }
        if (cls == null) {
            LogUtil.j("ResourcesUtils", "getStringResourcesId clazz is null resourceType ", str2);
            return -1;
        }
        try {
            try {
                return cls.getDeclaredField(str).getInt(cls);
            } catch (ExceptionInInitializerError | IllegalAccessException | IllegalArgumentException e) {
                LogUtil.e("ResourcesUtils", "getStringResourcesId getInt exception ", ExceptionUtils.c(e));
                return -1;
            }
        } catch (NoSuchFieldException | SecurityException e2) {
            LogUtil.e("ResourcesUtils", "getStringResourcesId getDeclaredField exception ", ExceptionUtils.c(e2));
            return -1;
        }
    }

    public static View a(Context context, int i, ViewGroup viewGroup) {
        if (context == null) {
            LogUtil.j("ResourcesUtils", "inflate context is null");
            return null;
        }
        try {
            return View.inflate(context, i, viewGroup);
        } catch (Resources.NotFoundException | InflateException e) {
            LogUtil.e("ResourcesUtils", "inflate exception ", ExceptionUtils.c(e));
            return null;
        }
    }

    public static View a(Context context, int i, ViewGroup viewGroup, boolean z) {
        if (context == null) {
            LogUtil.j("ResourcesUtils", "inflate context is null");
            return null;
        }
        try {
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        } catch (Resources.NotFoundException | InflateException e) {
            LogUtil.e("ResourcesUtils", "inflate exception ", ExceptionUtils.c(e));
            return null;
        }
    }

    public static float a(int i) {
        try {
            return BaseApplication.b().getResources().getDimension(i);
        } catch (Resources.NotFoundException e) {
            LogUtil.e("ResourcesUtils", "getDimension exception ", ExceptionUtils.c(e));
            return 0.0f;
        }
    }

    public static int b(int i) {
        try {
            return BaseApplication.b().getResources().getDimensionPixelSize(i);
        } catch (Resources.NotFoundException e) {
            LogUtil.e("ResourcesUtils", "getDimensionPixelSize exception ", ExceptionUtils.c(e));
            return 0;
        }
    }

    public static int d(int i) {
        try {
            return BaseApplication.b().getResources().getDimensionPixelOffset(i);
        } catch (Resources.NotFoundException e) {
            LogUtil.e("ResourcesUtils", "getDimensionPixelOffset exception ", ExceptionUtils.c(e));
            return 0;
        }
    }

    public static int e(int i) {
        return e(BaseApplication.b(), i);
    }

    public static int e(Context context, int i) {
        try {
            return ContextCompat.getColor(d(context), i);
        } catch (Resources.NotFoundException e) {
            LogUtil.e("ResourcesUtils", "getColor exception ", ExceptionUtils.c(e));
            return 0;
        }
    }

    public static Drawable c(int i) {
        return d(BaseApplication.b(), i);
    }

    public static Drawable d(Context context, int i) {
        try {
            return ContextCompat.getDrawable(d(context), i);
        } catch (Resources.NotFoundException e) {
            LogUtil.e("ResourcesUtils", "getDrawable exception ", ExceptionUtils.c(e));
            return null;
        }
    }

    public static String j(int i) {
        try {
            return BaseApplication.b().getResources().getResourceName(i);
        } catch (Resources.NotFoundException e) {
            ReleaseLogUtil.b("ResourcesUtils", "getResourceName exception ", DfxUtils.d(Thread.currentThread(), e));
            return "";
        }
    }

    public static CharSequence i(int i) {
        try {
            return BaseApplication.b().getResources().getText(i);
        } catch (Resources.NotFoundException e) {
            LogUtil.e("ResourcesUtils", "getText exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    public static String f(int i) {
        return b(BaseApplication.b(), i);
    }

    public static String b(Context context, int i) {
        try {
            return d(context).getResources().getString(i);
        } catch (Resources.NotFoundException e) {
            LogUtil.e("ResourcesUtils", "getString exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    public static String a(int i, Object... objArr) {
        return a(BaseApplication.b(), i, objArr);
    }

    public static String a(Context context, int i, Object... objArr) {
        try {
            return d(context).getResources().getString(i, objArr);
        } catch (Resources.NotFoundException | IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("ResourcesUtils", "getString exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    public static String e(int i, int i2, Object... objArr) {
        try {
            return BaseApplication.b().getResources().getQuantityString(i, i2, objArr);
        } catch (Resources.NotFoundException | IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("ResourcesUtils", "getQuantityString exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    public static String[] g(int i) {
        try {
            return BaseApplication.b().getResources().getStringArray(i);
        } catch (Resources.NotFoundException | IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("ResourcesUtils", "getStringArray exception ", ExceptionUtils.c(e));
            return new String[0];
        }
    }

    public static int[] h(int i) {
        try {
            return BaseApplication.b().getResources().getIntArray(i);
        } catch (Resources.NotFoundException | IllegalFormatConversionException | MissingFormatArgumentException e) {
            LogUtil.e("ResourcesUtils", "getIntArray exception ", ExceptionUtils.c(e));
            return new int[0];
        }
    }

    public static Resources b(Context context) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(Locale.ENGLISH);
        return context.createConfigurationContext(configuration).getResources();
    }
}
