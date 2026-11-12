package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oqh {
    public static final List<oqh> d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f29388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public loo f29389b;
    public oqh c;

    public oqh(Object obj, loo looVar) {
        this.f29388a = obj;
        this.f29389b = looVar;
    }

    public static oqh a(loo looVar, Object obj) {
        List<oqh> list = d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new oqh(obj, looVar);
                }
                oqh oqhVarRemove = list.remove(size - 1);
                oqhVarRemove.f29388a = obj;
                oqhVarRemove.f29389b = looVar;
                oqhVarRemove.c = null;
                return oqhVarRemove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(oqh oqhVar) {
        oqhVar.f29388a = null;
        oqhVar.f29389b = null;
        oqhVar.c = null;
        List<oqh> list = d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(oqhVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
