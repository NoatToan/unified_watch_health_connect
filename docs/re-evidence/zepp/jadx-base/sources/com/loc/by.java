package com.loc;

import com.huami.watch.dataflow.chart.util.AnimUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class by {
    private db b;
    private List<dc> a = new ArrayList();
    private ArrayList<dc> c = new ArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    private void a(List<dc> list, List<dc> list2) {
        list.clear();
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            for (int i = 0; i < list2.size(); i++) {
                dc dcVar = list2.get(i);
                map.put(Integer.valueOf(dcVar.c), dcVar);
            }
            arrayList.addAll(map.values());
            Collections.sort(arrayList, new Comparator<dc>() { // from class: com.loc.by.1
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(dc dcVar2, dc dcVar3) {
                    return dcVar3.c - dcVar2.c;
                }
            });
            int size = arrayList.size();
            if (size > 40) {
                size = 40;
            }
            for (int i2 = 0; i2 < size; i2++) {
                list.add(arrayList.get(i2));
            }
        }
    }

    public final List<dc> a(db dbVar, List<dc> list, boolean z, long j, long j2) {
        List<dc> list2;
        boolean z2 = false;
        if (z) {
            int i = AnimUtil.DURATION_LOADING;
            float f = 10.0f;
            if (dbVar.g >= 10.0f) {
                i = 2000;
            }
            if ((j > 0 && j2 - j < ((long) i)) && list != null && list.size() > 0) {
                db dbVar2 = this.b;
                if (dbVar2 != null) {
                    float f2 = dbVar.g;
                    if (f2 > 10.0f) {
                        f = 200.0f;
                    } else if (f2 > 2.0f) {
                        f = 50.0f;
                    }
                    boolean z3 = dbVar.a(dbVar2) > ((double) f);
                    if (z3) {
                        z2 = z3;
                    } else {
                        List<dc> list3 = this.a;
                        if (list3 != null) {
                            int size = list.size();
                            int size2 = list3.size();
                            int i2 = size + size2;
                            if (size > size2) {
                                list2 = list3;
                                list3 = list;
                            } else {
                                list2 = list;
                            }
                            HashMap map = new HashMap(list3.size());
                            Iterator<dc> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                map.put(Long.valueOf(it2.next().a), 1);
                            }
                            Iterator<dc> it3 = list2.iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                if (((Integer) map.get(Long.valueOf(it3.next().a))) != null) {
                                    i3++;
                                }
                            }
                            if (((double) i3) * 2.0d >= ((double) i2) * 0.5d) {
                                z2 = true;
                            }
                        }
                        z2 = !z2;
                    }
                } else {
                    z2 = true;
                }
            }
        }
        if (!z2) {
            return null;
        }
        a(this.c, list);
        this.a.clear();
        this.a.addAll(list);
        this.b = dbVar;
        return this.c;
    }
}
