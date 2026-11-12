package d4;

import c62.m1;
import e23.p;
import java.util.Arrays;
import p005kotlin.jvm.internal.y0;
import p3.l0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final l b(p pVar, e23.l lVar) {
        a3.d dVar = new a3.d(pVar, 8);
        lVar.getClass();
        y0.e(1, lVar);
        l lVar2 = m.f57455a;
        return new l(dVar, lVar);
    }

    public static final Object c(Object[] objArr, k kVar, e23.a aVar, p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        return d(Arrays.copyOf(objArr, objArr.length), kVar, null, aVar, mVar, (i14 & 112) | 384 | ((i14 << 3) & 7168), 0);
    }

    @o13.e
    public static final Object d(Object[] objArr, k kVar, String str, e23.a aVar, p3.m mVar, int i14, int i15) {
        Object[] objArr2;
        Object obj;
        Object objE;
        if ((i15 & 2) != 0) {
            kVar = m.f57455a;
            kVar.getClass();
        }
        k kVar2 = kVar;
        if ((i15 & 4) != 0) {
            str = null;
        }
        x1 x1Var = p3.n.f135158a;
        long u8 = mVar.getU();
        if (str == null || str.length() == 0) {
            d53.a.a(36);
            str = Long.toString(u8, 36);
            str.getClass();
        }
        String str2 = str;
        kVar2.getClass();
        f fVar = (f) mVar.A(i.f57449a);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        Object obj2 = p3.m.a.f135155b;
        if (objQ == obj2) {
            Object objA = (fVar == null || (objE = fVar.e(str2)) == null) ? null : kVar2.a(objE);
            if (objA == null) {
                objA = aVar.invoke();
            }
            objArr2 = objArr;
            Object bVar = new b(kVar2, fVar, str2, objA, objArr2);
            mVar.K(bVar);
            objQ = bVar;
        } else {
            objArr2 = objArr;
        }
        b bVar2 = (b) objQ;
        Object objInvoke = Arrays.equals(objArr2, bVar2.f57430e) ? bVar2.f57429d : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zR = mVar.r(bVar2) | ((((i14 & 112) ^ 48) > 32 && mVar.r(kVar2)) || (i14 & 48) == 32) | mVar.r(fVar) | mVar.B(str2) | mVar.r(objInvoke) | mVar.r(objArr2);
        Object objQ2 = mVar.q();
        if (zR || objQ2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object jVar = new ck0.j((Object) bVar2, (Object) kVar2, (Object) fVar, str2, obj, (Object) objArr3, 3);
            mVar.K(jVar);
            objQ2 = jVar;
        } else {
            obj = objInvoke;
        }
        l0.i((e23.a) objQ2, mVar);
        return obj;
    }

    public static final Object e(Object[] objArr, e23.a aVar, p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l lVar = m.f57455a;
        lVar.getClass();
        return d(objArrCopyOf, lVar, null, aVar, mVar, ((i14 << 6) & 7168) | 384, 0);
    }

    public static final p1 f(Object[] objArr, k kVar, e23.a aVar, p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kVar.getClass();
        m1 m1Var = new m1(kVar, 23);
        com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l lVar = new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(kVar, 17);
        l lVar2 = m.f57455a;
        return (p1) d(objArrCopyOf, new l(m1Var, lVar), null, aVar, mVar, ((i14 << 3) & 7168) | 384, 0);
    }
}
