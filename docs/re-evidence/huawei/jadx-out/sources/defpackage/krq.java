package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class krq extends krl {
    private Map<Integer, Double> mMap;

    public krq() {
        this(0, null, 0L, 0L);
    }

    public krq(int i, Map map, long j, long j2) {
        setType(i);
        this.mMap = map;
        setStartTime(j);
        setEndTime(j2);
    }

    public Map getMap() {
        return this.mMap;
    }
}
