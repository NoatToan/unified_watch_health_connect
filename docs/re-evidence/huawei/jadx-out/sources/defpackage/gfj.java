package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.framework.common.ReflectionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HarmonyBuild;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class gfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f35021a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Bitmap> f35022c = new HashMap(1);

    public static boolean c() {
        Boolean bool = f35021a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Object objInvokeStaticMethod = ReflectionUtils.invokeStaticMethod("com.huawei.media.controller.MediaControlCenter", "isCompatibleForMediaControl", BaseApplication.d());
        if (objInvokeStaticMethod instanceof Boolean) {
            Boolean bool2 = (Boolean) objInvokeStaticMethod;
            f35021a = bool2;
            LogUtil.a("AudioUtils", "isInMediaControlWhiteList has result: ", bool2);
        } else {
            f35021a = false;
            LogUtil.e("AudioUtils", "isInMediaControlWhiteList has no result, return false by default, resultObj = ", objInvokeStaticMethod);
        }
        return f35021a.booleanValue();
    }

    public static boolean a() {
        String str = HarmonyBuild.f36561a;
        return str != null && str.length() > 0 && str.charAt(0) >= '3' && str.charAt(0) <= '9';
    }

    public static boolean d() {
        String str = HarmonyBuild.f36561a;
        return str != null && str.length() > 0 && str.charAt(0) >= '4' && str.charAt(0) <= '9';
    }

    public static boolean e() {
        return d() && c();
    }

    public static Bitmap e(String str) {
        synchronized (gfj.class) {
            if (TextUtils.isEmpty(str)) {
                ReleaseLogUtil.d("AudioUtils", "queryBitmap failed, url is null");
                return null;
            }
            Map<String, Bitmap> map = f35022c;
            if (map.get(str) == null) {
                map.clear();
                map.put(str, qqf.c(BaseApplication.b(), str));
            }
            return map.get(str);
        }
    }

    public static String e(gdy gdyVar) {
        return gdyVar == null ? "empty audioItem" : gdyVar.o();
    }
}
