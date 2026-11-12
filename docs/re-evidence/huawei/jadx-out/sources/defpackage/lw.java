package defpackage;

import com.alipay.sdk.m.g.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.alipay.a;
import org.json.alipay.b;

/* JADX INFO: loaded from: classes4.dex */
public class lw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static List<j> f40952c;

    public static Object d(Object obj) {
        Object objA;
        if (obj == null) {
            return null;
        }
        for (j jVar : f40952c) {
            if (jVar.a(obj.getClass()) && (objA = jVar.a(obj)) != null) {
                return objA;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }

    public static String b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objD = d(obj);
        if (mb.a(objD.getClass())) {
            return b.d(objD.toString());
        }
        if (Collection.class.isAssignableFrom(objD.getClass())) {
            return new a((Collection) objD).toString();
        }
        if (Map.class.isAssignableFrom(objD.getClass())) {
            return new b((Map) objD).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + objD.getClass());
    }

    static {
        ArrayList arrayList = new ArrayList();
        f40952c = arrayList;
        arrayList.add(new ma());
        f40952c.add(new lr());
        f40952c.add(new lq());
        f40952c.add(new ls());
        f40952c.add(new lo());
        f40952c.add(new lp());
        f40952c.add(new lu());
    }
}
