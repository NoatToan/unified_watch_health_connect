package b71;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb71/c;", "Lwz/a;", "", "Le71/f;", "data", "<init>", "(Ljava/util/List;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends wz.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e71.f> f16314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f16315d = x.k(1, 2, 3, 5, 10, 20, 30, 40, 50, 100, 200, 300, 400, 500);

    public c(List<e71.f> list) {
        this.f16314c = list;
    }

    @Override // wz.a
    /* JADX INFO: renamed from: b */
    public final double getF175420d() {
        List<e71.f> list = this.f16314c;
        if (list == null) {
            return 0.0d;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (e71.f fVar : list) {
            List list2 = (List) linkedHashMap.get(fVar.f63298d.withTimeAtStartOfDay());
            if (list2 != null) {
                list2.add(fVar);
            } else {
                linkedHashMap.put(fVar.f63298d.withTimeAtStartOfDay(), x.m(fVar));
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        float f14 = 0.0f;
        while (it.hasNext()) {
            List list3 = (List) ((Map.Entry) it.next()).getValue();
            int size = list3.size();
            float[] fArr = new float[size];
            int i14 = 0;
            for (Object obj : list3) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                fArr[i14] = (float) ((e71.f) obj).f63297c;
                i14 = i15;
            }
            float f15 = 0.0f;
            for (int i16 = 0; i16 < size; i16++) {
                f15 += fArr[i16];
            }
            if (f15 > f14) {
                f14 = f15;
            }
        }
        return f14;
    }

    @Override // wz.a
    /* JADX INFO: renamed from: c */
    public final double getF175419c() {
        return 0.0d;
    }

    @Override // wz.a
    public final List<Integer> d() {
        return this.f16315d;
    }
}
