package ng;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f125899a;

    static {
        ArrayList arrayList = new ArrayList();
        f125899a = arrayList;
        arrayList.add(new l());
        arrayList.add(new d());
        arrayList.add(new c());
        arrayList.add(new h());
        arrayList.add(new k());
        arrayList.add(new b());
        arrayList.add(new a());
        arrayList.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t7;
        for (i iVar : f125899a) {
            Type rawType = type;
            while (!(rawType instanceof Class)) {
                if (!(rawType instanceof ParameterizedType)) {
                    vb.h.s("TODO");
                    return null;
                }
                rawType = ((ParameterizedType) rawType).getRawType();
            }
            if (iVar.a((Class) rawType) && (t7 = (T) iVar.b(obj, type)) != null) {
                return t7;
            }
        }
        return null;
    }

    public static final Object b(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
            bVar = new org.json.alipay.a(strTrim);
        } else {
            if (!strTrim.startsWith("{") || !strTrim.endsWith(StringSubstitutor.DEFAULT_VAR_END)) {
                return a(strTrim, type);
            }
            bVar = new org.json.alipay.b(strTrim);
        }
        return a(bVar, type);
    }
}
