package wm;

import am.x0;
import am.z0;
import android.content.Context;
import c53.a0;
import c53.c;
import c53.c0;
import c53.f;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import e23.l;
import ig2.d;
import im.b;
import im.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.g0;
import p13.h0;
import p13.j0;
import p13.w;
import p13.y;
import ps.u0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwm/a;", "Lim/b;", "", "chartType", "Lam/x0;", "activityType", "", "Lps/x1;", "typedSplitDTOs", "<init>", "(ILam/x0;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends b {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final /* synthetic */ int f186034c1 = 0;
    public final ArrayList X0;
    public final LinkedHashMap Y0;
    public final ArrayList Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final LinkedHashMap<l<x1, Boolean>, Integer> f186035a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final boolean f186036b1;

    /* JADX INFO: renamed from: wm.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3457a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            u0 difficulty = ((x1) t7).getDifficulty();
            Integer sortOrder = difficulty != null ? difficulty.getSortOrder() : null;
            u0 difficulty2 = ((x1) t14).getDifficulty();
            return r13.a.b(sortOrder, difficulty2 != null ? difficulty2.getSortOrder() : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public a(int i14, x0 x0Var, List<x1> list) {
        ArrayList arrayList;
        ?? arrayList2;
        super(i14);
        x0Var.getClass();
        this.X0 = new ArrayList();
        this.Y0 = new LinkedHashMap();
        this.Z0 = new ArrayList();
        z.f94209a.getClass();
        Integer numValueOf = Integer.valueOf(R.color.palette_green_16);
        Integer numValueOf2 = Integer.valueOf(R.color.palette_red_12);
        LinkedHashMap<l<x1, Boolean>, Integer> linkedHashMap = new LinkedHashMap<>();
        int i15 = z.a.f94210a[x0Var.ordinal()];
        if (i15 == 1) {
            linkedHashMap.put(new d(15), numValueOf2);
            linkedHashMap.put(new d(16), Integer.valueOf(R.color.palette_mango_23));
            linkedHashMap.put(new d(17), numValueOf);
        } else if (i15 == 2) {
            linkedHashMap.put(new d(18), numValueOf2);
            linkedHashMap.put(new d(19), numValueOf);
        }
        this.f186035a1 = linkedHashMap;
        String str = x0Var.f4358a;
        z0 z0Var = z0.f4390a;
        this.f186036b1 = z0.b(x0.f4356z2, str);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((x1) obj).getDifficulty() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        this.X0.clear();
        d0.x(this.X0, arrayList != null ? c0.p(new a0(new c(new g0(arrayList), new wl.a(4)), new C3457a()), new wl.a(5)) : f.f24532a);
        for (String str2 : this.X0) {
            LinkedHashMap linkedHashMap2 = this.Y0;
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    u0 difficulty = ((x1) obj2).getDifficulty();
                    if (s.g(difficulty != null ? difficulty.getValueKey() : null, str2)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = j0.f134944a;
            }
            linkedHashMap2.put(str2, arrayList2);
        }
    }

    public final List<BarDataSet> A(Context context) {
        ArrayList arrayList;
        boolean z14;
        a aVar = this;
        Float fValueOf = Float.valueOf(0.1f);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = aVar.Z0;
        arrayList3.clear();
        ArrayList<String> arrayList4 = aVar.X0;
        for (String str : arrayList4) {
            ArrayList arrayList5 = new ArrayList();
            float fIndexOf = arrayList4.indexOf(str);
            List<x1> list = (List) aVar.Y0.get(str);
            if (list == null) {
                list = j0.f134944a;
            }
            for (x1 x1Var : list) {
                int iIndexOf = list.indexOf(x1Var);
                LinkedHashMap<l<x1, Boolean>, Integer> linkedHashMap = aVar.f186035a1;
                Iterator<l<x1, Boolean>> it = linkedHashMap.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    arrayList = arrayList4;
                    z14 = aVar.f186036b1;
                    if (!zHasNext) {
                        break;
                    }
                    l<x1, Boolean> next = it.next();
                    next.getClass();
                    l<x1, Boolean> lVar = next;
                    Integer num = linkedHashMap.get(lVar);
                    if (lVar.invoke(x1Var).booleanValue() && num != null) {
                        if (z14 && iIndexOf >= 1) {
                            arrayList3.add(Integer.valueOf(R.color.palette_interface_18));
                        }
                        arrayList3.add(num);
                        break;
                    }
                    aVar = this;
                    arrayList4 = arrayList;
                }
                if (!z14) {
                    arrayList5.add(Float.valueOf(1.0f));
                } else if (iIndexOf == 0) {
                    arrayList5.add(Float.valueOf(list.size() != 1 ? 0.95f : 1.0f));
                } else if (iIndexOf == list.size() - 1) {
                    arrayList5.add(fValueOf);
                    arrayList5.add(Float.valueOf(0.95f));
                } else {
                    arrayList5.add(fValueOf);
                    arrayList5.add(Float.valueOf(0.9f));
                }
                aVar = this;
                arrayList4 = arrayList;
            }
            arrayList2.add(new BarEntry(fIndexOf, h0.Y0(arrayList5), str));
            aVar = this;
            arrayList4 = arrayList4;
        }
        BarDataSet barDataSet = new BarDataSet(arrayList2, "");
        barDataSet.setDrawValues(false);
        ArrayList arrayList6 = new ArrayList(y.r(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Integer.valueOf(a7.b.getColor(context, ((Number) it3.next()).intValue())));
        }
        barDataSet.setColors(arrayList6);
        return w.c(barDataSet);
    }

    public final ArrayList C() {
        Integer num;
        Iterator it = this.X0.iterator();
        if (it.hasNext()) {
            String str = (String) it.next();
            LinkedHashMap linkedHashMap = this.Y0;
            List list = (List) linkedHashMap.get(str);
            Integer numValueOf = Integer.valueOf(list != null ? list.size() : 0);
            while (it.hasNext()) {
                List list2 = (List) linkedHashMap.get((String) it.next());
                Integer numValueOf2 = Integer.valueOf(list2 != null ? list2.size() : 0);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        ArrayList arrayList = new ArrayList();
        int i14 = 1;
        int i15 = iIntValue + 1;
        if (1 <= i15) {
            while (true) {
                arrayList.add(String.valueOf(i14));
                if (i14 == i15) {
                    break;
                }
                i14++;
            }
        }
        return arrayList;
    }

    @Override // im.b, zm.p
    public final double getTotalDuration() {
        return 0.0d;
    }
}
