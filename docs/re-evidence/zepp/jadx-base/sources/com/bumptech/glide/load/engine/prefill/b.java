package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class b {
    private final Map<PreFillType, Integer> a;
    private final List<PreFillType> b;
    private int c;
    private int d;

    public b(Map<PreFillType, Integer> map) {
        this.a = map;
        this.b = new ArrayList(map.keySet());
        Iterator<Integer> it2 = map.values().iterator();
        while (it2.hasNext()) {
            this.c += it2.next().intValue();
        }
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.c == 0;
    }

    public PreFillType c() {
        PreFillType preFillType = this.b.get(this.d);
        Integer num = this.a.get(preFillType);
        if (num.intValue() == 1) {
            this.a.remove(preFillType);
            this.b.remove(this.d);
        } else {
            this.a.put(preFillType, Integer.valueOf(num.intValue() - 1));
        }
        this.c--;
        this.d = this.b.isEmpty() ? 0 : (this.d + 1) % this.b.size();
        return preFillType;
    }
}
