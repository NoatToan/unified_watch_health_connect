package defpackage;

import cn.hutool.core.bean.BeanDesc;
import cn.hutool.core.bean.BeanDescCache;
import cn.hutool.core.bean.BeanPath;
import cn.hutool.core.bean.copier.BeanCopier;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ModifierUtil;
import com.mi.health.course.export.data.CourseConfigModel;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class rh2 {
    public static <T> T A(Object obj, Class<T> cls) {
        return (T) B(obj, cls, null);
    }

    public static <T> T B(Object obj, Class<T> cls, CopyOptions copyOptions) {
        if (obj == null) {
            return null;
        }
        T t = (T) bbk.u(cls);
        i(obj, t, copyOptions);
        return t;
    }

    public static <T> T C(Object obj, Class<T> cls, boolean z) {
        return (T) B(obj, cls, CopyOptions.create().setIgnoreCase(true).setIgnoreError(z));
    }

    public static <T> T D(Object obj, Class<T> cls) {
        return (T) B(obj, cls, CopyOptions.create().setIgnoreError(true));
    }

    public static Map<String, Object> e(Object obj) {
        return h(obj, false, false);
    }

    public static Map<String, Object> f(Object obj, Map<String, Object> map, boolean z, c38<String> c38Var) {
        if (obj == null) {
            return null;
        }
        return (Map) BeanCopier.create(obj, map, CopyOptions.create().setIgnoreNullValue(z).setFieldNameEditor(c38Var)).copy();
    }

    public static Map<String, Object> g(Object obj, Map<String, Object> map, final boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        return f(obj, map, z2, new c38() { // from class: mh2
            @Override // defpackage.c38
            public final Object a(Object obj2) {
                return rh2.v(z, (String) obj2);
            }
        });
    }

    public static Map<String, Object> h(Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        return g(obj, new LinkedHashMap(), z, z2);
    }

    public static void i(Object obj, Object obj2, CopyOptions copyOptions) {
        BeanCopier.create(obj, obj2, (CopyOptions) g4h.e(copyOptions, CopyOptions.create())).copy();
    }

    public static void j(Class<?> cls, Consumer<? super fdi> consumer) {
        o(cls).getProps().forEach(consumer);
    }

    public static <T> T k(Map<?, ?> map, T t, CopyOptions copyOptions) {
        return (T) l(map, t, false, copyOptions);
    }

    public static <T> T l(Map<?, ?> map, T t, boolean z, CopyOptions copyOptions) {
        if (v4f.o(map)) {
            return t;
        }
        if (z) {
            map = v4f.C(map);
        }
        i(map, t, copyOptions);
        return t;
    }

    public static <T> T m(Map<?, ?> map, T t, boolean z, boolean z2) {
        return (T) l(map, t, z, CopyOptions.create().setIgnoreError(z2));
    }

    public static <T> T n(Map<?, ?> map, T t, boolean z) {
        return (T) k(map, t, CopyOptions.create().setIgnoreCase(true).setIgnoreError(z));
    }

    public static BeanDesc o(Class<?> cls) {
        return BeanDescCache.INSTANCE.getBeanDesc(cls, new ph2(cls));
    }

    public static Object p(Object obj, final String str) {
        if (obj == null || str == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof Collection) {
            try {
                return CollUtil.e((Collection) obj, Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                return CollUtil.m((Collection) obj, new Function() { // from class: nh2
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return rh2.x(str, obj2);
                    }
                }, false);
            }
        }
        if (!qj1.B(obj)) {
            return bbk.g(obj, str);
        }
        try {
            return qj1.t(obj, Integer.parseInt(str));
        } catch (NumberFormatException unused2) {
            return qj1.H(obj, Object.class, new Function() { // from class: oh2
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return rh2.y(str, obj2);
                }
            });
        }
    }

    public static <T> T q(Object obj, String str) {
        return (T) BeanPath.create(str).get(obj);
    }

    public static boolean r(Class<?> cls) {
        if (i04.t(cls)) {
            for (Field field : cls.getFields()) {
                if (ModifierUtil.c(field) && !ModifierUtil.d(field)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s(Class<?> cls) {
        if (i04.t(cls)) {
            for (Method method : cls.getMethods()) {
                if (method.getParameterTypes().length == 1 && method.getName().startsWith(CourseConfigModel.DevCmd.CMD_ACTION_SET)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean t(Class<?> cls) {
        return s(cls) || r(cls);
    }

    public static boolean u(Object obj, String str, boolean z) {
        String strD = i04.d(obj, z);
        if (z) {
            str = tt3.x0(str);
        }
        return strD.equals(str);
    }

    public static /* synthetic */ String v(boolean z, String str) {
        return z ? tt3.q0(str) : str;
    }

    public static /* synthetic */ BeanDesc w(Class cls) throws Exception {
        return new BeanDesc(cls);
    }

    public static /* synthetic */ Object x(String str, Object obj) {
        return p(obj, str);
    }

    public static /* synthetic */ Object y(String str, Object obj) {
        return p(obj, str);
    }

    public static void z(Object obj, String str, Object obj2) {
        if (obj instanceof Map) {
            ((Map) obj).put(str, obj2);
            return;
        }
        if (obj instanceof List) {
            CollUtil.s((List) obj, yj4.s(str).intValue(), obj2);
        } else if (qj1.B(obj)) {
            qj1.M(obj, yj4.s(str).intValue(), obj2);
        } else {
            bbk.w(obj, str, obj2);
        }
    }
}
