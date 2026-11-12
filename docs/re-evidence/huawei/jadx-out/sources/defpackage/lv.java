package defpackage;

import com.alipay.sdk.m.g.i;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.alipay.a;
import org.json.alipay.b;

/* JADX INFO: loaded from: classes4.dex */
public class lv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<i> f40873b;

    public static final Object c(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
            bVar = new a(strTrim);
        } else {
            if (!strTrim.startsWith("{") || !strTrim.endsWith("}")) {
                return d(strTrim, type);
            }
            bVar = new b(strTrim);
        }
        return d(bVar, type);
    }

    public static final <T> T d(Object obj, Type type) {
        T t;
        for (i iVar : f40873b) {
            if (iVar.a(mb.b(type)) && (t = (T) iVar.a(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f40873b = arrayList;
        arrayList.add(new ma());
        f40873b.add(new lr());
        f40873b.add(new lq());
        f40873b.add(new ls());
        f40873b.add(new lt());
        f40873b.add(new lo());
        f40873b.add(new lp());
        f40873b.add(new lu());
    }
}
