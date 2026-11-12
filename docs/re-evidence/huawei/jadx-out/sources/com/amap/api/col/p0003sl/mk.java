package com.amap.api.col.p0003sl;

import com.huawei.android.airsharing.api.IEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private no f3205b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<np> f3204a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<np> f3206c = new ArrayList<>();

    final List<np> a(no noVar, List<np> list, boolean z, long j, long j2) {
        if (!b(noVar, list, z, j, j2)) {
            return null;
        }
        b(this.f3206c, list);
        this.f3204a.clear();
        this.f3204a.addAll(list);
        this.f3205b = noVar;
        return this.f3206c;
    }

    private boolean b(no noVar, List<np> list, boolean z, long j, long j2) {
        if (!z || !a(noVar, j, j2) || list == null || list.size() <= 0) {
            return false;
        }
        if (this.f3205b == null) {
            return true;
        }
        boolean zA = a(noVar);
        return !zA ? !a(list, this.f3204a) : zA;
    }

    private static boolean a(no noVar, long j, long j2) {
        return j > 0 && j2 - j < ((long) ((noVar.g > 10.0f ? 1 : (noVar.g == 10.0f ? 0 : -1)) >= 0 ? 2000 : IEventListener.EVENT_ID_NOTICE_DIALOG_SHOW));
    }

    private boolean a(no noVar) {
        float f = 10.0f;
        if (noVar.g > 10.0f) {
            f = 200.0f;
        } else if (noVar.g > 2.0f) {
            f = 50.0f;
        }
        return noVar.a(this.f3205b) > ((double) f);
    }

    private static boolean a(List<np> list, List<np> list2) {
        if (list != null && list2 != null) {
            int size = list.size();
            int size2 = list2.size();
            if (size <= size2) {
                list2 = list;
                list = list2;
            }
            HashMap map = new HashMap(list.size());
            Iterator<np> it = list.iterator();
            while (it.hasNext()) {
                map.put(Long.valueOf(it.next().f3231a), 1);
            }
            Iterator<np> it2 = list2.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (((Integer) map.get(Long.valueOf(it2.next().f3231a))) != null) {
                    i++;
                }
            }
            if (((double) i) * 2.0d >= ((double) (size + size2)) * 0.5d) {
                return true;
            }
        }
        return false;
    }

    private void b(List<np> list, List<np> list2) {
        list.clear();
        if (list2 != null) {
            List<np> listB = b(a(list2));
            int size = listB.size();
            if (size > 40) {
                size = 40;
            }
            for (int i = 0; i < size; i++) {
                list.add(listB.get(i));
            }
        }
    }

    private static List<np> a(List<np> list) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            np npVar = list.get(i);
            map.put(Integer.valueOf(npVar.f3233c), npVar);
        }
        arrayList.addAll(map.values());
        return arrayList;
    }

    private List<np> b(List<np> list) {
        Collections.sort(list, new Comparator<np>() { // from class: com.amap.api.col.3sl.mk.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(np npVar, np npVar2) {
                return a(npVar, npVar2);
            }

            private static int a(np npVar, np npVar2) {
                return npVar2.f3233c - npVar.f3233c;
            }
        });
        return list;
    }
}
