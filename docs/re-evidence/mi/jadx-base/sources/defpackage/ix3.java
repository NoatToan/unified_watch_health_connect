package defpackage;

import com.miui.tsmclient.entity.digitalkey.ProductList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ix3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, a> f22187a = new ConcurrentHashMap<>();

    public interface a {
        Object a(String str, Object obj);

        void b(String str, Object obj, b bVar);
    }

    public interface b {
        void onResult(Object obj);
    }

    public static Object a(int i, String str, Object obj) {
        tpe.a(ProductList.ProductInfo.CCC_TYPE, "call protocolType: " + i + " method: " + str);
        a aVar = f22187a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.a(str, obj);
        }
        tpe.a(ProductList.ProductInfo.CCC_TYPE, "call not found");
        return null;
    }

    public static void b(int i, String str, Object obj, b bVar) {
        tpe.a(ProductList.ProductInfo.CCC_TYPE, "callAsync protocolType: " + i + " method: " + str);
        a aVar = f22187a.get(Integer.valueOf(i));
        if (aVar != null) {
            aVar.b(str, obj, bVar);
        } else {
            tpe.a(ProductList.ProductInfo.CCC_TYPE, "callAsync not found");
            bVar.onResult(null);
        }
    }
}
