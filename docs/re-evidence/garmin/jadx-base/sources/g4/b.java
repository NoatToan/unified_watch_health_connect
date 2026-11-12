package g4;

import d53.u;
import ds.e0;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg4/b;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f75732a = new ArrayList();

    public final boolean a(int i14, s3.c cVar, Object obj) {
        ArrayList<Object> arrayListA = cVar.a();
        if (arrayListA == null) {
            cVar.getClass();
            b(i14, cVar, null);
            return true;
        }
        int size = arrayListA.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj2 = arrayListA.get(i15);
            if (obj2 instanceof p3.b) {
                if (obj2.equals(obj)) {
                    b(cVar.getF156319a(), cVar, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof s3.c)) {
                    e0.t(obj2, "Unexpected child source info ");
                    return false;
                }
                if (a(i14, (s3.c) obj2, obj)) {
                    b(cVar.getF156319a(), cVar, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(int i14, s3.c cVar, Object obj) {
        s sVarD;
        d dVar;
        String f156320b;
        String f156320b2;
        String f156320b3;
        if (cVar == null || (f156320b3 = cVar.getF156320b()) == null || f156320b3.length() == 0) {
            sVarD = null;
        } else {
            try {
                sVarD = lg.d.D(f156320b3);
            } catch (p unused) {
                sVarD = null;
            }
        }
        if (sVarD == null) {
            dVar = new d(i14, null, null);
        } else if (obj == null) {
            dVar = new d(i14, sVarD, null);
        } else {
            ArrayList<Object> arrayListA = cVar.a();
            int i15 = 0;
            if (arrayListA != null) {
                int size = arrayListA.size();
                int i16 = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    Object obj2 = arrayListA.get(i17);
                    if (p005kotlin.jvm.internal.s.g(obj2, obj)) {
                        break;
                    }
                    s3.c cVarE = e(obj2);
                    if (cVarE != null && ((cVarE.getF156319a() == -127 || (cVarE.getF156319a() == 0 && (obj2 instanceof p3.b) && c((p3.b) obj2) == -127)) && cVarE.getF156320b() == null)) {
                        ArrayList<Object> arrayListA2 = cVarE.a();
                        if (arrayListA2 != null) {
                            int size2 = arrayListA2.size();
                            for (int i18 = 0; i18 < size2; i18++) {
                                s3.c cVarE2 = e(arrayListA2.get(i18));
                                if (cVarE2 != null && (f156320b2 = cVarE2.getF156320b()) != null && u.y(f156320b2, "C", false)) {
                                    i16++;
                                }
                            }
                        }
                    } else if (cVarE != null && (f156320b = cVarE.getF156320b()) != null && u.y(f156320b, "C", false)) {
                        i16++;
                    }
                }
                i15 = i16;
            }
            dVar = new d(i14, sVarD, Integer.valueOf(i15));
        }
        this.f75732a.add(dVar);
    }

    public abstract int c(p3.b bVar);

    public final void d(int i14, Object obj, s3.c cVar, Object obj2) {
        if (cVar == null) {
            p3.m.f135153a.getClass();
            if (!p005kotlin.jvm.internal.s.g(obj, p3.m.a.f135155b)) {
                return;
            }
        }
        if (obj2 == null || cVar == null) {
            b(i14, cVar, null);
        } else {
            if (a(i14, cVar, obj2)) {
                return;
            }
            b(i14, cVar, obj2);
        }
    }

    public final s3.c e(Object obj) {
        if (obj instanceof p3.b) {
            return f((p3.b) obj);
        }
        if (obj instanceof s3.c) {
            return (s3.c) obj;
        }
        e0.t(obj, "Unexpected child source info ");
        return null;
    }

    public abstract s3.c f(p3.b bVar);
}
