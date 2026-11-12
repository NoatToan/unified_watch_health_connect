package defpackage;

import android.graphics.drawable.Drawable;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class qqw {
    public static int c(Map map, String str, int i) {
        Object objB = b(map, str, Integer.valueOf(i));
        return objB instanceof Integer ? ((Integer) objB).intValue() : i;
    }

    public static float e(Map map, String str, float f) {
        Object objB = b(map, str, Float.valueOf(f));
        return objB instanceof Float ? ((Float) objB).floatValue() : f;
    }

    public static long e(Map map, String str, long j) {
        Object objB = b(map, str, Long.valueOf(j));
        return objB instanceof Long ? ((Long) objB).longValue() : j;
    }

    public static boolean a(Map map, String str, boolean z) {
        Object objB = b(map, str, Boolean.valueOf(z));
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z;
    }

    public static String d(Map map, String str, String str2) {
        Object objB = b(map, str, str2);
        return objB instanceof String ? (String) objB : str2;
    }

    public static CharSequence d(Map map, String str, CharSequence charSequence) {
        Object objB = b(map, str, charSequence);
        return objB instanceof CharSequence ? (CharSequence) objB : charSequence;
    }

    public static <T> List<T> a(Map map, String str, Class<T> cls, List<T> list) {
        Object objB = b(map, str, list);
        if (objB instanceof List) {
            List<T> list2 = (List) objB;
            if (list2.size() > 0 && njy.b((Object) list2, (Class) cls)) {
                return list2;
            }
        }
        return list;
    }

    public static Drawable c(Map map, String str, Drawable drawable) {
        Object objB = b(map, str, drawable);
        return objB instanceof Drawable ? (Drawable) objB : drawable;
    }

    public static OnClickSectionListener c(Map map, String str, OnClickSectionListener onClickSectionListener) {
        Object objB = b(map, str, onClickSectionListener);
        return objB instanceof OnClickSectionListener ? (OnClickSectionListener) objB : onClickSectionListener;
    }

    public static <T> Object b(Map map, String str, T t) {
        return (map == null || map.isEmpty()) ? t : map.get(str);
    }

    public static <T> T a(Map map, String str, Class<T> cls, T t) {
        T t2 = (T) b(map, str, t);
        return cls.isInstance(t2) ? t2 : t;
    }
}
