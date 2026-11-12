package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nqh {
    public static final List<nqh> d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ioo f28261b;
    public nqh c;

    public nqh(Object obj, ioo iooVar) {
        this.f28260a = obj;
        this.f28261b = iooVar;
    }

    public static nqh a(ioo iooVar, Object obj) {
        List<nqh> list = d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new nqh(obj, iooVar);
                }
                nqh nqhVarRemove = list.remove(size - 1);
                nqhVarRemove.f28260a = obj;
                nqhVarRemove.f28261b = iooVar;
                nqhVarRemove.c = null;
                return nqhVarRemove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(nqh nqhVar) {
        nqhVar.f28260a = null;
        nqhVar.f28261b = null;
        nqhVar.c = null;
        List<nqh> list = d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(nqhVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
