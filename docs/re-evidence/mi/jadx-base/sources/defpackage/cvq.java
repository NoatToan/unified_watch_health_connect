package defpackage;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManager;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cvq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class, Map<String, l>> f14783a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, l> f14784b = new HashMap();

    public static class b extends l {
        public b(iej iejVar, Method method) {
            super(iejVar, "Array", method);
        }

        @Override // cvq.l
        public Object c(Object obj) {
            return (ReadableArray) obj;
        }
    }

    public static class c extends l {
        public final boolean i;

        public c(iej iejVar, Method method, boolean z) {
            super(iejVar, "boolean", method);
            this.i = z;
        }

        @Override // cvq.l
        public Object c(Object obj) {
            return obj == null ? this.i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static class d extends l {
        public d(iej iejVar, Method method) {
            super(iejVar, "boolean", method);
        }

        @Override // cvq.l
        public Object c(Object obj) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    public static class e extends l {
        public e(iej iejVar, Method method) {
            super(iejVar, RealNameWebViewActivity.NUMBER, method);
        }

        @Override // cvq.l
        public Object c(Object obj) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }

        public e(jej jejVar, Method method, int i) {
            super(jejVar, RealNameWebViewActivity.NUMBER, method, i);
        }
    }

    public static class g extends l {
        public g(iej iejVar, Method method) {
            super(iejVar, "mixed", method);
        }

        @Override // cvq.l
        public Object c(Object obj) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }

        public g(jej jejVar, Method method, int i) {
            super(jejVar, "mixed", method, i);
        }
    }

    public static class j extends l {
        public j(iej iejVar, Method method) {
            super(iejVar, AIApiConstants.Map.NAME, method);
        }

        @Override // cvq.l
        public Object c(Object obj) {
            return (ReadableMap) obj;
        }
    }

    public static class k extends ThreadLocal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14785a;

        public k(int i) {
            this.f14785a = 1;
            this.f14785a = i;
        }

        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            return new Object[this.f14785a];
        }
    }

    public static class m extends l {
        public m(iej iejVar, Method method) {
            super(iejVar, "String", method);
        }

        @Override // cvq.l
        public Object c(Object obj) {
            return (String) obj;
        }
    }

    public static void a() {
        f14783a.clear();
        f14784b.clear();
    }

    public static l b(iej iejVar, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new g(iejVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(iejVar, method, iejVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return new i(iejVar, method, iejVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new h(iejVar, method, iejVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new f(iejVar, method, iejVar.defaultDouble());
        }
        if (cls == String.class) {
            return new m(iejVar, method);
        }
        if (cls == Boolean.class) {
            return new d(iejVar, method);
        }
        if (cls == Integer.class) {
            return new e(iejVar, method);
        }
        if (cls == ReadableArray.class) {
            return new b(iejVar, method);
        }
        if (cls == ReadableMap.class) {
            return new j(iejVar, method);
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
    }

    public static void c(jej jejVar, Method method, Class<?> cls, Map<String, l> map) {
        String[] strArrNames = jejVar.names();
        int i2 = 0;
        if (cls == Dynamic.class) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new g(jejVar, method, i2));
                i2++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new i(jejVar, method, i2, jejVar.defaultInt()));
                i2++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new h(jejVar, method, i2, jejVar.defaultFloat()));
                i2++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new f(jejVar, method, i2, jejVar.defaultDouble()));
                i2++;
            }
            return;
        }
        if (cls == Integer.class) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new e(jejVar, method, i2));
                i2++;
            }
            return;
        }
        throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
    }

    public static void d(Class<? extends oej> cls, Map<String, l> map) {
        for (Method method : cls.getDeclaredMethods()) {
            iej iejVar = (iej) method.getAnnotation(iej.class);
            if (iejVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
                }
                map.put(iejVar.name(), b(iejVar, method, parameterTypes[0]));
            }
            jej jejVar = (jej) method.getAnnotation(jej.class);
            if (jejVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
                }
                if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
                }
                c(jejVar, method, parameterTypes2[1], map);
            }
        }
    }

    public static void e(Class<? extends ViewManager> cls, Map<String, l> map) {
        for (Method method : cls.getDeclaredMethods()) {
            iej iejVar = (iej) method.getAnnotation(iej.class);
            if (iejVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
                }
                map.put(iejVar.name(), b(iejVar, method, parameterTypes[1]));
            }
            jej jejVar = (jej) method.getAnnotation(jej.class);
            if (jejVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + method.getName());
                }
                c(jejVar, method, parameterTypes2[2], map);
            }
        }
    }

    public static Map<String, l> f(Class<? extends oej> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == oej.class) {
                return f14784b;
            }
        }
        Map<Class, Map<String, l>> map = f14783a;
        Map<String, l> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(f(cls.getSuperclass()));
        d(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    public static Map<String, l> g(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f14784b;
        }
        Map<Class, Map<String, l>> map = f14783a;
        Map<String, l> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(g(cls.getSuperclass()));
        e(cls, map3);
        map.put(cls, map3);
        return map3;
    }

    public static class f extends l {
        public final double i;

        public f(iej iejVar, Method method, double d) {
            super(iejVar, RealNameWebViewActivity.NUMBER, method);
            this.i = d;
        }

        @Override // cvq.l
        public Object c(Object obj) {
            return Double.valueOf(obj == null ? this.i : ((Double) obj).doubleValue());
        }

        public f(jej jejVar, Method method, int i, double d) {
            super(jejVar, RealNameWebViewActivity.NUMBER, method, i);
            this.i = d;
        }
    }

    public static class h extends l {
        public final float i;

        public h(iej iejVar, Method method, float f) {
            super(iejVar, RealNameWebViewActivity.NUMBER, method);
            this.i = f;
        }

        @Override // cvq.l
        public Object c(Object obj) {
            return Float.valueOf(obj == null ? this.i : ((Double) obj).floatValue());
        }

        public h(jej jejVar, Method method, int i, float f) {
            super(jejVar, RealNameWebViewActivity.NUMBER, method, i);
            this.i = f;
        }
    }

    public static class i extends l {
        public final int i;

        public i(iej iejVar, Method method, int i) {
            super(iejVar, RealNameWebViewActivity.NUMBER, method);
            this.i = i;
        }

        @Override // cvq.l
        public Object c(Object obj) {
            return Integer.valueOf(obj == null ? this.i : ((Double) obj).intValue());
        }

        public i(jej jejVar, Method method, int i, int i2) {
            super(jejVar, RealNameWebViewActivity.NUMBER, method, i);
            this.i = i2;
        }
    }

    public static abstract class l {
        public static final ThreadLocal<Object[]> e = new k(2);
        public static final ThreadLocal<Object[]> f = new k(3);
        public static final ThreadLocal<Object[]> g = new k(1);
        public static final ThreadLocal<Object[]> h = new k(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f14787b;
        public final Method c;
        public final Integer d;

        public String a() {
            return this.f14786a;
        }

        public String b() {
            return this.f14787b;
        }

        public abstract Object c(Object obj);

        public void d(oej oejVar, Object obj) {
            try {
                if (this.d == null) {
                    Object[] objArr = g.get();
                    objArr[0] = c(obj);
                    this.c.invoke(oejVar, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = h.get();
                objArr2[0] = this.d;
                objArr2[1] = c(obj);
                this.c.invoke(oejVar, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                cm8.f(ViewManager.class, "Error while updating prop " + this.f14786a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f14786a + "' in shadow node of type: " + oejVar.getViewClass(), th);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            try {
                if (this.d == null) {
                    Object[] objArr = e.get();
                    objArr[0] = view;
                    objArr[1] = c(obj);
                    this.c.invoke(viewManager, objArr);
                    Arrays.fill(objArr, (Object) null);
                    return;
                }
                Object[] objArr2 = f.get();
                objArr2[0] = view;
                objArr2[1] = this.d;
                objArr2[2] = c(obj);
                this.c.invoke(viewManager, objArr2);
                Arrays.fill(objArr2, (Object) null);
            } catch (Throwable th) {
                cm8.f(ViewManager.class, "Error while updating prop " + this.f14786a, th);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f14786a + "' of a view managed by: " + viewManager.getName(), th);
            }
        }

        public l(iej iejVar, String str, Method method) {
            this.f14786a = iejVar.name();
            this.f14787b = "__default_type__".equals(iejVar.customType()) ? str : iejVar.customType();
            this.c = method;
            this.d = null;
        }

        public l(jej jejVar, String str, Method method, int i) {
            this.f14786a = jejVar.names()[i];
            this.f14787b = "__default_type__".equals(jejVar.customType()) ? str : jejVar.customType();
            this.c = method;
            this.d = Integer.valueOf(i);
        }
    }
}
