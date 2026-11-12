package com.google.android.datatransport.runtime.util;

import am.j;
import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import com.google.firebase.messaging.l;
import java.util.HashMap;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class PriorityMapping {
    private static HashMap<Priority, Integer> PRIORITY_INT_MAP;
    private static SparseArray<Priority> PRIORITY_MAP = new SparseArray<>();

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        PRIORITY_INT_MAP = map;
        map.put(Priority.DEFAULT, 0);
        PRIORITY_INT_MAP.put(Priority.VERY_LOW, 1);
        PRIORITY_INT_MAP.put(Priority.HIGHEST, 2);
        for (Priority priority : PRIORITY_INT_MAP.keySet()) {
            PRIORITY_MAP.append(PRIORITY_INT_MAP.get(priority).intValue(), priority);
        }
    }

    public static int toInt(Priority priority) {
        Integer num = PRIORITY_INT_MAP.get(priority);
        if (num != null) {
            return num.intValue();
        }
        l.n(priority, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static Priority valueOf(int i14) {
        Priority priority = PRIORITY_MAP.get(i14);
        if (priority != null) {
            return priority;
        }
        h.s(j.h(i14, "Unknown Priority for value "));
        return null;
    }
}
