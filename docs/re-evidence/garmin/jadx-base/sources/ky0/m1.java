package ky0;

import am.i2;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel$loadMultiDayActivityDetails$9", f = "MultiDayActivitiesDetailViewModel.kt", l = {471, 479}, m = "invokeSuspend", v = 2)
public final class m1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(w0 w0Var, t13.d<? super m1> dVar) {
        super(2, dVar);
        this.f107423b = w0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m1(this.f107423b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
    
        if (r0 == r6) goto L32;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        Object value;
        sy0.d dVar;
        Object value2;
        ArrayList<iy0.i> arrayList;
        ArrayList arrayList2;
        iy0.h hVar;
        iy0.h hVar2;
        iy0.h hVar3;
        int i14;
        int color;
        am.x0 x0Var;
        long jLongValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f107422a;
        w0 w0Var = this.f107423b;
        if (i15 == 0) {
            o13.r.b(obj);
            gy0.x0 x0Var2 = (gy0.x0) w0Var.f107622x.getValue();
            String str = w0Var.f107579b;
            String str2 = ((sy0.t) w0Var.f107605n1.f150540a.getValue()).f161283b;
            d2.f107276a.getClass();
            List<ls.e> listK = p13.x.k(ls.e.TOTAL_DISTANCE, ls.e.TOTAL_TIME, ls.e.TOTAL_ASCENT);
            ArrayList arrayList3 = new ArrayList(p13.y.r(listK, 10));
            for (ls.e eVar : listK) {
                d2.f107276a.getClass();
                arrayList3.add(d2.a(eVar));
            }
            this.f107422a = 1;
            objA = x0Var2.a(str, arrayList3, str2, false, this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
            objA = obj;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objA2 = obj;
        }
        List<am.w0> list = (List) objA2;
        if (list != null) {
            p2 p2Var = w0Var.f107614s1;
            do {
                value2 = p2Var.getValue();
                Context context = w0Var.f107577a;
                arrayList = new ArrayList();
                for (am.w0 w0Var2 : list) {
                    Iterator<T> it = w0Var2.f().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        am.x0 x0VarL = am.z0.l(am.x0.f4346x, (String) entry.getKey());
                        b63.o oVarD = ay0.b.d(w0Var2.getDate());
                        if (oVarD == null) {
                            oVarD = g22.l.d(b63.o.INSTANCE);
                        }
                        Map map = (Map) entry.getValue();
                        d2 d2Var = d2.f107276a;
                        ls.e eVar2 = ls.e.TOTAL_TIME;
                        d2Var.getClass();
                        i2 i2Var = (i2) map.get(d2.a(eVar2));
                        if (i2Var != null) {
                            Object objC = d2.c(eVar2, i2Var);
                            Double d14 = objC instanceof Double ? (Double) objC : null;
                            Long lValueOf = d14 != null ? Long.valueOf((long) d14.doubleValue()) : null;
                            if (lValueOf != null) {
                                jLongValue = lValueOf.longValue();
                            } else {
                                jLongValue = 0;
                            }
                        } else {
                            jLongValue = 0;
                        }
                        arrayList.add(new iy0.i(x0VarL, oVarD, jLongValue));
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    am.x0 x0Var3 = ((iy0.i) obj2).f95803a;
                    Object arrayList4 = linkedHashMap.get(x0Var3);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(x0Var3, arrayList4);
                    }
                    ((List) arrayList4).add(obj2);
                }
                boolean z14 = linkedHashMap.keySet().size() > 4;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : arrayList) {
                    am.x0 x0Var4 = ((iy0.i) obj3).f95803a;
                    Object arrayList5 = linkedHashMap2.get(x0Var4);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap2.put(x0Var4, arrayList5);
                    }
                    ((List) arrayList5).add(obj3);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(p13.t0.a(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    Object key = entry2.getKey();
                    Iterator it3 = ((List) entry2.getValue()).iterator();
                    long j8 = 0;
                    while (it3.hasNext()) {
                        j8 += ((iy0.i) it3.next()).f95805c;
                    }
                    linkedHashMap3.put(key, Long.valueOf(j8));
                }
                List listN0 = p13.h0.N0(linkedHashMap3.entrySet(), new x0());
                arrayList2 = new ArrayList(p13.y.r(listN0, 10));
                Iterator it4 = listN0.iterator();
                while (it4.hasNext()) {
                    arrayList2.add((am.x0) ((Map.Entry) it4.next()).getKey());
                }
                if (z14) {
                    List listS0 = p13.h0.S0(arrayList2, 3);
                    ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList, 10));
                    for (iy0.i iVar : arrayList) {
                        if (!listS0.contains(iVar.f95803a)) {
                            am.x0 x0Var5 = am.x0.F;
                            b63.o oVar = iVar.f95804b;
                            long j14 = iVar.f95805c;
                            x0Var5.getClass();
                            iVar = new iy0.i(x0Var5, oVar, j14);
                        }
                        arrayList6.add(iVar);
                    }
                    arrayList = arrayList6;
                }
                hVar = new iy0.h(a7.b.getColor(context, R.color.gds_data_viz_teal_primary), (am.x0) p13.h0.e0(0, arrayList2), R.color.gds_data_viz_teal_primary);
                hVar2 = new iy0.h(a7.b.getColor(context, R.color.gds_data_viz_yellow_primary), (am.x0) p13.h0.e0(1, arrayList2), R.color.gds_data_viz_yellow_primary);
                hVar3 = new iy0.h(a7.b.getColor(context, R.color.gds_data_viz_violet_primary), (am.x0) p13.h0.e0(2, arrayList2), R.color.gds_data_viz_violet_primary);
                i14 = R.color.gds_data_viz_neutral_secondary;
                color = a7.b.getColor(context, z14 ? R.color.gds_data_viz_neutral_secondary : R.color.gds_data_viz_purple_primary);
                x0Var = z14 ? am.x0.F : (am.x0) p13.h0.e0(3, arrayList2);
                if (!z14) {
                    i14 = R.color.gds_data_viz_purple_primary;
                }
            } while (!p2Var.b(value2, new iy0.f(i53.a.e(arrayList), i53.a.e(arrayList2), i53.a.e(p13.x.k(hVar, hVar2, hVar3, new iy0.h(color, x0Var, i14))), w0Var.z4(), w0Var.y4())));
        }
        return Unit.INSTANCE;
        List list2 = (List) objA;
        if (list2 != null) {
            p2 p2Var2 = w0Var.S0;
            do {
                value = p2Var2.getValue();
                am.w0 w0Var3 = (am.w0) p13.h0.d0(list2);
                if (w0Var3 != null) {
                    int countOfActivities = w0Var3.getCountOfActivities();
                    Map<String, i2> map2 = w0Var3.f().get(TtmlNode.COMBINE_ALL);
                    dVar = new sy0.d(countOfActivities, map2 != null ? i53.a.g(map2) : i53.a.c());
                } else {
                    dVar = null;
                }
            } while (!p2Var2.b(value, dVar));
        }
        gy0.t0 t0Var = (gy0.t0) w0Var.f107624y.getValue();
        String str3 = w0Var.f107579b;
        String str4 = ((sy0.t) w0Var.f107605n1.f150540a.getValue()).f161283b;
        this.f107422a = 2;
        objA2 = t0Var.a(str3, str4, true, this);
    }
}
