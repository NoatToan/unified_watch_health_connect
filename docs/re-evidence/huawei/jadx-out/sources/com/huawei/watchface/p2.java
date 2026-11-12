package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.operation.view.CustomWebView$$ExternalSyntheticBackport0;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.utils.HwLog;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f30540a = {SystemParamNames.SYSTEM_PARAM_CLIENT_SAFE_HTTP_URL, SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE, SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE_SENSITIVE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f30541b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static List f30542c = new CopyOnWriteArrayList();
    public static List d = new CopyOnWriteArrayList();
    public static List e = new CopyOnWriteArrayList();
    public static List f = new CopyOnWriteArrayList();
    public static List g = new CopyOnWriteArrayList();
    public static final List h = b();

    public static List a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HwLog.i("ListTypeParamManager", "getSystemParam() name: " + str);
        if (SystemParamNames.SYSTEM_PARAM_CLIENT_SAFE_HTTP_URL.equalsIgnoreCase(str)) {
            return f30541b;
        }
        if (SystemParamNames.CLIENT_HUAWEI_H5_HOST.equals(str)) {
            return g;
        }
        if (SystemParamNames.SYSTME_NODARK_URL_WATCHFACE.equals(str)) {
            return f;
        }
        if (SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE.equals(str)) {
            return f30542c;
        }
        if (SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE_SENSITIVE.equals(str)) {
            return d;
        }
        if (SystemParamNames.CLIENT_AUTH_ERROR.equals(str)) {
            return e;
        }
        return null;
    }

    public static boolean b(String str) {
        return SystemParamNames.SYSTEM_PARAM_CLIENT_SAFE_HTTP_URL.equals(str) || SystemParamNames.CLIENT_HUAWEI_H5_HOST.equals(str) || SystemParamNames.SYSTME_NODARK_URL_WATCHFACE.equals(str) || SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE.equals(str) || SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE_SENSITIVE.equals(str);
    }

    public static List b() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        try {
            for (Field field : SystemParamNames.class.getFields()) {
                copyOnWriteArrayList.add((String) field.get(null));
            }
            copyOnWriteArrayList.removeAll(CustomWebView$$ExternalSyntheticBackport0.m((Object[]) f30540a));
            copyOnWriteArrayList.remove(SystemParamNames.CLIENT_GREY_WATCHFACE_SITE);
            copyOnWriteArrayList.remove(SystemParamNames.CLIENT_SUPPORT_MEMBERSHIP);
            HwLog.i("ListTypeParamManager", "loadSystemParamNames tmpList length:" + copyOnWriteArrayList.size());
            return copyOnWriteArrayList;
        } catch (Exception e2) {
            HwLog.e("ListTypeParamManager", "loadSystemParamNames error: " + HwLog.printException(e2));
            return copyOnWriteArrayList;
        }
    }

    public static List a() {
        return h;
    }

    public static void a(String str, String str2) {
        HwLog.i("ListTypeParamManager", "addParam() name: " + str);
        if (SystemParamNames.SYSTEM_PARAM_CLIENT_SAFE_HTTP_URL.equalsIgnoreCase(str)) {
            if (f30541b.contains(str2)) {
                return;
            }
            f30541b.add(str2);
            return;
        }
        if (SystemParamNames.CLIENT_HUAWEI_H5_HOST.equals(str)) {
            if (g.contains(str2)) {
                return;
            }
            g.add(str2);
            return;
        }
        if (SystemParamNames.SYSTME_NODARK_URL_WATCHFACE.equals(str)) {
            if (f.contains(str2)) {
                return;
            }
            f.add(str2);
        } else if (SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE.equalsIgnoreCase(str)) {
            if (f30542c.contains(str2)) {
                return;
            }
            f30542c.add(str2);
        } else if (SystemParamNames.SYSTME_PARAM_SAFE_URL_WATCHFACE_SENSITIVE.equalsIgnoreCase(str)) {
            if (d.contains(str2)) {
                return;
            }
            d.add(str2);
        } else {
            if (!SystemParamNames.CLIENT_AUTH_ERROR.equalsIgnoreCase(str) || e.contains(str2)) {
                return;
            }
            e.add(str2);
        }
    }
}
