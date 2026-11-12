package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes20.dex */
public class ylm {
    public static String a(Context context) {
        try {
            Class<?> cls = Class.forName("com.huawei.wearengine.utills.WearEngineReflectUtil");
            yit.a("AccountUtil", "reflectInvokeGetUserId getUserId");
            Object objInvoke = cls.getDeclaredMethod("getUserId", Context.class).invoke(cls, context);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (ClassNotFoundException unused) {
            yit.b("AccountUtil", "getUserId ClassNotFoundException");
            return null;
        } catch (IllegalAccessException unused2) {
            yit.b("AccountUtil", "getUserId IllegalAccessException");
            return null;
        } catch (IllegalArgumentException unused3) {
            yit.b("AccountUtil", "getUserId IllegalArgumentException");
            return null;
        } catch (NoSuchMethodException unused4) {
            yit.b("AccountUtil", "getUserId NoSuchMethodException");
            return null;
        } catch (InvocationTargetException unused5) {
            yit.b("AccountUtil", "getUserId InvocationTargetException");
            return null;
        }
    }

    public static Boolean e(Context context) {
        try {
            Class<?> cls = Class.forName("com.huawei.wearengine.utills.WearEngineReflectUtil");
            yit.a("AccountUtil", "reflectInvokeIsAuthorizedInHealth isAuthorizedInHealth");
            Object objInvoke = cls.getDeclaredMethod("isAuthorizedInHealth", Context.class).invoke(cls, context);
            if (objInvoke instanceof Boolean) {
                return (Boolean) objInvoke;
            }
        } catch (ClassNotFoundException unused) {
            yit.b("AccountUtil", "isAuthorizedInHealth ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            yit.b("AccountUtil", "isAuthorizedInHealth IllegalAccessException");
        } catch (IllegalArgumentException unused3) {
            yit.b("AccountUtil", "isAuthorizedInHealth IllegalArgumentException");
        } catch (NoSuchMethodException unused4) {
            yit.b("AccountUtil", "isAuthorizedInHealth NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            yit.b("AccountUtil", "isAuthorizedInHealth InvocationTargetException");
        }
        return false;
    }

    public static String b(Context context) {
        try {
            Class<?> cls = Class.forName("com.huawei.wearengine.utills.WearEngineReflectUtil");
            yit.a("AccountUtil", "reflectInvokeGetGrsUrl getGrsUrl");
            Object objInvoke = cls.getDeclaredMethod("getGrsUrl", Context.class).invoke(cls, context);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return "";
        } catch (ClassNotFoundException unused) {
            yit.b("AccountUtil", "getGrsUrl ClassNotFoundException");
            return "";
        } catch (IllegalAccessException unused2) {
            yit.b("AccountUtil", "getGrsUrl IllegalAccessException");
            return "";
        } catch (IllegalArgumentException unused3) {
            yit.b("AccountUtil", "getGrsUrl IllegalArgumentException");
            return "";
        } catch (NoSuchMethodException unused4) {
            yit.b("AccountUtil", "getGrsUrl NoSuchMethodException");
            return "";
        } catch (InvocationTargetException unused5) {
            yit.b("AccountUtil", "getGrsUrl InvocationTargetException");
            return "";
        }
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str) && !"0".equals(str)) {
            return true;
        }
        yit.b("AccountUtil", "checkUserId userId is empty! userId = " + str);
        return false;
    }
}
