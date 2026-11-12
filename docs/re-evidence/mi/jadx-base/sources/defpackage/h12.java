package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class h12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Integer, Integer> f19562a = new HashMap();

    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry<Integer, Integer> entry : this.f19562a.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return vfh.b(arrayList);
    }

    public void b(int i) {
        Integer num = this.f19562a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f19562a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
