package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.content.Context;
import android.util.LruCache;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.autocollect.page.IPageCustomTrace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f11653a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LruCache f11654b = new LruCache(64);

    public static boolean a(Object obj, String... strArr) {
        boolean zIsInstance = false;
        if (strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            try {
                LruCache lruCache = f11654b;
                Class<?> cls = (Class) lruCache.get(str);
                if (cls == null && !f11653a.contains(str)) {
                    cls = Class.forName(str);
                    lruCache.put(str, cls);
                }
                if (cls != null) {
                    zIsInstance = cls.isInstance(obj);
                }
            } catch (Throwable unused) {
                f11653a.add(str);
            }
            if (zIsInstance) {
                break;
            }
        }
        return zIsInstance;
    }

    public static void b(Object obj, JSONObject jSONObject) {
        JSONObject jSONObjectA;
        HiLog.d("HAUtils", "mergePageCustomTrace");
        if (jSONObject == null || obj == null) {
            return;
        }
        JSONObject jSONObjectA2 = a(obj);
        if (jSONObjectA2 != null) {
            a(jSONObjectA2, jSONObject);
        } else {
            if ((obj instanceof Activity) || (jSONObjectA = a((Object) t.a(obj))) == null) {
                return;
            }
            a(jSONObjectA, jSONObject);
        }
    }

    public static Class a(String[] strArr) {
        if (strArr.length == 0) {
            return null;
        }
        Class<?> cls = null;
        for (String str : strArr) {
            try {
                LruCache lruCache = f11654b;
                Class<?> cls2 = (Class) lruCache.get(str);
                if (cls2 == null && !f11653a.contains(str)) {
                    cls2 = Class.forName(str);
                    lruCache.put(str, cls2);
                }
                cls = cls2;
            } catch (Throwable unused) {
                f11653a.add(str);
                cls = null;
            }
            if (cls != null) {
                break;
            }
        }
        return cls;
    }

    public static Class a(String str) {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            LruCache lruCache = f11654b;
            cls = (Class) lruCache.get(str);
            if (cls == null) {
                try {
                    if (!f11653a.contains(str)) {
                        cls2 = Class.forName(str);
                        lruCache.put(str, cls2);
                        return cls2;
                    }
                } catch (ClassNotFoundException unused) {
                    f11653a.add(str);
                    return cls;
                } catch (Throwable unused2) {
                    return cls;
                }
            }
            return cls;
        } catch (ClassNotFoundException unused3) {
            cls = cls2;
        } catch (Throwable unused4) {
            return cls2;
        }
    }

    public static Object a(Object obj, String str, Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        try {
            Method method = obj.getClass().getMethod(str, clsArr);
            if (method == null) {
                return null;
            }
            return method.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to merge two JSONObject, ex: "), "HAUtils");
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        if (obj instanceof IPageCustomTrace) {
            try {
                JSONObject customProperties = ((IPageCustomTrace) obj).getCustomProperties();
                if (customProperties == null) {
                    return;
                }
                jSONObject.put("$custom_property", customProperties);
            } catch (Exception e) {
                d0.a(e, new StringBuilder("fail to merge custom properties on page exit, ex: "), "HAUtils");
            }
        }
    }

    public static Class a() {
        Class<?> cls;
        Class<?> cls2;
        try {
            cls = Class.forName("android.support.v7.app.AlertDialog");
        } catch (Exception unused) {
            HiLog.w("HAUtils", "can not find v7 AlertDialog class");
            cls = null;
        }
        try {
            cls2 = Class.forName("androidx.appcompat.app.AlertDialog");
        } catch (Exception unused2) {
            HiLog.w("HAUtils", "can not find appcompat AlertDialog class");
            cls2 = null;
        }
        if (cls == null && cls2 == null) {
            return null;
        }
        return cls != null ? cls : cls2;
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getApplicationInfo().processName;
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to get package name, ex: "), "HAUtils");
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Object a(Class cls, Object obj, String... strArr) {
        Field declaredField;
        try {
            if (strArr.length != 0) {
                declaredField = null;
                for (String str : strArr) {
                    try {
                        declaredField = cls.getDeclaredField(str);
                    } catch (NoSuchFieldException unused) {
                        declaredField = null;
                    }
                    if (declaredField != null) {
                        break;
                    }
                }
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                if (declaredField != null) {
                    try {
                        return declaredField.get(obj);
                    } catch (Throwable unused2) {
                    }
                }
                return null;
            }
        } catch (Exception unused3) {
        }
        declaredField = null;
        if (declaredField != null) {
            return declaredField.get(obj);
        }
        return null;
    }

    public static JSONObject a(Object obj) {
        if (!(obj instanceof IPageCustomTrace)) {
            return null;
        }
        try {
            return ((IPageCustomTrace) obj).getCustomProperties();
        } catch (JSONException unused) {
            HiLog.e("HAUtils", "acquireCustomTrace failed");
            return null;
        }
    }
}
