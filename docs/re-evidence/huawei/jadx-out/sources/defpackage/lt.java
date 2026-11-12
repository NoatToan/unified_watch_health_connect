package defpackage;

import com.alipay.sdk.m.g.i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import org.json.alipay.a;

/* JADX INFO: loaded from: classes4.dex */
public class lt implements i {
    @Override // com.alipay.sdk.m.g.i, com.alipay.sdk.m.g.j
    public boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }

    @Override // com.alipay.sdk.m.g.i
    public Object a(Object obj, Type type) {
        if (!obj.getClass().equals(a.class)) {
            return null;
        }
        a aVar = (a) obj;
        HashSet hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i = 0; i < aVar.a(); i++) {
            hashSet.add(lv.d(aVar.a(i), type2));
        }
        return hashSet;
    }
}
