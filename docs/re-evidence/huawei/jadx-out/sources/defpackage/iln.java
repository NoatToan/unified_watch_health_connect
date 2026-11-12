package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class iln {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, Integer> f37782c;
    private Map<Long, double[]> e;

    public iln() {
    }

    public iln(Map<Long, double[]> map, Map<Integer, Integer> map2) {
        this.e = map;
        this.f37782c = map2;
    }

    public Map<Long, double[]> d() {
        return this.e;
    }

    public Map<Integer, Integer> a() {
        return this.f37782c;
    }
}
