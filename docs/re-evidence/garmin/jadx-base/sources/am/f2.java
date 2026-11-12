package am;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public final class f2 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            DateTime startDateTime = ((ps.x1) t7).getStartDateTime();
            Long lValueOf = Long.valueOf(startDateTime != null ? startDateTime.getMillis() : 0L);
            DateTime startDateTime2 = ((ps.x1) t14).getStartDateTime();
            return r13.a.b(lValueOf, Long.valueOf(startDateTime2 != null ? startDateTime2.getMillis() : 0L));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            DateTime startDateTime = ((ps.x1) t7).getStartDateTime();
            Long lValueOf = Long.valueOf(startDateTime != null ? startDateTime.getMillis() : 0L);
            DateTime startDateTime2 = ((ps.x1) t14).getStartDateTime();
            return r13.a.b(lValueOf, Long.valueOf(startDateTime2 != null ? startDateTime2.getMillis() : 0L));
        }
    }

    public static final ps.c1 a(ps.x1 x1Var, ps.c1 c1Var) {
        x1Var.getClass();
        c1Var.getClass();
        DateTime startDateTime = x1Var.getStartDateTime();
        long millis = startDateTime != null ? startDateTime.getMillis() : 0L;
        DateTime endDateTime = x1Var.getEndDateTime();
        long millis2 = endDateTime != null ? endDateTime.getMillis() : 0L;
        if (millis2 < millis) {
            Double duration = x1Var.getDuration();
            millis2 = (((long) (duration != null ? duration.doubleValue() : 0.0d)) * 1000) + millis;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i14 = 0;
        for (Object obj : c1Var.f139767d) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            int i16 = i14;
            long j8 = (long) dDoubleValue;
            if (millis <= j8 && j8 < millis2) {
                Double d14 = (Double) p13.h0.e0(i16, c1Var.f139764a);
                if (d14 != null) {
                    arrayList.add(Double.valueOf(d14.doubleValue()));
                }
                Double d15 = (Double) p13.h0.e0(i16, c1Var.f139765b);
                if (d15 != null) {
                    arrayList2.add(Double.valueOf(d15.doubleValue()));
                }
                arrayList4.add(Integer.valueOf(i16));
                arrayList3.add(Double.valueOf(dDoubleValue));
            }
            i14 = i15;
        }
        List listK = p13.x.k(arrayList, arrayList2, arrayList3);
        if (listK == null || !listK.isEmpty()) {
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).size() != arrayList4.size()) {
                    return null;
                }
            }
        }
        List<ps.t1> list = c1Var.f139766c;
        ArrayList arrayList5 = new ArrayList(p13.y.r(list, 10));
        for (ps.t1 t1Var : list) {
            ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList6.add(Double.valueOf(t1Var.f140223b.get(((Number) it3.next()).intValue()).doubleValue()));
            }
            arrayList5.add(new ps.t1(t1Var.f140222a, arrayList6, t1Var.f140224c));
        }
        return new ps.c1(arrayList, arrayList2, arrayList5, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0236  */
    /* JADX WARN: Code duplicated, block: B:113:0x0254  */
    /* JADX WARN: Code duplicated, block: B:119:0x026d  */
    /* JADX WARN: Code duplicated, block: B:124:0x027a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0288  */
    /* JADX WARN: Code duplicated, block: B:130:0x0290  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:150:0x0305  */
    /* JADX WARN: Code duplicated, block: B:155:0x0314  */
    /* JADX WARN: Code duplicated, block: B:157:0x031a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0447  */
    /* JADX WARN: Code duplicated, block: B:183:0x044e  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x020b  */
    public static final uo.a b(uw0.g gVar, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.a0> list, List<ps.x1> list2, boolean z14, boolean z15) {
        Iterator it;
        int i14;
        double d14;
        boolean z16;
        int iA;
        String str;
        boolean zO;
        ie2.p pVar;
        List<com.garmin.android.library.mapsdkadapter.f> list3;
        com.garmin.android.library.mapsdkadapter.q qVar;
        ArrayList arrayList;
        ListIterator<? extends com.garmin.android.apps.connectmobile.activities.newmodel.a0> listIterator;
        com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0VarPrevious;
        com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var;
        Iterator<T> it3;
        Object next;
        com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var2;
        int i15;
        ArrayList arrayList2;
        com.garmin.android.library.mapsdkadapter.f fVar;
        float fAtan2;
        com.garmin.android.library.mapsdkadapter.f fVar2;
        com.garmin.android.library.mapsdkadapter.f fVar3;
        Integer messageIndex;
        int iIntValue;
        qs.x xVarA2;
        Bitmap bitmapH;
        int i16;
        com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var3;
        com.garmin.android.library.mapsdkadapter.i.b bVar;
        long jG;
        boolean zO2;
        ie2.p pVar2;
        List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.a0> list4 = list;
        uw0.c cVar = gVar.f172988c;
        x0 x0Var = gVar.f172987b;
        List listN0 = list2 != null ? p13.h0.N0(list2, new a()) : null;
        if (list4 == null || list4.isEmpty() || listN0 == null || listN0.isEmpty() || list2.isEmpty()) {
            return null;
        }
        uo.a aVar = new uo.a();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            if (((ps.x1) obj).a2() != null) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Double distance = ((ps.x1) it4.next()).getDistance();
            if (distance != null) {
                arrayList4.add(distance);
            }
        }
        Double dP0 = p13.h0.p0(arrayList4);
        double dDoubleValue = dP0 != null ? dP0.doubleValue() : 0.0d;
        boolean z17 = gVar.c() && gVar.f172995j && !p13.x.k(x0.V1, x0.W1, x0.X1, x0.S0, x0.T0, x0.Z1, x0.f4267a2, x0.f4270b2, x0.R0).contains(x0Var);
        boolean zC = gVar.c();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : listN0) {
            qs.x xVarA3 = ((ps.x1) obj2).a2();
            if (xVarA3 != null && gVar.f172989d.contains(xVarA3)) {
                arrayList5.add(obj2);
            }
        }
        if (!p13.x.k(x0.V1, x0.W1, x0.X1, x0.S0, x0.T0).contains(x0Var)) {
            arrayList5 = tq.k.c(arrayList5);
        }
        Iterator it5 = arrayList5.iterator();
        int i17 = 0;
        while (it5.hasNext()) {
            Object next2 = it5.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                p13.x.q();
                throw null;
            }
            ps.x1 x1Var = (ps.x1) next2;
            DateTime startDateTime = x1Var.getStartDateTime();
            long millis = startDateTime != null ? startDateTime.getMillis() : 0L;
            DateTime endDateTime = x1Var.getEndDateTime();
            long millis2 = endDateTime != null ? endDateTime.getMillis() : 0L;
            if (millis2 < millis) {
                Double duration = x1Var.getDuration();
                millis2 = (((long) (duration != null ? duration.doubleValue() : 0.0d)) * 1000) + millis;
            } else {
                zC = zC;
            }
            ps.x1 x1Var2 = (ps.x1) p13.h0.e0(i17 - 1, arrayList5);
            boolean zC2 = p005kotlin.jvm.internal.s.c(x1Var.getDistance(), dDoubleValue);
            boolean z18 = z17;
            if (x1Var.a2() != qs.x.TRANSITION || x1Var2 == null) {
                it = it5;
                i14 = i18;
                d14 = dDoubleValue;
                z16 = false;
            } else {
                it = it5;
                i14 = i18;
                d14 = dDoubleValue;
                z16 = false;
                if (!p13.x.k(x0.V1, x0.W1, x0.X1, x0.S0, x0.T0).contains(x0Var)) {
                    iA = gVar.a(x1Var2, false, false);
                }
                com.garmin.android.library.mapsdkadapter.q qVar2 = new com.garmin.android.library.mapsdkadapter.q();
                String str2 = x0Var.f4358a;
                str = x0Var.f4358a;
                zO = z0.o(str2);
                pVar = qVar2.f50328a;
                if (zO) {
                    pVar.f93155c = ps.b1.a.f139701m.f139698j;
                } else if (z0.x(str)) {
                    pVar.f93155c = ps.b1.c.f139703m.f139698j;
                } else {
                    pVar.f93155c = 10.0f;
                }
                pVar.f93156d = iA;
                list3 = pVar.f93153a;
                pVar.f93158f = i17 + 1;
                if (z15) {
                    qVar = new com.garmin.android.library.mapsdkadapter.q();
                    zO2 = z0.o(str);
                    pVar2 = qVar.f50328a;
                    if (zO2) {
                        pVar2.f93155c = ps.b1.a.f139701m.f139698j + 4.0f;
                    } else {
                        pVar2.f93155c = 14.0f;
                    }
                    Resources resources = gVar.f172986a;
                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                    pVar2.f93156d = resources.getColor(R.color.gray_black_static, null);
                    pVar2.f93158f = 0.0f;
                } else {
                    qVar = null;
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : list4) {
                    jG = ((com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj3).G();
                    if (millis > jG && jG < millis2) {
                        arrayList6.add(obj3);
                    }
                }
                arrayList = new ArrayList(arrayList6);
                listIterator = list4.listIterator(list4.size());
                do {
                    if (listIterator.hasPrevious()) {
                        a0VarPrevious = null;
                        break;
                    }
                    a0VarPrevious = listIterator.previous();
                } while (a0VarPrevious.G() >= millis);
                a0Var = a0VarPrevious;
                it3 = list4.iterator();
                do {
                    if (it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (((com.garmin.android.apps.connectmobile.activities.newmodel.a0) next).G() <= millis2);
                a0Var2 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) next;
                if (z14) {
                    if (arrayList.isEmpty() && a0Var != null) {
                        arrayList.add(a0Var);
                    }
                    if (a0Var2 != null) {
                        arrayList.add(a0Var2);
                    }
                }
                i15 = 0;
                for (Object obj4 : arrayList) {
                    i16 = i15 + 1;
                    if (i15 >= 0) {
                        p13.x.q();
                        throw null;
                    }
                    a0Var3 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj4;
                    LatLng latLngD = a0Var3.D();
                    bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                    pVar.f93153a.add(new com.garmin.android.library.mapsdkadapter.f(latLngD, bVar));
                    if (qVar != null) {
                        qVar.f50328a.f93153a.add(new com.garmin.android.library.mapsdkadapter.f(a0Var3.D(), bVar));
                    }
                    i15 = i16;
                }
                arrayList2 = aVar.f172067a;
                arrayList2.add(qVar2);
                if (qVar != null) {
                    arrayList2.add(qVar);
                }
                if (list3 != null && (fVar3 = (com.garmin.android.library.mapsdkadapter.f) p13.h0.d0(list3)) != null) {
                    LatLng latLng = fVar3.f50283a;
                    messageIndex = x1Var.getMessageIndex();
                    if (messageIndex != null) {
                        iIntValue = messageIndex.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    x1Var.q3(Integer.valueOf(iIntValue + 1));
                    x1Var.w3(Double.valueOf(latLng.latitude));
                    x1Var.y3(Double.valueOf(latLng.longitude));
                    if (!z18) {
                        xVarA2 = x1Var.a2();
                        if (zC2 || !gVar.f172992g) {
                            bitmapH = cVar.h(xVarA2);
                        } else {
                            bitmapH = cVar.f();
                        }
                        if (bitmapH != null) {
                            com.garmin.android.library.mapsdkadapter.p pVar3 = new com.garmin.android.library.mapsdkadapter.p();
                            String strValueOf = String.valueOf(x1Var.getMessageIndex());
                            com.garmin.android.library.mapsdkadapter.o oVar = pVar3.f50327a;
                            oVar.f50312d = strValueOf;
                            pVar3.c(bitmapH);
                            pVar3.a(0.5f, 0.9f);
                            oVar.f50311c = 5.0f;
                            pVar3.d(fVar3);
                            aVar.a(pVar3);
                        }
                    }
                    if ((zC || z18) && i17 == 0) {
                        Bitmap bitmapE = cVar.e(2131232000);
                        com.garmin.android.library.mapsdkadapter.p pVar4 = new com.garmin.android.library.mapsdkadapter.p();
                        String strValueOf2 = String.valueOf(x1Var.getMessageIndex());
                        com.garmin.android.library.mapsdkadapter.o oVar2 = pVar4.f50327a;
                        oVar2.f50312d = strValueOf2;
                        pVar4.c(bitmapE);
                        pVar4.a(0.5f, 0.9f);
                        oVar2.f50311c = 2.0f;
                        pVar4.d(fVar3);
                        aVar.a(pVar4);
                    }
                }
                if (list3 == null && (fVar = (com.garmin.android.library.mapsdkadapter.f) p13.h0.n0(list3)) != null) {
                    LatLng latLng2 = fVar.f50283a;
                    x1Var.T2(Double.valueOf(latLng2.latitude));
                    x1Var.Z2(Double.valueOf(latLng2.longitude));
                    if (!gVar.f172991f || list3.size() <= 2) {
                        fAtan2 = 0.0f;
                    } else {
                        com.garmin.android.library.mapsdkadapter.f fVar4 = (com.garmin.android.library.mapsdkadapter.f) com.airbnb.lottie.animation.keyframe.a.c(2, list3);
                        fVar4.getClass();
                        double dCos = Math.cos(c(latLng2.latitude));
                        double d15 = latLng2.longitude;
                        LatLng latLng3 = fVar4.f50283a;
                        fAtan2 = (float) (((Math.atan2(Math.sin(c(d15 - latLng3.longitude)) * dCos, (Math.sin(c(latLng2.latitude)) * Math.cos(c(latLng3.latitude))) - (Math.cos(c(latLng2.longitude - latLng3.longitude)) * (Math.cos(c(latLng2.latitude)) * Math.sin(c(latLng3.latitude))))) * 180.0d) / 3.141592653589793d) + 180.0d);
                    }
                    if (z18) {
                        fVar2 = fVar;
                    } else {
                        Bitmap bitmapI = (zC2 && gVar.f172992g) ? cVar.i() : cVar.k();
                        if (bitmapI != null) {
                            com.garmin.android.library.mapsdkadapter.p pVar5 = new com.garmin.android.library.mapsdkadapter.p();
                            String strValueOf3 = String.valueOf(x1Var.getMessageIndex());
                            com.garmin.android.library.mapsdkadapter.o oVar3 = pVar5.f50327a;
                            oVar3.f50312d = strValueOf3;
                            pVar5.c(bitmapI);
                            pVar5.a(0.5f, 0.9f);
                            fVar2 = fVar;
                            pVar5.d(fVar2);
                            oVar3.f50310b = fAtan2;
                            aVar.a(pVar5);
                        } else {
                            fVar2 = fVar;
                        }
                    }
                    if (zC || z18) {
                        if (i17 == arrayList5.size() - 1) {
                            Bitmap bitmapE2 = cVar.e(2131232001);
                            com.garmin.android.library.mapsdkadapter.p pVar6 = new com.garmin.android.library.mapsdkadapter.p();
                            pVar6.f50327a.f50312d = String.valueOf(x1Var.getMessageIndex());
                            pVar6.c(bitmapE2);
                            pVar6.a(0.5f, 0.9f);
                            pVar6.d(fVar2);
                            aVar.a(pVar6);
                        }
                    }
                }
                list4 = list;
                zC = zC;
                z17 = z18;
                it5 = it;
                i17 = i14;
                dDoubleValue = d14;
                x0Var = x0Var;
            }
            iA = gVar.a(x1Var, zC2, z16);
            com.garmin.android.library.mapsdkadapter.q qVar3 = new com.garmin.android.library.mapsdkadapter.q();
            String str3 = x0Var.f4358a;
            str = x0Var.f4358a;
            zO = z0.o(str3);
            pVar = qVar3.f50328a;
            if (zO) {
                pVar.f93155c = ps.b1.a.f139701m.f139698j;
            } else if (z0.x(str)) {
                pVar.f93155c = ps.b1.c.f139703m.f139698j;
            } else {
                pVar.f93155c = 10.0f;
            }
            pVar.f93156d = iA;
            list3 = pVar.f93153a;
            pVar.f93158f = i17 + 1;
            if (z15) {
                qVar = new com.garmin.android.library.mapsdkadapter.q();
                zO2 = z0.o(str);
                pVar2 = qVar.f50328a;
                if (zO2) {
                    pVar2.f93155c = ps.b1.a.f139701m.f139698j + 4.0f;
                } else {
                    pVar2.f93155c = 14.0f;
                }
                Resources resources2 = gVar.f172986a;
                ThreadLocal<TypedValue> threadLocal2 = b7.g.f16255a;
                pVar2.f93156d = resources2.getColor(R.color.gray_black_static, null);
                pVar2.f93158f = 0.0f;
            } else {
                qVar = null;
            }
            ArrayList arrayList7 = new ArrayList();
            while (r10.hasNext()) {
                jG = ((com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj3).G();
                if (millis > jG) {
                }
            }
            arrayList = new ArrayList(arrayList7);
            listIterator = list4.listIterator(list4.size());
            do {
                if (listIterator.hasPrevious()) {
                    a0VarPrevious = null;
                    break;
                }
                a0VarPrevious = listIterator.previous();
            } while (a0VarPrevious.G() >= millis);
            a0Var = a0VarPrevious;
            it3 = list4.iterator();
            do {
                if (it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((com.garmin.android.apps.connectmobile.activities.newmodel.a0) next).G() <= millis2);
            a0Var2 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) next;
            if (z14) {
                if (arrayList.isEmpty()) {
                    arrayList.add(a0Var);
                }
                if (a0Var2 != null) {
                    arrayList.add(a0Var2);
                }
            }
            i15 = 0;
            while (r9.hasNext()) {
                i16 = i15 + 1;
                if (i15 >= 0) {
                    p13.x.q();
                    throw null;
                }
                a0Var3 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj4;
                LatLng latLngD2 = a0Var3.D();
                bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                pVar.f93153a.add(new com.garmin.android.library.mapsdkadapter.f(latLngD2, bVar));
                if (qVar != null) {
                    qVar.f50328a.f93153a.add(new com.garmin.android.library.mapsdkadapter.f(a0Var3.D(), bVar));
                }
                i15 = i16;
            }
            arrayList2 = aVar.f172067a;
            arrayList2.add(qVar3);
            if (qVar != null) {
                arrayList2.add(qVar);
            }
            if (list3 != null) {
                LatLng latLng4 = fVar3.f50283a;
                messageIndex = x1Var.getMessageIndex();
                if (messageIndex != null) {
                    iIntValue = messageIndex.intValue();
                } else {
                    iIntValue = 0;
                }
                x1Var.q3(Integer.valueOf(iIntValue + 1));
                x1Var.w3(Double.valueOf(latLng4.latitude));
                x1Var.y3(Double.valueOf(latLng4.longitude));
                if (!z18) {
                    xVarA2 = x1Var.a2();
                    if (zC2) {
                        bitmapH = cVar.h(xVarA2);
                    } else {
                        bitmapH = cVar.h(xVarA2);
                    }
                    if (bitmapH != null) {
                        com.garmin.android.library.mapsdkadapter.p pVar7 = new com.garmin.android.library.mapsdkadapter.p();
                        String strValueOf4 = String.valueOf(x1Var.getMessageIndex());
                        com.garmin.android.library.mapsdkadapter.o oVar4 = pVar7.f50327a;
                        oVar4.f50312d = strValueOf4;
                        pVar7.c(bitmapH);
                        pVar7.a(0.5f, 0.9f);
                        oVar4.f50311c = 5.0f;
                        pVar7.d(fVar3);
                        aVar.a(pVar7);
                    }
                }
                if (zC) {
                    Bitmap bitmapE3 = cVar.e(2131232000);
                    com.garmin.android.library.mapsdkadapter.p pVar8 = new com.garmin.android.library.mapsdkadapter.p();
                    String strValueOf5 = String.valueOf(x1Var.getMessageIndex());
                    com.garmin.android.library.mapsdkadapter.o oVar5 = pVar8.f50327a;
                    oVar5.f50312d = strValueOf5;
                    pVar8.c(bitmapE3);
                    pVar8.a(0.5f, 0.9f);
                    oVar5.f50311c = 2.0f;
                    pVar8.d(fVar3);
                    aVar.a(pVar8);
                } else {
                    Bitmap bitmapE4 = cVar.e(2131232000);
                    com.garmin.android.library.mapsdkadapter.p pVar9 = new com.garmin.android.library.mapsdkadapter.p();
                    String strValueOf6 = String.valueOf(x1Var.getMessageIndex());
                    com.garmin.android.library.mapsdkadapter.o oVar6 = pVar9.f50327a;
                    oVar6.f50312d = strValueOf6;
                    pVar9.c(bitmapE4);
                    pVar9.a(0.5f, 0.9f);
                    oVar6.f50311c = 2.0f;
                    pVar9.d(fVar3);
                    aVar.a(pVar9);
                }
            }
            if (list3 == null) {
            }
            list4 = list;
            zC = zC;
            z17 = z18;
            it5 = it;
            i17 = i14;
            dDoubleValue = d14;
            x0Var = x0Var;
        }
        return aVar;
    }

    public static final double c(double d14) {
        return (d14 * 3.141592653589793d) / 180.0d;
    }

    public static final void d(com.garmin.android.apps.connectmobile.activities.newmodel.a aVar, List<ps.x1> list) {
        com.garmin.android.apps.connectmobile.activities.newmodel.w wVarD;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> listC = (aVar == null || (wVarD = aVar.D()) == null) ? null : wVarD.C();
        List<ps.x1> listN0 = list != null ? p13.h0.N0(list, new b()) : null;
        if (listC == null || listC.isEmpty() || listN0 == null || listN0.isEmpty() || list == null || list.isEmpty()) {
            return;
        }
        for (ps.x1 x1Var : listN0) {
            DateTime startDateTime = x1Var.getStartDateTime();
            long millis = startDateTime != null ? startDateTime.getMillis() : 0L;
            DateTime endDateTime = x1Var.getEndDateTime();
            long millis2 = endDateTime != null ? endDateTime.getMillis() : 0L;
            if (millis2 < millis) {
                Double duration = x1Var.getDuration();
                millis2 = (((long) (duration != null ? duration.doubleValue() : 0.0d)) * 1000) + millis;
            }
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            for (Object obj : listC) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj;
                long jG = a0Var.G();
                if (millis <= jG && jG < millis2) {
                    arrayList.add(a0Var.D());
                }
                i14 = i15;
            }
            LatLng latLng = (LatLng) p13.h0.d0(arrayList);
            if (latLng != null) {
                x1Var.w3(Double.valueOf(latLng.latitude));
                x1Var.y3(Double.valueOf(latLng.longitude));
            }
            LatLng latLng2 = (LatLng) p13.h0.n0(arrayList);
            if (latLng2 != null) {
                x1Var.T2(Double.valueOf(latLng2.latitude));
                x1Var.Z2(Double.valueOf(latLng2.longitude));
            }
        }
    }
}
