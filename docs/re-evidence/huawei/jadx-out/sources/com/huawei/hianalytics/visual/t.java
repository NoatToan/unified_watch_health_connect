package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.huawei.hianalytics.core.log.HiLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache f11695a = new LruCache(128);

    public static Object a(View view, Activity activity) {
        Window window;
        if (view == null) {
            return null;
        }
        try {
            String str = (String) view.getTag(R.id.hianalytics_fragment_view_sdk_tag);
            String str2 = (String) view.getTag(R.id.hianalytics_fragment_view_user_tag);
            if (str2 != null && !str2.isEmpty()) {
                str = str2;
            }
            if (TextUtils.isEmpty(str)) {
                if (activity == null) {
                    activity = o0.a(view.getContext(), view);
                }
                if (activity != null && (window = activity.getWindow()) != null && window.isActive() && window.getDecorView() != null && window.getDecorView().getRootView() != null && window.getDecorView().getRootView().getTag(R.id.hianalytics_fragment_view_sdk_tag) != null) {
                    String str3 = "";
                    try {
                        ViewParent parent = view.getParent();
                        while (TextUtils.isEmpty(str3) && (parent instanceof View)) {
                            str = (String) ((View) parent).getTag(R.id.hianalytics_fragment_view_sdk_tag);
                            try {
                                parent = parent.getParent();
                                str3 = str;
                            } catch (Exception e) {
                                e = e;
                                d0.a(e, new StringBuilder("fail to get fragment name from parent, ex: "), "FragmentUtils");
                                return a(str);
                            }
                        }
                        str = str3;
                    } catch (Exception e2) {
                        e = e2;
                        str = str3;
                    }
                }
            }
            return a(str);
        } catch (Exception e3) {
            d0.a(e3, new StringBuilder("fail to get fragment from view, ex: "), "FragmentUtils");
            return null;
        }
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return true;
        }
        try {
            Object objInvoke = obj.getClass().getMethod("isHidden", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke == null) {
                return true;
            }
            return !((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to get hidden value, ex: "), "FragmentUtils");
            return true;
        }
    }

    public static boolean c(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Object objInvoke = obj.getClass().getMethod("isResumed", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to get resumed value, ex: "), "FragmentUtils");
            return false;
        }
    }

    public static boolean d(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Object objInvoke = obj.getClass().getMethod("getUserVisibleHint", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to get userVisibleHint value, ex: "), "FragmentUtils");
            return false;
        }
    }

    public static boolean e(Object obj) {
        Class<?> cls;
        Class<?> cls2;
        if (obj == null) {
            return false;
        }
        Class<?> cls3 = null;
        try {
            try {
                cls = Class.forName("android.app.Fragment");
            } catch (Exception e) {
                HiLog.w("FragmentUtils", "load class for android fragment, ex: " + e.getMessage());
                cls = null;
            }
            try {
                cls2 = Class.forName("android.support.v4.app.Fragment");
            } catch (Exception e2) {
                HiLog.w("FragmentUtils", "load class for support fragment, ex: " + e2.getMessage());
                cls2 = null;
            }
            try {
                cls3 = Class.forName("androidx.fragment.app.Fragment");
            } catch (Exception e3) {
                HiLog.w("FragmentUtils", "load class for support fragment, ex: " + e3.getMessage());
            }
            if (cls == null && cls2 == null && cls3 == null) {
                return false;
            }
            if (cls != null && cls.isInstance(obj)) {
                return true;
            }
            if (cls2 != null && cls2.isInstance(obj)) {
                return true;
            }
            if (cls3 != null && cls3.isInstance(obj)) {
                return true;
            }
        } catch (Exception e4) {
            d0.a(e4, new StringBuilder("load class for fragment, ex: "), "FragmentUtils");
        }
        return false;
    }

    public static boolean f(Object obj) {
        Object objInvoke;
        if (obj == null) {
            return false;
        }
        try {
            objInvoke = obj.getClass().getMethod("getParentFragment", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to get parent fragment, ex: "), "FragmentUtils");
            objInvoke = null;
        }
        try {
            if (objInvoke == null) {
                if (c(obj) && d(obj) && b(obj)) {
                    return true;
                }
            } else if (c(obj) && d(obj) && b(obj) && c(objInvoke) && d(objInvoke) && b(objInvoke)) {
                return true;
            }
        } catch (Exception e2) {
            d0.a(e2, new StringBuilder("fail to get visible value, ex: "), "FragmentUtils");
        }
        return false;
    }

    public static void a(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        f11695a.put(str, new WeakReference(obj));
    }

    public static Object a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            LruCache lruCache = f11695a;
            WeakReference weakReference = (WeakReference) lruCache.get(str);
            if (weakReference == null) {
                return null;
            }
            Object obj = weakReference.get();
            if (obj != null) {
                return obj;
            }
            Object objNewInstance = Class.forName(str).newInstance();
            lruCache.put(str, new WeakReference(objNewInstance));
            return objNewInstance;
        } catch (Exception e) {
            d0.a(e, new StringBuilder("fail to get fragment from cache, ex: "), "FragmentUtils");
            return null;
        }
    }

    public static JSONObject a(Activity activity, Object obj) {
        String strA;
        String canonicalName;
        JSONObject jSONObject = new JSONObject();
        if (obj != null) {
            if (activity == null) {
                activity = a(obj);
            }
            if (activity == null) {
                strA = "";
                canonicalName = "";
            } else {
                strA = o0.a(activity);
                Locale locale = Locale.ENGLISH;
                canonicalName = activity.getClass().getCanonicalName() + "|" + obj.getClass().getCanonicalName();
            }
            if (TextUtils.isEmpty(canonicalName)) {
                canonicalName = obj.getClass().getCanonicalName();
            }
            try {
                jSONObject.put("$page_title", strA);
                jSONObject.put("$page_name", canonicalName);
                return jSONObject;
            } catch (Exception e) {
                d0.a(e, new StringBuilder("fail to acquire fragment name and title, ex: "), "FragmentUtils");
            }
        }
        return jSONObject;
    }

    public static Activity a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            Method method = obj.getClass().getMethod("getActivity", new Class[0]);
            if (method != null) {
                return (Activity) method.invoke(obj, new Object[0]);
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("fail to acquire activity from fragment: ");
            sb.append(obj.getClass());
            sb.append(", ex: ");
            d0.a(e, sb, "FragmentUtils");
        }
        return null;
    }
}
