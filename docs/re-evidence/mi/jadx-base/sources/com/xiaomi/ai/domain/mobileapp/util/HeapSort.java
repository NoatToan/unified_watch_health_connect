package com.xiaomi.ai.domain.mobileapp.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HeapSort {
    private static void buildHeap(List<Map.Entry<Integer, Integer>> list) {
        for (int size = (list.size() / 2) - 1; size >= 0; size--) {
            heapAdjust(list, size);
        }
    }

    private static void heapAdjust(List<Map.Entry<Integer, Integer>> list, int i) {
        int i2 = i << 1;
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        if (i3 >= list.size() || list.get(i).getValue().intValue() <= list.get(i3).getValue().intValue()) {
            i3 = i;
        }
        if (i4 >= list.size() || list.get(i3).getValue().intValue() <= list.get(i4).getValue().intValue()) {
            i4 = i3;
        }
        if (i != i4) {
            swap(list, i, i4);
            heapAdjust(list, i4);
        }
    }

    public static void main(String[] strArr) {
        HashMap map = new HashMap();
        map.put(1, 2);
        map.put(2, 3);
        map.put(5, 1);
        map.put(6, 4);
        map.put(7, 5);
        map.put(8, 3);
        ArrayList arrayList = new ArrayList(map.entrySet());
        new HeapSort();
        for (Map.Entry<Integer, Integer> entry : topK(arrayList, 4)) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

    private static void swap(List<Map.Entry<Integer, Integer>> list, int i, int i2) {
        Map.Entry<Integer, Integer> entry = list.get(i);
        list.set(i, list.get(i2));
        list.set(i2, entry);
    }

    public static List<Map.Entry<Integer, Integer>> topK(List<Map.Entry<Integer, Integer>> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            while (i2 < list.size() && i2 < i) {
                arrayList.add(list.get(i2));
                i2++;
            }
            buildHeap(arrayList);
            while (i2 < list.size()) {
                if (((Integer) ((Map.Entry) arrayList.get(0)).getValue()).intValue() < list.get(i2).getValue().intValue()) {
                    arrayList.set(0, list.get(i2));
                }
                heapAdjust(arrayList, 0);
                i2++;
            }
        }
        return arrayList;
    }
}
