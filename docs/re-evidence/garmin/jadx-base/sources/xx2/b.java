package xx2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxx2/b;", "", "<init>", "()V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f192586a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static by2.d f192587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f192588c;

    static {
        Logger logger = LoggerFactory.getLogger("SUB#Helper");
        logger.getClass();
        f192588c = logger;
    }

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(v13.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i14 = aVar.f192585b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f192585b = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar);
            }
        } else {
            aVar = new a(cVar);
        }
        Object objE = aVar.f192584a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f192585b;
        if (i15 == 0) {
            r.b(objE);
            by2.d dVar = f192587b;
            if (dVar == null) {
                h.z("SubscriptionManager is not initialized");
                return null;
            }
            aVar.f192585b = 1;
            objE = dVar.e(true, aVar);
            if (objE == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE);
        }
        e eVar = (e) objE;
        T t7 = eVar.f192598a;
        Exception exc = eVar.f192599b;
        List list = (List) t7;
        if (list == null) {
            return new e(null, exc);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, ((yx2.c) it.next()).f200058k);
        }
        return new e(h0.b1(h0.f1(arrayList)), exc);
    }

    public static Object b(boolean z14, v13.c cVar) {
        by2.d dVar = f192587b;
        if (dVar != null) {
            return dVar.e(z14, cVar);
        }
        h.z("SubscriptionManager is not initialized");
        return null;
    }

    public static List c() {
        by2.d dVar = f192587b;
        if (dVar == null) {
            h.z("SubscriptionManager is not initialized");
            return null;
        }
        ArrayList arrayListG = dVar.g();
        if (arrayListG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListG.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, ((yx2.c) it.next()).f200058k);
        }
        return h0.b1(h0.f1(arrayList));
    }

    public static ArrayList d() {
        by2.d dVar = f192587b;
        if (dVar != null) {
            return dVar.g();
        }
        h.z("SubscriptionManager is not initialized");
        return null;
    }

    public static Object e(boolean z14, String str, String str2, String str3, v13.c cVar, int i14) {
        if ((i14 & 2) != 0) {
            z14 = true;
        }
        boolean z15 = z14;
        String str4 = (i14 & 8) != 0 ? null : str;
        String str5 = (i14 & 16) != 0 ? null : str2;
        String str6 = (i14 & 32) != 0 ? null : str3;
        by2.d dVar = f192587b;
        if (dVar == null) {
            h.z("SubscriptionManager is not initialized");
            return null;
        }
        Logger logger = dVar.f22256c;
        logger.debug(":: getPurchasableSubscriptions ");
        yx2.a aVar = dVar.f22254a;
        if (aVar == null) {
            h.s("Minimum required parameters not set to make this call");
            return null;
        }
        String str7 = aVar.f200043a;
        logger.debug("Fetching purchasable subscriptions for null and ".concat(str7));
        return dVar.a(str7, aVar.f200044b, null, z15, str4, str5, str6, cVar);
    }
}
