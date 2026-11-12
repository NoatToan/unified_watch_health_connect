package hq;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhq/y0;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f85193a = new y0();

    private y0() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(List list, CharSequence charSequence, List list2, boolean z14, v13.c cVar) throws Throwable {
        v0 v0Var;
        List list3;
        List list4;
        Object obj;
        long j8;
        boolean z15;
        CharSequence charSequence2;
        List<String> list5;
        List<String> list6;
        boolean z16;
        List list7;
        long j14;
        CharSequence charSequence3;
        List list8;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i14 = v0Var.f85164g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v0Var.f85164g = i14 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(cVar);
            }
        } else {
            v0Var = new v0(cVar);
        }
        Object obj2 = v0Var.f85163f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v0Var.f85164g;
        y0 y0Var = f85193a;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = v0Var.f85162e;
                boolean z17 = v0Var.f85161d;
                List list9 = v0Var.f85160c;
                charSequence2 = v0Var.f85159b;
                list4 = v0Var.f85158a;
                o13.r.b(obj2);
                obj = obj2;
                z15 = z17;
                list3 = list9;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j14 = v0Var.f85162e;
                z16 = v0Var.f85161d;
                list7 = v0Var.f85160c;
                CharSequence charSequence4 = v0Var.f85159b;
                list8 = v0Var.f85158a;
                o13.r.b(obj2);
                charSequence3 = charSequence4;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j14;
            String str = "Searched " + list8.size() + " exercises in " + jCurrentTimeMillis + "ms, query = '" + ((Object) charSequence3) + "', options = " + p13.h0.k0(list7, null, null, null, new f0(10), 31) + ", fuzzy = " + z16 + ", results = " + ((List) obj2).size();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "SelectExerciseUtil", str);
            return obj2;
        }
        o13.r.b(obj2);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        List list10 = list;
        v0Var.f85158a = list10;
        v0Var.f85159b = charSequence;
        list3 = list2;
        v0Var.f85160c = list3;
        v0Var.f85161d = z14;
        v0Var.f85162e = jCurrentTimeMillis2;
        v0Var.f85164g = 1;
        y0Var.getClass();
        if (!list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list3) {
                if (obj3 instanceof h.b) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h.b) it.next()).f85030d.f207225a);
            }
            Set setG1 = p13.h0.g1(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list3) {
                if (obj4 instanceof h.a) {
                    arrayList3.add(obj4);
                }
            }
            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((h.a) it3.next()).f85029d.f147898a);
            }
            Set setG2 = p13.h0.g1(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : list10) {
                com.garmin.android.apps.connectmobile.repcounting.model.d dVar = (com.garmin.android.apps.connectmobile.repcounting.model.d) obj5;
                g8.i.v(v0Var.getF129302c());
                boolean z18 = false;
                boolean z19 = setG1.isEmpty() || ((list6 = dVar.f41108g) != null && list6.containsAll(setG1));
                if (setG2.isEmpty() || ((list5 = dVar.f41110i) != null && list5.containsAll(setG2))) {
                    z18 = true;
                }
                if (z19 && z18) {
                    arrayList5.add(obj5);
                }
            }
            list10 = arrayList5;
        }
        if (list10 != aVar) {
            list4 = list;
            obj = list10;
            j8 = jCurrentTimeMillis2;
            z15 = z14;
            charSequence2 = charSequence;
        }
        return aVar;
        String string = charSequence2.toString();
        v0Var.f85158a = list4;
        v0Var.f85159b = charSequence2;
        v0Var.f85160c = list3;
        v0Var.f85161d = z15;
        v0Var.f85162e = j8;
        v0Var.f85164g = 2;
        Serializable serializableB = y0Var.b((List) obj, string, z15, v0Var);
        if (serializableB != aVar) {
            z16 = z15;
            obj2 = serializableB;
            list7 = list3;
            j14 = j8;
            charSequence3 = charSequence2;
            list8 = list4;
            long jCurrentTimeMillis3 = System.currentTimeMillis() - j14;
            String str2 = "Searched " + list8.size() + " exercises in " + jCurrentTimeMillis3 + "ms, query = '" + ((Object) charSequence3) + "', options = " + p13.h0.k0(list7, null, null, null, new f0(10), 31) + ", fuzzy = " + z16 + ", results = " + ((List) obj2).size();
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "SelectExerciseUtil", str2);
            return obj2;
        }
        return aVar;
    }

    public static List c(List list, String str, w0 w0Var) {
        if (str.length() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            g8.i.v(w0Var.getF129302c());
            String str2 = ((com.garmin.android.apps.connectmobile.repcounting.model.d) obj).f41107f;
            if (str2 != null && d53.w.z(str2, str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[LOOP:0: B:33:0x009d->B:35:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb A[LOOP:1: B:37:0x00c5->B:39:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        if (r14 == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(List list, String str, boolean z14, v13.c cVar) throws Throwable {
        w0 w0Var;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i14 = w0Var.f85171g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w0Var.f85171g = i14 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objC = w0Var.f85169e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w0Var.f85171g;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objC);
                Iterable iterable = (Iterable) objC;
                ArrayList arrayList4 = new ArrayList(p13.y.r(iterable, 10));
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new r0((com.garmin.android.apps.connectmobile.repcounting.model.d) it4.next(), null, 2, null));
                }
                return arrayList4;
            }
            if (i15 == 2) {
                z14 = w0Var.f85168d;
                str = w0Var.f85166b;
                list = w0Var.f85165a;
                o13.r.b(objC);
                Iterable iterable2 = (Iterable) objC;
                arrayList = new ArrayList(p13.y.r(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new r0((com.garmin.android.apps.connectmobile.repcounting.model.d) it.next(), new Integer(-1)));
                }
                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((r0) it3.next()).f85140a);
                }
                List listZ0 = p13.h0.z0(list, p13.h0.g1(arrayList2));
                w0Var.f85165a = null;
                w0Var.f85166b = null;
                w0Var.f85167c = arrayList;
                w0Var.f85168d = z14;
                w0Var.f85171g = 3;
                x53.c cVar2 = o53.s0.f129406a;
                objC = ge1.b.e0(x53.b.f189152a, new x0(listZ0, str, null), w0Var);
                if (objC != aVar) {
                    arrayList3 = arrayList;
                }
                return aVar;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList3 = w0Var.f85167c;
            o13.r.b(objC);
            return p13.h0.C0(arrayList3, (List) objC);
        }
        o13.r.b(objC);
        if (str.length() == 0) {
            ArrayList arrayList5 = new ArrayList(p13.y.r(list, 10));
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList5.add(new r0((com.garmin.android.apps.connectmobile.repcounting.model.d) it5.next(), null, 2, null));
            }
            return arrayList5;
        }
        if (str.length() < 3 || !z14) {
            w0Var.f85165a = null;
            w0Var.f85166b = null;
            w0Var.f85168d = z14;
            w0Var.f85171g = 1;
            objC = c(list, str, w0Var);
        } else {
            w0Var.f85165a = list;
            w0Var.f85166b = str;
            w0Var.f85168d = z14;
            w0Var.f85171g = 2;
            objC = c(list, str, w0Var);
            if (objC != aVar) {
                Iterable iterable3 = (Iterable) objC;
                arrayList = new ArrayList(p13.y.r(iterable3, 10));
                it = iterable3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new r0((com.garmin.android.apps.connectmobile.repcounting.model.d) it.next(), new Integer(-1)));
                }
                arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((r0) it3.next()).f85140a);
                }
                List listZ1 = p13.h0.z0(list, p13.h0.g1(arrayList2));
                w0Var.f85165a = null;
                w0Var.f85166b = null;
                w0Var.f85167c = arrayList;
                w0Var.f85168d = z14;
                w0Var.f85171g = 3;
                x53.c cVar3 = o53.s0.f129406a;
                objC = ge1.b.e0(x53.b.f189152a, new x0(listZ1, str, null), w0Var);
                if (objC != aVar) {
                    arrayList3 = arrayList;
                    return p13.h0.C0(arrayList3, (List) objC);
                }
            }
        }
        return aVar;
    }
}
