package yz1;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200301a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f200301a = iArr;
        }
    }

    public static final d a(d dVar, e23.a<Boolean> aVar) {
        u uVar = dVar != null ? dVar.f200298a : null;
        if ((uVar == null ? -1 : a.f200301a[uVar.ordinal()]) == 1) {
            return aVar.invoke().booleanValue() ? d.a(dVar, u.SUCCESS, false, 6) : dVar;
        }
        return dVar == null ? new d(u.LOADING, null, false, 6, null) : dVar;
    }

    public static final boolean b(d dVar) {
        return dVar == null || dVar.f200298a == u.LOADING || dVar.f200299b == c.CACHE;
    }

    public static final d c(List<d> list, d dVar) {
        if (list != null && !list.isEmpty()) {
            for (d dVar2 : list) {
                if ((dVar2 != null ? dVar2.f200298a : null) == null) {
                    return new d(u.LOADING, null, false, 6, null);
                }
            }
        }
        u uVar = dVar != null ? dVar.f200298a : null;
        u uVar2 = u.ERROR;
        if (uVar == uVar2) {
            return new d(uVar2, null, false, 6, null);
        }
        return dVar == null ? new d(u.LOADING, null, false, 6, null) : dVar;
    }
}
